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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpartaProtectionPort extends AbstractModel {

    /**
    * nginx Id
    */
    @SerializedName("NginxServerId")
    @Expose
    private Long NginxServerId;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Backend port
    */
    @SerializedName("UpstreamPort")
    @Expose
    private String UpstreamPort;

    /**
    * Backend protocol
    */
    @SerializedName("UpstreamProtocol")
    @Expose
    private String UpstreamProtocol;

    /**
     * Get nginx Id 
     * @return NginxServerId nginx Id
     */
    public Long getNginxServerId() {
        return this.NginxServerId;
    }

    /**
     * Set nginx Id
     * @param NginxServerId nginx Id
     */
    public void setNginxServerId(Long NginxServerId) {
        this.NginxServerId = NginxServerId;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Backend port 
     * @return UpstreamPort Backend port
     */
    public String getUpstreamPort() {
        return this.UpstreamPort;
    }

    /**
     * Set Backend port
     * @param UpstreamPort Backend port
     */
    public void setUpstreamPort(String UpstreamPort) {
        this.UpstreamPort = UpstreamPort;
    }

    /**
     * Get Backend protocol 
     * @return UpstreamProtocol Backend protocol
     */
    public String getUpstreamProtocol() {
        return this.UpstreamProtocol;
    }

    /**
     * Set Backend protocol
     * @param UpstreamProtocol Backend protocol
     */
    public void setUpstreamProtocol(String UpstreamProtocol) {
        this.UpstreamProtocol = UpstreamProtocol;
    }

    public SpartaProtectionPort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpartaProtectionPort(SpartaProtectionPort source) {
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

