CREATE DATABASE db_escolaceleste;
USE db_escolaceleste;

CREATE TABLE tb_alunos (
id BIGINT AUTO_INCREMENT, 
nome VARCHAR (255) NOT NULL,
ra INT, 
sala INT, 
nota DECIMAL NOT NULL,
PRIMARY KEY (id) 
);

INSERT INTO tb_alunos (nome, ra, sala, nota)
VALUES ("Valorie", 1357, 2, 1),
("Lucas" , 2468, 3 , 3),
("Gustavo", 3568, 4, 5),
("Ana Kemily", 7383, 6, 8),
("Matheus", 6482, 7, 2);

SELECT * FROM tb_alunos;

SELECT * FROM tb_alunos WHERE nota > 7.0;
SELECT * FROM tb_alunos WHERE nota < 7.0;

UPDATE tb_alunos SET nota = 9 WHERE id = 4;
SELECT * FROM tb_alunos WHERE id = 4;