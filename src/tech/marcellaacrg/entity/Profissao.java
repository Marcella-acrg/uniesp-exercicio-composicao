package tech.marcellaacrg.entity;

public class Profissao {
    private String nomeProfissao;

    public Profissao(){
    }

    public Profissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }

    public String getNomeProfissao() {
        return nomeProfissao;
    }

    public void setNomeProfissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }
}
