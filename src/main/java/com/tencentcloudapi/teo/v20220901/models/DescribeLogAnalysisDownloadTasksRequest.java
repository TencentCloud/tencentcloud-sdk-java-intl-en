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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogAnalysisDownloadTasksRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Data ownership region. Available values: <ul><li>mainland: within the Chinese mainland;</li> <li>overseas: global (excluding the Chinese mainland).</li></ul> Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Log type. Available values: <ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <ul><li>task-id: Filter by log download task id. For optional Values, see the TaskId returned by the CreateLogAnalysisDownloadTask API.</li></ul></p><p>Parameter value reference: CreateLogAnalysisDownloadTask</p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>Paginated query limit. Default value: 20. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Paginated query offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Data ownership region. Available values: <ul><li>mainland: within the Chinese mainland;</li> <li>overseas: global (excluding the Chinese mainland).</li></ul> Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.</p> 
     * @return Area <p>Data ownership region. Available values: <ul><li>mainland: within the Chinese mainland;</li> <li>overseas: global (excluding the Chinese mainland).</li></ul> Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data ownership region. Available values: <ul><li>mainland: within the Chinese mainland;</li> <li>overseas: global (excluding the Chinese mainland).</li></ul> Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.</p>
     * @param Area <p>Data ownership region. Available values: <ul><li>mainland: within the Chinese mainland;</li> <li>overseas: global (excluding the Chinese mainland).</li></ul> Note: If the site service area is "global availability zone", to obtain all data, query the data of mainland and overseas separately.</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Log type. Available values: <ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p> 
     * @return LogType <p>Log type. Available values: <ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type. Available values: <ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
     * @param LogType <p>Log type. Available values: <ul><li> l7-access-logs: L7 access log;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <ul><li>task-id: Filter by log download task id. For optional Values, see the TaskId returned by the CreateLogAnalysisDownloadTask API.</li></ul></p><p>Parameter value reference: CreateLogAnalysisDownloadTask</p> 
     * @return Filters <p>Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <ul><li>task-id: Filter by log download task id. For optional Values, see the TaskId returned by the CreateLogAnalysisDownloadTask API.</li></ul></p><p>Parameter value reference: CreateLogAnalysisDownloadTask</p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <ul><li>task-id: Filter by log download task id. For optional Values, see the TaskId returned by the CreateLogAnalysisDownloadTask API.</li></ul></p><p>Parameter value reference: CreateLogAnalysisDownloadTask</p>
     * @param Filters <p>Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <ul><li>task-id: Filter by log download task id. For optional Values, see the TaskId returned by the CreateLogAnalysisDownloadTask API.</li></ul></p><p>Parameter value reference: CreateLogAnalysisDownloadTask</p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Paginated query limit. Default value: 20. Maximum value: 100.</p> 
     * @return Limit <p>Paginated query limit. Default value: 20. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Paginated query limit. Default value: 20. Maximum value: 100.</p>
     * @param Limit <p>Paginated query limit. Default value: 20. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Paginated query offset. Default value: 0.</p> 
     * @return Offset <p>Paginated query offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paginated query offset. Default value: 0.</p>
     * @param Offset <p>Paginated query offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLogAnalysisDownloadTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogAnalysisDownloadTasksRequest(DescribeLogAnalysisDownloadTasksRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

