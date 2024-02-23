CREATE TABLE young_animals AS SELECT *,
truncate((datediff(now(),animals.birthdate) / 365.25),0) as age,
truncate((datediff(now(),animals.birthdate) /30.4375 % 12),0) as months
FROM animals
HAVING age >= 1 and age <= 3;


ALTER TABLE young_animals DROP COLUMN id;


ALTER TABLE young_animals
ADD id INT AUTO_INCREMENT PRIMARY KEY;


ALTER TABLE young_animals MODIFY COLUMN id INT FIRST;


SELECT * FROM young_animals;


