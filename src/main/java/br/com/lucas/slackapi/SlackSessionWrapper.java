package br.com.lucas.slackapi;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import br.com.lucas.slackapi.listeners.PinAddedListener;
import br.com.lucas.slackapi.listeners.PinRemovedListener;
import br.com.lucas.slackapi.listeners.PresenceChangeListener;
import br.com.lucas.slackapi.listeners.ReactionAddedListener;
import br.com.lucas.slackapi.listeners.ReactionRemovedListener;
import br.com.lucas.slackapi.listeners.SlackChannelArchivedListener;
import br.com.lucas.slackapi.listeners.SlackChannelCreatedListener;
import br.com.lucas.slackapi.listeners.SlackChannelDeletedListener;
import br.com.lucas.slackapi.listeners.SlackChannelJoinedListener;
import br.com.lucas.slackapi.listeners.SlackChannelLeftListener;
import br.com.lucas.slackapi.listeners.SlackChannelRenamedListener;
import br.com.lucas.slackapi.listeners.SlackChannelUnarchivedListener;
import br.com.lucas.slackapi.listeners.SlackConnectedListener;
import br.com.lucas.slackapi.listeners.SlackDisconnectedListener;
import br.com.lucas.slackapi.listeners.SlackGroupJoinedListener;
import br.com.lucas.slackapi.listeners.SlackMessageDeletedListener;
import br.com.lucas.slackapi.listeners.SlackMessagePostedListener;
import br.com.lucas.slackapi.listeners.SlackMessageUpdatedListener;
import br.com.lucas.slackapi.listeners.SlackTeamJoinListener;
import br.com.lucas.slackapi.listeners.SlackUserChangeListener;
import br.com.lucas.slackapi.listeners.UserTypingListener;
import br.com.lucas.slackapi.replies.EmojiSlackReply;
import br.com.lucas.slackapi.replies.GenericSlackReply;
import br.com.lucas.slackapi.replies.ParsedSlackReply;
import br.com.lucas.slackapi.replies.SlackChannelReply;
import br.com.lucas.slackapi.replies.SlackMessageReply;

public class SlackSessionWrapper implements SlackSession {
	protected final SlackSession delegate;

	public SlackSessionWrapper(SlackSession delegate) {
		this.delegate = delegate;
	}

	@Override
	public SlackTeam getTeam() {
		return delegate.getTeam();
	}

	@Override
	public Collection<SlackChannel> getChannels() {
		return delegate.getChannels();
	}

	@Override
	public Collection<SlackUser> getUsers() {
		return delegate.getUsers();
	}

	@Override
	public Collection<SlackBot> getBots() {
		return delegate.getBots();
	}

	@Override
	public Collection<SlackIntegration> getIntegrations() {
		return delegate.getIntegrations();
	}

	@Override
	public SlackChannel findChannelByName(String channelName) {
		return delegate.findChannelByName(channelName);
	}

	@Override
	public SlackChannel findChannelById(String channelId) {
		return delegate.findChannelById(channelId);
	}

	@Override
	public SlackIntegration findIntegrationById(String integrationId) {
		return delegate.findIntegrationById(integrationId);
	}

	@Override
	public SlackUser findUserById(String userId) {
		return delegate.findUserById(userId);
	}

	@Override
	public SlackUser findUserByUserName(String userName) {
		return delegate.findUserByUserName(userName);
	}

	@Override
	public SlackUser findUserByEmail(String userMail) {
		return delegate.findUserByEmail(userMail);
	}

	@Override
	public SlackPersona sessionPersona() {
		return delegate.sessionPersona();
	}

	@Override
	public SlackMessageHandle<EmojiSlackReply> listEmoji() {
		return delegate.listEmoji();
	}

	@Override
	public void refetchUsers() {
		delegate.refetchUsers();
	}

	@Override
	public SlackBot findBotById(String botId) {
		return delegate.findBotById(botId);
	}

	@Override
	public SlackMessageHandle<ParsedSlackReply> inviteUser(String email, String firstName, boolean setActive) {
		return delegate.inviteUser(email, firstName, setActive);
	}

	@Override
	public void connect() throws IOException {
		delegate.connect();
	}

