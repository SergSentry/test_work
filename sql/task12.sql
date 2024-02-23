CREATE TABLE animals AS 
SELECT name,view,birthdate,commands FROM cats
UNION
SELECT name,view,birthdate,commands FROM dogs
UNION
SELECT name,view,birthdate,commands FROM hamsters
UNION
SELECT name,view,birthdate,commands FROM horses
UNION
SELECT name,view,birthdate,commands FROM donkeys;


ALTER TABLE animals
ADD id INT AUTO_INCREMENT PRIMARY KEY;


ALTER TABLE animals MODIFY COLUMN id INT FIRST;


SELECT * FROM animals;


