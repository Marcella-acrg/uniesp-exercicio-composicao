package tech.marcellaacrg.entity;

public class Endereco {
    private String nomeRua;
    private String cep;
    private int numero;

    public Endereco(){
    }

    public Endereco(String nomeRua, String cep, int numero) {
        this.nomeRua = nomeRua;
        this.cep = cep;
        this.numero = numero;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "nomeRua='" + nomeRua + '\'' +
                ", cep='" + cep + '\'' +
                ", numero=" + numero +
                '}';
    }
}
