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

public class RecordingRuleSet extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule status code
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * Group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule group
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Number of rules
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Rule creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Rule update time
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Rule name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule status code 
     * @return RuleState Rule status code
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set Rule status code
     * @param RuleState Rule status code
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get Group name 
     * @return Name Group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Group name
     * @param Name Group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule group 
     * @return Group Rule group
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Rule group
     * @param Group Rule group
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Number of rules 
     * @return Total Number of rules
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of rules
     * @param Total Number of rules
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Rule creation time 
     * @return CreatedAt Rule creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Rule creation time
     * @param CreatedAt Rule creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Rule update time 
     * @return UpdatedAt Rule update time
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Rule update time
     * @param UpdatedAt Rule update time
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Rule name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public RecordingRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordingRuleSet(RecordingRuleSet source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

