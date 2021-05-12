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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteResponse extends AbstractModel{

    /**
    * Route information list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Routers")
    @Expose
    private Route [] Routers;

    /**
     * Get Route information list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Routers Route information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Route [] getRouters() {
        return this.Routers;
    }

    /**
     * Set Route information list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Routers Route information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRouters(Route [] Routers) {
        this.Routers = Routers;
    }

    public RouteResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteResponse(RouteResponse source) {
        if (source.Routers != null) {
            this.Routers = new Route[source.Routers.length];
            for (int i = 0; i < source.Routers.length; i++) {
                this.Routers[i] = new Route(source.Routers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Routers.", this.Routers);

    }
}

