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

public class RuleBaseInfo extends AbstractModel {

    /**
    * Valid values: `true` (default policy); `false` (custom policy).
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Number of associated images
    */
    @SerializedName("EffectImageCount")
    @Expose
    private Long EffectImageCount;

    /**
    * Policy ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Policy update time, which can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Policy name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Name of the editing user
    */
    @SerializedName("EditUserName")
    @Expose
    private String EditUserName;

    /**
    * Valid values: `true` (enable the policy); `false` (disable the policy).
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
     * Get Valid values: `true` (default policy); `false` (custom policy). 
     * @return IsDefault Valid values: `true` (default policy); `false` (custom policy).
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Valid values: `true` (default policy); `false` (custom policy).
     * @param IsDefault Valid values: `true` (default policy); `false` (custom policy).
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Number of associated images 
     * @return EffectImageCount Number of associated images
     */
    public Long getEffectImageCount() {
        return this.EffectImageCount;
    }

    /**
     * Set Number of associated images
     * @param EffectImageCount Number of associated images
     */
    public void setEffectImageCount(Long EffectImageCount) {
        this.EffectImageCount = EffectImageCount;
    }

    /**
     * Get Policy ID 
     * @return RuleId Policy ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Policy ID
     * @param RuleId Policy ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Policy update time, which can be empty.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Policy update time, which can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Policy update time, which can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Policy update time, which can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Policy name 
     * @return RuleName Policy name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Policy name
     * @param RuleName Policy name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Name of the editing user 
     * @return EditUserName Name of the editing user
     */
    public String getEditUserName() {
        return this.EditUserName;
    }

    /**
     * Set Name of the editing user
     * @param EditUserName Name of the editing user
     */
    public void setEditUserName(String EditUserName) {
        this.EditUserName = EditUserName;
    }

    /**
     * Get Valid values: `true` (enable the policy); `false` (disable the policy). 
     * @return IsEnable Valid values: `true` (enable the policy); `false` (disable the policy).
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Valid values: `true` (enable the policy); `false` (disable the policy).
     * @param IsEnable Valid values: `true` (enable the policy); `false` (disable the policy).
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public RuleBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleBaseInfo(RuleBaseInfo source) {
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.EffectImageCount != null) {
            this.EffectImageCount = new Long(source.EffectImageCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.EditUserName != null) {
            this.EditUserName = new String(source.EditUserName);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EffectImageCount", this.EffectImageCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "EditUserName", this.EditUserName);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);

    }
}

