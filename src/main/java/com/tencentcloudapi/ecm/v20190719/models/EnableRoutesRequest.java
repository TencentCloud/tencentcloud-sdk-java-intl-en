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

public class EnableRoutesRequest extends AbstractModel {

    /**
    * Unique route table ID.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Routing policy ID.
    */
    @SerializedName("RouteIds")
    @Expose
    private Long [] RouteIds;

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
     * Get Routing policy ID. 
     * @return RouteIds Routing policy ID.
     */
    public Long [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * Set Routing policy ID.
     * @param RouteIds Routing policy ID.
     */
    public void setRouteIds(Long [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    public EnableRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableRoutesRequest(EnableRoutesRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteIds != null) {
            this.RouteIds = new Long[source.RouteIds.length];
            for (int i = 0; i < source.RouteIds.length; i++) {
                this.RouteIds[i] = new Long(source.RouteIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArraySimple(map, prefix + "RouteIds.", this.RouteIds);

    }
}

