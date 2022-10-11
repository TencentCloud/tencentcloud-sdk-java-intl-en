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

public class CreateProxyRequest extends AbstractModel{

    /**
    * Project ID of connection.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Name of the connection
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * Access region.
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * Connection bandwidth cap. Unit: Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * Origin server region. If GroupId exists, the origin server region is the one of connection group, and this field is not required. If GroupId does not exist, this field is reuqired.
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Connection group ID. This parameter is required when the connection is created in the connection group. Otherwise, this field is ignored.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * List of tags to be added for connection.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * ID of the replicated connection. Only a running connection can be replicated.
The connection is to be replicated if this parameter is set.
    */
    @SerializedName("ClonedProxyId")
    @Expose
    private String ClonedProxyId;

    /**
    * Billing mode (0: bill-by-bandwidth, 1: bill-by-traffic. Default value: bill-by-bandwidth)
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * IP version. Valid values: `IPv4` (default), `IPv6`.
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * (Disused) HTTP3.0 is supported by default when `IPAddressVersion` is `IPv4`.
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get Project ID of connection. 
     * @return ProjectId Project ID of connection.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of connection.
     * @param ProjectId Project ID of connection.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Name of the connection 
     * @return ProxyName Name of the connection
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Name of the connection
     * @param ProxyName Name of the connection
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get Access region. 
     * @return AccessRegion Access region.
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set Access region.
     * @param AccessRegion Access region.
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get Connection bandwidth cap. Unit: Mbps. 
     * @return Bandwidth Connection bandwidth cap. Unit: Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Connection bandwidth cap. Unit: Mbps.
     * @param Bandwidth Connection bandwidth cap. Unit: Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections. 
     * @return Concurrent Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
     * @param Concurrent Connection concurrence cap, which indicates the maximum number of simultaneous online connections. Unit: 10,000 connections.
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get Origin server region. If GroupId exists, the origin server region is the one of connection group, and this field is not required. If GroupId does not exist, this field is reuqired. 
     * @return RealServerRegion Origin server region. If GroupId exists, the origin server region is the one of connection group, and this field is not required. If GroupId does not exist, this field is reuqired.
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set Origin server region. If GroupId exists, the origin server region is the one of connection group, and this field is not required. If GroupId does not exist, this field is reuqired.
     * @param RealServerRegion Origin server region. If GroupId exists, the origin server region is the one of connection group, and this field is not required. If GroupId does not exist, this field is reuqired.
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence. 
     * @return ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     * @param ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Connection group ID. This parameter is required when the connection is created in the connection group. Otherwise, this field is ignored. 
     * @return GroupId Connection group ID. This parameter is required when the connection is created in the connection group. Otherwise, this field is ignored.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID. This parameter is required when the connection is created in the connection group. Otherwise, this field is ignored.
     * @param GroupId Connection group ID. This parameter is required when the connection is created in the connection group. Otherwise, this field is ignored.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get List of tags to be added for connection. 
     * @return TagSet List of tags to be added for connection.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set List of tags to be added for connection.
     * @param TagSet List of tags to be added for connection.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get ID of the replicated connection. Only a running connection can be replicated.
The connection is to be replicated if this parameter is set. 
     * @return ClonedProxyId ID of the replicated connection. Only a running connection can be replicated.
The connection is to be replicated if this parameter is set.
     */
    public String getClonedProxyId() {
        return this.ClonedProxyId;
    }

    /**
     * Set ID of the replicated connection. Only a running connection can be replicated.
The connection is to be replicated if this parameter is set.
     * @param ClonedProxyId ID of the replicated connection. Only a running connection can be replicated.
The connection is to be replicated if this parameter is set.
     */
    public void setClonedProxyId(String ClonedProxyId) {
        this.ClonedProxyId = ClonedProxyId;
    }

    /**
     * Get Billing mode (0: bill-by-bandwidth, 1: bill-by-traffic. Default value: bill-by-bandwidth) 
     * @return BillingType Billing mode (0: bill-by-bandwidth, 1: bill-by-traffic. Default value: bill-by-bandwidth)
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set Billing mode (0: bill-by-bandwidth, 1: bill-by-traffic. Default value: bill-by-bandwidth)
     * @param BillingType Billing mode (0: bill-by-bandwidth, 1: bill-by-traffic. Default value: bill-by-bandwidth)
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
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
     * Get Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland). 
     * @return NetworkType Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
     * @param NetworkType Network type. `normal`: general BGP; `cn2`: dedicated BGP; `triple`: Non-BGP (provided by the top 3 ISPs in the Chinese mainland).
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection). 
     * @return PackageType Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
     * @param PackageType Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get (Disused) HTTP3.0 is supported by default when `IPAddressVersion` is `IPv4`. 
     * @return Http3Supported (Disused) HTTP3.0 is supported by default when `IPAddressVersion` is `IPv4`.
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set (Disused) HTTP3.0 is supported by default when `IPAddressVersion` is `IPv4`.
     * @param Http3Supported (Disused) HTTP3.0 is supported by default when `IPAddressVersion` is `IPv4`.
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public CreateProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyRequest(CreateProxyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
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
        if (source.ClonedProxyId != null) {
            this.ClonedProxyId = new String(source.ClonedProxyId);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
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
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "ClonedProxyId", this.ClonedProxyId);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

