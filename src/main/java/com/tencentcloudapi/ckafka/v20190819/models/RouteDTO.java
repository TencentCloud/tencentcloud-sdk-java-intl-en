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

public class RouteDTO extends AbstractModel{

    /**
    * RouteId11 Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
     * Get RouteId11 Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteId RouteId11 Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set RouteId11 Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteId RouteId11 Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    public RouteDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteDTO(RouteDTO source) {
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);

    }
}
