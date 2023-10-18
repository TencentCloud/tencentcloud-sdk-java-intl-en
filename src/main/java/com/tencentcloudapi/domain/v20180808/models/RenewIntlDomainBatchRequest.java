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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewIntlDomainBatchRequest extends AbstractModel {

    /**
    * The domains to check.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The period (1 to 10 years). If this parameter is left empty, premium domains cannot be checked.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Payment method. Valid value: `1` (account balance).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Whether to enable auto-renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
     * Get The domains to check. 
     * @return Domains The domains to check.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The domains to check.
     * @param Domains The domains to check.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The period (1 to 10 years). If this parameter is left empty, premium domains cannot be checked. 
     * @return Period The period (1 to 10 years). If this parameter is left empty, premium domains cannot be checked.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set The period (1 to 10 years). If this parameter is left empty, premium domains cannot be checked.
     * @param Period The period (1 to 10 years). If this parameter is left empty, premium domains cannot be checked.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Payment method. Valid value: `1` (account balance). 
     * @return PayMode Payment method. Valid value: `1` (account balance).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment method. Valid value: `1` (account balance).
     * @param PayMode Payment method. Valid value: `1` (account balance).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether to enable auto-renewal. 
     * @return AutoRenewFlag Whether to enable auto-renewal.
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to enable auto-renewal.
     * @param AutoRenewFlag Whether to enable auto-renewal.
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public RenewIntlDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewIntlDomainBatchRequest(RenewIntlDomainBatchRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

