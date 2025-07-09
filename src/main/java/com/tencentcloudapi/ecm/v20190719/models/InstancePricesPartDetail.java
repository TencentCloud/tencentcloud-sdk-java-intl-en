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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstancePricesPartDetail extends AbstractModel {

    /**
    * CPU price information
    */
    @SerializedName("CpuPrice")
    @Expose
    private PriceDetail CpuPrice;

    /**
    * Memory price information
    */
    @SerializedName("MemPrice")
    @Expose
    private PriceDetail MemPrice;

    /**
    * Disk price information
    */
    @SerializedName("DisksPrice")
    @Expose
    private PriceDetail DisksPrice;

    /**
     * Get CPU price information 
     * @return CpuPrice CPU price information
     */
    public PriceDetail getCpuPrice() {
        return this.CpuPrice;
    }

    /**
     * Set CPU price information
     * @param CpuPrice CPU price information
     */
    public void setCpuPrice(PriceDetail CpuPrice) {
        this.CpuPrice = CpuPrice;
    }

    /**
     * Get Memory price information 
     * @return MemPrice Memory price information
     */
    public PriceDetail getMemPrice() {
        return this.MemPrice;
    }

    /**
     * Set Memory price information
     * @param MemPrice Memory price information
     */
    public void setMemPrice(PriceDetail MemPrice) {
        this.MemPrice = MemPrice;
    }

    /**
     * Get Disk price information 
     * @return DisksPrice Disk price information
     */
    public PriceDetail getDisksPrice() {
        return this.DisksPrice;
    }

    /**
     * Set Disk price information
     * @param DisksPrice Disk price information
     */
    public void setDisksPrice(PriceDetail DisksPrice) {
        this.DisksPrice = DisksPrice;
    }

    public InstancePricesPartDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePricesPartDetail(InstancePricesPartDetail source) {
        if (source.CpuPrice != null) {
            this.CpuPrice = new PriceDetail(source.CpuPrice);
        }
        if (source.MemPrice != null) {
            this.MemPrice = new PriceDetail(source.MemPrice);
        }
        if (source.DisksPrice != null) {
            this.DisksPrice = new PriceDetail(source.DisksPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CpuPrice.", this.CpuPrice);
        this.setParamObj(map, prefix + "MemPrice.", this.MemPrice);
        this.setParamObj(map, prefix + "DisksPrice.", this.DisksPrice);

    }
}

