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

public interface SlackSession {

    SlackTeam getTeam();

    Collection<SlackChannel> getChannels();

    Collection<SlackUser> getUsers();

    Collection<SlackBot> getBots();

    Collection<SlackIntegration> getIntegrations();

    SlackChannel findChannelByName(String channelName);

    SlackChannel findChannelById(String channelId);

    SlackIntegration findIntegrationById(String integrationId);

    SlackUser findUserById(String userId);

    SlackUser findUserByUserName(String userName);

    SlackUser findUserByEmail(String userMail);

    SlackPersona sessionPersona();

    SlackMessageHandle<EmojiSlackReply> listEmoji();

    void refetchUsers();

    @Deprecated
    SlackBot findBotById(String botId);
    

    SlackMessageHandle<ParsedSlackReply> inviteUser(String email, String firstName, boolean setActive);

    void connect() throws IOException;

    void disconnect() throws IOException;

    SlackMessageHandle<SlackMessageReply> deleteMessage(String timeStamp, SlackChannel channel);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, SlackPreparedMessage preparedMessage, SlackChatConfiguration chatConfiguration);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, SlackPreparedMessage preparedMessage);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, SlackAttachment attachment, SlackChatConfiguration chatConfiguration, boolean unfurl);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, SlackAttachment attachment, SlackChatConfiguration chatConfiguration);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, SlackAttachment attachment, boolean unfurl);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, SlackAttachment attachment);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message, boolean unfurl);

    SlackMessageHandle<SlackMessageReply> sendMessage(SlackChannel channel, String message);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, SlackPreparedMessage preparedMessage, SlackChatConfiguration chatConfiguration);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, SlackPreparedMessage preparedMessage);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, String message, SlackAttachment attachment, SlackChatConfiguration chatConfiguration, boolean unfurl);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, String message, SlackAttachment attachment, SlackChatConfiguration chatConfiguration);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, String message, SlackAttachment attachment, boolean unfurl);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, String message, SlackAttachment attachment);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, String message, boolean unfurl);

    SlackMessageHandle<SlackMessageReply> sendEphemeralMessage(SlackChannel channel, SlackUser user, String message);

    SlackMessageHandle<SlackMessageReply> sendFile(SlackChannel channel, byte [] data, String fileName);

    SlackMessageHandle<SlackMessageReply> sendFile(SlackChannel channel, byte [] data, String fileName, String title, String initialComment);

    SlackMessageHandle<SlackMessageReply> sendFileToUser(SlackUser user, byte [] data, String fileName);

    SlackMessageHandle<SlackMessageReply> sendFileToUser(String userName, byte [] data, String fileName);

    SlackMessageHandle<SlackMessageReply> sendMessageToUser(SlackUser user, SlackPreparedMessage preparedMessage);

    SlackMessageHandle<SlackMessageReply> sendMessageToUser(SlackUser user, String message, SlackAttachment attachment);
    
    SlackMessageHandle<SlackMessageReply> sendMessageToUser(String userName, String message, SlackAttachment attachment);
    
    SlackMessageHandle<SlackMessageReply> updateMessage(String timeStamp, SlackChannel channel, String message);

    SlackMessageHandle<SlackMessageReply> updateMessage(String timeStamp, SlackChannel channel, String message, SlackAttachment[] attachments);

    SlackMessageHandle<SlackMessageReply> sendMessageOverWebSocket(SlackChannel channel, String message);

    SlackMessageHandle<SlackMessageReply> addReactionToMessage(SlackChannel channel, String messageTimeStamp, String emojiCode);

    SlackMessageHandle<SlackMessageReply> removeReactionFromMessage(SlackChannel channel, String messageTimeStamp, String emojiCode);

    SlackMessageHandle<SlackChannelReply> setChannelTopic(SlackChannel channel, String topic);

    SlackMessageHandle<SlackChannelReply> joinChannel(String channelName);

    SlackMessageHandle<SlackChannelReply> leaveChannel(SlackChannel channel);
    
    SlackMessageHandle<SlackChannelReply> inviteToChannel(SlackChannel channel, SlackUser user);
    
    SlackMessageHandle<ParsedSlackReply> archiveChannel(SlackChannel channel);

    SlackMessageHandle<ParsedSlackReply> unarchiveChannel(SlackChannel channel);

    SlackMessageHandle<SlackChannelReply> openDirectMessageChannel(SlackUser user);

    SlackMessageHandle<SlackChannelReply> openMultipartyDirectMessageChannel(SlackUser... users);

    SlackMessageHandle<SlackMessageReply> sendTyping(SlackChannel channel);

    SlackPersona.SlackPresence getPresence(SlackPersona persona);

    void setPresence(SlackPersona.SlackPresence presence);

    SlackMessageHandle<GenericSlackReply> postGenericSlackCommand(Map<String, String> params, String command);

    void addChannelArchivedListener(SlackChannelArchivedListener listener);

    void removeChannelArchivedListener(SlackChannelArchivedListener listener);

    void addChannelCreatedListener(SlackChannelCreatedListener listener);

    void removeChannelCreatedListener(SlackChannelCreatedListener listener);

    void addChannelDeletedListener(SlackChannelDeletedListener listener);

    void removeChannelDeletedListener(SlackChannelDeletedListener listener);

    void addChannelRenamedListener(SlackChannelRenamedListener listener);

    void removeChannelRenamedListener(SlackChannelRenamedListener listener);

    void addChannelUnarchivedListener(SlackChannelUnarchivedListener listener);

    void removeChannelUnarchivedListener(SlackChannelUnarchivedListener listener);

    void addMessageDeletedListener(SlackMessageDeletedListener listener);

    void removeMessageDeletedListener(SlackMessageDeletedListener listener);

    void addMessagePostedListener(SlackMessagePostedListener listener);

    void removeMessagePostedListener(SlackMessagePostedListener listener);

    void addMessageUpdatedListener(SlackMessageUpdatedListener listener);

    void removeMessageUpdatedListener(SlackMessageUpdatedListener listener);

    void addChannelJoinedListener(SlackChannelJoinedListener listener);

    void removeChannelJoinedListener(SlackChannelJoinedListener listener);

    void addChannelLeftListener(SlackChannelLeftListener listener);

    void removeChannelLeftListener(SlackChannelLeftListener listener);

    void addGroupJoinedListener(SlackGroupJoinedListener listener);

    void removeGroupJoinedListener(SlackGroupJoinedListener listener);

    void addUserTypingListener(UserTypingListener listener);

    void removeUserTypingListener(UserTypingListener listener);


    /*
     * Subscribe to events related to the actions to the slack
     * server. At this time a set of status information is exchanged that
     * is useful to implementing bots.
     * 
     * For example, the current user that is connecting.
     * knowing your own user id will help you stop answering your own
     * questions.
     */
    void addSlackConnectedListener(SlackConnectedListener listener);
    
    void removeSlackConnectedListener(SlackConnectedListener listener);

    void addSlackDisconnectedListener(SlackDisconnectedListener listener);

    void removeSlackDisconnectedListener(SlackDisconnectedListener listener);

    /**
     * 
     * @return true if actions is open
     */
    boolean isConnected();
    
    void addReactionAddedListener(ReactionAddedListener listener);
    
    void removeReactionAddedListener(ReactionAddedListener listener);
    
    void addReactionRemovedListener(ReactionRemovedListener listener);
    
    void removeReactionRemovedListener(ReactionRemovedListener listener);

    void addSlackUserChangeListener(SlackUserChangeListener listener);

    void removeSlackUserChangeListener(SlackUserChangeListener listener);

    void addSlackTeamJoinListener(SlackTeamJoinListener listener);

    void removeSlackTeamJoinListener(SlackTeamJoinListener listener);

    void addPinAddedListener(PinAddedListener listener);

    void removePinAddedListener(PinAddedListener listener);

    void addPresenceChangeListener(PresenceChangeListener listener);

    void removePresenceChangeListener(PresenceChangeListener listener);

    void addPinRemovedListener(PinRemovedListener listener);
  
    void removePinRemovedListener(PinRemovedListener listener);

    long getHeartbeat();
}
