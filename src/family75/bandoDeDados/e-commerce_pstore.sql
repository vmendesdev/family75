CREATE DATABASE db_ecommercepstore;

USE db_ecommercepstore;
CREATE TABLE tb_produtos (
id BIGINT AUTO_INCREMENT, 
nome VARCHAR (255) NOT NULL, 
quantidade INT,
garantiameses INT,
preco DECIMAL NOT NULL, 
PRIMARY KEY (id)
);

INSERT INTO tb_produtos (nome, quantidade, garantiameses, preco)
VALUES ("Smartphone", 4 , 6, 980.00),
("Tablet", 10 , 6, 380.00),
("Pc Gamer", 3 , 3, 1980.00),
("Notebook", 2 , 8, 2080.00),
("Caixa de Som", 8 , 6, 500.00),
("Televisão", 4 , 6, 870.00),
("Video-Game", 4 , 6, 3980.00),
("Kit Game", 4 , 3, 280.00);

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE preco > 500.00;
SELECT * FROM tb_produtos WHERE preco < 500.00;

UPDATE tb_produtos SET  preco = " 390.00" WHERE id = 8; 
SELECT * FROM tb_produtos;
UPDATE tb_produtos SET  preco = " 2400.00" WHERE id = 3; 
SELECT * FROM tb_produtos;