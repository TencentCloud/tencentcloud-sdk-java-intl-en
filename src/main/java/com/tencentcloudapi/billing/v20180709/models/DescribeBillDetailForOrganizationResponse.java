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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillDetailForOrganizationResponse extends AbstractModel {

    /**
    * Details list.
    */
    @SerializedName("DetailSet")
    @Expose
    private DistributionBillDetail [] DetailSet;

    /**
    * Total number of records, which is cached every 24 hours and may be less than the actual total number of records.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Context information of the current request, which can be used in the parameters of the next request to speed up the query.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Details list. 
     * @return DetailSet Details list.
     */
    public DistributionBillDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set Details list.
     * @param DetailSet Details list.
     */
    public void setDetailSet(DistributionBillDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    /**
     * Get Total number of records, which is cached every 24 hours and may be less than the actual total number of records.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total Total number of records, which is cached every 24 hours and may be less than the actual total number of records.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of records, which is cached every 24 hours and may be less than the actual total number of records.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total Total number of records, which is cached every 24 hours and may be less than the actual total number of records.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Context information of the current request, which can be used in the parameters of the next request to speed up the query.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Context Context information of the current request, which can be used in the parameters of the next request to speed up the query.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context information of the current request, which can be used in the parameters of the next request to speed up the query.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Context Context information of the current request, which can be used in the parameters of the next request to speed up the query.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBillDetailForOrganizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDetailForOrganizationResponse(DescribeBillDetailForOrganizationResponse source) {
        if (source.DetailSet != null) {
            this.DetailSet = new DistributionBillDetail[source.DetailSet.length];
            for (int i = 0; i < source.DetailSet.length; i++) {
                this.DetailSet[i] = new DistributionBillDetail(source.DetailSet[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetailSet.", this.DetailSet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

