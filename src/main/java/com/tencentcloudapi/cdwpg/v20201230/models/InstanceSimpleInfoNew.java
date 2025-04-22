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

public class InstanceSimpleInfoNew extends AbstractModel {

    /**
    * ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Cluster ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Kernel version.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Region.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * Region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Region ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Region details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

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
    * Start time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Access address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

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
     * Get ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
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
     * Get Start time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Start time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Start time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Start time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get Access address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessInfo Access address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set Access address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessInfo Access address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
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

    public InstanceSimpleInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSimpleInfoNew(InstanceSimpleInfoNew source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionDesc != null) {
            this.RegionDesc = new String(source.RegionDesc);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneDesc != null) {
            this.ZoneDesc = new String(source.ZoneDesc);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionDesc", this.RegionDesc);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneDesc", this.ZoneDesc);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

