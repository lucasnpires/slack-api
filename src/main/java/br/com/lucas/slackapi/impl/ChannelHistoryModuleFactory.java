package br.com.lucas.slackapi.impl;

import br.com.lucas.slackapi.ChannelHistoryModule;
import br.com.lucas.slackapi.SlackSession;

public class ChannelHistoryModuleFactory {

	public static ChannelHistoryModule createChannelHistoryModule(SlackSession session) {
		return new ChannelHistoryModuleImpl(session);
	};

}
