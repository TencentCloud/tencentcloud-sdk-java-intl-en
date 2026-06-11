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

public class VulEffectHostList extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Status: 0 - pending processing; 1 - ignored; 3 - fixed; 5 - detecting; 6 - in remediation; 7 - rolling back; 8 - fix failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Last detection time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

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
    * Host tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
    */
    @SerializedName("HostVersion")
    @Expose
    private Long HostVersion;

    /**
    * Whether automatic fixing is supported 0: Cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Host can only be manually repaired if not flagship, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: In-progress detection, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not on linux, 13: Fixing failed but host is offline, 14: Fixing failed but host is not flagship, 15: Manually fixed
    */
    @SerializedName("IsSupportAutoFix")
    @Expose
    private Long IsSupportAutoFix;

    /**
    * Reason for failure
    */
    @SerializedName("FixStatusMsg")
    @Expose
    private String FixStatusMsg;

    /**
    * First detection time
    */
    @SerializedName("FirstDiscoveryTime")
    @Expose
    private String FirstDiscoveryTime;

    /**
    * Instance status: "PENDING" - creating, "LAUNCH_FAILED" - creation failed, "RUNNING" - running, "STOPPED" - shutdown, "STARTING" - starting, "STOPPING" - indicates shutdown in progress, "REBOOTING" - restarting, "SHUTDOWN" - indicate shutdown and pending termination, "TERMINATING" - indicates terminating in progress.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Public IP address
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String PublicIpAddresses;

    /**
    * Cloud Tag Information
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * Host Additional Information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Host type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Availability zone ID.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Whether to create a snapshot for the fix task: 0: not created; other: created.
    */
    @SerializedName("HasSnapshot")
    @Expose
    private Long HasSnapshot;

    /**
    * Last repair time
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * Description
    */
    @SerializedName("DescriptionEn")
    @Expose
    private String DescriptionEn;

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Status: 0 - pending processing; 1 - ignored; 3 - fixed; 5 - detecting; 6 - in remediation; 7 - rolling back; 8 - fix failed. 
     * @return Status Status: 0 - pending processing; 1 - ignored; 3 - fixed; 5 - detecting; 6 - in remediation; 7 - rolling back; 8 - fix failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status: 0 - pending processing; 1 - ignored; 3 - fixed; 5 - detecting; 6 - in remediation; 7 - rolling back; 8 - fix failed.
     * @param Status Status: 0 - pending processing; 1 - ignored; 3 - fixed; 5 - detecting; 6 - in remediation; 7 - rolling back; 8 - fix failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Last detection time 
     * @return LastTime Last detection time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last detection time
     * @param LastTime Last detection time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical 
     * @return Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     * @param Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
     */
    public void setLevel(Long Level) {
        this.Level = Level;
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
     * Get Host tag 
     * @return Tags Host tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Host tag
     * @param Tags Host tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition 
     * @return HostVersion Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
     */
    public Long getHostVersion() {
        return this.HostVersion;
    }

    /**
     * Set Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
     * @param HostVersion Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
     */
    public void setHostVersion(Long HostVersion) {
        this.HostVersion = HostVersion;
    }

    /**
     * Get Whether automatic fixing is supported 0: Cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Host can only be manually repaired if not flagship, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: In-progress detection, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not on linux, 13: Fixing failed but host is offline, 14: Fixing failed but host is not flagship, 15: Manually fixed 
     * @return IsSupportAutoFix Whether automatic fixing is supported 0: Cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Host can only be manually repaired if not flagship, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: In-progress detection, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not on linux, 13: Fixing failed but host is offline, 14: Fixing failed but host is not flagship, 15: Manually fixed
     */
    public Long getIsSupportAutoFix() {
        return this.IsSupportAutoFix;
    }

    /**
     * Set Whether automatic fixing is supported 0: Cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Host can only be manually repaired if not flagship, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: In-progress detection, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not on linux, 13: Fixing failed but host is offline, 14: Fixing failed but host is not flagship, 15: Manually fixed
     * @param IsSupportAutoFix Whether automatic fixing is supported 0: Cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Host can only be manually repaired if not flagship, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: In-progress detection, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not on linux, 13: Fixing failed but host is offline, 14: Fixing failed but host is not flagship, 15: Manually fixed
     */
    public void setIsSupportAutoFix(Long IsSupportAutoFix) {
        this.IsSupportAutoFix = IsSupportAutoFix;
    }

    /**
     * Get Reason for failure 
     * @return FixStatusMsg Reason for failure
     */
    public String getFixStatusMsg() {
        return this.FixStatusMsg;
    }

    /**
     * Set Reason for failure
     * @param FixStatusMsg Reason for failure
     */
    public void setFixStatusMsg(String FixStatusMsg) {
        this.FixStatusMsg = FixStatusMsg;
    }

    /**
     * Get First detection time 
     * @return FirstDiscoveryTime First detection time
     */
    public String getFirstDiscoveryTime() {
        return this.FirstDiscoveryTime;
    }

    /**
     * Set First detection time
     * @param FirstDiscoveryTime First detection time
     */
    public void setFirstDiscoveryTime(String FirstDiscoveryTime) {
        this.FirstDiscoveryTime = FirstDiscoveryTime;
    }

    /**
     * Get Instance status: "PENDING" - creating, "LAUNCH_FAILED" - creation failed, "RUNNING" - running, "STOPPED" - shutdown, "STARTING" - starting, "STOPPING" - indicates shutdown in progress, "REBOOTING" - restarting, "SHUTDOWN" - indicate shutdown and pending termination, "TERMINATING" - indicates terminating in progress. 
     * @return InstanceState Instance status: "PENDING" - creating, "LAUNCH_FAILED" - creation failed, "RUNNING" - running, "STOPPED" - shutdown, "STARTING" - starting, "STOPPING" - indicates shutdown in progress, "REBOOTING" - restarting, "SHUTDOWN" - indicate shutdown and pending termination, "TERMINATING" - indicates terminating in progress.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status: "PENDING" - creating, "LAUNCH_FAILED" - creation failed, "RUNNING" - running, "STOPPED" - shutdown, "STARTING" - starting, "STOPPING" - indicates shutdown in progress, "REBOOTING" - restarting, "SHUTDOWN" - indicate shutdown and pending termination, "TERMINATING" - indicates terminating in progress.
     * @param InstanceState Instance status: "PENDING" - creating, "LAUNCH_FAILED" - creation failed, "RUNNING" - running, "STOPPED" - shutdown, "STARTING" - starting, "STOPPING" - indicates shutdown in progress, "REBOOTING" - restarting, "SHUTDOWN" - indicate shutdown and pending termination, "TERMINATING" - indicates terminating in progress.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Public IP address 
     * @return PublicIpAddresses Public IP address
     */
    public String getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Public IP address
     * @param PublicIpAddresses Public IP address
     */
    public void setPublicIpAddresses(String PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Cloud Tag Information 
     * @return CloudTags Cloud Tag Information
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set Cloud Tag Information
     * @param CloudTags Cloud Tag Information
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get Host Additional Information 
     * @return MachineExtraInfo Host Additional Information
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
     * @param MachineExtraInfo Host Additional Information
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Host type 
     * @return MachineType Host type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Host type
     * @param MachineType Host type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
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

    /**
     * Get Last repair time 
     * @return LatestFixTime Last repair time
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set Last repair time
     * @param LatestFixTime Last repair time
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get Description 
     * @return DescriptionEn Description
     */
    public String getDescriptionEn() {
        return this.DescriptionEn;
    }

    /**
     * Set Description
     * @param DescriptionEn Description
     */
    public void setDescriptionEn(String DescriptionEn) {
        this.DescriptionEn = DescriptionEn;
    }

    public VulEffectHostList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulEffectHostList(VulEffectHostList source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HostVersion != null) {
            this.HostVersion = new Long(source.HostVersion);
        }
        if (source.IsSupportAutoFix != null) {
            this.IsSupportAutoFix = new Long(source.IsSupportAutoFix);
        }
        if (source.FixStatusMsg != null) {
            this.FixStatusMsg = new String(source.FixStatusMsg);
        }
        if (source.FirstDiscoveryTime != null) {
            this.FirstDiscoveryTime = new String(source.FirstDiscoveryTime);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String(source.PublicIpAddresses);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.HasSnapshot != null) {
            this.HasSnapshot = new Long(source.HasSnapshot);
        }
        if (source.LatestFixTime != null) {
            this.LatestFixTime = new String(source.LatestFixTime);
        }
        if (source.DescriptionEn != null) {
            this.DescriptionEn = new String(source.DescriptionEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HostVersion", this.HostVersion);
        this.setParamSimple(map, prefix + "IsSupportAutoFix", this.IsSupportAutoFix);
        this.setParamSimple(map, prefix + "FixStatusMsg", this.FixStatusMsg);
        this.setParamSimple(map, prefix + "FirstDiscoveryTime", this.FirstDiscoveryTime);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "PublicIpAddresses", this.PublicIpAddresses);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "HasSnapshot", this.HasSnapshot);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamSimple(map, prefix + "DescriptionEn", this.DescriptionEn);

    }
}

