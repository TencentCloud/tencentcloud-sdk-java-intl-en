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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostTagInfo extends AbstractModel {

    /**
    * Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host tag name array
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * Host intranet IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Kernel version number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * Host online status: ONLINE; OFFLINE
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Protection version: BASIC_VERSION - Basic Edition PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * Host Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

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
     * Get Host tag name array
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagList Host tag name array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Host tag name array
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagList Host tag name array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Host intranet IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIp Host intranet IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host intranet IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIp Host intranet IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AliasName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AliasName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Host public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineWanIp Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineWanIp Host public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
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
     * Get Kernel version number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KernelVersion Kernel version number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set Kernel version number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KernelVersion Kernel version number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get Host online status: ONLINE; OFFLINE
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineStatus Host online status: ONLINE; OFFLINE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Host online status: ONLINE; OFFLINE
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineStatus Host online status: ONLINE; OFFLINE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Protection version: BASIC_VERSION - Basic Edition PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProtectType Protection version: BASIC_VERSION - Basic Edition PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set Protection version: BASIC_VERSION - Basic Edition PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProtectType Protection version: BASIC_VERSION - Basic Edition PRO_VERSION - Professional Edition; Flagship: Ultimate Edition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulNum Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulNum Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloudTags Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloudTags Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get Host Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceID Host Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Host Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceID Host Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
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

    }
}

