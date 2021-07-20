DROP TABLE IF EXISTS people;

CREATE TABLE people (id INT AUTO_INCREMENT  PRIMARY KEY, first_name VARCHAR(250) NOT NULL,
                     last_name VARCHAR(250) NOT NULL, designation VARCHAR(250) DEFAULT NULL);

INSERT INTO people (first_name, last_name, designation) VALUES
('John', 'Doe', 'Software Engineer'),
('James', 'Gosling', 'Distinguish Engineer'),
('Dennis', 'Richie', 'Architect');
