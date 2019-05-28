package br.com.lucas.slackapi.replies;

public class SlackUserPresenceReply extends SlackReplyImpl implements ParsedSlackReply {
    private final boolean active;

    public SlackUserPresenceReply(boolean ok, String error, boolean active)
    {
        super(ok, error);
        this.active = active;
    }

    public boolean isActive()
    {
        return active;
    }
}
