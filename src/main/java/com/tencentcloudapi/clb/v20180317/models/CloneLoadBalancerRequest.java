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

public class CloneLoadBalancerRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Clones the name of the CLB instance. The name must be 1-60 characters containing letters, numbers, "-" or "_".
Note: if the name of a new CLB instance already exists, a default name will be generated automatically.
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
    * Specifies an AZ ID for creating a CLB instance, such as `ap-guangzhou-1`, which is applicable only to public network CLB instances.
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
    * Applies for CLB instances for a specified VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Tags a CLB instance when purchasing it
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Dedicated cluster information
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * Bandwidth package ID. If this parameter is specified, the network billing mode (`InternetAccessible.InternetChargeType`) will only support bill-by-bandwidth package (`BANDWIDTH_PACKAGE`).
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * Whether to support binding cross-VPC IPs or cross-region IPs
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
    * ID of the public network CLB dedicated cluster
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Guaranteed performance specification.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * Tag of the STGW dedicated cluster
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * Availability zones for nearby access of private network CLB instances to distribute traffic
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance (e.g., `eip-11112222`)
    */
    @SerializedName("EipAddressId")
    @Expose
    private String EipAddressId;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Clones the name of the CLB instance. The name must be 1-60 characters containing letters, numbers, "-" or "_".
Note: if the name of a new CLB instance already exists, a default name will be generated automatically. 
     * @return LoadBalancerName Clones the name of the CLB instance. The name must be 1-60 characters containing letters, numbers, "-" or "_".
Note: if the name of a new CLB instance already exists, a default name will be generated automatically.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Clones the name of the CLB instance. The name must be 1-60 characters containing letters, numbers, "-" or "_".
Note: if the name of a new CLB instance already exists, a default name will be generated automatically.
     * @param LoadBalancerName Clones the name of the CLB instance. The name must be 1-60 characters containing letters, numbers, "-" or "_".
Note: if the name of a new CLB instance already exists, a default name will be generated automatically.
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
     * Get Dedicated cluster information 
     * @return ExclusiveCluster Dedicated cluster information
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set Dedicated cluster information
     * @param ExclusiveCluster Dedicated cluster information
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
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
     * Get Whether to support binding cross-VPC IPs or cross-region IPs 
     * @return SnatPro Whether to support binding cross-VPC IPs or cross-region IPs
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Whether to support binding cross-VPC IPs or cross-region IPs
     * @param SnatPro Whether to support binding cross-VPC IPs or cross-region IPs
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
     * Get ID of the public network CLB dedicated cluster 
     * @return ClusterIds ID of the public network CLB dedicated cluster
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set ID of the public network CLB dedicated cluster
     * @param ClusterIds ID of the public network CLB dedicated cluster
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Guaranteed performance specification. 
     * @return SlaType Guaranteed performance specification.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Guaranteed performance specification.
     * @param SlaType Guaranteed performance specification.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get Tag of the STGW dedicated cluster 
     * @return ClusterTag Tag of the STGW dedicated cluster
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set Tag of the STGW dedicated cluster
     * @param ClusterTag Tag of the STGW dedicated cluster
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get Availability zones for nearby access of private network CLB instances to distribute traffic 
     * @return Zones Availability zones for nearby access of private network CLB instances to distribute traffic
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zones for nearby access of private network CLB instances to distribute traffic
     * @param Zones Availability zones for nearby access of private network CLB instances to distribute traffic
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance (e.g., `eip-11112222`) 
     * @return EipAddressId Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance (e.g., `eip-11112222`)
     */
    public String getEipAddressId() {
        return this.EipAddressId;
    }

    /**
     * Set Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance (e.g., `eip-11112222`)
     * @param EipAddressId Unique ID of an EIP, which can only be used when binding the EIP of a private network CLB instance (e.g., `eip-11112222`)
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

