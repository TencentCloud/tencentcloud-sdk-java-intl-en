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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineLicenseDetail extends AbstractModel {

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Billing mode. 0: pay-as-you-go; 1: prepaid.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Authorization type
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Order type. 0: default billing order; 1: trial order; 2: gift; 3: experience.
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * This field has been deprecated.
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * Auto-renewal flag. 0: default (no automatic payment); 1: automatic payment; 2: set manually (non-renewal).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Expiry time. This value is empty for pay-as-you-go.
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * Time of purchase
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * Number of authorizations
    */
    @SerializedName("LicenseCnt")
    @Expose
    private Long LicenseCnt;

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Billing mode. 0: pay-as-you-go; 1: prepaid. 
     * @return PayMode Billing mode. 0: pay-as-you-go; 1: prepaid.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. 0: pay-as-you-go; 1: prepaid.
     * @param PayMode Billing mode. 0: pay-as-you-go; 1: prepaid.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Authorization type 
     * @return LicenseType Authorization type
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type
     * @param LicenseType Authorization type
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Order type. 0: default billing order; 1: trial order; 2: gift; 3: experience. 
     * @return SourceType Order type. 0: default billing order; 1: trial order; 2: gift; 3: experience.
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Order type. 0: default billing order; 1: trial order; 2: gift; 3: experience.
     * @param SourceType Order type. 0: default billing order; 1: trial order; 2: gift; 3: experience.
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get This field has been deprecated. 
     * @return InquireKey This field has been deprecated.
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set This field has been deprecated.
     * @param InquireKey This field has been deprecated.
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get Auto-renewal flag. 0: default (no automatic payment); 1: automatic payment; 2: set manually (non-renewal). 
     * @return AutoRenewFlag Auto-renewal flag. 0: default (no automatic payment); 1: automatic payment; 2: set manually (non-renewal).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0: default (no automatic payment); 1: automatic payment; 2: set manually (non-renewal).
     * @param AutoRenewFlag Auto-renewal flag. 0: default (no automatic payment); 1: automatic payment; 2: set manually (non-renewal).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Expiry time. This value is empty for pay-as-you-go. 
     * @return Deadline Expiry time. This value is empty for pay-as-you-go.
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Expiry time. This value is empty for pay-as-you-go.
     * @param Deadline Expiry time. This value is empty for pay-as-you-go.
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get Time of purchase 
     * @return BuyTime Time of purchase
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set Time of purchase
     * @param BuyTime Time of purchase
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get Number of authorizations 
     * @return LicenseCnt Number of authorizations
     */
    public Long getLicenseCnt() {
        return this.LicenseCnt;
    }

    /**
     * Set Number of authorizations
     * @param LicenseCnt Number of authorizations
     */
    public void setLicenseCnt(Long LicenseCnt) {
        this.LicenseCnt = LicenseCnt;
    }

    public MachineLicenseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineLicenseDetail(MachineLicenseDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new String(source.BuyTime);
        }
        if (source.LicenseCnt != null) {
            this.LicenseCnt = new Long(source.LicenseCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "LicenseCnt", this.LicenseCnt);

    }
}

