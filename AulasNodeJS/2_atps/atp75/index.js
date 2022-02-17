

import bodyParser from 'body-parser';
import Express from 'express';
import ClienteApi from './api/ClienteApi.js';



const api = Express();
api.use(bodyParser.json());
api.listen(8090, ()=>console.log('Rodando...'));
api.use('/api/cliente', ClienteApi);



