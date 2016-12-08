/* EXERCISES AT VIEWS*/



/*Exercise 1*/

CREATE VIEW exercise_1 AS
    SELECT 
        actor.actor_id, actor.first_name
    FROM
        actor;
        
        
SELECT 
    *
FROM
    exercise_1;
    
/*Exercise 2*/

CREATE OR REPLACE VIEW exercise_1 AS
    SELECT 
        actor.actor_id, actor.first_name, last_name
    FROM
        actor;


/*Exercise 3*/

CREATE VIEW yearly_customers_rental AS
    SELECT 
        customer_id, COUNT(rental_id)
    FROM
        rental
    GROUP BY customer_id;

CREATE VIEW monthly_customer_rental AS
    SELECT 
        customer_id, MONTH(rental_date) AS M, COUNT(rental_id)
    FROM
        rental
    GROUP BY customer_id , M;

SELECT 
    yearly_customers_rental.customer_id,
    monthly_customer_rental.M,
    monthly_customer_rental.`COUNT(rental_id)` / yearly_customers_rental.`COUNT(rental_id)`
FROM
    yearly_customers_rental
        INNER JOIN
    monthly_customer_rental ON yearly_customers_rental.customer_id = monthly_customer_rental.customer_id;
    
    
/*Exercise 4*/

CREATE VIEW YP AS
    SELECT 
        customer_id, SUM(amount)
    FROM
        payment
    GROUP BY customer_id;

CREATE VIEW MP AS
    SELECT 
        customer_id, MONTH(payment_date) AS M, SUM(amount)
    FROM
        payment
    GROUP BY customer_id , M;

SELECT 
    YP.customer_id, MP.M, MP.`SUM(amount)` / YP.`SUM(amount)`
FROM
    YP
        INNER JOIN
    MP ON YP.customer_id = MP.customer_id;
    
/*Exercise 5*/

CREATE OR REPLACE VIEW LAST_VIEW AS
    SELECT 
        YP.customer_id,
        MP.M,
        MP.`SUM(amount)` / YP.`SUM(amount)` AS percent
    FROM
        YP
            INNER JOIN
        MP ON YP.customer_id = MP.customer_id;



SELECT 
    customer.first_name,
    customer.last_name,
    last_view.M,
    last_view.percent
FROM
    customer
        INNER JOIN
    last_view ON customer.customer_id = last_view.customer_id;
