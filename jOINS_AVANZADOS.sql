/*
Seleccionar los registros de dos tablas por separado.
*/

SELECT * FROM fabricante;
SELECT * FROM producto;

/*
Inner Joins : Da como resultado los valores intersección entre dos tablas implicadas en la consulta.
*/
 SELECT *
 FROM producto p
 INNER JOIN fabricante f
 ON p.codigo_fabricante = f.codigo;
 /*
 Left Outer Joins: Da como resultado los valores de la tabla indicada en el from junto con
 los valores de intersección entre las dos tablas en la consulta.
 */
 
 SELECT * 
 FROM producto p
 LEFT OUTER JOIN fabricante f
 ON p.codigo_fabricante = f.codigo;
 
 /*
 Right Outer Joins : Da como resultado los valores de la tabla indicada en Right Outer Joing 
 con los valores de interseccion entre las dos tablas implicadas
 */
  SELECT * 
 FROM producto p
 RIGHT OUTER JOIN fabricante f
 ON p.codigo_fabricante = f.codigo;
 
 /*
 Semi Join (Exists): Da omo resultado los valores intersección entre la tabla producto y la tabla fabricante
 */
  SELECT * 
  FROM producto p
  WHERE EXISTS (SELECT f.codigo FROM fabricante f
				WHERE f.codigo = p.codigo_fabricante
                );
 /*
 Anti Semi Join (Not Exists): Da como resultado los valores de la tabla productos que no se encuentren
 en la tabla fabricante;
 */      
   SELECT * 
  FROM producto p
  WHERE NOT EXISTS (SELECT f.codigo FROM fabricante f
				WHERE f.codigo = p.codigo_fabricante
                );
 SELECT * 
  FROM fabricante f
  WHERE NOT EXISTS (SELECT p.codigo_fabricante FROM producto p
				WHERE  p.codigo_fabricante =f.codigo 
                );
                
/*
	Cross Join : Da como resultado los valores que se encutren en ambas tablas .
    Multiplicando cada producto por cada fabricante
*/                
SELECT *
FROM producto p
CROSs JOIN  fabricante f;