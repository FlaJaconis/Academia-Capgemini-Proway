package aula32Javaio_Dao.P3;

public class Controller implements IController {

    public String salvar(String dado) {
        return "Dado: "+ dado + " salvo com sucesso!";
    }
    
}
