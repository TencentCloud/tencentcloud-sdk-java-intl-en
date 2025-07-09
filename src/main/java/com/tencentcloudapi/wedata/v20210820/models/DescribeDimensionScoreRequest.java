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

public class DescribeDimensionScoreRequest extends AbstractModel {

    /**
    * Statistics Date Timestamp
    */
    @SerializedName("StatisticsDate")
    @Expose
    private Long StatisticsDate;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Data source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Ignore Query String
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Statistics Date Timestamp 
     * @return StatisticsDate Statistics Date Timestamp
     */
    public Long getStatisticsDate() {
        return this.StatisticsDate;
    }

    /**
     * Set Statistics Date Timestamp
     * @param StatisticsDate Statistics Date Timestamp
     */
    public void setStatisticsDate(Long StatisticsDate) {
        this.StatisticsDate = StatisticsDate;
    }

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
     * Get Data source ID 
     * @return DatasourceId Data source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
     * @param DatasourceId Data source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Ignore Query String 
     * @return Filters Ignore Query String
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Ignore Query String
     * @param Filters Ignore Query String
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDimensionScoreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDimensionScoreRequest(DescribeDimensionScoreRequest source) {
        if (source.StatisticsDate != null) {
            this.StatisticsDate = new Long(source.StatisticsDate);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticsDate", this.StatisticsDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

