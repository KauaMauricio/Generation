CREATE DATABASE db_generation_game_online;

USE db_generation_game_online; 

CREATE TABLE tb_classe(
    id bigint auto_increment,
    nivel int,
    classe varchar(255),
    habilidade varchar(255),
    arma varchar(255),
    
    primary key(id)
);

SELECT * FROM tb_classe;

CREATE TABLE tb_personagem(
    id bigint auto_increment,
    nome varchar(255),
    raca varchar(255),
    vida int,
    defesa int,
    ataque int,
    classe_id bigint,
    
    primary key(id),
    foreign key (classe_id) references tb_classe(id)
);

SELECT * FROM tb_personagem;

INSERT INTO tb_classe(nivel, classe, habilidade, arma)
VALUES(99 ,"Guerreiro","Pericia em armas","Espada de duas mãos");

insert into tb_classe(nivel, classe, habilidade, arma)
values(200,"Mago","Resistencia a Magia","Cajado");

insert into tb_classe(nivel, classe, habilidade, arma)
values(100 ,"Ladino","Mãos leves","Adaga");

insert into tb_classe(nivel, classe, habilidade, arma)
values(149 ,"Arqueiro","Arquerismo","Arco e flecha");

insert into tb_classe(nivel, classe, habilidade, arma)
values(50 ,"Bardo","Lábia","Alaude");

INSERT INTO tb_personagem(nome,raca,vida,defesa,ataque,classe_id)
VALUES("Melim","Anão",1500 , 3000, 2000, 1);

INSERT INTO tb_personagem(nome,raca,vida,defesa,ataque,classe_id)
VALUES("Josias","Elfo Negro", 1150, 1490 , 3000, 5);

INSERT INTO tb_personagem(nome,raca,vida,defesa,ataque,classe_id)
VALUES("Vanessa","Centauro", 4700, 1300, 7500, 2);

INSERT INTO tb_personagem(nome,raca,vida,defesa,ataque,classe_id)
VALUES("Marcia","Humana", 500 , 5400, 2000, 3);

INSERT INTO tb_personagem(nome,raca,vida,defesa,ataque,classe_id)
VALUES("Tonho","Construtor", 2000, 6800, 4000, 4);

INSERT INTO tb_personagem(nome,raca,vida,defesa,ataque,classe_id)
VALUES("Ariel","Elfa", 2500, 6000, 3000, 3);



SELECT * FROM tb_personagem WHERE ataque > 2000;

SELECT * FROM tb_personagem WHERE defesa >= 1000 AND defesa <=2000;
-- outra forma de fazer a query da consulta de defesa
SELECT * FROM tb_personagem WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem WHERE nome LIKE "%c%";

SELECT * FROM tb_personagem INNER JOIN tb_classe on tb_classe.id = tb_personagem.id;


SELECT * FROM tb_classe
INNER JOIN tb_personagem on tb_personagem.classe_id = tb_classe.id
WHERE classe_id = 3;
