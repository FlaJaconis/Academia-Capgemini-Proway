create table Produto(
id int primary key generated always as identity
,nome varchar(40) not null
,descricao varchar(60) not null
,codigo int not null
,preco int not null
);

create table Categoria(
id int primary key generated always as identity
,nome varchar(40) not null
,descricao varchar(60) 
);

create table Carro(
id int primary key generated always as identity
,modelo varchar(40) not null
,marca varchar(20) not null
);

alter table carro add column chassi varchar(20) not null;

alter table carro add column ano int not null;

alter table produto drop column codigo;

drop table carro;

alter table produto 
add column id_categoria int not null;

alter table produto
add
constraint fk_categoria foreign key (id_categoria) references categoria (id);
