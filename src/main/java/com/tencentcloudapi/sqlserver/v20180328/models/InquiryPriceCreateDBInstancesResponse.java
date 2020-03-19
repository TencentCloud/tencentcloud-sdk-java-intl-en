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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateDBInstancesResponse extends AbstractModel{

    /**
    * Price before discount. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
    * The actual price to be paid. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Price before discount. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD 
     * @return OriginalPrice Price before discount. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Price before discount. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
     * @param OriginalPrice Price before discount. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get The actual price to be paid. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD 
     * @return Price The actual price to be paid. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set The actual price to be paid. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
     * @param Price The actual price to be paid. This value divided by 100 indicates the price; for example, 10010 means 100.10 USD
     */
    public void setPrice(Long Price) {
        this.Price = Price;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

