CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionario (
id BIGINT AUTO_INCREMENT,
nome VARCHAR(255),
data_nascimento DATE,
cargo VARCHAR(255),
salario INT

PRIMARY KEY(id) 
);

select * from tb_funcionario;

INSERT INTO tb_funcionario (nome, data_nascimento, cargo, salario)
VALUES("Felipe", 1993-07-21, "estagiário", 1800);
INSERT INTO tb_funcionario (nome, data_nascimento, cargo, salario)
VALUES("Joana", 1988-05-01, "gerente", 7500);
INSERT INTO tb_funcionario (nome, data_nascimento, cargo, salario)
VALUES("Maria", 19987-03-14, "diretora", 11500);

SELECT * FROM tb_funcionario WHERE salario > 2000;
SELECT * FROM tb_funcionario WHERE salario < 2000;
ALTER TABLE tb_funcionario ADD COLUMN ativo VARCHAR(3);

select * from tb_funcionario;
