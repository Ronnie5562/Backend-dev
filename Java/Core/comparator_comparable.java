import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
	int age;
    int grade;
	String name;
    static int num_of_students;
	
	public Student(int age, int grade, String name)
	{
		this.age = age;
		this.name = name;
        this.grade = grade;
        num_of_students += 1;
	}
	
    @Override
	public String toString() {
		// return "Student [age=" + age + ", name=" + name + "]";
		return (name + " : [age=" + age + ", grade=" + grade + "]");
	}

	public int CompareAge(Student other)
	{
		if(this.age > other.age)
			return 1;
		else
			return -1;
	}

    @Override
    public int compareTo(Student Other) {
        // if (this.grade > Other.grade)
        //     return 1;
        // else
        //     return -1;
        return 0;
    }

    
}


public class comparator_comparable {

    public static void compare_strings(){
        // Comparator is an interface in which we can specify our own rules for sorting values;
        Comparator<String> com = new Comparator<String>() {
            public int compare(String x, String y){
                if (x.length() > y.length()) // From shortest to longest ==> In terms of string length
                    return 1;
                else
                    return -1;
            }
        };

        List<String> names = new ArrayList<>();
        names.add("Abimbola");
        names.add("Sharon");
        names.add("Benita");
        names.add("Richard");
        names.add("Ronald");
        names.add("Tintu");
        names.add("Starboy");
        names.add("Enny");

        Collections.sort(names, com); // The rule (com) is passed in as a second parameter to Colletions.sort();

        System.out.println(names);
    }

    public static void compare_students_grade(){
        Comparator<Student> com = (A, B) -> A.grade < B.grade ? 1 : -1; // This is possible because `Comparator` is a functionalInterface

        List<Student> Studs = new ArrayList<>();
        Studs.add(new Student(18, 83, "Sophia"));
        Studs.add(new Student(20, 71, "Ethan"));
        Studs.add(new Student(22, 76, "Olivia"));
        Studs.add(new Student(23, 79, "Liam"));
        Studs.add(new Student(19, 89, "Ava"));
        Studs.add(new Student(21, 85, "Noah"));
        Studs.add(new Student(18, 92, "Isabella"));
        Studs.add(new Student(24, 68, "Mason"));
        Studs.add(new Student(19, 78, "Lucas"));
        Studs.add(new Student(17, 67, "Kiara"));

        Collections.sort(Studs, com);

        for (Student Stud : Studs){
            switch (Studs.indexOf(Stud)) {
                case 0 -> System.out.println(Stud + "  ==> First Position");
                case 1 -> System.out.println(Stud + "  ==> Second Position");
                case 2 -> System.out.println(Stud + "  ==> Third Position");
                default -> System.out.println(Stud);
            }
        }
    }
    public static void main(String[] args) {
        comparator_comparable.compare_strings();

        System.out.println();

        comparator_comparable.compare_students_grade();
    }
}
