package io.github.thatkawaiisam.redstone.api.server;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ServerData {

    private int onlinePlayers, maxPlayers;
    private double tps;
    private ServerState state;

    public ServerData() {
        this.onlinePlayers = 0;
        this.maxPlayers = 0;
        this.tps = 20;
        this.state = ServerState.ONLINE;
    }
}
