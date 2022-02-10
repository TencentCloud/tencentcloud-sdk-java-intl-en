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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyGroupRequest extends AbstractModel{

    /**
    * Project ID of connection group
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Alias of connection group
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Origin server region; Reference API: DescribeDestRegions; It returnes the `RegionId` of the parameter `RegionDetail`.
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * Tag list
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * List of acceleration regions, including their names, bandwidth, and concurrence configuration.
    */
    @SerializedName("AccessRegionSet")
    @Expose
    private AccessConfiguration [] AccessRegionSet;

    /**
    * IP version. Valid values: `IPv4` (default), `IPv6`.
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * Package type of connection group. Valid values: `Thunder` (default) and `Accelerator`.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note that if HTTP3 is enabled for a connection, TCP/UDP access will not be allowed.
After the connection is created, you cannot change your HTTP3 setting.
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get Project ID of connection group 
     * @return ProjectId Project ID of connection group
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of connection group
     * @param ProjectId Project ID of connection group
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Alias of connection group 
     * @return GroupName Alias of connection group
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Alias of connection group
     * @param GroupName Alias of connection group
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Origin server region; Reference API: DescribeDestRegions; It returnes the `RegionId` of the parameter `RegionDetail`. 
     * @return RealServerRegion Origin server region; Reference API: DescribeDestRegions; It returnes the `RegionId` of the parameter `RegionDetail`.
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set Origin server region; Reference API: DescribeDestRegions; It returnes the `RegionId` of the parameter `RegionDetail`.
     * @param RealServerRegion Origin server region; Reference API: DescribeDestRegions; It returnes the `RegionId` of the parameter `RegionDetail`.
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get Tag list 
     * @return TagSet Tag list
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list
     * @param TagSet Tag list
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get List of acceleration regions, including their names, bandwidth, and concurrence configuration. 
     * @return AccessRegionSet List of acceleration regions, including their names, bandwidth, and concurrence configuration.
     */
    public AccessConfiguration [] getAccessRegionSet() {
        return this.AccessRegionSet;
    }

    /**
     * Set List of acceleration regions, including their names, bandwidth, and concurrence configuration.
     * @param AccessRegionSet List of acceleration regions, including their names, bandwidth, and concurrence configuration.
     */
    public void setAccessRegionSet(AccessConfiguration [] AccessRegionSet) {
        this.AccessRegionSet = AccessRegionSet;
    }

    /**
     * Get IP version. Valid values: `IPv4` (default), `IPv6`. 
     * @return IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP version. Valid values: `IPv4` (default), `IPv6`.
     * @param IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get Package type of connection group. Valid values: `Thunder` (default) and `Accelerator`. 
     * @return PackageType Package type of connection group. Valid values: `Thunder` (default) and `Accelerator`.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Package type of connection group. Valid values: `Thunder` (default) and `Accelerator`.
     * @param PackageType Package type of connection group. Valid values: `Thunder` (default) and `Accelerator`.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note that if HTTP3 is enabled for a connection, TCP/UDP access will not be allowed.
After the connection is created, you cannot change your HTTP3 setting. 
     * @return Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note that if HTTP3 is enabled for a connection, TCP/UDP access will not be allowed.
After the connection is created, you cannot change your HTTP3 setting.
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note that if HTTP3 is enabled for a connection, TCP/UDP access will not be allowed.
After the connection is created, you cannot change your HTTP3 setting.
     * @param Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
Note that if HTTP3 is enabled for a connection, TCP/UDP access will not be allowed.
After the connection is created, you cannot change your HTTP3 setting.
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public CreateProxyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyGroupRequest(CreateProxyGroupRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.AccessRegionSet != null) {
            this.AccessRegionSet = new AccessConfiguration[source.AccessRegionSet.length];
            for (int i = 0; i < source.AccessRegionSet.length; i++) {
                this.AccessRegionSet[i] = new AccessConfiguration(source.AccessRegionSet[i]);
            }
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "AccessRegionSet.", this.AccessRegionSet);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

