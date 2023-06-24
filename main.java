import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //div(10, 0); // первый метод
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        //returnElement(array, 15); // второй метод
        //System.out.println(inputMassage()); // третий метод
        ArrayList<Integer> array_one = new ArrayList<>();
        ArrayList<Integer> array_two = new ArrayList<>();
        array_one.add(8);
        array_one.add(7);
        array_one.add(6);
        array_one.add(5);
        array_one.add(4);

        array_two.add(4);
        array_two.add(3);
        array_two.add(2);
        array_two.add(1);
        System.out.println(diffArrays(array_one, array_two));


    }

    public int div (int a, int b){
        return a/b;
    }

    public void returnElement(ArrayList<Integer> var, int a){
        System.out.println(var.get(a));
    }

    public int inputMassage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int message = scanner.nextInt();
        return message;
    }

    public static ArrayList<Integer> diffArrays(ArrayList<Integer> first_array, ArrayList<Integer> sec_array){
        ArrayList<Integer> newArray = new ArrayList<>();
        int val;
        if (first_array.size() != sec_array.size()){
            throw new RuntimeException("Ошибка: Размер массиов отличается");
        }
        for (int i = 0; i < first_array.size(); i++) {
            val = first_array.get(i) - sec_array.get(i);
            newArray.add(val);
        }
        return newArray;
    }
}
