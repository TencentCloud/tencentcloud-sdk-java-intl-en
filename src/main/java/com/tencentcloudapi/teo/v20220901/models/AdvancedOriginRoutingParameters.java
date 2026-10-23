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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedOriginRoutingParameters extends AbstractModel {

    /**
    * <p>Origin optimization direction. Valid values:</p><li>MainlandChinaAndGlobalAdaptive: Self adaptive. The domain name must enable "smart acceleration" simultaneously to take effect. EdgeOne will automatically match the optimal origin-pull optimization direction based on the actual geographic location of the client and origin server, without the need to manually specify. For example, if www.example.com enables "advanced origin optimization" but "smart acceleration" is turned off or only partial match conditions are enabled, "advanced origin optimization" will not be effective.</li>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get <p>Origin optimization direction. Valid values:</p><li>MainlandChinaAndGlobalAdaptive: Self adaptive. The domain name must enable "smart acceleration" simultaneously to take effect. EdgeOne will automatically match the optimal origin-pull optimization direction based on the actual geographic location of the client and origin server, without the need to manually specify. For example, if www.example.com enables "advanced origin optimization" but "smart acceleration" is turned off or only partial match conditions are enabled, "advanced origin optimization" will not be effective.</li> 
     * @return Direction <p>Origin optimization direction. Valid values:</p><li>MainlandChinaAndGlobalAdaptive: Self adaptive. The domain name must enable "smart acceleration" simultaneously to take effect. EdgeOne will automatically match the optimal origin-pull optimization direction based on the actual geographic location of the client and origin server, without the need to manually specify. For example, if www.example.com enables "advanced origin optimization" but "smart acceleration" is turned off or only partial match conditions are enabled, "advanced origin optimization" will not be effective.</li>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Origin optimization direction. Valid values:</p><li>MainlandChinaAndGlobalAdaptive: Self adaptive. The domain name must enable "smart acceleration" simultaneously to take effect. EdgeOne will automatically match the optimal origin-pull optimization direction based on the actual geographic location of the client and origin server, without the need to manually specify. For example, if www.example.com enables "advanced origin optimization" but "smart acceleration" is turned off or only partial match conditions are enabled, "advanced origin optimization" will not be effective.</li>
     * @param Direction <p>Origin optimization direction. Valid values:</p><li>MainlandChinaAndGlobalAdaptive: Self adaptive. The domain name must enable "smart acceleration" simultaneously to take effect. EdgeOne will automatically match the optimal origin-pull optimization direction based on the actual geographic location of the client and origin server, without the need to manually specify. For example, if www.example.com enables "advanced origin optimization" but "smart acceleration" is turned off or only partial match conditions are enabled, "advanced origin optimization" will not be effective.</li>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public AdvancedOriginRoutingParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedOriginRoutingParameters(AdvancedOriginRoutingParameters source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

