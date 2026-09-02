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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentRunModePolicy extends AbstractModel {

    /**
    * <p>Memory limit (MB). Options: 0/200/300/500</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>CPU limit (%), selectable: 10/20/30/40/50/60</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Network PPS limit</p>
    */
    @SerializedName("NetworkPps")
    @Expose
    private Long NetworkPps;

    /**
     * Get <p>Memory limit (MB). Options: 0/200/300/500</p> 
     * @return Memory <p>Memory limit (MB). Options: 0/200/300/500</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory limit (MB). Options: 0/200/300/500</p>
     * @param Memory <p>Memory limit (MB). Options: 0/200/300/500</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>CPU limit (%), selectable: 10/20/30/40/50/60</p> 
     * @return Cpu <p>CPU limit (%), selectable: 10/20/30/40/50/60</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU limit (%), selectable: 10/20/30/40/50/60</p>
     * @param Cpu <p>CPU limit (%), selectable: 10/20/30/40/50/60</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Network PPS limit</p> 
     * @return NetworkPps <p>Network PPS limit</p>
     */
    public Long getNetworkPps() {
        return this.NetworkPps;
    }

    /**
     * Set <p>Network PPS limit</p>
     * @param NetworkPps <p>Network PPS limit</p>
     */
    public void setNetworkPps(Long NetworkPps) {
        this.NetworkPps = NetworkPps;
    }

    public AgentRunModePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentRunModePolicy(AgentRunModePolicy source) {
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.NetworkPps != null) {
            this.NetworkPps = new Long(source.NetworkPps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "NetworkPps", this.NetworkPps);

    }
}

