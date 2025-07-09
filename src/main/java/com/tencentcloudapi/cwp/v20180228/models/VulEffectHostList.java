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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Status. 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 7: rolling back; 8: fixing failed.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

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
    * Host tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Edition information. 0: Basic Edition; 1: Pro Edition; 2: Ultimate Edition; 3: Inclusive Edition.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostVersion")
    @Expose
    private Long HostVersion;

    /**
    * Whether automatic fixing is supported. 0: not supported; 1: supported; 2: client offline; 3: manual fixing supported for Ultimate Edition hosts; 4: not supported for this model; 5: fixing, 6: fixed; 7: detecting; 9: fixing failed; 10: ignored; 11: supported for Linux but not Windows; 12: supported for Windows but not Linux; 13: fixing failed but host is offline; 14: fixing failed but host is not of the Ultimate edition; 15: manually fixed.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSupportAutoFix")
    @Expose
    private Long IsSupportAutoFix;

    /**
    * Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixStatusMsg")
    @Expose
    private String FixStatusMsg;

    /**
    * First detection time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstDiscoveryTime")
    @Expose
    private String FirstDiscoveryTime;

    /**
    * Instance status. "PENDING": creating; "LAUNCH_FAILED" : creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": shut down and pending termination; "TERMINATING": terminating.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String PublicIpAddresses;

    /**
    * Cloud tag information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * Host additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Event ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Status. 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 7: rolling back; 8: fixing failed.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status. 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 7: rolling back; 8: fixing failed.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 7: rolling back; 8: fixing failed.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status. 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 7: rolling back; 8: fixing failed.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Last detection time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastTime Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastTime Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
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
     * Get Host tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Edition information. 0: Basic Edition; 1: Pro Edition; 2: Ultimate Edition; 3: Inclusive Edition.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostVersion Edition information. 0: Basic Edition; 1: Pro Edition; 2: Ultimate Edition; 3: Inclusive Edition.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostVersion() {
        return this.HostVersion;
    }

    /**
     * Set Edition information. 0: Basic Edition; 1: Pro Edition; 2: Ultimate Edition; 3: Inclusive Edition.Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostVersion Edition information. 0: Basic Edition; 1: Pro Edition; 2: Ultimate Edition; 3: Inclusive Edition.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostVersion(Long HostVersion) {
        this.HostVersion = HostVersion;
    }

    /**
     * Get Whether automatic fixing is supported. 0: not supported; 1: supported; 2: client offline; 3: manual fixing supported for Ultimate Edition hosts; 4: not supported for this model; 5: fixing, 6: fixed; 7: detecting; 9: fixing failed; 10: ignored; 11: supported for Linux but not Windows; 12: supported for Windows but not Linux; 13: fixing failed but host is offline; 14: fixing failed but host is not of the Ultimate edition; 15: manually fixed.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSupportAutoFix Whether automatic fixing is supported. 0: not supported; 1: supported; 2: client offline; 3: manual fixing supported for Ultimate Edition hosts; 4: not supported for this model; 5: fixing, 6: fixed; 7: detecting; 9: fixing failed; 10: ignored; 11: supported for Linux but not Windows; 12: supported for Windows but not Linux; 13: fixing failed but host is offline; 14: fixing failed but host is not of the Ultimate edition; 15: manually fixed.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSupportAutoFix() {
        return this.IsSupportAutoFix;
    }

    /**
     * Set Whether automatic fixing is supported. 0: not supported; 1: supported; 2: client offline; 3: manual fixing supported for Ultimate Edition hosts; 4: not supported for this model; 5: fixing, 6: fixed; 7: detecting; 9: fixing failed; 10: ignored; 11: supported for Linux but not Windows; 12: supported for Windows but not Linux; 13: fixing failed but host is offline; 14: fixing failed but host is not of the Ultimate edition; 15: manually fixed.Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSupportAutoFix Whether automatic fixing is supported. 0: not supported; 1: supported; 2: client offline; 3: manual fixing supported for Ultimate Edition hosts; 4: not supported for this model; 5: fixing, 6: fixed; 7: detecting; 9: fixing failed; 10: ignored; 11: supported for Linux but not Windows; 12: supported for Windows but not Linux; 13: fixing failed but host is offline; 14: fixing failed but host is not of the Ultimate edition; 15: manually fixed.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSupportAutoFix(Long IsSupportAutoFix) {
        this.IsSupportAutoFix = IsSupportAutoFix;
    }

    /**
     * Get Failure cause
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FixStatusMsg Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFixStatusMsg() {
        return this.FixStatusMsg;
    }

    /**
     * Set Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FixStatusMsg Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFixStatusMsg(String FixStatusMsg) {
        this.FixStatusMsg = FixStatusMsg;
    }

    /**
     * Get First detection time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstDiscoveryTime First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstDiscoveryTime() {
        return this.FirstDiscoveryTime;
    }

    /**
     * Set First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstDiscoveryTime First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstDiscoveryTime(String FirstDiscoveryTime) {
        this.FirstDiscoveryTime = FirstDiscoveryTime;
    }

    /**
     * Get Instance status. "PENDING": creating; "LAUNCH_FAILED" : creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": shut down and pending termination; "TERMINATING": terminating.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceState Instance status. "PENDING": creating; "LAUNCH_FAILED" : creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": shut down and pending termination; "TERMINATING": terminating.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status. "PENDING": creating; "LAUNCH_FAILED" : creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": shut down and pending termination; "TERMINATING": terminating.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceState Instance status. "PENDING": creating; "LAUNCH_FAILED" : creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": shut down and pending termination; "TERMINATING": terminating.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicIpAddresses Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicIpAddresses Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIpAddresses(String PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Cloud tag information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudTags Cloud tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set Cloud tag information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudTags Cloud tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get Host additional information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Host additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host additional information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Host additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
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

    }
}

