package tech.marcellaacrg.entity;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class Pessoa {
    private String nome;
    private Date dataDeNascimento;
    private Endereco endereco;
    private List<Telefone> telsContato;

    public Pessoa(){
    }

    public Pessoa(String nome, Date dataDeNascimento, Endereco endereco, List<Telefone> telsContato) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public String cadastrar (String nome, String dataDeNascimento, String endereco, String telsContato){
        System.out.println("Pessoa cadastrada com sucesso: ");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone de contato: " + telsContato);
        return nome;
    }

    public String obterIdade(int dia, int mes, int ano) {
        LocalDate hoje = LocalDate.now();
        int idade = (int) ChronoUnit.YEARS.between(LocalDate.of(ano, mes, dia), hoje);
        // se nasceu em 29/02 e hoje é 28/02 (e o ano não é bissexto), soma 1 na idade
        if (dia == 29 && mes == 2 && hoje.getDayOfMonth() == 28
                && hoje.getMonthValue() == 2 && !Year.isLeap(hoje.getYear()))
            idade++;
        return String.valueOf(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(List<Telefone> telsContato) {
        this.telsContato = telsContato;
    }
}
