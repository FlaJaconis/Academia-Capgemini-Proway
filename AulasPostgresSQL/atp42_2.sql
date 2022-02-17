insert into produto( nome, descricao, preco, id_categoria)
values('tonner','tinta para impressora',80, 1);

insert into produto( nome, descricao, preco, id_categoria)
values('etiqueta A','caixa com 10 folhas',15, 1);

insert into produto(nome, descricao, preco, id_categoria)
values('notebook Asus','Notebook modeloX',3700, 2);

insert into produto(nome, descricao, preco, id_categoria)
values('Impressora Canon','Impressora com  tanque de tinta',1800, 2);

insert into produto(nome, descricao, preco, id_categoria)
values('Cadeira modelo1','cadeira reclinável',780, 2);

insert into produto(nome, descricao, preco, id_categoria)
values('Mesa','mesa com duas gavetas',250, 2);

update produto set descricao = 'refil para impessora' where  nome = 'tonner';
update produto set descricao = 'Notebook Modelo Y' where  id = 3;

delete from produto where id = 5;

alter table produto 
drop column id_categoria; 

delete from categoria where id = 1;

update categoria set nome = 'Informática' where  nome = 'eletroeletrônicos';

update produto set preco=preco-1;