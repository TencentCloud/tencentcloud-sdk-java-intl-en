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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationBillTrendDetail extends AbstractModel {

    /**
    * Bill month
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Displayed name of bill month
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated Fees (discounted total)
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
     * Get Bill month 
     * @return Month Bill month
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month
     * @param Month Bill month
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Displayed name of bill month 
     * @return Name Displayed name of bill month
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Displayed name of bill month
     * @param Name Displayed name of bill month
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated Fees (discounted total) 
     * @return RealTotalCost Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated Fees (discounted total)
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated Fees (discounted total)
     * @param RealTotalCost Total fees (discounted total): Total fees of the cost allocation unit, Collected Fees (discounted total) + Allocated Fees (discounted total)
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    public AllocationBillTrendDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationBillTrendDetail(AllocationBillTrendDetail source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);

    }
}

