INSERT INTO bootcamp.students (`students id`, `first name`, `last name`, `date of birth`) 
VALUES (1, "Dimitris", "Theodoropoulos", '1989-9-18'),
       (2, "Maria", "Papadopoulou", '1992-6-4');

INSERT INTO bootcamp.students (`students id`, `first name`, `last name`, `date of birth`)
VALUES (3,"asdfg", "qwerty", '1978-12-12');

SELECT DISTINCT bootcamp.courses.`name of the assisstant` FROM bootcamp.courses;

DELETE FROM bootcamp.students WHERE `students id`=3;

SELECT * FROM bootcamp.students;