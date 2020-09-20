DROP DATABASE IF EXISTS logHorizon;
CREATE DATABASE logHorizon;
USE logHorizon;

CREATE TABLE products
(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,  -- BIG INT ER DET SAMME SOM JAVA LONG DATATYPE
    `name` VARCHAR(45) NOT NULL,
    price FLOAT NOT NULL,
    `description` VARCHAR(80) NOT NULL
);

INSERT INTO products() VALUES (DEFAULT, 'Soda', 10, 'A soda drink');
INSERT INTO products() VALUES (DEFAULT, 'Water', 5, 'A watery drink');
INSERT INTO products() VALUES (DEFAULT, 'Beer', 10, 'An alcoholic drink');

DROP USER IF EXISTS 'user'@'localhost';
CREATE USER 'user'@'localhost' IDENTIFIED BY '1234567890';
GRANT ALL PRIVILEGES ON logHorizon.* TO 'user'@'localhost';
-- maybe chance name later