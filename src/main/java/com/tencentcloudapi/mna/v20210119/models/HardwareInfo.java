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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HardwareInfo extends AbstractModel {

    /**
    * device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Activation time
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * Last online time
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * vendor remarks
    */
    @SerializedName("VendorDescription")
    @Expose
    private String VendorDescription;

    /**
    * License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: This parameter will be subsequently deprecated. Please use LicensePayMode and Payer for new access.
    */
    @SerializedName("LicenseChargingMode")
    @Expose
    private Long LicenseChargingMode;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Hardware Serial Number
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * Authorization validity period of license 
0: Monthly authorization 
1: Permanent license
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * Payer 
0: Customer payment 
1: Manufacturer payment
    */
    @SerializedName("Payer")
    @Expose
    private Long Payer;

    /**
    * device group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Device group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate	
    */
    @SerializedName("FlowTrunc")
    @Expose
    private Long FlowTrunc;

    /**
     * Get device ID 
     * @return DeviceId device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set device ID
     * @param DeviceId device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Activation time 
     * @return ActiveTime Activation time
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set Activation time
     * @param ActiveTime Activation time
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get Last online time 
     * @return LastOnlineTime Last online time
     */
    public String getLastOnlineTime() {
        return this.LastOnlineTime;
    }

    /**
     * Set Last online time
     * @param LastOnlineTime Last online time
     */
    public void setLastOnlineTime(String LastOnlineTime) {
        this.LastOnlineTime = LastOnlineTime;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get vendor remarks 
     * @return VendorDescription vendor remarks
     */
    public String getVendorDescription() {
        return this.VendorDescription;
    }

    /**
     * Set vendor remarks
     * @param VendorDescription vendor remarks
     */
    public void setVendorDescription(String VendorDescription) {
        this.VendorDescription = VendorDescription;
    }

    /**
     * Get License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: This parameter will be subsequently deprecated. Please use LicensePayMode and Payer for new access. 
     * @return LicenseChargingMode License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: This parameter will be subsequently deprecated. Please use LicensePayMode and Payer for new access.
     */
    public Long getLicenseChargingMode() {
        return this.LicenseChargingMode;
    }

    /**
     * Set License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: This parameter will be subsequently deprecated. Please use LicensePayMode and Payer for new access.
     * @param LicenseChargingMode License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: This parameter will be subsequently deprecated. Please use LicensePayMode and Payer for new access.
     */
    public void setLicenseChargingMode(Long LicenseChargingMode) {
        this.LicenseChargingMode = LicenseChargingMode;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Hardware Serial Number 
     * @return SN Hardware Serial Number
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set Hardware Serial Number
     * @param SN Hardware Serial Number
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get Authorization validity period of license 
0: Monthly authorization 
1: Permanent license 
     * @return LicensePayMode Authorization validity period of license 
0: Monthly authorization 
1: Permanent license
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set Authorization validity period of license 
0: Monthly authorization 
1: Permanent license
     * @param LicensePayMode Authorization validity period of license 
0: Monthly authorization 
1: Permanent license
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get Payer 
0: Customer payment 
1: Manufacturer payment 
     * @return Payer Payer 
0: Customer payment 
1: Manufacturer payment
     */
    public Long getPayer() {
        return this.Payer;
    }

    /**
     * Set Payer 
0: Customer payment 
1: Manufacturer payment
     * @param Payer Payer 
0: Customer payment 
1: Manufacturer payment
     */
    public void setPayer(Long Payer) {
        this.Payer = Payer;
    }

    /**
     * Get device group ID 
     * @return GroupId device group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set device group ID
     * @param GroupId device group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Device group name 
     * @return GroupName Device group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Device group name
     * @param GroupName Device group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate	 
     * @return FlowTrunc No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate	
     */
    public Long getFlowTrunc() {
        return this.FlowTrunc;
    }

    /**
     * Set No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate	
     * @param FlowTrunc No traffic processing method for the device. 0: pay-as-you-go, 1: truncate and accelerate	
     */
    public void setFlowTrunc(Long FlowTrunc) {
        this.FlowTrunc = FlowTrunc;
    }

    public HardwareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HardwareInfo(HardwareInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.LastOnlineTime != null) {
            this.LastOnlineTime = new String(source.LastOnlineTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VendorDescription != null) {
            this.VendorDescription = new String(source.VendorDescription);
        }
        if (source.LicenseChargingMode != null) {
            this.LicenseChargingMode = new Long(source.LicenseChargingMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
        }
        if (source.Payer != null) {
            this.Payer = new Long(source.Payer);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.FlowTrunc != null) {
            this.FlowTrunc = new Long(source.FlowTrunc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VendorDescription", this.VendorDescription);
        this.setParamSimple(map, prefix + "LicenseChargingMode", this.LicenseChargingMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);

    }
}

