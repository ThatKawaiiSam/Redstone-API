package io.github.thatkawaiisam.redstone.api.server;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter @Setter
public class ServerData {

    private int onlinePlayers, maxPlayers;
    private double tps;
    private ServerState state;
    private Set<UUID> whitelistedPlayers;

    /**
     * Server Data class.
     */
    public ServerData() {
        this.onlinePlayers = 0;
        this.maxPlayers = 0;
        this.tps = 20;
        this.state = ServerState.ONLINE;
        this.whitelistedPlayers = new HashSet<>();
    }
}
