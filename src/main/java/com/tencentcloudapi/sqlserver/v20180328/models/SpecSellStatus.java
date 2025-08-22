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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecSellStatus extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * 
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
    * 
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 
    */
    @SerializedName("MultiZonesStatus")
    @Expose
    private String MultiZonesStatus;

    /**
    * 
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * 
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 
    */
    @SerializedName("ZoneStatusSet")
    @Expose
    private ZoneStatus [] ZoneStatusSet;

    /**
    * 
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get  
     * @return Id 
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 
     * @param Id 
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get  
     * @return SpecId 
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 
     * @param SpecId 
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get  
     * @return PayModeStatus 
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * Set 
     * @param PayModeStatus 
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * Get  
     * @return InstanceType 
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 
     * @param InstanceType 
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get  
     * @return MultiZonesStatus 
     */
    public String getMultiZonesStatus() {
        return this.MultiZonesStatus;
    }

    /**
     * Set 
     * @param MultiZonesStatus 
     */
    public void setMultiZonesStatus(String MultiZonesStatus) {
        this.MultiZonesStatus = MultiZonesStatus;
    }

    /**
     * Get  
     * @return Architecture 
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 
     * @param Architecture 
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get  
     * @return Style 
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 
     * @param Style 
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get  
     * @return Version 
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 
     * @param Version 
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get  
     * @return ZoneStatusSet 
     */
    public ZoneStatus [] getZoneStatusSet() {
        return this.ZoneStatusSet;
    }

    /**
     * Set 
     * @param ZoneStatusSet 
     */
    public void setZoneStatusSet(ZoneStatus [] ZoneStatusSet) {
        this.ZoneStatusSet = ZoneStatusSet;
    }

    /**
     * Get  
     * @return Price 
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set 
     * @param Price 
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get  
     * @return Status 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SpecSellStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecSellStatus(SpecSellStatus source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SpecId != null) {
            this.SpecId = new Long(source.SpecId);
        }
        if (source.PayModeStatus != null) {
            this.PayModeStatus = new String(source.PayModeStatus);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MultiZonesStatus != null) {
            this.MultiZonesStatus = new String(source.MultiZonesStatus);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ZoneStatusSet != null) {
            this.ZoneStatusSet = new ZoneStatus[source.ZoneStatusSet.length];
            for (int i = 0; i < source.ZoneStatusSet.length; i++) {
                this.ZoneStatusSet[i] = new ZoneStatus(source.ZoneStatusSet[i]);
            }
        }
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "PayModeStatus", this.PayModeStatus);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MultiZonesStatus", this.MultiZonesStatus);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "ZoneStatusSet.", this.ZoneStatusSet);
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

