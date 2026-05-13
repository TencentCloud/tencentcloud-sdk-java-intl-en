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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppRequest extends AbstractModel {

    /**
    * Application type; knowledge_qa - knowledge qa management.
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * Basic application configuration.
    */
    @SerializedName("BaseConfig")
    @Expose
    private BaseConfig BaseConfig;

    /**
    * <p>Application Mode: standard - Standard Mode, agent - Agent Mode, single_workflow - Single Workflow Mode, ClawAgent - Claw Mode</p>
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * <p>Agent type, used to distinguish the final agent form in which the application provides external services (dialogue) / Official Account (wechat). The current ADP creation page does not distinguish between dialogue and Official Account agents, and defaults to the dialogue agent.</p>
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
     * Get Application type; knowledge_qa - knowledge qa management. 
     * @return AppType Application type; knowledge_qa - knowledge qa management.
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Application type; knowledge_qa - knowledge qa management.
     * @param AppType Application type; knowledge_qa - knowledge qa management.
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get Basic application configuration. 
     * @return BaseConfig Basic application configuration.
     */
    public BaseConfig getBaseConfig() {
        return this.BaseConfig;
    }

    /**
     * Set Basic application configuration.
     * @param BaseConfig Basic application configuration.
     */
    public void setBaseConfig(BaseConfig BaseConfig) {
        this.BaseConfig = BaseConfig;
    }

    /**
     * Get <p>Application Mode: standard - Standard Mode, agent - Agent Mode, single_workflow - Single Workflow Mode, ClawAgent - Claw Mode</p> 
     * @return Pattern <p>Application Mode: standard - Standard Mode, agent - Agent Mode, single_workflow - Single Workflow Mode, ClawAgent - Claw Mode</p>
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set <p>Application Mode: standard - Standard Mode, agent - Agent Mode, single_workflow - Single Workflow Mode, ClawAgent - Claw Mode</p>
     * @param Pattern <p>Application Mode: standard - Standard Mode, agent - Agent Mode, single_workflow - Single Workflow Mode, ClawAgent - Claw Mode</p>
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get <p>Agent type, used to distinguish the final agent form in which the application provides external services (dialogue) / Official Account (wechat). The current ADP creation page does not distinguish between dialogue and Official Account agents, and defaults to the dialogue agent.</p> 
     * @return AgentType <p>Agent type, used to distinguish the final agent form in which the application provides external services (dialogue) / Official Account (wechat). The current ADP creation page does not distinguish between dialogue and Official Account agents, and defaults to the dialogue agent.</p>
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set <p>Agent type, used to distinguish the final agent form in which the application provides external services (dialogue) / Official Account (wechat). The current ADP creation page does not distinguish between dialogue and Official Account agents, and defaults to the dialogue agent.</p>
     * @param AgentType <p>Agent type, used to distinguish the final agent form in which the application provides external services (dialogue) / Official Account (wechat). The current ADP creation page does not distinguish between dialogue and Official Account agents, and defaults to the dialogue agent.</p>
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    public CreateAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppRequest(CreateAppRequest source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.BaseConfig != null) {
            this.BaseConfig = new BaseConfig(source.BaseConfig);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamObj(map, prefix + "BaseConfig.", this.BaseConfig);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);

    }
}