	@Override
	public void disconnect() throws IOException {
		delegate.disconnect();
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> deleteMessage(String timeStamp, SlackChannel channel) {
		return delegate.deleteMessage(timeStamp, channel);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, SlackPreparedMessage preparedMessage,
			SlackChatConfiguration chatConfiguration) {
		return delegate.sendMessage(channel, preparedMessage, chatConfiguration);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel,
			SlackPreparedMessage preparedMessage) {
		return delegate.sendMessage(channel, preparedMessage);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message,
			SlackAttachment attachment, SlackChatConfiguration chatConfiguration, boolean unfurl) {
		return delegate.sendMessage(channel, message, attachment, chatConfiguration, unfurl);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message,
			SlackAttachment attachment, SlackChatConfiguration chatConfiguration) {
		return delegate.sendMessage(channel, message, attachment, chatConfiguration);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message,
			SlackAttachment attachment, boolean unfurl) {
		return delegate.sendMessage(channel, message, attachment, unfurl);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message,
			SlackAttachment attachment) {
		return delegate.sendMessage(channel, message, attachment);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, boolean unfurl) {
		return delegate.sendMessage(channel, message, unfurl);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message) {
		return delegate.sendMessage(channel, message);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			SlackPreparedMessage preparedMessage, SlackChatConfiguration chatConfiguration) {
		return delegate.sendEphemeralMessage(channel, user, preparedMessage, chatConfiguration);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			SlackPreparedMessage preparedMessage) {
		return delegate.sendEphemeralMessage(channel, user, preparedMessage);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			String message, SlackAttachment attachment, SlackChatConfiguration chatConfiguration, boolean unfurl) {
		return delegate.sendEphemeralMessage(channel, user, message, attachment, chatConfiguration, unfurl);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			String message, SlackAttachment attachment, SlackChatConfiguration chatConfiguration) {
		return delegate.sendEphemeralMessage(channel, user, message, attachment, chatConfiguration);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			String message, SlackAttachment attachment, boolean unfurl) {
		return delegate.sendEphemeralMessage(channel, user, message, attachment, unfurl);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			String message, SlackAttachment attachment) {
		return delegate.sendEphemeralMessage(channel, user, message, attachment);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			String message, boolean unfurl) {
		return delegate.sendEphemeralMessage(channel, user, message, unfurl);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user,
			String message) {
		return delegate.sendEphemeralMessage(channel, user, message);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendFile(SlackChannel channel, byte[] data, String fileName) {
		return delegate.sendFile(channel, data, fileName);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendFile(SlackChannel channel, byte[] data, String fileName,
			String title, String initialComment) {
		return delegate.sendFile(channel, data, fileName, title, initialComment);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendFileToUser(SlackUser user, byte[] data, String fileName) {
		return delegate.sendFileToUser(user, data, fileName);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendFileToUser(String userName, byte[] data, String fileName) {
		return delegate.sendFileToUser(userName, data, fileName);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessageToUser(SlackUser user,
			SlackPreparedMessage preparedMessage) {
		return delegate.sendMessageToUser(user, preparedMessage);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessageToUser(SlackUser user, String message,
			SlackAttachment attachment) {
		return delegate.sendMessageToUser(user, message, attachment);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessageToUser(String userName, String message,
			SlackAttachment attachment) {
		return delegate.sendMessageToUser(userName, message, attachment);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> updateMessage(String timeStamp, SlackChannel channel, String message) {
		return delegate.updateMessage(timeStamp, channel, message);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> updateMessage(String timeStamp, SlackChannel channel, String message,
			SlackAttachment[] attachments) {
		return delegate.updateMessage(timeStamp, channel, message, attachments);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendMessageOverWebSocket(SlackChannel channel, String message) {
		return delegate.sendMessageOverWebSocket(channel, message);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> addReactionToMessage(SlackChannel channel, String messageTimeStamp,
			String emojiCode) {
		return delegate.addReactionToMessage(channel, messageTimeStamp, emojiCode);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> removeReactionFromMessage(SlackChannel channel,
			String messageTimeStamp, String emojiCode) {
		return delegate.removeReactionFromMessage(channel, messageTimeStamp, emojiCode);
	}

	@Override
	public SlackMessageHandle<SlackChannelReply> setChannelTopic(SlackChannel channel, String topic) {
		return delegate.setChannelTopic(channel, topic);
	}

	@Override
	public SlackMessageHandle<SlackChannelReply> joinChannel(String channelName) {
		return delegate.joinChannel(channelName);
	}

	@Override
	public SlackMessageHandle<SlackChannelReply> leaveChannel(SlackChannel channel) {
		return delegate.leaveChannel(channel);
	}

	@Override
	public SlackMessageHandle<SlackChannelReply> inviteToChannel(SlackChannel channel, SlackUser user) {
		return delegate.inviteToChannel(channel, user);
	}

	@Override
	public SlackMessageHandle<ParsedSlackReply> archiveChannel(SlackChannel channel) {
		return delegate.archiveChannel(channel);
	}

	@Override
	public SlackMessageHandle<ParsedSlackReply> unarchiveChannel(SlackChannel channel) {
		return delegate.unarchiveChannel(channel);
	}

	@Override
	public SlackMessageHandle<SlackChannelReply> openDirectMessageChannel(SlackUser user) {
		return delegate.openDirectMessageChannel(user);
	}

	@Override
	public SlackMessageHandle<SlackChannelReply> openMultipartyDirectMessageChannel(SlackUser... users) {
		return delegate.openMultipartyDirectMessageChannel(users);
	}

	@Override
	public SlackMessageHandle<SlackMessageReply> sendTyping(SlackChannel channel) {
		return delegate.sendTyping(channel);
	}

	@Override
	public SlackPersona.SlackPresence getPresence(SlackPersona persona) {
		return delegate.getPresence(persona);
	}

	@Override
	public void setPresence(SlackPersona.SlackPresence presence) {
		delegate.setPresence(presence);
	}

	@Override
	public SlackMessageHandle<GenericSlackReply> postGenericSlackCommand(Map<String, String> params, String command) {
		return delegate.postGenericSlackCommand(params, command);
	}

	@Override
	public void addChannelArchivedListener(SlackChannelArchivedListener listener) {
		delegate.addChannelArchivedListener(listener);
	}

	@Override
	public void removeChannelArchivedListener(SlackChannelArchivedListener listener) {
		delegate.removeChannelArchivedListener(listener);
	}

	@Override
	public void addChannelCreatedListener(SlackChannelCreatedListener listener) {
		delegate.addChannelCreatedListener(listener);
	}

	@Override
	public void removeChannelCreatedListener(SlackChannelCreatedListener listener) {
		delegate.removeChannelCreatedListener(listener);
	}

	@Override
	public void addChannelDeletedListener(SlackChannelDeletedListener listener) {
		delegate.addChannelDeletedListener(listener);
	}

	@Override
	public void removeChannelDeletedListener(SlackChannelDeletedListener listener) {
		delegate.removeChannelDeletedListener(listener);
	}

	@Override
	public void addChannelRenamedListener(SlackChannelRenamedListener listener) {
		delegate.addChannelRenamedListener(listener);
	}

	@Override
	public void removeChannelRenamedListener(SlackChannelRenamedListener listener) {
		delegate.removeChannelRenamedListener(listener);
	}

	@Override
	public void addChannelUnarchivedListener(SlackChannelUnarchivedListener listener) {
		delegate.addChannelUnarchivedListener(listener);
	}

	@Override
	public void removeChannelUnarchivedListener(SlackChannelUnarchivedListener listener) {
		delegate.removeChannelUnarchivedListener(listener);
	}

	@Override
	public void addMessageDeletedListener(SlackMessageDeletedListener listener) {
		delegate.addMessageDeletedListener(listener);
	}

	@Override
	public void removeMessageDeletedListener(SlackMessageDeletedListener listener) {
		delegate.removeMessageDeletedListener(listener);
	}

	@Override
	public void addMessagePostedListener(SlackMessagePostedListener listener) {
		delegate.addMessagePostedListener(listener);
	}

	@Override
	public void removeMessagePostedListener(SlackMessagePostedListener listener) {
		delegate.removeMessagePostedListener(listener);
	}

	@Override
	public void addMessageUpdatedListener(SlackMessageUpdatedListener listener) {
		delegate.addMessageUpdatedListener(listener);
	}

	@Override
	public void removeMessageUpdatedListener(SlackMessageUpdatedListener listener) {
		delegate.removeMessageUpdatedListener(listener);
	}

	@Override
	public void addChannelJoinedListener(SlackChannelJoinedListener listener) {
		delegate.addChannelJoinedListener(listener);
	}

	@Override
	public void removeChannelJoinedListener(SlackChannelJoinedListener listener) {
		delegate.removeChannelJoinedListener(listener);
	}

	@Override
	public void addChannelLeftListener(SlackChannelLeftListener listener) {
		delegate.addChannelLeftListener(listener);
	}

	@Override
	public void removeChannelLeftListener(SlackChannelLeftListener listener) {
		delegate.removeChannelLeftListener(listener);
	}

	@Override
	public void addGroupJoinedListener(SlackGroupJoinedListener listener) {
		delegate.addGroupJoinedListener(listener);
	}

	@Override
	public void removeGroupJoinedListener(SlackGroupJoinedListener listener) {
		delegate.removeGroupJoinedListener(listener);
	}

	@Override
	public void addUserTypingListener(UserTypingListener listener) {
		delegate.addUserTypingListener(listener);
	}

	@Override
	public void removeUserTypingListener(UserTypingListener listener) {
		delegate.removeUserTypingListener(listener);
	}

	@Override
	public void addSlackConnectedListener(SlackConnectedListener listener) {
		delegate.addSlackConnectedListener(listener);
	}

	@Override
	public void removeSlackConnectedListener(SlackConnectedListener listener) {
		delegate.removeSlackConnectedListener(listener);
	}

	@Override
	public void addSlackDisconnectedListener(SlackDisconnectedListener listener) {
		delegate.addSlackDisconnectedListener(listener);
	}

	@Override
	public void removeSlackDisconnectedListener(SlackDisconnectedListener listener) {
		delegate.removeSlackDisconnectedListener(listener);
	}

	@Override
	public boolean isConnected() {
		return delegate.isConnected();
	}

	@Override
	public void addReactionAddedListener(ReactionAddedListener listener) {
		delegate.addReactionAddedListener(listener);
	}

	@Override
	public void removeReactionAddedListener(ReactionAddedListener listener) {
		delegate.removeReactionAddedListener(listener);
	}

	@Override
	public void addReactionRemovedListener(ReactionRemovedListener listener) {
		delegate.addReactionRemovedListener(listener);
	}

	@Override
	public void removeReactionRemovedListener(ReactionRemovedListener listener) {
		delegate.removeReactionRemovedListener(listener);
	}

	@Override
	public void addSlackUserChangeListener(SlackUserChangeListener listener) {
		delegate.addSlackUserChangeListener(listener);
	}

	@Override
	public void removeSlackUserChangeListener(SlackUserChangeListener listener) {
		delegate.removeSlackUserChangeListener(listener);
	}

	@Override
	public void addSlackTeamJoinListener(SlackTeamJoinListener listener) {
		delegate.addSlackTeamJoinListener(listener);
	}

	@Override
	public void removeSlackTeamJoinListener(SlackTeamJoinListener listener) {
		delegate.removeSlackTeamJoinListener(listener);
	}

	@Override
	public void addPinAddedListener(PinAddedListener listener) {
		delegate.addPinAddedListener(listener);
	}

	@Override
	public void removePinAddedListener(PinAddedListener listener) {
		delegate.removePinAddedListener(listener);
	}

	@Override
	public void addPresenceChangeListener(PresenceChangeListener listener) {
		delegate.addPresenceChangeListener(listener);
	}

	@Override
	public void removePresenceChangeListener(PresenceChangeListener listener) {
		delegate.removePresenceChangeListener(listener);
	}

	@Override
	public void addPinRemovedListener(PinRemovedListener listener) {
		delegate.addPinRemovedListener(listener);
	}

	@Override
	public void removePinRemovedListener(PinRemovedListener listener) {
		delegate.removePinRemovedListener(listener);
	}

	@Override
	public long getHeartbeat() {
		return delegate.getHeartbeat();
	}
}
