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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortItem extends AbstractModel {

    /**
    * Listening Port Configuration
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Corresponds one-to-one with ports, indicating the protocol associated with the port.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Corresponds one-to-one with port, indicates the origin port
    */
    @SerializedName("UpstreamPort")
    @Expose
    private String UpstreamPort;

    /**
    * Corresponds one-to-one with Port, indicating the origin protocol
    */
    @SerializedName("UpstreamProtocol")
    @Expose
    private String UpstreamProtocol;

    /**
    * Nginx Server ID
    */
    @SerializedName("NginxServerId")
    @Expose
    private String NginxServerId;

    /**
     * Get Listening Port Configuration 
     * @return Port Listening Port Configuration
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Listening Port Configuration
     * @param Port Listening Port Configuration
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Corresponds one-to-one with ports, indicating the protocol associated with the port. 
     * @return Protocol Corresponds one-to-one with ports, indicating the protocol associated with the port.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Corresponds one-to-one with ports, indicating the protocol associated with the port.
     * @param Protocol Corresponds one-to-one with ports, indicating the protocol associated with the port.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Corresponds one-to-one with port, indicates the origin port 
     * @return UpstreamPort Corresponds one-to-one with port, indicates the origin port
     */
    public String getUpstreamPort() {
        return this.UpstreamPort;
    }

    /**
     * Set Corresponds one-to-one with port, indicates the origin port
     * @param UpstreamPort Corresponds one-to-one with port, indicates the origin port
     */
    public void setUpstreamPort(String UpstreamPort) {
        this.UpstreamPort = UpstreamPort;
    }

    /**
     * Get Corresponds one-to-one with Port, indicating the origin protocol 
     * @return UpstreamProtocol Corresponds one-to-one with Port, indicating the origin protocol
     */
    public String getUpstreamProtocol() {
        return this.UpstreamProtocol;
    }

    /**
     * Set Corresponds one-to-one with Port, indicating the origin protocol
     * @param UpstreamProtocol Corresponds one-to-one with Port, indicating the origin protocol
     */
    public void setUpstreamProtocol(String UpstreamProtocol) {
        this.UpstreamProtocol = UpstreamProtocol;
    }

    /**
     * Get Nginx Server ID 
     * @return NginxServerId Nginx Server ID
     */
    public String getNginxServerId() {
        return this.NginxServerId;
    }

    /**
     * Set Nginx Server ID
     * @param NginxServerId Nginx Server ID
     */
    public void setNginxServerId(String NginxServerId) {
        this.NginxServerId = NginxServerId;
    }

    public PortItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortItem(PortItem source) {
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.UpstreamPort != null) {
            this.UpstreamPort = new String(source.UpstreamPort);
        }
        if (source.UpstreamProtocol != null) {
            this.UpstreamProtocol = new String(source.UpstreamProtocol);
        }
        if (source.NginxServerId != null) {
            this.NginxServerId = new String(source.NginxServerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "UpstreamPort", this.UpstreamPort);
        this.setParamSimple(map, prefix + "UpstreamProtocol", this.UpstreamProtocol);
        this.setParamSimple(map, prefix + "NginxServerId", this.NginxServerId);

    }
}

