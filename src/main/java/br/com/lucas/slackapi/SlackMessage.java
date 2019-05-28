package br.com.lucas.slackapi;

import br.com.lucas.slackapi.events.SlackEvent;
import br.com.lucas.slackapi.events.SlackMessagePosted;

/**
 * 
 * @deprecated use {@link SlackMessagePosted}
 *
 */
@Deprecated
public interface SlackMessage extends SlackEvent {

	String getMessageContent();

	SlackUser getSender();

	SlackBot getBot();

	SlackChannel getChannel();

	String getTimeStamp();
}
