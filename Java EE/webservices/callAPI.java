// Calling APIs in java
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.management.RuntimeErrorException;

public class callAPI {
    public static void main(String[] args) {
        try {
            URL url =new URL("https://reqres.in/api/users");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            String input = "{\"name\": \"Ronnie\", \"job\": \"Software Engineer\"}";
            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeErrorException(null, "Failed" + conn.getResponseCode());
            }

            // InputStream in;
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String output;
            System.out.println("Response Code: " + conn.getResponseCode());
            System.out.println("Response from API: ");

            while ((output=br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}