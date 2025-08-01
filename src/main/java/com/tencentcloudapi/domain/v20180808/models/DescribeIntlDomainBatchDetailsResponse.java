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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntlDomainBatchDetailsResponse extends AbstractModel {

    /**
    * The total count.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The list of log details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainBatchDetailSet")
    @Expose
    private BatchDomainBuyDetails [] DomainBatchDetailSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total count. 
     * @return TotalCount The total count.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total count.
     * @param TotalCount The total count.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The list of log details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainBatchDetailSet The list of log details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BatchDomainBuyDetails [] getDomainBatchDetailSet() {
        return this.DomainBatchDetailSet;
    }

    /**
     * Set The list of log details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainBatchDetailSet The list of log details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainBatchDetailSet(BatchDomainBuyDetails [] DomainBatchDetailSet) {
        this.DomainBatchDetailSet = DomainBatchDetailSet;
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

    public DescribeIntlDomainBatchDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntlDomainBatchDetailsResponse(DescribeIntlDomainBatchDetailsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DomainBatchDetailSet != null) {
            this.DomainBatchDetailSet = new BatchDomainBuyDetails[source.DomainBatchDetailSet.length];
            for (int i = 0; i < source.DomainBatchDetailSet.length; i++) {
                this.DomainBatchDetailSet[i] = new BatchDomainBuyDetails(source.DomainBatchDetailSet[i]);
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
        this.setParamArrayObj(map, prefix + "DomainBatchDetailSet.", this.DomainBatchDetailSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

