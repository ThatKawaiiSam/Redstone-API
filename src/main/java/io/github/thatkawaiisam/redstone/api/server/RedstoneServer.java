package io.github.thatkawaiisam.redstone.api.server;

import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter @Setter
public class RedstoneServer {

    private String serverID, ip;
    private List<String> groups;
    private Map<String, JsonObject> metadata;
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
        this.metadata = new HashMap<>();
    }

    /**
     * Compares current time against the start time of the Redstone Server.
     *
     * @return uptime of Redstone server.
     */
    public long getUptime() {
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Gets the Metadata of a specific identifier.
     *
     * @param identifier of metadata.
     * @return metadata as JsonObject.
     */
    public JsonObject getMetaData(String identifier) {
        return metadata.get(identifier);
    }

}
