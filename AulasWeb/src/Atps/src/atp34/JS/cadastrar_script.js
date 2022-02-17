window.onload = function(){
        let pessoa = [];
        localStorage.setItem("pessoa", JSON.stringify(pessoa));
}

function salvar(event){
    event.preventDefault();
    let id = document.getElementById('id');
    let nome = document.getElementById('nome');
    let cpf = document.getElementById('cpf');
    let nasc = document.getElementById('nascimento');
    let dest = document.getElementById('destino');
    let ida = document.getElementById('d_inicio');
    let volta = document.getElementById('d_volta');

    
    //dicionario - Chave:Valor
    pessoa = { "Id": id.value, "Nome": nome.value, "CPF": cpf.value, "DataNasc": nasc.value, "DataIda": ida.value, "DataVolta": volta.value, };
        
    /*Cria um lista "pessoas", armazena no navegador, desconvertendo o JSON para que 
        os dados da lista possam ser lidos (senão o sistema apresentaria como um objeto se discriminar seus atributos) */
    let pessoas = JSON.parse(localStorage.getItem("pessoa"));//aqui a lista ainda está vazia
        
    //Acrescenta o dicionário à lista
    pessoas.push(pessoa);

    //JSON = Java Script Object Notation - Formato (mais leve) que media a troca de informações entre sistemas 
    //Salva um novo elemento na lista e converte para JSON
    localStorage.setItem("pessoa", JSON.stringify(pessoas));
    carregaTabela();
}

function carregaTabela(){
    let tbody = document.getElementById("corpo-tabela");
    let pessoas = JSON.parse(localStorage.getItem("pessoa"));
    tbody.innerHTML = "";//para limpar a visualização da tabela e não duplicar a visualização anterior
    pessoas.forEach(element => {
        tbody.innerHTML += "<tr>"
        + "<td>"+ element[id] +"</td>" 
        + "<td>"+ element[nome] +"</td>"
        + "<td>"+ element[cpf] +"</td>" 
        + "<td>"+ element[nasc] +"</td>" 
        + "<td>"+ element[dest] +"</td>" 
        + "<td>"+ element[ida] +"</td>"
        + "<td>"+ element[volta] +"</td>"
        + "<tr>";
    });
}
    
