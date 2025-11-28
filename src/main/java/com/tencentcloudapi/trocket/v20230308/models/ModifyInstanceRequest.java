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

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name. It cannot be left blank. It can contain 3 to 64 characters consisting of only digits, letters, hyphens (-), and underscores (_).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Remarks. Up to 128 characters are allowed.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Message sending and receiving ratio
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * Whether to enable elastic TPS.
    */
    @SerializedName("ScaledTpsEnabled")
    @Expose
    private Boolean ScaledTpsEnabled;

    /**
    * Whether ACL is enabled.
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * The maximum number of topics that can be created. value ranges from...to... refer to the ProductSKU output parameter in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Minimum value and default value: TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * Number of topics not included in the free quota. For the free quota, see the TopicNumLimit parameter in the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
    */
    @SerializedName("ExtraTopicNum")
    @Expose
    private String ExtraTopicNum;

    /**
    * Whether to enable deletion protection
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. It cannot be left blank. It can contain 3 to 64 characters consisting of only digits, letters, hyphens (-), and underscores (_). 
     * @return Name Instance name. It cannot be left blank. It can contain 3 to 64 characters consisting of only digits, letters, hyphens (-), and underscores (_).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name. It cannot be left blank. It can contain 3 to 64 characters consisting of only digits, letters, hyphens (-), and underscores (_).
     * @param Name Instance name. It cannot be left blank. It can contain 3 to 64 characters consisting of only digits, letters, hyphens (-), and underscores (_).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Remarks. Up to 128 characters are allowed. 
     * @return Remark Remarks. Up to 128 characters are allowed.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks. Up to 128 characters are allowed.
     * @param Remark Remarks. Up to 128 characters are allowed.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Message sending and receiving ratio 
     * @return SendReceiveRatio Message sending and receiving ratio
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set Message sending and receiving ratio
     * @param SendReceiveRatio Message sending and receiving ratio
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1). 
     * @return SkuCode Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
     * @param SkuCode Product specification. It can be obtained from the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter. 
     * @return MessageRetention Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
     * @param MessageRetention Message retention time (unit: hr). value range refers to the ProductSKU response parameters structure in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).

-Default value: DefaultRetention parameter.
-Minimum value: specifies the RetentionLowerLimit parameter.
-Specifies the maximum value of the RetentionUpperLimit parameter.
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get Whether to enable elastic TPS. 
     * @return ScaledTpsEnabled Whether to enable elastic TPS.
     */
    public Boolean getScaledTpsEnabled() {
        return this.ScaledTpsEnabled;
    }

    /**
     * Set Whether to enable elastic TPS.
     * @param ScaledTpsEnabled Whether to enable elastic TPS.
     */
    public void setScaledTpsEnabled(Boolean ScaledTpsEnabled) {
        this.ScaledTpsEnabled = ScaledTpsEnabled;
    }

    /**
     * Get Whether ACL is enabled. 
     * @return AclEnabled Whether ACL is enabled.
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set Whether ACL is enabled.
     * @param AclEnabled Whether ACL is enabled.
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get The maximum number of topics that can be created. value ranges from...to... refer to the ProductSKU output parameter in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Minimum value and default value: TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter. 
     * @return MaxTopicNum The maximum number of topics that can be created. value ranges from...to... refer to the ProductSKU output parameter in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Minimum value and default value: TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set The maximum number of topics that can be created. value ranges from...to... refer to the ProductSKU output parameter in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Minimum value and default value: TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
     * @param MaxTopicNum The maximum number of topics that can be created. value ranges from...to... refer to the ProductSKU output parameter in the DescribeProductSKUs api (https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1) (https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU).

-Minimum value and default value: TopicNumLimit parameter.
-Maximum value of TopicNumUpperLimit parameter.
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get Number of topics not included in the free quota. For the free quota, see the TopicNumLimit parameter in the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1). 
     * @return ExtraTopicNum Number of topics not included in the free quota. For the free quota, see the TopicNumLimit parameter in the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
     */
    public String getExtraTopicNum() {
        return this.ExtraTopicNum;
    }

    /**
     * Set Number of topics not included in the free quota. For the free quota, see the TopicNumLimit parameter in the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
     * @param ExtraTopicNum Number of topics not included in the free quota. For the free quota, see the TopicNumLimit parameter in the output parameters of [ProductSKU](https://www.tencentcloud.comom/document/api/1493/96031?from_cn_redirect=1#ProductSKU) of the API [DescribeProductSKUs](https://www.tencentcloud.comom/document/api/1493/107676?from_cn_redirect=1).
     */
    public void setExtraTopicNum(String ExtraTopicNum) {
        this.ExtraTopicNum = ExtraTopicNum;
    }

    /**
     * Get Whether to enable deletion protection 
     * @return EnableDeletionProtection Whether to enable deletion protection
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set Whether to enable deletion protection
     * @param EnableDeletionProtection Whether to enable deletion protection
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.ScaledTpsEnabled != null) {
            this.ScaledTpsEnabled = new Boolean(source.ScaledTpsEnabled);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
        }
        if (source.ExtraTopicNum != null) {
            this.ExtraTopicNum = new String(source.ExtraTopicNum);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "ScaledTpsEnabled", this.ScaledTpsEnabled);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamSimple(map, prefix + "ExtraTopicNum", this.ExtraTopicNum);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

