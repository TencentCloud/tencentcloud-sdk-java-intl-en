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
    * The filters. The following types are supported, and `Name` of the parameter passed in must be one of them: `spark-job-name` (job name), `spark-job-id` (job ID), `spark-app-type` (job type: `1` for batch, `2` for streaming, and `4` for SQL), `user-name` (creator), and `key-word` (job name or ID keywords for fuzzy search).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The update start time in the format of yyyy-mm-dd HH:MM:SS.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The update end time in the format of yyyy-mm-dd HH:MM:SS.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The query list offset, which defaults to 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The maximum number of queries allowed in the list, which defaults to 100.
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
     * Get The filters. The following types are supported, and `Name` of the parameter passed in must be one of them: `spark-job-name` (job name), `spark-job-id` (job ID), `spark-app-type` (job type: `1` for batch, `2` for streaming, and `4` for SQL), `user-name` (creator), and `key-word` (job name or ID keywords for fuzzy search). 
     * @return Filters The filters. The following types are supported, and `Name` of the parameter passed in must be one of them: `spark-job-name` (job name), `spark-job-id` (job ID), `spark-app-type` (job type: `1` for batch, `2` for streaming, and `4` for SQL), `user-name` (creator), and `key-word` (job name or ID keywords for fuzzy search).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The filters. The following types are supported, and `Name` of the parameter passed in must be one of them: `spark-job-name` (job name), `spark-job-id` (job ID), `spark-app-type` (job type: `1` for batch, `2` for streaming, and `4` for SQL), `user-name` (creator), and `key-word` (job name or ID keywords for fuzzy search).
     * @param Filters The filters. The following types are supported, and `Name` of the parameter passed in must be one of them: `spark-job-name` (job name), `spark-job-id` (job ID), `spark-app-type` (job type: `1` for batch, `2` for streaming, and `4` for SQL), `user-name` (creator), and `key-word` (job name or ID keywords for fuzzy search).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The update start time in the format of yyyy-mm-dd HH:MM:SS. 
     * @return StartTime The update start time in the format of yyyy-mm-dd HH:MM:SS.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The update start time in the format of yyyy-mm-dd HH:MM:SS.
     * @param StartTime The update start time in the format of yyyy-mm-dd HH:MM:SS.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The update end time in the format of yyyy-mm-dd HH:MM:SS. 
     * @return EndTime The update end time in the format of yyyy-mm-dd HH:MM:SS.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The update end time in the format of yyyy-mm-dd HH:MM:SS.
     * @param EndTime The update end time in the format of yyyy-mm-dd HH:MM:SS.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The query list offset, which defaults to 0. 
     * @return Offset The query list offset, which defaults to 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The query list offset, which defaults to 0.
     * @param Offset The query list offset, which defaults to 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The maximum number of queries allowed in the list, which defaults to 100. 
     * @return Limit The maximum number of queries allowed in the list, which defaults to 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of queries allowed in the list, which defaults to 100.
     * @param Limit The maximum number of queries allowed in the list, which defaults to 100.
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

