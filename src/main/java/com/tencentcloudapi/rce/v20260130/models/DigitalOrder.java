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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DigitalOrder extends AbstractModel {

    /**
    * <p>The name of the asset</p>
    */
    @SerializedName("DigitalAsset")
    @Expose
    private String DigitalAsset;

    /**
    * <p>The type of the asset</p><p>Enumeration value:</p><ul><li>coin</li><li>commodity</li><li>crypto</li><li>fiat</li><li>token</li><li>stock</li><li>bond</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>The type of trade being made</p><p>Enumeration value:</p><ul><li>limit: Limit order</li><li>market: Market order</li><li>stop_limit: Stop-limit order</li><li>stop_loss: Stop-loss order</li><li>take_profit: Take-profit order</li><li>take_profit_limit: Take-profit limit order</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>The quantity of the digital asset</p>
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
     * Get <p>The name of the asset</p> 
     * @return DigitalAsset <p>The name of the asset</p>
     */
    public String getDigitalAsset() {
        return this.DigitalAsset;
    }

    /**
     * Set <p>The name of the asset</p>
     * @param DigitalAsset <p>The name of the asset</p>
     */
    public void setDigitalAsset(String DigitalAsset) {
        this.DigitalAsset = DigitalAsset;
    }

    /**
     * Get <p>The type of the asset</p><p>Enumeration value:</p><ul><li>coin</li><li>commodity</li><li>crypto</li><li>fiat</li><li>token</li><li>stock</li><li>bond</li></ul> 
     * @return AssetType <p>The type of the asset</p><p>Enumeration value:</p><ul><li>coin</li><li>commodity</li><li>crypto</li><li>fiat</li><li>token</li><li>stock</li><li>bond</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>The type of the asset</p><p>Enumeration value:</p><ul><li>coin</li><li>commodity</li><li>crypto</li><li>fiat</li><li>token</li><li>stock</li><li>bond</li></ul>
     * @param AssetType <p>The type of the asset</p><p>Enumeration value:</p><ul><li>coin</li><li>commodity</li><li>crypto</li><li>fiat</li><li>token</li><li>stock</li><li>bond</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>The type of trade being made</p><p>Enumeration value:</p><ul><li>limit: Limit order</li><li>market: Market order</li><li>stop_limit: Stop-limit order</li><li>stop_loss: Stop-loss order</li><li>take_profit: Take-profit order</li><li>take_profit_limit: Take-profit limit order</li></ul> 
     * @return OrderType <p>The type of trade being made</p><p>Enumeration value:</p><ul><li>limit: Limit order</li><li>market: Market order</li><li>stop_limit: Stop-limit order</li><li>stop_loss: Stop-loss order</li><li>take_profit: Take-profit order</li><li>take_profit_limit: Take-profit limit order</li></ul>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>The type of trade being made</p><p>Enumeration value:</p><ul><li>limit: Limit order</li><li>market: Market order</li><li>stop_limit: Stop-limit order</li><li>stop_loss: Stop-loss order</li><li>take_profit: Take-profit order</li><li>take_profit_limit: Take-profit limit order</li></ul>
     * @param OrderType <p>The type of trade being made</p><p>Enumeration value:</p><ul><li>limit: Limit order</li><li>market: Market order</li><li>stop_limit: Stop-limit order</li><li>stop_loss: Stop-loss order</li><li>take_profit: Take-profit order</li><li>take_profit_limit: Take-profit limit order</li></ul>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>The quantity of the digital asset</p> 
     * @return Volume <p>The quantity of the digital asset</p>
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>The quantity of the digital asset</p>
     * @param Volume <p>The quantity of the digital asset</p>
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    public DigitalOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DigitalOrder(DigitalOrder source) {
        if (source.DigitalAsset != null) {
            this.DigitalAsset = new String(source.DigitalAsset);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DigitalAsset", this.DigitalAsset);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

