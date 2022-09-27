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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DockerContainerPublishPort extends AbstractModel{

    /**
    * Host port
    */
    @SerializedName("HostPort")
    @Expose
    private Long HostPort;

    /**
    * Container port
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * External IP. It defaults to 0.0.0.0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * The protocol defaults to `tcp`. Valid values: `tcp`, `udp` and `sctp`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Host port 
     * @return HostPort Host port
     */
    public Long getHostPort() {
        return this.HostPort;
    }

    /**
     * Set Host port
     * @param HostPort Host port
     */
    public void setHostPort(Long HostPort) {
        this.HostPort = HostPort;
    }

    /**
     * Get Container port 
     * @return ContainerPort Container port
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set Container port
     * @param ContainerPort Container port
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get External IP. It defaults to 0.0.0.0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ip External IP. It defaults to 0.0.0.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set External IP. It defaults to 0.0.0.0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ip External IP. It defaults to 0.0.0.0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get The protocol defaults to `tcp`. Valid values: `tcp`, `udp` and `sctp`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol The protocol defaults to `tcp`. Valid values: `tcp`, `udp` and `sctp`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol defaults to `tcp`. Valid values: `tcp`, `udp` and `sctp`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol The protocol defaults to `tcp`. Valid values: `tcp`, `udp` and `sctp`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public DockerContainerPublishPort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerContainerPublishPort(DockerContainerPublishPort source) {
        if (source.HostPort != null) {
            this.HostPort = new Long(source.HostPort);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostPort", this.HostPort);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

