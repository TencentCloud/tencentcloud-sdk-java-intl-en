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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipQuota extends AbstractModel {

    /**
    * Quota name. Valid values:
TOTAL_EIP_QUOTA: quota of EIPs in the current region;
DAILY_EIP_APPLY: today's number of applications in the current region;
DAILY_PUBLIC_IP_ASSIGN: number of public IP reassignments in the current region.
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * Current quantity
    */
    @SerializedName("QuotaCurrent")
    @Expose
    private Long QuotaCurrent;

    /**
    * Quota
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
     * Get Quota name. Valid values:
TOTAL_EIP_QUOTA: quota of EIPs in the current region;
DAILY_EIP_APPLY: today's number of applications in the current region;
DAILY_PUBLIC_IP_ASSIGN: number of public IP reassignments in the current region. 
     * @return QuotaId Quota name. Valid values:
TOTAL_EIP_QUOTA: quota of EIPs in the current region;
DAILY_EIP_APPLY: today's number of applications in the current region;
DAILY_PUBLIC_IP_ASSIGN: number of public IP reassignments in the current region.
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set Quota name. Valid values:
TOTAL_EIP_QUOTA: quota of EIPs in the current region;
DAILY_EIP_APPLY: today's number of applications in the current region;
DAILY_PUBLIC_IP_ASSIGN: number of public IP reassignments in the current region.
     * @param QuotaId Quota name. Valid values:
TOTAL_EIP_QUOTA: quota of EIPs in the current region;
DAILY_EIP_APPLY: today's number of applications in the current region;
DAILY_PUBLIC_IP_ASSIGN: number of public IP reassignments in the current region.
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get Current quantity 
     * @return QuotaCurrent Current quantity
     */
    public Long getQuotaCurrent() {
        return this.QuotaCurrent;
    }

    /**
     * Set Current quantity
     * @param QuotaCurrent Current quantity
     */
    public void setQuotaCurrent(Long QuotaCurrent) {
        this.QuotaCurrent = QuotaCurrent;
    }

    /**
     * Get Quota 
     * @return QuotaLimit Quota
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set Quota
     * @param QuotaLimit Quota
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    public EipQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipQuota(EipQuota source) {
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.QuotaCurrent != null) {
            this.QuotaCurrent = new Long(source.QuotaCurrent);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaCurrent", this.QuotaCurrent);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);

    }
}

