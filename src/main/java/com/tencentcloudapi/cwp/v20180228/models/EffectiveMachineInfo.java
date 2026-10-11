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

public class EffectiveMachineInfo extends AbstractModel {

    /**
    * Machine name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Public ip address of the machine
    */
    @SerializedName("MachinePublicIp")
    @Expose
    private String MachinePublicIp;

    /**
    * Private ip of the machine
    */
    @SerializedName("MachinePrivateIp")
    @Expose
    private String MachinePrivateIp;

    /**
    * Machine Tag
    */
    @SerializedName("MachineTag")
    @Expose
    private MachineTag [] MachineTag;

    /**
    * Machine Quuid
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
    * Kernel version number
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * Online status. OFFLINE, ONLINE.
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Authorization order object
    */
    @SerializedName("LicenseOrder")
    @Expose
    private LicenseOrder LicenseOrder;

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
    * Machine Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get Machine name 
     * @return MachineName Machine name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Machine name
     * @param MachineName Machine name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Public ip address of the machine 
     * @return MachinePublicIp Public ip address of the machine
     */
    public String getMachinePublicIp() {
        return this.MachinePublicIp;
    }

    /**
     * Set Public ip address of the machine
     * @param MachinePublicIp Public ip address of the machine
     */
    public void setMachinePublicIp(String MachinePublicIp) {
        this.MachinePublicIp = MachinePublicIp;
    }

    /**
     * Get Private ip of the machine 
     * @return MachinePrivateIp Private ip of the machine
     */
    public String getMachinePrivateIp() {
        return this.MachinePrivateIp;
    }

    /**
     * Set Private ip of the machine
     * @param MachinePrivateIp Private ip of the machine
     */
    public void setMachinePrivateIp(String MachinePrivateIp) {
        this.MachinePrivateIp = MachinePrivateIp;
    }

    /**
     * Get Machine Tag 
     * @return MachineTag Machine Tag
     */
    public MachineTag [] getMachineTag() {
        return this.MachineTag;
    }

    /**
     * Set Machine Tag
     * @param MachineTag Machine Tag
     */
    public void setMachineTag(MachineTag [] MachineTag) {
        this.MachineTag = MachineTag;
    }

    /**
     * Get Machine Quuid 
     * @return Quuid Machine Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Machine Quuid
     * @param Quuid Machine Quuid
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
     * Get Online status. OFFLINE, ONLINE. 
     * @return MachineStatus Online status. OFFLINE, ONLINE.
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Online status. OFFLINE, ONLINE.
     * @param MachineStatus Online status. OFFLINE, ONLINE.
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Authorization order object 
     * @return LicenseOrder Authorization order object
     */
    public LicenseOrder getLicenseOrder() {
        return this.LicenseOrder;
    }

    /**
     * Set Authorization order object
     * @param LicenseOrder Authorization order object
     */
    public void setLicenseOrder(LicenseOrder LicenseOrder) {
        this.LicenseOrder = LicenseOrder;
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
     * Get Machine Instance ID 
     * @return InstanceID Machine Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Machine Instance ID
     * @param InstanceID Machine Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public EffectiveMachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EffectiveMachineInfo(EffectiveMachineInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachinePublicIp != null) {
            this.MachinePublicIp = new String(source.MachinePublicIp);
        }
        if (source.MachinePrivateIp != null) {
            this.MachinePrivateIp = new String(source.MachinePrivateIp);
        }
        if (source.MachineTag != null) {
            this.MachineTag = new MachineTag[source.MachineTag.length];
            for (int i = 0; i < source.MachineTag.length; i++) {
                this.MachineTag[i] = new MachineTag(source.MachineTag[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        if (source.LicenseOrder != null) {
            this.LicenseOrder = new LicenseOrder(source.LicenseOrder);
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
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachinePublicIp", this.MachinePublicIp);
        this.setParamSimple(map, prefix + "MachinePrivateIp", this.MachinePrivateIp);
        this.setParamArrayObj(map, prefix + "MachineTag.", this.MachineTag);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamObj(map, prefix + "LicenseOrder.", this.LicenseOrder);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

