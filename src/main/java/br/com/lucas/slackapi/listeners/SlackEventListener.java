package br.com.lucas.slackapi.listeners;

import br.com.lucas.slackapi.SlackSession;
import br.com.lucas.slackapi.events.SlackEvent;

public interface SlackEventListener<T extends SlackEvent> {
    void onEvent(T event, SlackSession session);
}
