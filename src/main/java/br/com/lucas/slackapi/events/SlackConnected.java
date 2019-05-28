package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackPersona;
import lombok.Data;

@Data
public class SlackConnected implements SlackEvent {
	private final SlackPersona slackConnectedPersona;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_CONNECTED;
	}
}
