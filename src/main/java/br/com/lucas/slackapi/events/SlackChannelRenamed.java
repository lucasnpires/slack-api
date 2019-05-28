package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import lombok.Data;

@Data
public class SlackChannelRenamed implements SlackEvent {
	private final SlackChannel slackChannel;
	private final String newName;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_CHANNEL_RENAMED;
	}

}
