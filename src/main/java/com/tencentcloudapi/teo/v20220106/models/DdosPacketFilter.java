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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DdosPacketFilter extends AbstractModel {

    /**
    * Whether to remove all settings when empty strings are passed in. Default value: `off` (remove)
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Array of objects in feature filtering configuration
    */
    @SerializedName("PacketFilter")
    @Expose
    private DDoSFeaturesFilter [] PacketFilter;

    /**
     * Get Whether to remove all settings when empty strings are passed in. Default value: `off` (remove) 
     * @return Switch Whether to remove all settings when empty strings are passed in. Default value: `off` (remove)
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to remove all settings when empty strings are passed in. Default value: `off` (remove)
     * @param Switch Whether to remove all settings when empty strings are passed in. Default value: `off` (remove)
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Array of objects in feature filtering configuration 
     * @return PacketFilter Array of objects in feature filtering configuration
     */
    public DDoSFeaturesFilter [] getPacketFilter() {
        return this.PacketFilter;
    }

    /**
     * Set Array of objects in feature filtering configuration
     * @param PacketFilter Array of objects in feature filtering configuration
     */
    public void setPacketFilter(DDoSFeaturesFilter [] PacketFilter) {
        this.PacketFilter = PacketFilter;
    }

    public DdosPacketFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdosPacketFilter(DdosPacketFilter source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.PacketFilter != null) {
            this.PacketFilter = new DDoSFeaturesFilter[source.PacketFilter.length];
            for (int i = 0; i < source.PacketFilter.length; i++) {
                this.PacketFilter[i] = new DDoSFeaturesFilter(source.PacketFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "PacketFilter.", this.PacketFilter);

    }
}

