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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifeCycleRule extends AbstractModel {

    /**
    * Lifecycle rule ID
    */
    @SerializedName("LifeCycleRuleId")
    @Expose
    private Long LifeCycleRuleId;

    /**
    * Lifecycle rule name
    */
    @SerializedName("LifeCycleRuleName")
    @Expose
    private String LifeCycleRuleName;

    /**
    * Lifecycle rule path (directory or file)
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * List of lifecycle rule transitions
    */
    @SerializedName("Transitions")
    @Expose
    private Transition [] Transitions;

    /**
    * Lifecycle rule status (1: enabled; 2: disabled)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Detailed storage usage of the current lifecycle rule path
    */
    @SerializedName("Summary")
    @Expose
    private Summary Summary;

    /**
    * Update time of `Summary`
    */
    @SerializedName("LastSummaryTime")
    @Expose
    private String LastSummaryTime;

    /**
     * Get Lifecycle rule ID 
     * @return LifeCycleRuleId Lifecycle rule ID
     */
    public Long getLifeCycleRuleId() {
        return this.LifeCycleRuleId;
    }

    /**
     * Set Lifecycle rule ID
     * @param LifeCycleRuleId Lifecycle rule ID
     */
    public void setLifeCycleRuleId(Long LifeCycleRuleId) {
        this.LifeCycleRuleId = LifeCycleRuleId;
    }

    /**
     * Get Lifecycle rule name 
     * @return LifeCycleRuleName Lifecycle rule name
     */
    public String getLifeCycleRuleName() {
        return this.LifeCycleRuleName;
    }

    /**
     * Set Lifecycle rule name
     * @param LifeCycleRuleName Lifecycle rule name
     */
    public void setLifeCycleRuleName(String LifeCycleRuleName) {
        this.LifeCycleRuleName = LifeCycleRuleName;
    }

    /**
     * Get Lifecycle rule path (directory or file) 
     * @return Path Lifecycle rule path (directory or file)
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Lifecycle rule path (directory or file)
     * @param Path Lifecycle rule path (directory or file)
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get List of lifecycle rule transitions 
     * @return Transitions List of lifecycle rule transitions
     */
    public Transition [] getTransitions() {
        return this.Transitions;
    }

    /**
     * Set List of lifecycle rule transitions
     * @param Transitions List of lifecycle rule transitions
     */
    public void setTransitions(Transition [] Transitions) {
        this.Transitions = Transitions;
    }

    /**
     * Get Lifecycle rule status (1: enabled; 2: disabled) 
     * @return Status Lifecycle rule status (1: enabled; 2: disabled)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Lifecycle rule status (1: enabled; 2: disabled)
     * @param Status Lifecycle rule status (1: enabled; 2: disabled)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Detailed storage usage of the current lifecycle rule path 
     * @return Summary Detailed storage usage of the current lifecycle rule path
     */
    public Summary getSummary() {
        return this.Summary;
    }

    /**
     * Set Detailed storage usage of the current lifecycle rule path
     * @param Summary Detailed storage usage of the current lifecycle rule path
     */
    public void setSummary(Summary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get Update time of `Summary` 
     * @return LastSummaryTime Update time of `Summary`
     */
    public String getLastSummaryTime() {
        return this.LastSummaryTime;
    }

    /**
     * Set Update time of `Summary`
     * @param LastSummaryTime Update time of `Summary`
     */
    public void setLastSummaryTime(String LastSummaryTime) {
        this.LastSummaryTime = LastSummaryTime;
    }

    public LifeCycleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifeCycleRule(LifeCycleRule source) {
        if (source.LifeCycleRuleId != null) {
            this.LifeCycleRuleId = new Long(source.LifeCycleRuleId);
        }
        if (source.LifeCycleRuleName != null) {
            this.LifeCycleRuleName = new String(source.LifeCycleRuleName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Transitions != null) {
            this.Transitions = new Transition[source.Transitions.length];
            for (int i = 0; i < source.Transitions.length; i++) {
                this.Transitions[i] = new Transition(source.Transitions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Summary != null) {
            this.Summary = new Summary(source.Summary);
        }
        if (source.LastSummaryTime != null) {
            this.LastSummaryTime = new String(source.LastSummaryTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifeCycleRuleId", this.LifeCycleRuleId);
        this.setParamSimple(map, prefix + "LifeCycleRuleName", this.LifeCycleRuleName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArrayObj(map, prefix + "Transitions.", this.Transitions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamSimple(map, prefix + "LastSummaryTime", this.LastSummaryTime);

    }
}

