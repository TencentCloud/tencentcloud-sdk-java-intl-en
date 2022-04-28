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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetClusterLevelPriceResponse extends AbstractModel{

    /**
    * Discount price (unit: US cent)
    */
    @SerializedName("Cost")
    @Expose
    private Long Cost;

    /**
    * Original price (unit: US cent)
    */
    @SerializedName("TotalCost")
    @Expose
    private Long TotalCost;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Discount price (unit: US cent) 
     * @return Cost Discount price (unit: US cent)
     */
    public Long getCost() {
        return this.Cost;
    }

    /**
     * Set Discount price (unit: US cent)
     * @param Cost Discount price (unit: US cent)
     */
    public void setCost(Long Cost) {
        this.Cost = Cost;
    }

    /**
     * Get Original price (unit: US cent) 
     * @return TotalCost Original price (unit: US cent)
     */
    public Long getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Original price (unit: US cent)
     * @param TotalCost Original price (unit: US cent)
     */
    public void setTotalCost(Long TotalCost) {
        this.TotalCost = TotalCost;
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

    public GetClusterLevelPriceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetClusterLevelPriceResponse(GetClusterLevelPriceResponse source) {
        if (source.Cost != null) {
            this.Cost = new Long(source.Cost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Long(source.TotalCost);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

