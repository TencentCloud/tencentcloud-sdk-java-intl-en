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

public class DescribeInstanceResponse extends AbstractModel {

    /**
    * Instance type
BASIC: basic edition.
PRO edition.
PLATINUM edition.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Number of topics
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Maximum number of topics per instance
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * TPS throttle value
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * Creation time, in seconds
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Instance status. RUNNING: running; MAINTAINING: maintaining; ABNORMAL: abnormal; OVERDUE: in arrears; DESTROYED: deleted; CREATING: creating; MODIFYING: adjusting the configuration; CREATE_FAILURE: creation failed; MODIFY_FAILURE: configuration adjustment failed; DELETING: deleting.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Specifies the instance specification.
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * Maximum number of subscriptions for a single client.
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * Number of authorization rules.
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * Maximum number of clients.
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * Specifies whether to automatically activate the device certificate during automatic registration.
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

    /**
    * Whether the instance is automatically renewed. this parameter is valid only for monthly subscription clusters. valid values: 1 (auto-renewal), 0 (non-automatic renewal).
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Billing mode. POSTPAID: pay-as-you-go billing. PREPAID: monthly subscription.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Expiry time. millisecond-level timestamp.
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * Scheduled destruction time. millisecond-level timestamp.
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * TLS, one-way authentication. mTLS, mutual authentication. BYOC, one certificate per device.
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * Specifies the maximum Ca quota.
    */
    @SerializedName("MaxCaNum")
    @Expose
    private Long MaxCaNum;

    /**
    * FPS cert registration code.
    */
    @SerializedName("RegistrationCode")
    @Expose
    private String RegistrationCode;

    /**
    * Maximum number of subscriptions for a cluster.
    */
    @SerializedName("MaxSubscription")
    @Expose
    private Long MaxSubscription;

    /**
    * Authorization policy switch.
    */
    @SerializedName("AuthorizationPolicy")
    @Expose
    private Boolean AuthorizationPolicy;

    /**
    * Maximum limit of shared subscription groups.
    */
    @SerializedName("SharedSubscriptionGroupLimit")
    @Expose
    private Long SharedSubscriptionGroupLimit;

    /**
    * Specifies the topic filter number limit for each shared subscription group.
    */
    @SerializedName("MaxTopicFilterPerSharedSubscriptionGroup")
    @Expose
    private Long MaxTopicFilterPerSharedSubscriptionGroup;

    /**
    * Specifies the limit on number of auto-subscription rules.
    */
    @SerializedName("AutoSubscriptionPolicyLimit")
    @Expose
    private Long AutoSubscriptionPolicyLimit;

    /**
    * Specifies the number limit of TopicFilter in a single auto-subscription rule.
    */
    @SerializedName("MaxTopicFilterPerAutoSubscriptionPolicy")
    @Expose
    private Long MaxTopicFilterPerAutoSubscriptionPolicy;

    /**
    * Specifies whether to use the default server certificate.
    */
    @SerializedName("UseDefaultServerCert")
    @Expose
    private Boolean UseDefaultServerCert;

    /**
    * Maximum allowed number of server cas.
    */
    @SerializedName("TrustedCaLimit")
    @Expose
    private Long TrustedCaLimit;

    /**
    * Specifies the maximum allowed number of server certificates.
    */
    @SerializedName("ServerCertLimit")
    @Expose
    private Long ServerCertLimit;

    /**
    * Specifies the max level of the topic prefix.
    */
    @SerializedName("TopicPrefixSlashLimit")
    @Expose
    private Long TopicPrefixSlashLimit;

    /**
    * Specifies the speed limit for sending messages by a single client in messages per second.
    */
    @SerializedName("MessageRate")
    @Expose
    private Long MessageRate;

    /**
    * Specifies the protocols supported by the server tls, separated by ",". example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1.
    */
    @SerializedName("TransportLayerSecurity")
    @Expose
    private String TransportLayerSecurity;

