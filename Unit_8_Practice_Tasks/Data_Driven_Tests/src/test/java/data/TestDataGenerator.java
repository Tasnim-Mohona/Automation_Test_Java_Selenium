package data;

import org.testng.annotations.DataProvider;

public class TestDataGenerator {
    @DataProvider(name ="textBoxTest")
//    @DataProvider // no name means using method name
    public Object[][] getTextBoxData() {
        return new Object[][] {
                {"Tasnim Mohona", "q.mohona@example.com"},
                {"Sveltana", "sveltana.smith@example.com"},
                {"Sergey", "sergey.johnson@example.com"}
        };
    }
}
