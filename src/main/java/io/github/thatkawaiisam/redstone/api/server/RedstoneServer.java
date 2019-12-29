package io.github.thatkawaiisam.redstone.api.server;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter @Setter
public class RedstoneServer {

    private String serverID, ip;
    private List<String> groups;
    private ServerData data;
    private int port;
    private long startTime;

    /**
     * Redstone Server class.
     *
     * @param serverID of Redstone Server.
     */
    public RedstoneServer(String serverID) {
        this.serverID = serverID;
        this.data = new ServerData();
        this.groups = new ArrayList<>();
    }

    /**
     * Compares current time against the start time of the Redstone Server.
     *
     * @return uptime of Redstone server.
     */
    public long getUptime() {
        return System.currentTimeMillis() - startTime;
    }

}
