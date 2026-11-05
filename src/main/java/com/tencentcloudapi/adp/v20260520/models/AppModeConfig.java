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

public class AppModeConfig extends AbstractModel {

    /**
    * Multi-agent configuration (Agent mode)
    */
    @SerializedName("MultiAgentConfig")
    @Expose
    private MultiAgentConfig MultiAgentConfig;

    /**
    * Single workflow configuration (single workflow mode)
    */
    @SerializedName("SingleWorkflowConfig")
    @Expose
    private SingleWorkflowConfig SingleWorkflowConfig;

    /**
    * ClawAgent Configuration (ClawAgent mode)
    */
    @SerializedName("ClawAgentConfig")
    @Expose
    private ClawAgentConfig ClawAgentConfig;

    /**
     * Get Multi-agent configuration (Agent mode) 
     * @return MultiAgentConfig Multi-agent configuration (Agent mode)
     */
    public MultiAgentConfig getMultiAgentConfig() {
        return this.MultiAgentConfig;
    }

    /**
     * Set Multi-agent configuration (Agent mode)
     * @param MultiAgentConfig Multi-agent configuration (Agent mode)
     */
    public void setMultiAgentConfig(MultiAgentConfig MultiAgentConfig) {
        this.MultiAgentConfig = MultiAgentConfig;
    }

    /**
     * Get Single workflow configuration (single workflow mode) 
     * @return SingleWorkflowConfig Single workflow configuration (single workflow mode)
     */
    public SingleWorkflowConfig getSingleWorkflowConfig() {
        return this.SingleWorkflowConfig;
    }

    /**
     * Set Single workflow configuration (single workflow mode)
     * @param SingleWorkflowConfig Single workflow configuration (single workflow mode)
     */
    public void setSingleWorkflowConfig(SingleWorkflowConfig SingleWorkflowConfig) {
        this.SingleWorkflowConfig = SingleWorkflowConfig;
    }

    /**
     * Get ClawAgent Configuration (ClawAgent mode) 
     * @return ClawAgentConfig ClawAgent Configuration (ClawAgent mode)
     */
    public ClawAgentConfig getClawAgentConfig() {
        return this.ClawAgentConfig;
    }

    /**
     * Set ClawAgent Configuration (ClawAgent mode)
     * @param ClawAgentConfig ClawAgent Configuration (ClawAgent mode)
     */
    public void setClawAgentConfig(ClawAgentConfig ClawAgentConfig) {
        this.ClawAgentConfig = ClawAgentConfig;
    }

    public AppModeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModeConfig(AppModeConfig source) {
        if (source.MultiAgentConfig != null) {
            this.MultiAgentConfig = new MultiAgentConfig(source.MultiAgentConfig);
        }
        if (source.SingleWorkflowConfig != null) {
            this.SingleWorkflowConfig = new SingleWorkflowConfig(source.SingleWorkflowConfig);
        }
        if (source.ClawAgentConfig != null) {
            this.ClawAgentConfig = new ClawAgentConfig(source.ClawAgentConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MultiAgentConfig.", this.MultiAgentConfig);
        this.setParamObj(map, prefix + "SingleWorkflowConfig.", this.SingleWorkflowConfig);
        this.setParamObj(map, prefix + "ClawAgentConfig.", this.ClawAgentConfig);

    }
}

