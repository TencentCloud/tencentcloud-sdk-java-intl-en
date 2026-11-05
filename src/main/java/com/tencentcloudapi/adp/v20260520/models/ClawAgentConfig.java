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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClawAgentConfig extends AbstractModel {

    /**
    * <p>Agent Team Collaboration Configuration</p>
    */
    @SerializedName("AgentTeamConfig")
    @Expose
    private ClawAgentAgentTeamConfig AgentTeamConfig;

    /**
    * <p>Long-term memory configuration</p>
    */
    @SerializedName("LongMemoryConfig")
    @Expose
    private ClawAgentLongMemoryConfig LongMemoryConfig;

    /**
    * <p>Channel context timeout configuration clearing</p>
    */
    @SerializedName("ChannelContextTimeoutConfig")
    @Expose
    private ClawAgentChannelContextTimeoutConfig ChannelContextTimeoutConfig;

    /**
     * Get <p>Agent Team Collaboration Configuration</p> 
     * @return AgentTeamConfig <p>Agent Team Collaboration Configuration</p>
     */
    public ClawAgentAgentTeamConfig getAgentTeamConfig() {
        return this.AgentTeamConfig;
    }

    /**
     * Set <p>Agent Team Collaboration Configuration</p>
     * @param AgentTeamConfig <p>Agent Team Collaboration Configuration</p>
     */
    public void setAgentTeamConfig(ClawAgentAgentTeamConfig AgentTeamConfig) {
        this.AgentTeamConfig = AgentTeamConfig;
    }

    /**
     * Get <p>Long-term memory configuration</p> 
     * @return LongMemoryConfig <p>Long-term memory configuration</p>
     */
    public ClawAgentLongMemoryConfig getLongMemoryConfig() {
        return this.LongMemoryConfig;
    }

    /**
     * Set <p>Long-term memory configuration</p>
     * @param LongMemoryConfig <p>Long-term memory configuration</p>
     */
    public void setLongMemoryConfig(ClawAgentLongMemoryConfig LongMemoryConfig) {
        this.LongMemoryConfig = LongMemoryConfig;
    }

    /**
     * Get <p>Channel context timeout configuration clearing</p> 
     * @return ChannelContextTimeoutConfig <p>Channel context timeout configuration clearing</p>
     */
    public ClawAgentChannelContextTimeoutConfig getChannelContextTimeoutConfig() {
        return this.ChannelContextTimeoutConfig;
    }

    /**
     * Set <p>Channel context timeout configuration clearing</p>
     * @param ChannelContextTimeoutConfig <p>Channel context timeout configuration clearing</p>
     */
    public void setChannelContextTimeoutConfig(ClawAgentChannelContextTimeoutConfig ChannelContextTimeoutConfig) {
        this.ChannelContextTimeoutConfig = ChannelContextTimeoutConfig;
    }

    public ClawAgentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClawAgentConfig(ClawAgentConfig source) {
        if (source.AgentTeamConfig != null) {
            this.AgentTeamConfig = new ClawAgentAgentTeamConfig(source.AgentTeamConfig);
        }
        if (source.LongMemoryConfig != null) {
            this.LongMemoryConfig = new ClawAgentLongMemoryConfig(source.LongMemoryConfig);
        }
        if (source.ChannelContextTimeoutConfig != null) {
            this.ChannelContextTimeoutConfig = new ClawAgentChannelContextTimeoutConfig(source.ChannelContextTimeoutConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AgentTeamConfig.", this.AgentTeamConfig);
        this.setParamObj(map, prefix + "LongMemoryConfig.", this.LongMemoryConfig);
        this.setParamObj(map, prefix + "ChannelContextTimeoutConfig.", this.ChannelContextTimeoutConfig);

    }
}

