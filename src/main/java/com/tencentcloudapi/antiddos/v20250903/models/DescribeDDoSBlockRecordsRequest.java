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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSBlockRecordsRequest extends AbstractModel {

    /**
    * <p>Start time of the query. Support up to data query for the past one year.</p><p>Parameter format: 2026-02-04T11:30:00+08:00.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time of query. The query time range (EndTime - StartTime) must be less than or equal to 31 days.</p><p>Parameter format: 2026-03-04T11:30:00+08:00.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, return the current list of resources blocked under the appid. Detailed filter criteria:</p><ul><li> Resource: Filter by blocked IP or six-segment resource format;</li><li> Status: Filter by blocked resource status.</li></ul><p>When Filters.Name value is Status, Filters.Values valid values:</p><ul><li>Blocked: blocked;</li><li>Unblocking: unblocking;</li><li>Unblocked: unblocked.</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Paginated query limit count. Maximum value: 100.</p><p>Default value: 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Paginated query offset.</p><p>Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>Start time of the query. Support up to data query for the past one year.</p><p>Parameter format: 2026-02-04T11:30:00+08:00.</p> 
     * @return StartTime <p>Start time of the query. Support up to data query for the past one year.</p><p>Parameter format: 2026-02-04T11:30:00+08:00.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time of the query. Support up to data query for the past one year.</p><p>Parameter format: 2026-02-04T11:30:00+08:00.</p>
     * @param StartTime <p>Start time of the query. Support up to data query for the past one year.</p><p>Parameter format: 2026-02-04T11:30:00+08:00.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time of query. The query time range (EndTime - StartTime) must be less than or equal to 31 days.</p><p>Parameter format: 2026-03-04T11:30:00+08:00.</p> 
     * @return EndTime <p>End time of query. The query time range (EndTime - StartTime) must be less than or equal to 31 days.</p><p>Parameter format: 2026-03-04T11:30:00+08:00.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of query. The query time range (EndTime - StartTime) must be less than or equal to 31 days.</p><p>Parameter format: 2026-03-04T11:30:00+08:00.</p>
     * @param EndTime <p>End time of query. The query time range (EndTime - StartTime) must be less than or equal to 31 days.</p><p>Parameter format: 2026-03-04T11:30:00+08:00.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, return the current list of resources blocked under the appid. Detailed filter criteria:</p><ul><li> Resource: Filter by blocked IP or six-segment resource format;</li><li> Status: Filter by blocked resource status.</li></ul><p>When Filters.Name value is Status, Filters.Values valid values:</p><ul><li>Blocked: blocked;</li><li>Unblocking: unblocking;</li><li>Unblocked: unblocked.</li></ul> 
     * @return Filters <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, return the current list of resources blocked under the appid. Detailed filter criteria:</p><ul><li> Resource: Filter by blocked IP or six-segment resource format;</li><li> Status: Filter by blocked resource status.</li></ul><p>When Filters.Name value is Status, Filters.Values valid values:</p><ul><li>Blocked: blocked;</li><li>Unblocking: unblocking;</li><li>Unblocked: unblocked.</li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, return the current list of resources blocked under the appid. Detailed filter criteria:</p><ul><li> Resource: Filter by blocked IP or six-segment resource format;</li><li> Status: Filter by blocked resource status.</li></ul><p>When Filters.Name value is Status, Filters.Values valid values:</p><ul><li>Blocked: blocked;</li><li>Unblocking: unblocking;</li><li>Unblocked: unblocked.</li></ul>
     * @param Filters <p>Filter criteria. The maximum number of Filters.Values is 20. If this parameter is left empty, return the current list of resources blocked under the appid. Detailed filter criteria:</p><ul><li> Resource: Filter by blocked IP or six-segment resource format;</li><li> Status: Filter by blocked resource status.</li></ul><p>When Filters.Name value is Status, Filters.Values valid values:</p><ul><li>Blocked: blocked;</li><li>Unblocking: unblocking;</li><li>Unblocked: unblocked.</li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Paginated query limit count. Maximum value: 100.</p><p>Default value: 20</p> 
     * @return Limit <p>Paginated query limit count. Maximum value: 100.</p><p>Default value: 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Paginated query limit count. Maximum value: 100.</p><p>Default value: 20</p>
     * @param Limit <p>Paginated query limit count. Maximum value: 100.</p><p>Default value: 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Paginated query offset.</p><p>Default value: 0.</p> 
     * @return Offset <p>Paginated query offset.</p><p>Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paginated query offset.</p><p>Default value: 0.</p>
     * @param Offset <p>Paginated query offset.</p><p>Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeDDoSBlockRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSBlockRecordsRequest(DescribeDDoSBlockRecordsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

