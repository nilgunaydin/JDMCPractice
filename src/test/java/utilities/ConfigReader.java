package utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

static {
    try {
        FileInputStream fis = new FileInputStream("configuration.properties");
        properties = new Properties();
        properties.load(fis);
        fis.close();
    } catch (IOException e) {
        e.printStackTrace();
    }


}
public static String getProperty(String key) {


    return properties.getProperty(key);
}

}
