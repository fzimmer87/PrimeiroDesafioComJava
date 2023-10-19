package org.zoo;

public class Main {

    public static void main (String[]args) {
        Cachorro animalCachorro = new Cachorro( "Rex", "Au Au.");
        Gato animalGato = new Gato("Felix ", "miau");
        //animalCachorro.emitirsom();
        //animalGato.emitirSom();

        Veterinario veterinario = new Veterinario();
        veterinario.examinarAnimal(animalCachorro);
        veterinario.examinarAnimal(animalGato);

        }




    }

