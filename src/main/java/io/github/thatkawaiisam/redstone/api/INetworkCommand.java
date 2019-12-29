package io.github.thatkawaiisam.redstone.api;

import io.github.thatkawaiisam.redstone.api.server.RedstoneServer;

public interface INetworkCommand {

    /**
     * Network Command is a function that allows a command to be sent to any server
     * on the network, including connected BungeeCord instances.
     *
     * @param command that being issued.
     * @param context that will be consuming the command. This can either be a single server or a whole group.
     * @param executor of the command. Either CONSOLE or a player's displayName.
     * @param server that the command was issued from.
     */
    void execute(String command, String context, String executor, RedstoneServer server);

}
