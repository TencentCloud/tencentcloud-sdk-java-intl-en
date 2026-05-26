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

public class RenewInstanceRequest extends AbstractModel {

    /**
    * Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). only supports prepaid (annual/monthly subscription) instances.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list (only one voucher can be specified currently)
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * Get Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). only supports prepaid (annual/monthly subscription) instances. 
     * @return DBInstanceId Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). only supports prepaid (annual/monthly subscription) instances.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). only supports prepaid (annual/monthly subscription) instances.
     * @param DBInstanceId Specifies the instance ID, such as postgres-6fego161. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). only supports prepaid (annual/monthly subscription) instances.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>. 
     * @return Period Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
     * @param Period Purchase duration, in months.
<Li>Prepaid: supports `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, and `36`.</li>.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0 
     * @return AutoVoucher Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     * @param AutoVoucher Specifies whether to automatically use a voucher.
<Li>0: no.</li>.
<Li>`1`: yes.</li>.
Default value: 0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list (only one voucher can be specified currently) 
     * @return VoucherIds Voucher ID list (only one voucher can be specified currently)
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list (only one voucher can be specified currently)
     * @param VoucherIds Voucher ID list (only one voucher can be specified currently)
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    public RenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstanceRequest(RenewInstanceRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

