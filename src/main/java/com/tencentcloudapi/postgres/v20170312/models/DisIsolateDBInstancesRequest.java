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

public class DisIsolateDBInstancesRequest extends AbstractModel{

    /**
    * Instance ID list. Currently, you can't remove multiple instances from isolation in batches. Only one instance ID can be passed in here.
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * Validity period in months
<li>Monthly subscription: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
<li>Pay-as-you-go: `1`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether to use vouchers. Valid values:
<li>`true`: Yes.
u200c<li>`false`: No.
Default value: `false`.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * Voucher ID list
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * Get Instance ID list. Currently, you can't remove multiple instances from isolation in batches. Only one instance ID can be passed in here. 
     * @return DBInstanceIdSet Instance ID list. Currently, you can't remove multiple instances from isolation in batches. Only one instance ID can be passed in here.
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set Instance ID list. Currently, you can't remove multiple instances from isolation in batches. Only one instance ID can be passed in here.
     * @param DBInstanceIdSet Instance ID list. Currently, you can't remove multiple instances from isolation in batches. Only one instance ID can be passed in here.
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
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
     * Get Whether to use vouchers. Valid values:
<li>`true`: Yes.
u200c<li>`false`: No.
Default value: `false`. 
     * @return AutoVoucher Whether to use vouchers. Valid values:
<li>`true`: Yes.
u200c<li>`false`: No.
Default value: `false`.
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to use vouchers. Valid values:
<li>`true`: Yes.
u200c<li>`false`: No.
Default value: `false`.
     * @param AutoVoucher Whether to use vouchers. Valid values:
<li>`true`: Yes.
u200c<li>`false`: No.
Default value: `false`.
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list 
     * @return VoucherIds Voucher ID list
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list
     * @param VoucherIds Voucher ID list
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    public DisIsolateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisIsolateDBInstancesRequest(DisIsolateDBInstancesRequest source) {
        if (source.DBInstanceIdSet != null) {
            this.DBInstanceIdSet = new String[source.DBInstanceIdSet.length];
            for (int i = 0; i < source.DBInstanceIdSet.length; i++) {
                this.DBInstanceIdSet[i] = new String(source.DBInstanceIdSet[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

