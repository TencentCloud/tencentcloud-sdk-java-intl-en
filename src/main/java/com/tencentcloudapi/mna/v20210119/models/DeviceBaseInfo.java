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
    * <p>Unique ID of the device</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>Device name</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>The time when the device is created, in ms</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last online time of the device, in ms</p>
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * <p>Remark of the device</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. Defaults to public cloud gateway. Specific meaning: Public cloud gateway: The device can only access the public cloud gateway (nearby access). Private gateway: The device can only access the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also access both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).</p>
    */
    @SerializedName("AccessScope")
    @Expose
    private Long AccessScope;

    /**
    * <p>license authorization validity period 0: monthly authorization 1: permanent license</p>
    */
    @SerializedName("LicensePayMode")
    @Expose
    private Long LicensePayMode;

    /**
    * <p>Payment party 0: Manufacturer pays 1: Customer pays</p>
    */
    @SerializedName("Payer")
    @Expose
    private Long Payer;

    /**
    * <p>device group ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Device group name</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>Device data transfer plan processing method, 0: pay-as-you-go, 1: truncate acceleration</p>
    */
    @SerializedName("FlowTrunc")
    @Expose
    private Long FlowTrunc;

    /**
    * <p>Device sn</p>
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * <p>Manufacturer</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>Access region list.</p>
    */
    @SerializedName("AllowedRegions")
    @Expose
    private String [] AllowedRegions;

    /**
     * Get <p>Unique ID of the device</p> 
     * @return DeviceId <p>Unique ID of the device</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>Unique ID of the device</p>
     * @param DeviceId <p>Unique ID of the device</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>Device name</p> 
     * @return DeviceName <p>Device name</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>Device name</p>
     * @param DeviceName <p>Device name</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>The time when the device is created, in ms</p> 
     * @return CreateTime <p>The time when the device is created, in ms</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>The time when the device is created, in ms</p>
     * @param CreateTime <p>The time when the device is created, in ms</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last online time of the device, in ms</p> 
     * @return LastTime <p>Last online time of the device, in ms</p>
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set <p>Last online time of the device, in ms</p>
     * @param LastTime <p>Last online time of the device, in ms</p>
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get <p>Remark of the device</p> 
     * @return Remark <p>Remark of the device</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remark of the device</p>
     * @param Remark <p>Remark of the device</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. Defaults to public cloud gateway. Specific meaning: Public cloud gateway: The device can only access the public cloud gateway (nearby access). Private gateway: The device can only access the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also access both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).</p> 
     * @return AccessScope <p>Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. Defaults to public cloud gateway. Specific meaning: Public cloud gateway: The device can only access the public cloud gateway (nearby access). Private gateway: The device can only access the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also access both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).</p>
     */
    public Long getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set <p>Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. Defaults to public cloud gateway. Specific meaning: Public cloud gateway: The device can only access the public cloud gateway (nearby access). Private gateway: The device can only access the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also access both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).</p>
     * @param AccessScope <p>Access environment. 0: public cloud gateway; 1: private gateway; 2: public cloud gateway and private gateway. Defaults to public cloud gateway. Specific meaning: Public cloud gateway: The device can only access the public cloud gateway (nearby access). Private gateway: The device can only access the already launched private gateway (nearby access or fixed ip access). Public cloud gateway and private gateway: The device can also access both the public cloud gateway and the already launched private gateway (nearby access or fixed ip access).</p>
     */
    public void setAccessScope(Long AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get <p>license authorization validity period 0: monthly authorization 1: permanent license</p> 
     * @return LicensePayMode <p>license authorization validity period 0: monthly authorization 1: permanent license</p>
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set <p>license authorization validity period 0: monthly authorization 1: permanent license</p>
     * @param LicensePayMode <p>license authorization validity period 0: monthly authorization 1: permanent license</p>
     */
    public void setLicensePayMode(Long LicensePayMode) {
        this.LicensePayMode = LicensePayMode;
    }

    /**
     * Get <p>Payment party 0: Manufacturer pays 1: Customer pays</p> 
     * @return Payer <p>Payment party 0: Manufacturer pays 1: Customer pays</p>
     */
    public Long getPayer() {
        return this.Payer;
    }

    /**
     * Set <p>Payment party 0: Manufacturer pays 1: Customer pays</p>
     * @param Payer <p>Payment party 0: Manufacturer pays 1: Customer pays</p>
     */
    public void setPayer(Long Payer) {
        this.Payer = Payer;
    }

    /**
     * Get <p>device group ID</p> 
     * @return GroupId <p>device group ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>device group ID</p>
     * @param GroupId <p>device group ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Device group name</p> 
     * @return GroupName <p>Device group name</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>Device group name</p>
     * @param GroupName <p>Device group name</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>Device data transfer plan processing method, 0: pay-as-you-go, 1: truncate acceleration</p> 
     * @return FlowTrunc <p>Device data transfer plan processing method, 0: pay-as-you-go, 1: truncate acceleration</p>
     */
    public Long getFlowTrunc() {
        return this.FlowTrunc;
    }

    /**
     * Set <p>Device data transfer plan processing method, 0: pay-as-you-go, 1: truncate acceleration</p>
     * @param FlowTrunc <p>Device data transfer plan processing method, 0: pay-as-you-go, 1: truncate acceleration</p>
     */
    public void setFlowTrunc(Long FlowTrunc) {
        this.FlowTrunc = FlowTrunc;
    }

    /**
     * Get <p>Device sn</p> 
     * @return Sn <p>Device sn</p>
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set <p>Device sn</p>
     * @param Sn <p>Device sn</p>
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get <p>Manufacturer</p> 
     * @return Vendor <p>Manufacturer</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>Manufacturer</p>
     * @param Vendor <p>Manufacturer</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>Access region list.</p> 
     * @return AllowedRegions <p>Access region list.</p>
     */
    public String [] getAllowedRegions() {
        return this.AllowedRegions;
    }

    /**
     * Set <p>Access region list.</p>
     * @param AllowedRegions <p>Access region list.</p>
     */
    public void setAllowedRegions(String [] AllowedRegions) {
        this.AllowedRegions = AllowedRegions;
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
        if (source.AllowedRegions != null) {
            this.AllowedRegions = new String[source.AllowedRegions.length];
            for (int i = 0; i < source.AllowedRegions.length; i++) {
                this.AllowedRegions[i] = new String(source.AllowedRegions[i]);
            }
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
        this.setParamArraySimple(map, prefix + "AllowedRegions.", this.AllowedRegions);

    }
}

