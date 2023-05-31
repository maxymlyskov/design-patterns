package facade;

import java.util.List;

public class TweetService {
    String appKey;
    String appSecret;

    public TweetService(String appKey,String appSecret){
        this.appKey = appKey;
        this.appSecret = appSecret;
    }
    public List<Tweet> getTweets(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    }
}
