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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScoreDetail extends AbstractModel {

    /**
    * Deduction item types. Valid values: availability, maintainability, performance, and reliability.
    */
    @SerializedName("IssueType")
    @Expose
    private String IssueType;

    /**
    * Total scores deducted.
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
    * Upper limit of the deducted scores.
    */
    @SerializedName("ScoreLostMax")
    @Expose
    private Long ScoreLostMax;

    /**
    * Deduction item list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private ScoreItem [] Items;

    /**
     * Get Deduction item types. Valid values: availability, maintainability, performance, and reliability. 
     * @return IssueType Deduction item types. Valid values: availability, maintainability, performance, and reliability.
     */
    public String getIssueType() {
        return this.IssueType;
    }

    /**
     * Set Deduction item types. Valid values: availability, maintainability, performance, and reliability.
     * @param IssueType Deduction item types. Valid values: availability, maintainability, performance, and reliability.
     */
    public void setIssueType(String IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get Total scores deducted. 
     * @return ScoreLost Total scores deducted.
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set Total scores deducted.
     * @param ScoreLost Total scores deducted.
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    /**
     * Get Upper limit of the deducted scores. 
     * @return ScoreLostMax Upper limit of the deducted scores.
     */
    public Long getScoreLostMax() {
        return this.ScoreLostMax;
    }

    /**
     * Set Upper limit of the deducted scores.
     * @param ScoreLostMax Upper limit of the deducted scores.
     */
    public void setScoreLostMax(Long ScoreLostMax) {
        this.ScoreLostMax = ScoreLostMax;
    }

    /**
     * Get Deduction item list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Items Deduction item list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public ScoreItem [] getItems() {
        return this.Items;
    }

    /**
     * Set Deduction item list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Items Deduction item list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setItems(ScoreItem [] Items) {
        this.Items = Items;
    }

    public ScoreDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreDetail(ScoreDetail source) {
        if (source.IssueType != null) {
            this.IssueType = new String(source.IssueType);
        }
        if (source.ScoreLost != null) {
            this.ScoreLost = new Long(source.ScoreLost);
        }
        if (source.ScoreLostMax != null) {
            this.ScoreLostMax = new Long(source.ScoreLostMax);
        }
        if (source.Items != null) {
            this.Items = new ScoreItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ScoreItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);
        this.setParamSimple(map, prefix + "ScoreLostMax", this.ScoreLostMax);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

