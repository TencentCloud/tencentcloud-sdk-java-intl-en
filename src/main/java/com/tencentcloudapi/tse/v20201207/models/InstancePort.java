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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstancePort extends AbstractModel {

    /**
    * Listen http port range.
    */
    @SerializedName("HttpPort")
    @Expose
    private String HttpPort;

    /**
    * Listen port range for https.
    */
    @SerializedName("HttpsPort")
    @Expose
    private String HttpsPort;

    /**
    * Listen port range for tcp.
    */
    @SerializedName("TcpPort")
    @Expose
    private String TcpPort;

    /**
    * Listen udp port range.
    */
    @SerializedName("UdpPort")
    @Expose
    private String UdpPort;

    /**
     * Get Listen http port range. 
     * @return HttpPort Listen http port range.
     */
    public String getHttpPort() {
        return this.HttpPort;
    }

    /**
     * Set Listen http port range.
     * @param HttpPort Listen http port range.
     */
    public void setHttpPort(String HttpPort) {
        this.HttpPort = HttpPort;
    }

    /**
     * Get Listen port range for https. 
     * @return HttpsPort Listen port range for https.
     */
    public String getHttpsPort() {
        return this.HttpsPort;
    }

    /**
     * Set Listen port range for https.
     * @param HttpsPort Listen port range for https.
     */
    public void setHttpsPort(String HttpsPort) {
        this.HttpsPort = HttpsPort;
    }

    /**
     * Get Listen port range for tcp. 
     * @return TcpPort Listen port range for tcp.
     */
    public String getTcpPort() {
        return this.TcpPort;
    }

    /**
     * Set Listen port range for tcp.
     * @param TcpPort Listen port range for tcp.
     */
    public void setTcpPort(String TcpPort) {
        this.TcpPort = TcpPort;
    }

    /**
     * Get Listen udp port range. 
     * @return UdpPort Listen udp port range.
     */
    public String getUdpPort() {
        return this.UdpPort;
    }

    /**
     * Set Listen udp port range.
     * @param UdpPort Listen udp port range.
     */
    public void setUdpPort(String UdpPort) {
        this.UdpPort = UdpPort;
    }

    public InstancePort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePort(InstancePort source) {
        if (source.HttpPort != null) {
            this.HttpPort = new String(source.HttpPort);
        }
        if (source.HttpsPort != null) {
            this.HttpsPort = new String(source.HttpsPort);
        }
        if (source.TcpPort != null) {
            this.TcpPort = new String(source.TcpPort);
        }
        if (source.UdpPort != null) {
            this.UdpPort = new String(source.UdpPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpPort", this.HttpPort);
        this.setParamSimple(map, prefix + "HttpsPort", this.HttpsPort);
        this.setParamSimple(map, prefix + "TcpPort", this.TcpPort);
        this.setParamSimple(map, prefix + "UdpPort", this.UdpPort);

    }
}

