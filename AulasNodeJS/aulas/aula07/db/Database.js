import Sequelize from 'sequelize';

const Database = new Sequelize(
    'postgres', // database
    'postgres', // user
    '123456', // senha do prof
    {
        host: '192.168.0.18', // endereco do server do prof
        port: 5432, // porta do postgresdo do prof
        dialect: 'postgres'
    }
);

export default Database;