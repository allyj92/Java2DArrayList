import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ArrayList<ArrayList<String>> groceryList = new ArrayList();
//
//
//        ArrayList<String> bakeryList = new ArrayList<>();
//        bakeryList.add("pasta");
//        bakeryList.add("garlic bread");
//        bakeryList.add("donuts");
//
//        ArrayList<String> produceList = new ArrayList<>();
//        produceList.add("tomatoes");
//        produceList.add("zucchini");
//        produceList.add("peppers");
//
//        ArrayList<String> drinksList = new ArrayList<>();
//        drinksList.add("soda");
//        drinksList.add("coffee");
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinksList);
//
//        System.out.println(groceryList.get(1).get(1));
//
//        // remove bakeryList
//        groceryList.remove(0);
//        groceryList.get(0).add("potatoes");
//        groceryList.get(1).add(1,"tea");
//        System.out.println(groceryList);


    ArrayList<ArrayList<String>> studentList = new ArrayList<>();

    ArrayList<String> student1 = new ArrayList();
    student1.add("Jhon");
    student1.add("Math");
    student1.add("Science");
    student1.add("History");
    System.out.println(student1);

    ArrayList<String> student2 = new ArrayList<>();
    student2.add("Emily");
    student2.add("English");
    student2.add("Art");
    System.out.println(student2);


    studentList.add(student1);
    studentList.add(student2);

    System.out.println(studentList);

    


    }
}