package br.com.lucas.slackapi;

@Deprecated
public interface SlackMessageListener {
    void onSessionLoad(SlackSession session);
    void onMessage(SlackMessage message);
}
