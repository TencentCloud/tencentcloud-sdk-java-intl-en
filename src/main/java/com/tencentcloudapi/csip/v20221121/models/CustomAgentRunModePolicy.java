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

public class CustomAgentRunModePolicy extends AbstractModel {

    /**
    * <p>Run Memory</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Running cpu.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Packet capture limit</p>
    */
    @SerializedName("NetworkPps")
    @Expose
    private Long NetworkPps;

    /**
     * Get <p>Run Memory</p> 
     * @return Memory <p>Run Memory</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Run Memory</p>
     * @param Memory <p>Run Memory</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Running cpu.</p> 
     * @return Cpu <p>Running cpu.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Running cpu.</p>
     * @param Cpu <p>Running cpu.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Packet capture limit</p> 
     * @return NetworkPps <p>Packet capture limit</p>
     */
    public Long getNetworkPps() {
        return this.NetworkPps;
    }

    /**
     * Set <p>Packet capture limit</p>
     * @param NetworkPps <p>Packet capture limit</p>
     */
    public void setNetworkPps(Long NetworkPps) {
        this.NetworkPps = NetworkPps;
    }

    public CustomAgentRunModePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomAgentRunModePolicy(CustomAgentRunModePolicy source) {
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

