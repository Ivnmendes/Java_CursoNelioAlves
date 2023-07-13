package exercicio;

public class Pensionato {
    private String nome;
    private String email;
    private int quarto;

    public Pensionato(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "Pensao " + quarto + "\n"
                + "Dono: " + nome + "\n"
                + "Email: " + email;
    }
    
    
}
