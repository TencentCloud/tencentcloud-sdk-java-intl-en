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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteConflictsResponse extends AbstractModel {

    /**
    * List of routing policy conflicts.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteConflictSet")
    @Expose
    private RouteConflict [] RouteConflictSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of routing policy conflicts.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RouteConflictSet List of routing policy conflicts.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RouteConflict [] getRouteConflictSet() {
        return this.RouteConflictSet;
    }

    /**
     * Set List of routing policy conflicts.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RouteConflictSet List of routing policy conflicts.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteConflictSet(RouteConflict [] RouteConflictSet) {
        this.RouteConflictSet = RouteConflictSet;
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

    public DescribeRouteConflictsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteConflictsResponse(DescribeRouteConflictsResponse source) {
        if (source.RouteConflictSet != null) {
            this.RouteConflictSet = new RouteConflict[source.RouteConflictSet.length];
            for (int i = 0; i < source.RouteConflictSet.length; i++) {
                this.RouteConflictSet[i] = new RouteConflict(source.RouteConflictSet[i]);
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
        this.setParamArrayObj(map, prefix + "RouteConflictSet.", this.RouteConflictSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

