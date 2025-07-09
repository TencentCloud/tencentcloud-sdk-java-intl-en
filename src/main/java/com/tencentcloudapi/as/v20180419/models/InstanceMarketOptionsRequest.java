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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceMarketOptionsRequest extends AbstractModel {

    /**
    * Bidding-related options
    */
    @SerializedName("SpotOptions")
    @Expose
    private SpotMarketOptions SpotOptions;

    /**
    * Market option type. The value can only be spot currently.
    */
    @SerializedName("MarketType")
    @Expose
    private String MarketType;

    /**
     * Get Bidding-related options 
     * @return SpotOptions Bidding-related options
     */
    public SpotMarketOptions getSpotOptions() {
        return this.SpotOptions;
    }

    /**
     * Set Bidding-related options
     * @param SpotOptions Bidding-related options
     */
    public void setSpotOptions(SpotMarketOptions SpotOptions) {
        this.SpotOptions = SpotOptions;
    }

    /**
     * Get Market option type. The value can only be spot currently. 
     * @return MarketType Market option type. The value can only be spot currently.
     */
    public String getMarketType() {
        return this.MarketType;
    }

    /**
     * Set Market option type. The value can only be spot currently.
     * @param MarketType Market option type. The value can only be spot currently.
     */
    public void setMarketType(String MarketType) {
        this.MarketType = MarketType;
    }

    public InstanceMarketOptionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceMarketOptionsRequest(InstanceMarketOptionsRequest source) {
        if (source.SpotOptions != null) {
            this.SpotOptions = new SpotMarketOptions(source.SpotOptions);
        }
        if (source.MarketType != null) {
            this.MarketType = new String(source.MarketType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SpotOptions.", this.SpotOptions);
        this.setParamSimple(map, prefix + "MarketType", this.MarketType);

    }
}

