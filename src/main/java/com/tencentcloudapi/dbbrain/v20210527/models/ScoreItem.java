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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScoreItem extends AbstractModel {

    /**
    * Exception diagnosis item name.
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * Diagnosis item type. Valid values: `Availability`, `Maintainability`, `Performance`, `Reliability`.
    */
    @SerializedName("IssueType")
    @Expose
    private String IssueType;

    /**
    * Health level. Valid values: `Healthy`, `Reminder`, `Alarm`, `Severe`, `Critical`.
    */
    @SerializedName("TopSeverity")
    @Expose
    private String TopSeverity;

    /**
    * Number of occurrences of this exception diagnosis item.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Deducted scores.
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
     * Get Exception diagnosis item name. 
     * @return DiagItem Exception diagnosis item name.
     */
    public String getDiagItem() {
        return this.DiagItem;
    }

    /**
     * Set Exception diagnosis item name.
     * @param DiagItem Exception diagnosis item name.
     */
    public void setDiagItem(String DiagItem) {
        this.DiagItem = DiagItem;
    }

    /**
     * Get Diagnosis item type. Valid values: `Availability`, `Maintainability`, `Performance`, `Reliability`. 
     * @return IssueType Diagnosis item type. Valid values: `Availability`, `Maintainability`, `Performance`, `Reliability`.
     */
    public String getIssueType() {
        return this.IssueType;
    }

    /**
     * Set Diagnosis item type. Valid values: `Availability`, `Maintainability`, `Performance`, `Reliability`.
     * @param IssueType Diagnosis item type. Valid values: `Availability`, `Maintainability`, `Performance`, `Reliability`.
     */
    public void setIssueType(String IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get Health level. Valid values: `Healthy`, `Reminder`, `Alarm`, `Severe`, `Critical`. 
     * @return TopSeverity Health level. Valid values: `Healthy`, `Reminder`, `Alarm`, `Severe`, `Critical`.
     */
    public String getTopSeverity() {
        return this.TopSeverity;
    }

    /**
     * Set Health level. Valid values: `Healthy`, `Reminder`, `Alarm`, `Severe`, `Critical`.
     * @param TopSeverity Health level. Valid values: `Healthy`, `Reminder`, `Alarm`, `Severe`, `Critical`.
     */
    public void setTopSeverity(String TopSeverity) {
        this.TopSeverity = TopSeverity;
    }

    /**
     * Get Number of occurrences of this exception diagnosis item. 
     * @return Count Number of occurrences of this exception diagnosis item.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of occurrences of this exception diagnosis item.
     * @param Count Number of occurrences of this exception diagnosis item.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Deducted scores. 
     * @return ScoreLost Deducted scores.
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set Deducted scores.
     * @param ScoreLost Deducted scores.
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    public ScoreItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreItem(ScoreItem source) {
        if (source.DiagItem != null) {
            this.DiagItem = new String(source.DiagItem);
        }
        if (source.IssueType != null) {
            this.IssueType = new String(source.IssueType);
        }
        if (source.TopSeverity != null) {
            this.TopSeverity = new String(source.TopSeverity);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ScoreLost != null) {
            this.ScoreLost = new Long(source.ScoreLost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagItem", this.DiagItem);
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "TopSeverity", this.TopSeverity);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);

    }
}

