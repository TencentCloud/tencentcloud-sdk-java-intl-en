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

public class CreatePrometheusScrapeJobRequest extends AbstractModel {

    /**
    * TMP instance ID, such as “prom-abcd1234”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent ID, such as “agent-abcd1234”. It can be obtained on the **Agent Management** page in the console.
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Scrape task ID in the format of “job_name:xx”
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get TMP instance ID, such as “prom-abcd1234”. 
     * @return InstanceId TMP instance ID, such as “prom-abcd1234”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TMP instance ID, such as “prom-abcd1234”.
     * @param InstanceId TMP instance ID, such as “prom-abcd1234”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent ID, such as “agent-abcd1234”. It can be obtained on the **Agent Management** page in the console. 
     * @return AgentId Agent ID, such as “agent-abcd1234”. It can be obtained on the **Agent Management** page in the console.
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent ID, such as “agent-abcd1234”. It can be obtained on the **Agent Management** page in the console.
     * @param AgentId Agent ID, such as “agent-abcd1234”. It can be obtained on the **Agent Management** page in the console.
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Scrape task ID in the format of “job_name:xx” 
     * @return Config Scrape task ID in the format of “job_name:xx”
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Scrape task ID in the format of “job_name:xx”
     * @param Config Scrape task ID in the format of “job_name:xx”
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public CreatePrometheusScrapeJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrometheusScrapeJobRequest(CreatePrometheusScrapeJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

