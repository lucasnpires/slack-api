package br.com.lucas.slackapi.samples.connection;

import java.io.IOException;

import br.com.lucas.slackapi.SlackSession;
import br.com.lucas.slackapi.impl.SlackSessionFactory;

/**
 * This sample code is creating a Slack session and is connecting to slack. To get some more details on
 * how to get a token, please have a look here : https://api.slack.com/bot-users
 */
public class SlackDirectConnectionWithBuilder
{
    public static void main(String[] args) throws IOException
    {
        SlackSession session = SlackSessionFactory.getSlackSessionBuilder("my-bot-auth-token").build();
        session.connect();
    }
}
