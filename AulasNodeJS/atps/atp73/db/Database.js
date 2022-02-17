import Sequelize from 'sequelize';

const Database = new Sequelize(
    'postgres', // database
    'postgres', // user
    'fla169', // 
    {
        host: 'localhost', 
        port: 5432, // porta do postgres
        dialect: 'postgres'
    }
);

export default Database;