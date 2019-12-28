package io.github.thatkawaiisam.redstone.api.server;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter @Setter
public class RedstoneServer {

    private String serverID, ip;
    private List<String> groups = new ArrayList<>();
    private ServerData data;
    private int port;
    private long startTime;

    public RedstoneServer(String serverID) {
        this.serverID = serverID;
        this.data = new ServerData();
    }

    /**
     * Compares current time against the start time of the RedstoneServer.
     *
     * @return uptime of Redstone server.
     */
    public long getUptime() {
        return System.currentTimeMillis() - startTime;
    }

}
