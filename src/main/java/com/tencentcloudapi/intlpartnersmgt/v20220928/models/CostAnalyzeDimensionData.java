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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CostAnalyzeDimensionData extends AbstractModel {

    /**
    * <p>Total number of entries by dimension statistics</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Sum value</p>
    */
    @SerializedName("SumCost")
    @Expose
    private String SumCost;

    /**
    * <p>Total amount by date dimension</p>
    */
    @SerializedName("PeriodItemDetail")
    @Expose
    private PeriodItemDetail [] PeriodItemDetail;

    /**
     * Get <p>Total number of entries by dimension statistics</p> 
     * @return TotalCount <p>Total number of entries by dimension statistics</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total number of entries by dimension statistics</p>
     * @param TotalCount <p>Total number of entries by dimension statistics</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Sum value</p> 
     * @return SumCost <p>Sum value</p>
     */
    public String getSumCost() {
        return this.SumCost;
    }

    /**
     * Set <p>Sum value</p>
     * @param SumCost <p>Sum value</p>
     */
    public void setSumCost(String SumCost) {
        this.SumCost = SumCost;
    }

    /**
     * Get <p>Total amount by date dimension</p> 
     * @return PeriodItemDetail <p>Total amount by date dimension</p>
     */
    public PeriodItemDetail [] getPeriodItemDetail() {
        return this.PeriodItemDetail;
    }

    /**
     * Set <p>Total amount by date dimension</p>
     * @param PeriodItemDetail <p>Total amount by date dimension</p>
     */
    public void setPeriodItemDetail(PeriodItemDetail [] PeriodItemDetail) {
        this.PeriodItemDetail = PeriodItemDetail;
    }

    public CostAnalyzeDimensionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostAnalyzeDimensionData(CostAnalyzeDimensionData source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SumCost != null) {
            this.SumCost = new String(source.SumCost);
        }
        if (source.PeriodItemDetail != null) {
            this.PeriodItemDetail = new PeriodItemDetail[source.PeriodItemDetail.length];
            for (int i = 0; i < source.PeriodItemDetail.length; i++) {
                this.PeriodItemDetail[i] = new PeriodItemDetail(source.PeriodItemDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SumCost", this.SumCost);
        this.setParamArrayObj(map, prefix + "PeriodItemDetail.", this.PeriodItemDetail);

    }
}

