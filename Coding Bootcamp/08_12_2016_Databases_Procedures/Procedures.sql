/*Procedure Exercises*/

/*Exercise 1*/

DELIMITER $
CREATE PROCEDURE ex1()
BEGIN
SELECT first_name, last_name FROM sakila.actor;
END$

CALL ex1() ;


/*Exercise 2*/

DELIMITER $
CREATE PROCEDURE ex2()
BEGIN
SELECT * FROM sakila.actor where actor_id = 58;
END$

CALL ex2()

/*Exercise 3*/

DELIMITER $
CREATE PROCEDURE ex3(IN amt decimal, IN dt datetime)
BEGIN
SELECT * FROM sakila.payment
WHERE amount > amt AND payment_date > dt;
END$
DELIMITER ;

set @testAmount = 0;
set @testDate = '2005-06-15 18:02:53';

CALL ex3(@testAmount, @testDate);

/*Exercise 4*/

DELIMITER $
CREATE PROCEDURE ex4(IN amt decimal, IN dt datetime)
BEGIN
SELECT count(distinct payment.payment_date) FROM sakila.payment
WHERE amount > amt AND payment_date > dt;
END$
DELIMITER ;

set @testAmount4 = 1;
set @testDate4 = '2004-05-25 11:30:37';

CALL ex4(@testAmount4, @testDate4);















