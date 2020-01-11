package io.github.thatkawaiisam.redstone.api;

import io.github.thatkawaiisam.redstone.api.server.RedstoneServer;
import io.github.thatkawaiisam.redstone.api.server.ServerState;

import java.util.List;
import java.util.logging.Logger;

public abstract class RedstoneAPI {

    private static RedstoneAPI apiInstance;

    /**
     * Redstone API.
     */
    public RedstoneAPI() {
        apiInstance = this;
        System.out.println("[Redstone] API has now been loaded.");
    }

    /**
     * Gets an instance of the Redstone API.
     *
     * @return instance if it is loaded.
     */
    public static RedstoneAPI INSTANCE() {
        if (apiInstance == null) {
            throw new RedstoneAPIException("API is currently not loaded!");
        }
        return apiInstance;
    }

    /**
     * Get RedstoneServer Object of current server instance.
     *
     * @return RedstoneServer if API is attached to a server instance.
     */
    public abstract RedstoneServer getCurrentServer();

    /**
     * Get ServerState Enum of current RedstoneServer.
     *
     * @return ServerState of RedstoneServer if API is attached to server instance.
     */
    public abstract ServerState getCurrentServerState();

    /**
     * Get Server Name of current RedstoneServer.
     *
     * @return name of RedstoneServer if API is attached to server instance.
     */
    public abstract String getCurrentServerName();

    /**
     * Get List of groups attached to current RedstoneServer.
     *
     * @return groups of RedstoneServer if API is attached to server instance.
     */
    public abstract List<String> getCurrentServerGroups();

    /**
     * Get RedstoneServer from ID.
     *
     * @param serverID of RedstoneServer.
     * @return RedstoneServer with the same ID.
     */
    public abstract RedstoneServer getServer(String serverID);

    /**
     * Changes the ServerState of a RedstoneServer in the local cache (does not push to redis).
     *
     * @param server that's state is being changed.
     * @param to future state.
     * @param from previous state.
     */
    public abstract void changeServerState(RedstoneServer server, ServerState to, ServerState from);

    /**
     * Get a List of RedstoneServers from a specific group.
     *
     * @param serverGroup to get servers from.
     * @return List of RedstoneServers that meet the criteria.
     */
    public abstract List<RedstoneServer> getServersFromGroup(String serverGroup);

    /**
     * Get a List of RedstoneServers that are in several specific groups.
     *
     * @param servergroups to get servers from.
     * @return List of RedstoneServers that meet the criteria.
     */
    public abstract List<RedstoneServer> getServersFromGroups(String... servergroups);

    /**
     * Add a RedstoneServer to local cache (does not push to redis).
     *
     * @param server to add.
     */
    public abstract void addServer(RedstoneServer server);

    /**
     * Remove a RedstoneServer from local cache (does not push to redis).
     *
     * @param server to remove.
     */
    public abstract void removeServer(RedstoneServer server);

    /**
     * Get the combined player counts of servers in a group.
     *
     * @param group to calculate.
     * @return combined count of group.
     */
    public abstract int getCombinedCountsOfGroup(String group);

    /**
     * Get a List of all groups of Redstone Servers that are current cached.
     *
     * @return List of all groups.
     */
    public abstract List<String> getAllGroups();

    /**
     * Get a List of all of the registered Redstone Servers.
     *
     * @return List of all servers.
     */
    public abstract List<RedstoneServer> getAllServers();

    /**
     * Send a global command to the redis backbone (with context support).
     *
     * @param executor of who sent the command.
     * @param command that is being sent.
     * @param context of which the command is being sent to.
     */
    public abstract void sendNetworkCommand(String executor, String command, String context);

}
