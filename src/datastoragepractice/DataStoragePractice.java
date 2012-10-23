package datastoragepractice;

import java.util.*;

/**
 *
 * @author Sean Ennis
 */
public class DataStoragePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lab 1
        System.out.println("////////Lab 1/////////");
        List hobbies = new ArrayList();

        hobbies.add("Video Games");
        hobbies.add("Listening to Music");
        hobbies.add("Hanging out With Friends");

        for (int i = 0; i < hobbies.size(); i++) {
            String s = (String) hobbies.get(i);
            System.out.println(s);
        }

        //Lab 2
        System.out.println("////////Lab 2/////////");
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee("Axew", 5);
        Employee employee2 = new Employee("Blastoise", 36);
        Employee employee3 = new Employee("Charizard", 20);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Object o : employees) {
            System.out.println(o);
        }

        //Lab 3
        System.out.println("////////Lab 3/////////");
        List random = new ArrayList();

        Employee employee4 = new Employee("Mewtwo", 100);
        Dog dog1 = new Dog("Fred", 7);
        Employee employee5 = new Employee("Mew", 99);
        Dog dog2 = new Dog("Joe", 3);

        random.add(employee4);
        random.add(dog1);
        random.add(employee5);
        random.add(dog2);

        for (Object x : random) {
            System.out.println(x);
        }

        //Lab 4
        System.out.println("////////Lab 4/////////");
        List<Object> employees2 = new ArrayList<Object>();

        Employee employee6 = new Employee("Axew", 5);
        Employee employee7 = new Employee("Blastoise", 36);
        Employee employee8 = new Employee("Axew", 5);

        employees2.add(employee6);
        employees2.add(employee7);
        employees2.add(employee8);

        System.out.println("Displaying contents of list...");
        for (Object item : employees2) {
            System.out.println(item);
        }

        Set<Object> blah = new HashSet<Object>(employees2);

//       blah.add(employee6);
//       blah.add(employee7);
//       blah.add(employee8);

        employees2.clear();
        employees2.addAll(blah);

        System.out.println("\nDisplaying contents of set...");

        for (Object o : blah) {
            System.out.println(o);
        }
        
        List<Object> fl = new ArrayList<Object>(blah);
        
        System.out.println("\nDisplaying final list...");
        for (Object o : fl) {
            System.out.println(o);
        }
        
    }
}
