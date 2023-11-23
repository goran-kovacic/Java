# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\AMD\Documents\GitHub\ER-diagram-zadaci\kolokvij_vjezbe\vjezba02.sql

drop database if exists vjezba02;
create database vjezba02;
use vjezba02;

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno bit not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstrovertno bit not null,
    prviputa datetime,
    svekar int not null,
    foreign key (svekar) references svekar(sifra)
);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(15,9),
    lipa decimal(15,8) not null,
    indiferentno bit not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(34),
    asocijalno bit not null
);
create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(33) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno bit,
    majica varchar(40) not null,
    decko int,
    foreign key (decko) references decko(sifra)
);
create table neprijatelj (
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,8),
    modelnaocala varchar(49) not null,
    kuna decimal (12,6) not null,
    jmbag char(11),
    cura int,
    foreign key (cura) references cura(sifra)
);

create table brat (
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno bit not null,
    neprijatelj int not null,
    foreign key (neprijatelj) references neprijatelj(sifra)
);

insert into neprijatelj (haljina, modelnaocala, kuna) values
('haljina1', 'naocale1', 12.46),
('haljina2', 'naocale2', 13.46),
('haljina3', 'naocale3', 15.46);

insert into table cura (haljina, drugiputa, majica) values
('haljina1', 2022-08-20 12:34:00, 'majica1'),
('haljina2', 2022-08-20 12:34:00, 'majica2'),
('haljina3', 2022-08-20 12:34:00, 'majica3');

insert into zarucnica (bojakose,lipa, indiferentno) values
('boja1', 353.12, 1),
('boja2', 353.12, 1),
('boja3', 353.12, 1);

insert into decko (asocijalno) values
(1),
(0),
(1);

insert into decko_zarucnica (decko,zarucnica) values
(1,1),
(2,1),
(3,3);

insert into prijatelj (treciputa,ekstrovertno,svekar) values
(2022-12-12, 1, 15),
(2022-12-12, 0, 15);

update prijatelj set treciputa = 2020-04-30;

delete from brat where ogrlica != 14;

select  suknja from cura where drugiputa is null;

select a.novcica, f.neprijatelj, e.haljina
from zarucnica a 
inner join decko_zarucnica b    on a.sifra = b.zarucnica
inner join decko c              on b.decko = c.sifra
inner join cura d               on c.sifra = d.decko
inner join neprijatelj e        on d.sifra = e.cura
inner join brat f               on d.sifra = f.neprijatelj
where d.drugiputa is not null and c.vesta like '%ba%'
group by e.haljina desc;

select a.vesta, a.asocijalno
from decko a
left join decko_zarucnica b on a.sifra=b.decko
where a.sifra not in (select decko from decko_zarucnica);
