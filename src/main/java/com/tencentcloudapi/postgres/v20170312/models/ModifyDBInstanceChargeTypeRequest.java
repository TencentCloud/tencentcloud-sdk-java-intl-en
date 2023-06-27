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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceChargeTypeRequest extends AbstractModel{

    /**
    * Instance ID in the format of `postgres-6fego161`
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance billing mode.  Valid values:  `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go). Default value:  `PREPAID`.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Validity period  in months. Valid values:  Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Renewal flag. Valid values；  Valid values: `0` (manual renewal), `1` (auto-renewal).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
     * Get Instance ID in the format of `postgres-6fego161` 
     * @return DBInstanceId Instance ID in the format of `postgres-6fego161`
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of `postgres-6fego161`
     * @param DBInstanceId Instance ID in the format of `postgres-6fego161`
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance billing mode.  Valid values:  `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go). Default value:  `PREPAID`. 
     * @return InstanceChargeType Instance billing mode.  Valid values:  `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go). Default value:  `PREPAID`.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode.  Valid values:  `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go). Default value:  `PREPAID`.
     * @param InstanceChargeType Instance billing mode.  Valid values:  `PREPAID` (monthly subscription), `POSTPAID_BY_HOUR` (pay-as-you-go). Default value:  `PREPAID`.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Validity period  in months. Valid values:  Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used. 
     * @return Period Validity period  in months. Valid values:  Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Validity period  in months. Valid values:  Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     * @param Period Validity period  in months. Valid values:  Valid period in months of the purchased instance. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. This parameter is set to `1` when the pay-as-you-go billing mode is used.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Renewal flag. Valid values；  Valid values: `0` (manual renewal), `1` (auto-renewal). 
     * @return AutoRenewFlag Renewal flag. Valid values；  Valid values: `0` (manual renewal), `1` (auto-renewal).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal flag. Valid values；  Valid values: `0` (manual renewal), `1` (auto-renewal).
     * @param AutoRenewFlag Renewal flag. Valid values；  Valid values: `0` (manual renewal), `1` (auto-renewal).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`. 
     * @return AutoVoucher Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
     * @param AutoVoucher Whether to automatically use vouchers. Valid values: `1` (yes), `0` (no). Default value: `0`.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public ModifyDBInstanceChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceChargeTypeRequest(ModifyDBInstanceChargeTypeRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

