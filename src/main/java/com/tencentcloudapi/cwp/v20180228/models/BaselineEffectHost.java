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
    * Passed items
    */
    @SerializedName("PassCount")
    @Expose
    private Long PassCount;

    /**
    * Risky item
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * First detection event
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * Last detection time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Risky item processing status. 0: failed; 1: passed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host alias
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * detecting state
    */
    @SerializedName("MaxStatus")
    @Expose
    private Long MaxStatus;

    /**
     * Get Passed items 
     * @return PassCount Passed items
     */
    public Long getPassCount() {
        return this.PassCount;
    }

    /**
     * Set Passed items
     * @param PassCount Passed items
     */
    public void setPassCount(Long PassCount) {
        this.PassCount = PassCount;
    }

    /**
     * Get Risky item 
     * @return FailCount Risky item
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Risky item
     * @param FailCount Risky item
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get First detection event 
     * @return FirstScanTime First detection event
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set First detection event
     * @param FirstScanTime First detection event
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get Last detection time 
     * @return LastScanTime Last detection time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last detection time
     * @param LastScanTime Last detection time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Risky item processing status. 0: failed; 1: passed. 
     * @return Status Risky item processing status. 0: failed; 1: passed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Risky item processing status. 0: failed; 1: passed.
     * @param Status Risky item processing status. 0: failed; 1: passed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host IP address 
     * @return HostIp Host IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP address
     * @param HostIp Host IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host alias 
     * @return AliasName Host alias
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Host alias
     * @param AliasName Host alias
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get detecting state 
     * @return MaxStatus detecting state
     */
    public Long getMaxStatus() {
        return this.MaxStatus;
    }

    /**
     * Set detecting state
     * @param MaxStatus detecting state
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

