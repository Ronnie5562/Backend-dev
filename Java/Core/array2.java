class Students {
    int rollnum;
    String name;
    int marks;
}

public class array2 {
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


        for (int i = 0; i < studentsArray.length; i++) {
            System.out.println(studentsArray[i]);
        }
    }
}