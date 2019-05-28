package br.com.lucas.slackapi.replies;


import br.com.lucas.slackapi.SlackChannel;

public class SlackChannelReply extends SlackReplyImpl implements ParsedSlackReply {
    private SlackChannel slackChannel;

    public SlackChannelReply(boolean ok, String error, SlackChannel slackChannel)
    {
        super(ok,error);
        this.slackChannel = slackChannel;
    }

    public SlackChannel getSlackChannel()
    {
        return slackChannel;
    }
}
