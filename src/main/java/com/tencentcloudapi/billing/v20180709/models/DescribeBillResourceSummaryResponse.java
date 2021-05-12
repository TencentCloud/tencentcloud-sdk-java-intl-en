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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillResourceSummaryResponse extends AbstractModel{

    /**
    * Resource summary list
    */
    @SerializedName("ResourceSummarySet")
    @Expose
    private BillResourceSummary [] ResourceSummarySet;

    /**
    * Total number of resource summary lists
Note: This field may return null, indicating that no valid value was found.
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
     * Get Resource summary list 
     * @return ResourceSummarySet Resource summary list
     */
    public BillResourceSummary [] getResourceSummarySet() {
        return this.ResourceSummarySet;
    }

    /**
     * Set Resource summary list
     * @param ResourceSummarySet Resource summary list
     */
    public void setResourceSummarySet(BillResourceSummary [] ResourceSummarySet) {
        this.ResourceSummarySet = ResourceSummarySet;
    }

    /**
     * Get Total number of resource summary lists
Note: This field may return null, indicating that no valid value was found. 
     * @return Total Total number of resource summary lists
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of resource summary lists
Note: This field may return null, indicating that no valid value was found.
     * @param Total Total number of resource summary lists
Note: This field may return null, indicating that no valid value was found.
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

    public DescribeBillResourceSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillResourceSummaryResponse(DescribeBillResourceSummaryResponse source) {
        if (source.ResourceSummarySet != null) {
            this.ResourceSummarySet = new BillResourceSummary[source.ResourceSummarySet.length];
            for (int i = 0; i < source.ResourceSummarySet.length; i++) {
                this.ResourceSummarySet[i] = new BillResourceSummary(source.ResourceSummarySet[i]);
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
        this.setParamArrayObj(map, prefix + "ResourceSummarySet.", this.ResourceSummarySet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

