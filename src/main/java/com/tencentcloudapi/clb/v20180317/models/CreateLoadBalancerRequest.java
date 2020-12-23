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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel{

    /**
    * CLB instance network type:
OPEN: public network; INTERNAL: private network.
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * CLB instance type. 1: generic CLB instance. Currently, only 1 can be passed in
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * CLB instance name, which takes effect only when an instance is created. It consists of 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: If the name of the new CLB instance already exists in the system, the system will automatically generate a name for the new CLB instance.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Network ID of the backend target server of CLB, which can be obtained through the DescribeVpcEx API. If this parameter is not passed in, it will default to a basic network ("0").
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API. If this parameter is not passed in, the default project will be used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * IP version. Valid values: IPv4, IPv6, IPv6FullChain. Default value: IPv4. This parameter is applicable only to public network CLB instances.
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
    * Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1, which is applicable only to public network CLB.
Note: A primary AZ carries traffic, while a secondary AZ does not carry traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. The list of primary AZs in a specific region can be queried through the DescribeMasterZones API.
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * Specifies an AZ ID for creating a CLB instance, such as ap-guangzhou-1, which is applicable only to public network CLB.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * CLB network billing mode. This parameter is applicable only to public network CLB instances.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * This parameter is applicable only to public network CLB instances. Valid values: CMCC (China Mobile), CTCC (China Telecom), CUCC (China Unicom). If this parameter is not specified, BGP will be used by default. ISPs supported in a region can be queried with the `DescribeSingleIsp` API. If an ISP is specified, only bill-by-bandwidth-package (BANDWIDTH_PACKAGE) can be used as the network billing mode.
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * Tags a CLB instance when purchasing it
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Applies for CLB instances for a specified VIP
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
    * Exclusive cluster information.
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

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
     * Get CLB instance type. 1: generic CLB instance. Currently, only 1 can be passed in 
     * @return Forward CLB instance type. 1: generic CLB instance. Currently, only 1 can be passed in
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set CLB instance type. 1: generic CLB instance. Currently, only 1 can be passed in
     * @param Forward CLB instance type. 1: generic CLB instance. Currently, only 1 can be passed in
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get CLB instance name, which takes effect only when an instance is created. It consists of 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: If the name of the new CLB instance already exists in the system, the system will automatically generate a name for the new CLB instance. 
     * @return LoadBalancerName CLB instance name, which takes effect only when an instance is created. It consists of 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: If the name of the new CLB instance already exists in the system, the system will automatically generate a name for the new CLB instance.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name, which takes effect only when an instance is created. It consists of 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: If the name of the new CLB instance already exists in the system, the system will automatically generate a name for the new CLB instance.
     * @param LoadBalancerName CLB instance name, which takes effect only when an instance is created. It consists of 1 to 60 letters, digits, hyphens (-), or underscores (_).
Note: If the name of the new CLB instance already exists in the system, the system will automatically generate a name for the new CLB instance.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Network ID of the backend target server of CLB, which can be obtained through the DescribeVpcEx API. If this parameter is not passed in, it will default to a basic network ("0"). 
     * @return VpcId Network ID of the backend target server of CLB, which can be obtained through the DescribeVpcEx API. If this parameter is not passed in, it will default to a basic network ("0").
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Network ID of the backend target server of CLB, which can be obtained through the DescribeVpcEx API. If this parameter is not passed in, it will default to a basic network ("0").
     * @param VpcId Network ID of the backend target server of CLB, which can be obtained through the DescribeVpcEx API. If this parameter is not passed in, it will default to a basic network ("0").
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet. 
     * @return SubnetId A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet.
     * @param SubnetId A subnet ID must be specified when you purchase a private network CLB instance in a VPC, and the VIP of this instance will be generated in this subnet.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API. If this parameter is not passed in, the default project will be used. 
     * @return ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API. If this parameter is not passed in, the default project will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API. If this parameter is not passed in, the default project will be used.
     * @param ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the DescribeProject API. If this parameter is not passed in, the default project will be used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get IP version. Valid values: IPv4, IPv6, IPv6FullChain. Default value: IPv4. This parameter is applicable only to public network CLB instances. 
     * @return AddressIPVersion IP version. Valid values: IPv4, IPv6, IPv6FullChain. Default value: IPv4. This parameter is applicable only to public network CLB instances.
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP version. Valid values: IPv4, IPv6, IPv6FullChain. Default value: IPv4. This parameter is applicable only to public network CLB instances.
     * @param AddressIPVersion IP version. Valid values: IPv4, IPv6, IPv6FullChain. Default value: IPv4. This parameter is applicable only to public network CLB instances.
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
     * Get Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1, which is applicable only to public network CLB.
Note: A primary AZ carries traffic, while a secondary AZ does not carry traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. The list of primary AZs in a specific region can be queried through the DescribeMasterZones API. 
     * @return MasterZoneId Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1, which is applicable only to public network CLB.
Note: A primary AZ carries traffic, while a secondary AZ does not carry traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. The list of primary AZs in a specific region can be queried through the DescribeMasterZones API.
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1, which is applicable only to public network CLB.
Note: A primary AZ carries traffic, while a secondary AZ does not carry traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. The list of primary AZs in a specific region can be queried through the DescribeMasterZones API.
     * @param MasterZoneId Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1, which is applicable only to public network CLB.
Note: A primary AZ carries traffic, while a secondary AZ does not carry traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. The list of primary AZs in a specific region can be queried through the DescribeMasterZones API.
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get Specifies an AZ ID for creating a CLB instance, such as ap-guangzhou-1, which is applicable only to public network CLB. 
     * @return ZoneId Specifies an AZ ID for creating a CLB instance, such as ap-guangzhou-1, which is applicable only to public network CLB.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies an AZ ID for creating a CLB instance, such as ap-guangzhou-1, which is applicable only to public network CLB.
     * @param ZoneId Specifies an AZ ID for creating a CLB instance, such as ap-guangzhou-1, which is applicable only to public network CLB.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get CLB network billing mode. This parameter is applicable only to public network CLB instances. 
     * @return InternetAccessible CLB network billing mode. This parameter is applicable only to public network CLB instances.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set CLB network billing mode. This parameter is applicable only to public network CLB instances.
     * @param InternetAccessible CLB network billing mode. This parameter is applicable only to public network CLB instances.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get This parameter is applicable only to public network CLB instances. Valid values: CMCC (China Mobile), CTCC (China Telecom), CUCC (China Unicom). If this parameter is not specified, BGP will be used by default. ISPs supported in a region can be queried with the `DescribeSingleIsp` API. If an ISP is specified, only bill-by-bandwidth-package (BANDWIDTH_PACKAGE) can be used as the network billing mode. 
     * @return VipIsp This parameter is applicable only to public network CLB instances. Valid values: CMCC (China Mobile), CTCC (China Telecom), CUCC (China Unicom). If this parameter is not specified, BGP will be used by default. ISPs supported in a region can be queried with the `DescribeSingleIsp` API. If an ISP is specified, only bill-by-bandwidth-package (BANDWIDTH_PACKAGE) can be used as the network billing mode.
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set This parameter is applicable only to public network CLB instances. Valid values: CMCC (China Mobile), CTCC (China Telecom), CUCC (China Unicom). If this parameter is not specified, BGP will be used by default. ISPs supported in a region can be queried with the `DescribeSingleIsp` API. If an ISP is specified, only bill-by-bandwidth-package (BANDWIDTH_PACKAGE) can be used as the network billing mode.
     * @param VipIsp This parameter is applicable only to public network CLB instances. Valid values: CMCC (China Mobile), CTCC (China Telecom), CUCC (China Unicom). If this parameter is not specified, BGP will be used by default. ISPs supported in a region can be queried with the `DescribeSingleIsp` API. If an ISP is specified, only bill-by-bandwidth-package (BANDWIDTH_PACKAGE) can be used as the network billing mode.
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get Tags a CLB instance when purchasing it 
     * @return Tags Tags a CLB instance when purchasing it
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags a CLB instance when purchasing it
     * @param Tags Tags a CLB instance when purchasing it
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Applies for CLB instances for a specified VIP 
     * @return Vip Applies for CLB instances for a specified VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Applies for CLB instances for a specified VIP
     * @param Vip Applies for CLB instances for a specified VIP
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
     * Get Exclusive cluster information. 
     * @return ExclusiveCluster Exclusive cluster information.
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set Exclusive cluster information.
     * @param ExclusiveCluster Exclusive cluster information.
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
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
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);

    }
}

