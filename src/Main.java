import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String qqual(int Age1, int Mass1, int Age2, int Mass2){
        String a;
        if(Age1 == Age2 && Mass1 == Mass2){

            a = "ну у тебя шиза а еще собака явно одна";
        }
        else {
            a = "получается собаки 2))";
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("у тебя есть 2 стула... расскажи мне о них(все только в целых числах)");
        Dog pet = new Dog(); //собака 1
        System.out.println("enter name:");
        pet.setName(bR.readLine());
        System.out.println("enter type:");
        pet.setType(bR.readLine());
        System.out.println("enter age:");
        pet.setAge(Integer.parseInt(bR.readLine()));
        System.out.println("enter mass:");
        pet.setMass(Integer.parseInt(bR.readLine()));
        System.out.println("введи имя другой собаки");
        Dog pet1 = new Dog(); //собака 2
        System.out.println("enter name:");
        pet1.setName(bR.readLine());
        System.out.println("enter type:");
        pet1.setType(bR.readLine());
        System.out.println("enter age:");
        pet1.setAge(Integer.parseInt(bR.readLine()));
        System.out.println("enter mass:");
        pet1.setMass(Integer.parseInt(bR.readLine()));
        String j = qqual(pet.getAge(), pet.getMass(),pet1.getAge(), pet1.getMass());
        System.out.println(j);
    }
}