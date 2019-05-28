package br.com.lucas.slackapi.replies;

public interface ParsedSlackReply extends SlackReply {
    boolean isOk();
    String getErrorMessage();
}
