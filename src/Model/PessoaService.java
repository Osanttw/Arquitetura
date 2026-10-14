package Model;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {
private static int id = 1;
    List<Pessoa> banco = new ArrayList<>();
    // cadastrar

    public void cadastrarPessoa(String nome, String email){
        Pessoa pessoa = new Pessoa(id++,nome,email);
        banco.add(pessoa);

    }
    // listas
    public List<Pessoa> listPessoa(){
        return banco;
    }

    public void deletePessoa(int id){
        for (Pessoa p : banco){
             if(p.getId() == id){
                banco.remove(p);
                        IO.println("Pessoa removida chefe");
            }
        }
    }


}
