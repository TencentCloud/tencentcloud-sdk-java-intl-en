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

public class ModifyLogKafkaAccessRequest extends AbstractModel {

    /**
    * Instance name, e.g. CWPP test environment
    */
    @SerializedName("KafkaEnvName")
    @Expose
    private String KafkaEnvName;

    /**
    * Instance ID
    */
    @SerializedName("KafkaId")
    @Expose
    private String KafkaId;

    /**
    * Access method. 1 - public network domain name access; 2 - support environment access
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * Access address
    */
    @SerializedName("AccessAddr")
    @Expose
    private String AccessAddr;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 0 - without password; 1 - with password
    */
    @SerializedName("HasPwd")
    @Expose
    private Long HasPwd;

    /**
    * Log shipping type configuration details
    */
    @SerializedName("DeliverTypeDetails")
    @Expose
    private DeliverTypeDetails [] DeliverTypeDetails;

    /**
    * Kafka version
    */
    @SerializedName("InsVersion")
    @Expose
    private String InsVersion;

    /**
    * Region
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Availability zone
    */
    @SerializedName("Az")
    @Expose
    private String Az;

    /**
    * vpcid address
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Shipping status. 1 - healthy; 2 - alarm; 3 - abnormal
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * Peak bandwidth
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Disk capacity
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Password, AES encryption
    */
    @SerializedName("Pwd")
    @Expose
    private String Pwd;

    /**
     * Get Instance name, e.g. CWPP test environment 
     * @return KafkaEnvName Instance name, e.g. CWPP test environment
     */
    public String getKafkaEnvName() {
        return this.KafkaEnvName;
    }

    /**
     * Set Instance name, e.g. CWPP test environment
     * @param KafkaEnvName Instance name, e.g. CWPP test environment
     */
    public void setKafkaEnvName(String KafkaEnvName) {
        this.KafkaEnvName = KafkaEnvName;
    }

    /**
     * Get Instance ID 
     * @return KafkaId Instance ID
     */
    public String getKafkaId() {
        return this.KafkaId;
    }

    /**
     * Set Instance ID
     * @param KafkaId Instance ID
     */
    public void setKafkaId(String KafkaId) {
        this.KafkaId = KafkaId;
    }

    /**
     * Get Access method. 1 - public network domain name access; 2 - support environment access 
     * @return AccessType Access method. 1 - public network domain name access; 2 - support environment access
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access method. 1 - public network domain name access; 2 - support environment access
     * @param AccessType Access method. 1 - public network domain name access; 2 - support environment access
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Access address 
     * @return AccessAddr Access address
     */
    public String getAccessAddr() {
        return this.AccessAddr;
    }

    /**
     * Set Access address
     * @param AccessAddr Access address
     */
    public void setAccessAddr(String AccessAddr) {
        this.AccessAddr = AccessAddr;
    }

    /**
     * Get Username 
     * @return Username Username
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
     * @param Username Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 0 - without password; 1 - with password 
     * @return HasPwd 0 - without password; 1 - with password
     */
    public Long getHasPwd() {
        return this.HasPwd;
    }

    /**
     * Set 0 - without password; 1 - with password
     * @param HasPwd 0 - without password; 1 - with password
     */
    public void setHasPwd(Long HasPwd) {
        this.HasPwd = HasPwd;
    }

    /**
     * Get Log shipping type configuration details 
     * @return DeliverTypeDetails Log shipping type configuration details
     */
    public DeliverTypeDetails [] getDeliverTypeDetails() {
        return this.DeliverTypeDetails;
    }

    /**
     * Set Log shipping type configuration details
     * @param DeliverTypeDetails Log shipping type configuration details
     */
    public void setDeliverTypeDetails(DeliverTypeDetails [] DeliverTypeDetails) {
        this.DeliverTypeDetails = DeliverTypeDetails;
    }

    /**
     * Get Kafka version 
     * @return InsVersion Kafka version
     */
    public String getInsVersion() {
        return this.InsVersion;
    }

    /**
     * Set Kafka version
     * @param InsVersion Kafka version
     */
    public void setInsVersion(String InsVersion) {
        this.InsVersion = InsVersion;
    }

    /**
     * Get Region 
     * @return Zone Region
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region
     * @param Zone Region
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Availability zone 
     * @return Az Availability zone
     */
    public String getAz() {
        return this.Az;
    }

    /**
     * Set Availability zone
     * @param Az Availability zone
     */
    public void setAz(String Az) {
        this.Az = Az;
    }

    /**
     * Get vpcid address 
     * @return VpcId vpcid address
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcid address
     * @param VpcId vpcid address
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Shipping status. 1 - healthy; 2 - alarm; 3 - abnormal 
     * @return DeliverStatus Shipping status. 1 - healthy; 2 - alarm; 3 - abnormal
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set Shipping status. 1 - healthy; 2 - alarm; 3 - abnormal
     * @param DeliverStatus Shipping status. 1 - healthy; 2 - alarm; 3 - abnormal
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get Peak bandwidth 
     * @return BandWidth Peak bandwidth
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Peak bandwidth
     * @param BandWidth Peak bandwidth
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Disk capacity 
     * @return DiskSize Disk capacity
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk capacity
     * @param DiskSize Disk capacity
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Password, AES encryption 
     * @return Pwd Password, AES encryption
     */
    public String getPwd() {
        return this.Pwd;
    }

    /**
     * Set Password, AES encryption
     * @param Pwd Password, AES encryption
     */
    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    public ModifyLogKafkaAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogKafkaAccessRequest(ModifyLogKafkaAccessRequest source) {
        if (source.KafkaEnvName != null) {
            this.KafkaEnvName = new String(source.KafkaEnvName);
        }
        if (source.KafkaId != null) {
            this.KafkaId = new String(source.KafkaId);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AccessAddr != null) {
            this.AccessAddr = new String(source.AccessAddr);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.HasPwd != null) {
            this.HasPwd = new Long(source.HasPwd);
        }
        if (source.DeliverTypeDetails != null) {
            this.DeliverTypeDetails = new DeliverTypeDetails[source.DeliverTypeDetails.length];
            for (int i = 0; i < source.DeliverTypeDetails.length; i++) {
                this.DeliverTypeDetails[i] = new DeliverTypeDetails(source.DeliverTypeDetails[i]);
            }
        }
        if (source.InsVersion != null) {
            this.InsVersion = new String(source.InsVersion);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Az != null) {
            this.Az = new String(source.Az);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new Long(source.DeliverStatus);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Pwd != null) {
            this.Pwd = new String(source.Pwd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaEnvName", this.KafkaEnvName);
        this.setParamSimple(map, prefix + "KafkaId", this.KafkaId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccessAddr", this.AccessAddr);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "HasPwd", this.HasPwd);
        this.setParamArrayObj(map, prefix + "DeliverTypeDetails.", this.DeliverTypeDetails);
        this.setParamSimple(map, prefix + "InsVersion", this.InsVersion);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Az", this.Az);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Pwd", this.Pwd);

    }
}

