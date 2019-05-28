package br.com.lucas.slackapi.samples.actions;

import java.util.Map;

import br.com.lucas.slackapi.SlackChannel;
import br.com.lucas.slackapi.SlackMessageHandle;
import br.com.lucas.slackapi.SlackSession;
import br.com.lucas.slackapi.replies.EmojiSlackReply;

/**
 * Samples showing how to retrieve various bits of information from a slack
 * group
 */
public class RetrieveInformation {

	/**
	 * Demonstrates how to fetch glorious emoji.
	 */
	public void fetchListOfEmoji(SlackSession session, SlackChannel slackChannel) {
		SlackMessageHandle<EmojiSlackReply> handle = session.listEmoji();
		Map<String, String> emojis = handle.getReply().getEmojis();

		for (String emojiName : emojis.keySet()) {
			String emojiUrl = emojis.get(emojiName);
			// you are now equipped to do glorious emoji things.
		}
	}

}
