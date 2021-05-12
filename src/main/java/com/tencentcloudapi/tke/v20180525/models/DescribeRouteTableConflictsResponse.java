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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteTableConflictsResponse extends AbstractModel{

    /**
    * Whether there is a conflict in the route table.
    */
    @SerializedName("HasConflict")
    @Expose
    private Boolean HasConflict;

    /**
    * Route table conflict list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteTableConflictSet")
    @Expose
    private RouteTableConflict [] RouteTableConflictSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether there is a conflict in the route table. 
     * @return HasConflict Whether there is a conflict in the route table.
     */
    public Boolean getHasConflict() {
        return this.HasConflict;
    }

    /**
     * Set Whether there is a conflict in the route table.
     * @param HasConflict Whether there is a conflict in the route table.
     */
    public void setHasConflict(Boolean HasConflict) {
        this.HasConflict = HasConflict;
    }

    /**
     * Get Route table conflict list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteTableConflictSet Route table conflict list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RouteTableConflict [] getRouteTableConflictSet() {
        return this.RouteTableConflictSet;
    }

    /**
     * Set Route table conflict list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteTableConflictSet Route table conflict list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteTableConflictSet(RouteTableConflict [] RouteTableConflictSet) {
        this.RouteTableConflictSet = RouteTableConflictSet;
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

    public DescribeRouteTableConflictsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteTableConflictsResponse(DescribeRouteTableConflictsResponse source) {
        if (source.HasConflict != null) {
            this.HasConflict = new Boolean(source.HasConflict);
        }
        if (source.RouteTableConflictSet != null) {
            this.RouteTableConflictSet = new RouteTableConflict[source.RouteTableConflictSet.length];
            for (int i = 0; i < source.RouteTableConflictSet.length; i++) {
                this.RouteTableConflictSet[i] = new RouteTableConflict(source.RouteTableConflictSet[i]);
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
        this.setParamSimple(map, prefix + "HasConflict", this.HasConflict);
        this.setParamArrayObj(map, prefix + "RouteTableConflictSet.", this.RouteTableConflictSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

