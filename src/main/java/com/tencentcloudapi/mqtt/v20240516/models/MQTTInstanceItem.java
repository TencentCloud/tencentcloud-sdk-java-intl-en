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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTInstanceItem extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Instance type
BASIC, basic version
PRO, Professional Edition
PLATINUM, platinum version
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance status
RUNNING: running.
MAINTAINING
ABNORMAL
OVERDUE, arrears
CREATING
MODIFYING, Modifying configuration in progress
Creation failed
MODIFY_FAILURE, configuration change failed
DELETING: Deleting
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Maximum number of instance topics
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of topics
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Product specification
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * Elastic TPS throttle value
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * Creation time, with a millisecond-level timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Maximum number of subscriptions for a single client
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * Maximum number of client connections.
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * Whether it is automatically renewed. Only applicable to monthly subscription clusters.
1: Automatic renewal
Non-automatic renewal
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Expiry time, millisecond-level timestamp
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * Predestruction time, millisecond-level timestamp
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * Number of authorization rule entries limit
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * Maximum ca quota
    */
    @SerializedName("MaxCaNum")
    @Expose
    private Long MaxCaNum;

    /**
    * Maximum number of subscriptions
    */
    @SerializedName("MaxSubscription")
    @Expose
    private Long MaxSubscription;

    /**
    * Maximum limit of shared subscription groups
    */
    @SerializedName("SharedSubscriptionGroupLimit")
    @Expose
    private Long SharedSubscriptionGroupLimit;

    /**
    * Number limit of TopicFilter in one shared subscription group
    */
    @SerializedName("MaxTopicFilterPerSharedSubscriptionGroup")
    @Expose
    private Long MaxTopicFilterPerSharedSubscriptionGroup;

    /**
    * Limit on number of auto subscription rules
    */
    @SerializedName("AutoSubscriptionPolicyLimit")
    @Expose
    private Long AutoSubscriptionPolicyLimit;

    /**
    * Number limit of TopicFilter in a single auto subscription rule
    */
    @SerializedName("MaxTopicFilterPerAutoSubscriptionPolicy")
    @Expose
    private Long MaxTopicFilterPerAutoSubscriptionPolicy;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance version 
     * @return Version Instance version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Instance version
     * @param Version Instance version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Instance type
BASIC, basic version
PRO, Professional Edition
PLATINUM, platinum version 
     * @return InstanceType Instance type
BASIC, basic version
PRO, Professional Edition
PLATINUM, platinum version
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
BASIC, basic version
PRO, Professional Edition
PLATINUM, platinum version
     * @param InstanceType Instance type
BASIC, basic version
PRO, Professional Edition
PLATINUM, platinum version
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance status
RUNNING: running.
MAINTAINING
ABNORMAL
OVERDUE, arrears
CREATING
MODIFYING, Modifying configuration in progress
Creation failed
MODIFY_FAILURE, configuration change failed
DELETING: Deleting 
     * @return InstanceStatus Instance status
RUNNING: running.
MAINTAINING
ABNORMAL
OVERDUE, arrears
CREATING
MODIFYING, Modifying configuration in progress
Creation failed
MODIFY_FAILURE, configuration change failed
DELETING: Deleting
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status
RUNNING: running.
MAINTAINING
ABNORMAL
OVERDUE, arrears
CREATING
MODIFYING, Modifying configuration in progress
Creation failed
MODIFY_FAILURE, configuration change failed
DELETING: Deleting
     * @param InstanceStatus Instance status
