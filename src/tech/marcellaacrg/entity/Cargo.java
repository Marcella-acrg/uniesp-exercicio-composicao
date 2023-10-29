package tech.marcellaacrg.entity;

public class Cargo {
    private String nomeCargo;
    private int cbo;
    private String departamento;

    public Cargo(){
    }

    public Cargo(String nomeCargo, int cbo, String departamento) {
        this.nomeCargo = nomeCargo;
        this.cbo = cbo;
        this.departamento = departamento;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public int getCbo() {
        return cbo;
    }

    public void setCbo(int cbo) {
        this.cbo = cbo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
