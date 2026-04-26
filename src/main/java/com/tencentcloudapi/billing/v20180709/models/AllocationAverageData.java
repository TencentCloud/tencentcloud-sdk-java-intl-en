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

public class AllocationAverageData extends AbstractModel {

    /**
    * Start month
    */
    @SerializedName("BeginMonth")
    @Expose
    private String BeginMonth;

    /**
    * End month.
    */
    @SerializedName("EndMonth")
    @Expose
    private String EndMonth;

    /**
    * Average value of total fees (discounted total)
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
     * Get Start month 
     * @return BeginMonth Start month
     */
    public String getBeginMonth() {
        return this.BeginMonth;
    }

    /**
     * Set Start month
     * @param BeginMonth Start month
     */
    public void setBeginMonth(String BeginMonth) {
        this.BeginMonth = BeginMonth;
    }

    /**
     * Get End month. 
     * @return EndMonth End month.
     */
    public String getEndMonth() {
        return this.EndMonth;
    }

    /**
     * Set End month.
     * @param EndMonth End month.
     */
    public void setEndMonth(String EndMonth) {
        this.EndMonth = EndMonth;
    }

    /**
     * Get Average value of total fees (discounted total) 
     * @return RealTotalCost Average value of total fees (discounted total)
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Average value of total fees (discounted total)
     * @param RealTotalCost Average value of total fees (discounted total)
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    public AllocationAverageData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationAverageData(AllocationAverageData source) {
        if (source.BeginMonth != null) {
            this.BeginMonth = new String(source.BeginMonth);
        }
        if (source.EndMonth != null) {
            this.EndMonth = new String(source.EndMonth);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginMonth", this.BeginMonth);
        this.setParamSimple(map, prefix + "EndMonth", this.EndMonth);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);

    }
}

