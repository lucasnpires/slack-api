package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import lombok.Data;
import lombok.NonNull;

@Data
public class SlackChannelLeft implements SlackEvent {
	@NonNull
	private SlackChannel slackChannel;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_CHANNEL_LEFT;
	}

}
