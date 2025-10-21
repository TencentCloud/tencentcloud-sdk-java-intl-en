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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoutePolicyAssociation extends AbstractModel {

    /**
    * Unique route table ID.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Specifies the unique ID of the route reception policy.
    */
    @SerializedName("RoutePolicyId")
    @Expose
    private String RoutePolicyId;

    /**
    * Priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get Unique route table ID. 
     * @return RouteTableId Unique route table ID.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set Unique route table ID.
     * @param RouteTableId Unique route table ID.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get Specifies the unique ID of the route reception policy. 
     * @return RoutePolicyId Specifies the unique ID of the route reception policy.
     */
    public String getRoutePolicyId() {
        return this.RoutePolicyId;
    }

    /**
     * Set Specifies the unique ID of the route reception policy.
     * @param RoutePolicyId Specifies the unique ID of the route reception policy.
     */
    public void setRoutePolicyId(String RoutePolicyId) {
        this.RoutePolicyId = RoutePolicyId;
    }

    /**
     * Get Priority. 
     * @return Priority Priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority.
     * @param Priority Priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public RoutePolicyAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutePolicyAssociation(RoutePolicyAssociation source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RoutePolicyId != null) {
            this.RoutePolicyId = new String(source.RoutePolicyId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RoutePolicyId", this.RoutePolicyId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

