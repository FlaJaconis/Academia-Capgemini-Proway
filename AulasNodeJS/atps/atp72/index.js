import { PessoaFisica } from './pessoaFisica.js';
import { PessoaJuridica } from './pessoaJuridica.js';

console.log("++------ Cadastro de PF/PJ ------++");

const pf1 = new PessoaFisica;
pf1.nome = 'NomePF1';
pf1.telefone = '11111-111';
pf1.cpf = "000.000.000-00";

console.log(`Pessoa Física - Nome: ${pf1.nome}, Telefone: ${pf1.telefone}, ${pf1.cpf}`);

const pj1 = new PessoaJuridica;
pj1.nome = 'NomePJ1';
pj1.telefone = '22222-2222';
pj1.cnpj = "111.111.111-00";

console.log(`Pessoa Jurídica - Nome: ${pj1.nome}, Telefone: ${pj1.telefone}, ${pj1.cnpj}`);