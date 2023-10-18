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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVoucherListByUinItem extends AbstractModel {

    /**
    * Customer UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * The total number of vouchers
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Voucher details
    */
    @SerializedName("Data")
    @Expose
    private QueryVoucherListByUinVoucherItem [] Data;

    /**
     * Get Customer UIN 
     * @return ClientUin Customer UIN
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Customer UIN
     * @param ClientUin Customer UIN
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get The total number of vouchers 
     * @return TotalCount The total number of vouchers
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of vouchers
     * @param TotalCount The total number of vouchers
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Voucher details 
     * @return Data Voucher details
     */
    public QueryVoucherListByUinVoucherItem [] getData() {
        return this.Data;
    }

    /**
     * Set Voucher details
     * @param Data Voucher details
     */
    public void setData(QueryVoucherListByUinVoucherItem [] Data) {
        this.Data = Data;
    }

    public QueryVoucherListByUinItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVoucherListByUinItem(QueryVoucherListByUinItem source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new QueryVoucherListByUinVoucherItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new QueryVoucherListByUinVoucherItem(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

