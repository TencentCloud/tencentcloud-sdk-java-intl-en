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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherUsageDetailsRequest extends AbstractModel {

    /**
    * The number of records per page. The default is 20, and the maximum is 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The page number the records start from. The default is 1.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The voucher ID.
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * The operator. The default is the UIN of the current.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get The number of records per page. The default is 20, and the maximum is 1,000. 
     * @return Limit The number of records per page. The default is 20, and the maximum is 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records per page. The default is 20, and the maximum is 1,000.
     * @param Limit The number of records per page. The default is 20, and the maximum is 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The page number the records start from. The default is 1. 
     * @return Offset The page number the records start from. The default is 1.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The page number the records start from. The default is 1.
     * @param Offset The page number the records start from. The default is 1.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The voucher ID. 
     * @return VoucherId The voucher ID.
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set The voucher ID.
     * @param VoucherId The voucher ID.
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get The operator. The default is the UIN of the current. 
     * @return Operator The operator. The default is the UIN of the current.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The operator. The default is the UIN of the current.
     * @param Operator The operator. The default is the UIN of the current.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DescribeVoucherUsageDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherUsageDetailsRequest(DescribeVoucherUsageDetailsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

