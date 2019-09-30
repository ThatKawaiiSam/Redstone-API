package io.github.thatkawaiisam.redstone.api;

import io.github.thatkawaiisam.redstone.api.server.RedstoneServer;
import io.github.thatkawaiisam.redstone.api.server.ServerState;

import java.util.List;

public abstract class RedstoneAPI {

    private static RedstoneAPI apiInstance;

    public RedstoneAPI() {
        apiInstance = this;
    }

    public static RedstoneAPI INSTANCE() {
        if (apiInstance == null) {
            throw new RedstoneAPIException("API is currently not loaded!");
        }
        return apiInstance;
    }

    public abstract RedstoneServer getCurrentServer();

    public abstract ServerState getCurrentServerState();

    public abstract String getCurrentServerName();

    public abstract List<String> getCurrentServerGroups();

    public abstract RedstoneServer getServer(String serverID);

    public abstract void changeServerState(RedstoneServer server, ServerState to, ServerState from);

    public abstract List<RedstoneServer> getServersFromGroup(String serverGroup);

    public abstract List<RedstoneServer> getServersFromGroups(String... servergroups);

    public abstract void addServer(RedstoneServer server);

    public abstract void removeServer(RedstoneServer server);

    public abstract int getCombinedCountsOfGroup(String group);

    public abstract List<String> getAllGroups();

    public abstract List<RedstoneServer> getAllServers();

}
