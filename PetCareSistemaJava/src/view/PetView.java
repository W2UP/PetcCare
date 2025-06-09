package view;

import model.Pet;
import model.RegistroVacina;


import controller.PetController;
import java.util.Scanner;

public class PetView {
    private PetController petController = new PetController();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        System.out.println("Digite o nome do pet:");
        String nome = scanner.nextLine();
        System.out.println("Digite a espécie:");
        String especie = scanner.nextLine();
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        petController.cadastrarPet(nome, especie, idade);
        System.out.println("Pet cadastrado com sucesso!");
    
    }

     public void mostrarHistoricoVacinas(Pet pet) {
        System.out.println("Histórico de vacinas do pet: " + pet.getNome());
        for (RegistroVacina registro : pet.getRegistrosVacina()) {
            System.out.println(registro);
        }
    }
}
