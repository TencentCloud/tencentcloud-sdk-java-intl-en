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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetConfig extends AbstractModel {

    /**
    * Public network address version. Optional: "IPV4" | "IPV6". By default IPV4 if left blank.
    */
    @SerializedName("InternetAddressVersion")
    @Expose
    private String InternetAddressVersion;

    /**
    * Public network payment mode. Currently, only "BANDWIDTH" is selectable. Defaults to "BANDWIDTH" if left blank.
    */
    @SerializedName("InternetPayMode")
    @Expose
    private String InternetPayMode;

    /**
    * Public network bandwidth.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Description of load balancing
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Load balancing specification type. Support clb.c2.medium, clb.c3.small, clb.c3.medium, clb.c4.small, clb.c4.medium, clb.c4.large, clb.c4.xlarge. Defaults to shared type.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * Whether load balancing is multi-availability zone
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * Primary AZ.
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * standby availability zone
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
     * Get Public network address version. Optional: "IPV4" | "IPV6". By default IPV4 if left blank. 
     * @return InternetAddressVersion Public network address version. Optional: "IPV4" | "IPV6". By default IPV4 if left blank.
     */
    public String getInternetAddressVersion() {
        return this.InternetAddressVersion;
    }

    /**
     * Set Public network address version. Optional: "IPV4" | "IPV6". By default IPV4 if left blank.
     * @param InternetAddressVersion Public network address version. Optional: "IPV4" | "IPV6". By default IPV4 if left blank.
     */
    public void setInternetAddressVersion(String InternetAddressVersion) {
        this.InternetAddressVersion = InternetAddressVersion;
    }

    /**
     * Get Public network payment mode. Currently, only "BANDWIDTH" is selectable. Defaults to "BANDWIDTH" if left blank. 
     * @return InternetPayMode Public network payment mode. Currently, only "BANDWIDTH" is selectable. Defaults to "BANDWIDTH" if left blank.
     */
    public String getInternetPayMode() {
        return this.InternetPayMode;
    }

    /**
     * Set Public network payment mode. Currently, only "BANDWIDTH" is selectable. Defaults to "BANDWIDTH" if left blank.
     * @param InternetPayMode Public network payment mode. Currently, only "BANDWIDTH" is selectable. Defaults to "BANDWIDTH" if left blank.
     */
    public void setInternetPayMode(String InternetPayMode) {
        this.InternetPayMode = InternetPayMode;
    }

    /**
     * Get Public network bandwidth. 
     * @return InternetMaxBandwidthOut Public network bandwidth.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network bandwidth.
     * @param InternetMaxBandwidthOut Public network bandwidth.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Description of load balancing 
     * @return Description Description of load balancing
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of load balancing
     * @param Description Description of load balancing
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Load balancing specification type. Support clb.c2.medium, clb.c3.small, clb.c3.medium, clb.c4.small, clb.c4.medium, clb.c4.large, clb.c4.xlarge. Defaults to shared type. 
     * @return SlaType Load balancing specification type. Support clb.c2.medium, clb.c3.small, clb.c3.medium, clb.c4.small, clb.c4.medium, clb.c4.large, clb.c4.xlarge. Defaults to shared type.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Load balancing specification type. Support clb.c2.medium, clb.c3.small, clb.c3.medium, clb.c4.small, clb.c4.medium, clb.c4.large, clb.c4.xlarge. Defaults to shared type.
     * @param SlaType Load balancing specification type. Support clb.c2.medium, clb.c3.small, clb.c3.medium, clb.c4.small, clb.c4.medium, clb.c4.large, clb.c4.xlarge. Defaults to shared type.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get Whether load balancing is multi-availability zone 
     * @return MultiZoneFlag Whether load balancing is multi-availability zone
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set Whether load balancing is multi-availability zone
     * @param MultiZoneFlag Whether load balancing is multi-availability zone
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get Primary AZ. 
     * @return MasterZoneId Primary AZ.
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set Primary AZ.
     * @param MasterZoneId Primary AZ.
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get standby availability zone 
     * @return SlaveZoneId standby availability zone
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set standby availability zone
     * @param SlaveZoneId standby availability zone
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    public InternetConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetConfig(InternetConfig source) {
        if (source.InternetAddressVersion != null) {
            this.InternetAddressVersion = new String(source.InternetAddressVersion);
        }
        if (source.InternetPayMode != null) {
            this.InternetPayMode = new String(source.InternetPayMode);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.MultiZoneFlag != null) {
            this.MultiZoneFlag = new Boolean(source.MultiZoneFlag);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetAddressVersion", this.InternetAddressVersion);
        this.setParamSimple(map, prefix + "InternetPayMode", this.InternetPayMode);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);

    }
}

