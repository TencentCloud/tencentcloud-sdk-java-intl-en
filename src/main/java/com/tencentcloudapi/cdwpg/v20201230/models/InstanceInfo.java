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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Kernel version type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Cluster status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cluster status details.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Cluster status information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceStateInfo")
    @Expose
    private InstanceStateInfo InstanceStateInfo;

    /**
    * Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Region.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Region details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * Region details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * Tag.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Kernel version.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Character set.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * CN node list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CNNodes")
    @Expose
    private InstanceNodeGroup [] CNNodes;

    /**
    * DN node list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DNNodes")
    @Expose
    private InstanceNodeGroup [] DNNodes;

    /**
    * Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Expiration time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Automatic renewal.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Access information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessDetails")
    @Expose
    private AccessInfo [] AccessDetails;

    /**
     * Get Instance ID 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Kernel version type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Kernel version type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Kernel version type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Kernel version type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Cluster name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Cluster status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Cluster status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Cluster status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Cluster status details.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusDesc Cluster status details.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Cluster status details.Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusDesc Cluster status details.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Cluster status information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceStateInfo Cluster status information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceStateInfo getInstanceStateInfo() {
        return this.InstanceStateInfo;
    }

    /**
     * Set Cluster status information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceStateInfo Cluster status information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceStateInfo(InstanceStateInfo InstanceStateInfo) {
        this.InstanceStateInfo = InstanceStateInfo;
    }

    /**
     * Get Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceID Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceID Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Creation time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Region.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Region details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionDesc Region details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set Region details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionDesc Region details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get Region details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneDesc Region details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set Region details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneDesc Region details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get Tag.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Kernel version.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Kernel version.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Kernel version.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Kernel version.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Character set.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Charset Character set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Character set.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Charset Character set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get CN node list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CNNodes CN node list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNodeGroup [] getCNNodes() {
        return this.CNNodes;
    }

    /**
     * Set CN node list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CNNodes CN node list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCNNodes(InstanceNodeGroup [] CNNodes) {
        this.CNNodes = CNNodes;
    }

    /**
     * Get DN node list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DNNodes DN node list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNodeGroup [] getDNNodes() {
        return this.DNNodes;
    }

    /**
     * Set DN node list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DNNodes DN node list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDNNodes(InstanceNodeGroup [] DNNodes) {
        this.DNNodes = DNNodes;
    }

    /**
     * Get Region ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneId Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Expiration time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Billing mode.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Automatic renewal.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Automatic renewal.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Automatic renewal.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Automatic renewal.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Access information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessDetails Access information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccessInfo [] getAccessDetails() {
        return this.AccessDetails;
    }

    /**
     * Set Access information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessDetails Access information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessDetails(AccessInfo [] AccessDetails) {
        this.AccessDetails = AccessDetails;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.InstanceStateInfo != null) {
            this.InstanceStateInfo = new InstanceStateInfo(source.InstanceStateInfo);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.RegionDesc != null) {
            this.RegionDesc = new String(source.RegionDesc);
        }
        if (source.ZoneDesc != null) {
            this.ZoneDesc = new String(source.ZoneDesc);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CNNodes != null) {
            this.CNNodes = new InstanceNodeGroup[source.CNNodes.length];
            for (int i = 0; i < source.CNNodes.length; i++) {
                this.CNNodes[i] = new InstanceNodeGroup(source.CNNodes[i]);
            }
        }
        if (source.DNNodes != null) {
            this.DNNodes = new InstanceNodeGroup[source.DNNodes.length];
            for (int i = 0; i < source.DNNodes.length; i++) {
                this.DNNodes[i] = new InstanceNodeGroup(source.DNNodes[i]);
            }
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccessDetails != null) {
            this.AccessDetails = new AccessInfo[source.AccessDetails.length];
            for (int i = 0; i < source.AccessDetails.length; i++) {
                this.AccessDetails[i] = new AccessInfo(source.AccessDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamObj(map, prefix + "InstanceStateInfo.", this.InstanceStateInfo);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RegionDesc", this.RegionDesc);
        this.setParamSimple(map, prefix + "ZoneDesc", this.ZoneDesc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamArrayObj(map, prefix + "CNNodes.", this.CNNodes);
        this.setParamArrayObj(map, prefix + "DNNodes.", this.DNNodes);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "AccessDetails.", this.AccessDetails);

    }
}

