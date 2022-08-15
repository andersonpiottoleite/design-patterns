package br.com.bb.designpatterns.builder;

public class TesteAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNome("Spike");
        animal.setDono("Josefa");
        animal.setRaca("Dulldoog");

        System.out.println(animal.getNome());
        System.out.println(animal.getDono());
        System.out.println(animal.getRaca());

        System.out.println(animal);

        Animal animal2 = new Animal("Rex", "Paulo", "Pastor Alemão");
        System.out.println(animal2);

        Animal animal3 = Animal.builder()
                .nome("Totó")
                .dono("Thiago")
                .raca("Pitbull")
                .build();

        System.out.println(animal3);

        String s = new StringBuilder()
                .append("palavra")
                .append("palavra")
                .append("palavra")
                .append("palavra")
                .append("palavra")
                .append("palavra").toString();

    }
}
