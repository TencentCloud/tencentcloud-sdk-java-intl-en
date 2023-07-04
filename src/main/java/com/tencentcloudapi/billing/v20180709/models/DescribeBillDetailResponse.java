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

public class DescribeBillDetailResponse extends AbstractModel{

    /**
    * Details list
    */
    @SerializedName("DetailSet")
    @Expose
    private BillDetail [] DetailSet;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Context information returned by this request. The value can be passed in as the value of parameters in the next request to accelerate queries. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Details list 
     * @return DetailSet Details list
     */
    public BillDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set Details list
     * @param DetailSet Details list
     */
    public void setDetailSet(BillDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Context information returned by this request. The value can be passed in as the value of parameters in the next request to accelerate queries. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Context Context information returned by this request. The value can be passed in as the value of parameters in the next request to accelerate queries. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context information returned by this request. The value can be passed in as the value of parameters in the next request to accelerate queries. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Context Context information returned by this request. The value can be passed in as the value of parameters in the next request to accelerate queries. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContext(String Context) {
        this.Context = Context;
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

    public DescribeBillDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDetailResponse(DescribeBillDetailResponse source) {
        if (source.DetailSet != null) {
            this.DetailSet = new BillDetail[source.DetailSet.length];
            for (int i = 0; i < source.DetailSet.length; i++) {
                this.DetailSet[i] = new BillDetail(source.DetailSet[i]);
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

