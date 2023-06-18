package testRailIntegration;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestRailAccount {

    public static APIClient testRailApiClient() throws IOException {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/testrail.properties");


        String baseUrl = prop.getProperty("baseUrl");
        String usernameTestRail = prop.getProperty("usernameTestRail");
        String passwordTestRail = prop.getProperty("passwordTestRail");

        APIClient client = new APIClient(baseUrl);
        client.setUser(usernameTestRail);
        client.setPassword(passwordTestRail);

        return client;
    }



    public static Properties readPropertiesFile(String fileName) throws IOException {

        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }
}
