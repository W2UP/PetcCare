package model;

import java.time.LocalDate;

public class RegistroVacina {
    private Pet pet;
    private Vacina vacina;
    private LocalDate dataAplicacao;

    public RegistroVacina(Pet pet, Vacina vacina, LocalDate dataAplicacao) {
        this.pet = pet;
        this.vacina = vacina;
        this.dataAplicacao = dataAplicacao;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    @Override
    public String toString() {
        return "Vacina: " + vacina.getNome() +
               ", Data: " + dataAplicacao;
    }
}
