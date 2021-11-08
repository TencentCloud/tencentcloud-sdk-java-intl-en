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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCreditHistoryResponse extends AbstractModel{

    /**
    * Total number of records
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * List of record details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("History")
    @Expose
    private QueryUinCreditHistoryData [] History;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of records
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Total Total number of records
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of records
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Total Total number of records
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get List of record details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return History List of record details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public QueryUinCreditHistoryData [] getHistory() {
        return this.History;
    }

    /**
     * Set List of record details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param History List of record details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHistory(QueryUinCreditHistoryData [] History) {
        this.History = History;
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

    public QueryCreditHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCreditHistoryResponse(QueryCreditHistoryResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.History != null) {
            this.History = new QueryUinCreditHistoryData[source.History.length];
            for (int i = 0; i < source.History.length; i++) {
                this.History[i] = new QueryUinCreditHistoryData(source.History[i]);
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
        this.setParamArrayObj(map, prefix + "History.", this.History);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

