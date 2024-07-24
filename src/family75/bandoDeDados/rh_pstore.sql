CREATE DATABASE db_rhpstore;

USE db_rhpstore;

CREATE TABLE tb_colaboradores (
id BIGINT AUTO_INCREMENT,
nome VARCHAR (255) NOT NULL, 
matricula INT,
dataadmissao DATE,
salario DECIMAL NOT NULL,
PRIMARY KEY (ID)
);

INSERT INTO tb_colaboradores (nome, matricula, dataadmissao, salario)
VALUES ("Gabriele Silva", 3001, "2024-05-14", 2100.00) ,
 ("Kettellyn Melo", 3001, "2024-03-13", 2200.00) ,
 ("Nicolas Santos", 3001, "2024-05-14", 1700.00) ,
 ("Gael Alvarenga", 3001, "2024-05-31", 2150.00) ,
 ("Sofia Santos", 3001, "2024-05-14", 1900.00) ;

SELECT * FROM tb_colaboradores;

SELECT * FROM tb_colaboradores WHERE salario > 2000.00;

SELECT * FROM tb_colaboradores WHERE salario < 2000.00;

UPDATE tb_colaboradores SET  salario = " 2800.00" WHERE id = 3; 

UPDATE tb_colaboradores SET  salario = " 2400.00" WHERE id = 2; 

SELECT * FROM tb_colaboradores;