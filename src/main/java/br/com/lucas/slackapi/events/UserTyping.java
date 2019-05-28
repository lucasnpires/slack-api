package br.com.lucas.slackapi.events;

import br.com.lucas.slackapi.SlackChannel;
import br.com.lucas.slackapi.SlackUser;

public class UserTyping implements SlackEvent {
	private final SlackChannel slackChannel;
	private final SlackUser slackUser;
	private final SlackEventType slackEventType;

	public UserTyping(SlackChannel slackChannel, SlackUser slackUser, SlackEventType slackEventType) {
		this.slackChannel = slackChannel;
		this.slackUser = slackUser;
		this.slackEventType = slackEventType;
	}

	public SlackChannel getChannel() {
		return slackChannel;
	}

	public SlackUser getUser() {
		return slackUser;
	}

	@Override
	public SlackEventType getEventType() {
		return slackEventType;
	}
}
