import org.pcap4j.packet.Packet;
import org.pcap4j.packet.IpV4Packet;

public class PacketParser {
    public ParsedPacket parse(Packet packet) {
        ParsedPacket p = new ParsedPacket();

        if (packet.contains(IpV4Packet.class)) {
            IpV4Packet ip = packet.get(IpV4Packet.class);

            p.setSrcIp(ip.getHeader().getSrcAddr().getHostAddress());
            p.setDstIp(ip.getHeader().getDstAddr().getHostAddress());
            p.setPayload(packet.toString());
        }

        return p;
    }
}
