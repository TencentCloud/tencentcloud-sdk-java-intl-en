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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodsPrice extends AbstractModel {

    /**
    * Instance price
    */
    @SerializedName("InstancePrice")
    @Expose
    private TradePrice InstancePrice;

    /**
    * Storage price
    */
    @SerializedName("StoragePrice")
    @Expose
    private TradePrice StoragePrice;

    /**
    * Product specification
    */
    @SerializedName("GoodsSpec")
    @Expose
    private GoodsSpec GoodsSpec;

    /**
     * Get Instance price 
     * @return InstancePrice Instance price
     */
    public TradePrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set Instance price
     * @param InstancePrice Instance price
     */
    public void setInstancePrice(TradePrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get Storage price 
     * @return StoragePrice Storage price
     */
    public TradePrice getStoragePrice() {
        return this.StoragePrice;
    }

    /**
     * Set Storage price
     * @param StoragePrice Storage price
     */
    public void setStoragePrice(TradePrice StoragePrice) {
        this.StoragePrice = StoragePrice;
    }

    /**
     * Get Product specification 
     * @return GoodsSpec Product specification
     */
    public GoodsSpec getGoodsSpec() {
        return this.GoodsSpec;
    }

    /**
     * Set Product specification
     * @param GoodsSpec Product specification
     */
    public void setGoodsSpec(GoodsSpec GoodsSpec) {
        this.GoodsSpec = GoodsSpec;
    }

    public GoodsPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsPrice(GoodsPrice source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new TradePrice(source.InstancePrice);
        }
        if (source.StoragePrice != null) {
            this.StoragePrice = new TradePrice(source.StoragePrice);
        }
        if (source.GoodsSpec != null) {
            this.GoodsSpec = new GoodsSpec(source.GoodsSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "StoragePrice.", this.StoragePrice);
        this.setParamObj(map, prefix + "GoodsSpec.", this.GoodsSpec);

    }
}

