package utils;

import lombok.experimental.UtilityClass;

import java.io.File;

import static aquality.selenium.browser.AqualityServices.getBrowser;

@UtilityClass
public class BrowserUtils {

    public boolean isFileDownloaded(String fileName) {
        String downloadDirectory = getBrowser().getDownloadDirectory();
        File file = new File(downloadDirectory + File.separator + fileName);
        return file.exists();
    }
}
