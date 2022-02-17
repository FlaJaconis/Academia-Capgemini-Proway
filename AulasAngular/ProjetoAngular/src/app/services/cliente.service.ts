import { Cliente } from './../model/Cliente';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ClienteService {
  private lista: Cliente[];
  private url:string;

  constructor(private httpClient:HttpClient) {
    this.url = 'localhost:8090/api/cliente';
   }

  salvar(cliente:Cliente):void{

    //this.lista.push(cliente);

  }

  listar():Observable<Cliente[]> {
    return this.httpClient.get<Cliente[]>(this.url);// precisa colocar o generics <> porque retorna um Observable( que observa a respota) por padrão
  }
}

  
