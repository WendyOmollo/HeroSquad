SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS heroes(
id int PRIMARY KEY auto_increment,
name VARCHAR NOT NULL,
age INT NOT NULL,
strength VARCHAR NOT NULL,
weakness VARCHAR NOT NULL,
);