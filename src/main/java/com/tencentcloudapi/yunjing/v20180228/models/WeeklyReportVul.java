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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeeklyReportVul extends AbstractModel {

    /**
    * Private IP of server.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Vulnerability name.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability type.
<li> WEB: web vulnerability</li>
<li> SYSTEM: system component vulnerability</li>
<li> BASELINE: security baseline</li>
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * Vulnerability description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Vulnerability status.
<li> UN_OPERATED: to be processed</li>
<li> SCANING: scanning</li>
<li> FIXED: fixed</li>
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

    /**
    * Last scanned time.
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
     * Get Private IP of server. 
     * @return MachineIp Private IP of server.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP of server.
     * @param MachineIp Private IP of server.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Vulnerability name. 
     * @return VulName Vulnerability name.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name.
     * @param VulName Vulnerability name.
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability type.
<li> WEB: web vulnerability</li>
<li> SYSTEM: system component vulnerability</li>
<li> BASELINE: security baseline</li> 
     * @return VulType Vulnerability type.
<li> WEB: web vulnerability</li>
<li> SYSTEM: system component vulnerability</li>
<li> BASELINE: security baseline</li>
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set Vulnerability type.
<li> WEB: web vulnerability</li>
<li> SYSTEM: system component vulnerability</li>
<li> BASELINE: security baseline</li>
     * @param VulType Vulnerability type.
<li> WEB: web vulnerability</li>
<li> SYSTEM: system component vulnerability</li>
<li> BASELINE: security baseline</li>
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * Get Vulnerability description. 
     * @return Description Vulnerability description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vulnerability description.
     * @param Description Vulnerability description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Vulnerability status.
<li> UN_OPERATED: to be processed</li>
<li> SCANING: scanning</li>
<li> FIXED: fixed</li> 
     * @return VulStatus Vulnerability status.
<li> UN_OPERATED: to be processed</li>
<li> SCANING: scanning</li>
<li> FIXED: fixed</li>
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * Set Vulnerability status.
<li> UN_OPERATED: to be processed</li>
<li> SCANING: scanning</li>
<li> FIXED: fixed</li>
     * @param VulStatus Vulnerability status.
<li> UN_OPERATED: to be processed</li>
<li> SCANING: scanning</li>
<li> FIXED: fixed</li>
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    /**
     * Get Last scanned time. 
     * @return LastScanTime Last scanned time.
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scanned time.
     * @param LastScanTime Last scanned time.
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    public WeeklyReportVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeeklyReportVul(WeeklyReportVul source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulType != null) {
            this.VulType = new String(source.VulType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VulStatus != null) {
            this.VulStatus = new String(source.VulStatus);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);

    }
}

