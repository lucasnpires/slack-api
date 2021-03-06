package br.com.lucas.slackapi.impl;

import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import br.com.lucas.slackapi.SlackSession;
import br.com.lucas.slackapi.WebSocketContainerProvider;

public class SlackSessionFactory {
    public static SlackSession createWebSocketSlackSession(String authToken)
    {
    	return new SlackWebSocketSessionImpl(null, authToken, null, true, true, 0, null);
    }

    public static SlackSessionFactoryBuilder getSlackSessionBuilder(String authToken) {
        return new SlackSessionFactoryBuilder(authToken);
    }

    public static class SlackSessionFactoryBuilder {

        private String authToken;
        private String slackBaseApi;
        private Proxy.Type proxyType;
        private String proxyAddress;
        private int proxyPort;
        private String proxyUser;
        private String proxyPassword;
        private int heartbeat;
        private TimeUnit unit;
        private WebSocketContainerProvider provider;
        private boolean autoreconnection;
        private boolean rateLimitSupport = true;

        private SlackSessionFactoryBuilder(String authToken) {
            this.authToken = authToken;
        }

        public SlackSessionFactoryBuilder withBaseApiUrl(String slackBaseApi) {
        	this.slackBaseApi = slackBaseApi;
        	return this;
        }
        
        public SlackSessionFactoryBuilder withProxy(Proxy.Type proxyType, String proxyAddress, int proxyPort) {
            this.proxyType = proxyType;
            this.proxyAddress = proxyAddress;
            this.proxyPort = proxyPort;
            return this;
        }

        public SlackSessionFactoryBuilder withProxy(Proxy.Type proxyType, String proxyAddress, int proxyPort, String proxyUser, String proxyPassword) {
            this.proxyType = proxyType;
            this.proxyAddress = proxyAddress;
            this.proxyPort = proxyPort;
            this.proxyUser = proxyUser;
            this.proxyPassword = proxyPassword;
            return this;
        }

        public SlackSessionFactoryBuilder withConnectionHeartbeat(int heartbeat, TimeUnit unit) {
            this.heartbeat = heartbeat;
            this.unit = unit;
            return this;
        }

        public SlackSessionFactoryBuilder withCustomWebSocketContainer(WebSocketContainerProvider provider) {
            this.provider = provider;
            return this;
        }

        public SlackSessionFactoryBuilder withAutoreconnectOnDisconnection(boolean autoreconnection) {
            this.autoreconnection = autoreconnection;
            return this;
        }

        public SlackSessionFactoryBuilder withRateLimitSupport(boolean rateLimitSupport) {
            this.rateLimitSupport = rateLimitSupport;
            return this;
        }

        public SlackSession build() {
            return new SlackWebSocketSessionImpl(provider, authToken, slackBaseApi, proxyType, proxyAddress, proxyPort, proxyUser, proxyPassword, autoreconnection, rateLimitSupport, heartbeat, unit);
        }
    }
}
