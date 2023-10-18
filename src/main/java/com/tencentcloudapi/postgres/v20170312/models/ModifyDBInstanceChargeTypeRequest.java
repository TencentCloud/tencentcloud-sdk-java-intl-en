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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceChargeTypeRequest extends AbstractModel {

    /**
    * Instance ID in the format of `postgres-6fego161`
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription.
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go.
Default value: `PREPAID`.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Validity period in months
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
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
     * Get Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription.
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go.
Default value: `PREPAID`. 
     * @return InstanceChargeType Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription.
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go.
Default value: `PREPAID`.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription.
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go.
Default value: `PREPAID`.
     * @param InstanceChargeType Instance billing mode. Valid values:
<li>`PREPAID`: Monthly subscription.
<li>`POSTPAID_BY_HOUR`: Pay-as-you-go.
Default value: `PREPAID`.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Validity period in months
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`. 
     * @return Period Validity period in months
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Validity period in months
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     * @param Period Validity period in months
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`. 
     * @return AutoRenewFlag Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     * @param AutoRenewFlag Auto-renewal flag. Valid values:
<li>`0`: Manual renewal.
<li>`1`: Automatic renewal.
Default value: `0`.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`. 
     * @return AutoVoucher Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
     * @param AutoVoucher Whether to use vouchers automatically. Valid values:
<li>`0`: No.
<li>`1`: Yes.
Default value: `0`.
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

