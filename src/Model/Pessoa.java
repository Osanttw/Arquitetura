package Model;

public class Pessoa {
    private int id;
    private String nome;
    private String email;

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Pessoa(int id, String nome, String email) {

        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }




}