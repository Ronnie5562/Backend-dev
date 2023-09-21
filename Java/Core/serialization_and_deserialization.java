import java.io.*;

class Alien implements Serializable{
    int id;
    String name;
    int points;

    public Alien(int id, String name, int points){
        this.id = id;
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " - name: " +this.name + " - points: " + this.points;
    }
}

public class serialization_and_deserialization{
    private static String filename = "myAliens.ser";

    public static void serialize() throws IOException{
        Alien shuzi = new Alien(001, "Shuzi", 80);
        Alien shazam = new Alien(002, "shazam", 30);
        Alien buzon = new Alien(003, "buzon", 63);
        Alien harry = new Alien(004, "harry", 23);
        Alien yunti = new Alien(005, "yunti", 95);

        Alien[] aliens = {shuzi, shazam, buzon, harry, yunti};

        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        
        // serialization
        out.writeObject(aliens);

        out.close();
        file.close();

        System.out.println("Object has been serialized");
    }

    public static Alien[] deserialize() throws IOException, ClassNotFoundException{

        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);
        Alien[] object = null;

        // deserialization
        object = (Alien[])in.readObject();

        file.close();
        in.close();

        System.out.println("Object has been deserialized ");
        System.out.println();

        return object;
    }

    public static void main(String[] args){

        try {
            serialization_and_deserialization.serialize();
        } catch (IOException e) {
            System.out.println("IOException was caught during serialization");
        }


        try {
            Alien[] deserializedObject =  serialization_and_deserialization.deserialize();

            for (Alien alien : deserializedObject){
                System.out.println(alien);
            }

        } catch (IOException err) {
            System.out.println("IOException was caught during deserialization");
        } catch (ClassNotFoundException err) {
            System.out.println("ClassNotFoundException was caught during deserialization");
        } catch (Exception err) {
            System.out.println(err + "Something went wrong");
        }
        
    }

    @Override
    public String toString() {
        return "serialization_and_deserialization []";
    }
}
