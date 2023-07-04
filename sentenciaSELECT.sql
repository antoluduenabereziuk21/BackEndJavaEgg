/*
La sentencia SELECT es muy poderoasa y ampliamente rica en sus cláusulas y variantes permitiendo la capacidad de atender
en pco tiempo a consultas complejas sobre la base de datos.Está en el especialiste desarrollador de aplicaciones
 conocerlo a profundidad para explotar las bondades y virtudes.
 La sentencia SELECT , obtiene filas de la base de datos y permite realizar la seleccion de una o varias filas o 
 columnas de una o varias tablas.
 
 formato 
 SELECT nombres_de_las_columnas
 [INTO nueva tablaDestino para resiltados del select]
 FROM tablaOrigen
 [WHERE condicion de Busqueda]
 [GROUP BY nombre de columnas  por la cual agrupar ]
 [HAVING condicionBusqueda para Group By]
 [ORDER by NO,NRE DE COLUMNAS [ASC|DESC]]
 
 Claúsulas:
 
 SELECT : se usa para listar las colmnas de las tablas que se deseam ver en el resultado de una consulta.
 Además de las columans se puede listar columnas a calcular por SQL cuando actué la sentencua .
 Esta cláusula no puede omitirse.
 FROM : Lista las tablas que deben ser anilzadas en la evalucion de la expresion de la cláusula WHERE 
 y donde se listaran las columnas enunciadas en el SELECT. Esta cláusula no puede omitirse.
 WHERE : Establece criterios de ciertas filas en el resiltado de la conslta gracias alas condiciones 
 de búsqueda.Si no se requiere condiciones de búsqueda puden omitirse y el resultadoserán todas 
 las filas de las tablas enunciadas el el FROM.
 
*/
USE tienda;

SELECT * FROM fabricante ;

SELECT * FROM fabricante WHERE CODIGO = 3;

SELECT nombre FROM fabricante WHERE CODIGO = 5;

SELECT codigo,nombre FROM fabricante WHERE CODIGO = 5;

SELECT * FROM fabricante WHERE CODIGO <5;

SELECT * FROM fabricante WHERE CODIGO  > 5;

SELECT * FROM fabricante WHERE nombre = 'gigabyte';

SELECT * FROM fabricante WHERE nacionalidad = 'china';
/* Podemos utilizar operadores logicos*/
SELECT * FROM fabricante WHERE nacionalidad = 'china' AND nombre = 'Asus';

SELECT * FROM fabricante WHERE nacionalidad = 'china' OR nacionalidad = 'corea del sur';
/* Tambien podemos usar funciones.Funcion count nos contibiliza lka cantidad de registros*/
SELECT count(*) FROM fabricante;
-- ademas le podemos condicionar la consulta
SELECT count(*) FROM fabricante WHERE NACIONALIDAD = 'CHINA';
-- ADEMAS TENEMOS LA FUNCION MAX(valor de columna) trae el maximo valor
SELECT MAX(CODIGO) FROM fabricante;
-- y tambien la funcion MIN(valor de columna) que nos trae el min valor
SELECT MIN(codigo) FROM fabricante;
-- TAMBIEN CON LA SETENCIA IN(VALOR) NOS TRAE LOS VALORES INDICADOS ENTRE LOS PARENTESIS
SELECT * FROM fabricante WHERE CODIGO IN (3,5);
/* Ademas podemos ver si una string contiene ciertos caracteres 
con  la funcion LIKE(similar) más el operador % ,  
colocado ala derecha " j% " indica que buscara ala izquieda,comienza con ..... 
colocado ala izquiera "% j " indica que buscara ala derecha,finaliza con .....
y colocandolo entre ambos siginifica que puede estar ala derecha o ala izquiera "% j % "
*/
SELECT * FROM fabricante WHERE nombre LIKE '%su%';
SELECT * FROM fabricante WHERE nombre LIKE 'sus%';
SELECT * FROM fabricante WHERE nombre LIKE '%a';
SELECT * FROM fabricante WHERE nombre LIKE '%sus';

/*
La sentecia BETWEEN(ENTRE) nos sirve para relizar busquedas entre dos parametros, 
INCLUYENDO ESTOS DOS EL LA BUSQUEDA
*/
SELECT * FROM fabricante WHERE codigo BETWEEN 2 AND 7;