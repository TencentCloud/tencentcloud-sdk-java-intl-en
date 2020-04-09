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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentVul extends AbstractModel{

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
    * Vulnerability name.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability severity level.
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
<li>NOTICE: notice</li>
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * Last scanned time.
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

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
    * Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>FIXED: fixed</li>
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

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
     * Get Vulnerability severity level.
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
<li>NOTICE: notice</li> 
     * @return VulLevel Vulnerability severity level.
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
<li>NOTICE: notice</li>
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set Vulnerability severity level.
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
<li>NOTICE: notice</li>
     * @param VulLevel Vulnerability severity level.
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
<li>NOTICE: notice</li>
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
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
     * Get Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>FIXED: fixed</li> 
     * @return VulStatus Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>FIXED: fixed</li>
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * Set Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>FIXED: fixed</li>
     * @param VulStatus Vulnerability status.
<li>UN_OPERATED: to be processed</li>
<li>FIXED: fixed</li>
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);

    }
}

