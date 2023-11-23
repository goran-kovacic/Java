# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\AMD\Documents\GitHub\ER-diagram-zadaci\zadatak_004.sql

drop database if exists zadatak_004;
create database zadatak_004;
use zadatak_004;

create table skupina(
	sifra int not null primary key auto_increment,
	naziv varchar(50),
	brojpolaznika int,
	odgajateljica int
);

create table odgajateljica(
	sifra int not null primary key auto_increment,
	iban varchar(50),
	osoba int,
	sprema int
);

create table polaznik(
	sifra int not null primary key auto_increment,
	osoba int,
	skupina int
);

create table osoba(
	sifra int not null primary key auto_increment,
	ime varchar(50),
	prezime varchar(50),
	oib varchar(50),
	email varchar(50),
	telefon int
);

create table strucna_sprema(
	sifra int not null primary key auto_increment,
	naziv_spreme varchar(50)
);

alter table skupina add foreign key (odgajateljica) references odgajateljica(sifra);

alter table odgajateljica add foreign key (sprema) references strucna_sprema(sifra);

alter table odgajateljica add foreign key (osoba) references osoba(sifra);

alter table polaznik add foreign key (skupina) references skupina(sifra);

alter table polaznik add foreign key (osoba) references osoba(sifra);
