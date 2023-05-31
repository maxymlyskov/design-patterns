package adapter;

import adapter.Gmail.GmailClient;

public class Main {

    public static void main(String[] args) {
        var emailClient = new EmailClient();

        emailClient.addProvider(new GmailAdapter( new GmailClient()));

        emailClient.downloadEmails();
    }
}
