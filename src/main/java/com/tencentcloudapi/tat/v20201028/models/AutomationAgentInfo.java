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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutomationAgentInfo extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent version.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Last heartbeat time
    */
    @SerializedName("LastHeartbeatTime")
    @Expose
    private String LastHeartbeatTime;

    /**
    * Agent status. Valid values:
<li> `Online`
<li> `Offline`
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * Agent runtime environment. Valid values:
<li> `Linux`: Linux instance
<li> `Windows`: Windows instance
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Features supported by the TAT agent.
    */
    @SerializedName("SupportFeatures")
    @Expose
    private String [] SupportFeatures;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent version. 
     * @return Version Agent version.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Agent version.
     * @param Version Agent version.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Last heartbeat time 
     * @return LastHeartbeatTime Last heartbeat time
     */
    public String getLastHeartbeatTime() {
        return this.LastHeartbeatTime;
    }

    /**
     * Set Last heartbeat time
     * @param LastHeartbeatTime Last heartbeat time
     */
    public void setLastHeartbeatTime(String LastHeartbeatTime) {
        this.LastHeartbeatTime = LastHeartbeatTime;
    }

    /**
     * Get Agent status. Valid values:
<li> `Online`
<li> `Offline` 
     * @return AgentStatus Agent status. Valid values:
<li> `Online`
<li> `Offline`
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set Agent status. Valid values:
<li> `Online`
<li> `Offline`
     * @param AgentStatus Agent status. Valid values:
<li> `Online`
<li> `Offline`
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get Agent runtime environment. Valid values:
<li> `Linux`: Linux instance
<li> `Windows`: Windows instance 
     * @return Environment Agent runtime environment. Valid values:
<li> `Linux`: Linux instance
<li> `Windows`: Windows instance
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Agent runtime environment. Valid values:
<li> `Linux`: Linux instance
<li> `Windows`: Windows instance
     * @param Environment Agent runtime environment. Valid values:
<li> `Linux`: Linux instance
<li> `Windows`: Windows instance
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Features supported by the TAT agent. 
     * @return SupportFeatures Features supported by the TAT agent.
     */
    public String [] getSupportFeatures() {
        return this.SupportFeatures;
    }

    /**
     * Set Features supported by the TAT agent.
     * @param SupportFeatures Features supported by the TAT agent.
     */
    public void setSupportFeatures(String [] SupportFeatures) {
        this.SupportFeatures = SupportFeatures;
    }

    public AutomationAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutomationAgentInfo(AutomationAgentInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LastHeartbeatTime != null) {
            this.LastHeartbeatTime = new String(source.LastHeartbeatTime);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.SupportFeatures != null) {
            this.SupportFeatures = new String[source.SupportFeatures.length];
            for (int i = 0; i < source.SupportFeatures.length; i++) {
                this.SupportFeatures[i] = new String(source.SupportFeatures[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LastHeartbeatTime", this.LastHeartbeatTime);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamArraySimple(map, prefix + "SupportFeatures.", this.SupportFeatures);

    }
}

