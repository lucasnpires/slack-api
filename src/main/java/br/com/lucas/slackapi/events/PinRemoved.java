package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import br.com.lucas.slackapi.SlackFile;
import br.com.lucas.slackapi.SlackUser;
import lombok.Data;

@Data
public class PinRemoved implements SlackEvent {

	private final SlackUser sender;
	private final SlackChannel channel;
	private final String timestamp;
	private final SlackFile file;
	private final String message;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.PIN_REMOVED;
	}

}
