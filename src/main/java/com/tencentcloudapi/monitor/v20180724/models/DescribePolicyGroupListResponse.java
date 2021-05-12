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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupListResponse extends AbstractModel{

    /**
    * Policy group list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GroupList")
    @Expose
    private DescribePolicyGroupListGroup [] GroupList;

    /**
    * Total number of policy groups.
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
     * Get Policy group list.
Note: This field may return null, indicating that no valid value was found. 
     * @return GroupList Policy group list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyGroupListGroup [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set Policy group list.
Note: This field may return null, indicating that no valid value was found.
     * @param GroupList Policy group list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGroupList(DescribePolicyGroupListGroup [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Get Total number of policy groups. 
     * @return Total Total number of policy groups.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of policy groups.
     * @param Total Total number of policy groups.
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

    public DescribePolicyGroupListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupListResponse(DescribePolicyGroupListResponse source) {
        if (source.GroupList != null) {
            this.GroupList = new DescribePolicyGroupListGroup[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new DescribePolicyGroupListGroup(source.GroupList[i]);
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
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

