--Створення БД
CREATE DATABASE demo_db;

--Створення таблиці
CREATE TABLE IF NOT EXISTS clients
( id INTEGER NOT NULL AUTO_INCREMENT,
  img VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

--Внесення даних до таблиці
INSERT INTO
	clients (img, first_name, last_name, phone)
VALUES
	('client1.jpg', 'Ryan', 'Gosling', '555 555-4444'),
	('client2.jpg', 'Brad', 'Pitt', '444 444-7777'),
	('client3.jpg', 'Johnny', 'Depp', '777 555-3333');