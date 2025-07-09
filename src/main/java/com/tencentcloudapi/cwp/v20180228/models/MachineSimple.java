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

public class MachineSimple extends AbstractModel {

    /**
    * Host name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Host System.
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * CVM or BM Machine Unique UUID.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * Public IP address of the host
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Tag information
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Region information
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * Instance status. TERMINATED_PRO_VERSION: terminated.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Kernel version
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * Protection Edition. BASIC_VERSION: Basic Edition; PRO_VERSION: Professional Edition; Flagship: Premium Edition; GENERAL_DISCOUNT: General Discount Edition
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * Authorization order object
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseOrder")
    @Expose
    private LicenseOrder LicenseOrder;

    /**
    * Cloud Tag Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Host name. 
     * @return MachineName Host name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name.
     * @param MachineName Host name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Host System. 
     * @return MachineOs Host System.
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set Host System.
     * @param MachineOs Host System.
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get Yunjing client UUID. If the client is offline for a long time, an empty string is returned. 
     * @return Uuid Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
     * @param Uuid Yunjing client UUID. If the client is offline for a long time, an empty string is returned.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get CVM or BM Machine Unique UUID. 
     * @return Quuid CVM or BM Machine Unique UUID.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM or BM Machine Unique UUID.
     * @param Quuid CVM or BM Machine Unique UUID.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host IP. 
     * @return MachineIp Host IP.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Host IP.
     * @param MachineIp Host IP.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li> 
     * @return IsProVersion Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
     * @param IsProVersion Whether the edition is Pro Edition
<li>true: yes</li>
<li>false: no</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get Public IP address of the host 
     * @return MachineWanIp Public IP address of the host
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address of the host
     * @param MachineWanIp Public IP address of the host
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li> 
     * @return PayMode Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
     * @param PayMode Host status
<li>POSTPAY: postpaid, indicating pay-as-you-go mode </li>
<li>PREPAY: prepaid, indicating monthly subscription mode</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Tag information 
     * @return Tag Tag information
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag information
     * @param Tag Tag information
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Region information 
     * @return RegionInfo Region information
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set Region information
     * @param RegionInfo Region information
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get Instance status. TERMINATED_PRO_VERSION: terminated. 
     * @return InstanceState Instance status. TERMINATED_PRO_VERSION: terminated.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status. TERMINATED_PRO_VERSION: terminated.
     * @param InstanceState Instance status. TERMINATED_PRO_VERSION: terminated.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone 
     * @return MachineType Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     * @param MachineType Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Kernel version 
     * @return KernelVersion Kernel version
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set Kernel version
     * @param KernelVersion Kernel version
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get Protection Edition. BASIC_VERSION: Basic Edition; PRO_VERSION: Professional Edition; Flagship: Premium Edition; GENERAL_DISCOUNT: General Discount Edition 
     * @return ProtectType Protection Edition. BASIC_VERSION: Basic Edition; PRO_VERSION: Professional Edition; Flagship: Premium Edition; GENERAL_DISCOUNT: General Discount Edition
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set Protection Edition. BASIC_VERSION: Basic Edition; PRO_VERSION: Professional Edition; Flagship: Premium Edition; GENERAL_DISCOUNT: General Discount Edition
     * @param ProtectType Protection Edition. BASIC_VERSION: Basic Edition; PRO_VERSION: Professional Edition; Flagship: Premium Edition; GENERAL_DISCOUNT: General Discount Edition
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get Authorization order object
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseOrder Authorization order object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LicenseOrder getLicenseOrder() {
        return this.LicenseOrder;
    }

    /**
     * Set Authorization order object
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseOrder Authorization order object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseOrder(LicenseOrder LicenseOrder) {
        this.LicenseOrder = LicenseOrder;
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
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public MachineSimple() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineSimple(MachineSimple source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.LicenseOrder != null) {
            this.LicenseOrder = new LicenseOrder(source.LicenseOrder);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamObj(map, prefix + "LicenseOrder.", this.LicenseOrder);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

