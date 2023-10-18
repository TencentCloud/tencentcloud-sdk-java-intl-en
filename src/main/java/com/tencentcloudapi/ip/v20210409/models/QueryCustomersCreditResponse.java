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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCustomersCreditResponse extends AbstractModel {

    /**
    * Queries the list of customers
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private QueryCustomersCreditData [] Data;

    /**
    * Number of customers
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Queries the list of customers
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Data Queries the list of customers
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public QueryCustomersCreditData [] getData() {
        return this.Data;
    }

    /**
     * Set Queries the list of customers
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Data Queries the list of customers
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setData(QueryCustomersCreditData [] Data) {
        this.Data = Data;
    }

    /**
     * Get Number of customers 
     * @return Total Number of customers
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of customers
     * @param Total Number of customers
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public QueryCustomersCreditResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCustomersCreditResponse(QueryCustomersCreditResponse source) {
        if (source.Data != null) {
            this.Data = new QueryCustomersCreditData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new QueryCustomersCreditData(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

