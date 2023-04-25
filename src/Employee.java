import java.sql.SQLOutput;

public class Employee {
    int salary = 50000;
}
    class labour extends Employee {
        int bonus = 10000;

        public static void main(String[] args) {
            labour l = new labour();
            System.out.println("salary is:"+ l.salary);
            System.out.println("bonus is:"+ l.bonus);
            System.out.println("monthly full salary is:"+ (l.salary + l.bonus));
            System.out.println("anual salary is"+(l.salary + l.bonus)*12);

        }

    }

