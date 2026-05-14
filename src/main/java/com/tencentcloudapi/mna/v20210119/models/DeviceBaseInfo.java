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

public class DeviceBaseInfo extends AbstractModel {

    /**
    * Device unique ID
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
    * The time when the device is created, in ms.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last online time of the device, in ms.
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Device remark
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Access environment. 0: Public cloud gateway; 1: Private gateway; 2: Public cloud gateway and private gateway. Default is public cloud gateway. Specific meaning: Public cloud gateway: The device can only connect to the public cloud gateway (nearby access). Private gateway: The device can only connect to the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also connect to both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
    * Authorization validity period of license 0: Monthly authorization 1: Permanent license
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * Payer 0: Manufacturer payment 1: Customer payment
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
    * Device sn
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * manufacturer
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
     * Get Device unique ID 
     * @return DeviceId Device unique ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device unique ID
     * @param DeviceId Device unique ID
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
     * Get The time when the device is created, in ms. 
     * @return CreateTime The time when the device is created, in ms.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the device is created, in ms.
     * @param CreateTime The time when the device is created, in ms.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last online time of the device, in ms. 
     * @return LastTime Last online time of the device, in ms.
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last online time of the device, in ms.
     * @param LastTime Last online time of the device, in ms.
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Device remark 
     * @return Remark Device remark
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Device remark
     * @param Remark Device remark
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Access environment. 0: Public cloud gateway; 1: Private gateway; 2: Public cloud gateway and private gateway. Default is public cloud gateway. Specific meaning: Public cloud gateway: The device can only connect to the public cloud gateway (nearby access). Private gateway: The device can only connect to the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also connect to both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access). 
     * @return AccessScope Access environment. 0: Public cloud gateway; 1: Private gateway; 2: Public cloud gateway and private gateway. Default is public cloud gateway. Specific meaning: Public cloud gateway: The device can only connect to the public cloud gateway (nearby access). Private gateway: The device can only connect to the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also connect to both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set Access environment. 0: Public cloud gateway; 1: Private gateway; 2: Public cloud gateway and private gateway. Default is public cloud gateway. Specific meaning: Public cloud gateway: The device can only connect to the public cloud gateway (nearby access). Private gateway: The device can only connect to the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also connect to both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).
     * @param AccessScope Access environment. 0: Public cloud gateway; 1: Private gateway; 2: Public cloud gateway and private gateway. Default is public cloud gateway. Specific meaning: Public cloud gateway: The device can only connect to the public cloud gateway (nearby access). Private gateway: The device can only connect to the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also connect to both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get Authorization validity period of license 0: Monthly authorization 1: Permanent license 
     * @return LicensePayMode Authorization validity period of license 0: Monthly authorization 1: Permanent license
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set Authorization validity period of license 0: Monthly authorization 1: Permanent license
     * @param LicensePayMode Authorization validity period of license 0: Monthly authorization 1: Permanent license
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get Payer 0: Manufacturer payment 1: Customer payment 
     * @return Payer Payer 0: Manufacturer payment 1: Customer payment
     */
    public Long getPayer() {
        return this.Payer;
    }

    /**
     * Set Payer 0: Manufacturer payment 1: Customer payment
     * @param Payer Payer 0: Manufacturer payment 1: Customer payment
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

    /**
     * Get Device sn 
     * @return Sn Device sn
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set Device sn
     * @param Sn Device sn
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get manufacturer 
     * @return Vendor manufacturer
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set manufacturer
     * @param Vendor manufacturer
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    public DeviceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceBaseInfo(DeviceBaseInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new Long(source.AccessScope);
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
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FlowTrunc", this.FlowTrunc);
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);

    }
}

