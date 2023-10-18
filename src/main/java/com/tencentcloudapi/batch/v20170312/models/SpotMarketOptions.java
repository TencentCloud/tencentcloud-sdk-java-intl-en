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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpotMarketOptions extends AbstractModel {

    /**
    * Bidding price
    */
    @SerializedName("MaxPrice")
    @Expose
    private String MaxPrice;

    /**
    * Bidding request type. Currently only "one-time" is supported.
    */
    @SerializedName("SpotInstanceType")
    @Expose
    private String SpotInstanceType;

    /**
     * Get Bidding price 
     * @return MaxPrice Bidding price
     */
    public String getMaxPrice() {
        return this.MaxPrice;
    }

    /**
     * Set Bidding price
     * @param MaxPrice Bidding price
     */
    public void setMaxPrice(String MaxPrice) {
        this.MaxPrice = MaxPrice;
    }

    /**
     * Get Bidding request type. Currently only "one-time" is supported. 
     * @return SpotInstanceType Bidding request type. Currently only "one-time" is supported.
     */
    public String getSpotInstanceType() {
        return this.SpotInstanceType;
    }

    /**
     * Set Bidding request type. Currently only "one-time" is supported.
     * @param SpotInstanceType Bidding request type. Currently only "one-time" is supported.
     */
    public void setSpotInstanceType(String SpotInstanceType) {
        this.SpotInstanceType = SpotInstanceType;
    }

    public SpotMarketOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpotMarketOptions(SpotMarketOptions source) {
        if (source.MaxPrice != null) {
            this.MaxPrice = new String(source.MaxPrice);
        }
        if (source.SpotInstanceType != null) {
            this.SpotInstanceType = new String(source.SpotInstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxPrice", this.MaxPrice);
        this.setParamSimple(map, prefix + "SpotInstanceType", this.SpotInstanceType);

    }
}

