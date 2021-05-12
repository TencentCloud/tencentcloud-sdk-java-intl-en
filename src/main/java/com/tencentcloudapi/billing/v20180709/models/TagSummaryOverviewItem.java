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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagSummaryOverviewItem extends AbstractModel{

    /**
    * Tag value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealTotalCostRatio")
    @Expose
    private String RealTotalCostRatio;

    /**
     * Get Tag value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagValue Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagValue Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Actual cost
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealTotalCost Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealTotalCost Actual cost
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealTotalCostRatio Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealTotalCostRatio() {
        return this.RealTotalCostRatio;
    }

    /**
     * Set Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealTotalCostRatio Cost percentage rounded to two decimal places
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealTotalCostRatio(String RealTotalCostRatio) {
        this.RealTotalCostRatio = RealTotalCostRatio;
    }

    public TagSummaryOverviewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagSummaryOverviewItem(TagSummaryOverviewItem source) {
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.RealTotalCostRatio != null) {
            this.RealTotalCostRatio = new String(source.RealTotalCostRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "RealTotalCostRatio", this.RealTotalCostRatio);

    }
}

