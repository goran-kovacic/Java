# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\AMD\Documents\GitHub\ER-diagram-zadaci\zadatak_006.sql

drop database if exists zadatak_006;
create database zadatak_006;
use zadatak_006;

create table nadredjeni(
	sifra int not null primary key auto_increment,
	osoba int
);

create table svecenik(
	sifra int not null primary key auto_increment,
	nadredjeni int,
	osoba int
);

create table svecenik_posao(
	svecenik int,
	posao int
);

create table posao(
	sifra int not null primary key auto_increment,
	naziv varchar(50)
);

create table osoba(
	sifra int not null primary key auto_increment,
	ime varchar(50),
	prezime varchar(50)
);

alter table nadredjeni add foreign key (osoba) references osoba(sifra);

alter table svecenik add foreign key (osoba) references osoba(sifra);

alter table svecenik add foreign key (nadredjeni) references nadredjeni(sifra);

alter table svecenik_posao add foreign key (svecenik) references svecenik(sifra);

alter table svecenik_posao add foreign key (posao) references posao(sifra);
