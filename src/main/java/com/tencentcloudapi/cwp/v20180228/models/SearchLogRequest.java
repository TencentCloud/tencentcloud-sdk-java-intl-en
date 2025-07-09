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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogRequest extends AbstractModel {

    /**
    * Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Statement for search and analysis, with a maximum length of 12 KB
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * Number of raw logs returned for a single query. Maximum value: 1000. The Context parameter can be used to obtain subsequent logs.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Order for returning the raw logs. Valid values: asc (ascending), desc (descending). Default value: desc.
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds 
     * @return StartTime Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
     * @param StartTime Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds 
     * @return EndTime End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
     * @param EndTime End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Statement for search and analysis, with a maximum length of 12 KB 
     * @return QueryString Statement for search and analysis, with a maximum length of 12 KB
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Statement for search and analysis, with a maximum length of 12 KB
     * @param QueryString Statement for search and analysis, with a maximum length of 12 KB
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Number of raw logs returned for a single query. Maximum value: 1000. The Context parameter can be used to obtain subsequent logs. 
     * @return Count Number of raw logs returned for a single query. Maximum value: 1000. The Context parameter can be used to obtain subsequent logs.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of raw logs returned for a single query. Maximum value: 1000. The Context parameter can be used to obtain subsequent logs.
     * @param Count Number of raw logs returned for a single query. Maximum value: 1000. The Context parameter can be used to obtain subsequent logs.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Order for returning the raw logs. Valid values: asc (ascending), desc (descending). Default value: desc. 
     * @return Sort Order for returning the raw logs. Valid values: asc (ascending), desc (descending). Default value: desc.
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Order for returning the raw logs. Valid values: asc (ascending), desc (descending). Default value: desc.
     * @param Sort Order for returning the raw logs. Valid values: asc (ascending), desc (descending). Default value: desc.
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour. 
     * @return Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
     * @param Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with a validity period of 1 hour.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public SearchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogRequest(SearchLogRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

