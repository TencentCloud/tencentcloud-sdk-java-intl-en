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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublishersResponse extends AbstractModel{

    /**
    * Total number of query results.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of producer information.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Publishers")
    @Expose
    private Publisher [] Publishers;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of query results. 
     * @return TotalCount Total number of query results.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of query results.
     * @param TotalCount Total number of query results.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of producer information.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Publishers List of producer information.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Publisher [] getPublishers() {
        return this.Publishers;
    }

    /**
     * Set List of producer information.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Publishers List of producer information.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPublishers(Publisher [] Publishers) {
        this.Publishers = Publishers;
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

    public DescribePublishersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublishersResponse(DescribePublishersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Publishers != null) {
            this.Publishers = new Publisher[source.Publishers.length];
            for (int i = 0; i < source.Publishers.length; i++) {
                this.Publishers[i] = new Publisher(source.Publishers[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Publishers.", this.Publishers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

