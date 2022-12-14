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

public class InquiryPriceRenewDBInstanceResponse extends AbstractModel{

    /**
    * Published price in cents. For example, 24650 indicates 246.5 USD.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
    * Discounted total amount. For example, 24650 indicates 246.5 USD.
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * Currency, such as USD.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Published price in cents. For example, 24650 indicates 246.5 USD. 
     * @return OriginalPrice Published price in cents. For example, 24650 indicates 246.5 USD.
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Published price in cents. For example, 24650 indicates 246.5 USD.
     * @param OriginalPrice Published price in cents. For example, 24650 indicates 246.5 USD.
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discounted total amount. For example, 24650 indicates 246.5 USD. 
     * @return Price Discounted total amount. For example, 24650 indicates 246.5 USD.
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set Discounted total amount. For example, 24650 indicates 246.5 USD.
     * @param Price Discounted total amount. For example, 24650 indicates 246.5 USD.
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get Currency, such as USD. 
     * @return Currency Currency, such as USD.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency, such as USD.
     * @param Currency Currency, such as USD.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
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

    public InquiryPriceRenewDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewDBInstanceResponse(InquiryPriceRenewDBInstanceResponse source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Long(source.OriginalPrice);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

