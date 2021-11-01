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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncSearchResultResponse extends AbstractModel{

    /**
    * `Context` for loading subsequent content
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Whether all log query results are returned
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * Log content
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get `Context` for loading subsequent content 
     * @return Context `Context` for loading subsequent content
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set `Context` for loading subsequent content
     * @param Context `Context` for loading subsequent content
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Whether all log query results are returned 
     * @return ListOver Whether all log query results are returned
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set Whether all log query results are returned
     * @param ListOver Whether all log query results are returned
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get Log content 
     * @return Results Log content
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set Log content
     * @param Results Log content
     */
    public void setResults(LogInfo [] Results) {
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

    public DescribeAsyncSearchResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncSearchResultResponse(DescribeAsyncSearchResultResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Results != null) {
            this.Results = new LogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogInfo(source.Results[i]);
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
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

