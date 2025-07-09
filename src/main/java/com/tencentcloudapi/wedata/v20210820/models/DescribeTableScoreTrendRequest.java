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

public class DescribeTableScoreTrendRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Start time Second-level Timestamp
    */
    @SerializedName("StatisticsStartDate")
    @Expose
    private Long StatisticsStartDate;

    /**
    * End time Second-level Timestamp
    */
    @SerializedName("StatisticsEndDate")
    @Expose
    private Long StatisticsEndDate;

    /**
    * Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
    */
    @SerializedName("ScoreType")
    @Expose
    private String ScoreType;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Start time Second-level Timestamp 
     * @return StatisticsStartDate Start time Second-level Timestamp
     */
    public Long getStatisticsStartDate() {
        return this.StatisticsStartDate;
    }

    /**
     * Set Start time Second-level Timestamp
     * @param StatisticsStartDate Start time Second-level Timestamp
     */
    public void setStatisticsStartDate(Long StatisticsStartDate) {
        this.StatisticsStartDate = StatisticsStartDate;
    }

    /**
     * Get End time Second-level Timestamp 
     * @return StatisticsEndDate End time Second-level Timestamp
     */
    public Long getStatisticsEndDate() {
        return this.StatisticsEndDate;
    }

    /**
     * Set End time Second-level Timestamp
     * @param StatisticsEndDate End time Second-level Timestamp
     */
    public void setStatisticsEndDate(Long StatisticsEndDate) {
        this.StatisticsEndDate = StatisticsEndDate;
    }

    /**
     * Get Table ID 
     * @return TableId Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
     * @param TableId Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1 
     * @return ScoreType 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
     */
    public String getScoreType() {
        return this.ScoreType;
    }

    /**
     * Set 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
     * @param ScoreType 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
     */
    public void setScoreType(String ScoreType) {
        this.ScoreType = ScoreType;
    }

    public DescribeTableScoreTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableScoreTrendRequest(DescribeTableScoreTrendRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.StatisticsStartDate != null) {
            this.StatisticsStartDate = new Long(source.StatisticsStartDate);
        }
        if (source.StatisticsEndDate != null) {
            this.StatisticsEndDate = new Long(source.StatisticsEndDate);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.ScoreType != null) {
            this.ScoreType = new String(source.ScoreType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StatisticsStartDate", this.StatisticsStartDate);
        this.setParamSimple(map, prefix + "StatisticsEndDate", this.StatisticsEndDate);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "ScoreType", this.ScoreType);

    }
}

