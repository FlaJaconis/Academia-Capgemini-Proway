--DTL = Data Transaction Language/
-- transação de controle do commits (só realiza se não houver nenhum erro nos scripts)


begin transaction;

create table pessoa (
id int primary key generated always as identity
,nome varchar(40) not null
,sobrenome varchar(60) not null
);


create table produto (
id int primary key generated always as identity
,nome varchar(40) not null
,descricao varchar(60) not null
,codigo int not null
,preco int not null
);

commit;
end;