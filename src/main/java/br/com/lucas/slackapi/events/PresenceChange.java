package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackPersona;
import lombok.Data;

@Data
public class PresenceChange implements SlackEvent {
	private final String userId;
	private final SlackPersona.SlackPresence presence;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.PRESENCE_CHANGE;
	}
}
