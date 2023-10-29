package tech.marcellaacrg.entity;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
    private Integer matricula;
    private Cargo cargo;
    private float salario;
    private Date dataAdmissao;

    public Funcionario(){
    }

    public Funcionario(String nome, Date dataDeNascimento, Endereco endereco, List<Telefone> telsContato, Integer matricula, Cargo cargo, float salario, Date dataAdmissao) {
        super(nome, dataDeNascimento, endereco, telsContato);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Double reajustarSalario (double salario) {
        return salario * 1.3;
    }

    public String promover (String novoCargo) {
        return novoCargo;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
