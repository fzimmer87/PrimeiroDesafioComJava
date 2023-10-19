package org.zoo;

public abstract class Animal {

    private String nome;
    private String nomeSom;

    public Animal (String nome, String nomeSom){
        this.nome = nome;
        this.nomeSom = nomeSom;

    }

    public String getNome() {
        return this.nome;

    }
    public String getNomeSom() {
        return this.nomeSom;
    }

    public void emitirsom() {
        System.out.println(" O animal: " +this.nome+ " emite o som: " +this.nomeSom);
    }

    public abstract void emitirSom();
}
