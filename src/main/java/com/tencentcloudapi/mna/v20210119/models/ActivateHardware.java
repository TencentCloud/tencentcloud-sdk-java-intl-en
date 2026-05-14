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

public class ActivateHardware extends AbstractModel {

    /**
    * Vendor name
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * Device SN serial number
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * device key
    */
    @SerializedName("DataKey")
    @Expose
    private String DataKey;

    /**
    * Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. By default if left blank, public cloud gateway is selected. Specific meaning: Public cloud gateway: device can only integrate with public cloud gateway (nearby access). Private gateway: device can only integrate with private gateway that has been launched (nearby access or fixed ip). Public cloud gateway and private gateway: device can also integrate with public cloud gateway and private gateway that has been launched (nearby access or fixed ip).
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
    * When the payer is the tenant, the tenant license payment method is available.
Monthly authorization
1: Permanent license
If not passed, it defaults to monthly authorization.
This parameter is invalid when the manufacturer is the payer.

    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * device group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Device group name. Reserved parameter. GroupId must be imported when grouping is required.
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
    * Device ID after activation
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get Vendor name 
     * @return Vendor Vendor name
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set Vendor name
     * @param Vendor Vendor name
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get Device SN serial number 
     * @return SN Device SN serial number
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set Device SN serial number
     * @param SN Device SN serial number
     */
    public void setSN(String SN) {
        this.SN = SN;
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
     * Get device key 
     * @return DataKey device key
     */
    public String getDataKey() {
        return this.DataKey;
    }

    /**
     * Set device key
     * @param DataKey device key
     */
    public void setDataKey(String DataKey) {
        this.DataKey = DataKey;
    }

    /**
     * Get Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. By default if left blank, public cloud gateway is selected. Specific meaning: Public cloud gateway: device can only integrate with public cloud gateway (nearby access). Private gateway: device can only integrate with private gateway that has been launched (nearby access or fixed ip). Public cloud gateway and private gateway: device can also integrate with public cloud gateway and private gateway that has been launched (nearby access or fixed ip). 
     * @return AccessScope Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. By default if left blank, public cloud gateway is selected. Specific meaning: Public cloud gateway: device can only integrate with public cloud gateway (nearby access). Private gateway: device can only integrate with private gateway that has been launched (nearby access or fixed ip). Public cloud gateway and private gateway: device can also integrate with public cloud gateway and private gateway that has been launched (nearby access or fixed ip).
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. By default if left blank, public cloud gateway is selected. Specific meaning: Public cloud gateway: device can only integrate with public cloud gateway (nearby access). Private gateway: device can only integrate with private gateway that has been launched (nearby access or fixed ip). Public cloud gateway and private gateway: device can also integrate with public cloud gateway and private gateway that has been launched (nearby access or fixed ip).
     * @param AccessScope Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. By default if left blank, public cloud gateway is selected. Specific meaning: Public cloud gateway: device can only integrate with public cloud gateway (nearby access). Private gateway: device can only integrate with private gateway that has been launched (nearby access or fixed ip). Public cloud gateway and private gateway: device can also integrate with public cloud gateway and private gateway that has been launched (nearby access or fixed ip).
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get When the payer is the tenant, the tenant license payment method is available.
Monthly authorization
1: Permanent license
If not passed, it defaults to monthly authorization.
This parameter is invalid when the manufacturer is the payer.
 
     * @return LicensePayMode When the payer is the tenant, the tenant license payment method is available.
Monthly authorization
1: Permanent license
If not passed, it defaults to monthly authorization.
This parameter is invalid when the manufacturer is the payer.

     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set When the payer is the tenant, the tenant license payment method is available.
Monthly authorization
1: Permanent license
If not passed, it defaults to monthly authorization.
This parameter is invalid when the manufacturer is the payer.

     * @param LicensePayMode When the payer is the tenant, the tenant license payment method is available.
Monthly authorization
1: Permanent license
If not passed, it defaults to monthly authorization.
This parameter is invalid when the manufacturer is the payer.

     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
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
     * Get Device group name. Reserved parameter. GroupId must be imported when grouping is required. 
     * @return GroupName Device group name. Reserved parameter. GroupId must be imported when grouping is required.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Device group name. Reserved parameter. GroupId must be imported when grouping is required.
     * @param GroupName Device group name. Reserved parameter. GroupId must be imported when grouping is required.
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

    /**
     * Get Device ID after activation 
     * @return DeviceId Device ID after activation
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID after activation
     * @param DeviceId Device ID after activation
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public ActivateHardware() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivateHardware(ActivateHardware source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DataKey != null) {
            this.DataKey = new String(source.DataKey);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new Long(source.AccessScope);
        }
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
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
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DataKey", this.DataKey);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

