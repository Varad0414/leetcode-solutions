select EmployeeUNI.unique_id as unique_id, Employees.name as name 
from EmployeeUNI 
right join Employees using(id);
# SELECT eu.unique_id AS unique_id, e.name
# FROM Employees e
# LEFT JOIN EmployeeUNI eu USING(id)