window.onload = function(){
        let pessoa = [];
        localStorage.setItem("pessoa", JSON.stringify(pessoas));// inicialmente carrega lista vazia
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
