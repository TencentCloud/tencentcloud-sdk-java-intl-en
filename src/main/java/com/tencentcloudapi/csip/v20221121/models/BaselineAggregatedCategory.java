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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineAggregatedCategory extends AbstractModel {

    /**
    * <p>Basic information of the baseline subcategory (including category ID, name, and description).</p>
    */
    @SerializedName("Category")
    @Expose
    private BaselineCategory Category;

    /**
    * <p>Distribution statistics of detection-failed items in this subcategory by risk level.</p>
    */
    @SerializedName("NotPassItemRiskLevelStatistic")
    @Expose
    private BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic;

    /**
    * <p>Number of detection items with a PASS result in this subcategory.</p>
    */
    @SerializedName("PassItemCount")
    @Expose
    private Long PassItemCount;

    /**
    * <p>Number of detection items with NOT_PASS result in this subcategory.</p>
    */
    @SerializedName("NotPassItemCount")
    @Expose
    private Long NotPassItemCount;

    /**
    * <p>Pass rate of detection items under this subcategory, unit: percentage (0-100), rounded to two decimal places.</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Float PassRate;

    /**
    * <p>Whether the baseline category has been scanned</p>
    */
    @SerializedName("Scanned")
    @Expose
    private Boolean Scanned;

    /**
     * Get <p>Basic information of the baseline subcategory (including category ID, name, and description).</p> 
     * @return Category <p>Basic information of the baseline subcategory (including category ID, name, and description).</p>
     */
    public BaselineCategory getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Basic information of the baseline subcategory (including category ID, name, and description).</p>
     * @param Category <p>Basic information of the baseline subcategory (including category ID, name, and description).</p>
     */
    public void setCategory(BaselineCategory Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Distribution statistics of detection-failed items in this subcategory by risk level.</p> 
     * @return NotPassItemRiskLevelStatistic <p>Distribution statistics of detection-failed items in this subcategory by risk level.</p>
     */
    public BaselineRiskLevelStatistic [] getNotPassItemRiskLevelStatistic() {
        return this.NotPassItemRiskLevelStatistic;
    }

    /**
     * Set <p>Distribution statistics of detection-failed items in this subcategory by risk level.</p>
     * @param NotPassItemRiskLevelStatistic <p>Distribution statistics of detection-failed items in this subcategory by risk level.</p>
     */
    public void setNotPassItemRiskLevelStatistic(BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic) {
        this.NotPassItemRiskLevelStatistic = NotPassItemRiskLevelStatistic;
    }

    /**
     * Get <p>Number of detection items with a PASS result in this subcategory.</p> 
     * @return PassItemCount <p>Number of detection items with a PASS result in this subcategory.</p>
     */
    public Long getPassItemCount() {
        return this.PassItemCount;
    }

    /**
     * Set <p>Number of detection items with a PASS result in this subcategory.</p>
     * @param PassItemCount <p>Number of detection items with a PASS result in this subcategory.</p>
     */
    public void setPassItemCount(Long PassItemCount) {
        this.PassItemCount = PassItemCount;
    }

    /**
     * Get <p>Number of detection items with NOT_PASS result in this subcategory.</p> 
     * @return NotPassItemCount <p>Number of detection items with NOT_PASS result in this subcategory.</p>
     */
    public Long getNotPassItemCount() {
        return this.NotPassItemCount;
    }

    /**
     * Set <p>Number of detection items with NOT_PASS result in this subcategory.</p>
     * @param NotPassItemCount <p>Number of detection items with NOT_PASS result in this subcategory.</p>
     */
    public void setNotPassItemCount(Long NotPassItemCount) {
        this.NotPassItemCount = NotPassItemCount;
    }

    /**
     * Get <p>Pass rate of detection items under this subcategory, unit: percentage (0-100), rounded to two decimal places.</p> 
     * @return PassRate <p>Pass rate of detection items under this subcategory, unit: percentage (0-100), rounded to two decimal places.</p>
     */
    public Float getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>Pass rate of detection items under this subcategory, unit: percentage (0-100), rounded to two decimal places.</p>
     * @param PassRate <p>Pass rate of detection items under this subcategory, unit: percentage (0-100), rounded to two decimal places.</p>
     */
    public void setPassRate(Float PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>Whether the baseline category has been scanned</p> 
     * @return Scanned <p>Whether the baseline category has been scanned</p>
     */
    public Boolean getScanned() {
        return this.Scanned;
    }

    /**
     * Set <p>Whether the baseline category has been scanned</p>
     * @param Scanned <p>Whether the baseline category has been scanned</p>
     */
    public void setScanned(Boolean Scanned) {
        this.Scanned = Scanned;
    }

    public BaselineAggregatedCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineAggregatedCategory(BaselineAggregatedCategory source) {
        if (source.Category != null) {
            this.Category = new BaselineCategory(source.Category);
        }
        if (source.NotPassItemRiskLevelStatistic != null) {
            this.NotPassItemRiskLevelStatistic = new BaselineRiskLevelStatistic[source.NotPassItemRiskLevelStatistic.length];
            for (int i = 0; i < source.NotPassItemRiskLevelStatistic.length; i++) {
                this.NotPassItemRiskLevelStatistic[i] = new BaselineRiskLevelStatistic(source.NotPassItemRiskLevelStatistic[i]);
            }
        }
        if (source.PassItemCount != null) {
            this.PassItemCount = new Long(source.PassItemCount);
        }
        if (source.NotPassItemCount != null) {
            this.NotPassItemCount = new Long(source.NotPassItemCount);
        }
        if (source.PassRate != null) {
            this.PassRate = new Float(source.PassRate);
        }
        if (source.Scanned != null) {
            this.Scanned = new Boolean(source.Scanned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Category.", this.Category);
        this.setParamArrayObj(map, prefix + "NotPassItemRiskLevelStatistic.", this.NotPassItemRiskLevelStatistic);
        this.setParamSimple(map, prefix + "PassItemCount", this.PassItemCount);
        this.setParamSimple(map, prefix + "NotPassItemCount", this.NotPassItemCount);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "Scanned", this.Scanned);

    }
}

