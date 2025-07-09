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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferInIntlDomainBatchRequest extends AbstractModel {

    /**
    * The profile ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * The transfer passwords for the domains.
    */
    @SerializedName("PassWords")
    @Expose
    private String [] PassWords;

    /**
    * The domains to be bulk transferred in.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The payment method. Valid value: `1` (account balance).
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
    * Whether to enable the 60-day inter-registrar transfer lock.
    */
    @SerializedName("LockTransfer")
    @Expose
    private Boolean LockTransfer;

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
     * Get The transfer passwords for the domains. 
     * @return PassWords The transfer passwords for the domains.
     */
    public String [] getPassWords() {
        return this.PassWords;
    }

    /**
     * Set The transfer passwords for the domains.
     * @param PassWords The transfer passwords for the domains.
     */
    public void setPassWords(String [] PassWords) {
        this.PassWords = PassWords;
    }

    /**
     * Get The domains to be bulk transferred in. 
     * @return Domains The domains to be bulk transferred in.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The domains to be bulk transferred in.
     * @param Domains The domains to be bulk transferred in.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The payment method. Valid value: `1` (account balance). 
     * @return PayMode The payment method. Valid value: `1` (account balance).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set The payment method. Valid value: `1` (account balance).
     * @param PayMode The payment method. Valid value: `1` (account balance).
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
     * Get Whether to enable the 60-day inter-registrar transfer lock. 
     * @return LockTransfer Whether to enable the 60-day inter-registrar transfer lock.
     */
    public Boolean getLockTransfer() {
        return this.LockTransfer;
    }

    /**
     * Set Whether to enable the 60-day inter-registrar transfer lock.
     * @param LockTransfer Whether to enable the 60-day inter-registrar transfer lock.
     */
    public void setLockTransfer(Boolean LockTransfer) {
        this.LockTransfer = LockTransfer;
    }

    public TransferInIntlDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferInIntlDomainBatchRequest(TransferInIntlDomainBatchRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.PassWords != null) {
            this.PassWords = new String[source.PassWords.length];
            for (int i = 0; i < source.PassWords.length; i++) {
                this.PassWords[i] = new String(source.PassWords[i]);
            }
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
        if (source.LockTransfer != null) {
            this.LockTransfer = new Boolean(source.LockTransfer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "PassWords.", this.PassWords);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TransferProhibition", this.TransferProhibition);
        this.setParamSimple(map, prefix + "UpdateProhibition", this.UpdateProhibition);
        this.setParamSimple(map, prefix + "LockTransfer", this.LockTransfer);

    }
}

