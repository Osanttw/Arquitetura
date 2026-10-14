package Controller;

import Model.PessoaService;

import java.util.List;

public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public void cadatrar() {

        pessoaService.cadastrarPessoa("tralaleiro", "traleleiro@gmail.com");


    }

    public List<?> mostrar() {
        return pessoaService.listPessoa();
    }

    public void deletar(int id){
        pessoaService.deletePessoa(id);
    }
}