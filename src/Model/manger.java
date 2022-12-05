package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class manger {
    Scanner scanner = new Scanner(System.in);
private List<Person> personList = new ArrayList<>();

public void  add(int type){
    switch (type){
        case 1:
            Student st =new Student();
            st.Input(personList);
            personList.add(st);
            break;
        case 2:
            teacher tc = new teacher();
            tc.Input(personList);
            personList.add(tc);
            break;
    }
}
public void Show(){
    for (Person person:personList)
        if (person instanceof Student){
            Student st = (Student) person;
            System.out.println(st.toString());
        }
    else{
        teacher tc = (teacher) person;
            System.out.println(tc.toString());
        }
}
public void AVG(){
    for (Person person:personList)
        if(person instanceof Student){
            Student st = (Student) person;
            double AVG = (st.getMark1()+st.getMark2())/2;
            System.out.println(AVG);
        }
}
public void salary(){
    teacher tc = (teacher) personList;
    double salary1 = tc.getNumberWorkDay()*800000;
    System.out.println(salary1);
}
public manger(List<Person> personList){
this.personList = personList;
}


}
