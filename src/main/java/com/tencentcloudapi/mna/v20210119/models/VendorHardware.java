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

public class VendorHardware extends AbstractModel {

    /**
    * Hardware id
    */
    @SerializedName("HardwareId")
    @Expose
    private String HardwareId;

    /**
    * Hardware Serial Number
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Activation status, empty: all; 1: to be activated; 2: activated
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Activation time
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * vendor remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: When the device is paid by the tenant and inactive (not selected for monthly or permanent payment), this parameter returns 1, indicating only that the tenant has paid. This parameter will be subsequently deprecated. For new access, please use LicensePayMode and Payer.
    */
    @SerializedName("LicenseChargingMode")
    @Expose
    private Long LicenseChargingMode;

    /**
    * Last online time
    */
    @SerializedName("LastOnlineTime")
    @Expose
    private String LastOnlineTime;

    /**
    * Authorization validity period
Monthly authorization
1: Permanent license
-Unknown
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
     * Get Hardware id 
     * @return HardwareId Hardware id
     */
    public String getHardwareId() {
        return this.HardwareId;
    }

    /**
     * Set Hardware id
     * @param HardwareId Hardware id
     */
    public void setHardwareId(String HardwareId) {
        this.HardwareId = HardwareId;
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
     * Get Activation status, empty: all; 1: to be activated; 2: activated 
     * @return Status Activation status, empty: all; 1: to be activated; 2: activated
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Activation status, empty: all; 1: to be activated; 2: activated
     * @param Status Activation status, empty: all; 1: to be activated; 2: activated
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get vendor remarks 
     * @return Description vendor remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set vendor remarks
     * @param Description vendor remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Device ID 
     * @return DeviceId Device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID
     * @param DeviceId Device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: When the device is paid by the tenant and inactive (not selected for monthly or permanent payment), this parameter returns 1, indicating only that the tenant has paid. This parameter will be subsequently deprecated. For new access, please use LicensePayMode and Payer. 
     * @return LicenseChargingMode License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: When the device is paid by the tenant and inactive (not selected for monthly or permanent payment), this parameter returns 1, indicating only that the tenant has paid. This parameter will be subsequently deprecated. For new access, please use LicensePayMode and Payer.
     */
    public Long getLicenseChargingMode() {
        return this.LicenseChargingMode;
    }

    /**
     * Set License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: When the device is paid by the tenant and inactive (not selected for monthly or permanent payment), this parameter returns 1, indicating only that the tenant has paid. This parameter will be subsequently deprecated. For new access, please use LicensePayMode and Payer.
     * @param LicenseChargingMode License billing mode: 1. Tenant monthly payment 2. Manufacturer monthly payment 3. Permanent license.
Note: When the device is paid by the tenant and inactive (not selected for monthly or permanent payment), this parameter returns 1, indicating only that the tenant has paid. This parameter will be subsequently deprecated. For new access, please use LicensePayMode and Payer.
     */
    public void setLicenseChargingMode(Long LicenseChargingMode) {
        this.LicenseChargingMode = LicenseChargingMode;
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
     * Get Authorization validity period
Monthly authorization
1: Permanent license
-Unknown 
     * @return LicensePayMode Authorization validity period
Monthly authorization
1: Permanent license
-Unknown
     */
    public Long getLicensePayMode() {
        return this.LicensePayMode;
    }

    /**
     * Set Authorization validity period
Monthly authorization
1: Permanent license
-Unknown
     * @param LicensePayMode Authorization validity period
Monthly authorization
1: Permanent license
-Unknown
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

    public VendorHardware() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VendorHardware(VendorHardware source) {
        if (source.HardwareId != null) {
            this.HardwareId = new String(source.HardwareId);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.LicenseChargingMode != null) {
            this.LicenseChargingMode = new Long(source.LicenseChargingMode);
        }
        if (source.LastOnlineTime != null) {
            this.LastOnlineTime = new String(source.LastOnlineTime);
        }
        if (source.LicensePayMode != null) {
            this.LicensePayMode = new Long(source.LicensePayMode);
        }
        if (source.Payer != null) {
            this.Payer = new Long(source.Payer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HardwareId", this.HardwareId);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "LicenseChargingMode", this.LicenseChargingMode);
        this.setParamSimple(map, prefix + "LastOnlineTime", this.LastOnlineTime);
        this.setParamSimple(map, prefix + "LicensePayMode", this.LicensePayMode);
        this.setParamSimple(map, prefix + "Payer", this.Payer);

    }
}

