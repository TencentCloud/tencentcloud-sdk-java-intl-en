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

public class VpngwCcnRoutes extends AbstractModel{

    /**
    * Route ID
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * Enable the route or not
ENABLE: enable the route
DISABLE: do not enable the route
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Route ID 
     * @return RouteId Route ID
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Route ID
     * @param RouteId Route ID
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get Enable the route or not
ENABLE: enable the route
DISABLE: do not enable the route 
     * @return Status Enable the route or not
ENABLE: enable the route
DISABLE: do not enable the route
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Enable the route or not
ENABLE: enable the route
DISABLE: do not enable the route
     * @param Status Enable the route or not
ENABLE: enable the route
DISABLE: do not enable the route
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public VpngwCcnRoutes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpngwCcnRoutes(VpngwCcnRoutes source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

