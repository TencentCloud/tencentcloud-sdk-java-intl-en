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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncJobsRequest extends AbstractModel {

    /**
    * Number of entries displayed each time during a batch query. Value range: 1–100. Default value: 20.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Whether there is a token for the next query. Value: not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * List of RequestIds returned for async requests
    */
    @SerializedName("RequestIds")
    @Expose
    private String [] RequestIds;

    /**
     * Get Number of entries displayed each time during a batch query. Value range: 1–100. Default value: 20. 
     * @return MaxResults Number of entries displayed each time during a batch query. Value range: 1–100. Default value: 20.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Number of entries displayed each time during a batch query. Value range: 1–100. Default value: 20.
     * @param MaxResults Number of entries displayed each time during a batch query. Value range: 1–100. Default value: 20.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Whether there is a token for the next query. Value: not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call. 
     * @return NextToken Whether there is a token for the next query. Value: not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Whether there is a token for the next query. Value: not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
     * @param NextToken Whether there is a token for the next query. Value: not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get List of RequestIds returned for async requests 
     * @return RequestIds List of RequestIds returned for async requests
     */
    public String [] getRequestIds() {
        return this.RequestIds;
    }

    /**
     * Set List of RequestIds returned for async requests
     * @param RequestIds List of RequestIds returned for async requests
     */
    public void setRequestIds(String [] RequestIds) {
        this.RequestIds = RequestIds;
    }

    public DescribeAsyncJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncJobsRequest(DescribeAsyncJobsRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RequestIds != null) {
            this.RequestIds = new String[source.RequestIds.length];
            for (int i = 0; i < source.RequestIds.length; i++) {
                this.RequestIds[i] = new String(source.RequestIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArraySimple(map, prefix + "RequestIds.", this.RequestIds);

    }
}

