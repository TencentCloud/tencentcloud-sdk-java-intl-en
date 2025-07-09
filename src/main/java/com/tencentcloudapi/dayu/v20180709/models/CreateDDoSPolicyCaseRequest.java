/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class CreateDDoSPolicyCaseRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Policy scenario name string. Length limit: 64
    */
    @SerializedName("CaseName")
    @Expose
    private String CaseName;

    /**
    * Development platform. Valid values: [PC (PC client), MOBILE (mobile device), TV (TV), SERVER (server)]
    */
    @SerializedName("PlatformTypes")
    @Expose
    private String [] PlatformTypes;

    /**
    * Category. Valid values: [WEB (website), GAME (game), APP (application), OTHER (other)]
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * Application protocol. Valid values: [tcp (TCP protocol), udp (UDP protocol), icmp (ICMP protocol), all (other protocols)]
    */
    @SerializedName("AppProtocols")
    @Expose
    private String [] AppProtocols;

    /**
    * TCP start port. Value range: (0, 65535]
    */
    @SerializedName("TcpSportStart")
    @Expose
    private String TcpSportStart;

    /**
    * TCP end port. Value range: (0, 65535). It must be greater than or equal to the TCP start port.
    */
    @SerializedName("TcpSportEnd")
    @Expose
    private String TcpSportEnd;

    /**
    * UDP start port. Value range: (0, 65535]
    */
    @SerializedName("UdpSportStart")
    @Expose
    private String UdpSportStart;

    /**
    * UDP end port. Value range: (0, 65535). It must be greater than or equal to the UDP start port.
    */
    @SerializedName("UdpSportEnd")
    @Expose
    private String UdpSportEnd;

    /**
    * Whether there are customers outside China. Valid values: [no, yes]
    */
    @SerializedName("HasAbroad")
    @Expose
    private String HasAbroad;

    /**
    * Whether to actively initiate outbound TCP requests. Valid values: [no, yes]
    */
    @SerializedName("HasInitiateTcp")
    @Expose
    private String HasInitiateTcp;

    /**
    * Whether to actively initiate outbound UDP requests. Valid values: [no, yes]
    */
    @SerializedName("HasInitiateUdp")
    @Expose
    private String HasInitiateUdp;

    /**
    * Port that actively initiates TCP requests. Value range: (0, 65535]
    */
    @SerializedName("PeerTcpPort")
    @Expose
    private String PeerTcpPort;

    /**
    * Port that actively initiates UDP requests. Value range: (0, 65535]
    */
    @SerializedName("PeerUdpPort")
    @Expose
    private String PeerUdpPort;

    /**
    * Fixed feature code of TCP payload. Max string length: 512
    */
    @SerializedName("TcpFootprint")
    @Expose
    private String TcpFootprint;

    /**
    * Fixed feature code of UDP payload. Max string length: 512
    */
    @SerializedName("UdpFootprint")
    @Expose
    private String UdpFootprint;

    /**
    * Web application API URL
    */
    @SerializedName("WebApiUrl")
    @Expose
    private String [] WebApiUrl;

    /**
    * Minimum length of TCP packet. Value range: (0, 1500)
    */
    @SerializedName("MinTcpPackageLen")
    @Expose
    private String MinTcpPackageLen;

    /**
    * Maximum length of TCP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of TCP packet
    */
    @SerializedName("MaxTcpPackageLen")
    @Expose
    private String MaxTcpPackageLen;

    /**
    * Minimum length of UDP packet. Value range: (0, 1500)
    */
    @SerializedName("MinUdpPackageLen")
    @Expose
    private String MinUdpPackageLen;

    /**
    * Maximum length of UDP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of UDP packet
    */
    @SerializedName("MaxUdpPackageLen")
    @Expose
    private String MaxUdpPackageLen;

    /**
    * Whether there are applications using VPN. Valid values: [no, yes]
    */
    @SerializedName("HasVPN")
    @Expose
    private String HasVPN;

    /**
    * TCP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
    */
    @SerializedName("TcpPortList")
    @Expose
    private String TcpPortList;

    /**
    * UDP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
    */
    @SerializedName("UdpPortList")
    @Expose
    private String UdpPortList;

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
     * Get Policy scenario name string. Length limit: 64 
     * @return CaseName Policy scenario name string. Length limit: 64
     */
    public String getCaseName() {
        return this.CaseName;
    }

    /**
     * Set Policy scenario name string. Length limit: 64
     * @param CaseName Policy scenario name string. Length limit: 64
     */
    public void setCaseName(String CaseName) {
        this.CaseName = CaseName;
    }

    /**
     * Get Development platform. Valid values: [PC (PC client), MOBILE (mobile device), TV (TV), SERVER (server)] 
     * @return PlatformTypes Development platform. Valid values: [PC (PC client), MOBILE (mobile device), TV (TV), SERVER (server)]
     */
    public String [] getPlatformTypes() {
        return this.PlatformTypes;
    }

    /**
     * Set Development platform. Valid values: [PC (PC client), MOBILE (mobile device), TV (TV), SERVER (server)]
     * @param PlatformTypes Development platform. Valid values: [PC (PC client), MOBILE (mobile device), TV (TV), SERVER (server)]
     */
    public void setPlatformTypes(String [] PlatformTypes) {
        this.PlatformTypes = PlatformTypes;
    }

    /**
     * Get Category. Valid values: [WEB (website), GAME (game), APP (application), OTHER (other)] 
     * @return AppType Category. Valid values: [WEB (website), GAME (game), APP (application), OTHER (other)]
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Category. Valid values: [WEB (website), GAME (game), APP (application), OTHER (other)]
     * @param AppType Category. Valid values: [WEB (website), GAME (game), APP (application), OTHER (other)]
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get Application protocol. Valid values: [tcp (TCP protocol), udp (UDP protocol), icmp (ICMP protocol), all (other protocols)] 
     * @return AppProtocols Application protocol. Valid values: [tcp (TCP protocol), udp (UDP protocol), icmp (ICMP protocol), all (other protocols)]
     */
    public String [] getAppProtocols() {
        return this.AppProtocols;
    }

    /**
     * Set Application protocol. Valid values: [tcp (TCP protocol), udp (UDP protocol), icmp (ICMP protocol), all (other protocols)]
     * @param AppProtocols Application protocol. Valid values: [tcp (TCP protocol), udp (UDP protocol), icmp (ICMP protocol), all (other protocols)]
     */
    public void setAppProtocols(String [] AppProtocols) {
        this.AppProtocols = AppProtocols;
    }

    /**
     * Get TCP start port. Value range: (0, 65535] 
     * @return TcpSportStart TCP start port. Value range: (0, 65535]
     */
    public String getTcpSportStart() {
        return this.TcpSportStart;
    }

    /**
     * Set TCP start port. Value range: (0, 65535]
     * @param TcpSportStart TCP start port. Value range: (0, 65535]
     */
    public void setTcpSportStart(String TcpSportStart) {
        this.TcpSportStart = TcpSportStart;
    }

    /**
     * Get TCP end port. Value range: (0, 65535). It must be greater than or equal to the TCP start port. 
     * @return TcpSportEnd TCP end port. Value range: (0, 65535). It must be greater than or equal to the TCP start port.
     */
    public String getTcpSportEnd() {
        return this.TcpSportEnd;
    }

    /**
     * Set TCP end port. Value range: (0, 65535). It must be greater than or equal to the TCP start port.
     * @param TcpSportEnd TCP end port. Value range: (0, 65535). It must be greater than or equal to the TCP start port.
     */
    public void setTcpSportEnd(String TcpSportEnd) {
        this.TcpSportEnd = TcpSportEnd;
    }

    /**
     * Get UDP start port. Value range: (0, 65535] 
     * @return UdpSportStart UDP start port. Value range: (0, 65535]
     */
    public String getUdpSportStart() {
        return this.UdpSportStart;
    }

    /**
     * Set UDP start port. Value range: (0, 65535]
     * @param UdpSportStart UDP start port. Value range: (0, 65535]
     */
    public void setUdpSportStart(String UdpSportStart) {
        this.UdpSportStart = UdpSportStart;
    }

    /**
     * Get UDP end port. Value range: (0, 65535). It must be greater than or equal to the UDP start port. 
     * @return UdpSportEnd UDP end port. Value range: (0, 65535). It must be greater than or equal to the UDP start port.
     */
    public String getUdpSportEnd() {
        return this.UdpSportEnd;
    }

    /**
     * Set UDP end port. Value range: (0, 65535). It must be greater than or equal to the UDP start port.
     * @param UdpSportEnd UDP end port. Value range: (0, 65535). It must be greater than or equal to the UDP start port.
     */
    public void setUdpSportEnd(String UdpSportEnd) {
        this.UdpSportEnd = UdpSportEnd;
    }

    /**
     * Get Whether there are customers outside China. Valid values: [no, yes] 
     * @return HasAbroad Whether there are customers outside China. Valid values: [no, yes]
     */
    public String getHasAbroad() {
        return this.HasAbroad;
    }

    /**
     * Set Whether there are customers outside China. Valid values: [no, yes]
     * @param HasAbroad Whether there are customers outside China. Valid values: [no, yes]
     */
    public void setHasAbroad(String HasAbroad) {
        this.HasAbroad = HasAbroad;
    }

    /**
     * Get Whether to actively initiate outbound TCP requests. Valid values: [no, yes] 
     * @return HasInitiateTcp Whether to actively initiate outbound TCP requests. Valid values: [no, yes]
     */
    public String getHasInitiateTcp() {
        return this.HasInitiateTcp;
    }

    /**
     * Set Whether to actively initiate outbound TCP requests. Valid values: [no, yes]
     * @param HasInitiateTcp Whether to actively initiate outbound TCP requests. Valid values: [no, yes]
     */
    public void setHasInitiateTcp(String HasInitiateTcp) {
        this.HasInitiateTcp = HasInitiateTcp;
    }

    /**
     * Get Whether to actively initiate outbound UDP requests. Valid values: [no, yes] 
     * @return HasInitiateUdp Whether to actively initiate outbound UDP requests. Valid values: [no, yes]
     */
    public String getHasInitiateUdp() {
        return this.HasInitiateUdp;
    }

    /**
     * Set Whether to actively initiate outbound UDP requests. Valid values: [no, yes]
     * @param HasInitiateUdp Whether to actively initiate outbound UDP requests. Valid values: [no, yes]
     */
    public void setHasInitiateUdp(String HasInitiateUdp) {
        this.HasInitiateUdp = HasInitiateUdp;
    }

    /**
     * Get Port that actively initiates TCP requests. Value range: (0, 65535] 
     * @return PeerTcpPort Port that actively initiates TCP requests. Value range: (0, 65535]
     */
    public String getPeerTcpPort() {
        return this.PeerTcpPort;
    }

    /**
     * Set Port that actively initiates TCP requests. Value range: (0, 65535]
     * @param PeerTcpPort Port that actively initiates TCP requests. Value range: (0, 65535]
     */
    public void setPeerTcpPort(String PeerTcpPort) {
        this.PeerTcpPort = PeerTcpPort;
    }

    /**
     * Get Port that actively initiates UDP requests. Value range: (0, 65535] 
     * @return PeerUdpPort Port that actively initiates UDP requests. Value range: (0, 65535]
     */
    public String getPeerUdpPort() {
        return this.PeerUdpPort;
    }

    /**
     * Set Port that actively initiates UDP requests. Value range: (0, 65535]
     * @param PeerUdpPort Port that actively initiates UDP requests. Value range: (0, 65535]
     */
    public void setPeerUdpPort(String PeerUdpPort) {
        this.PeerUdpPort = PeerUdpPort;
    }

    /**
     * Get Fixed feature code of TCP payload. Max string length: 512 
     * @return TcpFootprint Fixed feature code of TCP payload. Max string length: 512
     */
    public String getTcpFootprint() {
        return this.TcpFootprint;
    }

    /**
     * Set Fixed feature code of TCP payload. Max string length: 512
     * @param TcpFootprint Fixed feature code of TCP payload. Max string length: 512
     */
    public void setTcpFootprint(String TcpFootprint) {
        this.TcpFootprint = TcpFootprint;
    }

    /**
     * Get Fixed feature code of UDP payload. Max string length: 512 
     * @return UdpFootprint Fixed feature code of UDP payload. Max string length: 512
     */
    public String getUdpFootprint() {
        return this.UdpFootprint;
    }

    /**
     * Set Fixed feature code of UDP payload. Max string length: 512
     * @param UdpFootprint Fixed feature code of UDP payload. Max string length: 512
     */
    public void setUdpFootprint(String UdpFootprint) {
        this.UdpFootprint = UdpFootprint;
    }

    /**
     * Get Web application API URL 
     * @return WebApiUrl Web application API URL
     */
    public String [] getWebApiUrl() {
        return this.WebApiUrl;
    }

    /**
     * Set Web application API URL
     * @param WebApiUrl Web application API URL
     */
    public void setWebApiUrl(String [] WebApiUrl) {
        this.WebApiUrl = WebApiUrl;
    }

    /**
     * Get Minimum length of TCP packet. Value range: (0, 1500) 
     * @return MinTcpPackageLen Minimum length of TCP packet. Value range: (0, 1500)
     */
    public String getMinTcpPackageLen() {
        return this.MinTcpPackageLen;
    }

    /**
     * Set Minimum length of TCP packet. Value range: (0, 1500)
     * @param MinTcpPackageLen Minimum length of TCP packet. Value range: (0, 1500)
     */
    public void setMinTcpPackageLen(String MinTcpPackageLen) {
        this.MinTcpPackageLen = MinTcpPackageLen;
    }

    /**
     * Get Maximum length of TCP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of TCP packet 
     * @return MaxTcpPackageLen Maximum length of TCP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of TCP packet
     */
    public String getMaxTcpPackageLen() {
        return this.MaxTcpPackageLen;
    }

    /**
     * Set Maximum length of TCP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of TCP packet
     * @param MaxTcpPackageLen Maximum length of TCP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of TCP packet
     */
    public void setMaxTcpPackageLen(String MaxTcpPackageLen) {
        this.MaxTcpPackageLen = MaxTcpPackageLen;
    }

    /**
     * Get Minimum length of UDP packet. Value range: (0, 1500) 
     * @return MinUdpPackageLen Minimum length of UDP packet. Value range: (0, 1500)
     */
    public String getMinUdpPackageLen() {
        return this.MinUdpPackageLen;
    }

    /**
     * Set Minimum length of UDP packet. Value range: (0, 1500)
     * @param MinUdpPackageLen Minimum length of UDP packet. Value range: (0, 1500)
     */
    public void setMinUdpPackageLen(String MinUdpPackageLen) {
        this.MinUdpPackageLen = MinUdpPackageLen;
    }

    /**
     * Get Maximum length of UDP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of UDP packet 
     * @return MaxUdpPackageLen Maximum length of UDP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of UDP packet
     */
    public String getMaxUdpPackageLen() {
        return this.MaxUdpPackageLen;
    }

    /**
     * Set Maximum length of UDP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of UDP packet
     * @param MaxUdpPackageLen Maximum length of UDP packet. Value range: (0, 1500). It must be greater than or equal to the minimum length of UDP packet
     */
    public void setMaxUdpPackageLen(String MaxUdpPackageLen) {
        this.MaxUdpPackageLen = MaxUdpPackageLen;
    }

    /**
     * Get Whether there are applications using VPN. Valid values: [no, yes] 
     * @return HasVPN Whether there are applications using VPN. Valid values: [no, yes]
     */
    public String getHasVPN() {
        return this.HasVPN;
    }

    /**
     * Set Whether there are applications using VPN. Valid values: [no, yes]
     * @param HasVPN Whether there are applications using VPN. Valid values: [no, yes]
     */
    public void setHasVPN(String HasVPN) {
        this.HasVPN = HasVPN;
    }

    /**
     * Get TCP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000. 
     * @return TcpPortList TCP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
     */
    public String getTcpPortList() {
        return this.TcpPortList;
    }

    /**
     * Set TCP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
     * @param TcpPortList TCP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
     */
    public void setTcpPortList(String TcpPortList) {
        this.TcpPortList = TcpPortList;
    }

    /**
     * Get UDP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000. 
     * @return UdpPortList UDP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
     */
    public String getUdpPortList() {
        return this.UdpPortList;
    }

    /**
     * Set UDP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
     * @param UdpPortList UDP port list. You can enter a single port, or a port range. Format: 80,443,700-800,53,1000-3000.
     */
    public void setUdpPortList(String UdpPortList) {
        this.UdpPortList = UdpPortList;
    }

    public CreateDDoSPolicyCaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDDoSPolicyCaseRequest(CreateDDoSPolicyCaseRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.CaseName != null) {
            this.CaseName = new String(source.CaseName);
        }
        if (source.PlatformTypes != null) {
            this.PlatformTypes = new String[source.PlatformTypes.length];
            for (int i = 0; i < source.PlatformTypes.length; i++) {
                this.PlatformTypes[i] = new String(source.PlatformTypes[i]);
            }
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.AppProtocols != null) {
            this.AppProtocols = new String[source.AppProtocols.length];
            for (int i = 0; i < source.AppProtocols.length; i++) {
                this.AppProtocols[i] = new String(source.AppProtocols[i]);
            }
        }
        if (source.TcpSportStart != null) {
            this.TcpSportStart = new String(source.TcpSportStart);
        }
        if (source.TcpSportEnd != null) {
            this.TcpSportEnd = new String(source.TcpSportEnd);
        }
        if (source.UdpSportStart != null) {
            this.UdpSportStart = new String(source.UdpSportStart);
        }
        if (source.UdpSportEnd != null) {
            this.UdpSportEnd = new String(source.UdpSportEnd);
        }
        if (source.HasAbroad != null) {
            this.HasAbroad = new String(source.HasAbroad);
        }
        if (source.HasInitiateTcp != null) {
            this.HasInitiateTcp = new String(source.HasInitiateTcp);
        }
        if (source.HasInitiateUdp != null) {
            this.HasInitiateUdp = new String(source.HasInitiateUdp);
        }
        if (source.PeerTcpPort != null) {
            this.PeerTcpPort = new String(source.PeerTcpPort);
        }
        if (source.PeerUdpPort != null) {
            this.PeerUdpPort = new String(source.PeerUdpPort);
        }
        if (source.TcpFootprint != null) {
            this.TcpFootprint = new String(source.TcpFootprint);
        }
        if (source.UdpFootprint != null) {
            this.UdpFootprint = new String(source.UdpFootprint);
        }
        if (source.WebApiUrl != null) {
            this.WebApiUrl = new String[source.WebApiUrl.length];
            for (int i = 0; i < source.WebApiUrl.length; i++) {
                this.WebApiUrl[i] = new String(source.WebApiUrl[i]);
            }
        }
        if (source.MinTcpPackageLen != null) {
            this.MinTcpPackageLen = new String(source.MinTcpPackageLen);
        }
        if (source.MaxTcpPackageLen != null) {
            this.MaxTcpPackageLen = new String(source.MaxTcpPackageLen);
        }
        if (source.MinUdpPackageLen != null) {
            this.MinUdpPackageLen = new String(source.MinUdpPackageLen);
        }
        if (source.MaxUdpPackageLen != null) {
            this.MaxUdpPackageLen = new String(source.MaxUdpPackageLen);
        }
        if (source.HasVPN != null) {
            this.HasVPN = new String(source.HasVPN);
        }
        if (source.TcpPortList != null) {
            this.TcpPortList = new String(source.TcpPortList);
        }
        if (source.UdpPortList != null) {
            this.UdpPortList = new String(source.UdpPortList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "CaseName", this.CaseName);
        this.setParamArraySimple(map, prefix + "PlatformTypes.", this.PlatformTypes);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamArraySimple(map, prefix + "AppProtocols.", this.AppProtocols);
        this.setParamSimple(map, prefix + "TcpSportStart", this.TcpSportStart);
        this.setParamSimple(map, prefix + "TcpSportEnd", this.TcpSportEnd);
        this.setParamSimple(map, prefix + "UdpSportStart", this.UdpSportStart);
        this.setParamSimple(map, prefix + "UdpSportEnd", this.UdpSportEnd);
        this.setParamSimple(map, prefix + "HasAbroad", this.HasAbroad);
        this.setParamSimple(map, prefix + "HasInitiateTcp", this.HasInitiateTcp);
        this.setParamSimple(map, prefix + "HasInitiateUdp", this.HasInitiateUdp);
        this.setParamSimple(map, prefix + "PeerTcpPort", this.PeerTcpPort);
        this.setParamSimple(map, prefix + "PeerUdpPort", this.PeerUdpPort);
        this.setParamSimple(map, prefix + "TcpFootprint", this.TcpFootprint);
        this.setParamSimple(map, prefix + "UdpFootprint", this.UdpFootprint);
        this.setParamArraySimple(map, prefix + "WebApiUrl.", this.WebApiUrl);
        this.setParamSimple(map, prefix + "MinTcpPackageLen", this.MinTcpPackageLen);
        this.setParamSimple(map, prefix + "MaxTcpPackageLen", this.MaxTcpPackageLen);
        this.setParamSimple(map, prefix + "MinUdpPackageLen", this.MinUdpPackageLen);
        this.setParamSimple(map, prefix + "MaxUdpPackageLen", this.MaxUdpPackageLen);
        this.setParamSimple(map, prefix + "HasVPN", this.HasVPN);
        this.setParamSimple(map, prefix + "TcpPortList", this.TcpPortList);
        this.setParamSimple(map, prefix + "UdpPortList", this.UdpPortList);

    }
}

