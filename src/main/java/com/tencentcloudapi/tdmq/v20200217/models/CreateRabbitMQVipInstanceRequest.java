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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRabbitMQVipInstanceRequest extends AbstractModel {

    /**
    * AZ
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * vpc ID, such as vpc-xxx. valid VpcId can be obtained by logging in to the virtual private cloud console (https://console.cloud.tencent.com/vpc/vpc?rid=1) or via api call to DescribeVpcEx (https://www.tencentcloud.com/document/api/215/1372?from_cn_redirect=1), retrieving the unVpcId field from the api response. if both VpcId and SubnetId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The subnet ID of the vpc, such as subnet-xxx. valid subnet ids can be queried by logging in to the subnet console (https://console.cloud.tencent.com/vpc/subnet?rid=1) or by calling the api [DescribeSubnets](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) and obtaining the unSubnetId field from the api response. if both SubnetId and VpcId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Node specification of the cluster. need to enter the corresponding specification flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
    */
    @SerializedName("NodeSpec")
    @Expose
    private String NodeSpec;

    /**
    * Number of nodes, which is at least three for multi-AZ deployment. If this parameter is left empty, the value will be set to 1 for single-AZ deployment and 3 for multi-AZ deployment by default.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Storage capacity of a single node, which is 200 GB by default.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * Whether the default image queue is enabled. true means enabled, false means not enabled. defaults to false if not specified.
    */
    @SerializedName("EnableCreateDefaultHaMirrorQueue")
    @Expose
    private Boolean EnableCreateDefaultHaMirrorQueue;

    /**
    * Only applies to prepaid clusters (when PayMode parameter is 1). specifies whether the cluster is automatically renewed. true means auto-renewal is enabled. the default is true if not specified.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * Validity period, which is one month by default.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Payment mode. 0: postpaid, (pay-as-you-go); 1: prepaid (monthly subscription). Monthly subscription is used by default.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Specifies the cluster edition. defaults to 3.8.30. valid values: 3.8.30, 3.11.8, 3.13.7.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Whether the request is from the international website. Default value: false.
    */
    @SerializedName("IsIntl")
    @Expose
    private Boolean IsIntl;

    /**
    * Resource tag list.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Specifies the public bandwidth size in Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Whether to enable public network access. If this parameter is not specified, the value is false by default.
    */
    @SerializedName("EnablePublicAccess")
    @Expose
    private Boolean EnablePublicAccess;

    /**
    * Whether to enable cluster deletion protection. if this parameter is not specified, the value is false by default.
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
     * Get AZ 
     * @return ZoneIds AZ
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set AZ
     * @param ZoneIds AZ
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get vpc ID, such as vpc-xxx. valid VpcId can be obtained by logging in to the virtual private cloud console (https://console.cloud.tencent.com/vpc/vpc?rid=1) or via api call to DescribeVpcEx (https://www.tencentcloud.com/document/api/215/1372?from_cn_redirect=1), retrieving the unVpcId field from the api response. if both VpcId and SubnetId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used. 
     * @return VpcId vpc ID, such as vpc-xxx. valid VpcId can be obtained by logging in to the virtual private cloud console (https://console.cloud.tencent.com/vpc/vpc?rid=1) or via api call to DescribeVpcEx (https://www.tencentcloud.com/document/api/215/1372?from_cn_redirect=1), retrieving the unVpcId field from the api response. if both VpcId and SubnetId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc ID, such as vpc-xxx. valid VpcId can be obtained by logging in to the virtual private cloud console (https://console.cloud.tencent.com/vpc/vpc?rid=1) or via api call to DescribeVpcEx (https://www.tencentcloud.com/document/api/215/1372?from_cn_redirect=1), retrieving the unVpcId field from the api response. if both VpcId and SubnetId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
     * @param VpcId vpc ID, such as vpc-xxx. valid VpcId can be obtained by logging in to the virtual private cloud console (https://console.cloud.tencent.com/vpc/vpc?rid=1) or via api call to DescribeVpcEx (https://www.tencentcloud.com/document/api/215/1372?from_cn_redirect=1), retrieving the unVpcId field from the api response. if both VpcId and SubnetId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The subnet ID of the vpc, such as subnet-xxx. valid subnet ids can be queried by logging in to the subnet console (https://console.cloud.tencent.com/vpc/subnet?rid=1) or by calling the api [DescribeSubnets](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) and obtaining the unSubnetId field from the api response. if both SubnetId and VpcId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used. 
     * @return SubnetId The subnet ID of the vpc, such as subnet-xxx. valid subnet ids can be queried by logging in to the subnet console (https://console.cloud.tencent.com/vpc/subnet?rid=1) or by calling the api [DescribeSubnets](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) and obtaining the unSubnetId field from the api response. if both SubnetId and VpcId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The subnet ID of the vpc, such as subnet-xxx. valid subnet ids can be queried by logging in to the subnet console (https://console.cloud.tencent.com/vpc/subnet?rid=1) or by calling the api [DescribeSubnets](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) and obtaining the unSubnetId field from the api response. if both SubnetId and VpcId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
     * @param SubnetId The subnet ID of the vpc, such as subnet-xxx. valid subnet ids can be queried by logging in to the subnet console (https://console.cloud.tencent.com/vpc/subnet?rid=1) or by calling the api [DescribeSubnets](https://www.tencentcloud.com/document/api/215/15784?from_cn_redirect=1) and obtaining the unSubnetId field from the api response. if both SubnetId and VpcId are set to DEFAULT when creating an instance, the DEFAULT vpc network will be forcibly used.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Node specification of the cluster. need to enter the corresponding specification flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1. 
     * @return NodeSpec Node specification of the cluster. need to enter the corresponding specification flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
     */
    public String getNodeSpec() {
        return this.NodeSpec;
    }

    /**
     * Set Node specification of the cluster. need to enter the corresponding specification flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
     * @param NodeSpec Node specification of the cluster. need to enter the corresponding specification flag.
2C8G:rabbit-vip-profession-2c8g
4C16G:rabbit-vip-profession-4c16g
8C32G:rabbit-vip-profession-8c32g
16C32G:rabbit-vip-basic-4
16C64G:rabbit-vip-profession-16c64g
2C4G:rabbit-vip-basic-5
4C8G:rabbit-vip-basic-1
8C16G (sold out): rabbit-vip-basic-2.
Specifies the default value as 4C8G: rabbit-vip-basic-1.
     */
    public void setNodeSpec(String NodeSpec) {
        this.NodeSpec = NodeSpec;
    }

    /**
     * Get Number of nodes, which is at least three for multi-AZ deployment. If this parameter is left empty, the value will be set to 1 for single-AZ deployment and 3 for multi-AZ deployment by default. 
     * @return NodeNum Number of nodes, which is at least three for multi-AZ deployment. If this parameter is left empty, the value will be set to 1 for single-AZ deployment and 3 for multi-AZ deployment by default.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of nodes, which is at least three for multi-AZ deployment. If this parameter is left empty, the value will be set to 1 for single-AZ deployment and 3 for multi-AZ deployment by default.
     * @param NodeNum Number of nodes, which is at least three for multi-AZ deployment. If this parameter is left empty, the value will be set to 1 for single-AZ deployment and 3 for multi-AZ deployment by default.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Storage capacity of a single node, which is 200 GB by default. 
     * @return StorageSize Storage capacity of a single node, which is 200 GB by default.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Storage capacity of a single node, which is 200 GB by default.
     * @param StorageSize Storage capacity of a single node, which is 200 GB by default.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get Whether the default image queue is enabled. true means enabled, false means not enabled. defaults to false if not specified. 
     * @return EnableCreateDefaultHaMirrorQueue Whether the default image queue is enabled. true means enabled, false means not enabled. defaults to false if not specified.
     */
    public Boolean getEnableCreateDefaultHaMirrorQueue() {
        return this.EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Set Whether the default image queue is enabled. true means enabled, false means not enabled. defaults to false if not specified.
     * @param EnableCreateDefaultHaMirrorQueue Whether the default image queue is enabled. true means enabled, false means not enabled. defaults to false if not specified.
     */
    public void setEnableCreateDefaultHaMirrorQueue(Boolean EnableCreateDefaultHaMirrorQueue) {
        this.EnableCreateDefaultHaMirrorQueue = EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Get Only applies to prepaid clusters (when PayMode parameter is 1). specifies whether the cluster is automatically renewed. true means auto-renewal is enabled. the default is true if not specified. 
     * @return AutoRenewFlag Only applies to prepaid clusters (when PayMode parameter is 1). specifies whether the cluster is automatically renewed. true means auto-renewal is enabled. the default is true if not specified.
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Only applies to prepaid clusters (when PayMode parameter is 1). specifies whether the cluster is automatically renewed. true means auto-renewal is enabled. the default is true if not specified.
     * @param AutoRenewFlag Only applies to prepaid clusters (when PayMode parameter is 1). specifies whether the cluster is automatically renewed. true means auto-renewal is enabled. the default is true if not specified.
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Validity period, which is one month by default. 
     * @return TimeSpan Validity period, which is one month by default.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Validity period, which is one month by default.
     * @param TimeSpan Validity period, which is one month by default.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Payment mode. 0: postpaid, (pay-as-you-go); 1: prepaid (monthly subscription). Monthly subscription is used by default. 
     * @return PayMode Payment mode. 0: postpaid, (pay-as-you-go); 1: prepaid (monthly subscription). Monthly subscription is used by default.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode. 0: postpaid, (pay-as-you-go); 1: prepaid (monthly subscription). Monthly subscription is used by default.
     * @param PayMode Payment mode. 0: postpaid, (pay-as-you-go); 1: prepaid (monthly subscription). Monthly subscription is used by default.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Specifies the cluster edition. defaults to 3.8.30. valid values: 3.8.30, 3.11.8, 3.13.7. 
     * @return ClusterVersion Specifies the cluster edition. defaults to 3.8.30. valid values: 3.8.30, 3.11.8, 3.13.7.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Specifies the cluster edition. defaults to 3.8.30. valid values: 3.8.30, 3.11.8, 3.13.7.
     * @param ClusterVersion Specifies the cluster edition. defaults to 3.8.30. valid values: 3.8.30, 3.11.8, 3.13.7.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Whether the request is from the international website. Default value: false. 
     * @return IsIntl Whether the request is from the international website. Default value: false.
     */
    public Boolean getIsIntl() {
        return this.IsIntl;
    }

    /**
     * Set Whether the request is from the international website. Default value: false.
     * @param IsIntl Whether the request is from the international website. Default value: false.
     */
    public void setIsIntl(Boolean IsIntl) {
        this.IsIntl = IsIntl;
    }

    /**
     * Get Resource tag list. 
     * @return ResourceTags Resource tag list.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Resource tag list.
     * @param ResourceTags Resource tag list.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Specifies the public bandwidth size in Mbps. 
     * @return Bandwidth Specifies the public bandwidth size in Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Specifies the public bandwidth size in Mbps.
     * @param Bandwidth Specifies the public bandwidth size in Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Whether to enable public network access. If this parameter is not specified, the value is false by default. 
     * @return EnablePublicAccess Whether to enable public network access. If this parameter is not specified, the value is false by default.
     */
    public Boolean getEnablePublicAccess() {
        return this.EnablePublicAccess;
    }

    /**
     * Set Whether to enable public network access. If this parameter is not specified, the value is false by default.
     * @param EnablePublicAccess Whether to enable public network access. If this parameter is not specified, the value is false by default.
     */
    public void setEnablePublicAccess(Boolean EnablePublicAccess) {
        this.EnablePublicAccess = EnablePublicAccess;
    }

    /**
     * Get Whether to enable cluster deletion protection. if this parameter is not specified, the value is false by default. 
     * @return EnableDeletionProtection Whether to enable cluster deletion protection. if this parameter is not specified, the value is false by default.
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set Whether to enable cluster deletion protection. if this parameter is not specified, the value is false by default.
     * @param EnableDeletionProtection Whether to enable cluster deletion protection. if this parameter is not specified, the value is false by default.
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public CreateRabbitMQVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQVipInstanceRequest(CreateRabbitMQVipInstanceRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NodeSpec != null) {
            this.NodeSpec = new String(source.NodeSpec);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.EnableCreateDefaultHaMirrorQueue != null) {
            this.EnableCreateDefaultHaMirrorQueue = new Boolean(source.EnableCreateDefaultHaMirrorQueue);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.IsIntl != null) {
            this.IsIntl = new Boolean(source.IsIntl);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.EnablePublicAccess != null) {
            this.EnablePublicAccess = new Boolean(source.EnablePublicAccess);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NodeSpec", this.NodeSpec);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "EnableCreateDefaultHaMirrorQueue", this.EnableCreateDefaultHaMirrorQueue);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "IsIntl", this.IsIntl);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "EnablePublicAccess", this.EnablePublicAccess);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

