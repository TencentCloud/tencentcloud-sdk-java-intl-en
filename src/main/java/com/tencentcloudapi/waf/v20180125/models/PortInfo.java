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

public class PortInfo extends AbstractModel {

    /**
    * Nginx Server ID
    */
    @SerializedName("NginxServerId")
    @Expose
    private Long NginxServerId;

    /**
    * Listening Port Configuration
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Protocol Corresponding to the Port
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Origin-pull port
    */
    @SerializedName("UpstreamPort")
    @Expose
    private String UpstreamPort;

    /**
    * Origin-pull protocol
    */
    @SerializedName("UpstreamProtocol")
    @Expose
    private String UpstreamProtocol;

    /**
     * Get Nginx Server ID 
     * @return NginxServerId Nginx Server ID
     */
    public Long getNginxServerId() {
        return this.NginxServerId;
    }

    /**
     * Set Nginx Server ID
     * @param NginxServerId Nginx Server ID
     */
    public void setNginxServerId(Long NginxServerId) {
        this.NginxServerId = NginxServerId;
    }

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
     * Get Protocol Corresponding to the Port 
     * @return Protocol Protocol Corresponding to the Port
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol Corresponding to the Port
     * @param Protocol Protocol Corresponding to the Port
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Origin-pull port 
     * @return UpstreamPort Origin-pull port
     */
    public String getUpstreamPort() {
        return this.UpstreamPort;
    }

    /**
     * Set Origin-pull port
     * @param UpstreamPort Origin-pull port
     */
    public void setUpstreamPort(String UpstreamPort) {
        this.UpstreamPort = UpstreamPort;
    }

    /**
     * Get Origin-pull protocol 
     * @return UpstreamProtocol Origin-pull protocol
     */
    public String getUpstreamProtocol() {
        return this.UpstreamProtocol;
    }

    /**
     * Set Origin-pull protocol
     * @param UpstreamProtocol Origin-pull protocol
     */
    public void setUpstreamProtocol(String UpstreamProtocol) {
        this.UpstreamProtocol = UpstreamProtocol;
    }

    public PortInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortInfo(PortInfo source) {
        if (source.NginxServerId != null) {
            this.NginxServerId = new Long(source.NginxServerId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NginxServerId", this.NginxServerId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "UpstreamPort", this.UpstreamPort);
        this.setParamSimple(map, prefix + "UpstreamProtocol", this.UpstreamProtocol);

    }
}

