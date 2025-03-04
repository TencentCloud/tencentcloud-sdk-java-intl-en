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
    * cn/dn or others.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance Name
.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance Status ,such as  2
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance Status  Description ,such as Running.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Instance State Infomation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceStateInfo")
    @Expose
    private InstanceStateInfo InstanceStateInfo;

    /**
    * Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * CreateTime ,such as 2022-09-05 20:00:01
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Region ,such as ap-chongqing.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Zone : This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Region.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * Zone.Note: This field may return null, indicating that no valid values can be obtained.
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
    * Version.Note: This field may return null, indicating that no valid values can be obtained.
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
    *  Region Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Zone Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Expire Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Pay Mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * Instance Id
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
     * Get cn/dn or others.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType cn/dn or others.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set cn/dn or others.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType cn/dn or others.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance Name
.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance Name
.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance Name
.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance Name
.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance Status ,such as  2
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance Status ,such as  2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance Status ,such as  2
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Instance Status ,such as  2
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance Status  Description ,such as Running.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusDesc Instance Status  Description ,such as Running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Instance Status  Description ,such as Running.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusDesc Instance Status  Description ,such as Running.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Instance State Infomation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceStateInfo Instance State Infomation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceStateInfo getInstanceStateInfo() {
        return this.InstanceStateInfo;
    }

    /**
     * Set Instance State Infomation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceStateInfo Instance State Infomation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceStateInfo(InstanceStateInfo InstanceStateInfo) {
        this.InstanceStateInfo = InstanceStateInfo;
    }

    /**
     * Get Instance ID 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceID Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceID Instance ID 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get CreateTime ,such as 2022-09-05 20:00:01
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CreateTime ,such as 2022-09-05 20:00:01
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime ,such as 2022-09-05 20:00:01
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CreateTime ,such as 2022-09-05 20:00:01
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Region ,such as ap-chongqing.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region ,such as ap-chongqing.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region ,such as ap-chongqing.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region ,such as ap-chongqing.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Zone : This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Zone : This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Zone : This field may return null, indicating that no valid values can be obtained.
     * @param Zone Zone : This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Region.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionDesc Region.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set Region.Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionDesc Region.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get Zone.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneDesc Zone.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set Zone.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneDesc Zone.Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Version.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Version.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Version.Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get  Region Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId  Region Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set  Region Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId  Region Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Zone Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId Zone Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneId Zone Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Vpc Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId Vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId Vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Expire Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expire Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expire Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expire Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Pay Mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Pay Mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Pay Mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode Pay Mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Renew Flag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Instance Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance Id
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

