import { Cliente } from './../model/Cliente';
import { ClienteService } from './../services/cliente.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clientes-form',
  templateUrl: './clientes-form.component.html',
  styleUrls: ['./clientes-form.component.css']
})
export class ClientesFormComponent implements OnInit {
  cliente = {} as Cliente;

 constructor(private clienteService: ClienteService) {

  }

  ngOnInit(): void {
  }
  salvar(){
    this.clienteService.salvar(this.cliente);
    this.limpar();
    };

  private limpar(){
    this.cliente = {} as Cliente;
  }

}
