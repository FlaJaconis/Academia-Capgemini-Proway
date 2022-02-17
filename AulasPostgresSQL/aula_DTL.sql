--DTL = Data Transaction Language/
-- transa��o de controle do commits (s� realiza se n�o houver nenhum erro nos scripts)


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