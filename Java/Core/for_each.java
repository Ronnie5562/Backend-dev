class Students {
    int rollnum;
    String name;
    int marks;
}

public class for_each {
    // in this class, I used the for each loop in Java - Most people also call it enhanced for loop 🤔💭
    // Here is the syntax :

        // for (type varible : iterable) {
            // Use each varible to do something!!
        // }


    public static void main(String args[]) {
        Students Raymond = new Students();
        Raymond.rollnum = 1;
        Raymond.name = "Raymond";
        Raymond.marks = 90;

        Students Sharon = new Students();
        Sharon.rollnum = 2;
        Sharon.name = "Sharon";
        Sharon.marks = 94;

        Students Titi = new Students();
        Titi.rollnum = 3;
        Titi.name = "Titi";
        Titi.marks = 88;

        Students Jackson = new Students();
        Jackson.rollnum = 4;
        Jackson.name = "Jackson";
        Jackson.marks = 80;

        Students studentsArray[] = new Students[] {Raymond, Sharon, Titi, Jackson};

        for (Students person : studentsArray) {
            System.out.println("Roll Number: " + person.rollnum);
            System.out.println("Name: " + person.name);
            System.out.println("Marks: " + person.marks);
            System.out.println(); // Blank line for output separation
        }
    }
}
