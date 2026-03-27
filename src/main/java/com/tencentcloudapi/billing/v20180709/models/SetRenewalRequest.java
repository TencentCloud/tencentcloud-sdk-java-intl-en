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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetRenewalRequest extends AbstractModel {

    /**
    * Product code.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Region code.
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Instance ID. Only one can be specified.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Renewal flag. Enumeration values are as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Automatic renewal cycle length. If left empty, the default value set by product is used.
If it is month, support: 1-11
If it is year, support: 1-5.
Supported range mainly depends on the product side.
    */
    @SerializedName("RenewPeriod")
    @Expose
    private String RenewPeriod;

    /**
    * Automatic renewal cycle unit. If left empty, the default value set by the product is used.
Year y, month m
Supported range mainly depends on the product side.
    */
    @SerializedName("RenewPeriodUnit")
    @Expose
    private String RenewPeriodUnit;

    /**
     * Get Product code. 
     * @return ProductCode Product code.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Product code.
     * @param ProductCode Product code.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Region code. 
     * @return RegionCode Region code.
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region code.
     * @param RegionCode Region code.
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Instance ID. Only one can be specified. 
     * @return InstanceId Instance ID. Only one can be specified.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Only one can be specified.
     * @param InstanceId Instance ID. Only one can be specified.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Renewal flag. Enumeration values are as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration. 
     * @return RenewFlag Renewal flag. Enumeration values are as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag. Enumeration values are as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
     * @param RenewFlag Renewal flag. Enumeration values are as follows:
NOTIFY_AND_MANUAL_RENEW: manual renewal.
NOTIFY_AND_AUTO_RENEW: automatic renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: non-renewal upon expiration.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Automatic renewal cycle length. If left empty, the default value set by product is used.
If it is month, support: 1-11
If it is year, support: 1-5.
Supported range mainly depends on the product side. 
     * @return RenewPeriod Automatic renewal cycle length. If left empty, the default value set by product is used.
If it is month, support: 1-11
If it is year, support: 1-5.
Supported range mainly depends on the product side.
     */
    public String getRenewPeriod() {
        return this.RenewPeriod;
    }

    /**
     * Set Automatic renewal cycle length. If left empty, the default value set by product is used.
If it is month, support: 1-11
If it is year, support: 1-5.
Supported range mainly depends on the product side.
     * @param RenewPeriod Automatic renewal cycle length. If left empty, the default value set by product is used.
If it is month, support: 1-11
If it is year, support: 1-5.
Supported range mainly depends on the product side.
     */
    public void setRenewPeriod(String RenewPeriod) {
        this.RenewPeriod = RenewPeriod;
    }

    /**
     * Get Automatic renewal cycle unit. If left empty, the default value set by the product is used.
Year y, month m
Supported range mainly depends on the product side. 
     * @return RenewPeriodUnit Automatic renewal cycle unit. If left empty, the default value set by the product is used.
Year y, month m
Supported range mainly depends on the product side.
     */
    public String getRenewPeriodUnit() {
        return this.RenewPeriodUnit;
    }

    /**
     * Set Automatic renewal cycle unit. If left empty, the default value set by the product is used.
Year y, month m
Supported range mainly depends on the product side.
     * @param RenewPeriodUnit Automatic renewal cycle unit. If left empty, the default value set by the product is used.
Year y, month m
Supported range mainly depends on the product side.
     */
    public void setRenewPeriodUnit(String RenewPeriodUnit) {
        this.RenewPeriodUnit = RenewPeriodUnit;
    }

    public SetRenewalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetRenewalRequest(SetRenewalRequest source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.RenewPeriod != null) {
            this.RenewPeriod = new String(source.RenewPeriod);
        }
        if (source.RenewPeriodUnit != null) {
            this.RenewPeriodUnit = new String(source.RenewPeriodUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "RenewPeriod", this.RenewPeriod);
        this.setParamSimple(map, prefix + "RenewPeriodUnit", this.RenewPeriodUnit);

    }
}

