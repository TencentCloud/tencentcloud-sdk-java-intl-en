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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneLoadBalancerRequest extends AbstractModel {

    /**
    * Specifies the clb ID. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Specifies the name of the cloned load balancing instance. rule: 1-60 english letters, chinese characters, digits, connecting lines "-", or underscores "_".
Note: if the name is identical to that of an existing load balancing instance in the system, the system will automatically generate a name for the created cloud load balancer instance.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not passed in, the default project will be used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Sets the primary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`, which is applicable only to public network CLB.
Note: A primary AZ loads traffic, while a secondary AZ does not load traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can use the `DescribeResource` API to query the primary AZ list of a region.
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: A secondary AZ will load traffic if the primary AZ is faulty. You can use the `DescribeMasterZones` API to query the primary and secondary AZ list of a region.
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * Applicable only to public network clb. AZ ID, both availability zone ID and name are supported. specify availability zone to create a load balancing instance, for example: 100001 or ap-guangzhou-1. if not passed, queries CVM instances in all azs. if needed, call the API for the query DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to specify availability zone.
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
    * Specifies the Vip to apply for cloud load balancer.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Proceed to purchase cloud load balancer and Tag it at the same time.
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
    * BANDWIDTH PACKAGE ID, which can be obtained through the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) api. specifies this parameter indicates the network billing mode (InternetAccessible.InternetChargeType) supports only billing by BANDWIDTH PACKAGE (BANDWIDTH_PACKAGE).
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Specifies whether the cross-regional or cross-Vpc IP binding feature is supported.
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * Enables cross-regional or cross-Vpc IP binding and creates a SnatIp.
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * Public network exclusive cluster ID or CDCId. can be obtained through the [DescribeExclusiveClusters](https://www.tencentcloud.com/document/product/214/49278?from_cn_redirect=1) api.
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Performance capacity specification. <li>clb.c2.medium (standard type)</li> <li>clb.c3.small (advanced type 1)</li> <li>clb.c3.medium (advanced type 2)</li> <li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li>.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * Specifies the Tag of the Stgw exclusive cluster.
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * Applicable only to private network clb. when connected to nearby, select availability zone for deployment. you can call DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * The unique ID of EIP, such as EIP-qhx8udkc, applicable only to private network clb binding EIP, can be queried through the DescribeAddresses API (https://www.tencentcloud.com/document/product/215/16702?from_cn_redirect=1).
    */
    @SerializedName("EipAddressId")
    @Expose
    private String EipAddressId;

    /**
     * Get Specifies the clb ID. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID. 
     * @return LoadBalancerId Specifies the clb ID. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Specifies the clb ID. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     * @param LoadBalancerId Specifies the clb ID. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to obtain the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Specifies the name of the cloned load balancing instance. rule: 1-60 english letters, chinese characters, digits, connecting lines "-", or underscores "_".
Note: if the name is identical to that of an existing load balancing instance in the system, the system will automatically generate a name for the created cloud load balancer instance. 
     * @return LoadBalancerName Specifies the name of the cloned load balancing instance. rule: 1-60 english letters, chinese characters, digits, connecting lines "-", or underscores "_".
Note: if the name is identical to that of an existing load balancing instance in the system, the system will automatically generate a name for the created cloud load balancer instance.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Specifies the name of the cloned load balancing instance. rule: 1-60 english letters, chinese characters, digits, connecting lines "-", or underscores "_".
Note: if the name is identical to that of an existing load balancing instance in the system, the system will automatically generate a name for the created cloud load balancer instance.
     * @param LoadBalancerName Specifies the name of the cloned load balancing instance. rule: 1-60 english letters, chinese characters, digits, connecting lines "-", or underscores "_".
Note: if the name is identical to that of an existing load balancing instance in the system, the system will automatically generate a name for the created cloud load balancer instance.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not passed in, the default project will be used. 
     * @return ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not passed in, the default project will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not passed in, the default project will be used.
     * @param ProjectId ID of the project to which a CLB instance belongs, which can be obtained through the `DescribeProject` API. If this parameter is not passed in, the default project will be used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Sets the primary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`, which is applicable only to public network CLB.
Note: A primary AZ loads traffic, while a secondary AZ does not load traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can use the `DescribeResource` API to query the primary AZ list of a region. 
     * @return MasterZoneId Sets the primary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`, which is applicable only to public network CLB.
Note: A primary AZ loads traffic, while a secondary AZ does not load traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can use the `DescribeResource` API to query the primary AZ list of a region.
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set Sets the primary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`, which is applicable only to public network CLB.
Note: A primary AZ loads traffic, while a secondary AZ does not load traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can use the `DescribeResource` API to query the primary AZ list of a region.
     * @param MasterZoneId Sets the primary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`, which is applicable only to public network CLB.
Note: A primary AZ loads traffic, while a secondary AZ does not load traffic by default and will be used only if the primary AZ becomes unavailable. The platform will automatically select the optimal secondary AZ. You can use the `DescribeResource` API to query the primary AZ list of a region.
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: A secondary AZ will load traffic if the primary AZ is faulty. You can use the `DescribeMasterZones` API to query the primary and secondary AZ list of a region. 
     * @return SlaveZoneId Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: A secondary AZ will load traffic if the primary AZ is faulty. You can use the `DescribeMasterZones` API to query the primary and secondary AZ list of a region.
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: A secondary AZ will load traffic if the primary AZ is faulty. You can use the `DescribeMasterZones` API to query the primary and secondary AZ list of a region.
     * @param SlaveZoneId Specifies the secondary AZ ID for cross-AZ disaster recovery, such as `100001` or `ap-guangzhou-1`. It is applicable only to public network CLB.
Note: A secondary AZ will load traffic if the primary AZ is faulty. You can use the `DescribeMasterZones` API to query the primary and secondary AZ list of a region.
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get Applicable only to public network clb. AZ ID, both availability zone ID and name are supported. specify availability zone to create a load balancing instance, for example: 100001 or ap-guangzhou-1. if not passed, queries CVM instances in all azs. if needed, call the API for the query DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to specify availability zone. 
     * @return ZoneId Applicable only to public network clb. AZ ID, both availability zone ID and name are supported. specify availability zone to create a load balancing instance, for example: 100001 or ap-guangzhou-1. if not passed, queries CVM instances in all azs. if needed, call the API for the query DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to specify availability zone.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Applicable only to public network clb. AZ ID, both availability zone ID and name are supported. specify availability zone to create a load balancing instance, for example: 100001 or ap-guangzhou-1. if not passed, queries CVM instances in all azs. if needed, call the API for the query DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to specify availability zone.
     * @param ZoneId Applicable only to public network clb. AZ ID, both availability zone ID and name are supported. specify availability zone to create a load balancing instance, for example: 100001 or ap-guangzhou-1. if not passed, queries CVM instances in all azs. if needed, call the API for the query DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to specify availability zone.
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
     * Get Specifies the Vip to apply for cloud load balancer. 
     * @return Vip Specifies the Vip to apply for cloud load balancer.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Specifies the Vip to apply for cloud load balancer.
     * @param Vip Specifies the Vip to apply for cloud load balancer.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Proceed to purchase cloud load balancer and Tag it at the same time. 
     * @return Tags Proceed to purchase cloud load balancer and Tag it at the same time.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Proceed to purchase cloud load balancer and Tag it at the same time.
     * @param Tags Proceed to purchase cloud load balancer and Tag it at the same time.
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
     * Get BANDWIDTH PACKAGE ID, which can be obtained through the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) api. specifies this parameter indicates the network billing mode (InternetAccessible.InternetChargeType) supports only billing by BANDWIDTH PACKAGE (BANDWIDTH_PACKAGE). 
     * @return BandwidthPackageId BANDWIDTH PACKAGE ID, which can be obtained through the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) api. specifies this parameter indicates the network billing mode (InternetAccessible.InternetChargeType) supports only billing by BANDWIDTH PACKAGE (BANDWIDTH_PACKAGE).
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set BANDWIDTH PACKAGE ID, which can be obtained through the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) api. specifies this parameter indicates the network billing mode (InternetAccessible.InternetChargeType) supports only billing by BANDWIDTH PACKAGE (BANDWIDTH_PACKAGE).
     * @param BandwidthPackageId BANDWIDTH PACKAGE ID, which can be obtained through the [DescribeBandwidthPackages](https://www.tencentcloud.com/document/api/215/19209?from_cn_redirect=1) api. specifies this parameter indicates the network billing mode (InternetAccessible.InternetChargeType) supports only billing by BANDWIDTH PACKAGE (BANDWIDTH_PACKAGE).
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get Specifies whether the cross-regional or cross-Vpc IP binding feature is supported. 
     * @return SnatPro Specifies whether the cross-regional or cross-Vpc IP binding feature is supported.
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Specifies whether the cross-regional or cross-Vpc IP binding feature is supported.
     * @param SnatPro Specifies whether the cross-regional or cross-Vpc IP binding feature is supported.
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get Enables cross-regional or cross-Vpc IP binding and creates a SnatIp. 
     * @return SnatIps Enables cross-regional or cross-Vpc IP binding and creates a SnatIp.
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set Enables cross-regional or cross-Vpc IP binding and creates a SnatIp.
     * @param SnatIps Enables cross-regional or cross-Vpc IP binding and creates a SnatIp.
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get Public network exclusive cluster ID or CDCId. can be obtained through the [DescribeExclusiveClusters](https://www.tencentcloud.com/document/product/214/49278?from_cn_redirect=1) api. 
     * @return ClusterIds Public network exclusive cluster ID or CDCId. can be obtained through the [DescribeExclusiveClusters](https://www.tencentcloud.com/document/product/214/49278?from_cn_redirect=1) api.
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Public network exclusive cluster ID or CDCId. can be obtained through the [DescribeExclusiveClusters](https://www.tencentcloud.com/document/product/214/49278?from_cn_redirect=1) api.
     * @param ClusterIds Public network exclusive cluster ID or CDCId. can be obtained through the [DescribeExclusiveClusters](https://www.tencentcloud.com/document/product/214/49278?from_cn_redirect=1) api.
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Performance capacity specification. <li>clb.c2.medium (standard type)</li> <li>clb.c3.small (advanced type 1)</li> <li>clb.c3.medium (advanced type 2)</li> <li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li>. 
     * @return SlaType Performance capacity specification. <li>clb.c2.medium (standard type)</li> <li>clb.c3.small (advanced type 1)</li> <li>clb.c3.medium (advanced type 2)</li> <li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li>.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Performance capacity specification. <li>clb.c2.medium (standard type)</li> <li>clb.c3.small (advanced type 1)</li> <li>clb.c3.medium (advanced type 2)</li> <li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li>.
     * @param SlaType Performance capacity specification. <li>clb.c2.medium (standard type)</li> <li>clb.c3.small (advanced type 1)</li> <li>clb.c3.medium (advanced type 2)</li> <li>clb.c4.small (high-strength type 1)</li> <li>clb.c4.medium (high-strength type 2)</li> <li>clb.c4.large (high-strength type 3)</li> <li>clb.c4.xlarge (high-strength type 4)</li>.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get Specifies the Tag of the Stgw exclusive cluster. 
     * @return ClusterTag Specifies the Tag of the Stgw exclusive cluster.
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set Specifies the Tag of the Stgw exclusive cluster.
     * @param ClusterTag Specifies the Tag of the Stgw exclusive cluster.
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get Applicable only to private network clb. when connected to nearby, select availability zone for deployment. you can call DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list. 
     * @return Zones Applicable only to private network clb. when connected to nearby, select availability zone for deployment. you can call DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Applicable only to private network clb. when connected to nearby, select availability zone for deployment. you can call DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
     * @param Zones Applicable only to private network clb. when connected to nearby, select availability zone for deployment. you can call DescribeZones (https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1) to query the availability zone list.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get The unique ID of EIP, such as EIP-qhx8udkc, applicable only to private network clb binding EIP, can be queried through the DescribeAddresses API (https://www.tencentcloud.com/document/product/215/16702?from_cn_redirect=1). 
     * @return EipAddressId The unique ID of EIP, such as EIP-qhx8udkc, applicable only to private network clb binding EIP, can be queried through the DescribeAddresses API (https://www.tencentcloud.com/document/product/215/16702?from_cn_redirect=1).
     */
    public String getEipAddressId() {
        return this.EipAddressId;
    }

    /**
     * Set The unique ID of EIP, such as EIP-qhx8udkc, applicable only to private network clb binding EIP, can be queried through the DescribeAddresses API (https://www.tencentcloud.com/document/product/215/16702?from_cn_redirect=1).
     * @param EipAddressId The unique ID of EIP, such as EIP-qhx8udkc, applicable only to private network clb binding EIP, can be queried through the DescribeAddresses API (https://www.tencentcloud.com/document/product/215/16702?from_cn_redirect=1).
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

