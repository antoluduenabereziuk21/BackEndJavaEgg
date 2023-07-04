-- para comentar (--) dos guines y espacio
-- 1
-- SELECT * from empleados;
-- 2
-- SELECT * from departamentos;
-- 3
-- SELECT nombre_depto from departamentos;
-- 4
-- SELECT nombre,sal_emp from empleados "si agregamos as + texto muestra esa txt como nombre de columna
-- ";
-- 5 
-- SELECT comision_emp from empleados;
-- 6
SELECT * from empleados where cargo_emp like 'Secretaria';
-- 7 asc ascendente des decente
SELECT * from empleados where cargo_emp like 'vendedor' order by nombre asc;
-- 8
SELECT nombre,cargo_emp,sal_emp FROM empleados where sal_emp order by  sal_emp asc;
-- 9 orden segun ciudad

SELECT nombre_jefe_depto,ciudad from departamentos where ciudad like 'Ciudad real';
-- 10 elebore un lisado para  cada fila figure el alias 
SELECT nombre as Nombre,cargo_emp as Cargo  from empleados;
-- 11
SELECT nombre,sal_emp,comision_emp from empleados where id_depto = 2000 order by comision_emp asc;
-- 12
SELECT id_depto,nombre,sal_emp,(sal_emp + comision_emp + 500) as total from empleados 
where id_depto = 3000 order by  nombre asc;
-- 13 pra filtrar por carcater agregando % j " 
-- 'j%' ala lizquierda no hay anda 
-- '%j' ala derecha no hay nada 
-- y si '%j% puede estar o no'"
SELECT nombre from empleados where  nombre like 'j%';

-- 14 
SELECT sal_emp,comision_emp,(sal_emp + comision_emp) as total,nombre
from empleados
where comision_emp>100000;

-- 15

SELECT sal_emp,comision_emp,(sal_emp + comision_emp) as total,nombre
from empleados
where comision_emp = 0;

-- 16

SELECT nombre,sal_emp,comision_emp
from empleados
where comision_emp>sal_emp;

-- 17
SELECT comision_emp ,nombre,sal_emp from empleados WHERE comision_emp <= (sal_emp*0.3);
-- 18
SELECT nombre from empleados where  nombre   not like '%ma%';
-- 19
SELECT nombre_depto from departamentos where 
nombre_depto like 'ventas' or  nombre_depto 
like 'investigacion' or  
nombre_depto like 'mantenimiento';
-- 20 
SELECT nombre_depto from departamentos where 
nombre_depto not like 'ventas' and  nombre_depto 
not like 'investigacion' and  
nombre_depto not like 'mantenimiento';
-- 21
SELECT max(sal_emp) from 
empleados ;
-- 22 
select max(nombre) from empleados;
select min(nombre) from empleados;

SELECT nombre
from empleados 
order by nombre desc limit 1;

-- 23
SELECT max(sal_emp) as 'salario maximo',
 min(sal_emp)as 'salario minimo',
(max(sal_emp)-min(sal_emp))as 'diferencia' 
from empleados;

-- 24
SELECT id_depto,avg(sal_emp) 
from empleados
GROUP BY id_depto;

-- 25
use personal;
SELECT id_depto,count(*) 
from empleados
GROUP BY id_depto HAVING count(*)>3;