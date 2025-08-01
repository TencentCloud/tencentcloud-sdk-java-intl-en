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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTagRetentionRuleRequest extends AbstractModel {

    /**
    * Primary instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * ID of the original namespace
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
    * Retention policy
    */
    @SerializedName("RetentionRule")
    @Expose
    private RetentionRule RetentionRule;

    /**
    * Original execution cycle
    */
    @SerializedName("CronSetting")
    @Expose
    private String CronSetting;

    /**
    * Rule ID
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * Whether to disable the rule
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
     * Get Primary instance ID 
     * @return RegistryId Primary instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Primary instance ID
     * @param RegistryId Primary instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get ID of the original namespace 
     * @return NamespaceId ID of the original namespace
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set ID of the original namespace
     * @param NamespaceId ID of the original namespace
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Retention policy 
     * @return RetentionRule Retention policy
     */
    public RetentionRule getRetentionRule() {
        return this.RetentionRule;
    }

    /**
     * Set Retention policy
     * @param RetentionRule Retention policy
     */
    public void setRetentionRule(RetentionRule RetentionRule) {
        this.RetentionRule = RetentionRule;
    }

    /**
     * Get Original execution cycle 
     * @return CronSetting Original execution cycle
     */
    public String getCronSetting() {
        return this.CronSetting;
    }

    /**
     * Set Original execution cycle
     * @param CronSetting Original execution cycle
     */
    public void setCronSetting(String CronSetting) {
        this.CronSetting = CronSetting;
    }

    /**
     * Get Rule ID 
     * @return RetentionId Rule ID
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set Rule ID
     * @param RetentionId Rule ID
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get Whether to disable the rule 
     * @return Disabled Whether to disable the rule
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set Whether to disable the rule
     * @param Disabled Whether to disable the rule
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    public ModifyTagRetentionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTagRetentionRuleRequest(ModifyTagRetentionRuleRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new Long(source.NamespaceId);
        }
        if (source.RetentionRule != null) {
            this.RetentionRule = new RetentionRule(source.RetentionRule);
        }
        if (source.CronSetting != null) {
            this.CronSetting = new String(source.CronSetting);
        }
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamObj(map, prefix + "RetentionRule.", this.RetentionRule);
        this.setParamSimple(map, prefix + "CronSetting", this.CronSetting);
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);

    }
}

