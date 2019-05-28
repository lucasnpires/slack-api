package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackPersona;
import lombok.Data;

@Data
public class SlackDisconnected implements SlackEvent {
	private final SlackPersona persona;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_DISCONNECTED;
	}
}
