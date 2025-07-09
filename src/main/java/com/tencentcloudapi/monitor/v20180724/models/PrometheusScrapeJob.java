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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusScrapeJob extends AbstractModel {

    /**
    * Task name
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
    * Task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get Task name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Task name
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
     * Get Task ID 
     * @return JobId Task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID
     * @param JobId Task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Config Configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Config Configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public PrometheusScrapeJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusScrapeJob(PrometheusScrapeJob source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

