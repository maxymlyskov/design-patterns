package facade;

public class Demo {
  public static void show() {
    var tweetService = new TweetService("asd", "dasd");

    System.out.println(tweetService.getTweets());
  }
}
