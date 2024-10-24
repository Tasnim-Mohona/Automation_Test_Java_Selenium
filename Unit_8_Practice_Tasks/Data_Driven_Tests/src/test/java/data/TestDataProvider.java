package data;

import org.testng.annotations.DataProvider;


public class TestDataProvider {

    @DataProvider(name="testdata")
    public Object[][] TestDataFeed(){

// Create object array with 2 rows and 2 column- first parameter is row and second is //column
        Object [][] twitterdata = new Object[2][2];
// Enter data to row 0 column 0
        twitterdata[0][0] = "username1@gmail.com";
// Enter data to row 0 column 1
        twitterdata[0][1] = "Password1";
// Enter data to row 1 column 0
        twitterdata[1][0] = "username2@gmail.com";
// Enter data to row 1 column 0
        twitterdata[1][1] = "Password2";
// return arrayobject to testscript
        return twitterdata;
    }
}
