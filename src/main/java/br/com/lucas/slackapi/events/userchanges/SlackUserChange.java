package br.com.lucas.slackapi.events.userchanges;

import br.com.lucas.slackapi.SlackUser;
import br.com.lucas.slackapi.events.SlackEventType;

public class SlackUserChange implements SlackUserChangeEvent {

	private final SlackUser slackUser;

	public SlackUserChange(SlackUser slackUser) {
		this.slackUser = slackUser;
	}

	@Override
	public SlackUser getUser() {
		return slackUser;
	}

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.SLACK_USER_CHANGE;
	}
}
