/*
ORDER BY : Nos permite ordenar una tabla por una columna de foma ascendente o forma descente.
por defecto lo realiza de forma ascendente 
*/

SELECT * 
FROM fabricante 
ORDER BY nombre;

SELECT * 
FROM fabricante 
ORDER BY nombre asc ;

SELECT * 
FROM fabricante 
ORDER BY nombre desc ;

SELECT * 
FROM fabricante 
ORDER BY nombre, codigo asc ;

/*veamos el ordenamiento con una tbla relacionadaSELECT p.codigo,p.nombre,p.precio*/
SELECT f.nombre,p.nombre,p.precio
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
ORDER BY f.nombre,p.nombre;

SELECT f.nombre,p.nombre,p.precio
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
ORDER BY p.nombre,f.nombre;

/*
Group By: permite agrupar resultados
*/

SELECT f.nombre
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre;
/* dentro de group b se usa mucho la funcion count(*), para promedios sumas*/
SELECT f.nombre,count(*)
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre;

/*
HAVING , nos permite dar un criterio a un agrupamiento 
*/
SELECT f.nombre,count(*)
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING COUNT(*) > 1 ;

SELECT f.nombre,count(*)
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING COUNT(*) > 1 AND f.nombre <> 'lenovo';
/* ademas podemos utilizar funciones en habing en este caso traeremos productos 
y agruparemos por nombre de farbicante y luego si la sumatoria de productos por fabircnate es mayor a 300
los mostrara*/
SELECT f.nombre,count(*),SUM(p.precio)
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
GROUP BY f.nombre
HAVING SUM(p.precio)> 300;
