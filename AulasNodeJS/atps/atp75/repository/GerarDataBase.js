import ClienteTable from "../db/ClienteTable.js";

class GerarDatabase {

    //CRUD

    //read
    async findAll() {
        const lista = await ClienteTable.findAll({ raw: true });
        return lista;
    }

    //create
    async create(model) {
        return await ClienteTable.create(model);
    }

     //update
    async update(model) {
        return await ClienteTable.update(model, {
            where: { id: model.id }
        });
    }

    //delete
    async delete(id) {
        return await ClienteTable.destroy({
            where: { id:parseInt(id)}
        });
    }

}

export default GerarDatabase;
