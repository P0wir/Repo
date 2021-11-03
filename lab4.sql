ALTER TABLE postac MODIFY wiek int unsigned CHECK(wiek < 1000);

ALTER TABLE postac modfy rodzaj...;

CREATE TABLE marynarz LIKE postac;

CREATE TABLE marynarz SELECT * FROM postac;

CREATE TABLE nazwy_postaci
SELECT id_postaci, nazwa FROM postac
WHERE nazwa='wiking';

b) DELETE FROM postac WHERE ...;

c) DELETE FROM statek;
d) DROP TABLE statek;
e) CREATE TABLE zwierz(...);
f) INSERT INTO zwierz SELECT id_postaci, nazwa, wiek FROM postac;

ALTER TABLE postac add pesel char(11) first;

ALTER TABLE postac drop primary key;

ALTER TABLE postac MODIFY id_postaci int;

show create table;

ALTER TABLE postac add primary key(pesel);

ALTER TABLE postac modify pesel char(11) not null;
UPDATE postac set pesel = 1234567892+id_postaci;

select * from postac;