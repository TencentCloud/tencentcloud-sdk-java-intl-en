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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditCrossBorderComplianceRequest extends AbstractModel {

    /**
    * Service provider. Valid values: `UNICOM`.
    */
    @SerializedName("ServiceProvider")
    @Expose
    private String ServiceProvider;

    /**
    * Unique ID of compliance review request.
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * Audit behavior. Valid values: `APPROVED` and `DENY`.
    */
    @SerializedName("AuditBehavior")
    @Expose
    private String AuditBehavior;

    /**
     * Get Service provider. Valid values: `UNICOM`. 
     * @return ServiceProvider Service provider. Valid values: `UNICOM`.
     */
    public String getServiceProvider() {
        return this.ServiceProvider;
    }

    /**
     * Set Service provider. Valid values: `UNICOM`.
     * @param ServiceProvider Service provider. Valid values: `UNICOM`.
     */
    public void setServiceProvider(String ServiceProvider) {
        this.ServiceProvider = ServiceProvider;
    }

    /**
     * Get Unique ID of compliance review request. 
     * @return ComplianceId Unique ID of compliance review request.
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set Unique ID of compliance review request.
     * @param ComplianceId Unique ID of compliance review request.
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get Audit behavior. Valid values: `APPROVED` and `DENY`. 
     * @return AuditBehavior Audit behavior. Valid values: `APPROVED` and `DENY`.
     */
    public String getAuditBehavior() {
        return this.AuditBehavior;
    }

    /**
     * Set Audit behavior. Valid values: `APPROVED` and `DENY`.
     * @param AuditBehavior Audit behavior. Valid values: `APPROVED` and `DENY`.
     */
    public void setAuditBehavior(String AuditBehavior) {
        this.AuditBehavior = AuditBehavior;
    }

    public AuditCrossBorderComplianceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditCrossBorderComplianceRequest(AuditCrossBorderComplianceRequest source) {
        if (source.ServiceProvider != null) {
            this.ServiceProvider = new String(source.ServiceProvider);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.AuditBehavior != null) {
            this.AuditBehavior = new String(source.AuditBehavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProvider", this.ServiceProvider);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "AuditBehavior", this.AuditBehavior);

    }
}

