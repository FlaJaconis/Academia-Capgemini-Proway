import { Router } from 'express';
import Cliente from './../model/Cliente.js'
import GerarDatabase from './../repository/GerarDataBase.js';

const ClienteApi = Router(); 

const gb = new GerarDatabase();

ClienteApi.get('/', async (req, resp)=>{
    const lista = await gb.findAll();
    resp.send(lista);
});

ClienteApi.post('/', async (req, resp)=>{
    let {nome, sobrenome, cpf} = req.body;
    const cliente = new Cliente(nome, sobrenome, cpf);
    const retorno = await gb.create(cliente);
    resp.send(retorno);
});

ClienteApi.put('/:id', async (req, resp)=>{
    let id = req.params.id;
    let {nome, sobrenome, cpf} = req.body;
    const cliente = new Cliente(nome, sobrenome, cpf, id);
    const retorno = await gb.update(cliente);
    resp.send(retorno);
});

ClienteApi.delete('/:id', async (req, resp)=>{
    const id = req.params.id;
    const retorno = await gb.delete(id);
    resp.send( JSON.stringify(retorno) );
});

export default ClienteApi;