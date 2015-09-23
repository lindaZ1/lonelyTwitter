package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by dzhang4 on 9/16/15.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(Date date, String tweet) throws IOException{
        super(date, tweet);
        this.setText(tweet);
        this.date=date;
    }

    public ImportantTweet(String tweet) {
        super(tweet);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    @Override //ensure this method is in superclass
    public String getText() {
        return "!!!" + super.getText();
    }
}
