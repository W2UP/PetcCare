package controller;

import model.Pet;
import service.PetService;
import java.util.List;

public class PetController {
    private PetService petService = new PetService();

    public void cadastrarPet(String nome, String especie, int idade) {
        Pet pet = new Pet(nome, especie, idade);
        petService.adicionarPet(pet);
    }

    public List<Pet> getTodosPets() {
        return petService.listarPets();
    }
}
