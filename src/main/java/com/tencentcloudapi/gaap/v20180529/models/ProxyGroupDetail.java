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

public class ProxyGroupDetail extends AbstractModel{

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Number of connections in connection group
    */
    @SerializedName("ProxyNum")
    @Expose
    private Long ProxyNum;

    /**
    * Connection group status:
0: running normally;
1: creating;
4: terminating;
11: migrating;
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Owner UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Creation UIN
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * Connection name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Default IP of domain name resolution for connection groups
    */
    @SerializedName("DnsDefaultIp")
    @Expose
    private String DnsDefaultIp;

    /**
    * Connection group domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Target region
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * Whether it is an old connection group, i.e., those created before August 3, 2018.
    */
    @SerializedName("IsOldGroup")
    @Expose
    private Boolean IsOldGroup;

    /**
    * Connection group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Tag list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * Security policy ID. This field exists if security policies are set.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Connection group version
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIPMethod")
    @Expose
    private Long [] ClientIPMethod;

    /**
    * IP version. Valid values: `IPv4` (default), `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * Package type of connection groups. Valid values: `Thunder` (general connection group), `Accelerator` (game accelerator connection group), and `CrossBorder` (cross-MLC-border connection group).
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Specifies whether to enable HTTP3. Valid values:
`0`: disable;
`1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get Number of connections in connection group 
     * @return ProxyNum Number of connections in connection group
     */
    public Long getProxyNum() {
        return this.ProxyNum;
    }

    /**
     * Set Number of connections in connection group
     * @param ProxyNum Number of connections in connection group
     */
    public void setProxyNum(Long ProxyNum) {
        this.ProxyNum = ProxyNum;
    }

    /**
     * Get Connection group status:
0: running normally;
1: creating;
4: terminating;
11: migrating; 
     * @return Status Connection group status:
0: running normally;
1: creating;
4: terminating;
11: migrating;
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Connection group status:
0: running normally;
1: creating;
4: terminating;
11: migrating;
     * @param Status Connection group status:
0: running normally;
1: creating;
4: terminating;
11: migrating;
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Owner UIN 
     * @return OwnerUin Owner UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner UIN
     * @param OwnerUin Owner UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creation UIN 
     * @return CreateUin Creation UIN
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creation UIN
     * @param CreateUin Creation UIN
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Connection name 
     * @return GroupName Connection name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Connection name
     * @param GroupName Connection name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Default IP of domain name resolution for connection groups 
     * @return DnsDefaultIp Default IP of domain name resolution for connection groups
     */
    public String getDnsDefaultIp() {
        return this.DnsDefaultIp;
    }

    /**
     * Set Default IP of domain name resolution for connection groups
     * @param DnsDefaultIp Default IP of domain name resolution for connection groups
     */
    public void setDnsDefaultIp(String DnsDefaultIp) {
        this.DnsDefaultIp = DnsDefaultIp;
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
     * Get Whether it is an old connection group, i.e., those created before August 3, 2018. 
     * @return IsOldGroup Whether it is an old connection group, i.e., those created before August 3, 2018.
     */
    public Boolean getIsOldGroup() {
        return this.IsOldGroup;
    }

    /**
     * Set Whether it is an old connection group, i.e., those created before August 3, 2018.
     * @param IsOldGroup Whether it is an old connection group, i.e., those created before August 3, 2018.
     */
    public void setIsOldGroup(Boolean IsOldGroup) {
        this.IsOldGroup = IsOldGroup;
    }

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
     * Get Tag list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Security policy ID. This field exists if security policies are set.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PolicyId Security policy ID. This field exists if security policies are set.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Security policy ID. This field exists if security policies are set.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PolicyId Security policy ID. This field exists if security policies are set.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Connection group version
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Version Connection group version
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Connection group version
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Version Connection group version
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClientIPMethod Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getClientIPMethod() {
        return this.ClientIPMethod;
    }

    /**
     * Set Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClientIPMethod Describes how the connection obtains client IPs. 0: TOA; 1: Proxy Protocol.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClientIPMethod(Long [] ClientIPMethod) {
        this.ClientIPMethod = ClientIPMethod;
    }

    /**
     * Get IP version. Valid values: `IPv4` (default), `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP version. Valid values: `IPv4` (default), `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get Package type of connection groups. Valid values: `Thunder` (general connection group), `Accelerator` (game accelerator connection group), and `CrossBorder` (cross-MLC-border connection group).
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PackageType Package type of connection groups. Valid values: `Thunder` (general connection group), `Accelerator` (game accelerator connection group), and `CrossBorder` (cross-MLC-border connection group).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Package type of connection groups. Valid values: `Thunder` (general connection group), `Accelerator` (game accelerator connection group), and `CrossBorder` (cross-MLC-border connection group).
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PackageType Package type of connection groups. Valid values: `Thunder` (general connection group), `Accelerator` (game accelerator connection group), and `CrossBorder` (cross-MLC-border connection group).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Specifies whether to enable HTTP3. Valid values:
`0`: disable;
`1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable;
`1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set Specifies whether to enable HTTP3. Valid values:
`0`: disable;
`1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable;
`1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public ProxyGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupDetail(ProxyGroupDetail source) {
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProxyNum != null) {
            this.ProxyNum = new Long(source.ProxyNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.DnsDefaultIp != null) {
            this.DnsDefaultIp = new String(source.DnsDefaultIp);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RealServerRegionInfo != null) {
            this.RealServerRegionInfo = new RegionDetail(source.RealServerRegionInfo);
        }
        if (source.IsOldGroup != null) {
            this.IsOldGroup = new Boolean(source.IsOldGroup);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ClientIPMethod != null) {
            this.ClientIPMethod = new Long[source.ClientIPMethod.length];
            for (int i = 0; i < source.ClientIPMethod.length; i++) {
                this.ClientIPMethod[i] = new Long(source.ClientIPMethod[i]);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProxyNum", this.ProxyNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "DnsDefaultIp", this.DnsDefaultIp);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "IsOldGroup", this.IsOldGroup);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "ClientIPMethod.", this.ClientIPMethod);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

