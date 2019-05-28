package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import lombok.Data;

@Data
public class SlackMessageDeleted implements SlackEvent {
	private final SlackChannel channel;
	private final String messageTimestamp;
	private final String deleteTimestamp;

	public String getTimeStamp() {
		return deleteTimestamp;
	}

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_MESSAGE_DELETED;
	}

}
