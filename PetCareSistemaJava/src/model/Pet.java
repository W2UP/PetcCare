package model;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String nome;
    private String especie;
    private int idade;
    private List<RegistroVacina> registrosVacina = new ArrayList<>();

    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método para registrar as Vacinas
    public void setRegistrosVacina(List<RegistroVacina> registrosVacina) {
        this.registrosVacina = registrosVacina;
    }
    //Método para adicina-las
    public void adicionarRegistroVacina(RegistroVacina registro) {
        registrosVacina.add(registro);
    }

    public List<RegistroVacina> getRegistrosVacina() {
        return registrosVacina;
    }
}
