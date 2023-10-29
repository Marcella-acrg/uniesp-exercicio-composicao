package tech.marcellaacrg.entity;

public class Telefone {
    private String numero;
    private String ddd;

    public Telefone(){
    }

    public Telefone(String numero, String ddd) {
        this.numero = numero;
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
