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

public class SimpleInstanceInfo extends AbstractModel {

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
    * Region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserVPCID")
    @Expose
    private String UserVPCID;

    /**
    * Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserSubnetID")
    @Expose
    private String UserSubnetID;

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
    * Automatic renewal switch. 0 indicates automatic renewal is not enabled, and 1 indicates automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * Resource collection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo [] Resources;

    /**
    * Tag list.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Cluster status.
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
     * Get Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserVPCID Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserVPCID() {
        return this.UserVPCID;
    }

    /**
     * Set Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserVPCID Virtual Private Cloud (VPC).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserVPCID(String UserVPCID) {
        this.UserVPCID = UserVPCID;
    }

    /**
     * Get Subnet.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserSubnetID Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserSubnetID() {
        return this.UserSubnetID;
    }

    /**
     * Set Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserSubnetID Subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserSubnetID(String UserSubnetID) {
        this.UserSubnetID = UserSubnetID;
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
     * Get Automatic renewal switch. 0 indicates automatic renewal is not enabled, and 1 indicates automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Automatic renewal switch. 0 indicates automatic renewal is not enabled, and 1 indicates automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Automatic renewal switch. 0 indicates automatic renewal is not enabled, and 1 indicates automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Automatic renewal switch. 0 indicates automatic renewal is not enabled, and 1 indicates automatic renewal is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Billing mode.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeProperties Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeProperties Billing mode.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get Resource collection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resources Resource collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceInfo [] getResources() {
        return this.Resources;
    }

    /**
     * Set Resource collection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resources Resource collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResources(ResourceInfo [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Tag list.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag list.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag list.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Cluster status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Cluster status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Cluster status.
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

