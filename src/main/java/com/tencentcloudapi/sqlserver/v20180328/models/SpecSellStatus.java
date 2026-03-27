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
    * Sellable Specification Unique ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Instance Type ID
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * Supported payment modes for this specification: POST - only supports pay-as-you-go, PRE - only supports yearly/monthly subscription, ALL - supports all.
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
    * Product type. Types of instances for purchase: HA - Local Disk High Availability (including dual-node high availability, alwaysOn cluster), RO - Local Disk Read-Only Replica, SI - Cloud Disk Edition Single Node, BI - Business Intelligence Service, cvmHA - Cloud Disk Edition High Availability, cvmRO - Cloud Disk Edition Read-Only Replica, MultiHA - Multi-node, cvmMultiHA - Cloud Disk Multi-node.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Whether this specification supports cross-AZ deployment: MultiZones - only supports cross-AZ, SameZones - only supports same-AZ, ALL - supports all.
    */
    @SerializedName("MultiZonesStatus")
    @Expose
    private String MultiZonesStatus;

    /**
    * Architecture Type, SINGLE - single node, DOUBLE - dual node, TRIPLE - three-node, MULTI - multi-node
Example value: SINGLE
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * Type identifier, EXCLUSIVE - Dedicated, SHARED - Shared
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * Database Version Information
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Sellable Status Set Per AZ
    */
    @SerializedName("ZoneStatusSet")
    @Expose
    private ZoneStatus [] ZoneStatusSet;

    /**
    * Reference price for specifications. The actual price is subject to the quotation API.
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * Specification Sale Status: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Sellable Specification Unique ID 
     * @return Id Sellable Specification Unique ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Sellable Specification Unique ID
     * @param Id Sellable Specification Unique ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Instance Type ID 
     * @return SpecId Instance Type ID
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set Instance Type ID
     * @param SpecId Instance Type ID
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get Supported payment modes for this specification: POST - only supports pay-as-you-go, PRE - only supports yearly/monthly subscription, ALL - supports all. 
     * @return PayModeStatus Supported payment modes for this specification: POST - only supports pay-as-you-go, PRE - only supports yearly/monthly subscription, ALL - supports all.
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * Set Supported payment modes for this specification: POST - only supports pay-as-you-go, PRE - only supports yearly/monthly subscription, ALL - supports all.
     * @param PayModeStatus Supported payment modes for this specification: POST - only supports pay-as-you-go, PRE - only supports yearly/monthly subscription, ALL - supports all.
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * Get Product type. Types of instances for purchase: HA - Local Disk High Availability (including dual-node high availability, alwaysOn cluster), RO - Local Disk Read-Only Replica, SI - Cloud Disk Edition Single Node, BI - Business Intelligence Service, cvmHA - Cloud Disk Edition High Availability, cvmRO - Cloud Disk Edition Read-Only Replica, MultiHA - Multi-node, cvmMultiHA - Cloud Disk Multi-node. 
     * @return InstanceType Product type. Types of instances for purchase: HA - Local Disk High Availability (including dual-node high availability, alwaysOn cluster), RO - Local Disk Read-Only Replica, SI - Cloud Disk Edition Single Node, BI - Business Intelligence Service, cvmHA - Cloud Disk Edition High Availability, cvmRO - Cloud Disk Edition Read-Only Replica, MultiHA - Multi-node, cvmMultiHA - Cloud Disk Multi-node.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Product type. Types of instances for purchase: HA - Local Disk High Availability (including dual-node high availability, alwaysOn cluster), RO - Local Disk Read-Only Replica, SI - Cloud Disk Edition Single Node, BI - Business Intelligence Service, cvmHA - Cloud Disk Edition High Availability, cvmRO - Cloud Disk Edition Read-Only Replica, MultiHA - Multi-node, cvmMultiHA - Cloud Disk Multi-node.
     * @param InstanceType Product type. Types of instances for purchase: HA - Local Disk High Availability (including dual-node high availability, alwaysOn cluster), RO - Local Disk Read-Only Replica, SI - Cloud Disk Edition Single Node, BI - Business Intelligence Service, cvmHA - Cloud Disk Edition High Availability, cvmRO - Cloud Disk Edition Read-Only Replica, MultiHA - Multi-node, cvmMultiHA - Cloud Disk Multi-node.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Whether this specification supports cross-AZ deployment: MultiZones - only supports cross-AZ, SameZones - only supports same-AZ, ALL - supports all. 
     * @return MultiZonesStatus Whether this specification supports cross-AZ deployment: MultiZones - only supports cross-AZ, SameZones - only supports same-AZ, ALL - supports all.
     */
    public String getMultiZonesStatus() {
        return this.MultiZonesStatus;
    }

    /**
     * Set Whether this specification supports cross-AZ deployment: MultiZones - only supports cross-AZ, SameZones - only supports same-AZ, ALL - supports all.
     * @param MultiZonesStatus Whether this specification supports cross-AZ deployment: MultiZones - only supports cross-AZ, SameZones - only supports same-AZ, ALL - supports all.
     */
    public void setMultiZonesStatus(String MultiZonesStatus) {
        this.MultiZonesStatus = MultiZonesStatus;
    }

    /**
     * Get Architecture Type, SINGLE - single node, DOUBLE - dual node, TRIPLE - three-node, MULTI - multi-node
Example value: SINGLE 
     * @return Architecture Architecture Type, SINGLE - single node, DOUBLE - dual node, TRIPLE - three-node, MULTI - multi-node
Example value: SINGLE
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set Architecture Type, SINGLE - single node, DOUBLE - dual node, TRIPLE - three-node, MULTI - multi-node
Example value: SINGLE
     * @param Architecture Architecture Type, SINGLE - single node, DOUBLE - dual node, TRIPLE - three-node, MULTI - multi-node
Example value: SINGLE
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get Type identifier, EXCLUSIVE - Dedicated, SHARED - Shared 
     * @return Style Type identifier, EXCLUSIVE - Dedicated, SHARED - Shared
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set Type identifier, EXCLUSIVE - Dedicated, SHARED - Shared
     * @param Style Type identifier, EXCLUSIVE - Dedicated, SHARED - Shared
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get Database Version Information 
     * @return Version Database Version Information
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Database Version Information
     * @param Version Database Version Information
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Sellable Status Set Per AZ 
     * @return ZoneStatusSet Sellable Status Set Per AZ
     */
    public ZoneStatus [] getZoneStatusSet() {
        return this.ZoneStatusSet;
    }

    /**
     * Set Sellable Status Set Per AZ
     * @param ZoneStatusSet Sellable Status Set Per AZ
     */
    public void setZoneStatusSet(ZoneStatus [] ZoneStatusSet) {
        this.ZoneStatusSet = ZoneStatusSet;
    }

    /**
     * Get Reference price for specifications. The actual price is subject to the quotation API. 
     * @return Price Reference price for specifications. The actual price is subject to the quotation API.
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set Reference price for specifications. The actual price is subject to the quotation API.
     * @param Price Reference price for specifications. The actual price is subject to the quotation API.
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get Specification Sale Status: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled. 
     * @return Status Specification Sale Status: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Specification Sale Status: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
     * @param Status Specification Sale Status: 1 - Normal, 2 - Sale disabled but upgradable, 3 - Sale completely disabled.
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

