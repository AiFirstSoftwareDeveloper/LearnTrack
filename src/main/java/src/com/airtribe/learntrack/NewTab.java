package src.com.airtribe.learntrack;

import src.com.airtribe.learntrack.exception.UnAuthorizedException;
import src.com.airtribe.learntrack.ui.Airtribe;

public class NewTab {
    static void main() throws UnAuthorizedException {
        Airtribe airtribe = Airtribe.getInstance();
        airtribe.runAirtribe();
    }
}
