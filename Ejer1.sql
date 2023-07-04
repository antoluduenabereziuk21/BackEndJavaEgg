/*1.
Abrir el script llamado “personal” y ejecutarlo de modo tal que se cree la base de datos
“personal”, se creen las tablas y se inserten todos los datos en las tablas para que quede de la
siguiente manera:

a) A continuación, realizar las siguientes consultas sobre la base de datos personal:
*/
-- 1.Obtener los datos completos de los empleados.

SELECT *
 FROM departamentos;

-- 2. Obtener los datos completos de los departamentos.

SELECT *
 FROM empleados;

-- 3. Listar el nombre de los departamentos.

SELECT nombre_depto 
FROM departamentos;

-- 4. Obtener el nombre y salario de todos los empleados.

SELECT nombre,sal_emp
 FROM empleados;

-- 5. Listar todas las comisiones.

SELECT nombre,comision_emp
 FROM empleados;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.

SELECT nombre
 FROM empleados
 WHERE cargo_emp='Secretaria';

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.

SELECT nombre
 FROM empleados
 WHERE cargo_emp='vendedor'
 ORDER BY nombre asc;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.

SELECT nombre,cargo_emp,sal_emp
 FROM empleados
 ORDER BY sal_emp asc;

-- 9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”

SELECT nombre_jefe_depto
 FROM departamentos
 WHERE ciudad = 'Ciudad Real';

-- 10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.

SELECT nombre AS NOMBRE ,cargo_emp AS CARGO
 FROM empleados;

-- 11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.

SELECT nombre,cargo_emp,sal_emp
 FROM empleados
 WHERE id_depto= 2000
 ORDER BY sal_emp asc;
 
-- 12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, 
-- más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético.

SELECT nombre,SUM(sal_emp + comision_emp + 500)AS TotalPago
 FROM empleados
 WHERE id_depto= 3000
 GROUP BY nombre
 ORDER BY nombre asc;

-- 13. Muestra los empleados cuyo nombre empiece con la letra J.

SELECT nombre
 FROM empleados WHERE nombre LIKE 'j%';
 
-- 14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
-- empleados que tienen comisión superior a 1000.

SELECT sal_emp,comision_emp,SUM(sal_emp + comision_emp + 500)AS TotalPago , nombre 
 FROM empleados
 WHERE comision_emp > 1000
 GROUP BY sal_emp,comision_emp,nombre;

-- 15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
-- comisión.
SELECT sal_emp,comision_emp,SUM(sal_emp + comision_emp + 500)AS TotalPago , nombre 
 FROM empleados
 WHERE comision_emp = 0
 GROUP BY sal_emp,comision_emp,nombre;

-- 16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.

SELECT nombre,sal_emp,comision_emp
 FROM empleados
 WHERE comision_emp > sal_emp;

-- 17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
	
    SELECT nombre,sal_emp,comision_emp
	FROM empleados
	WHERE (sal_emp * 0.3 ) >= comision_emp ;
    
    
-- 18. Hallar los empleados cuyo nombre no contiene la cadena “MA”

	SELECT nombre
	FROM empleados WHERE nombre NOT LIKE '%ma%';

-- 19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
-- ‘Mantenimiento.
	
	SELECT nombre_depto
    FROM departamentos
    WHERE nombre_depto = 'Ventas' OR nombre_depto = 'INVESTIGACION' OR nombre_depto = 'MANTENIMIENTO';
    
-- 20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
-- “Investigación” ni ‘Mantenimiento.
	SELECT nombre_depto
    FROM departamentos
   /* WHERE NOT nombre_depto = 'Ventas' AND NOT nombre_depto = 'INVESTIGACION' AND NOT  nombre_depto = 'MANTENIMIENTO';*/
    WHERE nombre_depto NOT IN('Ventas','INVESTIGACION','MANTENIMIENTO');

-- 21. Mostrar el salario más alto de la empresa.
	
    SELECT nombre,sal_emp
	FROM empleados
    ORDER BY sal_emp desc 
    LIMIT 2;
    
    
-- 22. Mostrar el nombre del último empleado de la lista por orden alfabético.
	
    SELECT nombre
	FROM empleados
    ORDER BY nombre desc 
    LIMIT 5;

-- 23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.

	SELECT max(sal_emp) AS 'Maximo',
    min(sal_emp) AS 'Minimo',
	(max(sal_emp) - min(sal_emp) )AS 'Diferencia'
    FROM empleados;
    
-- 24. Hallar el salario promedio por departamento.
	
    SELECT id_depto,AVG(sal_emp) AS 'Promedio Salarios'
    FROM empleados
    GROUP BY id_depto;
    
/*Consultas con Having*/

-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
-- empleados de esos departamentos.
/*
SELECT f.nombre,count(*)
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING COUNT(*) > 1 AND f.nombre <> 'lenovo';
*/
USE personal;

SELECT e.id_depto,count(*)
FROM departamentos d, empleados e
WHERE d.id_depto = e.id_depto
GROUP BY e.id_depto
HAVING count(*) > 3;

    

-- 26. Hallar los departamentos que no tienen empleados

SELECT * 
    FROM departamentos 
    WHERE id_depto 
    -- distintic, va mostrar el que no se repita el id
    NOT IN(SELECT DISTINCT id_depto FROM empleados);

/*
SELECT e.id_depto,count(*)
FROM departamentos d, empleados e
WHERE d.id_depto = e.id_depto
GROUP BY e.id_depto
HAVING count(*) = 0;
*/

INSERT INTO `departamentos` VALUES (4350,'MANTENIMIENTO 1','MADRIDil','Germany Lunas');

/* Consulta Multitabla (Uso de la sentencia JOIN/LEFT JOIN/RIGHT JOIN)*/

-- 27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada
-- departamento.

SELECT nombre_jefe_depto ,empleados.*
FROM empleados
LEFT JOIN departamentos ON departamentos.id_depto = empleados.id_depto;


/* Consulta con Subconsulta */

-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
-- empresa. Ordenarlo por departamento.
/*
SELECT nombre, salario 
FROM Empleados 
WHERE > (SELECT AVG(salario) FROM
Empleados);
*/

SELECT AVG(sal_emp) 'Salario Medio' FROM empleados;
/*'2115384.6153846155'*/

/*
SELECT nombre,sal_emp,id_depto
FROM empleados
WHERE sal_emp >=( SELECT AVG(sal_emp) FROM empleados)
GROUP BY nombre,id_depto,sal_emp;
*/
SELECT*FROM 
empleados 
WHERE sal_emp>(SELECT AVG(sal_emp)FROM empleados) 
ORDER BY id_depto;

SELECT nombre,sal_emp,id_depto
FROM empleados
WHERE sal_emp >( SELECT AVG(sal_emp) FROM empleados)
ORDER BY id_depto;