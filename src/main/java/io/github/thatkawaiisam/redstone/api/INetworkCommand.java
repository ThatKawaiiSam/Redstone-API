package io.github.thatkawaiisam.redstone.api;

import io.github.thatkawaiisam.redstone.api.server.RedstoneServer;

public interface INetworkCommand {

    /**
     *
     * @param command
     * @param context
     * @param executor
     * @param server
     */
    void execute(String command, String context, String executor, RedstoneServer server);

}
