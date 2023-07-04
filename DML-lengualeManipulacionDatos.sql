/*
Lenguaje de manipulacion de datos (DML) nos permite generar consultas para ordenar,
filtrar y extraer datos de la base de datos.

SELECT Consulta registros de la base de datos que satisfagan a un criterio determinado.
INSERT Carga lotes de datos de la base de datos en una unica operacion
UPDATE Modifica los campos de los campos y registros especificos.
DELETE Eliminar registros de una tbala de una base de datos.

INSERT INTO
En su formato mas sencillo, INSERT se utiliza para añadir una sola fila a una tabla.
Demos especificar el nombre de la tabla y una lista de valores para la fila.Los valores deben suminstrarse
en el mismo orden en que s eespecificaron los atributos correspondientes en el comando CREATE TABLE.ALTER

INSERT INTO nombre_tabla(columna1,columna2,columnaN,......) VALUES (valor,valor2,valorN,....);

*/
USE  redsocial;

SELECT * FROM mascota;

INSERT INTO mascota (nombre,raza) VALUES ('NEGRITO','MESTIZO');

/*
UPDATE

El comando UPDATE  se utiliza para modificar valores de atributo de una o mas filas seleccionadas.
Una clásula WHERE en el comando UPDATE selecciona las filas de una tabla que se que se van a modificar.
La sentencia UPDATE teine la siguiente forma:

UPDATE nombre_tabla  
SET col_nombre_1={valor1|DEFAULT},
[col_nombre_2={valor2|DEFAULT}]
[OREDER BY][wHERE condicion]

*/

UPDATE	mascota
SET raza = 'PASTOR ALEMAN/BELGA'
WHERE nombre = 'ROMA';

SELECT * FROM mascota;

/*
DELETE 

Elimina filas de una tabla. Incluye ua cláusula WHERE ,para selccionar las filas que se van a eliminar.
* Las filas se eliminan explicitacmente solo de una tabla ala vez . 
Sin Embargo , la eliminación se puede propagara filas de otras tablas si han especificado opciones 
de acciones refenciales en las restricciones de integridad referencial del DDL.
* En funcion del número de las filas seleccionadas por la condición de la cláusula WHERE ,ninguna , 
una o varias filas puden ser elimandas por un solo comando DELETE. 
La ausencia de una clausula WHERE siginifica qye se borraran todas las filas de la relacion; 
sin embargo, la tabla prevalesera.

DELETE FROM nombre_tabla [WHERE condicion ][ORDER BY.....][LIMIT canitdad_filas];

*/

DELETE FROM mascota WHERE nombre = 'NEGRITO';

SELECT * FROM mascota;
