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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Remediation extends AbstractModel {

    /**
    * Remediation template ID.
    */
    @SerializedName("RemediationTemplateId")
    @Expose
    private String RemediationTemplateId;

    /**
    * Remediation settings ID.
    */
    @SerializedName("RemediationId")
    @Expose
    private String RemediationId;

    /**
    * Template source for executing remediation.
    */
    @SerializedName("RemediationSourceType")
    @Expose
    private String RemediationSourceType;

    /**
    * Correction type. Valid values:
SCF: Function Compute (custom remediation).
    */
    @SerializedName("RemediationType")
    @Expose
    private String RemediationType;

    /**
    * Account ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Correction execution mode. Parameter value:
MANUAL_EXECUTION: manual execution.
    */
    @SerializedName("InvokeType")
    @Expose
    private String InvokeType;

    /**
    * Rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get Remediation template ID. 
     * @return RemediationTemplateId Remediation template ID.
     */
    public String getRemediationTemplateId() {
        return this.RemediationTemplateId;
    }

    /**
     * Set Remediation template ID.
     * @param RemediationTemplateId Remediation template ID.
     */
    public void setRemediationTemplateId(String RemediationTemplateId) {
        this.RemediationTemplateId = RemediationTemplateId;
    }

    /**
     * Get Remediation settings ID. 
     * @return RemediationId Remediation settings ID.
     */
    public String getRemediationId() {
        return this.RemediationId;
    }

    /**
     * Set Remediation settings ID.
     * @param RemediationId Remediation settings ID.
     */
    public void setRemediationId(String RemediationId) {
        this.RemediationId = RemediationId;
    }

    /**
     * Get Template source for executing remediation. 
     * @return RemediationSourceType Template source for executing remediation.
     */
    public String getRemediationSourceType() {
        return this.RemediationSourceType;
    }

    /**
     * Set Template source for executing remediation.
     * @param RemediationSourceType Template source for executing remediation.
     */
    public void setRemediationSourceType(String RemediationSourceType) {
        this.RemediationSourceType = RemediationSourceType;
    }

    /**
     * Get Correction type. Valid values:
SCF: Function Compute (custom remediation). 
     * @return RemediationType Correction type. Valid values:
SCF: Function Compute (custom remediation).
     */
    public String getRemediationType() {
        return this.RemediationType;
    }

    /**
     * Set Correction type. Valid values:
SCF: Function Compute (custom remediation).
     * @param RemediationType Correction type. Valid values:
SCF: Function Compute (custom remediation).
     */
    public void setRemediationType(String RemediationType) {
        this.RemediationType = RemediationType;
    }

    /**
     * Get Account ID 
     * @return OwnerUin Account ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Account ID
     * @param OwnerUin Account ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Correction execution mode. Parameter value:
MANUAL_EXECUTION: manual execution. 
     * @return InvokeType Correction execution mode. Parameter value:
MANUAL_EXECUTION: manual execution.
     */
    public String getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set Correction execution mode. Parameter value:
MANUAL_EXECUTION: manual execution.
     * @param InvokeType Correction execution mode. Parameter value:
MANUAL_EXECUTION: manual execution.
     */
    public void setInvokeType(String InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get Rule ID. 
     * @return RuleId Rule ID.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID.
     * @param RuleId Rule ID.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public Remediation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Remediation(Remediation source) {
        if (source.RemediationTemplateId != null) {
            this.RemediationTemplateId = new String(source.RemediationTemplateId);
        }
        if (source.RemediationId != null) {
            this.RemediationId = new String(source.RemediationId);
        }
        if (source.RemediationSourceType != null) {
            this.RemediationSourceType = new String(source.RemediationSourceType);
        }
        if (source.RemediationType != null) {
            this.RemediationType = new String(source.RemediationType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String(source.InvokeType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemediationTemplateId", this.RemediationTemplateId);
        this.setParamSimple(map, prefix + "RemediationId", this.RemediationId);
        this.setParamSimple(map, prefix + "RemediationSourceType", this.RemediationSourceType);
        this.setParamSimple(map, prefix + "RemediationType", this.RemediationType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InvokeType", this.InvokeType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

