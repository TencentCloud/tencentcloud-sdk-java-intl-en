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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskOperationLogsRequest extends AbstractModel {

    /**
    * Filter conditions. The following conditions are supported:
<li>disk-id - Array of String - Required or not: Yes - Filter by cloud disk ID, with maximum of 10 cloud disk IDs able to be specified per request.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The start time of the operation logs to be queried, for example: '2019-11-22 00:00:00"
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of the operation logs to be queried, for example: '2019-11-22 23:59:59"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Filter conditions. The following conditions are supported:
<li>disk-id - Array of String - Required or not: Yes - Filter by cloud disk ID, with maximum of 10 cloud disk IDs able to be specified per request. 
     * @return Filters Filter conditions. The following conditions are supported:
<li>disk-id - Array of String - Required or not: Yes - Filter by cloud disk ID, with maximum of 10 cloud disk IDs able to be specified per request.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. The following conditions are supported:
<li>disk-id - Array of String - Required or not: Yes - Filter by cloud disk ID, with maximum of 10 cloud disk IDs able to be specified per request.
     * @param Filters Filter conditions. The following conditions are supported:
<li>disk-id - Array of String - Required or not: Yes - Filter by cloud disk ID, with maximum of 10 cloud disk IDs able to be specified per request.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The start time of the operation logs to be queried, for example: '2019-11-22 00:00:00" 
     * @return BeginTime The start time of the operation logs to be queried, for example: '2019-11-22 00:00:00"
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of the operation logs to be queried, for example: '2019-11-22 00:00:00"
     * @param BeginTime The start time of the operation logs to be queried, for example: '2019-11-22 00:00:00"
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of the operation logs to be queried, for example: '2019-11-22 23:59:59" 
     * @return EndTime The end time of the operation logs to be queried, for example: '2019-11-22 23:59:59"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the operation logs to be queried, for example: '2019-11-22 23:59:59"
     * @param EndTime The end time of the operation logs to be queried, for example: '2019-11-22 23:59:59"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeDiskOperationLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskOperationLogsRequest(DescribeDiskOperationLogsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

