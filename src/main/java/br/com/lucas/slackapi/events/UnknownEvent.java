package br.com.lucas.slackapi.events;

public class UnknownEvent implements SlackEvent {
	private final String jsonPayload;

	public UnknownEvent(String jsonPayload) {
		this.jsonPayload = jsonPayload;
	}

	@Override
	public SlackEventType getEventType() {
		return SlackEventType.UNKNOWN;
	}

	public String getJsonPayload() {
		return jsonPayload;
	}
}
