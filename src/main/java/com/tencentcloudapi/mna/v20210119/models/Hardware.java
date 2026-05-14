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

public class Hardware extends AbstractModel {

    /**
    * Hardware Serial Number
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * license billing mode:
1. Tenant payment
2: Manufacturer monthly payment
3: Manufacturer permanent license
    */
    @SerializedName("LicenseChargingMode")
    @Expose
    private Long LicenseChargingMode;

    /**
    * Device description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Hardware ID. No need to pass as an input parameter.
    */
    @SerializedName("HardwareId")
    @Expose
    private String HardwareId;

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
     * Get license billing mode:
1. Tenant payment
2: Manufacturer monthly payment
3: Manufacturer permanent license 
     * @return LicenseChargingMode license billing mode:
1. Tenant payment
2: Manufacturer monthly payment
3: Manufacturer permanent license
     */
    public Long getLicenseChargingMode() {
        return this.LicenseChargingMode;
    }

    /**
     * Set license billing mode:
1. Tenant payment
2: Manufacturer monthly payment
3: Manufacturer permanent license
     * @param LicenseChargingMode license billing mode:
1. Tenant payment
2: Manufacturer monthly payment
3: Manufacturer permanent license
     */
    public void setLicenseChargingMode(Long LicenseChargingMode) {
        this.LicenseChargingMode = LicenseChargingMode;
    }

    /**
     * Get Device description 
     * @return Description Device description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Device description
     * @param Description Device description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Hardware ID. No need to pass as an input parameter. 
     * @return HardwareId Hardware ID. No need to pass as an input parameter.
     */
    public String getHardwareId() {
        return this.HardwareId;
    }

    /**
     * Set Hardware ID. No need to pass as an input parameter.
     * @param HardwareId Hardware ID. No need to pass as an input parameter.
     */
    public void setHardwareId(String HardwareId) {
        this.HardwareId = HardwareId;
    }

    public Hardware() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hardware(Hardware source) {
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.LicenseChargingMode != null) {
            this.LicenseChargingMode = new Long(source.LicenseChargingMode);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HardwareId != null) {
            this.HardwareId = new String(source.HardwareId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "LicenseChargingMode", this.LicenseChargingMode);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HardwareId", this.HardwareId);

    }
}

