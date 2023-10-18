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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionLogsResponse extends AbstractModel {

    /**
    * Total number of function logs
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Function log information
    */
    @SerializedName("Data")
    @Expose
    private FunctionLog [] Data;

    /**
    * This field is disused.
    */
    @SerializedName("SearchContext")
    @Expose
    private LogSearchContext SearchContext;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of function logs 
     * @return TotalCount Total number of function logs
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of function logs
     * @param TotalCount Total number of function logs
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Function log information 
     * @return Data Function log information
     */
    public FunctionLog [] getData() {
        return this.Data;
    }

    /**
     * Set Function log information
     * @param Data Function log information
     */
    public void setData(FunctionLog [] Data) {
        this.Data = Data;
    }

    /**
     * Get This field is disused. 
     * @return SearchContext This field is disused.
     */
    public LogSearchContext getSearchContext() {
        return this.SearchContext;
    }

    /**
     * Set This field is disused.
     * @param SearchContext This field is disused.
     */
    public void setSearchContext(LogSearchContext SearchContext) {
        this.SearchContext = SearchContext;
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

    public GetFunctionLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionLogsResponse(GetFunctionLogsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new FunctionLog[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new FunctionLog(source.Data[i]);
            }
        }
        if (source.SearchContext != null) {
            this.SearchContext = new LogSearchContext(source.SearchContext);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamObj(map, prefix + "SearchContext.", this.SearchContext);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

