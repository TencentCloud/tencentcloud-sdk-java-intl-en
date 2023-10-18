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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAgent extends AbstractModel {

    /**
    * Agent name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Agent ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv4")
    @Expose
    private String Ipv4;

    /**
    * Heartbeat time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeartbeatTime")
    @Expose
    private String HeartbeatTime;

    /**
    * Last error
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastError")
    @Expose
    private String LastError;

    /**
    * Agent version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * Agent status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Agent name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Agent name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Agent name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Agent name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Agent ID 
     * @return AgentId Agent ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent ID
     * @param AgentId Agent ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ipv4 Agent IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIpv4() {
        return this.Ipv4;
    }

    /**
     * Set Agent IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ipv4 Agent IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv4(String Ipv4) {
        this.Ipv4 = Ipv4;
    }

    /**
     * Get Heartbeat time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HeartbeatTime Heartbeat time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHeartbeatTime() {
        return this.HeartbeatTime;
    }

    /**
     * Set Heartbeat time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HeartbeatTime Heartbeat time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeartbeatTime(String HeartbeatTime) {
        this.HeartbeatTime = HeartbeatTime;
    }

    /**
     * Get Last error
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastError Last error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastError() {
        return this.LastError;
    }

    /**
     * Set Last error
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastError Last error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastError(String LastError) {
        this.LastError = LastError;
    }

    /**
     * Get Agent version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AgentVersion Agent version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set Agent version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AgentVersion Agent version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get Agent status 
     * @return Status Agent status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status
     * @param Status Agent status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public PrometheusAgent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAgent(PrometheusAgent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ipv4 != null) {
            this.Ipv4 = new String(source.Ipv4);
        }
        if (source.HeartbeatTime != null) {
            this.HeartbeatTime = new String(source.HeartbeatTime);
        }
        if (source.LastError != null) {
            this.LastError = new String(source.LastError);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ipv4", this.Ipv4);
        this.setParamSimple(map, prefix + "HeartbeatTime", this.HeartbeatTime);
        this.setParamSimple(map, prefix + "LastError", this.LastError);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

