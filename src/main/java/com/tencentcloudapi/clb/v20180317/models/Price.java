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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * Instance price.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * Network price.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthPrice")
    @Expose
    private ItemPrice BandwidthPrice;

    /**
    * LCU price.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("LcuPrice")
    @Expose
    private ItemPrice LcuPrice;

    /**
     * Get Instance price.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InstancePrice Instance price.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set Instance price.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InstancePrice Instance price.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get Network price.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return BandwidthPrice Network price.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public ItemPrice getBandwidthPrice() {
        return this.BandwidthPrice;
    }

    /**
     * Set Network price.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param BandwidthPrice Network price.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setBandwidthPrice(ItemPrice BandwidthPrice) {
        this.BandwidthPrice = BandwidthPrice;
    }

    /**
     * Get LCU price.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return LcuPrice LCU price.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public ItemPrice getLcuPrice() {
        return this.LcuPrice;
    }

    /**
     * Set LCU price.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param LcuPrice LCU price.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setLcuPrice(ItemPrice LcuPrice) {
        this.LcuPrice = LcuPrice;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new ItemPrice(source.InstancePrice);
        }
        if (source.BandwidthPrice != null) {
            this.BandwidthPrice = new ItemPrice(source.BandwidthPrice);
        }
        if (source.LcuPrice != null) {
            this.LcuPrice = new ItemPrice(source.LcuPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "BandwidthPrice.", this.BandwidthPrice);
        this.setParamObj(map, prefix + "LcuPrice.", this.LcuPrice);

    }
}

