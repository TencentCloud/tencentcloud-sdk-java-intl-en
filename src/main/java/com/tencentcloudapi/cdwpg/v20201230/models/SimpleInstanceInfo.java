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

public class SimpleInstanceInfo extends AbstractModel {

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
    * Zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * User VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserVPCID")
    @Expose
    private String UserVPCID;

    /**
    * User Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserSubnetID")
    @Expose
    private String UserSubnetID;

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
    * Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Charge Properties
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * Resources
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo [] Resources;

    /**
    * Tags
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get User VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserVPCID User VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserVPCID() {
        return this.UserVPCID;
    }

    /**
     * Set User VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserVPCID User VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserVPCID(String UserVPCID) {
        this.UserVPCID = UserVPCID;
    }

    /**
     * Get User Subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserSubnetID User Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserSubnetID() {
        return this.UserSubnetID;
    }

    /**
     * Set User Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserSubnetID User Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserSubnetID(String UserSubnetID) {
        this.UserSubnetID = UserSubnetID;
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
     * Get Renew Flag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renew Flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Charge Properties
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeProperties Charge Properties
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set Charge Properties
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeProperties Charge Properties
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get Resources
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resources Resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceInfo [] getResources() {
        return this.Resources;
    }

    /**
     * Set Resources
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resources Resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResources(ResourceInfo [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Tags
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SimpleInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleInstanceInfo(SimpleInstanceInfo source) {
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
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UserVPCID != null) {
            this.UserVPCID = new String(source.UserVPCID);
        }
        if (source.UserSubnetID != null) {
            this.UserSubnetID = new String(source.UserSubnetID);
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
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceInfo[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceInfo(source.Resources[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UserVPCID", this.UserVPCID);
        this.setParamSimple(map, prefix + "UserSubnetID", this.UserSubnetID);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

