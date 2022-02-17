import ClienteTable from './db/ClienteTable.js';
import Cliente from './model/Cliente.js'
import GerarDatabase from './repository/GerarDataBase.js';


console.log('============ Cadastro de Clientes ============')

const gb = new GerarDatabase();

const c1 = new Cliente();
c1.nome = "nome1";
c1.sobrenome = "sobrenome1";
c1.cpf = "000.000.000-00";

const c2 = new Cliente();
c2.nome = "nome2";
c2.sobrenome = "sobrenome2";
c2.cpf = "111.111.111-11";

const c4 = new Cliente();
c4.nome = "nome4";
c4.sobrenome = "sobrenome4";
c4.cpf = "444.444.444-44";

//gb.create(c1);
//gb.create(c4);


console.log('=========== Atualizando ===========')

c1.id = "1";
c1.nome = "nome3";
c1.sobrenome = "sobrenome3";
c1.cpf = "333.333.333-33";
//console.log(await gb.update(c1));


console.log('============ Deletando ============')

//console.log(await gb.delete(2));



console.log('============ Listando ============')

const lista = ClienteTable.findAll();
console.log(await gb.findAll());


