package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import br.com.lucas.slackapi.SlackUser;
import lombok.Data;

@Data
public class ReactionAdded implements SlackEvent {

	private final String emojiName;
	private final SlackUser user;
	private final SlackUser itemUser;
	private final SlackChannel channel;
	private final String messageID;
	private final String fileID;
	private final String fileCommentID;
	private final String timestamp;

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.REACTION_ADDED;
	}
}
