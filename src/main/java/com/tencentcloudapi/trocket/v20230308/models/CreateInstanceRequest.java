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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * Instance type. valid values are as follows:.

-EXPERIMENT: specifies the trial version.

- BASIC: BASIC edition.

-PRO edition.

-PLATINUM: platinum version.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Cluster name. values cannot be empty. 3-64 characters, only comprised of digits, letters, "-", and "_".
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * Specifies the VPC information bound to the cluster.
    */
    @SerializedName("VpcList")
    @Expose
    private VpcInfo [] VpcList;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Tag list
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Whether public network access is enabled. the default value of false means not enabled.
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * Whether the public network is billed by traffic. the default value is false, which indicates that the public network is not billed by traffic.
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
    * Public network bandwidth (unit: mbps). the default value is 0. if public network access is enabled, this field must be a positive integer above 0.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Public network access allowlist. if left blank, it means deny all IP access.
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * Payment mode (0: postpaid; 1: prepaid). the default value is 0.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Whether the prepaid cluster is automatically renewed (0: no auto-renewal; 1: auto-renewal). default value: 0.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Specifies the purchase duration (unit: month) for a prepaid cluster. value range: 1–60. default value: 1.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Specifies the maximum number of topics that can be created. obtained from the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Default value and minimum value: specifies the TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * Deployment AZ list. obtain from the [ZoneInfo](https://www.tencentcloud.com/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) data structure returned by the api [DescribeZones](https://www.tencentcloud.com/document/product/1596/77929?from_cn_redirect=1).
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
     * Get Instance type. valid values are as follows:.

-EXPERIMENT: specifies the trial version.

- BASIC: BASIC edition.

-PRO edition.

-PLATINUM: platinum version. 
     * @return InstanceType Instance type. valid values are as follows:.

-EXPERIMENT: specifies the trial version.

- BASIC: BASIC edition.

-PRO edition.

-PLATINUM: platinum version.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. valid values are as follows:.

-EXPERIMENT: specifies the trial version.

- BASIC: BASIC edition.

-PRO edition.

-PLATINUM: platinum version.
     * @param InstanceType Instance type. valid values are as follows:.

-EXPERIMENT: specifies the trial version.

- BASIC: BASIC edition.

-PRO edition.

-PLATINUM: platinum version.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Cluster name. values cannot be empty. 3-64 characters, only comprised of digits, letters, "-", and "_". 
     * @return Name Cluster name. values cannot be empty. 3-64 characters, only comprised of digits, letters, "-", and "_".
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cluster name. values cannot be empty. 3-64 characters, only comprised of digits, letters, "-", and "_".
     * @param Name Cluster name. values cannot be empty. 3-64 characters, only comprised of digits, letters, "-", and "_".
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1). 
     * @return SkuCode Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).
     * @param SkuCode Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get Specifies the VPC information bound to the cluster. 
     * @return VpcList Specifies the VPC information bound to the cluster.
     */
    public VpcInfo [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set Specifies the VPC information bound to the cluster.
     * @param VpcList Specifies the VPC information bound to the cluster.
     */
    public void setVpcList(VpcInfo [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Tag list 
     * @return TagList Tag list
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag list
     * @param TagList Tag list
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Whether public network access is enabled. the default value of false means not enabled. 
     * @return EnablePublic Whether public network access is enabled. the default value of false means not enabled.
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set Whether public network access is enabled. the default value of false means not enabled.
     * @param EnablePublic Whether public network access is enabled. the default value of false means not enabled.
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get Whether the public network is billed by traffic. the default value is false, which indicates that the public network is not billed by traffic. 
     * @return BillingFlow Whether the public network is billed by traffic. the default value is false, which indicates that the public network is not billed by traffic.
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set Whether the public network is billed by traffic. the default value is false, which indicates that the public network is not billed by traffic.
     * @param BillingFlow Whether the public network is billed by traffic. the default value is false, which indicates that the public network is not billed by traffic.
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    /**
     * Get Public network bandwidth (unit: mbps). the default value is 0. if public network access is enabled, this field must be a positive integer above 0. 
     * @return Bandwidth Public network bandwidth (unit: mbps). the default value is 0. if public network access is enabled, this field must be a positive integer above 0.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Public network bandwidth (unit: mbps). the default value is 0. if public network access is enabled, this field must be a positive integer above 0.
     * @param Bandwidth Public network bandwidth (unit: mbps). the default value is 0. if public network access is enabled, this field must be a positive integer above 0.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Public network access allowlist. if left blank, it means deny all IP access. 
     * @return IpRules Public network access allowlist. if left blank, it means deny all IP access.
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set Public network access allowlist. if left blank, it means deny all IP access.
     * @param IpRules Public network access allowlist. if left blank, it means deny all IP access.
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter. 
     * @return MessageRetention Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
     * @param MessageRetention Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get Payment mode (0: postpaid; 1: prepaid). the default value is 0. 
     * @return PayMode Payment mode (0: postpaid; 1: prepaid). the default value is 0.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode (0: postpaid; 1: prepaid). the default value is 0.
     * @param PayMode Payment mode (0: postpaid; 1: prepaid). the default value is 0.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether the prepaid cluster is automatically renewed (0: no auto-renewal; 1: auto-renewal). default value: 0. 
     * @return RenewFlag Whether the prepaid cluster is automatically renewed (0: no auto-renewal; 1: auto-renewal). default value: 0.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether the prepaid cluster is automatically renewed (0: no auto-renewal; 1: auto-renewal). default value: 0.
     * @param RenewFlag Whether the prepaid cluster is automatically renewed (0: no auto-renewal; 1: auto-renewal). default value: 0.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Specifies the purchase duration (unit: month) for a prepaid cluster. value range: 1–60. default value: 1. 
     * @return TimeSpan Specifies the purchase duration (unit: month) for a prepaid cluster. value range: 1–60. default value: 1.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Specifies the purchase duration (unit: month) for a prepaid cluster. value range: 1–60. default value: 1.
     * @param TimeSpan Specifies the purchase duration (unit: month) for a prepaid cluster. value range: 1–60. default value: 1.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Specifies the maximum number of topics that can be created. obtained from the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Default value and minimum value: specifies the TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter. 
     * @return MaxTopicNum Specifies the maximum number of topics that can be created. obtained from the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Default value and minimum value: specifies the TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set Specifies the maximum number of topics that can be created. obtained from the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Default value and minimum value: specifies the TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
     * @param MaxTopicNum Specifies the maximum number of topics that can be created. obtained from the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.com/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Default value and minimum value: specifies the TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get Deployment AZ list. obtain from the [ZoneInfo](https://www.tencentcloud.com/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) data structure returned by the api [DescribeZones](https://www.tencentcloud.com/document/product/1596/77929?from_cn_redirect=1). 
     * @return ZoneIds Deployment AZ list. obtain from the [ZoneInfo](https://www.tencentcloud.com/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) data structure returned by the api [DescribeZones](https://www.tencentcloud.com/document/product/1596/77929?from_cn_redirect=1).
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Deployment AZ list. obtain from the [ZoneInfo](https://www.tencentcloud.com/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) data structure returned by the api [DescribeZones](https://www.tencentcloud.com/document/product/1596/77929?from_cn_redirect=1).
     * @param ZoneIds Deployment AZ list. obtain from the [ZoneInfo](https://www.tencentcloud.com/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) data structure returned by the api [DescribeZones](https://www.tencentcloud.com/document/product/1596/77929?from_cn_redirect=1).
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.VpcList != null) {
            this.VpcList = new VpcInfo[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new VpcInfo(source.VpcList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.EnablePublic != null) {
            this.EnablePublic = new Boolean(source.EnablePublic);
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamArrayObj(map, prefix + "VpcList.", this.VpcList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "EnablePublic", this.EnablePublic);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

