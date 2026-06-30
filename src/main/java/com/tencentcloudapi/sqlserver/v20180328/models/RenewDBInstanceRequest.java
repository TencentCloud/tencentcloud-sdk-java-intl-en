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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDBInstanceRequest extends AbstractModel {

    /**
    * Instance ID. For example, mssql-j8kv137v.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Renewal duration, in months. Value range: 1~48. Default value: 1.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether to automatically use voucher. 0: no, 1: yes. Default value: no.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Array of voucher IDs (currently, only one voucher can be used per order).
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Renewal flag. 0: normal renewal; 1: automatic renewal. This parameter is valid only for pay-as-you-go instances changing to monthly subscription ones.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get Instance ID. For example, mssql-j8kv137v. 
     * @return InstanceId Instance ID. For example, mssql-j8kv137v.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. For example, mssql-j8kv137v.
     * @param InstanceId Instance ID. For example, mssql-j8kv137v.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Renewal duration, in months. Value range: 1~48. Default value: 1. 
     * @return Period Renewal duration, in months. Value range: 1~48. Default value: 1.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Renewal duration, in months. Value range: 1~48. Default value: 1.
     * @param Period Renewal duration, in months. Value range: 1~48. Default value: 1.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether to automatically use voucher. 0: no, 1: yes. Default value: no. 
     * @return AutoVoucher Whether to automatically use voucher. 0: no, 1: yes. Default value: no.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use voucher. 0: no, 1: yes. Default value: no.
     * @param AutoVoucher Whether to automatically use voucher. 0: no, 1: yes. Default value: no.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Array of voucher IDs (currently, only one voucher can be used per order). 
     * @return VoucherIds Array of voucher IDs (currently, only one voucher can be used per order).
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Array of voucher IDs (currently, only one voucher can be used per order).
     * @param VoucherIds Array of voucher IDs (currently, only one voucher can be used per order).
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Renewal flag. 0: normal renewal; 1: automatic renewal. This parameter is valid only for pay-as-you-go instances changing to monthly subscription ones. 
     * @return AutoRenewFlag Renewal flag. 0: normal renewal; 1: automatic renewal. This parameter is valid only for pay-as-you-go instances changing to monthly subscription ones.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal flag. 0: normal renewal; 1: automatic renewal. This parameter is valid only for pay-as-you-go instances changing to monthly subscription ones.
     * @param AutoRenewFlag Renewal flag. 0: normal renewal; 1: automatic renewal. This parameter is valid only for pay-as-you-go instances changing to monthly subscription ones.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public RenewDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDBInstanceRequest(RenewDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