    /**
    * Specifies the message property enrichment rule quota.
    */
    @SerializedName("MessageEnrichmentRuleLimit")
    @Expose
    private Long MessageEnrichmentRuleLimit;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance type
BASIC: basic edition.
PRO edition.
PLATINUM edition. 
     * @return InstanceType Instance type
BASIC: basic edition.
PRO edition.
PLATINUM edition.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
BASIC: basic edition.
PRO edition.
PLATINUM edition.
     * @param InstanceType Instance type
BASIC: basic edition.
PRO edition.
PLATINUM edition.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

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
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get Maximum number of topics per instance 
     * @return TopicNumLimit Maximum number of topics per instance
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set Maximum number of topics per instance
     * @param TopicNumLimit Maximum number of topics per instance
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get TPS throttle value 
     * @return TpsLimit TPS throttle value
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set TPS throttle value
     * @param TpsLimit TPS throttle value
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get Creation time, in seconds 
     * @return CreatedTime Creation time, in seconds
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time, in seconds
     * @param CreatedTime Creation time, in seconds
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
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
     * Get Instance status. RUNNING: running; MAINTAINING: maintaining; ABNORMAL: abnormal; OVERDUE: in arrears; DESTROYED: deleted; CREATING: creating; MODIFYING: adjusting the configuration; CREATE_FAILURE: creation failed; MODIFY_FAILURE: configuration adjustment failed; DELETING: deleting. 
     * @return InstanceStatus Instance status. RUNNING: running; MAINTAINING: maintaining; ABNORMAL: abnormal; OVERDUE: in arrears; DESTROYED: deleted; CREATING: creating; MODIFYING: adjusting the configuration; CREATE_FAILURE: creation failed; MODIFY_FAILURE: configuration adjustment failed; DELETING: deleting.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status. RUNNING: running; MAINTAINING: maintaining; ABNORMAL: abnormal; OVERDUE: in arrears; DESTROYED: deleted; CREATING: creating; MODIFYING: adjusting the configuration; CREATE_FAILURE: creation failed; MODIFY_FAILURE: configuration adjustment failed; DELETING: deleting.
     * @param InstanceStatus Instance status. RUNNING: running; MAINTAINING: maintaining; ABNORMAL: abnormal; OVERDUE: in arrears; DESTROYED: deleted; CREATING: creating; MODIFYING: adjusting the configuration; CREATE_FAILURE: creation failed; MODIFY_FAILURE: configuration adjustment failed; DELETING: deleting.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Specifies the instance specification. 
     * @return SkuCode Specifies the instance specification.
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Specifies the instance specification.
     * @param SkuCode Specifies the instance specification.
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get Maximum number of subscriptions for a single client. 
     * @return MaxSubscriptionPerClient Maximum number of subscriptions for a single client.
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set Maximum number of subscriptions for a single client.
     * @param MaxSubscriptionPerClient Maximum number of subscriptions for a single client.
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get Number of authorization rules. 
     * @return AuthorizationPolicyLimit Number of authorization rules.
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set Number of authorization rules.
     * @param AuthorizationPolicyLimit Number of authorization rules.
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
    }

    /**
     * Get Maximum number of clients. 
     * @return ClientNumLimit Maximum number of clients.
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set Maximum number of clients.
     * @param ClientNumLimit Maximum number of clients.
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api. 
     * @return DeviceCertificateProvisionType Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
     */
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
     * @param DeviceCertificateProvisionType Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get Specifies whether to automatically activate the device certificate during automatic registration. 
     * @return AutomaticActivation Specifies whether to automatically activate the device certificate during automatic registration.
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set Specifies whether to automatically activate the device certificate during automatic registration.
     * @param AutomaticActivation Specifies whether to automatically activate the device certificate during automatic registration.
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    /**
     * Get Whether the instance is automatically renewed. this parameter is valid only for monthly subscription clusters. valid values: 1 (auto-renewal), 0 (non-automatic renewal). 
     * @return RenewFlag Whether the instance is automatically renewed. this parameter is valid only for monthly subscription clusters. valid values: 1 (auto-renewal), 0 (non-automatic renewal).
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether the instance is automatically renewed. this parameter is valid only for monthly subscription clusters. valid values: 1 (auto-renewal), 0 (non-automatic renewal).
     * @param RenewFlag Whether the instance is automatically renewed. this parameter is valid only for monthly subscription clusters. valid values: 1 (auto-renewal), 0 (non-automatic renewal).
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Billing mode. POSTPAID: pay-as-you-go billing. PREPAID: monthly subscription. 
     * @return PayMode Billing mode. POSTPAID: pay-as-you-go billing. PREPAID: monthly subscription.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. POSTPAID: pay-as-you-go billing. PREPAID: monthly subscription.
     * @param PayMode Billing mode. POSTPAID: pay-as-you-go billing. PREPAID: monthly subscription.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Expiry time. millisecond-level timestamp. 
     * @return ExpiryTime Expiry time. millisecond-level timestamp.
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set Expiry time. millisecond-level timestamp.
     * @param ExpiryTime Expiry time. millisecond-level timestamp.
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get Scheduled destruction time. millisecond-level timestamp. 
     * @return DestroyTime Scheduled destruction time. millisecond-level timestamp.
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set Scheduled destruction time. millisecond-level timestamp.
     * @param DestroyTime Scheduled destruction time. millisecond-level timestamp.
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get TLS, one-way authentication. mTLS, mutual authentication. BYOC, one certificate per device. 
     * @return X509Mode TLS, one-way authentication. mTLS, mutual authentication. BYOC, one certificate per device.
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set TLS, one-way authentication. mTLS, mutual authentication. BYOC, one certificate per device.
     * @param X509Mode TLS, one-way authentication. mTLS, mutual authentication. BYOC, one certificate per device.
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get Specifies the maximum Ca quota. 
     * @return MaxCaNum Specifies the maximum Ca quota.
     */
    public Long getMaxCaNum() {
        return this.MaxCaNum;
    }

    /**
     * Set Specifies the maximum Ca quota.
     * @param MaxCaNum Specifies the maximum Ca quota.
     */
    public void setMaxCaNum(Long MaxCaNum) {
        this.MaxCaNum = MaxCaNum;
    }

    /**
     * Get FPS cert registration code. 
     * @return RegistrationCode FPS cert registration code.
     */
    public String getRegistrationCode() {
        return this.RegistrationCode;
    }

    /**
     * Set FPS cert registration code.
     * @param RegistrationCode FPS cert registration code.
     */
    public void setRegistrationCode(String RegistrationCode) {
        this.RegistrationCode = RegistrationCode;
    }

    /**
     * Get Maximum number of subscriptions for a cluster. 
     * @return MaxSubscription Maximum number of subscriptions for a cluster.
     */
    public Long getMaxSubscription() {
        return this.MaxSubscription;
    }

    /**
     * Set Maximum number of subscriptions for a cluster.
     * @param MaxSubscription Maximum number of subscriptions for a cluster.
     */
    public void setMaxSubscription(Long MaxSubscription) {
        this.MaxSubscription = MaxSubscription;
    }

    /**
     * Get Authorization policy switch. 
     * @return AuthorizationPolicy Authorization policy switch.
     */
    public Boolean getAuthorizationPolicy() {
        return this.AuthorizationPolicy;
    }

    /**
     * Set Authorization policy switch.
     * @param AuthorizationPolicy Authorization policy switch.
     */
    public void setAuthorizationPolicy(Boolean AuthorizationPolicy) {
        this.AuthorizationPolicy = AuthorizationPolicy;
    }

    /**
     * Get Maximum limit of shared subscription groups. 
     * @return SharedSubscriptionGroupLimit Maximum limit of shared subscription groups.
     */
    public Long getSharedSubscriptionGroupLimit() {
        return this.SharedSubscriptionGroupLimit;
    }

    /**
     * Set Maximum limit of shared subscription groups.
     * @param SharedSubscriptionGroupLimit Maximum limit of shared subscription groups.
     */
    public void setSharedSubscriptionGroupLimit(Long SharedSubscriptionGroupLimit) {
        this.SharedSubscriptionGroupLimit = SharedSubscriptionGroupLimit;
    }

    /**
     * Get Specifies the topic filter number limit for each shared subscription group. 
     * @return MaxTopicFilterPerSharedSubscriptionGroup Specifies the topic filter number limit for each shared subscription group.
     */
    public Long getMaxTopicFilterPerSharedSubscriptionGroup() {
        return this.MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Set Specifies the topic filter number limit for each shared subscription group.
     * @param MaxTopicFilterPerSharedSubscriptionGroup Specifies the topic filter number limit for each shared subscription group.
     */
    public void setMaxTopicFilterPerSharedSubscriptionGroup(Long MaxTopicFilterPerSharedSubscriptionGroup) {
        this.MaxTopicFilterPerSharedSubscriptionGroup = MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Get Specifies the limit on number of auto-subscription rules. 
     * @return AutoSubscriptionPolicyLimit Specifies the limit on number of auto-subscription rules.
     */
    public Long getAutoSubscriptionPolicyLimit() {
        return this.AutoSubscriptionPolicyLimit;
    }

    /**
     * Set Specifies the limit on number of auto-subscription rules.
     * @param AutoSubscriptionPolicyLimit Specifies the limit on number of auto-subscription rules.
     */
    public void setAutoSubscriptionPolicyLimit(Long AutoSubscriptionPolicyLimit) {
        this.AutoSubscriptionPolicyLimit = AutoSubscriptionPolicyLimit;
    }

    /**
     * Get Specifies the number limit of TopicFilter in a single auto-subscription rule. 
     * @return MaxTopicFilterPerAutoSubscriptionPolicy Specifies the number limit of TopicFilter in a single auto-subscription rule.
     */
    public Long getMaxTopicFilterPerAutoSubscriptionPolicy() {
        return this.MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Set Specifies the number limit of TopicFilter in a single auto-subscription rule.
     * @param MaxTopicFilterPerAutoSubscriptionPolicy Specifies the number limit of TopicFilter in a single auto-subscription rule.
     */
    public void setMaxTopicFilterPerAutoSubscriptionPolicy(Long MaxTopicFilterPerAutoSubscriptionPolicy) {
        this.MaxTopicFilterPerAutoSubscriptionPolicy = MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Get Specifies whether to use the default server certificate. 
     * @return UseDefaultServerCert Specifies whether to use the default server certificate.
     */
    public Boolean getUseDefaultServerCert() {
        return this.UseDefaultServerCert;
    }

    /**
     * Set Specifies whether to use the default server certificate.
     * @param UseDefaultServerCert Specifies whether to use the default server certificate.
     */
    public void setUseDefaultServerCert(Boolean UseDefaultServerCert) {
        this.UseDefaultServerCert = UseDefaultServerCert;
    }

    /**
     * Get Maximum allowed number of server cas. 
     * @return TrustedCaLimit Maximum allowed number of server cas.
     */
    public Long getTrustedCaLimit() {
        return this.TrustedCaLimit;
    }

    /**
     * Set Maximum allowed number of server cas.
     * @param TrustedCaLimit Maximum allowed number of server cas.
     */
    public void setTrustedCaLimit(Long TrustedCaLimit) {
        this.TrustedCaLimit = TrustedCaLimit;
    }

    /**
     * Get Specifies the maximum allowed number of server certificates. 
     * @return ServerCertLimit Specifies the maximum allowed number of server certificates.
     */
    public Long getServerCertLimit() {
        return this.ServerCertLimit;
    }

    /**
     * Set Specifies the maximum allowed number of server certificates.
     * @param ServerCertLimit Specifies the maximum allowed number of server certificates.
     */
    public void setServerCertLimit(Long ServerCertLimit) {
        this.ServerCertLimit = ServerCertLimit;
    }

    /**
     * Get Specifies the max level of the topic prefix. 
     * @return TopicPrefixSlashLimit Specifies the max level of the topic prefix.
     */
    public Long getTopicPrefixSlashLimit() {
        return this.TopicPrefixSlashLimit;
    }

    /**
     * Set Specifies the max level of the topic prefix.
     * @param TopicPrefixSlashLimit Specifies the max level of the topic prefix.
     */
    public void setTopicPrefixSlashLimit(Long TopicPrefixSlashLimit) {
        this.TopicPrefixSlashLimit = TopicPrefixSlashLimit;
    }

    /**
     * Get Specifies the speed limit for sending messages by a single client in messages per second. 
     * @return MessageRate Specifies the speed limit for sending messages by a single client in messages per second.
     */
    public Long getMessageRate() {
        return this.MessageRate;
    }

    /**
     * Set Specifies the speed limit for sending messages by a single client in messages per second.
     * @param MessageRate Specifies the speed limit for sending messages by a single client in messages per second.
     */
    public void setMessageRate(Long MessageRate) {
        this.MessageRate = MessageRate;
    }

    /**
     * Get Specifies the protocols supported by the server tls, separated by ",". example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1. 
     * @return TransportLayerSecurity Specifies the protocols supported by the server tls, separated by ",". example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1.
     */
    public String getTransportLayerSecurity() {
        return this.TransportLayerSecurity;
    }

    /**
     * Set Specifies the protocols supported by the server tls, separated by ",". example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1.
     * @param TransportLayerSecurity Specifies the protocols supported by the server tls, separated by ",". example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1.
     */
    public void setTransportLayerSecurity(String TransportLayerSecurity) {
        this.TransportLayerSecurity = TransportLayerSecurity;
    }

    /**
     * Get Specifies the message property enrichment rule quota. 
     * @return MessageEnrichmentRuleLimit Specifies the message property enrichment rule quota.
     */
    public Long getMessageEnrichmentRuleLimit() {
        return this.MessageEnrichmentRuleLimit;
    }

    /**
     * Set Specifies the message property enrichment rule quota.
     * @param MessageEnrichmentRuleLimit Specifies the message property enrichment rule quota.
     */
    public void setMessageEnrichmentRuleLimit(Long MessageEnrichmentRuleLimit) {
        this.MessageEnrichmentRuleLimit = MessageEnrichmentRuleLimit;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceResponse(DescribeInstanceResponse source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.MaxSubscriptionPerClient != null) {
            this.MaxSubscriptionPerClient = new Long(source.MaxSubscriptionPerClient);
        }
        if (source.AuthorizationPolicyLimit != null) {
            this.AuthorizationPolicyLimit = new Long(source.AuthorizationPolicyLimit);
        }
        if (source.ClientNumLimit != null) {
            this.ClientNumLimit = new Long(source.ClientNumLimit);
        }
        if (source.DeviceCertificateProvisionType != null) {
            this.DeviceCertificateProvisionType = new String(source.DeviceCertificateProvisionType);
        }
        if (source.AutomaticActivation != null) {
            this.AutomaticActivation = new Boolean(source.AutomaticActivation);
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
        if (source.X509Mode != null) {
            this.X509Mode = new String(source.X509Mode);
        }
        if (source.MaxCaNum != null) {
            this.MaxCaNum = new Long(source.MaxCaNum);
        }
        if (source.RegistrationCode != null) {
            this.RegistrationCode = new String(source.RegistrationCode);
        }
        if (source.MaxSubscription != null) {
            this.MaxSubscription = new Long(source.MaxSubscription);
        }
        if (source.AuthorizationPolicy != null) {
            this.AuthorizationPolicy = new Boolean(source.AuthorizationPolicy);
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
        if (source.UseDefaultServerCert != null) {
            this.UseDefaultServerCert = new Boolean(source.UseDefaultServerCert);
        }
        if (source.TrustedCaLimit != null) {
            this.TrustedCaLimit = new Long(source.TrustedCaLimit);
        }
        if (source.ServerCertLimit != null) {
            this.ServerCertLimit = new Long(source.ServerCertLimit);
        }
        if (source.TopicPrefixSlashLimit != null) {
            this.TopicPrefixSlashLimit = new Long(source.TopicPrefixSlashLimit);
        }
        if (source.MessageRate != null) {
            this.MessageRate = new Long(source.MessageRate);
        }
        if (source.TransportLayerSecurity != null) {
            this.TransportLayerSecurity = new String(source.TransportLayerSecurity);
        }
        if (source.MessageEnrichmentRuleLimit != null) {
            this.MessageEnrichmentRuleLimit = new Long(source.MessageEnrichmentRuleLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "MaxSubscriptionPerClient", this.MaxSubscriptionPerClient);
        this.setParamSimple(map, prefix + "AuthorizationPolicyLimit", this.AuthorizationPolicyLimit);
        this.setParamSimple(map, prefix + "ClientNumLimit", this.ClientNumLimit);
        this.setParamSimple(map, prefix + "DeviceCertificateProvisionType", this.DeviceCertificateProvisionType);
        this.setParamSimple(map, prefix + "AutomaticActivation", this.AutomaticActivation);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "X509Mode", this.X509Mode);
        this.setParamSimple(map, prefix + "MaxCaNum", this.MaxCaNum);
        this.setParamSimple(map, prefix + "RegistrationCode", this.RegistrationCode);
        this.setParamSimple(map, prefix + "MaxSubscription", this.MaxSubscription);
        this.setParamSimple(map, prefix + "AuthorizationPolicy", this.AuthorizationPolicy);
        this.setParamSimple(map, prefix + "SharedSubscriptionGroupLimit", this.SharedSubscriptionGroupLimit);
        this.setParamSimple(map, prefix + "MaxTopicFilterPerSharedSubscriptionGroup", this.MaxTopicFilterPerSharedSubscriptionGroup);
        this.setParamSimple(map, prefix + "AutoSubscriptionPolicyLimit", this.AutoSubscriptionPolicyLimit);
        this.setParamSimple(map, prefix + "MaxTopicFilterPerAutoSubscriptionPolicy", this.MaxTopicFilterPerAutoSubscriptionPolicy);
        this.setParamSimple(map, prefix + "UseDefaultServerCert", this.UseDefaultServerCert);
        this.setParamSimple(map, prefix + "TrustedCaLimit", this.TrustedCaLimit);
        this.setParamSimple(map, prefix + "ServerCertLimit", this.ServerCertLimit);
        this.setParamSimple(map, prefix + "TopicPrefixSlashLimit", this.TopicPrefixSlashLimit);
        this.setParamSimple(map, prefix + "MessageRate", this.MessageRate);
        this.setParamSimple(map, prefix + "TransportLayerSecurity", this.TransportLayerSecurity);
        this.setParamSimple(map, prefix + "MessageEnrichmentRuleLimit", this.MessageEnrichmentRuleLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

