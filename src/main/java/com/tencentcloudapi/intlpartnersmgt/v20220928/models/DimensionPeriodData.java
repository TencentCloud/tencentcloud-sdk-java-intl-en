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

public class DimensionPeriodData extends AbstractModel {

    /**
    * <p>Function name by dimensional classification</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>code corresponding to the function name after dimensional classification</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>Sum value of the current group</p>
    */
    @SerializedName("SumCost")
    @Expose
    private String SumCost;

    /**
    * <p>Amount statistics by date grouping</p>
    */
    @SerializedName("ItemDetail")
    @Expose
    private PeriodItemDetail [] ItemDetail;

    /**
     * Get <p>Function name by dimensional classification</p> 
     * @return Name <p>Function name by dimensional classification</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Function name by dimensional classification</p>
     * @param Name <p>Function name by dimensional classification</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>code corresponding to the function name after dimensional classification</p> 
     * @return Code <p>code corresponding to the function name after dimensional classification</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>code corresponding to the function name after dimensional classification</p>
     * @param Code <p>code corresponding to the function name after dimensional classification</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>Sum value of the current group</p> 
     * @return SumCost <p>Sum value of the current group</p>
     */
    public String getSumCost() {
        return this.SumCost;
    }

    /**
     * Set <p>Sum value of the current group</p>
     * @param SumCost <p>Sum value of the current group</p>
     */
    public void setSumCost(String SumCost) {
        this.SumCost = SumCost;
    }

    /**
     * Get <p>Amount statistics by date grouping</p> 
     * @return ItemDetail <p>Amount statistics by date grouping</p>
     */
    public PeriodItemDetail [] getItemDetail() {
        return this.ItemDetail;
    }

    /**
     * Set <p>Amount statistics by date grouping</p>
     * @param ItemDetail <p>Amount statistics by date grouping</p>
     */
    public void setItemDetail(PeriodItemDetail [] ItemDetail) {
        this.ItemDetail = ItemDetail;
    }

    public DimensionPeriodData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionPeriodData(DimensionPeriodData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.SumCost != null) {
            this.SumCost = new String(source.SumCost);
        }
        if (source.ItemDetail != null) {
            this.ItemDetail = new PeriodItemDetail[source.ItemDetail.length];
            for (int i = 0; i < source.ItemDetail.length; i++) {
                this.ItemDetail[i] = new PeriodItemDetail(source.ItemDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "SumCost", this.SumCost);
        this.setParamArrayObj(map, prefix + "ItemDetail.", this.ItemDetail);

    }
}

