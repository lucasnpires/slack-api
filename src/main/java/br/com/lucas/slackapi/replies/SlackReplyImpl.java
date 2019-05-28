package br.com.lucas.slackapi.replies;

public class SlackReplyImpl implements ParsedSlackReply {

    private boolean ok;
    private String error;

    public SlackReplyImpl(boolean ok, String error) {
        this.ok = ok;
        this.error = error;
    }

    @Override
    public boolean isOk()
    {
        return ok;
    }

    @Override
    public String getErrorMessage()
    {
        return error;
    }
}
