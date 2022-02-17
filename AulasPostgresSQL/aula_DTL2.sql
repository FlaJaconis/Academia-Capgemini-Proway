--DTL = Data Transaction Language/
-- Savepoint e Rollback (para qdo quero conservar um script d� certo 
-- e n�o executar o outro que d� erro)

begin transaction;

--scripta que funciona
create table pessoa (
id int primary key generated always as identity
,nome varchar(40) not null
,sobrenome varchar(60) not null
);

savepoint criando_Pessoa;

--script errado
create table produto (
id int primary key generated always as identity
,nome varchar(40) not null
,descricao varchar(60) not null
,codigo int not null
,preco int not null
);

rollback to criando_Pessoa;

commit;
end;