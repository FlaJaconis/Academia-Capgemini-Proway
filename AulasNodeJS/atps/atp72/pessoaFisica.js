import { Pessoa } from "./pessoa.js";

export class PessoaFisica extends Pessoa{

    #cpf;
    constructor (entracpf){
      super();
      this.#cpf = entracpf;
    }

  }
  
 

