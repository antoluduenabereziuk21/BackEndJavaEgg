/*
Ligadura
Tipo: Integridad de Entidad o Tabla
	
    Especifica que, en una tabla o entidad, todas susu filas tengan un identificador único que 
    diferencie a una fila de otra támbien que se establezcan columnas cuyo contenido es una valor único que
    las hce llaves candidatas parar un futuro como por elemplo:
    numero de cédula,numero de seguro cosicla o cuenta de email.
    
    PRIMARY KEY:Este tipo de resticción se aplica a todas las filas permitiendo que eixsta un identificador,
				que se conoce como llave primaria y que se asegura que los usuarios no introduzcan valores duplicados.
                Además, asegura que se cree un índece para mejorar el desempeño.
                Los valores nulos no están permitidos para este tipo de resticción.
*/
DROP DATABASE IF EXISTS tienda;

USE tienda;CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

/*
Ligaduras
Tipo: Integridad Referencial
	La Integridad Referencial asegura que las relaciones que existen entre llave primaria
    (en la tabla referenciada) y la llve foránea (en las tablas referenciantes) séran siempre
    mantenidas.Una fila o registro en la tabla refenciada(tabla donde reside la llave primaria)
    no puede ser borrada o su llave primaria cambiada si existe una fila o registro con una 
    llave foránea(en la tabla refenreciante) que se refiera a esa llave primaria.
    
    FOREING KEY: En esta resticciń se define una columna o combinancion de columnas en las cuales
    su valor debe debe corresponder al valor de la llave primaria en la misma u otra tabla.
*/
CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);