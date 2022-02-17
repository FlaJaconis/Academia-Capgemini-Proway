--Liste todos os dados de todas as colunas da tabela Categoria.
select * from categoria;

--Liste todos os dados de todas as colunas da tabela Produto.
select * from produto;

-- Liste os dados de todas as colunas da tabela Categoria, para as linhas que possuam uma descrição preenchida.
insert into categoria (nome,descricao) values ('eletroeletronicos', '');
select * from categoria where descricao != '';

--Liste os dados das colunas Id, nome e preço da tabela Produto, para as linhas que possuem um nome iniciando com E.
select * from produto where nome like 'e%';

--Liste os dados das colunas Id, nome e preço da tabela Produto e os dados id, 
--nome e descrição da tabela Categoria para as linhas que possuem um preço maior que 0
select * from produto join categoria on (preco > 0);

---Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.
select * from produto where id > 2;

--Liste os dados de todas as colunas da tabela Categoria e os 
--dados da coluna nome da tabela Produto, para as categorias que estão sendo utilizadas por produtos.

select p.nome, c.nome, c.descricao from produto p join categoria c on (c.id = p.id);