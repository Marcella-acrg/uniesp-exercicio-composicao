package tech.marcellaacrg.entity;

import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {

    private String codigo;
    private Profissao profissao;

    public Cliente(){
    }

    public Cliente(String nome, Date dataDeNascimento, Endereco endereco, List<Telefone> telsContato, String codigo, Profissao profissao) {
        super(nome, dataDeNascimento, endereco, telsContato);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
