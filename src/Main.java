import Model.Person;
import Model.Student;
import Model.manger;
import Menu.menu;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose;
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        manger mn = new manger(personList);
        Student st = new Student();
        do{
            menu.menu();
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    mn.add(1);
                    break;
                case 2:
                    mn.add(2);
                    break;
                case 3:
                    mn.Show();
                    break;
                case 5:
                    mn.AVG();
                    break;
                case 6:
                    mn.salary();
                    break;
            }


        }
        while (choose!=5);
    }
}