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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliveryRestrictionsInfo extends AbstractModel{

    /**
    * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
    */
    @SerializedName("WebDeliveryAllowed")
    @Expose
    private String WebDeliveryAllowed;

    /**
    * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
    */
    @SerializedName("NoRegionalBlackout")
    @Expose
    private String NoRegionalBlackout;

    /**
    * Corresponds to SCTE-35 archive_allowed_flag.
    */
    @SerializedName("ArchiveAllowed")
    @Expose
    private String ArchiveAllowed;

    /**
    * Corresponds to SCTE-35 device_restrictions parameter.
    */
    @SerializedName("DeviceRestrictions")
    @Expose
    private String DeviceRestrictions;

    /**
     * Get Corresponds to SCTE-35 web_delivery_allowed_flag parameter. 
     * @return WebDeliveryAllowed Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     */
    public String getWebDeliveryAllowed() {
        return this.WebDeliveryAllowed;
    }

    /**
     * Set Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     * @param WebDeliveryAllowed Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
     */
    public void setWebDeliveryAllowed(String WebDeliveryAllowed) {
        this.WebDeliveryAllowed = WebDeliveryAllowed;
    }

    /**
     * Get Corresponds to SCTE-35 no_regional_blackout_flag parameter. 
     * @return NoRegionalBlackout Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     */
    public String getNoRegionalBlackout() {
        return this.NoRegionalBlackout;
    }

    /**
     * Set Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     * @param NoRegionalBlackout Corresponds to SCTE-35 no_regional_blackout_flag parameter.
     */
    public void setNoRegionalBlackout(String NoRegionalBlackout) {
        this.NoRegionalBlackout = NoRegionalBlackout;
    }

    /**
     * Get Corresponds to SCTE-35 archive_allowed_flag. 
     * @return ArchiveAllowed Corresponds to SCTE-35 archive_allowed_flag.
     */
    public String getArchiveAllowed() {
        return this.ArchiveAllowed;
    }

    /**
     * Set Corresponds to SCTE-35 archive_allowed_flag.
     * @param ArchiveAllowed Corresponds to SCTE-35 archive_allowed_flag.
     */
    public void setArchiveAllowed(String ArchiveAllowed) {
        this.ArchiveAllowed = ArchiveAllowed;
    }

    /**
     * Get Corresponds to SCTE-35 device_restrictions parameter. 
     * @return DeviceRestrictions Corresponds to SCTE-35 device_restrictions parameter.
     */
    public String getDeviceRestrictions() {
        return this.DeviceRestrictions;
    }

    /**
     * Set Corresponds to SCTE-35 device_restrictions parameter.
     * @param DeviceRestrictions Corresponds to SCTE-35 device_restrictions parameter.
     */
    public void setDeviceRestrictions(String DeviceRestrictions) {
        this.DeviceRestrictions = DeviceRestrictions;
    }

    public DeliveryRestrictionsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliveryRestrictionsInfo(DeliveryRestrictionsInfo source) {
        if (source.WebDeliveryAllowed != null) {
            this.WebDeliveryAllowed = new String(source.WebDeliveryAllowed);
        }
        if (source.NoRegionalBlackout != null) {
            this.NoRegionalBlackout = new String(source.NoRegionalBlackout);
        }
        if (source.ArchiveAllowed != null) {
            this.ArchiveAllowed = new String(source.ArchiveAllowed);
        }
        if (source.DeviceRestrictions != null) {
            this.DeviceRestrictions = new String(source.DeviceRestrictions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebDeliveryAllowed", this.WebDeliveryAllowed);
        this.setParamSimple(map, prefix + "NoRegionalBlackout", this.NoRegionalBlackout);
        this.setParamSimple(map, prefix + "ArchiveAllowed", this.ArchiveAllowed);
        this.setParamSimple(map, prefix + "DeviceRestrictions", this.DeviceRestrictions);

    }
}

