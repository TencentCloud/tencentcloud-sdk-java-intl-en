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

public class CreateIntlDomainBatchRequest extends AbstractModel {

    /**
    * The profile ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * The purchase period (years) of the domain. Value range: [1-10]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * The domains (maximum 4,000) to purchase.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The payment method. Valid values: `0` (online payment), `1` (account balance), `2` (package), `3` (offline settlement).
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
    * Whether to enable the transfer prohibition lock.
    */
    @SerializedName("TransferProhibition")
    @Expose
    private Boolean TransferProhibition;

    /**
    * Whether to enable the update prohibition lock.
    */
    @SerializedName("UpdateProhibition")
    @Expose
    private Boolean UpdateProhibition;

    /**
    * The custom DNS servers
    */
    @SerializedName("CustomDns")
    @Expose
    private String [] CustomDns;

    /**
     * Get The profile ID. 
     * @return TemplateId The profile ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The profile ID.
     * @param TemplateId The profile ID.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The purchase period (years) of the domain. Value range: [1-10] 
     * @return Period The purchase period (years) of the domain. Value range: [1-10]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set The purchase period (years) of the domain. Value range: [1-10]
     * @param Period The purchase period (years) of the domain. Value range: [1-10]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get The domains (maximum 4,000) to purchase. 
     * @return Domains The domains (maximum 4,000) to purchase.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The domains (maximum 4,000) to purchase.
     * @param Domains The domains (maximum 4,000) to purchase.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The payment method. Valid values: `0` (online payment), `1` (account balance), `2` (package), `3` (offline settlement). 
     * @return PayMode The payment method. Valid values: `0` (online payment), `1` (account balance), `2` (package), `3` (offline settlement).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set The payment method. Valid values: `0` (online payment), `1` (account balance), `2` (package), `3` (offline settlement).
     * @param PayMode The payment method. Valid values: `0` (online payment), `1` (account balance), `2` (package), `3` (offline settlement).
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

    /**
     * Get Whether to enable the transfer prohibition lock. 
     * @return TransferProhibition Whether to enable the transfer prohibition lock.
     */
    public Boolean getTransferProhibition() {
        return this.TransferProhibition;
    }

    /**
     * Set Whether to enable the transfer prohibition lock.
     * @param TransferProhibition Whether to enable the transfer prohibition lock.
     */
    public void setTransferProhibition(Boolean TransferProhibition) {
        this.TransferProhibition = TransferProhibition;
    }

    /**
     * Get Whether to enable the update prohibition lock. 
     * @return UpdateProhibition Whether to enable the update prohibition lock.
     */
    public Boolean getUpdateProhibition() {
        return this.UpdateProhibition;
    }

    /**
     * Set Whether to enable the update prohibition lock.
     * @param UpdateProhibition Whether to enable the update prohibition lock.
     */
    public void setUpdateProhibition(Boolean UpdateProhibition) {
        this.UpdateProhibition = UpdateProhibition;
    }

    /**
     * Get The custom DNS servers 
     * @return CustomDns The custom DNS servers
     */
    public String [] getCustomDns() {
        return this.CustomDns;
    }

    /**
     * Set The custom DNS servers
     * @param CustomDns The custom DNS servers
     */
    public void setCustomDns(String [] CustomDns) {
        this.CustomDns = CustomDns;
    }

    public CreateIntlDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntlDomainBatchRequest(CreateIntlDomainBatchRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
        if (source.TransferProhibition != null) {
            this.TransferProhibition = new Boolean(source.TransferProhibition);
        }
        if (source.UpdateProhibition != null) {
            this.UpdateProhibition = new Boolean(source.UpdateProhibition);
        }
        if (source.CustomDns != null) {
            this.CustomDns = new String[source.CustomDns.length];
            for (int i = 0; i < source.CustomDns.length; i++) {
                this.CustomDns[i] = new String(source.CustomDns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TransferProhibition", this.TransferProhibition);
        this.setParamSimple(map, prefix + "UpdateProhibition", this.UpdateProhibition);
        this.setParamArraySimple(map, prefix + "CustomDns.", this.CustomDns);

    }
}

