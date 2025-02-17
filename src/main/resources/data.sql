## By Thiago P.

## Confere o script SQL com os inserts para cada tabela
## Espero que esteja correto

INSERT INTO tb_categoria (id, descricao) VALUES
(1, "Curso"),
(2, "Oficina");

INSERT INTO tb_atividade (id, descricao, nome, preco, categoria_id) VALUES
(1, "Curso de HTML", "Aprenda HTML de forma prática", 80, 1),
(2, "Oficina de Github", "Controle Versões de seu projeto", 50, 2);



INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES
(1, '2017-09-25 08:00:00', '2017-09-25 11:00:00', 1),
(2, '2017-09-25 14:00:00', '2017-09-25 18:00:00', 2),
(3, '2017-09-26 08:00:00', '2017-09-26 11:00:00', 2);

INSERT INTO tb_participante(id, nome, email) VALUES
(1, 'José Silva', 'jose@gmail.com'),
(2, 'Tiago Faria', 'tiago@gmail.com'),
(3, 'Maria do Rosário', 'maria@gmail.com'),
(4, 'Teresa Silva', 'teresa@gmail.com');


INSERT INTO tb_participante_atividade (participante_id, atividade_id) VALUES
(1,1),
(1,2),
(2,1),
(3,1),
(3,2),
(4,2);

SELECT * FROM tb_atividade;
SELECT * FROM tb_categoria;
SELECT * FROM tb_participante;
SELECT * FROM tb_participante_atividade;

## By Thiago P.   ;)


