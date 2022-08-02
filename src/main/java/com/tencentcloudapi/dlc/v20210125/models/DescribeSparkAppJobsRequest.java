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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppJobsRequest extends AbstractModel{

    /**
    * The returned results are sorted by this field.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Descending or ascending order, such as `desc`.
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * Filter by this parameter, which can be `spark-job-name`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Update start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Update end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Query list offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Query list limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The returned results are sorted by this field. 
     * @return SortBy The returned results are sorted by this field.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set The returned results are sorted by this field.
     * @param SortBy The returned results are sorted by this field.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Descending or ascending order, such as `desc`. 
     * @return Sorting Descending or ascending order, such as `desc`.
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set Descending or ascending order, such as `desc`.
     * @param Sorting Descending or ascending order, such as `desc`.
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get Filter by this parameter, which can be `spark-job-name`. 
     * @return Filters Filter by this parameter, which can be `spark-job-name`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter by this parameter, which can be `spark-job-name`.
     * @param Filters Filter by this parameter, which can be `spark-job-name`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Update start time 
     * @return StartTime Update start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Update start time
     * @param StartTime Update start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Update end time 
     * @return EndTime Update end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Update end time
     * @param EndTime Update end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query list offset 
     * @return Offset Query list offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query list offset
     * @param Offset Query list offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Query list limit 
     * @return Limit Query list limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Query list limit
     * @param Limit Query list limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSparkAppJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppJobsRequest(DescribeSparkAppJobsRequest source) {
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

