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

public class NotifyRoutesRequest extends AbstractModel {

    /**
    * The unique ID of the route table
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * The unique ID of the route
    */
    @SerializedName("RouteItemIds")
    @Expose
    private String [] RouteItemIds;

    /**
     * Get The unique ID of the route table 
     * @return RouteTableId The unique ID of the route table
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set The unique ID of the route table
     * @param RouteTableId The unique ID of the route table
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get The unique ID of the route 
     * @return RouteItemIds The unique ID of the route
     */
    public String [] getRouteItemIds() {
        return this.RouteItemIds;
    }

    /**
     * Set The unique ID of the route
     * @param RouteItemIds The unique ID of the route
     */
    public void setRouteItemIds(String [] RouteItemIds) {
        this.RouteItemIds = RouteItemIds;
    }

    public NotifyRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotifyRoutesRequest(NotifyRoutesRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteItemIds != null) {
            this.RouteItemIds = new String[source.RouteItemIds.length];
            for (int i = 0; i < source.RouteItemIds.length; i++) {
                this.RouteItemIds[i] = new String(source.RouteItemIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArraySimple(map, prefix + "RouteItemIds.", this.RouteItemIds);

    }
}

