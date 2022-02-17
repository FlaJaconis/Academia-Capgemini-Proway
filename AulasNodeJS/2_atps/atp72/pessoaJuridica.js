import { Pessoa } from "./pessoa.js";

export class PessoaJuridica extends Pessoa {
    #cnpj;

       constructor (entraCnpj){
        super();
        this.#cnpj = entraCnpj;
      }

}
