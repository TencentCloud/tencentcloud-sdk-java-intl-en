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
    * Instance Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region Desc
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * Zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Zone Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Zone Desc
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

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
    * CreateTime
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * ExpireTime
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Access Infomation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

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
     * Get Instance Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region Desc
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionDesc Region Desc
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set Region Desc
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionDesc Region Desc
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get Zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get Zone Desc
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneDesc Zone Desc
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set Zone Desc
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneDesc Zone Desc
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
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
     * Get CreateTime
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CreateTime
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CreateTime
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get ExpireTime
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime ExpireTime
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set ExpireTime
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime ExpireTime
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Access Infomation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessInfo Access Infomation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set Access Infomation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessInfo Access Infomation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
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

