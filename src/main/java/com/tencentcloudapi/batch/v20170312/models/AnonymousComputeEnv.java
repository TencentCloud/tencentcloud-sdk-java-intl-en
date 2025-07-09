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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnonymousComputeEnv extends AbstractModel {

    /**
    * Compute environment management type
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * Compute environment's parameters
    */
    @SerializedName("EnvData")
    @Expose
    private EnvData EnvData;

    /**
    * Data disk mounting option
    */
    @SerializedName("MountDataDisks")
    @Expose
    private MountDataDisk [] MountDataDisks;

    /**
    * Agent running mode; applicable for Windows
    */
    @SerializedName("AgentRunningMode")
    @Expose
    private AgentRunningMode AgentRunningMode;

    /**
     * Get Compute environment management type 
     * @return EnvType Compute environment management type
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Compute environment management type
     * @param EnvType Compute environment management type
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get Compute environment's parameters 
     * @return EnvData Compute environment's parameters
     */
    public EnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * Set Compute environment's parameters
     * @param EnvData Compute environment's parameters
     */
    public void setEnvData(EnvData EnvData) {
        this.EnvData = EnvData;
    }

    /**
     * Get Data disk mounting option 
     * @return MountDataDisks Data disk mounting option
     */
    public MountDataDisk [] getMountDataDisks() {
        return this.MountDataDisks;
    }

    /**
     * Set Data disk mounting option
     * @param MountDataDisks Data disk mounting option
     */
    public void setMountDataDisks(MountDataDisk [] MountDataDisks) {
        this.MountDataDisks = MountDataDisks;
    }

    /**
     * Get Agent running mode; applicable for Windows 
     * @return AgentRunningMode Agent running mode; applicable for Windows
     */
    public AgentRunningMode getAgentRunningMode() {
        return this.AgentRunningMode;
    }

    /**
     * Set Agent running mode; applicable for Windows
     * @param AgentRunningMode Agent running mode; applicable for Windows
     */
    public void setAgentRunningMode(AgentRunningMode AgentRunningMode) {
        this.AgentRunningMode = AgentRunningMode;
    }

    public AnonymousComputeEnv() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnonymousComputeEnv(AnonymousComputeEnv source) {
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.EnvData != null) {
            this.EnvData = new EnvData(source.EnvData);
        }
        if (source.MountDataDisks != null) {
            this.MountDataDisks = new MountDataDisk[source.MountDataDisks.length];
            for (int i = 0; i < source.MountDataDisks.length; i++) {
                this.MountDataDisks[i] = new MountDataDisk(source.MountDataDisks[i]);
            }
        }
        if (source.AgentRunningMode != null) {
            this.AgentRunningMode = new AgentRunningMode(source.AgentRunningMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);
        this.setParamArrayObj(map, prefix + "MountDataDisks.", this.MountDataDisks);
        this.setParamObj(map, prefix + "AgentRunningMode.", this.AgentRunningMode);

    }
}

