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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisIsolateDBInstancesRequest extends AbstractModel {

    /**
    * <p>Instance ID list, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API. Supports simultaneous de-isolation of multiple instances.</p>
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: this parameter does not take effect.</li>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Whether to use a voucher:</p><li>true: Use</li><li>false: Non-use</li>Default value: false
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * <p>Voucher id list.</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * Get <p>Instance ID list, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API. Supports simultaneous de-isolation of multiple instances.</p> 
     * @return DBInstanceIdSet <p>Instance ID list, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API. Supports simultaneous de-isolation of multiple instances.</p>
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set <p>Instance ID list, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API. Supports simultaneous de-isolation of multiple instances.</p>
     * @param DBInstanceIdSet <p>Instance ID list, which can be obtained through the <a href="https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1">DescribeDBInstances</a> API. Supports simultaneous de-isolation of multiple instances.</p>
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: this parameter does not take effect.</li> 
     * @return Period <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: this parameter does not take effect.</li>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: this parameter does not take effect.</li>
     * @param Period <p>Purchase duration, in months.</p><li>Prepaid: supports 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.</li><li>Postpaid: this parameter does not take effect.</li>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Whether to use a voucher:</p><li>true: Use</li><li>false: Non-use</li>Default value: false 
     * @return AutoVoucher <p>Whether to use a voucher:</p><li>true: Use</li><li>false: Non-use</li>Default value: false
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Whether to use a voucher:</p><li>true: Use</li><li>false: Non-use</li>Default value: false
     * @param AutoVoucher <p>Whether to use a voucher:</p><li>true: Use</li><li>false: Non-use</li>Default value: false
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>Voucher id list.</p> 
     * @return VoucherIds <p>Voucher id list.</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>Voucher id list.</p>
     * @param VoucherIds <p>Voucher id list.</p>
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

