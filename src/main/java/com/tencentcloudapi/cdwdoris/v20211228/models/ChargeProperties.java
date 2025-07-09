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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChargeProperties extends AbstractModel {

    /**
    * Billing type: PREPAID for prepayment, and POSTPAID_BY_HOUR for postpayment.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Whether to automatically renew. 1 means automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Billing duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Billing time unit, and "m" means month, etc.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
     * Get Billing type: PREPAID for prepayment, and POSTPAID_BY_HOUR for postpayment.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Billing type: PREPAID for prepayment, and POSTPAID_BY_HOUR for postpayment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type: PREPAID for prepayment, and POSTPAID_BY_HOUR for postpayment.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Billing type: PREPAID for prepayment, and POSTPAID_BY_HOUR for postpayment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Whether to automatically renew. 1 means automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Whether to automatically renew. 1 means automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether to automatically renew. 1 means automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Whether to automatically renew. 1 means automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Billing duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeSpan Billing duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Billing duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeSpan Billing duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Billing time unit, and "m" means month, etc.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeUnit Billing time unit, and "m" means month, etc.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Billing time unit, and "m" means month, etc.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeUnit Billing time unit, and "m" means month, etc.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    public ChargeProperties() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChargeProperties(ChargeProperties source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

