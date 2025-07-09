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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetNetworkCardInfo extends AbstractModel {

    /**
    * Network interface name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IPv4 address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Gateway
    */
    @SerializedName("GateWay")
    @Expose
    private String GateWay;

    /**
    * MAC address
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * IPv6 address
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * DNS server
    */
    @SerializedName("DnsServer")
    @Expose
    private String DnsServer;

    /**
     * Get Network interface name 
     * @return Name Network interface name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Network interface name
     * @param Name Network interface name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IPv4 address 
     * @return Ip IPv4 address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IPv4 address
     * @param Ip IPv4 address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Gateway 
     * @return GateWay Gateway
     */
    public String getGateWay() {
        return this.GateWay;
    }

    /**
     * Set Gateway
     * @param GateWay Gateway
     */
    public void setGateWay(String GateWay) {
        this.GateWay = GateWay;
    }

    /**
     * Get MAC address 
     * @return Mac MAC address
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set MAC address
     * @param Mac MAC address
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get IPv6 address 
     * @return Ipv6 IPv6 address
     */
    public String getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set IPv6 address
     * @param Ipv6 IPv6 address
     */
    public void setIpv6(String Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get DNS server 
     * @return DnsServer DNS server
     */
    public String getDnsServer() {
        return this.DnsServer;
    }

    /**
     * Set DNS server
     * @param DnsServer DNS server
     */
    public void setDnsServer(String DnsServer) {
        this.DnsServer = DnsServer;
    }

    public AssetNetworkCardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetNetworkCardInfo(AssetNetworkCardInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.GateWay != null) {
            this.GateWay = new String(source.GateWay);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.DnsServer != null) {
            this.DnsServer = new String(source.DnsServer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "GateWay", this.GateWay);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "DnsServer", this.DnsServer);

    }
}

