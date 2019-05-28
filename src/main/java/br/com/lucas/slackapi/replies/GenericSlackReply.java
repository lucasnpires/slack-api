package br.com.lucas.slackapi.replies;

public class GenericSlackReply implements SlackReply {
    private String obj;

    public GenericSlackReply(String obj)
    {
        this.obj = obj;
    }

    public String getPlainAnswer()
    {
        return obj;
    }

}
