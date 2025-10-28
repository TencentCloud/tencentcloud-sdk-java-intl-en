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
    * Specifies the instance price.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstancePrice")
    @Expose
    private TradePrice InstancePrice;

    /**
    * Specifies the storage price.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StoragePrice")
    @Expose
    private TradePrice StoragePrice;

    /**
    * Specifies the product specification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GoodsSpec")
    @Expose
    private GoodsSpec GoodsSpec;

    /**
     * Get Specifies the instance price.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstancePrice Specifies the instance price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TradePrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set Specifies the instance price.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstancePrice Specifies the instance price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstancePrice(TradePrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get Specifies the storage price.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StoragePrice Specifies the storage price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TradePrice getStoragePrice() {
        return this.StoragePrice;
    }

    /**
     * Set Specifies the storage price.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StoragePrice Specifies the storage price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStoragePrice(TradePrice StoragePrice) {
        this.StoragePrice = StoragePrice;
    }

    /**
     * Get Specifies the product specification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GoodsSpec Specifies the product specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GoodsSpec getGoodsSpec() {
        return this.GoodsSpec;
    }

    /**
     * Set Specifies the product specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GoodsSpec Specifies the product specification.
Note: This field may return null, indicating that no valid values can be obtained.
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

