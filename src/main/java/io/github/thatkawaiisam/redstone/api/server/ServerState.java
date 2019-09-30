package io.github.thatkawaiisam.redstone.api.server;

import lombok.Getter;

import java.util.Arrays;

public enum ServerState {

    ONLINE(0),
    WHITELISTED(1),
    OFFLINE(2);

    @Getter private int ordinal;

    ServerState(int ordinal){
        this.ordinal = ordinal;
    }

    public static ServerState getFromOrdinal(int ordinal) {
        return Arrays.stream(ServerState.values())
                .filter(serverState -> serverState.ordinal == ordinal)
                .findFirst().orElse(null);
    }
}
