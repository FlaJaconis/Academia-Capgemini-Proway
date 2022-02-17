import Conta from './model/Conta.js'
import ContaRepository from './repository/ContaRepository.js'
import bodyParser from 'body-parser';
import Express from 'express';

console.log('============Banco===========')

const api = Express();
api.use(bodyParser.json());
api.listen(3000, ()=>console.log('Rodando....'));
api.use('/api/conta', ContaApi);



