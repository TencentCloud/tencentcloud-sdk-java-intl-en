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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityScore extends AbstractModel {

    /**
    * Composite Score
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompositeScore")
    @Expose
    private Float CompositeScore;

    /**
    * Score Distribution
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScoringDistribution")
    @Expose
    private TableScoreStatisticsInfo [] ScoringDistribution;

    /**
    * Total Number of Tables
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalTableNumber")
    @Expose
    private Long TotalTableNumber;

    /**
     * Get Composite Score
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompositeScore Composite Score
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getCompositeScore() {
        return this.CompositeScore;
    }

    /**
     * Set Composite Score
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompositeScore Composite Score
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompositeScore(Float CompositeScore) {
        this.CompositeScore = CompositeScore;
    }

    /**
     * Get Score Distribution
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ScoringDistribution Score Distribution
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TableScoreStatisticsInfo [] getScoringDistribution() {
        return this.ScoringDistribution;
    }

    /**
     * Set Score Distribution
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ScoringDistribution Score Distribution
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScoringDistribution(TableScoreStatisticsInfo [] ScoringDistribution) {
        this.ScoringDistribution = ScoringDistribution;
    }

    /**
     * Get Total Number of Tables
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalTableNumber Total Number of Tables
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalTableNumber() {
        return this.TotalTableNumber;
    }

    /**
     * Set Total Number of Tables
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalTableNumber Total Number of Tables
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalTableNumber(Long TotalTableNumber) {
        this.TotalTableNumber = TotalTableNumber;
    }

    public QualityScore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityScore(QualityScore source) {
        if (source.CompositeScore != null) {
            this.CompositeScore = new Float(source.CompositeScore);
        }
        if (source.ScoringDistribution != null) {
            this.ScoringDistribution = new TableScoreStatisticsInfo[source.ScoringDistribution.length];
            for (int i = 0; i < source.ScoringDistribution.length; i++) {
                this.ScoringDistribution[i] = new TableScoreStatisticsInfo(source.ScoringDistribution[i]);
            }
        }
        if (source.TotalTableNumber != null) {
            this.TotalTableNumber = new Long(source.TotalTableNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompositeScore", this.CompositeScore);
        this.setParamArrayObj(map, prefix + "ScoringDistribution.", this.ScoringDistribution);
        this.setParamSimple(map, prefix + "TotalTableNumber", this.TotalTableNumber);

    }
}

