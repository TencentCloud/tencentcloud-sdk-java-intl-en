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

public class HealthStatus extends AbstractModel {

    /**
    * Health score out of 100 points.
    */
    @SerializedName("HealthScore")
    @Expose
    private Long HealthScore;

    /**
    * Health level. Valid values: `HEALTH` (healthy), `SUB_HEALTH` (sub-healthy), `RISK` (dangerous), and `HIGH_RISK` (high-risk).
    */
    @SerializedName("HealthLevel")
    @Expose
    private String HealthLevel;

    /**
    * Total deducted scores.
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
    * Deduction details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScoreDetails")
    @Expose
    private ScoreDetail [] ScoreDetails;

    /**
     * Get Health score out of 100 points. 
     * @return HealthScore Health score out of 100 points.
     */
    public Long getHealthScore() {
        return this.HealthScore;
    }

    /**
     * Set Health score out of 100 points.
     * @param HealthScore Health score out of 100 points.
     */
    public void setHealthScore(Long HealthScore) {
        this.HealthScore = HealthScore;
    }

    /**
     * Get Health level. Valid values: `HEALTH` (healthy), `SUB_HEALTH` (sub-healthy), `RISK` (dangerous), and `HIGH_RISK` (high-risk). 
     * @return HealthLevel Health level. Valid values: `HEALTH` (healthy), `SUB_HEALTH` (sub-healthy), `RISK` (dangerous), and `HIGH_RISK` (high-risk).
     */
    public String getHealthLevel() {
        return this.HealthLevel;
    }

    /**
     * Set Health level. Valid values: `HEALTH` (healthy), `SUB_HEALTH` (sub-healthy), `RISK` (dangerous), and `HIGH_RISK` (high-risk).
     * @param HealthLevel Health level. Valid values: `HEALTH` (healthy), `SUB_HEALTH` (sub-healthy), `RISK` (dangerous), and `HIGH_RISK` (high-risk).
     */
    public void setHealthLevel(String HealthLevel) {
        this.HealthLevel = HealthLevel;
    }

    /**
     * Get Total deducted scores. 
     * @return ScoreLost Total deducted scores.
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set Total deducted scores.
     * @param ScoreLost Total deducted scores.
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    /**
     * Get Deduction details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScoreDetails Deduction details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScoreDetail [] getScoreDetails() {
        return this.ScoreDetails;
    }

    /**
     * Set Deduction details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScoreDetails Deduction details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScoreDetails(ScoreDetail [] ScoreDetails) {
        this.ScoreDetails = ScoreDetails;
    }

    public HealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthStatus(HealthStatus source) {
        if (source.HealthScore != null) {
            this.HealthScore = new Long(source.HealthScore);
        }
        if (source.HealthLevel != null) {
            this.HealthLevel = new String(source.HealthLevel);
        }
        if (source.ScoreLost != null) {
            this.ScoreLost = new Long(source.ScoreLost);
        }
        if (source.ScoreDetails != null) {
            this.ScoreDetails = new ScoreDetail[source.ScoreDetails.length];
            for (int i = 0; i < source.ScoreDetails.length; i++) {
                this.ScoreDetails[i] = new ScoreDetail(source.ScoreDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthScore", this.HealthScore);
        this.setParamSimple(map, prefix + "HealthLevel", this.HealthLevel);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);
        this.setParamArrayObj(map, prefix + "ScoreDetails.", this.ScoreDetails);

    }
}

