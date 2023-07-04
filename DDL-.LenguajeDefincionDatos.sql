/*
Teoria 
Lenguaje de definicion de Datos (DDL): perimtie crear y definir nuevas bases de datos , campos e índices.
CREATE: crea esquemas, nuevas tablas , compos e índices;
DROP: Elimina tablas e índices;
ALTER: Modifica las tablas agregando camposo cambiando la definición de los campos
*/
-- CREAMOS UNA BASE DE DATOS
CREATE DATABASE redsocial;
-- INDICMOS A MYSQL QUE USE ESA BASE DE DATOS
use redsocial;
-- CREMOS UNA TABLA DENTRO DE NUESTRA BASE DE DATOS
CREATE TABLE `redsocial`.`mascota`(
`nombre` VARCHAR(255) NOT NULL,
`raza`VARCHAR(255)NOT NULL
);
-- HABIENDO SELECIONADO EL UN ESQUE BORRAREMOS UNA TABLA 
DROP TABLE mascota;
-- DE MANERA SIMILIAR BORRAREMOS UN ESQUEMA; 
DROP SCHEMA prueba;
/*
CREAMOS NUEVAMENTE LA TABLA MASCOTA PAR REALIZAR UNA MUESTRA DEL COMANDO ALTER

CREATE TABLE `redsocial`.`moscota`(
`nombre` VARCHAR(255) NOT NULL,
`raza`VARCHAR(255)NOT NULL
);
*/
-- MODIFICAREMOS UNA COLUMNA 
ALTER TABLE `redsocial`.`moscota` 
CHANGE COLUMN `nombre_mascota2` `nombre_mascota` VARCHAR(255) NOT NULL ;
-- INSETAREMOS ESTA TABLA PRA INSERTAR VALORES
USE redsocial;
INSERT INTO mascota VALUES('ROMA','PASTOR ALEMAN');
INSERT INTO mascota VALUES('RPINCE','CANICHE');
INSERT INTO mascota VALUES('CHIKY','MESTIZO');
/* PARA MOSTRAR UNA TABLA USREMOS EL SIGUENTE COMANDO

SELECT *(*=todo) FROM NOMBRE TABLA;

*/
SELECT * FROM mascota










