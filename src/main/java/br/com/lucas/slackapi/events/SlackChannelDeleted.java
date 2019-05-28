package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import lombok.Data;

@Data
public class SlackChannelDeleted implements SlackEvent {
	private final SlackChannel slackChannel;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_CHANNEL_DELETED;
	}
}
