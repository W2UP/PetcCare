package service;

import model.Pet;
import java.util.ArrayList;
import java.util.List;

public class PetService {
    private List<Pet> pets = new ArrayList<>();

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> listarPets() {
        return pets;
    }
}
