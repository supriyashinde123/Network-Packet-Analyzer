import java.util.HashMap;
import java.util.Map;

public class ConnectionTracker {
    private Map<String, Integer> connections = new HashMap<>();

    public void track(ParsedPacket packet) {
        String key = packet.getSrcIp() + " -> " + packet.getDstIp();
        connections.put(key, connections.getOrDefault(key, 0) + 1);
        System.out.println("Tracking: " + key);
    }
}
