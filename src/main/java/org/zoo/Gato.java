package org.zoo;

public class Gato extends Animal {

    public Gato (String nome, String nomeSom) {
        super (nome, nomeSom);

    }
    @Override
    public void emitirSom(){
        System.out.println(" O gato: " +getNome()+ " emite o som: " +getNomeSom());
    }

    }
