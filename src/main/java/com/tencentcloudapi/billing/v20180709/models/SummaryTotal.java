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

public class SummaryTotal extends AbstractModel {

    /**
    * discounted total price
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Original price in CNY. The TotalCost field comes into effect after bill 3.0 (May 2021) and returns "-" before bill 3.0. In the current situation of contract price, the TotalCost field returns "-" if a price difference exists with the official website price.
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get discounted total price 
     * @return RealTotalCost discounted total price
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set discounted total price
     * @param RealTotalCost discounted total price
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Original price in CNY. The TotalCost field comes into effect after bill 3.0 (May 2021) and returns "-" before bill 3.0. In the current situation of contract price, the TotalCost field returns "-" if a price difference exists with the official website price. 
     * @return TotalCost Original price in CNY. The TotalCost field comes into effect after bill 3.0 (May 2021) and returns "-" before bill 3.0. In the current situation of contract price, the TotalCost field returns "-" if a price difference exists with the official website price.
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Original price in CNY. The TotalCost field comes into effect after bill 3.0 (May 2021) and returns "-" before bill 3.0. In the current situation of contract price, the TotalCost field returns "-" if a price difference exists with the official website price.
     * @param TotalCost Original price in CNY. The TotalCost field comes into effect after bill 3.0 (May 2021) and returns "-" before bill 3.0. In the current situation of contract price, the TotalCost field returns "-" if a price difference exists with the official website price.
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public SummaryTotal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryTotal(SummaryTotal source) {
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

