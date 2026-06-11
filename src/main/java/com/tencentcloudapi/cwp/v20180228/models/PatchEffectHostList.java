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

public class PatchEffectHostList extends AbstractModel {

    /**
    * Version information: 0-Basic Version 1-Pro Edition 2-Flagship Edition 3-Lite Edition
    */
    @SerializedName("HostVersion")
    @Expose
    private Long HostVersion;

    /**
    * Instance status: "PENDING"-creating "LAUNCH_FAILED"-creation failed "RUNNING"-running "STOPPED"-shutdown "STARTING"-starting "STOPPING"-indicates shutdown in progress "REBOOTING"-restarting "SHUTDOWN"-indicate shutdown and pending termination "TERMINATING"-indicates terminating in progress
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * First scan time
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * Last scan time
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * Remediation status: 0-not remediated; 1-in remediation; 2-FIX_FAILURE; 3-repair successful; 4-timeout
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * Host basic information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Host Security Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Unique Uuid of a CVM or BM machine
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Status: 0: pending 1: ignored 3: fixed 5: detecting 6: in remediation 7: rolling back 8: FIX_FAILURE
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Fixing time
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * KB id
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * Whether restart is required 0: not required 1: required
    */
    @SerializedName("RestartRequired")
    @Expose
    private Long RestartRequired;

    /**
    * Availability zone ID.	
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Machine type info
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Whether to create a snapshot for the fix task: 0: not created; other: created.
    */
    @SerializedName("HasSnapshot")
    @Expose
    private Long HasSnapshot;

    /**
     * Get Version information: 0-Basic Version 1-Pro Edition 2-Flagship Edition 3-Lite Edition 
     * @return HostVersion Version information: 0-Basic Version 1-Pro Edition 2-Flagship Edition 3-Lite Edition
     */
    public Long getHostVersion() {
        return this.HostVersion;
    }

    /**
     * Set Version information: 0-Basic Version 1-Pro Edition 2-Flagship Edition 3-Lite Edition
     * @param HostVersion Version information: 0-Basic Version 1-Pro Edition 2-Flagship Edition 3-Lite Edition
     */
    public void setHostVersion(Long HostVersion) {
        this.HostVersion = HostVersion;
    }

    /**
     * Get Instance status: "PENDING"-creating "LAUNCH_FAILED"-creation failed "RUNNING"-running "STOPPED"-shutdown "STARTING"-starting "STOPPING"-indicates shutdown in progress "REBOOTING"-restarting "SHUTDOWN"-indicate shutdown and pending termination "TERMINATING"-indicates terminating in progress 
     * @return InstanceState Instance status: "PENDING"-creating "LAUNCH_FAILED"-creation failed "RUNNING"-running "STOPPED"-shutdown "STARTING"-starting "STOPPING"-indicates shutdown in progress "REBOOTING"-restarting "SHUTDOWN"-indicate shutdown and pending termination "TERMINATING"-indicates terminating in progress
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status: "PENDING"-creating "LAUNCH_FAILED"-creation failed "RUNNING"-running "STOPPED"-shutdown "STARTING"-starting "STOPPING"-indicates shutdown in progress "REBOOTING"-restarting "SHUTDOWN"-indicate shutdown and pending termination "TERMINATING"-indicates terminating in progress
     * @param InstanceState Instance status: "PENDING"-creating "LAUNCH_FAILED"-creation failed "RUNNING"-running "STOPPED"-shutdown "STARTING"-starting "STOPPING"-indicates shutdown in progress "REBOOTING"-restarting "SHUTDOWN"-indicate shutdown and pending termination "TERMINATING"-indicates terminating in progress
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get First scan time 
     * @return FirstScanTime First scan time
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set First scan time
     * @param FirstScanTime First scan time
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get Last scan time 
     * @return LatestScanTime Last scan time
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set Last scan time
     * @param LatestScanTime Last scan time
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get Remediation status: 0-not remediated; 1-in remediation; 2-FIX_FAILURE; 3-repair successful; 4-timeout 
     * @return FixStatus Remediation status: 0-not remediated; 1-in remediation; 2-FIX_FAILURE; 3-repair successful; 4-timeout
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set Remediation status: 0-not remediated; 1-in remediation; 2-FIX_FAILURE; 3-repair successful; 4-timeout
     * @param FixStatus Remediation status: 0-not remediated; 1-in remediation; 2-FIX_FAILURE; 3-repair successful; 4-timeout
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get Host basic information 
     * @return MachineExtraInfo Host basic information
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host basic information
     * @param MachineExtraInfo Host basic information
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Host Security Uuid 
     * @return Uuid Host Security Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host Security Uuid
     * @param Uuid Host Security Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Unique Uuid of a CVM or BM machine 
     * @return Quuid Unique Uuid of a CVM or BM machine
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Unique Uuid of a CVM or BM machine
     * @param Quuid Unique Uuid of a CVM or BM machine
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Status: 0: pending 1: ignored 3: fixed 5: detecting 6: in remediation 7: rolling back 8: FIX_FAILURE 
     * @return Status Status: 0: pending 1: ignored 3: fixed 5: detecting 6: in remediation 7: rolling back 8: FIX_FAILURE
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status: 0: pending 1: ignored 3: fixed 5: detecting 6: in remediation 7: rolling back 8: FIX_FAILURE
     * @param Status Status: 0: pending 1: ignored 3: fixed 5: detecting 6: in remediation 7: rolling back 8: FIX_FAILURE
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Fixing time 
     * @return LatestFixTime Fixing time
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set Fixing time
     * @param LatestFixTime Fixing time
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get KB id 
     * @return KbId KB id
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set KB id
     * @param KbId KB id
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get Whether restart is required 0: not required 1: required 
     * @return RestartRequired Whether restart is required 0: not required 1: required
     */
    public Long getRestartRequired() {
        return this.RestartRequired;
    }

    /**
     * Set Whether restart is required 0: not required 1: required
     * @param RestartRequired Whether restart is required 0: not required 1: required
     */
    public void setRestartRequired(Long RestartRequired) {
        this.RestartRequired = RestartRequired;
    }

    /**
     * Get Availability zone ID.	 
     * @return RegionId Availability zone ID.	
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Availability zone ID.	
     * @param RegionId Availability zone ID.	
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Machine type info 
     * @return MachineType Machine type info
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine type info
     * @param MachineType Machine type info
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Whether to create a snapshot for the fix task: 0: not created; other: created. 
     * @return HasSnapshot Whether to create a snapshot for the fix task: 0: not created; other: created.
     */
    public Long getHasSnapshot() {
        return this.HasSnapshot;
    }

    /**
     * Set Whether to create a snapshot for the fix task: 0: not created; other: created.
     * @param HasSnapshot Whether to create a snapshot for the fix task: 0: not created; other: created.
     */
    public void setHasSnapshot(Long HasSnapshot) {
        this.HasSnapshot = HasSnapshot;
    }

    public PatchEffectHostList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatchEffectHostList(PatchEffectHostList source) {
        if (source.HostVersion != null) {
            this.HostVersion = new Long(source.HostVersion);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LatestFixTime != null) {
            this.LatestFixTime = new String(source.LatestFixTime);
        }
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.RestartRequired != null) {
            this.RestartRequired = new Long(source.RestartRequired);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.HasSnapshot != null) {
            this.HasSnapshot = new Long(source.HasSnapshot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostVersion", this.HostVersion);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "RestartRequired", this.RestartRequired);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "HasSnapshot", this.HasSnapshot);

    }
}

