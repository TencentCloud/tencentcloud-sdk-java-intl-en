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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSiteRequest extends AbstractModel {

    /**
    * Site name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Country where the site is located
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Province where the site is located
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * City where the site is located
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Detailed address of the site
    */
    @SerializedName("AddressLine")
    @Expose
    private String AddressLine;

    /**
    * Site description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Note
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * You are using optical fiber type to connect the CDC device to the network Single-mode or multi-mode fibers are available.
    */
    @SerializedName("FiberType")
    @Expose
    private String FiberType;

    /**
    * Optical standard used to connect the CDC device to the network This field depends on the uplink speed, optical fiber type, and distance to upstream equipment.
    */
    @SerializedName("OpticalStandard")
    @Expose
    private String OpticalStandard;

    /**
    * Type of power connector
    */
    @SerializedName("PowerConnectors")
    @Expose
    private String PowerConnectors;

    /**
    * Whether power is supplied from above or below the rack
    */
    @SerializedName("PowerFeedDrop")
    @Expose
    private String PowerFeedDrop;

    /**
    * Maximum weight capacity (KG)
    */
    @SerializedName("MaxWeight")
    @Expose
    private Long MaxWeight;

    /**
    * Power consumption (KW)
    */
    @SerializedName("PowerDrawKva")
    @Expose
    private Long PowerDrawKva;

    /**
    * Uplink speed from the network to Tencent Cloud Region
    */
    @SerializedName("UplinkSpeedGbps")
    @Expose
    private Long UplinkSpeedGbps;

    /**
    * Number of uplinks used by each CDC device (2 devices per rack) when connected to the network
    */
    @SerializedName("UplinkCount")
    @Expose
    private Long UplinkCount;

    /**
    * Whether the following environmental conditions are met: 
1. There are no material requirements or the acceptance standard on site that will affect the delivery and installation of the CDC device. 
2. The following conditions are met for finalized rack positions: 
Temperature ranges from 41 to 104°F (5 to 40°C). 
Humidity ranges from 10°F (-12°C) to 70°F (21°C) and relative humidity ranges from 8% RH to 80% RH. 
Air flows from front to back at the rack position and there is sufficient air in CFM (cubic feet per minute). The air quantity in CFM must be 145.8 times the power consumption (in KVA) of CDC.
    */
    @SerializedName("ConditionRequirement")
    @Expose
    private Boolean ConditionRequirement;

    /**
    * Whether the following dimension conditions are met: 
Your loading dock can accommodate one rack container (H x W x D = 94" x 54" x 48"). 
You can provide a clear route from the delivery point of your rack (H x W x D = 80" x 24" x 48") to its final installation location. You should consider platforms, corridors, doors, turns, ramps, freight elevators as well as other access restrictions when measuring the depth. 
There shall be a 48" or greater front clearance and a 24" or greater rear clearance where the CDC is finally installed.
    */
    @SerializedName("DimensionRequirement")
    @Expose
    private Boolean DimensionRequirement;

    /**
    * Whether redundant upstream equipment (switch or router) is provided so that both network devices can be connected to the network.
    */
    @SerializedName("RedundantNetworking")
    @Expose
    private Boolean RedundantNetworking;

    /**
    * Postal code of the site area
    */
    @SerializedName("PostalCode")
    @Expose
    private Long PostalCode;

    /**
    * Detailed address of the site area (to be added)
    */
    @SerializedName("OptionalAddressLine")
    @Expose
    private String OptionalAddressLine;

    /**
    * Whether you need help from Tencent Cloud for rack installation?
    */
    @SerializedName("NeedHelp")
    @Expose
    private Boolean NeedHelp;

    /**
    * Whether there is power redundancy?
    */
    @SerializedName("RedundantPower")
    @Expose
    private Boolean RedundantPower;

    /**
    * Whether there is an upstream circuit breaker?
    */
    @SerializedName("BreakerRequirement")
    @Expose
    private Boolean BreakerRequirement;

    /**
     * Get Site name 
     * @return Name Site name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Site name
     * @param Name Site name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Country where the site is located 
     * @return Country Country where the site is located
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country where the site is located
     * @param Country Country where the site is located
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Province where the site is located 
     * @return Province Province where the site is located
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province where the site is located
     * @param Province Province where the site is located
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get City where the site is located 
     * @return City City where the site is located
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City where the site is located
     * @param City City where the site is located
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Detailed address of the site 
     * @return AddressLine Detailed address of the site
     */
    public String getAddressLine() {
        return this.AddressLine;
    }

    /**
     * Set Detailed address of the site
     * @param AddressLine Detailed address of the site
     */
    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    /**
     * Get Site description 
     * @return Description Site description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Site description
     * @param Description Site description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Note 
     * @return Note Note
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Note
     * @param Note Note
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get You are using optical fiber type to connect the CDC device to the network Single-mode or multi-mode fibers are available. 
     * @return FiberType You are using optical fiber type to connect the CDC device to the network Single-mode or multi-mode fibers are available.
     */
    public String getFiberType() {
        return this.FiberType;
    }

    /**
     * Set You are using optical fiber type to connect the CDC device to the network Single-mode or multi-mode fibers are available.
     * @param FiberType You are using optical fiber type to connect the CDC device to the network Single-mode or multi-mode fibers are available.
     */
    public void setFiberType(String FiberType) {
        this.FiberType = FiberType;
    }

    /**
     * Get Optical standard used to connect the CDC device to the network This field depends on the uplink speed, optical fiber type, and distance to upstream equipment. 
     * @return OpticalStandard Optical standard used to connect the CDC device to the network This field depends on the uplink speed, optical fiber type, and distance to upstream equipment.
     */
    public String getOpticalStandard() {
        return this.OpticalStandard;
    }

    /**
     * Set Optical standard used to connect the CDC device to the network This field depends on the uplink speed, optical fiber type, and distance to upstream equipment.
     * @param OpticalStandard Optical standard used to connect the CDC device to the network This field depends on the uplink speed, optical fiber type, and distance to upstream equipment.
     */
    public void setOpticalStandard(String OpticalStandard) {
        this.OpticalStandard = OpticalStandard;
    }

    /**
     * Get Type of power connector 
     * @return PowerConnectors Type of power connector
     */
    public String getPowerConnectors() {
        return this.PowerConnectors;
    }

    /**
     * Set Type of power connector
     * @param PowerConnectors Type of power connector
     */
    public void setPowerConnectors(String PowerConnectors) {
        this.PowerConnectors = PowerConnectors;
    }

    /**
     * Get Whether power is supplied from above or below the rack 
     * @return PowerFeedDrop Whether power is supplied from above or below the rack
     */
    public String getPowerFeedDrop() {
        return this.PowerFeedDrop;
    }

    /**
     * Set Whether power is supplied from above or below the rack
     * @param PowerFeedDrop Whether power is supplied from above or below the rack
     */
    public void setPowerFeedDrop(String PowerFeedDrop) {
        this.PowerFeedDrop = PowerFeedDrop;
    }

    /**
     * Get Maximum weight capacity (KG) 
     * @return MaxWeight Maximum weight capacity (KG)
     */
    public Long getMaxWeight() {
        return this.MaxWeight;
    }

    /**
     * Set Maximum weight capacity (KG)
     * @param MaxWeight Maximum weight capacity (KG)
     */
    public void setMaxWeight(Long MaxWeight) {
        this.MaxWeight = MaxWeight;
    }

    /**
     * Get Power consumption (KW) 
     * @return PowerDrawKva Power consumption (KW)
     */
    public Long getPowerDrawKva() {
        return this.PowerDrawKva;
    }

    /**
     * Set Power consumption (KW)
     * @param PowerDrawKva Power consumption (KW)
     */
    public void setPowerDrawKva(Long PowerDrawKva) {
        this.PowerDrawKva = PowerDrawKva;
    }

    /**
     * Get Uplink speed from the network to Tencent Cloud Region 
     * @return UplinkSpeedGbps Uplink speed from the network to Tencent Cloud Region
     */
    public Long getUplinkSpeedGbps() {
        return this.UplinkSpeedGbps;
    }

    /**
     * Set Uplink speed from the network to Tencent Cloud Region
     * @param UplinkSpeedGbps Uplink speed from the network to Tencent Cloud Region
     */
    public void setUplinkSpeedGbps(Long UplinkSpeedGbps) {
        this.UplinkSpeedGbps = UplinkSpeedGbps;
    }

    /**
     * Get Number of uplinks used by each CDC device (2 devices per rack) when connected to the network 
     * @return UplinkCount Number of uplinks used by each CDC device (2 devices per rack) when connected to the network
     */
    public Long getUplinkCount() {
        return this.UplinkCount;
    }

    /**
     * Set Number of uplinks used by each CDC device (2 devices per rack) when connected to the network
     * @param UplinkCount Number of uplinks used by each CDC device (2 devices per rack) when connected to the network
     */
    public void setUplinkCount(Long UplinkCount) {
        this.UplinkCount = UplinkCount;
    }

    /**
     * Get Whether the following environmental conditions are met: 
1. There are no material requirements or the acceptance standard on site that will affect the delivery and installation of the CDC device. 
2. The following conditions are met for finalized rack positions: 
Temperature ranges from 41 to 104°F (5 to 40°C). 
Humidity ranges from 10°F (-12°C) to 70°F (21°C) and relative humidity ranges from 8% RH to 80% RH. 
Air flows from front to back at the rack position and there is sufficient air in CFM (cubic feet per minute). The air quantity in CFM must be 145.8 times the power consumption (in KVA) of CDC. 
     * @return ConditionRequirement Whether the following environmental conditions are met: 
1. There are no material requirements or the acceptance standard on site that will affect the delivery and installation of the CDC device. 
2. The following conditions are met for finalized rack positions: 
Temperature ranges from 41 to 104°F (5 to 40°C). 
Humidity ranges from 10°F (-12°C) to 70°F (21°C) and relative humidity ranges from 8% RH to 80% RH. 
Air flows from front to back at the rack position and there is sufficient air in CFM (cubic feet per minute). The air quantity in CFM must be 145.8 times the power consumption (in KVA) of CDC.
     */
    public Boolean getConditionRequirement() {
        return this.ConditionRequirement;
    }

    /**
     * Set Whether the following environmental conditions are met: 
1. There are no material requirements or the acceptance standard on site that will affect the delivery and installation of the CDC device. 
2. The following conditions are met for finalized rack positions: 
Temperature ranges from 41 to 104°F (5 to 40°C). 
Humidity ranges from 10°F (-12°C) to 70°F (21°C) and relative humidity ranges from 8% RH to 80% RH. 
Air flows from front to back at the rack position and there is sufficient air in CFM (cubic feet per minute). The air quantity in CFM must be 145.8 times the power consumption (in KVA) of CDC.
     * @param ConditionRequirement Whether the following environmental conditions are met: 
1. There are no material requirements or the acceptance standard on site that will affect the delivery and installation of the CDC device. 
2. The following conditions are met for finalized rack positions: 
Temperature ranges from 41 to 104°F (5 to 40°C). 
Humidity ranges from 10°F (-12°C) to 70°F (21°C) and relative humidity ranges from 8% RH to 80% RH. 
Air flows from front to back at the rack position and there is sufficient air in CFM (cubic feet per minute). The air quantity in CFM must be 145.8 times the power consumption (in KVA) of CDC.
     */
    public void setConditionRequirement(Boolean ConditionRequirement) {
        this.ConditionRequirement = ConditionRequirement;
    }

    /**
     * Get Whether the following dimension conditions are met: 
Your loading dock can accommodate one rack container (H x W x D = 94" x 54" x 48"). 
You can provide a clear route from the delivery point of your rack (H x W x D = 80" x 24" x 48") to its final installation location. You should consider platforms, corridors, doors, turns, ramps, freight elevators as well as other access restrictions when measuring the depth. 
There shall be a 48" or greater front clearance and a 24" or greater rear clearance where the CDC is finally installed. 
     * @return DimensionRequirement Whether the following dimension conditions are met: 
Your loading dock can accommodate one rack container (H x W x D = 94" x 54" x 48"). 
You can provide a clear route from the delivery point of your rack (H x W x D = 80" x 24" x 48") to its final installation location. You should consider platforms, corridors, doors, turns, ramps, freight elevators as well as other access restrictions when measuring the depth. 
There shall be a 48" or greater front clearance and a 24" or greater rear clearance where the CDC is finally installed.
     */
    public Boolean getDimensionRequirement() {
        return this.DimensionRequirement;
    }

    /**
     * Set Whether the following dimension conditions are met: 
Your loading dock can accommodate one rack container (H x W x D = 94" x 54" x 48"). 
You can provide a clear route from the delivery point of your rack (H x W x D = 80" x 24" x 48") to its final installation location. You should consider platforms, corridors, doors, turns, ramps, freight elevators as well as other access restrictions when measuring the depth. 
There shall be a 48" or greater front clearance and a 24" or greater rear clearance where the CDC is finally installed.
     * @param DimensionRequirement Whether the following dimension conditions are met: 
Your loading dock can accommodate one rack container (H x W x D = 94" x 54" x 48"). 
You can provide a clear route from the delivery point of your rack (H x W x D = 80" x 24" x 48") to its final installation location. You should consider platforms, corridors, doors, turns, ramps, freight elevators as well as other access restrictions when measuring the depth. 
There shall be a 48" or greater front clearance and a 24" or greater rear clearance where the CDC is finally installed.
     */
    public void setDimensionRequirement(Boolean DimensionRequirement) {
        this.DimensionRequirement = DimensionRequirement;
    }

    /**
     * Get Whether redundant upstream equipment (switch or router) is provided so that both network devices can be connected to the network. 
     * @return RedundantNetworking Whether redundant upstream equipment (switch or router) is provided so that both network devices can be connected to the network.
     */
    public Boolean getRedundantNetworking() {
        return this.RedundantNetworking;
    }

    /**
     * Set Whether redundant upstream equipment (switch or router) is provided so that both network devices can be connected to the network.
     * @param RedundantNetworking Whether redundant upstream equipment (switch or router) is provided so that both network devices can be connected to the network.
     */
    public void setRedundantNetworking(Boolean RedundantNetworking) {
        this.RedundantNetworking = RedundantNetworking;
    }

    /**
     * Get Postal code of the site area 
     * @return PostalCode Postal code of the site area
     */
    public Long getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Postal code of the site area
     * @param PostalCode Postal code of the site area
     */
    public void setPostalCode(Long PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get Detailed address of the site area (to be added) 
     * @return OptionalAddressLine Detailed address of the site area (to be added)
     */
    public String getOptionalAddressLine() {
        return this.OptionalAddressLine;
    }

    /**
     * Set Detailed address of the site area (to be added)
     * @param OptionalAddressLine Detailed address of the site area (to be added)
     */
    public void setOptionalAddressLine(String OptionalAddressLine) {
        this.OptionalAddressLine = OptionalAddressLine;
    }

    /**
     * Get Whether you need help from Tencent Cloud for rack installation? 
     * @return NeedHelp Whether you need help from Tencent Cloud for rack installation?
     */
    public Boolean getNeedHelp() {
        return this.NeedHelp;
    }

    /**
     * Set Whether you need help from Tencent Cloud for rack installation?
     * @param NeedHelp Whether you need help from Tencent Cloud for rack installation?
     */
    public void setNeedHelp(Boolean NeedHelp) {
        this.NeedHelp = NeedHelp;
    }

    /**
     * Get Whether there is power redundancy? 
     * @return RedundantPower Whether there is power redundancy?
     */
    public Boolean getRedundantPower() {
        return this.RedundantPower;
    }

    /**
     * Set Whether there is power redundancy?
     * @param RedundantPower Whether there is power redundancy?
     */
    public void setRedundantPower(Boolean RedundantPower) {
        this.RedundantPower = RedundantPower;
    }

    /**
     * Get Whether there is an upstream circuit breaker? 
     * @return BreakerRequirement Whether there is an upstream circuit breaker?
     */
    public Boolean getBreakerRequirement() {
        return this.BreakerRequirement;
    }

    /**
     * Set Whether there is an upstream circuit breaker?
     * @param BreakerRequirement Whether there is an upstream circuit breaker?
     */
    public void setBreakerRequirement(Boolean BreakerRequirement) {
        this.BreakerRequirement = BreakerRequirement;
    }

    public CreateSiteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSiteRequest(CreateSiteRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.AddressLine != null) {
            this.AddressLine = new String(source.AddressLine);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.FiberType != null) {
            this.FiberType = new String(source.FiberType);
        }
        if (source.OpticalStandard != null) {
            this.OpticalStandard = new String(source.OpticalStandard);
        }
        if (source.PowerConnectors != null) {
            this.PowerConnectors = new String(source.PowerConnectors);
        }
        if (source.PowerFeedDrop != null) {
            this.PowerFeedDrop = new String(source.PowerFeedDrop);
        }
        if (source.MaxWeight != null) {
            this.MaxWeight = new Long(source.MaxWeight);
        }
        if (source.PowerDrawKva != null) {
            this.PowerDrawKva = new Long(source.PowerDrawKva);
        }
        if (source.UplinkSpeedGbps != null) {
            this.UplinkSpeedGbps = new Long(source.UplinkSpeedGbps);
        }
        if (source.UplinkCount != null) {
            this.UplinkCount = new Long(source.UplinkCount);
        }
        if (source.ConditionRequirement != null) {
            this.ConditionRequirement = new Boolean(source.ConditionRequirement);
        }
        if (source.DimensionRequirement != null) {
            this.DimensionRequirement = new Boolean(source.DimensionRequirement);
        }
        if (source.RedundantNetworking != null) {
            this.RedundantNetworking = new Boolean(source.RedundantNetworking);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new Long(source.PostalCode);
        }
        if (source.OptionalAddressLine != null) {
            this.OptionalAddressLine = new String(source.OptionalAddressLine);
        }
        if (source.NeedHelp != null) {
            this.NeedHelp = new Boolean(source.NeedHelp);
        }
        if (source.RedundantPower != null) {
            this.RedundantPower = new Boolean(source.RedundantPower);
        }
        if (source.BreakerRequirement != null) {
            this.BreakerRequirement = new Boolean(source.BreakerRequirement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AddressLine", this.AddressLine);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "FiberType", this.FiberType);
        this.setParamSimple(map, prefix + "OpticalStandard", this.OpticalStandard);
        this.setParamSimple(map, prefix + "PowerConnectors", this.PowerConnectors);
        this.setParamSimple(map, prefix + "PowerFeedDrop", this.PowerFeedDrop);
        this.setParamSimple(map, prefix + "MaxWeight", this.MaxWeight);
        this.setParamSimple(map, prefix + "PowerDrawKva", this.PowerDrawKva);
        this.setParamSimple(map, prefix + "UplinkSpeedGbps", this.UplinkSpeedGbps);
        this.setParamSimple(map, prefix + "UplinkCount", this.UplinkCount);
        this.setParamSimple(map, prefix + "ConditionRequirement", this.ConditionRequirement);
        this.setParamSimple(map, prefix + "DimensionRequirement", this.DimensionRequirement);
        this.setParamSimple(map, prefix + "RedundantNetworking", this.RedundantNetworking);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "OptionalAddressLine", this.OptionalAddressLine);
        this.setParamSimple(map, prefix + "NeedHelp", this.NeedHelp);
        this.setParamSimple(map, prefix + "RedundantPower", this.RedundantPower);
        this.setParamSimple(map, prefix + "BreakerRequirement", this.BreakerRequirement);

    }
}