RUNNING: running.
MAINTAINING
ABNORMAL
OVERDUE, arrears
CREATING
MODIFYING, Modifying configuration in progress
Creation failed
MODIFY_FAILURE, configuration change failed
DELETING: Deleting
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Maximum number of instance topics 
     * @return TopicNumLimit Maximum number of instance topics
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set Maximum number of instance topics
     * @param TopicNumLimit Maximum number of instance topics
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
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
     * Get Number of topics 
     * @return TopicNum Number of topics
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Number of topics
     * @param TopicNum Number of topics
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Product specification 
     * @return SkuCode Product specification
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Product specification
     * @param SkuCode Product specification
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get Elastic TPS throttle value 
     * @return TpsLimit Elastic TPS throttle value
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set Elastic TPS throttle value
     * @param TpsLimit Elastic TPS throttle value
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get Creation time, with a millisecond-level timestamp. 
     * @return CreateTime Creation time, with a millisecond-level timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, with a millisecond-level timestamp.
     * @param CreateTime Creation time, with a millisecond-level timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Maximum number of subscriptions for a single client 
     * @return MaxSubscriptionPerClient Maximum number of subscriptions for a single client
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set Maximum number of subscriptions for a single client
     * @param MaxSubscriptionPerClient Maximum number of subscriptions for a single client
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get Maximum number of client connections. 
     * @return ClientNumLimit Maximum number of client connections.
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set Maximum number of client connections.
     * @param ClientNumLimit Maximum number of client connections.
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get Whether it is automatically renewed. Only applicable to monthly subscription clusters.
1: Automatic renewal
Non-automatic renewal 
     * @return RenewFlag Whether it is automatically renewed. Only applicable to monthly subscription clusters.
1: Automatic renewal
Non-automatic renewal
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether it is automatically renewed. Only applicable to monthly subscription clusters.
1: Automatic renewal
Non-automatic renewal
     * @param RenewFlag Whether it is automatically renewed. Only applicable to monthly subscription clusters.
