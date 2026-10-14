import Controller.PessoaController;
import Model.PessoaService;
void main() {

      PessoaService service = new PessoaService();
      PessoaController controller = new PessoaController(service);

      controller.cadatrar();

      IO.println(controller.mostrar());

      controller.deletar(1);


      }
