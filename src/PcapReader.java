import org.pcap4j.core.*;
import org.pcap4j.packet.Packet;

public class PcapReader {
    public void readPcap(String filePath) {
        try {
            PcapHandle handle = Pcaps.openOffline(filePath);
            Packet packet;
            DPIEngine dpi = new DPIEngine();

            while ((packet = handle.getNextPacket()) != null) {
                dpi.processPacket(packet);
            }

            handle.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
