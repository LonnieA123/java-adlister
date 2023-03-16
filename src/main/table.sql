DROP DATABASE IF EXISTS adlister_db;

CREATE DATABASE adlister_db;


USE adlister_db;


CREATE TABLE users (
                       id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(50) NOT NULL,
                       email VARCHAR(50) NOT NULL,
                       password VARCHAR(50) NOT NULL
);

CREATE TABLE ads (
                          id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                          user_id INT UNSIGNED DEFAULT NULL,
                          title VARCHAR(50) NOT NULL,
                          description TEXT NOT NULL,
                          FOREIGN KEY (user_id) REFERENCES users (id)
);


show tables;

INSERT INTO users (username, email, password) VALUES ("me","long@gmail.com","");

SELECT * FROM ads;

INSERT INTO ads (user_id, title, description) VALUES (1,"me","wdawda");


DROP TABLE users;
DROP TABLE ads;