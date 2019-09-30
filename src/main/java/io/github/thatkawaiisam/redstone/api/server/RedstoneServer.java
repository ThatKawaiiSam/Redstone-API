package io.github.thatkawaiisam.redstone.api.server;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    public long getUptime() {
        return System.currentTimeMillis() - startTime;
    }

}
