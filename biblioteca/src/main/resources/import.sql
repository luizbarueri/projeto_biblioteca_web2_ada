insert into livros(titulo, autor, ano_publicacao) values ('Menino de Asas', 'Não lembro', 2001);
insert into livros(titulo, autor, ano_publicacao) values ('Tieta do Agreste', 'Desconhecido', 2002);
insert into livros(titulo, autor, ano_publicacao) values ('O Sapo Cururu', 'Cabra Bão', 2003);

insert into membros(nome, contato) values ('Luiz', 9999-4545);
insert into membros(nome, contato) values ('Calixto', 8888-2222);
insert into membros(nome, contato) values ('Catarina', 78788-3333);

insert into emprestimos(data_emprestimo, data_vencimento, data_devolucao, multa, membro_id, livro_id) values ('2024-03-01T00:00:00Z', '2024-03-10T00:00:00Z', '2024-03-08T00:00:00Z', 0,1,2);
insert into emprestimos(data_emprestimo, data_vencimento, data_devolucao, multa, membro_id, livro_id) values ('2024-03-05T00:00:00Z', '2024-03-15T00:00:00Z', '2024-03-14T00:00:00Z', 0,2,1);
insert into emprestimos(data_emprestimo, data_vencimento, data_devolucao, multa, membro_id, livro_id) values ('2024-03-10T00:00:00Z', '2024-03-20T00:00:00Z', '2024-03-25T00:00:00Z', 15.5,3,3);