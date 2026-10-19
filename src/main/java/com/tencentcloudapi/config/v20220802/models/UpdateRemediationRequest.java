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

public class UpdateRemediationRequest extends AbstractModel {

    /**
    * Remediation setting ID.
    */
    @SerializedName("RemediationId")
    @Expose
    private String RemediationId;

    /**
    * Remediation type. Valid values: SCF (function compute, custom remediation).
    */
    @SerializedName("RemediationType")
    @Expose
    private String RemediationType;

    /**
    * Remediation template ID.
    */
    @SerializedName("RemediationTemplateId")
    @Expose
    private String RemediationTemplateId;

    /**
    * Remediation execution mode. Valid values: NON_EXECUTION (no execution), AUTO_EXECUTION (automatic execution), MANUAL_EXECUTION (manual execution), and NOT_CONFIG (not configured).
    */
    @SerializedName("InvokeType")
    @Expose
    private String InvokeType;

    /**
    * Remediation execution source.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
     * Get Remediation setting ID. 
     * @return RemediationId Remediation setting ID.
     */
    public String getRemediationId() {
        return this.RemediationId;
    }

    /**
     * Set Remediation setting ID.
     * @param RemediationId Remediation setting ID.
     */
    public void setRemediationId(String RemediationId) {
        this.RemediationId = RemediationId;
    }

    /**
     * Get Remediation type. Valid values: SCF (function compute, custom remediation). 
     * @return RemediationType Remediation type. Valid values: SCF (function compute, custom remediation).
     */
    public String getRemediationType() {
        return this.RemediationType;
    }

    /**
     * Set Remediation type. Valid values: SCF (function compute, custom remediation).
     * @param RemediationType Remediation type. Valid values: SCF (function compute, custom remediation).
     */
    public void setRemediationType(String RemediationType) {
        this.RemediationType = RemediationType;
    }

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
     * Get Remediation execution mode. Valid values: NON_EXECUTION (no execution), AUTO_EXECUTION (automatic execution), MANUAL_EXECUTION (manual execution), and NOT_CONFIG (not configured). 
     * @return InvokeType Remediation execution mode. Valid values: NON_EXECUTION (no execution), AUTO_EXECUTION (automatic execution), MANUAL_EXECUTION (manual execution), and NOT_CONFIG (not configured).
     */
    public String getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set Remediation execution mode. Valid values: NON_EXECUTION (no execution), AUTO_EXECUTION (automatic execution), MANUAL_EXECUTION (manual execution), and NOT_CONFIG (not configured).
     * @param InvokeType Remediation execution mode. Valid values: NON_EXECUTION (no execution), AUTO_EXECUTION (automatic execution), MANUAL_EXECUTION (manual execution), and NOT_CONFIG (not configured).
     */
    public void setInvokeType(String InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get Remediation execution source. 
     * @return SourceType Remediation execution source.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Remediation execution source.
     * @param SourceType Remediation execution source.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    public UpdateRemediationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRemediationRequest(UpdateRemediationRequest source) {
        if (source.RemediationId != null) {
            this.RemediationId = new String(source.RemediationId);
        }
        if (source.RemediationType != null) {
            this.RemediationType = new String(source.RemediationType);
        }
        if (source.RemediationTemplateId != null) {
            this.RemediationTemplateId = new String(source.RemediationTemplateId);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String(source.InvokeType);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemediationId", this.RemediationId);
        this.setParamSimple(map, prefix + "RemediationType", this.RemediationType);
        this.setParamSimple(map, prefix + "RemediationTemplateId", this.RemediationTemplateId);
        this.setParamSimple(map, prefix + "InvokeType", this.InvokeType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

