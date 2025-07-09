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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineEffectHost extends AbstractModel {

    /**
    * Passed item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassCount")
    @Expose
    private Long PassCount;

    /**
    * Risky item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * First check time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * Last check time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Risky item processing status. 0: failed; 1: passed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host alias
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Check status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxStatus")
    @Expose
    private Long MaxStatus;

    /**
     * Get Passed item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassCount Passed item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPassCount() {
        return this.PassCount;
    }

    /**
     * Set Passed item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassCount Passed item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassCount(Long PassCount) {
        this.PassCount = PassCount;
    }

    /**
     * Get Risky item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailCount Risky item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Risky item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailCount Risky item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get First check time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstScanTime First check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set First check time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstScanTime First check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get Last check time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastScanTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastScanTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Risky item processing status. 0: failed; 1: passed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Risky item processing status. 0: failed; 1: passed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Risky item processing status. 0: failed; 1: passed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Risky item processing status. 0: failed; 1: passed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Host QUUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIp Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIp Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host alias
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AliasName Host alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Host alias
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AliasName Host alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Host UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Check status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxStatus Check status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxStatus() {
        return this.MaxStatus;
    }

    /**
     * Set Check status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxStatus Check status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxStatus(Long MaxStatus) {
        this.MaxStatus = MaxStatus;
    }

    public BaselineEffectHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineEffectHost(BaselineEffectHost source) {
        if (source.PassCount != null) {
            this.PassCount = new Long(source.PassCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MaxStatus != null) {
            this.MaxStatus = new Long(source.MaxStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PassCount", this.PassCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MaxStatus", this.MaxStatus);

    }
}

