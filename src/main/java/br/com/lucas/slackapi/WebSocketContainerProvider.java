package br.com.lucas.slackapi;

import javax.websocket.WebSocketContainer;

public interface WebSocketContainerProvider {
	WebSocketContainer getWebSocketContainer();
}
