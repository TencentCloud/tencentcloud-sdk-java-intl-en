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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassicalHealth extends AbstractModel{

    /**
    * Private IP of a real server
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Real server port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * CLB listener port
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * Forwarding protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Health check result. Value range: 1 (healthy), 0 (unhealthy)
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long HealthStatus;

    /**
     * Get Private IP of a real server 
     * @return IP Private IP of a real server
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Private IP of a real server
     * @param IP Private IP of a real server
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Real server port 
     * @return Port Real server port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Real server port
     * @param Port Real server port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get CLB listener port 
     * @return ListenerPort CLB listener port
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set CLB listener port
     * @param ListenerPort CLB listener port
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get Forwarding protocol 
     * @return Protocol Forwarding protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol
     * @param Protocol Forwarding protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Health check result. Value range: 1 (healthy), 0 (unhealthy) 
     * @return HealthStatus Health check result. Value range: 1 (healthy), 0 (unhealthy)
     */
    public Long getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Health check result. Value range: 1 (healthy), 0 (unhealthy)
     * @param HealthStatus Health check result. Value range: 1 (healthy), 0 (unhealthy)
     */
    public void setHealthStatus(Long HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);

    }
}

