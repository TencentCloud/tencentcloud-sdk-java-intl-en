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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetRoutesRequest extends AbstractModel{

    /**
    * The route table instance ID, such as `rtb-azd4dt1c`.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * The route table name. The maximum length is 60 characters.
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * Routing policy.
    */
    @SerializedName("Routes")
    @Expose
    private Route [] Routes;

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

    /**
     * Get The route table name. The maximum length is 60 characters. 
     * @return RouteTableName The route table name. The maximum length is 60 characters.
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set The route table name. The maximum length is 60 characters.
     * @param RouteTableName The route table name. The maximum length is 60 characters.
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get Routing policy. 
     * @return Routes Routing policy.
     */
    public Route [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set Routing policy.
     * @param Routes Routing policy.
     */
    public void setRoutes(Route [] Routes) {
        this.Routes = Routes;
    }

    public ResetRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetRoutesRequest(ResetRoutesRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.Routes != null) {
            this.Routes = new Route[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new Route(source.Routes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

