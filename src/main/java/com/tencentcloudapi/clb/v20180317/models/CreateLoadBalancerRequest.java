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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * CLB instance network type:
OPEN: public network; INTERNAL: private network.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB instance type. Valid value: 1 (generic CLB instance).
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * CLB instance name, which takes effect only when only one instance is to be created in the request. It can consist 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Network ID of the target device on the CLB backend, such as `vpc-12345678`, which can be obtained through the `DescribeVpcEx` API. If this parameter is not entered, `DefaultVPC` is used by default. This parameter is required when creating a private network instance.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet. This parameter is required for creating a CLB instance.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not entered, the default project will be used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * It's only applicable to public network CLB instances. IP version. Values: `IPV4`, `IPV6` and `IPv6FullChain` (case-insensitive). Default: `IPV4`. Note: `IPV6` indicates IPv6 NAT64, while `IPv6FullChain` indicates IPv6. 
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * Number of CLBs to be created. Default value: 1.
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * ID of the primary AZ for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It's only available to public CLB instances. 
Note: The traffic only goes to the primary AZ in normal cases. The secondary AZ is used only when the primary AZ is unavailable. To query the list of primary AZs in a region, use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * Specifies an AZ ID for creating a CLB instance, such as `ap-guangzhou-1`, which is applicable only to public network CLB instances.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * It only works on LCU-supported instances on private networks and all instances on public networks.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * Tags the CLB instance when purchasing it. Up to 20 tag key value pairs are supported.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Specifies the VIP for the application of a CLB instance. This parameter is optional. If you do not specify this parameter, the system automatically assigns a value for the parameter. IPv4 and IPv6 CLB instances support this parameter, but IPv6 NAT64 CLB instances do not.
Note: If the specified VIP is occupied or is not within the IP range of the specified VPC subnet, you cannot use the VIP to create a CLB instance in a private network or an IPv6 BGP CLB instance in a public network.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Bandwidth package ID. If this parameter is specified, the network billing mode (`InternetAccessible.InternetChargeType`) will only support bill-by-bandwidth package (`BANDWIDTH_PACKAGE`).
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Information about the dedicated CLB instance. You must specify this parameter when you create a dedicated CLB instance in a private network.
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * Specification of LCU-supported instance.
<ul><li>This parameter is required to create LCU-supported instances. Values: <ul><li>`SLA`: Super Large 4. When you have activated Super Large models, `SLA` refers to Super Large 4.</li><li>`clb.c2.medium`: Standard</li><li>`clb.c3.small`: Advanced 1</li><li>`clb.c3.medium`: Advanced 1</li><li>`clb.c4.small`: Super Large 1</li><li>`clb.c4.medium`: Super Large 2</li><li>`clb.c4.large`: Super Large 3</li><li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above models, please [submit a ticket](https://console.cloud.tencent.com/workorder/category).</ul></li><li> This parameter is not required for creating shared instances.</li></ul>For more details, see [Instance Specifications](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1).
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Whether Binding IPs of other VPCs feature switch
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * Creates `SnatIp` when the binding IPs of other VPCs feature is enabled
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * Tag for the STGW exclusive cluster.
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: The traffic only goes to the secondary AZ when the primary AZ is unavailable. You can query the list of primary and secondary AZ of a region by calling [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance. E.g., `eip-11112222`.
    */
    @SerializedName("EipAddressId")
    @Expose
    private String EipAddressId;

    /**
    * Whether to allow CLB traffic to the target group. `true`: allows CLB traffic to the target group and verifies security groups only on CLB; `false`: denies CLB traffic to the target group and verifies security groups on both CLB and backend instances.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * Upgrades to domain name-based CLB
    */
    @SerializedName("DynamicVip")
    @Expose
    private Boolean DynamicVip;

    /**
    * Network egress point
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
     * Get CLB instance network type:
OPEN: public network; INTERNAL: private network. 
     * @return LoadBalancerType CLB instance network type:
OPEN: public network; INTERNAL: private network.
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB instance network type:
OPEN: public network; INTERNAL: private network.
     * @param LoadBalancerType CLB instance network type:
OPEN: public network; INTERNAL: private network.
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get CLB instance type. Valid value: 1 (generic CLB instance). 
     * @return Forward CLB instance type. Valid value: 1 (generic CLB instance).
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set CLB instance type. Valid value: 1 (generic CLB instance).
     * @param Forward CLB instance type. Valid value: 1 (generic CLB instance).
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get CLB instance name, which takes effect only when only one instance is to be created in the request. It can consist 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: if the name of the new CLB instance already exists, a default name will be generated automatically. 
     * @return LoadBalancerName CLB instance name, which takes effect only when only one instance is to be created in the request. It can consist 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name, which takes effect only when only one instance is to be created in the request. It can consist 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
     * @param LoadBalancerName CLB instance name, which takes effect only when only one instance is to be created in the request. It can consist 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: if the name of the new CLB instance already exists, a default name will be generated automatically.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Network ID of the target device on the CLB backend, such as `vpc-12345678`, which can be obtained through the `DescribeVpcEx` API. If this parameter is not entered, `DefaultVPC` is used by default. This parameter is required when creating a private network instance. 
     * @return VpcId Network ID of the target device on the CLB backend, such as `vpc-12345678`, which can be obtained through the `DescribeVpcEx` API. If this parameter is not entered, `DefaultVPC` is used by default. This parameter is required when creating a private network instance.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Network ID of the target device on the CLB backend, such as `vpc-12345678`, which can be obtained through the `DescribeVpcEx` API. If this parameter is not entered, `DefaultVPC` is used by default. This parameter is required when creating a private network instance.
     * @param VpcId Network ID of the target device on the CLB backend, such as `vpc-12345678`, which can be obtained through the `DescribeVpcEx` API. If this parameter is not entered, `DefaultVPC` is used by default. This parameter is required when creating a private network instance.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet. This parameter is required for creating a CLB instance. 
     * @return SubnetId A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet. This parameter is required for creating a CLB instance.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet. This parameter is required for creating a CLB instance.
     * @param SubnetId A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet. This parameter is required for creating a CLB instance.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not entered, the default project will be used. 
     * @return ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not entered, the default project will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not entered, the default project will be used.
     * @param ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not entered, the default project will be used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get It's only applicable to public network CLB instances. IP version. Values: `IPV4`, `IPV6` and `IPv6FullChain` (case-insensitive). Default: `IPV4`. Note: `IPV6` indicates IPv6 NAT64, while `IPv6FullChain` indicates IPv6.  
     * @return AddressIPVersion It's only applicable to public network CLB instances. IP version. Values: `IPV4`, `IPV6` and `IPv6FullChain` (case-insensitive). Default: `IPV4`. Note: `IPV6` indicates IPv6 NAT64, while `IPv6FullChain` indicates IPv6. 
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set It's only applicable to public network CLB instances. IP version. Values: `IPV4`, `IPV6` and `IPv6FullChain` (case-insensitive). Default: `IPV4`. Note: `IPV6` indicates IPv6 NAT64, while `IPv6FullChain` indicates IPv6. 
     * @param AddressIPVersion It's only applicable to public network CLB instances. IP version. Values: `IPV4`, `IPV6` and `IPv6FullChain` (case-insensitive). Default: `IPV4`. Note: `IPV6` indicates IPv6 NAT64, while `IPv6FullChain` indicates IPv6. 
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get Number of CLBs to be created. Default value: 1. 
     * @return Number Number of CLBs to be created. Default value: 1.
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set Number of CLBs to be created. Default value: 1.
     * @param Number Number of CLBs to be created. Default value: 1.
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get ID of the primary AZ for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It's only available to public CLB instances. 
Note: The traffic only goes to the primary AZ in normal cases. The secondary AZ is used only when the primary AZ is unavailable. To query the list of primary AZs in a region, use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     * @return MasterZoneId ID of the primary AZ for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It's only available to public CLB instances. 
Note: The traffic only goes to the primary AZ in normal cases. The secondary AZ is used only when the primary AZ is unavailable. To query the list of primary AZs in a region, use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set ID of the primary AZ for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It's only available to public CLB instances. 
Note: The traffic only goes to the primary AZ in normal cases. The secondary AZ is used only when the primary AZ is unavailable. To query the list of primary AZs in a region, use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
     * @param MasterZoneId ID of the primary AZ for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It's only available to public CLB instances. 
Note: The traffic only goes to the primary AZ in normal cases. The secondary AZ is used only when the primary AZ is unavailable. To query the list of primary AZs in a region, use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get Specifies an AZ ID for creating a CLB instance, such as `ap-guangzhou-1`, which is applicable only to public network CLB instances. 
     * @return ZoneId Specifies an AZ ID for creating a CLB instance, such as `ap-guangzhou-1`, which is applicable only to public network CLB instances.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies an AZ ID for creating a CLB instance, such as `ap-guangzhou-1`, which is applicable only to public network CLB instances.
     * @param ZoneId Specifies an AZ ID for creating a CLB instance, such as `ap-guangzhou-1`, which is applicable only to public network CLB instances.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get It only works on LCU-supported instances on private networks and all instances on public networks. 
     * @return InternetAccessible It only works on LCU-supported instances on private networks and all instances on public networks.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set It only works on LCU-supported instances on private networks and all instances on public networks.
     * @param InternetAccessible It only works on LCU-supported instances on private networks and all instances on public networks.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).  
     * @return VipIsp ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     * @param VipIsp ISP of VIP. Values: `CMCC` (China Mobile), `CUCC` (China Unicom) and `CTCC` (China Telecom). You need to activate static single-line IPs. This feature is in beta and is only available in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu and Chongqing regions. To try it out, please contact your sales rep. If it's specified, the network billing mode must be `BANDWIDTH_PACKAGE`. If it's not specified, BGP is used by default. To query ISPs supported in a region, please use [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get Tags the CLB instance when purchasing it. Up to 20 tag key value pairs are supported. 
     * @return Tags Tags the CLB instance when purchasing it. Up to 20 tag key value pairs are supported.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags the CLB instance when purchasing it. Up to 20 tag key value pairs are supported.
     * @param Tags Tags the CLB instance when purchasing it. Up to 20 tag key value pairs are supported.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Specifies the VIP for the application of a CLB instance. This parameter is optional. If you do not specify this parameter, the system automatically assigns a value for the parameter. IPv4 and IPv6 CLB instances support this parameter, but IPv6 NAT64 CLB instances do not.
Note: If the specified VIP is occupied or is not within the IP range of the specified VPC subnet, you cannot use the VIP to create a CLB instance in a private network or an IPv6 BGP CLB instance in a public network. 
     * @return Vip Specifies the VIP for the application of a CLB instance. This parameter is optional. If you do not specify this parameter, the system automatically assigns a value for the parameter. IPv4 and IPv6 CLB instances support this parameter, but IPv6 NAT64 CLB instances do not.
Note: If the specified VIP is occupied or is not within the IP range of the specified VPC subnet, you cannot use the VIP to create a CLB instance in a private network or an IPv6 BGP CLB instance in a public network.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Specifies the VIP for the application of a CLB instance. This parameter is optional. If you do not specify this parameter, the system automatically assigns a value for the parameter. IPv4 and IPv6 CLB instances support this parameter, but IPv6 NAT64 CLB instances do not.
Note: If the specified VIP is occupied or is not within the IP range of the specified VPC subnet, you cannot use the VIP to create a CLB instance in a private network or an IPv6 BGP CLB instance in a public network.
     * @param Vip Specifies the VIP for the application of a CLB instance. This parameter is optional. If you do not specify this parameter, the system automatically assigns a value for the parameter. IPv4 and IPv6 CLB instances support this parameter, but IPv6 NAT64 CLB instances do not.
Note: If the specified VIP is occupied or is not within the IP range of the specified VPC subnet, you cannot use the VIP to create a CLB instance in a private network or an IPv6 BGP CLB instance in a public network.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Bandwidth package ID. If this parameter is specified, the network billing mode (`InternetAccessible.InternetChargeType`) will only support bill-by-bandwidth package (`BANDWIDTH_PACKAGE`). 
     * @return BandwidthPackageId Bandwidth package ID. If this parameter is specified, the network billing mode (`InternetAccessible.InternetChargeType`) will only support bill-by-bandwidth package (`BANDWIDTH_PACKAGE`).
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID. If this parameter is specified, the network billing mode (`InternetAccessible.InternetChargeType`) will only support bill-by-bandwidth package (`BANDWIDTH_PACKAGE`).
     * @param BandwidthPackageId Bandwidth package ID. If this parameter is specified, the network billing mode (`InternetAccessible.InternetChargeType`) will only support bill-by-bandwidth package (`BANDWIDTH_PACKAGE`).
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Information about the dedicated CLB instance. You must specify this parameter when you create a dedicated CLB instance in a private network. 
     * @return ExclusiveCluster Information about the dedicated CLB instance. You must specify this parameter when you create a dedicated CLB instance in a private network.
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set Information about the dedicated CLB instance. You must specify this parameter when you create a dedicated CLB instance in a private network.
     * @param ExclusiveCluster Information about the dedicated CLB instance. You must specify this parameter when you create a dedicated CLB instance in a private network.
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get Specification of LCU-supported instance.
<ul><li>This parameter is required to create LCU-supported instances. Values: <ul><li>`SLA`: Super Large 4. When you have activated Super Large models, `SLA` refers to Super Large 4.</li><li>`clb.c2.medium`: Standard</li><li>`clb.c3.small`: Advanced 1</li><li>`clb.c3.medium`: Advanced 1</li><li>`clb.c4.small`: Super Large 1</li><li>`clb.c4.medium`: Super Large 2</li><li>`clb.c4.large`: Super Large 3</li><li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above models, please [submit a ticket](https://console.cloud.tencent.com/workorder/category).</ul></li><li> This parameter is not required for creating shared instances.</li></ul>For more details, see [Instance Specifications](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1). 
     * @return SlaType Specification of LCU-supported instance.
<ul><li>This parameter is required to create LCU-supported instances. Values: <ul><li>`SLA`: Super Large 4. When you have activated Super Large models, `SLA` refers to Super Large 4.</li><li>`clb.c2.medium`: Standard</li><li>`clb.c3.small`: Advanced 1</li><li>`clb.c3.medium`: Advanced 1</li><li>`clb.c4.small`: Super Large 1</li><li>`clb.c4.medium`: Super Large 2</li><li>`clb.c4.large`: Super Large 3</li><li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above models, please [submit a ticket](https://console.cloud.tencent.com/workorder/category).</ul></li><li> This parameter is not required for creating shared instances.</li></ul>For more details, see [Instance Specifications](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1).
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Specification of LCU-supported instance.
<ul><li>This parameter is required to create LCU-supported instances. Values: <ul><li>`SLA`: Super Large 4. When you have activated Super Large models, `SLA` refers to Super Large 4.</li><li>`clb.c2.medium`: Standard</li><li>`clb.c3.small`: Advanced 1</li><li>`clb.c3.medium`: Advanced 1</li><li>`clb.c4.small`: Super Large 1</li><li>`clb.c4.medium`: Super Large 2</li><li>`clb.c4.large`: Super Large 3</li><li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above models, please [submit a ticket](https://console.cloud.tencent.com/workorder/category).</ul></li><li> This parameter is not required for creating shared instances.</li></ul>For more details, see [Instance Specifications](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1).
     * @param SlaType Specification of LCU-supported instance.
<ul><li>This parameter is required to create LCU-supported instances. Values: <ul><li>`SLA`: Super Large 4. When you have activated Super Large models, `SLA` refers to Super Large 4.</li><li>`clb.c2.medium`: Standard</li><li>`clb.c3.small`: Advanced 1</li><li>`clb.c3.medium`: Advanced 1</li><li>`clb.c4.small`: Super Large 1</li><li>`clb.c4.medium`: Super Large 2</li><li>`clb.c4.large`: Super Large 3</li><li>`clb.c4.xlarge`: Super Large 4</li> For Super Large 2 and above models, please [submit a ticket](https://console.cloud.tencent.com/workorder/category).</ul></li><li> This parameter is not required for creating shared instances.</li></ul>For more details, see [Instance Specifications](https://intl.cloud.tencent.com/document/product/214/84689?from_cn_redirect=1).
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. 
     * @return ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     * @param ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Whether Binding IPs of other VPCs feature switch 
     * @return SnatPro Whether Binding IPs of other VPCs feature switch
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Whether Binding IPs of other VPCs feature switch
     * @param SnatPro Whether Binding IPs of other VPCs feature switch
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get Creates `SnatIp` when the binding IPs of other VPCs feature is enabled 
     * @return SnatIps Creates `SnatIp` when the binding IPs of other VPCs feature is enabled
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set Creates `SnatIp` when the binding IPs of other VPCs feature is enabled
     * @param SnatIps Creates `SnatIp` when the binding IPs of other VPCs feature is enabled
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get Tag for the STGW exclusive cluster. 
     * @return ClusterTag Tag for the STGW exclusive cluster.
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set Tag for the STGW exclusive cluster.
     * @param ClusterTag Tag for the STGW exclusive cluster.
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: The traffic only goes to the secondary AZ when the primary AZ is unavailable. You can query the list of primary and secondary AZ of a region by calling [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1). 
     * @return SlaveZoneId Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: The traffic only goes to the secondary AZ when the primary AZ is unavailable. You can query the list of primary and secondary AZ of a region by calling [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: The traffic only goes to the secondary AZ when the primary AZ is unavailable. You can query the list of primary and secondary AZ of a region by calling [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
     * @param SlaveZoneId Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: The traffic only goes to the secondary AZ when the primary AZ is unavailable. You can query the list of primary and secondary AZ of a region by calling [DescribeResources](https://intl.cloud.tencent.com/document/api/214/70213?from_cn_redirect=1).
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance. E.g., `eip-11112222`. 
     * @return EipAddressId Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance. E.g., `eip-11112222`.
     */
    public String getEipAddressId() {
        return this.EipAddressId;
    }

    /**
     * Set Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance. E.g., `eip-11112222`.
     * @param EipAddressId Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance. E.g., `eip-11112222`.
     */
    public void setEipAddressId(String EipAddressId) {
        this.EipAddressId = EipAddressId;
    }

    /**
     * Get Whether to allow CLB traffic to the target group. `true`: allows CLB traffic to the target group and verifies security groups only on CLB; `false`: denies CLB traffic to the target group and verifies security groups on both CLB and backend instances. 
     * @return LoadBalancerPassToTarget Whether to allow CLB traffic to the target group. `true`: allows CLB traffic to the target group and verifies security groups only on CLB; `false`: denies CLB traffic to the target group and verifies security groups on both CLB and backend instances.
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Whether to allow CLB traffic to the target group. `true`: allows CLB traffic to the target group and verifies security groups only on CLB; `false`: denies CLB traffic to the target group and verifies security groups on both CLB and backend instances.
     * @param LoadBalancerPassToTarget Whether to allow CLB traffic to the target group. `true`: allows CLB traffic to the target group and verifies security groups only on CLB; `false`: denies CLB traffic to the target group and verifies security groups on both CLB and backend instances.
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get Upgrades to domain name-based CLB 
     * @return DynamicVip Upgrades to domain name-based CLB
     */
    public Boolean getDynamicVip() {
        return this.DynamicVip;
    }

    /**
     * Set Upgrades to domain name-based CLB
     * @param DynamicVip Upgrades to domain name-based CLB
     */
    public void setDynamicVip(Boolean DynamicVip) {
        this.DynamicVip = DynamicVip;
    }

    /**
     * Get Network egress point 
     * @return Egress Network egress point
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set Network egress point
     * @param Egress Network egress point
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.ExclusiveCluster != null) {
            this.ExclusiveCluster = new ExclusiveCluster(source.ExclusiveCluster);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.SnatIps != null) {
            this.SnatIps = new SnatIp[source.SnatIps.length];
            for (int i = 0; i < source.SnatIps.length; i++) {
                this.SnatIps[i] = new SnatIp(source.SnatIps[i]);
            }
        }
        if (source.ClusterTag != null) {
            this.ClusterTag = new String(source.ClusterTag);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
        }
        if (source.EipAddressId != null) {
            this.EipAddressId = new String(source.EipAddressId);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
        if (source.DynamicVip != null) {
            this.DynamicVip = new Boolean(source.DynamicVip);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamObj(map, prefix + "ExclusiveCluster.", this.ExclusiveCluster);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);
        this.setParamSimple(map, prefix + "EipAddressId", this.EipAddressId);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "DynamicVip", this.DynamicVip);
        this.setParamSimple(map, prefix + "Egress", this.Egress);

    }
}

