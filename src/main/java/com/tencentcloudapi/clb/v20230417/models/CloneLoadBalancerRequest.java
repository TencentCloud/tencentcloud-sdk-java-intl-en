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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneLoadBalancerRequest extends AbstractModel {

    /**
    * CLB ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * The name of the cloned CLB instance. Rule: 1-60 English letters, Chinese characters, digits, hyphens "-", or underscores "_".
Note: If the name is the same as an existing Cloud Load Balancer instance in the system, the system will automatically generate the name of the created CLB instance.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * The project ID associated with the Cloud Load Balancer instance can be obtained through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API. If this parameter is not specified, it will be used as the default project.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Applicable only to public network CLB. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The primary AZ loads traffic, while the secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the primary AZ list of a region.
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * Applicable only to public network CLB. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The secondary AZ sustains traffic when the primary AZ encounters faults. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the list of primary/secondary AZs in a region.
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * Applicable only to public network CLB. Availability zone ID. Specify an availability zone to create a Cloud Load Balancer instance, for example, ap-guangzhou-1. If not specified, queries CVM instances in all AZs. If needed, call the DescribeZones API (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * CLB network billing mode, applicable only to public network CLB instances.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * It only applies to public CLB. Currently, the static single-line IP type is supported only for the regions of Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing. If you need to experience it, contact your business manager. After approval, you can select the ISP type as China Mobile (CMCC), China Unicom (CUCC), or China Telecom (CTCC). The network billing mode should be selected as billing by bandwidth package (BANDWIDTH_PACKAGE). If this parameter is not specified, BGP is used by default. You can use the DescribeResources API to query ISPs supported for a region.
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * Designate a Vip to apply for Cloud Load Balancer.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * When you purchase Cloud Load Balancer (CLB), you can tag it.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Exclusive cluster information.
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) supports only billing by bandwidth package (BANDWIDTH_PACKAGE).
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Whether to support the feature of binding IP addresses across regions/VPCs.
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * SNAT IP addresses to be created when the feature of cross-region/cross-VPC IP address binding is enabled.
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * Public network exclusive cluster ID or CDCId.
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Performance capacity specification.<li>clb.c2.medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li><li>clb.c4.small (high-strength type 1)</li><li>clb.c4.medium (high-strength type 2)</li><li>clb.c4.large (high-strength type 3)</li><li>clb.c4.xlarge (high-strength type 4)</li>
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * Exclusive STGW cluster tag.
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * Applicable only to private network CLB. When connected to nearby via private network, select availability zone for deployment. You can call the [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) API to query the availability zone list.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Unique ID of an EIP, in the format of eip-11112222, which is applicable only for binding EIP to private network CLB.
    */
    @SerializedName("EipAddressId")
    @Expose
    private String EipAddressId;

    /**
     * Get CLB ID. 
     * @return LoadBalancerId CLB ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB ID.
     * @param LoadBalancerId CLB ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get The name of the cloned CLB instance. Rule: 1-60 English letters, Chinese characters, digits, hyphens "-", or underscores "_".
Note: If the name is the same as an existing Cloud Load Balancer instance in the system, the system will automatically generate the name of the created CLB instance. 
     * @return LoadBalancerName The name of the cloned CLB instance. Rule: 1-60 English letters, Chinese characters, digits, hyphens "-", or underscores "_".
Note: If the name is the same as an existing Cloud Load Balancer instance in the system, the system will automatically generate the name of the created CLB instance.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set The name of the cloned CLB instance. Rule: 1-60 English letters, Chinese characters, digits, hyphens "-", or underscores "_".
Note: If the name is the same as an existing Cloud Load Balancer instance in the system, the system will automatically generate the name of the created CLB instance.
     * @param LoadBalancerName The name of the cloned CLB instance. Rule: 1-60 English letters, Chinese characters, digits, hyphens "-", or underscores "_".
Note: If the name is the same as an existing Cloud Load Balancer instance in the system, the system will automatically generate the name of the created CLB instance.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get The project ID associated with the Cloud Load Balancer instance can be obtained through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API. If this parameter is not specified, it will be used as the default project. 
     * @return ProjectId The project ID associated with the Cloud Load Balancer instance can be obtained through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API. If this parameter is not specified, it will be used as the default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The project ID associated with the Cloud Load Balancer instance can be obtained through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API. If this parameter is not specified, it will be used as the default project.
     * @param ProjectId The project ID associated with the Cloud Load Balancer instance can be obtained through the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API. If this parameter is not specified, it will be used as the default project.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Applicable only to public network CLB. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The primary AZ loads traffic, while the secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the primary AZ list of a region. 
     * @return MasterZoneId Applicable only to public network CLB. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The primary AZ loads traffic, while the secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the primary AZ list of a region.
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set Applicable only to public network CLB. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The primary AZ loads traffic, while the secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the primary AZ list of a region.
     * @param MasterZoneId Applicable only to public network CLB. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The primary AZ loads traffic, while the secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the primary AZ list of a region.
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get Applicable only to public network CLB. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The secondary AZ sustains traffic when the primary AZ encounters faults. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the list of primary/secondary AZs in a region. 
     * @return SlaveZoneId Applicable only to public network CLB. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The secondary AZ sustains traffic when the primary AZ encounters faults. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the list of primary/secondary AZs in a region.
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set Applicable only to public network CLB. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The secondary AZ sustains traffic when the primary AZ encounters faults. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the list of primary/secondary AZs in a region.
     * @param SlaveZoneId Applicable only to public network CLB. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.
Note: The secondary AZ sustains traffic when the primary AZ encounters faults. You can call the [DescribeResources](https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1) API to query the list of primary/secondary AZs in a region.
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get Applicable only to public network CLB. Availability zone ID. Specify an availability zone to create a Cloud Load Balancer instance, for example, ap-guangzhou-1. If not specified, queries CVM instances in all AZs. If needed, call the DescribeZones API (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list. 
     * @return ZoneId Applicable only to public network CLB. Availability zone ID. Specify an availability zone to create a Cloud Load Balancer instance, for example, ap-guangzhou-1. If not specified, queries CVM instances in all AZs. If needed, call the DescribeZones API (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Applicable only to public network CLB. Availability zone ID. Specify an availability zone to create a Cloud Load Balancer instance, for example, ap-guangzhou-1. If not specified, queries CVM instances in all AZs. If needed, call the DescribeZones API (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
     * @param ZoneId Applicable only to public network CLB. Availability zone ID. Specify an availability zone to create a Cloud Load Balancer instance, for example, ap-guangzhou-1. If not specified, queries CVM instances in all AZs. If needed, call the DescribeZones API (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get CLB network billing mode, applicable only to public network CLB instances. 
     * @return InternetAccessible CLB network billing mode, applicable only to public network CLB instances.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set CLB network billing mode, applicable only to public network CLB instances.
     * @param InternetAccessible CLB network billing mode, applicable only to public network CLB instances.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get It only applies to public CLB. Currently, the static single-line IP type is supported only for the regions of Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing. If you need to experience it, contact your business manager. After approval, you can select the ISP type as China Mobile (CMCC), China Unicom (CUCC), or China Telecom (CTCC). The network billing mode should be selected as billing by bandwidth package (BANDWIDTH_PACKAGE). If this parameter is not specified, BGP is used by default. You can use the DescribeResources API to query ISPs supported for a region. 
     * @return VipIsp It only applies to public CLB. Currently, the static single-line IP type is supported only for the regions of Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing. If you need to experience it, contact your business manager. After approval, you can select the ISP type as China Mobile (CMCC), China Unicom (CUCC), or China Telecom (CTCC). The network billing mode should be selected as billing by bandwidth package (BANDWIDTH_PACKAGE). If this parameter is not specified, BGP is used by default. You can use the DescribeResources API to query ISPs supported for a region.
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set It only applies to public CLB. Currently, the static single-line IP type is supported only for the regions of Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing. If you need to experience it, contact your business manager. After approval, you can select the ISP type as China Mobile (CMCC), China Unicom (CUCC), or China Telecom (CTCC). The network billing mode should be selected as billing by bandwidth package (BANDWIDTH_PACKAGE). If this parameter is not specified, BGP is used by default. You can use the DescribeResources API to query ISPs supported for a region.
     * @param VipIsp It only applies to public CLB. Currently, the static single-line IP type is supported only for the regions of Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing. If you need to experience it, contact your business manager. After approval, you can select the ISP type as China Mobile (CMCC), China Unicom (CUCC), or China Telecom (CTCC). The network billing mode should be selected as billing by bandwidth package (BANDWIDTH_PACKAGE). If this parameter is not specified, BGP is used by default. You can use the DescribeResources API to query ISPs supported for a region.
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get Designate a Vip to apply for Cloud Load Balancer. 
     * @return Vip Designate a Vip to apply for Cloud Load Balancer.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Designate a Vip to apply for Cloud Load Balancer.
     * @param Vip Designate a Vip to apply for Cloud Load Balancer.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get When you purchase Cloud Load Balancer (CLB), you can tag it. 
     * @return Tags When you purchase Cloud Load Balancer (CLB), you can tag it.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set When you purchase Cloud Load Balancer (CLB), you can tag it.
     * @param Tags When you purchase Cloud Load Balancer (CLB), you can tag it.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
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
     * Get Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) supports only billing by bandwidth package (BANDWIDTH_PACKAGE). 
     * @return BandwidthPackageId Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) supports only billing by bandwidth package (BANDWIDTH_PACKAGE).
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) supports only billing by bandwidth package (BANDWIDTH_PACKAGE).
     * @param BandwidthPackageId Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) supports only billing by bandwidth package (BANDWIDTH_PACKAGE).
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Whether to support the feature of binding IP addresses across regions/VPCs. 
     * @return SnatPro Whether to support the feature of binding IP addresses across regions/VPCs.
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Whether to support the feature of binding IP addresses across regions/VPCs.
     * @param SnatPro Whether to support the feature of binding IP addresses across regions/VPCs.
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get SNAT IP addresses to be created when the feature of cross-region/cross-VPC IP address binding is enabled. 
     * @return SnatIps SNAT IP addresses to be created when the feature of cross-region/cross-VPC IP address binding is enabled.
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set SNAT IP addresses to be created when the feature of cross-region/cross-VPC IP address binding is enabled.
     * @param SnatIps SNAT IP addresses to be created when the feature of cross-region/cross-VPC IP address binding is enabled.
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get Public network exclusive cluster ID or CDCId. 
     * @return ClusterIds Public network exclusive cluster ID or CDCId.
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Public network exclusive cluster ID or CDCId.
     * @param ClusterIds Public network exclusive cluster ID or CDCId.
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Performance capacity specification.<li>clb.c2.medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li><li>clb.c4.small (high-strength type 1)</li><li>clb.c4.medium (high-strength type 2)</li><li>clb.c4.large (high-strength type 3)</li><li>clb.c4.xlarge (high-strength type 4)</li> 
     * @return SlaType Performance capacity specification.<li>clb.c2.medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li><li>clb.c4.small (high-strength type 1)</li><li>clb.c4.medium (high-strength type 2)</li><li>clb.c4.large (high-strength type 3)</li><li>clb.c4.xlarge (high-strength type 4)</li>
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Performance capacity specification.<li>clb.c2.medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li><li>clb.c4.small (high-strength type 1)</li><li>clb.c4.medium (high-strength type 2)</li><li>clb.c4.large (high-strength type 3)</li><li>clb.c4.xlarge (high-strength type 4)</li>
     * @param SlaType Performance capacity specification.<li>clb.c2.medium (standard type)</li><li>clb.c3.small (advanced type 1)</li><li>clb.c3.medium (advanced type 2)</li><li>clb.c4.small (high-strength type 1)</li><li>clb.c4.medium (high-strength type 2)</li><li>clb.c4.large (high-strength type 3)</li><li>clb.c4.xlarge (high-strength type 4)</li>
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get Exclusive STGW cluster tag. 
     * @return ClusterTag Exclusive STGW cluster tag.
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set Exclusive STGW cluster tag.
     * @param ClusterTag Exclusive STGW cluster tag.
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get Applicable only to private network CLB. When connected to nearby via private network, select availability zone for deployment. You can call the [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) API to query the availability zone list. 
     * @return Zones Applicable only to private network CLB. When connected to nearby via private network, select availability zone for deployment. You can call the [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) API to query the availability zone list.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Applicable only to private network CLB. When connected to nearby via private network, select availability zone for deployment. You can call the [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) API to query the availability zone list.
     * @param Zones Applicable only to private network CLB. When connected to nearby via private network, select availability zone for deployment. You can call the [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) API to query the availability zone list.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Unique ID of an EIP, in the format of eip-11112222, which is applicable only for binding EIP to private network CLB. 
     * @return EipAddressId Unique ID of an EIP, in the format of eip-11112222, which is applicable only for binding EIP to private network CLB.
     */
    public String getEipAddressId() {
        return this.EipAddressId;
    }

    /**
     * Set Unique ID of an EIP, in the format of eip-11112222, which is applicable only for binding EIP to private network CLB.
     * @param EipAddressId Unique ID of an EIP, in the format of eip-11112222, which is applicable only for binding EIP to private network CLB.
     */
    public void setEipAddressId(String EipAddressId) {
        this.EipAddressId = EipAddressId;
    }

    public CloneLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneLoadBalancerRequest(CloneLoadBalancerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
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
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ExclusiveCluster != null) {
            this.ExclusiveCluster = new ExclusiveCluster(source.ExclusiveCluster);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
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
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.ClusterTag != null) {
            this.ClusterTag = new String(source.ClusterTag);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.EipAddressId != null) {
            this.EipAddressId = new String(source.EipAddressId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ExclusiveCluster.", this.ExclusiveCluster);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "EipAddressId", this.EipAddressId);

    }
}

