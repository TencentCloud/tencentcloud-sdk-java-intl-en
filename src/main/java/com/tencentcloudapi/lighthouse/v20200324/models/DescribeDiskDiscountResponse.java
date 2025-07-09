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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskDiscountResponse extends AbstractModel {

    /**
    * Currency: CNY, USD.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Discount tier details. The information of each tier includes the duration, discounted quantity, total price, discounted price, and discount details (user discount, official website discount, or final discount).
    */
    @SerializedName("DiscountDetail")
    @Expose
    private DiscountDetail [] DiscountDetail;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Currency: CNY, USD. 
     * @return Currency Currency: CNY, USD.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency: CNY, USD.
     * @param Currency Currency: CNY, USD.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Discount tier details. The information of each tier includes the duration, discounted quantity, total price, discounted price, and discount details (user discount, official website discount, or final discount). 
     * @return DiscountDetail Discount tier details. The information of each tier includes the duration, discounted quantity, total price, discounted price, and discount details (user discount, official website discount, or final discount).
     */
    public DiscountDetail [] getDiscountDetail() {
        return this.DiscountDetail;
    }

    /**
     * Set Discount tier details. The information of each tier includes the duration, discounted quantity, total price, discounted price, and discount details (user discount, official website discount, or final discount).
     * @param DiscountDetail Discount tier details. The information of each tier includes the duration, discounted quantity, total price, discounted price, and discount details (user discount, official website discount, or final discount).
     */
    public void setDiscountDetail(DiscountDetail [] DiscountDetail) {
        this.DiscountDetail = DiscountDetail;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDiskDiscountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskDiscountResponse(DescribeDiskDiscountResponse source) {
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.DiscountDetail != null) {
            this.DiscountDetail = new DiscountDetail[source.DiscountDetail.length];
            for (int i = 0; i < source.DiscountDetail.length; i++) {
                this.DiscountDetail[i] = new DiscountDetail(source.DiscountDetail[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamArrayObj(map, prefix + "DiscountDetail.", this.DiscountDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

