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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageDenyRule extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule Type. RULE_RISK: Risk; RULE_PRIVILEGE: Privilege
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Number of Effective Images
    */
    @SerializedName("EffectImageCount")
    @Expose
    private Long EffectImageCount;

    /**
    * Application to All Scanned Images. 0: Select All Images; 1: Custom Images
    */
    @SerializedName("IsEffectAllImage")
    @Expose
    private Long IsEffectAllImage;

    /**
    * Rule Effective Start Time
    */
    @SerializedName("EffectTime")
    @Expose
    private String EffectTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Operator
    */
    @SerializedName("OperationUin")
    @Expose
    private String OperationUin;

    /**
    * Enabled status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Effective Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
    */
    @SerializedName("EffectStatus")
    @Expose
    private String EffectStatus;

    /**
    * Rule ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get Rule ID 
     * @return RuleID Rule ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID
     * @param RuleID Rule ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule Type. RULE_RISK: Risk; RULE_PRIVILEGE: Privilege 
     * @return RuleType Rule Type. RULE_RISK: Risk; RULE_PRIVILEGE: Privilege
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule Type. RULE_RISK: Risk; RULE_PRIVILEGE: Privilege
     * @param RuleType Rule Type. RULE_RISK: Risk; RULE_PRIVILEGE: Privilege
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Number of Effective Images 
     * @return EffectImageCount Number of Effective Images
     */
    public Long getEffectImageCount() {
        return this.EffectImageCount;
    }

    /**
     * Set Number of Effective Images
     * @param EffectImageCount Number of Effective Images
     */
    public void setEffectImageCount(Long EffectImageCount) {
        this.EffectImageCount = EffectImageCount;
    }

    /**
     * Get Application to All Scanned Images. 0: Select All Images; 1: Custom Images 
     * @return IsEffectAllImage Application to All Scanned Images. 0: Select All Images; 1: Custom Images
     */
    public Long getIsEffectAllImage() {
        return this.IsEffectAllImage;
    }

    /**
     * Set Application to All Scanned Images. 0: Select All Images; 1: Custom Images
     * @param IsEffectAllImage Application to All Scanned Images. 0: Select All Images; 1: Custom Images
     */
    public void setIsEffectAllImage(Long IsEffectAllImage) {
        this.IsEffectAllImage = IsEffectAllImage;
    }

    /**
     * Get Rule Effective Start Time 
     * @return EffectTime Rule Effective Start Time
     */
    public String getEffectTime() {
        return this.EffectTime;
    }

    /**
     * Set Rule Effective Start Time
     * @param EffectTime Rule Effective Start Time
     */
    public void setEffectTime(String EffectTime) {
        this.EffectTime = EffectTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Operator 
     * @return OperationUin Operator
     */
    public String getOperationUin() {
        return this.OperationUin;
    }

    /**
     * Set Operator
     * @param OperationUin Operator
     */
    public void setOperationUin(String OperationUin) {
        this.OperationUin = OperationUin;
    }

    /**
     * Get Enabled status 
     * @return Status Enabled status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enabled status
     * @param Status Enabled status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Effective Status. IN_THE_TEST: Observing; IN_EFFECT: Effective 
     * @return EffectStatus Effective Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
     */
    public String getEffectStatus() {
        return this.EffectStatus;
    }

    /**
     * Set Effective Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
     * @param EffectStatus Effective Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
     */
    public void setEffectStatus(String EffectStatus) {
        this.EffectStatus = EffectStatus;
    }

    /**
     * Get Rule ID 
     * @return ID Rule ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Rule ID
     * @param ID Rule ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ImageDenyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageDenyRule(ImageDenyRule source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EffectImageCount != null) {
            this.EffectImageCount = new Long(source.EffectImageCount);
        }
        if (source.IsEffectAllImage != null) {
            this.IsEffectAllImage = new Long(source.IsEffectAllImage);
        }
        if (source.EffectTime != null) {
            this.EffectTime = new String(source.EffectTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperationUin != null) {
            this.OperationUin = new String(source.OperationUin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EffectStatus != null) {
            this.EffectStatus = new String(source.EffectStatus);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EffectImageCount", this.EffectImageCount);
        this.setParamSimple(map, prefix + "IsEffectAllImage", this.IsEffectAllImage);
        this.setParamSimple(map, prefix + "EffectTime", this.EffectTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperationUin", this.OperationUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EffectStatus", this.EffectStatus);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

