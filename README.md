# Redstone-API

The Redstone-API enables developers to hook into the Redstone system.

API Usage
---------------
To use the API, we use a singleton instance to fetch the API class via the following.

```java
RedstoneAPI.INSTANCE();
```

With this you will have access to all of the methods in the API depending on the platform that the Redstone System is running on.

```java
RedstoneServer getCurrentServer();

ServerState getCurrentServerState();

String getCurrentServerName();

List<String> getCurrentServerGroups();

RedstoneServer getServer(String serverID);

changeServerState(RedstoneServer server, ServerState to, ServerState from);

getServersFromGroup(String serverGroup);

List<RedstoneServer> getServersFromGroups(String... servergroups);

addServer(RedstoneServer server);

removeServer(RedstoneServer server);

getCombinedCountsOfGroup(String group);

List<String> getAllGroups();

List<RedstoneServer> getAllServers();

sendNetworkCommand(String executor, String command, String context);
```

Requirements
---------------
To build Redstone and it's modules, the following will need to be installed and available on your system:

* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Git](https://git-scm.com)
* [Maven](https://maven.apache.org)

Contact
---------------
- MC-Market: https://www.mc-market.org/members/53967/
- Discord: ThatKawaiiSam#2882
- Twitter: ThatKawaiiSam
- Telegram: ThatKawaiiSam
 