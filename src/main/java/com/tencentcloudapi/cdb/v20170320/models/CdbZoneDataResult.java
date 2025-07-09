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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbZoneDataResult extends AbstractModel {

    /**
    * List of purchasable specifications
    */
    @SerializedName("Configs")
    @Expose
    private CdbSellConfig [] Configs;

    /**
    * List of AZs in purchasable regions
    */
    @SerializedName("Regions")
    @Expose
    private CdbRegionSellConf [] Regions;

    /**
     * Get List of purchasable specifications 
     * @return Configs List of purchasable specifications
     */
    public CdbSellConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set List of purchasable specifications
     * @param Configs List of purchasable specifications
     */
    public void setConfigs(CdbSellConfig [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get List of AZs in purchasable regions 
     * @return Regions List of AZs in purchasable regions
     */
    public CdbRegionSellConf [] getRegions() {
        return this.Regions;
    }

    /**
     * Set List of AZs in purchasable regions
     * @param Regions List of AZs in purchasable regions
     */
    public void setRegions(CdbRegionSellConf [] Regions) {
        this.Regions = Regions;
    }

    public CdbZoneDataResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbZoneDataResult(CdbZoneDataResult source) {
        if (source.Configs != null) {
            this.Configs = new CdbSellConfig[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new CdbSellConfig(source.Configs[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new CdbRegionSellConf[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new CdbRegionSellConf(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);

    }
}

