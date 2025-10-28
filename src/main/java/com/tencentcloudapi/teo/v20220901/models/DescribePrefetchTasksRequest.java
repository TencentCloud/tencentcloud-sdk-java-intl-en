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

public class DescribePrefetchTasksRequest extends AbstractModel {

    /**
    * Site ID.The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980)
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Start time of the query. Either time or job-id is required.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query. Either time or job-id is required.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number limit of paginated query. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>job-id: Filter by task ID in the format like 1379afjk91u32h. Multiple values and fuzzy queries are not supported.</li><li>target: Filter by target resource information in the format like http://www.qq.com/1.txt. Multiple values and fuzzy queries are not supported.</li><li>domains: Filter by domain name in the format like www.qq.com. Fuzzy queries are not supported.</li><li>statuses: Filter by task status. Fuzzy queries are not supported. Options:<br>processing: processing<br>success: successful<br>failed: failed<br>timeout: timed out<br>invalid: invalid, that is, the response status code of the origin server is not 2xx. Please check the origin server service.<br>canceled: Canceled
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get Site ID.The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980) 
     * @return ZoneId Site ID.The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980)
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980)
     * @param ZoneId Site ID.The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980)
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Start time of the query. Either time or job-id is required. 
     * @return StartTime Start time of the query. Either time or job-id is required.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query. Either time or job-id is required.
     * @param StartTime Start time of the query. Either time or job-id is required.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query. Either time or job-id is required. 
     * @return EndTime End time of the query. Either time or job-id is required.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query. Either time or job-id is required.
     * @param EndTime End time of the query. Either time or job-id is required.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Offset of paginated query. Default value: 0. 
     * @return Offset Offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of paginated query. Default value: 0.
     * @param Offset Offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number limit of paginated query. Default value: 20. Maximum value: 1000. 
     * @return Limit Number limit of paginated query. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Maximum value: 1000.
     * @param Limit Number limit of paginated query. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>job-id: Filter by task ID in the format like 1379afjk91u32h. Multiple values and fuzzy queries are not supported.</li><li>target: Filter by target resource information in the format like http://www.qq.com/1.txt. Multiple values and fuzzy queries are not supported.</li><li>domains: Filter by domain name in the format like www.qq.com. Fuzzy queries are not supported.</li><li>statuses: Filter by task status. Fuzzy queries are not supported. Options:<br>processing: processing<br>success: successful<br>failed: failed<br>timeout: timed out<br>invalid: invalid, that is, the response status code of the origin server is not 2xx. Please check the origin server service.<br>canceled: Canceled 
     * @return Filters Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>job-id: Filter by task ID in the format like 1379afjk91u32h. Multiple values and fuzzy queries are not supported.</li><li>target: Filter by target resource information in the format like http://www.qq.com/1.txt. Multiple values and fuzzy queries are not supported.</li><li>domains: Filter by domain name in the format like www.qq.com. Fuzzy queries are not supported.</li><li>statuses: Filter by task status. Fuzzy queries are not supported. Options:<br>processing: processing<br>success: successful<br>failed: failed<br>timeout: timed out<br>invalid: invalid, that is, the response status code of the origin server is not 2xx. Please check the origin server service.<br>canceled: Canceled
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>job-id: Filter by task ID in the format like 1379afjk91u32h. Multiple values and fuzzy queries are not supported.</li><li>target: Filter by target resource information in the format like http://www.qq.com/1.txt. Multiple values and fuzzy queries are not supported.</li><li>domains: Filter by domain name in the format like www.qq.com. Fuzzy queries are not supported.</li><li>statuses: Filter by task status. Fuzzy queries are not supported. Options:<br>processing: processing<br>success: successful<br>failed: failed<br>timeout: timed out<br>invalid: invalid, that is, the response status code of the origin server is not 2xx. Please check the origin server service.<br>canceled: Canceled
     * @param Filters Filter criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows: <li>job-id: Filter by task ID in the format like 1379afjk91u32h. Multiple values and fuzzy queries are not supported.</li><li>target: Filter by target resource information in the format like http://www.qq.com/1.txt. Multiple values and fuzzy queries are not supported.</li><li>domains: Filter by domain name in the format like www.qq.com. Fuzzy queries are not supported.</li><li>statuses: Filter by task status. Fuzzy queries are not supported. Options:<br>processing: processing<br>success: successful<br>failed: failed<br>timeout: timed out<br>invalid: invalid, that is, the response status code of the origin server is not 2xx. Please check the origin server service.<br>canceled: Canceled
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePrefetchTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrefetchTasksRequest(DescribePrefetchTasksRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

