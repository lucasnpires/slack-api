package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import br.com.lucas.slackapi.SlackUser;
import lombok.Data;

@Data
public class SlackChannelArchived implements SlackEvent {
	private final SlackChannel slackChannel;
	private final SlackUser slackuser;

	public SlackUser getUser() {
		return slackuser;
	}

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_CHANNEL_ARCHIVED;
	}

}
