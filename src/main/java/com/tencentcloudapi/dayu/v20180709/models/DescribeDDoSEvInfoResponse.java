/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSEvInfoResponse extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Resource IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Attack start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Attack end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of TCP attack packets
    */
    @SerializedName("TcpPacketSum")
    @Expose
    private Long TcpPacketSum;

    /**
    * Traffic of TCP attacks in KB
    */
    @SerializedName("TcpKBSum")
    @Expose
    private Long TcpKBSum;

    /**
    * Number of UDP attack packets
    */
    @SerializedName("UdpPacketSum")
    @Expose
    private Long UdpPacketSum;

    /**
    * Traffic of UDP attacks in KB
    */
    @SerializedName("UdpKBSum")
    @Expose
    private Long UdpKBSum;

    /**
    * Number of ICMP attack packets
    */
    @SerializedName("IcmpPacketSum")
    @Expose
    private Long IcmpPacketSum;

    /**
    * Traffic of ICMP attacks in KB
    */
    @SerializedName("IcmpKBSum")
    @Expose
    private Long IcmpKBSum;

    /**
    * Number of other attack packets
    */
    @SerializedName("OtherPacketSum")
    @Expose
    private Long OtherPacketSum;

    /**
    * Traffic of other attacks in KB
    */
    @SerializedName("OtherKBSum")
    @Expose
    private Long OtherKBSum;

    /**
    * Total attack traffic in KB
    */
    @SerializedName("TotalTraffic")
    @Expose
    private Long TotalTraffic;

    /**
    * Attack traffic bandwidth peak
    */
    @SerializedName("Mbps")
    @Expose
    private Long Mbps;

    /**
    * Attack packet rate peak
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * PCAP file download link
    */
    @SerializedName("PcapUrl")
    @Expose
    private String [] PcapUrl;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Resource IP 
     * @return Ip Resource IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Resource IP
     * @param Ip Resource IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Attack start time 
     * @return StartTime Attack start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Attack start time
     * @param StartTime Attack start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Attack end time 
     * @return EndTime Attack end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Attack end time
     * @param EndTime Attack end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of TCP attack packets 
     * @return TcpPacketSum Number of TCP attack packets
     */
    public Long getTcpPacketSum() {
        return this.TcpPacketSum;
    }

    /**
     * Set Number of TCP attack packets
     * @param TcpPacketSum Number of TCP attack packets
     */
    public void setTcpPacketSum(Long TcpPacketSum) {
        this.TcpPacketSum = TcpPacketSum;
    }

    /**
     * Get Traffic of TCP attacks in KB 
     * @return TcpKBSum Traffic of TCP attacks in KB
     */
    public Long getTcpKBSum() {
        return this.TcpKBSum;
    }

    /**
     * Set Traffic of TCP attacks in KB
     * @param TcpKBSum Traffic of TCP attacks in KB
     */
    public void setTcpKBSum(Long TcpKBSum) {
        this.TcpKBSum = TcpKBSum;
    }

    /**
     * Get Number of UDP attack packets 
     * @return UdpPacketSum Number of UDP attack packets
     */
    public Long getUdpPacketSum() {
        return this.UdpPacketSum;
    }

    /**
     * Set Number of UDP attack packets
     * @param UdpPacketSum Number of UDP attack packets
     */
    public void setUdpPacketSum(Long UdpPacketSum) {
        this.UdpPacketSum = UdpPacketSum;
    }

    /**
     * Get Traffic of UDP attacks in KB 
     * @return UdpKBSum Traffic of UDP attacks in KB
     */
    public Long getUdpKBSum() {
        return this.UdpKBSum;
    }

    /**
     * Set Traffic of UDP attacks in KB
     * @param UdpKBSum Traffic of UDP attacks in KB
     */
    public void setUdpKBSum(Long UdpKBSum) {
        this.UdpKBSum = UdpKBSum;
    }

    /**
     * Get Number of ICMP attack packets 
     * @return IcmpPacketSum Number of ICMP attack packets
     */
    public Long getIcmpPacketSum() {
        return this.IcmpPacketSum;
    }

    /**
     * Set Number of ICMP attack packets
     * @param IcmpPacketSum Number of ICMP attack packets
     */
    public void setIcmpPacketSum(Long IcmpPacketSum) {
        this.IcmpPacketSum = IcmpPacketSum;
    }

    /**
     * Get Traffic of ICMP attacks in KB 
     * @return IcmpKBSum Traffic of ICMP attacks in KB
     */
    public Long getIcmpKBSum() {
        return this.IcmpKBSum;
    }

    /**
     * Set Traffic of ICMP attacks in KB
     * @param IcmpKBSum Traffic of ICMP attacks in KB
     */
    public void setIcmpKBSum(Long IcmpKBSum) {
        this.IcmpKBSum = IcmpKBSum;
    }

    /**
     * Get Number of other attack packets 
     * @return OtherPacketSum Number of other attack packets
     */
    public Long getOtherPacketSum() {
        return this.OtherPacketSum;
    }

    /**
     * Set Number of other attack packets
     * @param OtherPacketSum Number of other attack packets
     */
    public void setOtherPacketSum(Long OtherPacketSum) {
        this.OtherPacketSum = OtherPacketSum;
    }

    /**
     * Get Traffic of other attacks in KB 
     * @return OtherKBSum Traffic of other attacks in KB
     */
    public Long getOtherKBSum() {
        return this.OtherKBSum;
    }

    /**
     * Set Traffic of other attacks in KB
     * @param OtherKBSum Traffic of other attacks in KB
     */
    public void setOtherKBSum(Long OtherKBSum) {
        this.OtherKBSum = OtherKBSum;
    }

    /**
     * Get Total attack traffic in KB 
     * @return TotalTraffic Total attack traffic in KB
     */
    public Long getTotalTraffic() {
        return this.TotalTraffic;
    }

    /**
     * Set Total attack traffic in KB
     * @param TotalTraffic Total attack traffic in KB
     */
    public void setTotalTraffic(Long TotalTraffic) {
        this.TotalTraffic = TotalTraffic;
    }

    /**
     * Get Attack traffic bandwidth peak 
     * @return Mbps Attack traffic bandwidth peak
     */
    public Long getMbps() {
        return this.Mbps;
    }

    /**
     * Set Attack traffic bandwidth peak
     * @param Mbps Attack traffic bandwidth peak
     */
    public void setMbps(Long Mbps) {
        this.Mbps = Mbps;
    }

    /**
     * Get Attack packet rate peak 
     * @return Pps Attack packet rate peak
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * Set Attack packet rate peak
     * @param Pps Attack packet rate peak
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
    }

    /**
     * Get PCAP file download link 
     * @return PcapUrl PCAP file download link
     */
    public String [] getPcapUrl() {
        return this.PcapUrl;
    }

    /**
     * Set PCAP file download link
     * @param PcapUrl PCAP file download link
     */
    public void setPcapUrl(String [] PcapUrl) {
        this.PcapUrl = PcapUrl;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDDoSEvInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSEvInfoResponse(DescribeDDoSEvInfoResponse source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TcpPacketSum != null) {
            this.TcpPacketSum = new Long(source.TcpPacketSum);
        }
        if (source.TcpKBSum != null) {
            this.TcpKBSum = new Long(source.TcpKBSum);
        }
        if (source.UdpPacketSum != null) {
            this.UdpPacketSum = new Long(source.UdpPacketSum);
        }
        if (source.UdpKBSum != null) {
            this.UdpKBSum = new Long(source.UdpKBSum);
        }
        if (source.IcmpPacketSum != null) {
            this.IcmpPacketSum = new Long(source.IcmpPacketSum);
        }
        if (source.IcmpKBSum != null) {
            this.IcmpKBSum = new Long(source.IcmpKBSum);
        }
        if (source.OtherPacketSum != null) {
            this.OtherPacketSum = new Long(source.OtherPacketSum);
        }
        if (source.OtherKBSum != null) {
            this.OtherKBSum = new Long(source.OtherKBSum);
        }
        if (source.TotalTraffic != null) {
            this.TotalTraffic = new Long(source.TotalTraffic);
        }
        if (source.Mbps != null) {
            this.Mbps = new Long(source.Mbps);
        }
        if (source.Pps != null) {
            this.Pps = new Long(source.Pps);
        }
        if (source.PcapUrl != null) {
            this.PcapUrl = new String[source.PcapUrl.length];
            for (int i = 0; i < source.PcapUrl.length; i++) {
                this.PcapUrl[i] = new String(source.PcapUrl[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TcpPacketSum", this.TcpPacketSum);
        this.setParamSimple(map, prefix + "TcpKBSum", this.TcpKBSum);
        this.setParamSimple(map, prefix + "UdpPacketSum", this.UdpPacketSum);
        this.setParamSimple(map, prefix + "UdpKBSum", this.UdpKBSum);
        this.setParamSimple(map, prefix + "IcmpPacketSum", this.IcmpPacketSum);
        this.setParamSimple(map, prefix + "IcmpKBSum", this.IcmpKBSum);
        this.setParamSimple(map, prefix + "OtherPacketSum", this.OtherPacketSum);
        this.setParamSimple(map, prefix + "OtherKBSum", this.OtherKBSum);
        this.setParamSimple(map, prefix + "TotalTraffic", this.TotalTraffic);
        this.setParamSimple(map, prefix + "Mbps", this.Mbps);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamArraySimple(map, prefix + "PcapUrl.", this.PcapUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

