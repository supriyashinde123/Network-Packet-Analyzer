import org.pcap4j.packet.Packet;

public class DPIEngine {
    private PacketParser parser = new PacketParser();
    private ConnectionTracker tracker = new ConnectionTracker();

    public void processPacket(Packet packet) {
        ParsedPacket parsed = parser.parse(packet);

        if (parsed != null) {
            tracker.track(parsed);
            analyze(parsed);
        }
    }

    private void analyze(ParsedPacket packet) {
        if (packet.getPayload() != null && packet.getPayload().contains("HTTP")) {
            System.out.println("HTTP Packet detected");
        }
    }
}
