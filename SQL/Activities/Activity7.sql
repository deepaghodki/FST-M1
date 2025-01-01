--Activity 7
--Write an SQL statement to find the total purchase amount of all orders.
SELECT SUM(purchase_amount) AS TOTAL_PURCHASE_AMOUNT from orders;

--Write an SQL statement to find the average purchase amount of all orders.
SELECT AVG(purchase_amount) AS AVERAGE_PURCHASE_AMOUNT from orders;

--Write an SQL statement to get the maximum purchase amount of all the orders.
SELECT MAX(purchase_amount) AS MAXIMUM_PURCHASE_AMOUNT from orders;

--Write an SQL statement to get the minimum purchase amount of all the orders.
SELECT MIN(purchase_amount) AS MINIMUM_PURCHASE_AMOUNT from orders;

--Write an SQL statement to find the number of salesmen listed in the table.
SELECT COUNT( DISTINCT salesman_id) AS TOTAL_NUMBER_OF_SALESMAN from orders;