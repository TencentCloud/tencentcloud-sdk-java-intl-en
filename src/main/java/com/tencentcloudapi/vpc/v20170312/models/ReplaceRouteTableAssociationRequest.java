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

public class ReplaceRouteTableAssociationRequest extends AbstractModel {

    /**
    * Subnet instance ID, such as `subnet-3x5lf5q0`. This can be queried using the DescribeSubnets API.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The route table instance ID, such as `rtb-azd4dt1c`.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
     * Get Subnet instance ID, such as `subnet-3x5lf5q0`. This can be queried using the DescribeSubnets API. 
     * @return SubnetId Subnet instance ID, such as `subnet-3x5lf5q0`. This can be queried using the DescribeSubnets API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID, such as `subnet-3x5lf5q0`. This can be queried using the DescribeSubnets API.
     * @param SubnetId Subnet instance ID, such as `subnet-3x5lf5q0`. This can be queried using the DescribeSubnets API.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The route table instance ID, such as `rtb-azd4dt1c`. 
     * @return RouteTableId The route table instance ID, such as `rtb-azd4dt1c`.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set The route table instance ID, such as `rtb-azd4dt1c`.
     * @param RouteTableId The route table instance ID, such as `rtb-azd4dt1c`.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    public ReplaceRouteTableAssociationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceRouteTableAssociationRequest(ReplaceRouteTableAssociationRequest source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

