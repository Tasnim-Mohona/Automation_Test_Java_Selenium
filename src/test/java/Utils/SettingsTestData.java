package Utils;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import com.google.gson.Gson;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SettingsTestData {
    private final ISettingsFile ENVIRONMENT_CONFIG = new JsonSettingsFile("env.json");
    private final Gson GSON = new Gson();

    public final String RESOURCES_PATH = "src/test/resources/";
    public final String TEST_DATA_PATH = RESOURCES_PATH + "testdata/";


    private final String ENVIRONMENT_PATH = RESOURCES_PATH + "environment/";
    private final String USER_FILE_PATH = TEST_DATA_PATH +  "userData.json";
    private final String DATA_TABLE_FILE_PATH = TEST_DATA_PATH + "fileData.json";

    private String getCurrentEnvironment(){
        return ENVIRONMENT_CONFIG.getValue("/env").toString();
    }

    public EnvData getEnvData(){
        String envConfigPath = String.format("%s%s.json", ENVIRONMENT_PATH, getCurrentEnvironment());
        return deserializeJson(USER_FILE_PATH, UserData.class);
    }


}
