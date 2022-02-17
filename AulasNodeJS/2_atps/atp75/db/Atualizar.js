import Database from "./Database.js";
import ContaTable from "./ClienteTable.js";


Database
    .sync()
    .then( ()=> console.log('Sincronizado o Database...'))
    .catch( ()=> console.log('Erro!'));