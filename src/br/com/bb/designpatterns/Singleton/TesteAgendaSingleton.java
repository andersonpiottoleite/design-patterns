package br.com.bb.designpatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*System.out.println(AgendaSingletonEAGER.getINSTANCE());
        System.out.println(AgendaSingletonEAGER.getINSTANCE());*/

        /*System.out.println(AgendaSingletonLAZY.getInstance());
        System.out.println(AgendaSingletonLAZY.getInstance());

        Constructor<AgendaSingletonLAZY> constructorMaldoso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        constructorMaldoso.setAccessible(Boolean.TRUE);
        AgendaSingletonLAZY agendaSingletonLAZYMaldoso = constructorMaldoso.newInstance();

        System.out.println(agendaSingletonLAZYMaldoso);

        reservaDiaLAZY("Segunda");
        reservaDiaLAZY("Terca");*/

        System.out.println(AgendaSingletonEnum.getInstance().hashCode());
        System.out.println(AgendaSingletonEnum.getInstance().hashCode());

        /*Constructor<AgendaSingletonEnum> constructorMaldoso = AgendaSingletonEnum.class.getDeclaredConstructor();
        constructorMaldoso.setAccessible(Boolean.TRUE);
        AgendaSingletonEnum agendaSingletonEnumMaldoso = constructorMaldoso.newInstance();
        System.out.println(agendaSingletonEnumMaldoso);*/

        reservaDiaEnum("Segunda");
        reservaDiaEnum("Terca");


    }

    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum agendaSingletonEnum = AgendaSingletonEnum.getInstance();
        agendaSingletonEnum.ocupa(dia);
        System.out.println(agendaSingletonEnum.getDiasDisponiveis());
    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agendaSingletonEAGER = AgendaSingletonEAGER.getINSTANCE();
        agendaSingletonEAGER.ocupa(dia);
        System.out.println(agendaSingletonEAGER.getDiasDisponiveis());
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agendaSingletonLAZY = AgendaSingletonLAZY.getInstance();
        agendaSingletonLAZY.ocupa(dia);
        System.out.println(agendaSingletonLAZY.getDiasDisponiveis());
    }
}
