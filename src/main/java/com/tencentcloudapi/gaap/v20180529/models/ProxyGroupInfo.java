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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel {

    /**
    * Connection group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Target region
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * Connection group status.
Where:
`RUNNING`: Running
`CREATING`: Creating
`DESTROYING`: Terminating
`MOVING`: Migrating
`CHANGING`: Deploying
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Tag list.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * Connection group version
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Whether the connection group contains a Microsoft connection
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyType")
    @Expose
    private Long ProxyType;

    /**
    * Specifies whether to enable HTTP3. Valid values:
`0`: Disable
`1`: Enable
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
    * Feature bitmap. Valid values:
`0`: Feature not supported
`1`: Feature supported
Each bit in the bitmap represents a feature:
1st bit: Layer-4 acceleration;
2nd bit: Layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: Dedicated BGP access;
6th bit: Non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FeatureBitmap")
    @Expose
    private Long FeatureBitmap;

    /**
     * Get Connection group ID 
     * @return GroupId Connection group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID
     * @param GroupId Connection group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Connection group name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName Connection group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
     * Get Target region 
     * @return RealServerRegionInfo Target region
     */
    public RegionDetail getRealServerRegionInfo() {
        return this.RealServerRegionInfo;
    }

    /**
     * Set Target region
     * @param RealServerRegionInfo Target region
     */
    public void setRealServerRegionInfo(RegionDetail RealServerRegionInfo) {
        this.RealServerRegionInfo = RealServerRegionInfo;
    }

    /**
     * Get Connection group status.
Where:
`RUNNING`: Running
`CREATING`: Creating
`DESTROYING`: Terminating
`MOVING`: Migrating
`CHANGING`: Deploying 
     * @return Status Connection group status.
Where:
`RUNNING`: Running
`CREATING`: Creating
`DESTROYING`: Terminating
`MOVING`: Migrating
`CHANGING`: Deploying
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Connection group status.
Where:
`RUNNING`: Running
`CREATING`: Creating
`DESTROYING`: Terminating
`MOVING`: Migrating
`CHANGING`: Deploying
     * @param Status Connection group status.
Where:
`RUNNING`: Running
`CREATING`: Creating
`DESTROYING`: Terminating
`MOVING`: Migrating
`CHANGING`: Deploying
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Tag list. 
     * @return TagSet Tag list.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list.
     * @param TagSet Tag list.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Connection group version
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Version Connection group version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Connection group version
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Version Connection group version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether the connection group contains a Microsoft connection
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProxyType Whether the connection group contains a Microsoft connection
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set Whether the connection group contains a Microsoft connection
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProxyType Whether the connection group contains a Microsoft connection
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyType(Long ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get Specifies whether to enable HTTP3. Valid values:
`0`: Disable
`1`: Enable
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: Disable
`1`: Enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set Specifies whether to enable HTTP3. Valid values:
`0`: Disable
`1`: Enable
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: Disable
`1`: Enable
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    /**
     * Get Feature bitmap. Valid values:
`0`: Feature not supported
`1`: Feature supported
Each bit in the bitmap represents a feature:
1st bit: Layer-4 acceleration;
2nd bit: Layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: Dedicated BGP access;
6th bit: Non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FeatureBitmap Feature bitmap. Valid values:
`0`: Feature not supported
`1`: Feature supported
Each bit in the bitmap represents a feature:
1st bit: Layer-4 acceleration;
2nd bit: Layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: Dedicated BGP access;
6th bit: Non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getFeatureBitmap() {
        return this.FeatureBitmap;
    }

    /**
     * Set Feature bitmap. Valid values:
`0`: Feature not supported
`1`: Feature supported
Each bit in the bitmap represents a feature:
1st bit: Layer-4 acceleration;
2nd bit: Layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: Dedicated BGP access;
6th bit: Non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FeatureBitmap Feature bitmap. Valid values:
`0`: Feature not supported
`1`: Feature supported
Each bit in the bitmap represents a feature:
1st bit: Layer-4 acceleration;
2nd bit: Layer-7 acceleration;
3rd bit: HTTP3 access;
4th bit: IPv6;
5th bit: Dedicated BGP access;
6th bit: Non-BGP access;
7th bit: QoS acceleration.
Note: this field may return `null`, indicating that no valid values can be obtained.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFeatureBitmap(Long FeatureBitmap) {
        this.FeatureBitmap = FeatureBitmap;
    }

    public ProxyGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupInfo(ProxyGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RealServerRegionInfo != null) {
            this.RealServerRegionInfo = new RegionDetail(source.RealServerRegionInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new Long(source.ProxyType);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
        if (source.FeatureBitmap != null) {
            this.FeatureBitmap = new Long(source.FeatureBitmap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);
        this.setParamSimple(map, prefix + "FeatureBitmap", this.FeatureBitmap);

    }
}

