/*Consultas Tablas Ralacionadas-DB Tienda*/

SELECT * FROM fabricante;
SELECT * FROM producto;
/*
 En las consultas podemos utilizar un alias en el fabricante 
 tendra una alias de "f" de ahora en adelante , y producto un alias de "p"
 
 Basicamente la consulta le estamos diciendo:
  Traeme el nombre del fabricante , el nombre del producto, y el precio del producto
  de la tabla fabricante y de la tabla productos,Donde el codigo del fabricnate sea el mismo que 
  en la tabla producto de la columna codigo_fabricante
*/
SELECT f.nombre,p.nombre,p.precio
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante;
-- añadamos un clausula mas a where añadiendo and(ademas que el codigo de farbicante sea 7)
SELECT f.nombre,p.nombre,p.precio
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
AND f.codigo = 7;

-- atra consulta mas 
SELECT f.nombre,f.codigo
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
AND f.codigo = 7;
-- realizamos otra consulta con distitnos campos en el pedido
SELECT p.codigo,p.nombre,p.precio
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
AND f.codigo = 7;
-- tambien podemos realizar filtros por nombres
SELECT p.codigo,p.nombre,p.precio
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
AND f.nombre = 'Lenovo';
-- añadamos un condicional mas en este casa un nombre y un rango de precio
SELECT p.codigo,p.nombre,p.precio
FROM fabricante f, producto p 
WHERE f.codigo = p.codigo_fabricante
AND f.nombre = 'Lenovo'
AND p.precio >450;