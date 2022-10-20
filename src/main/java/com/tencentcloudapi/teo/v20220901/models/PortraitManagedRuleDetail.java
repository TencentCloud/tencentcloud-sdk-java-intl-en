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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortraitManagedRuleDetail extends AbstractModel{

    /**
    * Unique rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule type name: botdb (user profile)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * The ID that classifies the rule category.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassificationId")
    @Expose
    private Long ClassificationId;

    /**
    * Action status of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Unique rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Unique rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Unique rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Unique rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule type name: botdb (user profile)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleTypeName Rule type name: botdb (user profile)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set Rule type name: botdb (user profile)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleTypeName Rule type name: botdb (user profile)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get The ID that classifies the rule category.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClassificationId The ID that classifies the rule category.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getClassificationId() {
        return this.ClassificationId;
    }

    /**
     * Set The ID that classifies the rule category.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClassificationId The ID that classifies the rule category.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClassificationId(Long ClassificationId) {
        this.ClassificationId = ClassificationId;
    }

    /**
     * Get Action status of the rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Action status of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Action status of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Action status of the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public PortraitManagedRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortraitManagedRuleDetail(PortraitManagedRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.ClassificationId != null) {
            this.ClassificationId = new Long(source.ClassificationId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "ClassificationId", this.ClassificationId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

