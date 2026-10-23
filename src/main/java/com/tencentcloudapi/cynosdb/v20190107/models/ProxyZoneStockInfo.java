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

public class ProxyZoneStockInfo extends AbstractModel {

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>CPU inventory</p><p>This field is not a judgment standard for whether there are resources for delivery. For resources, refer to CheckProxyStockInfos</p>
    */
    @SerializedName("CpuStock")
    @Expose
    private Long CpuStock;

    /**
    * <p>Memory inventory</p><p>This field is not used as a judgment standard for whether there are resources for delivery. For resources, see CheckProxyStockInfos</p>
    */
    @SerializedName("MemStock")
    @Expose
    private Long MemStock;

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>AZ.</p> 
     * @return Zone <p>AZ.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
     * @param Zone <p>AZ.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>CPU inventory</p><p>This field is not a judgment standard for whether there are resources for delivery. For resources, refer to CheckProxyStockInfos</p> 
     * @return CpuStock <p>CPU inventory</p><p>This field is not a judgment standard for whether there are resources for delivery. For resources, refer to CheckProxyStockInfos</p>
     */
    public Long getCpuStock() {
        return this.CpuStock;
    }

    /**
     * Set <p>CPU inventory</p><p>This field is not a judgment standard for whether there are resources for delivery. For resources, refer to CheckProxyStockInfos</p>
     * @param CpuStock <p>CPU inventory</p><p>This field is not a judgment standard for whether there are resources for delivery. For resources, refer to CheckProxyStockInfos</p>
     */
    public void setCpuStock(Long CpuStock) {
        this.CpuStock = CpuStock;
    }

    /**
     * Get <p>Memory inventory</p><p>This field is not used as a judgment standard for whether there are resources for delivery. For resources, see CheckProxyStockInfos</p> 
     * @return MemStock <p>Memory inventory</p><p>This field is not used as a judgment standard for whether there are resources for delivery. For resources, see CheckProxyStockInfos</p>
     */
    public Long getMemStock() {
        return this.MemStock;
    }

    /**
     * Set <p>Memory inventory</p><p>This field is not used as a judgment standard for whether there are resources for delivery. For resources, see CheckProxyStockInfos</p>
     * @param MemStock <p>Memory inventory</p><p>This field is not used as a judgment standard for whether there are resources for delivery. For resources, see CheckProxyStockInfos</p>
     */
    public void setMemStock(Long MemStock) {
        this.MemStock = MemStock;
    }

    public ProxyZoneStockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyZoneStockInfo(ProxyZoneStockInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CpuStock != null) {
            this.CpuStock = new Long(source.CpuStock);
        }
        if (source.MemStock != null) {
            this.MemStock = new Long(source.MemStock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CpuStock", this.CpuStock);
        this.setParamSimple(map, prefix + "MemStock", this.MemStock);

    }
}

