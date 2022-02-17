class Cliente{
    id
    nome;
    sobrenome;
    cpf;

    constructor(nome, sobrenome, cpf, id=null){ //colocar um valor para ao id que dizer que ele é parâmetro opcional, ou seja,
        //se ele não receber um valor, terá o valor default null
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.id = id;
    }
}

export default Cliente;