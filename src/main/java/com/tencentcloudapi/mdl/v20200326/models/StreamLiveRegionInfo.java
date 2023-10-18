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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamLiveRegionInfo extends AbstractModel {

    /**
    * List of StreamLive regions
    */
    @SerializedName("Regions")
    @Expose
    private RegionInfo [] Regions;

    /**
     * Get List of StreamLive regions 
     * @return Regions List of StreamLive regions
     */
    public RegionInfo [] getRegions() {
        return this.Regions;
    }

    /**
     * Set List of StreamLive regions
     * @param Regions List of StreamLive regions
     */
    public void setRegions(RegionInfo [] Regions) {
        this.Regions = Regions;
    }

    public StreamLiveRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamLiveRegionInfo(StreamLiveRegionInfo source) {
        if (source.Regions != null) {
            this.Regions = new RegionInfo[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new RegionInfo(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);

    }
}

