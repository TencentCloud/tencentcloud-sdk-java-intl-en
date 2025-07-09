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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvironmentsResponse extends AbstractModel {

    /**
    * The number of namespaces.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Array of namespace sets.
    */
    @SerializedName("EnvironmentSet")
    @Expose
    private Environment [] EnvironmentSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of namespaces. 
     * @return TotalCount The number of namespaces.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of namespaces.
     * @param TotalCount The number of namespaces.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Array of namespace sets. 
     * @return EnvironmentSet Array of namespace sets.
     */
    public Environment [] getEnvironmentSet() {
        return this.EnvironmentSet;
    }

    /**
     * Set Array of namespace sets.
     * @param EnvironmentSet Array of namespace sets.
     */
    public void setEnvironmentSet(Environment [] EnvironmentSet) {
        this.EnvironmentSet = EnvironmentSet;
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

    public DescribeEnvironmentsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvironmentsResponse(DescribeEnvironmentsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EnvironmentSet != null) {
            this.EnvironmentSet = new Environment[source.EnvironmentSet.length];
            for (int i = 0; i < source.EnvironmentSet.length; i++) {
                this.EnvironmentSet[i] = new Environment(source.EnvironmentSet[i]);
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
        this.setParamArrayObj(map, prefix + "EnvironmentSet.", this.EnvironmentSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

