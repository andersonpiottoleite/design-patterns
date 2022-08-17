package br.com.bb.designpatterns.exemploreflection;

import java.lang.reflect.Constructor;

public class ClasseExemplo {
    String atributo1;
    Integer atributo2;

    public ClasseExemplo(){}

    public ClasseExemplo(String atributo1) {
        this.atributo1 = atributo1;
    }

    public ClasseExemplo(String atributo1, Integer atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public ClasseExemplo(String atributo1, Integer atributo2, Boolean atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Constructor<ClasseExemplo> constructor1 = ClasseExemplo.class.getDeclaredConstructor();
        System.out.println(constructor1);

        Constructor<ClasseExemplo> constructor2 = ClasseExemplo.class.getDeclaredConstructor(String.class);
        System.out.println(constructor2);

        Constructor<ClasseExemplo> constructor3 = ClasseExemplo.class.getDeclaredConstructor(String.class, Integer.class);
        System.out.println(constructor3);

        Constructor<ClasseExemplo> constructor4 = ClasseExemplo.class.getDeclaredConstructor(String.class, Integer.class, Boolean.class);
        System.out.println(constructor4);

        System.out.println("-----------------------------------------");

        Constructor<?>[] constructors = ClasseExemplo.class.getConstructors();

        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
        }
    }
}
