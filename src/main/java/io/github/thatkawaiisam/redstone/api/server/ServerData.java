package io.github.thatkawaiisam.redstone.api.server;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter @Setter
public class ServerData {

    private int maxPlayers;
    private double tps;
    private ServerState state;
    private Set<UUID> whitelistedPlayers, onlinePlayers;

    /**
     * Server Data class.
     */
    public ServerData() {
        this.maxPlayers = 0;
        this.tps = 20;
        this.state = ServerState.ONLINE;
        this.whitelistedPlayers = new HashSet<>();
        this.onlinePlayers = new HashSet<>();
    }

    /**
     * Gets the amount of people online on a specific Redstone Server.
     *
     * @return amount online.
     */
    public int getAmountOnline() {
        return onlinePlayers.size();
    }
}
