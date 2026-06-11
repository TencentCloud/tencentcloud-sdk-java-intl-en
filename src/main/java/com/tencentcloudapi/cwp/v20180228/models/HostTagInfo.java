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

public class HostTagInfo extends AbstractModel {

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host tag name array
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * Host intranet IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * host name
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Host public IP address.
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Kernel version number
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * Host online status: ONLINE, OFFLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Protection version: BASIC_VERSION - Basic Edition, PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * Cloud Tag Information
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * Host Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Specific host types
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Availability zone name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Availability zone ID.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

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
     * Get Host tag name array 
     * @return TagList Host tag name array
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Host tag name array
     * @param TagList Host tag name array
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Host intranet IP 
     * @return HostIp Host intranet IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host intranet IP
     * @param HostIp Host intranet IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get host name 
     * @return AliasName host name
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set host name
     * @param AliasName host name
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Host public IP address. 
     * @return MachineWanIp Host public IP address.
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Host public IP address.
     * @param MachineWanIp Host public IP address.
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
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
     * Get Kernel version number 
     * @return KernelVersion Kernel version number
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set Kernel version number
     * @param KernelVersion Kernel version number
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get Host online status: ONLINE, OFFLINE 
     * @return MachineStatus Host online status: ONLINE, OFFLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Host online status: ONLINE, OFFLINE
     * @param MachineStatus Host online status: ONLINE, OFFLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Protection version: BASIC_VERSION - Basic Edition, PRO_VERSION - Professional Edition; Flagship: Ultimate Edition 
     * @return ProtectType Protection version: BASIC_VERSION - Basic Edition, PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set Protection version: BASIC_VERSION - Basic Edition, PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
     * @param ProtectType Protection version: BASIC_VERSION - Basic Edition, PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get Number of vulnerabilities 
     * @return VulNum Number of vulnerabilities
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set Number of vulnerabilities
     * @param VulNum Number of vulnerabilities
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
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
     * Get Host Instance ID 
     * @return InstanceID Host Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Host Instance ID
     * @param InstanceID Host Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Specific host types 
     * @return MachineType Specific host types
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Specific host types
     * @param MachineType Specific host types
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Availability zone name 
     * @return RegionName Availability zone name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Availability zone name
     * @param RegionName Availability zone name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
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

    public HostTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostTagInfo(HostTagInfo source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.VulNum != null) {
            this.VulNum = new Long(source.VulNum);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

