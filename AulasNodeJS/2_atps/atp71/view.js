import { Produto } from './produto.js';
import { Categoria } from './categoria.js';

console.log("Cadastro de Produto");

const p1 = new Produto;
p1.nome = 'NomeProd1';
p1.descricao = 'DescProd1';
p1.valor = 20,30;

console.log(p1);

const cat1 = new Categoria;
cat1.id=1;
cat1.nome = 'NomeProd1';
cat1.descricao = 'DescProd1';

console.log(cat1);
