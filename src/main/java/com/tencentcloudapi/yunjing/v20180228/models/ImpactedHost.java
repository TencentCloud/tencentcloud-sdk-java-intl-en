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

public class ImpactedHost extends AbstractModel {

    /**
    * Vulnerability ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Server IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Last detection time.
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>SCANING: scanning</li>
<li>FIXED: fixed</li>
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

    /**
    * CWP agent `UUID`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Vulnerability description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Vulnerability category ID.
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Whether it is the CWP Pro.
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
     * Get Vulnerability ID. 
     * @return Id Vulnerability ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability ID.
     * @param Id Vulnerability ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Server IP. 
     * @return MachineIp Server IP.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Server IP.
     * @param MachineIp Server IP.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Server name. 
     * @return MachineName Server name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name.
     * @param MachineName Server name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Last detection time. 
     * @return LastScanTime Last detection time.
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last detection time.
     * @param LastScanTime Last detection time.
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>SCANING: scanning</li>
<li>FIXED: fixed</li> 
     * @return VulStatus Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>SCANING: scanning</li>
<li>FIXED: fixed</li>
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * Set Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>SCANING: scanning</li>
<li>FIXED: fixed</li>
     * @param VulStatus Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>SCANING: scanning</li>
<li>FIXED: fixed</li>
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    /**
     * Get CWP agent `UUID`. 
     * @return Uuid CWP agent `UUID`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `UUID`.
     * @param Uuid CWP agent `UUID`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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
     * Get Vulnerability category ID. 
     * @return VulId Vulnerability category ID.
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability category ID.
     * @param VulId Vulnerability category ID.
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Whether it is the CWP Pro. 
     * @return IsProVersion Whether it is the CWP Pro.
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether it is the CWP Pro.
     * @param IsProVersion Whether it is the CWP Pro.
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    public ImpactedHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImpactedHost(ImpactedHost source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.VulStatus != null) {
            this.VulStatus = new String(source.VulStatus);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);

    }
}

