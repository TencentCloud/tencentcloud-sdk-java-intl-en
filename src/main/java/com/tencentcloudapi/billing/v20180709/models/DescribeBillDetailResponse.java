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
    * Total number of records
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
     * Get Total number of records
Note: This field may return null, indicating that no valid value was found. 
     * @return Total Total number of records
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of records
Note: This field may return null, indicating that no valid value was found.
     * @param Total Total number of records
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetailSet.", this.DetailSet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

