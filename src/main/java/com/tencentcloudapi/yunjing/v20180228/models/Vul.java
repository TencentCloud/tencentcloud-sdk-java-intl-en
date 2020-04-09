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

public class Vul extends AbstractModel{

    /**
    * Vulnerability category ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability severity level:
HIGH: high
MIDDLE: medium
LOW: low
NOTICE: notice
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * Last scanned time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Number of affected servers
    */
    @SerializedName("ImpactedHostNum")
    @Expose
    private Long ImpactedHostNum;

    /**
    * Vulnerability status
* UN_OPERATED: to be processed
* FIXED: fixed
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

    /**
     * Get Vulnerability category ID 
     * @return VulId Vulnerability category ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability category ID
     * @param VulId Vulnerability category ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability severity level:
HIGH: high
MIDDLE: medium
LOW: low
NOTICE: notice 
     * @return VulLevel Vulnerability severity level:
HIGH: high
MIDDLE: medium
LOW: low
NOTICE: notice
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set Vulnerability severity level:
HIGH: high
MIDDLE: medium
LOW: low
NOTICE: notice
     * @param VulLevel Vulnerability severity level:
HIGH: high
MIDDLE: medium
LOW: low
NOTICE: notice
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get Last scanned time 
     * @return LastScanTime Last scanned time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scanned time
     * @param LastScanTime Last scanned time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Number of affected servers 
     * @return ImpactedHostNum Number of affected servers
     */
    public Long getImpactedHostNum() {
        return this.ImpactedHostNum;
    }

    /**
     * Set Number of affected servers
     * @param ImpactedHostNum Number of affected servers
     */
    public void setImpactedHostNum(Long ImpactedHostNum) {
        this.ImpactedHostNum = ImpactedHostNum;
    }

    /**
     * Get Vulnerability status
* UN_OPERATED: to be processed
* FIXED: fixed 
     * @return VulStatus Vulnerability status
* UN_OPERATED: to be processed
* FIXED: fixed
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * Set Vulnerability status
* UN_OPERATED: to be processed
* FIXED: fixed
     * @param VulStatus Vulnerability status
* UN_OPERATED: to be processed
* FIXED: fixed
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "ImpactedHostNum", this.ImpactedHostNum);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);

    }
}

