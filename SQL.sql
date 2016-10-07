# First Day exercises

CREATE TABLE bootcamp.Courses
(
course_id int NOT NULL,
name varchar(45)  NOT NULL,
lecturer_name varchar(45) NOT NULL,
assistant_name varchar(45) NOT NULL,
duration int NOT NULL,
starting_date DATE NOT NULL
PRIMARY KEY (course_id)
);

SELECT * FROM students;

INSERT INTO students (StID, Fname, Lname, DateOfBirth) VALUES (1, "George", "Georgiou", '1987-01-01');
INSERT INTO students (StID, Fname, Lname, DateOfBirth) VALUES (2, "John", "Jones", '1989-02-02');
INSERT INTO students (StID, Fname, Lname, DateOfBirth) VALUES (3, "Clark", "Kent",' 1993-03-03');

SELECT DISTINCT * FROM students;

INSERT INTO Courses (course_id, `name`, lecturer_name, assistant_name, duration, starting_date) 
VALUES (1, "SQL", "AG", "BN", 2, '2016-10-21');

INSERT INTO Courses (course_id, `name`, lecturer_name, assistant_name, duration, starting_date) 
VALUES (2, "JAVA", "VS", "BN", 3, '2016-10-25');

INSERT INTO Courses (course_id, `name`, lecturer_name, assistant_name, duration, starting_date) 
VALUES (3, "R", "KP", "TT", 4, '2016-11-09');

INSERT INTO Courses (course_id, `name`, lecturer_name, assistant_name, duration, starting_date) 
VALUES (4, "PYTHON", "KK", "DD", 5, '2016-11-09');

SELECT COUNT(*) FROM students;

SELECT * FROM Courses WHERE duration > 3;

SELECT * FROM students WHERE DateOfBirth < '1999-10-06';

SELECT EXTRACT(MONTH FROM starting_date) AS SQL_MONTH FROM Courses WHERE `name` = "SQL";

SELECT * FROM Courses WHERE duration > 2 AND EXTRACT(MONTH FROM starting_date) = 11;

SELECT COUNT(duration) As TeachDays FROM Courses GROUP BY lecturer_name HAVING TeachDays > 2;

#Second day exercises

#N:N cardinality between students and courses.
#The table joining students and courses is Students_Courses. Note that this talbe also contains grades for each student-course relationship

SELECT DISTINCT S.* FROM Students S INNER JOIN Students_Courses SC ON S.StID = SC.StID INNER JOIN Courses C ON SC.CID = C.CID;

SELECT S.StID, S.Fname, S.Lname, SC.Grade FROM Students S INNER JOIN Students_Courses SC ON S.StID = SC.StID;

SELECT S.StID, S.Fname, S.Lname, AVG(SC.Grade) AS AVG_GRADE FROM Students S INNER JOIN Students_Courses SC ON S.StID = SC.StID GROUP BY S.StID;

SELECT S.Fname, S.Lname FROM Students S INNER JOIN (SELECT StID, AVG(SC.Grade) AS AVG_GRADE FROM Students_Courses GROUP BY StID HAVING AVG_GRADE > 5) SC_AVG ON S.StID = SC_AVG.StID;

SELECT AVG(SC.Grade) AS AVG_COURSE FROM Students_Courses SC GROUP BY SC.CID;

SELECT S.* FROM Students S INNER JOIN Students_Courses SC ON S.StID = SC.StID INNER JOIN Courses C ON SC.CID = C.CID WHERE C.`Name` = "SQL";

SELECT MAX_SELECT.MAXIMUM_GRADE, STUDENTS_SELECT.First_Name, STUDENTS_SELECT.Last_Name
FROM
(SELECT CID, MAX(Grade) AS MAXIMUM_GRADE FROM Students_Courses) MAX_SELECT
FULL JOIN ON MAX_SELECT.CID = STUDENTS_SELECT.Course_ID
(SELECT S.Fname AS First_Name, S.Lname AS Last_Name, C.CID AS Course_ID FROM Students S INNER JOIN Students_Courses SC ON S.StID = SC.StID INNER JOIN Courses C ON SC.CID = C.CID WHERE SC.Grade > 5 AND C.`Name` = "SQL") STUDENTS_SELECT;