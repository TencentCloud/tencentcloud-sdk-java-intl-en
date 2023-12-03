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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel {

    /**
    * Total number of logs
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of entries per page.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Log searching results
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Results")
    @Expose
    private SearchLogResult [] Results;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of logs
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Total Total number of logs
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of logs
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Total Total number of logs
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of entries per page.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Limit Number of entries per page.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Limit Number of entries per page.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Page Page number
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Page Page number
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Log searching results
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Results Log searching results
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public SearchLogResult [] getResults() {
        return this.Results;
    }

    /**
     * Set Log searching results
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Results Log searching results
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setResults(SearchLogResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SearchLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResponse(SearchLogResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Results != null) {
            this.Results = new SearchLogResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new SearchLogResult(source.Results[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

