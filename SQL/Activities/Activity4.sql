//Activity4

//Add a new column - grade - to the salesman table. The grade will be integer values
ALTER TABLE salesman ADD grade int;

SELECT * from salesman;

//Set the value in the grade column for everyone to 100.

UPDATE salesman SET grade = 100;
SELECT * from salesman;