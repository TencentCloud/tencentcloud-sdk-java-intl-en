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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DailyScoreInfo extends AbstractModel {

    /**
    * Statistics Date TimestampNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StatisticsDate")
    @Expose
    private Long StatisticsDate;

    /**
    * ScoringNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get Statistics Date TimestampNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StatisticsDate Statistics Date TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStatisticsDate() {
        return this.StatisticsDate;
    }

    /**
     * Set Statistics Date TimestampNote: This field may return null, indicating that no valid value can be obtained.
     * @param StatisticsDate Statistics Date TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatisticsDate(Long StatisticsDate) {
        this.StatisticsDate = StatisticsDate;
    }

    /**
     * Get ScoringNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Score ScoringNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set ScoringNote: This field may return null, indicating that no valid value can be obtained.
     * @param Score ScoringNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    public DailyScoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DailyScoreInfo(DailyScoreInfo source) {
        if (source.StatisticsDate != null) {
            this.StatisticsDate = new Long(source.StatisticsDate);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticsDate", this.StatisticsDate);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

