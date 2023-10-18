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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerNetwork extends AbstractModel {

    /**
    * Endpoint ID
    */
    @SerializedName("EndpointID")
    @Expose
    private String EndpointID;

    /**
    * Mode: `bridge`.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Network name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Network ID
    */
    @SerializedName("NetworkID")
    @Expose
    private String NetworkID;

    /**
    * Gateway
    */
    @SerializedName("Gateway")
    @Expose
    private String Gateway;

    /**
    * IPv4 address
    */
    @SerializedName("Ipv4")
    @Expose
    private String Ipv4;

    /**
    * IPv6 address
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * MAC address
    */
    @SerializedName("MAC")
    @Expose
    private String MAC;

    /**
     * Get Endpoint ID 
     * @return EndpointID Endpoint ID
     */
    public String getEndpointID() {
        return this.EndpointID;
    }

    /**
     * Set Endpoint ID
     * @param EndpointID Endpoint ID
     */
    public void setEndpointID(String EndpointID) {
        this.EndpointID = EndpointID;
    }

    /**
     * Get Mode: `bridge`. 
     * @return Mode Mode: `bridge`.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Mode: `bridge`.
     * @param Mode Mode: `bridge`.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Network name 
     * @return Name Network name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Network name
     * @param Name Network name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Network ID 
     * @return NetworkID Network ID
     */
    public String getNetworkID() {
        return this.NetworkID;
    }

    /**
     * Set Network ID
     * @param NetworkID Network ID
     */
    public void setNetworkID(String NetworkID) {
        this.NetworkID = NetworkID;
    }

    /**
     * Get Gateway 
     * @return Gateway Gateway
     */
    public String getGateway() {
        return this.Gateway;
    }

    /**
     * Set Gateway
     * @param Gateway Gateway
     */
    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    /**
     * Get IPv4 address 
     * @return Ipv4 IPv4 address
     */
    public String getIpv4() {
        return this.Ipv4;
    }

    /**
     * Set IPv4 address
     * @param Ipv4 IPv4 address
     */
    public void setIpv4(String Ipv4) {
        this.Ipv4 = Ipv4;
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
     * Get MAC address 
     * @return MAC MAC address
     */
    public String getMAC() {
        return this.MAC;
    }

    /**
     * Set MAC address
     * @param MAC MAC address
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public ContainerNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerNetwork(ContainerNetwork source) {
        if (source.EndpointID != null) {
            this.EndpointID = new String(source.EndpointID);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NetworkID != null) {
            this.NetworkID = new String(source.NetworkID);
        }
        if (source.Gateway != null) {
            this.Gateway = new String(source.Gateway);
        }
        if (source.Ipv4 != null) {
            this.Ipv4 = new String(source.Ipv4);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.MAC != null) {
            this.MAC = new String(source.MAC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointID", this.EndpointID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NetworkID", this.NetworkID);
        this.setParamSimple(map, prefix + "Gateway", this.Gateway);
        this.setParamSimple(map, prefix + "Ipv4", this.Ipv4);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "MAC", this.MAC);

    }
}

