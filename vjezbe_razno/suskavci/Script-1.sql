drop function if exists email;

delimiter $$
create function email(ime varchar(50), prezime varchar(50))
returns varchar(255)
begin
	
	return concat(left(lower(replace(replace(replace(replace(replace(replace(upper(ime),' ',''),'Č','C'),'Š','S'),'Đ','D'),'Ć','C'),'Ž','Z')),1),
	'.',
	lower(	replace(replace(replace(replace(replace(replace(upper(prezime),' ',''),'Č','C'),'Š','S'),'Đ','D'),'Ć','C'),'Ž','Z')), '@edunova.hr');
end;
$$
delimiter ;



insert into osoba (ime, prezime)
values ('Žarko', 'Žarkovski');

select email(ime,prezime) as email from osoba;

select * from osoba;

