public class ParsedPacket {
    private String srcIp;
    private String dstIp;
    private String payload;

    public String getSrcIp() { return srcIp; }
    public void setSrcIp(String srcIp) { this.srcIp = srcIp; }

    public String getDstIp() { return dstIp; }
    public void setDstIp(String dstIp) { this.dstIp = dstIp; }

    public String getPayload() { return payload; }
    public void setPayload(String payload) { this.payload = payload; }
}
