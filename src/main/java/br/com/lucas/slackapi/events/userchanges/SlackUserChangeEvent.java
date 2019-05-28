package br.com.lucas.slackapi.events.userchanges;

import br.com.lucas.slackapi.SlackUser;
import br.com.lucas.slackapi.events.SlackEvent;

public interface SlackUserChangeEvent extends SlackEvent {

	SlackUser getUser();
}
