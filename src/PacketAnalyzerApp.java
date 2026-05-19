public class PacketAnalyzerApp {
    public static void main(String[] args) {
        String filePath = "test_dpi.pcap";
        PcapReader reader = new PcapReader();
        reader.readPcap(filePath);
    }
}