1: Automatic renewal
Non-automatic renewal
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription 
     * @return PayMode Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription
     * @param PayMode Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Expiry time, millisecond-level timestamp 
     * @return ExpiryTime Expiry time, millisecond-level timestamp
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set Expiry time, millisecond-level timestamp
     * @param ExpiryTime Expiry time, millisecond-level timestamp
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get Predestruction time, millisecond-level timestamp 
     * @return DestroyTime Predestruction time, millisecond-level timestamp
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set Predestruction time, millisecond-level timestamp
     * @param DestroyTime Predestruction time, millisecond-level timestamp
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get Number of authorization rule entries limit 
     * @return AuthorizationPolicyLimit Number of authorization rule entries limit
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set Number of authorization rule entries limit
     * @param AuthorizationPolicyLimit Number of authorization rule entries limit
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
    }

    /**
     * Get Maximum ca quota 
     * @return MaxCaNum Maximum ca quota
     */
    public Long getMaxCaNum() {
        return this.MaxCaNum;
    }

    /**
     * Set Maximum ca quota
     * @param MaxCaNum Maximum ca quota
     */
    public void setMaxCaNum(Long MaxCaNum) {
        this.MaxCaNum = MaxCaNum;
    }

    /**
     * Get Maximum number of subscriptions 
     * @return MaxSubscription Maximum number of subscriptions
     */
    public Long getMaxSubscription() {
        return this.MaxSubscription;
    }

    /**
     * Set Maximum number of subscriptions
     * @param MaxSubscription Maximum number of subscriptions
     */
    public void setMaxSubscription(Long MaxSubscription) {
        this.MaxSubscription = MaxSubscription;
    }

    /**
     * Get Maximum limit of shared subscription groups 
     * @return SharedSubscriptionGroupLimit Maximum limit of shared subscription groups
     */
    public Long getSharedSubscriptionGroupLimit() {
        return this.SharedSubscriptionGroupLimit;
    }

    /**
     * Set Maximum limit of shared subscription groups
     * @param SharedSubscriptionGroupLimit Maximum limit of shared subscription groups
     */
    public void setSharedSubscriptionGroupLimit(Long SharedSubscriptionGroupLimit) {
        this.SharedSubscriptionGroupLimit = SharedSubscriptionGroupLimit;
    }

    /**
     * Get Number limit of TopicFilter in one shared subscription group 
     * @return MaxTopicFilterPerSharedSubscriptionGroup Number limit of TopicFilter in one shared subscription group
     */
    public Long getMaxTopicFilterPerSharedSubscriptionGroup() {
        return this.MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Set Number limit of TopicFilter in one shared subscription group
     * @param MaxTopicFilterPerSharedSubscriptionGroup Number limit of TopicFilter in one shared subscription group
     */
    public void setMaxTopicFilterPerSharedSubscriptionGroup(Long MaxTopicFilterPerSharedSubscriptionGroup) {
        this.MaxTopicFilterPerSharedSubscriptionGroup = MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Get Limit on number of auto subscription rules 
     * @return AutoSubscriptionPolicyLimit Limit on number of auto subscription rules
     */
    public Long getAutoSubscriptionPolicyLimit() {
        return this.AutoSubscriptionPolicyLimit;
    }

    /**
     * Set Limit on number of auto subscription rules
     * @param AutoSubscriptionPolicyLimit Limit on number of auto subscription rules
     */
    public void setAutoSubscriptionPolicyLimit(Long AutoSubscriptionPolicyLimit) {
        this.AutoSubscriptionPolicyLimit = AutoSubscriptionPolicyLimit;
    }

    /**
     * Get Number limit of TopicFilter in a single auto subscription rule 
     * @return MaxTopicFilterPerAutoSubscriptionPolicy Number limit of TopicFilter in a single auto subscription rule
     */
    public Long getMaxTopicFilterPerAutoSubscriptionPolicy() {
        return this.MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Set Number limit of TopicFilter in a single auto subscription rule
     * @param MaxTopicFilterPerAutoSubscriptionPolicy Number limit of TopicFilter in a single auto subscription rule
     */
    public void setMaxTopicFilterPerAutoSubscriptionPolicy(Long MaxTopicFilterPerAutoSubscriptionPolicy) {
        this.MaxTopicFilterPerAutoSubscriptionPolicy = MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    public MQTTInstanceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTInstanceItem(MQTTInstanceItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.MaxSubscriptionPerClient != null) {
            this.MaxSubscriptionPerClient = new Long(source.MaxSubscriptionPerClient);
        }
        if (source.ClientNumLimit != null) {
            this.ClientNumLimit = new Long(source.ClientNumLimit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ExpiryTime != null) {
            this.ExpiryTime = new Long(source.ExpiryTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new Long(source.DestroyTime);
        }
        if (source.AuthorizationPolicyLimit != null) {
            this.AuthorizationPolicyLimit = new Long(source.AuthorizationPolicyLimit);
        }
        if (source.MaxCaNum != null) {
            this.MaxCaNum = new Long(source.MaxCaNum);
        }
        if (source.MaxSubscription != null) {
            this.MaxSubscription = new Long(source.MaxSubscription);
        }
        if (source.SharedSubscriptionGroupLimit != null) {
            this.SharedSubscriptionGroupLimit = new Long(source.SharedSubscriptionGroupLimit);
        }
        if (source.MaxTopicFilterPerSharedSubscriptionGroup != null) {
            this.MaxTopicFilterPerSharedSubscriptionGroup = new Long(source.MaxTopicFilterPerSharedSubscriptionGroup);
        }
        if (source.AutoSubscriptionPolicyLimit != null) {
            this.AutoSubscriptionPolicyLimit = new Long(source.AutoSubscriptionPolicyLimit);
        }
        if (source.MaxTopicFilterPerAutoSubscriptionPolicy != null) {
            this.MaxTopicFilterPerAutoSubscriptionPolicy = new Long(source.MaxTopicFilterPerAutoSubscriptionPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MaxSubscriptionPerClient", this.MaxSubscriptionPerClient);
        this.setParamSimple(map, prefix + "ClientNumLimit", this.ClientNumLimit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "AuthorizationPolicyLimit", this.AuthorizationPolicyLimit);
        this.setParamSimple(map, prefix + "MaxCaNum", this.MaxCaNum);
        this.setParamSimple(map, prefix + "MaxSubscription", this.MaxSubscription);
        this.setParamSimple(map, prefix + "SharedSubscriptionGroupLimit", this.SharedSubscriptionGroupLimit);
        this.setParamSimple(map, prefix + "MaxTopicFilterPerSharedSubscriptionGroup", this.MaxTopicFilterPerSharedSubscriptionGroup);
        this.setParamSimple(map, prefix + "AutoSubscriptionPolicyLimit", this.AutoSubscriptionPolicyLimit);
        this.setParamSimple(map, prefix + "MaxTopicFilterPerAutoSubscriptionPolicy", this.MaxTopicFilterPerAutoSubscriptionPolicy);

    }
}

