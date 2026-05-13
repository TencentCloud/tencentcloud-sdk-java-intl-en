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
    * <p>Instance type<br>BASIC Basic version<br>PRO Professional Edition<br>PLATINUM Platinum version</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Number of topics</p>
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * <p>Maximum number of topics per instance</p>
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * <p>TPS throttle value</p>
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * <p>createTime, in seconds</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * <p>Remarks</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Instance status, RUNNING, running MAINTAINING, maintaining ABNORMAL, abnormal OVERDUE, arrears DESTROYED, deleted CREATING, creating MODIFYING, modifying CREATE_FAILURE, creation failure MODIFY_FAILURE, configuration change failed DELETING, deleting</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Instance specification</p>
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * <p>Maximum number of subscriptions for a single client</p>
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * <p>Number of authorization rule entries</p>
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * <p>Number of clients cap</p>
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * <p>Client certificate registration method:<br>JITP: Automatic sign-up<br>API: Manually register through API</p>
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * <p>Whether to automatically activate when automatically registering a device certificate</p>
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

    /**
    * <p>Whether it is automatically renewed. Only applicable to monthly subscription clusters. 1: Automatic renewal 0: Non-automatic renewal</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Expiry time, millisecond-level timestamp</p>
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * <p>Predestruction time, millisecond-level timestamp</p>
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * <p>TLS, one-way authentication    mTLS, mutual authentication    BYOC; one certificate per device</p>
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * <p>Maximum Ca quota</p>
    */
    @SerializedName("MaxCaNum")
    @Expose
    private Long MaxCaNum;

    /**
    * <p>FPS Cert Registration Code</p>
    */
    @SerializedName("RegistrationCode")
    @Expose
    private String RegistrationCode;

    /**
    * <p>Maximum number of subscriptions for a cluster</p>
    */
    @SerializedName("MaxSubscription")
    @Expose
    private Long MaxSubscription;

    /**
    * <p>Authorization policy switch</p>
    */
    @SerializedName("AuthorizationPolicy")
    @Expose
    private Boolean AuthorizationPolicy;

    /**
    * <p>Maximum limit of shared subscription groups</p>
    */
    @SerializedName("SharedSubscriptionGroupLimit")
    @Expose
    private Long SharedSubscriptionGroupLimit;

    /**
    * <p>Number limit of TopicFilter in one shared subscription group</p>
    */
    @SerializedName("MaxTopicFilterPerSharedSubscriptionGroup")
    @Expose
    private Long MaxTopicFilterPerSharedSubscriptionGroup;

    /**
    * <p>Limit on number of auto subscription rules</p>
    */
    @SerializedName("AutoSubscriptionPolicyLimit")
    @Expose
    private Long AutoSubscriptionPolicyLimit;

    /**
    * <p>Number limit of TopicFilter in a single auto subscription rule</p>
    */
    @SerializedName("MaxTopicFilterPerAutoSubscriptionPolicy")
    @Expose
    private Long MaxTopicFilterPerAutoSubscriptionPolicy;

    /**
    * <p>Whether to use the default server certificate</p>
    */
    @SerializedName("UseDefaultServerCert")
    @Expose
    private Boolean UseDefaultServerCert;

    /**
    * <p>Maximum number of server CAs</p>
    */
    @SerializedName("TrustedCaLimit")
    @Expose
    private Long TrustedCaLimit;

    /**
    * <p>Maximum number of server certificates</p>
    */
    @SerializedName("ServerCertLimit")
    @Expose
    private Long ServerCertLimit;

    /**
    * <p>Max level of topic prefix</p>
    */
    @SerializedName("TopicPrefixSlashLimit")
    @Expose
    private Long TopicPrefixSlashLimit;

    /**
    * <p>Single client send message rate limiting, unit messages/second</p>
    */
    @SerializedName("MessageRate")
    @Expose
    private Long MessageRate;

    /**
    * <p>Server-side tls supported protocols, separated by ",". Example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
    */
    @SerializedName("TransportLayerSecurity")
    @Expose
    private String TransportLayerSecurity;

    /**
    * <p>Message property enhancement rule quota</p>
    */
    @SerializedName("MessageEnrichmentRuleLimit")
    @Expose
    private Long MessageEnrichmentRuleLimit;

    /**
    * <p>Maximum allowed number of blocking rules</p>
    */
    @SerializedName("BlockRuleLimit")
    @Expose
    private Long BlockRuleLimit;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Instance type<br>BASIC Basic version<br>PRO Professional Edition<br>PLATINUM Platinum version</p> 
     * @return InstanceType <p>Instance type<br>BASIC Basic version<br>PRO Professional Edition<br>PLATINUM Platinum version</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type<br>BASIC Basic version<br>PRO Professional Edition<br>PLATINUM Platinum version</p>
     * @param InstanceType <p>Instance type<br>BASIC Basic version<br>PRO Professional Edition<br>PLATINUM Platinum version</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Number of topics</p> 
     * @return TopicNum <p>Number of topics</p>
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set <p>Number of topics</p>
     * @param TopicNum <p>Number of topics</p>
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get <p>Maximum number of topics per instance</p> 
     * @return TopicNumLimit <p>Maximum number of topics per instance</p>
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set <p>Maximum number of topics per instance</p>
     * @param TopicNumLimit <p>Maximum number of topics per instance</p>
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get <p>TPS throttle value</p> 
     * @return TpsLimit <p>TPS throttle value</p>
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set <p>TPS throttle value</p>
     * @param TpsLimit <p>TPS throttle value</p>
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get <p>createTime, in seconds</p> 
     * @return CreatedTime <p>createTime, in seconds</p>
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>createTime, in seconds</p>
     * @param CreatedTime <p>createTime, in seconds</p>
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Remarks</p> 
     * @return Remark <p>Remarks</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks</p>
     * @param Remark <p>Remarks</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Instance status, RUNNING, running MAINTAINING, maintaining ABNORMAL, abnormal OVERDUE, arrears DESTROYED, deleted CREATING, creating MODIFYING, modifying CREATE_FAILURE, creation failure MODIFY_FAILURE, configuration change failed DELETING, deleting</p> 
     * @return InstanceStatus <p>Instance status, RUNNING, running MAINTAINING, maintaining ABNORMAL, abnormal OVERDUE, arrears DESTROYED, deleted CREATING, creating MODIFYING, modifying CREATE_FAILURE, creation failure MODIFY_FAILURE, configuration change failed DELETING, deleting</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status, RUNNING, running MAINTAINING, maintaining ABNORMAL, abnormal OVERDUE, arrears DESTROYED, deleted CREATING, creating MODIFYING, modifying CREATE_FAILURE, creation failure MODIFY_FAILURE, configuration change failed DELETING, deleting</p>
     * @param InstanceStatus <p>Instance status, RUNNING, running MAINTAINING, maintaining ABNORMAL, abnormal OVERDUE, arrears DESTROYED, deleted CREATING, creating MODIFYING, modifying CREATE_FAILURE, creation failure MODIFY_FAILURE, configuration change failed DELETING, deleting</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Instance specification</p> 
     * @return SkuCode <p>Instance specification</p>
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set <p>Instance specification</p>
     * @param SkuCode <p>Instance specification</p>
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get <p>Maximum number of subscriptions for a single client</p> 
     * @return MaxSubscriptionPerClient <p>Maximum number of subscriptions for a single client</p>
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set <p>Maximum number of subscriptions for a single client</p>
     * @param MaxSubscriptionPerClient <p>Maximum number of subscriptions for a single client</p>
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get <p>Number of authorization rule entries</p> 
     * @return AuthorizationPolicyLimit <p>Number of authorization rule entries</p>
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set <p>Number of authorization rule entries</p>
     * @param AuthorizationPolicyLimit <p>Number of authorization rule entries</p>
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
    }

    /**
     * Get <p>Number of clients cap</p> 
     * @return ClientNumLimit <p>Number of clients cap</p>
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set <p>Number of clients cap</p>
     * @param ClientNumLimit <p>Number of clients cap</p>
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get <p>Client certificate registration method:<br>JITP: Automatic sign-up<br>API: Manually register through API</p> 
     * @return DeviceCertificateProvisionType <p>Client certificate registration method:<br>JITP: Automatic sign-up<br>API: Manually register through API</p>
     */
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set <p>Client certificate registration method:<br>JITP: Automatic sign-up<br>API: Manually register through API</p>
     * @param DeviceCertificateProvisionType <p>Client certificate registration method:<br>JITP: Automatic sign-up<br>API: Manually register through API</p>
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get <p>Whether to automatically activate when automatically registering a device certificate</p> 
     * @return AutomaticActivation <p>Whether to automatically activate when automatically registering a device certificate</p>
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set <p>Whether to automatically activate when automatically registering a device certificate</p>
     * @param AutomaticActivation <p>Whether to automatically activate when automatically registering a device certificate</p>
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    /**
     * Get <p>Whether it is automatically renewed. Only applicable to monthly subscription clusters. 1: Automatic renewal 0: Non-automatic renewal</p> 
     * @return RenewFlag <p>Whether it is automatically renewed. Only applicable to monthly subscription clusters. 1: Automatic renewal 0: Non-automatic renewal</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Whether it is automatically renewed. Only applicable to monthly subscription clusters. 1: Automatic renewal 0: Non-automatic renewal</p>
     * @param RenewFlag <p>Whether it is automatically renewed. Only applicable to monthly subscription clusters. 1: Automatic renewal 0: Non-automatic renewal</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription</p> 
     * @return PayMode <p>Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription</p>
     * @param PayMode <p>Billing mode, POSTPAID, pay-as-you-go PREPAID, annual/monthly subscription</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Expiry time, millisecond-level timestamp</p> 
     * @return ExpiryTime <p>Expiry time, millisecond-level timestamp</p>
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set <p>Expiry time, millisecond-level timestamp</p>
     * @param ExpiryTime <p>Expiry time, millisecond-level timestamp</p>
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get <p>Predestruction time, millisecond-level timestamp</p> 
     * @return DestroyTime <p>Predestruction time, millisecond-level timestamp</p>
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set <p>Predestruction time, millisecond-level timestamp</p>
     * @param DestroyTime <p>Predestruction time, millisecond-level timestamp</p>
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get <p>TLS, one-way authentication    mTLS, mutual authentication    BYOC; one certificate per device</p> 
     * @return X509Mode <p>TLS, one-way authentication    mTLS, mutual authentication    BYOC; one certificate per device</p>
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set <p>TLS, one-way authentication    mTLS, mutual authentication    BYOC; one certificate per device</p>
     * @param X509Mode <p>TLS, one-way authentication    mTLS, mutual authentication    BYOC; one certificate per device</p>
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get <p>Maximum Ca quota</p> 
     * @return MaxCaNum <p>Maximum Ca quota</p>
     */
    public Long getMaxCaNum() {
        return this.MaxCaNum;
    }

    /**
     * Set <p>Maximum Ca quota</p>
     * @param MaxCaNum <p>Maximum Ca quota</p>
     */
    public void setMaxCaNum(Long MaxCaNum) {
        this.MaxCaNum = MaxCaNum;
    }

    /**
     * Get <p>FPS Cert Registration Code</p> 
     * @return RegistrationCode <p>FPS Cert Registration Code</p>
     */
    public String getRegistrationCode() {
        return this.RegistrationCode;
    }

    /**
     * Set <p>FPS Cert Registration Code</p>
     * @param RegistrationCode <p>FPS Cert Registration Code</p>
     */
    public void setRegistrationCode(String RegistrationCode) {
        this.RegistrationCode = RegistrationCode;
    }

    /**
     * Get <p>Maximum number of subscriptions for a cluster</p> 
     * @return MaxSubscription <p>Maximum number of subscriptions for a cluster</p>
     */
    public Long getMaxSubscription() {
        return this.MaxSubscription;
    }

    /**
     * Set <p>Maximum number of subscriptions for a cluster</p>
     * @param MaxSubscription <p>Maximum number of subscriptions for a cluster</p>
     */
    public void setMaxSubscription(Long MaxSubscription) {
        this.MaxSubscription = MaxSubscription;
    }

    /**
     * Get <p>Authorization policy switch</p> 
     * @return AuthorizationPolicy <p>Authorization policy switch</p>
     */
    public Boolean getAuthorizationPolicy() {
        return this.AuthorizationPolicy;
    }

    /**
     * Set <p>Authorization policy switch</p>
     * @param AuthorizationPolicy <p>Authorization policy switch</p>
     */
    public void setAuthorizationPolicy(Boolean AuthorizationPolicy) {
        this.AuthorizationPolicy = AuthorizationPolicy;
    }

    /**
     * Get <p>Maximum limit of shared subscription groups</p> 
     * @return SharedSubscriptionGroupLimit <p>Maximum limit of shared subscription groups</p>
     */
    public Long getSharedSubscriptionGroupLimit() {
        return this.SharedSubscriptionGroupLimit;
    }

    /**
     * Set <p>Maximum limit of shared subscription groups</p>
     * @param SharedSubscriptionGroupLimit <p>Maximum limit of shared subscription groups</p>
     */
    public void setSharedSubscriptionGroupLimit(Long SharedSubscriptionGroupLimit) {
        this.SharedSubscriptionGroupLimit = SharedSubscriptionGroupLimit;
    }

    /**
     * Get <p>Number limit of TopicFilter in one shared subscription group</p> 
     * @return MaxTopicFilterPerSharedSubscriptionGroup <p>Number limit of TopicFilter in one shared subscription group</p>
     * @deprecated
     */
    @Deprecated
    public Long getMaxTopicFilterPerSharedSubscriptionGroup() {
        return this.MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Set <p>Number limit of TopicFilter in one shared subscription group</p>
     * @param MaxTopicFilterPerSharedSubscriptionGroup <p>Number limit of TopicFilter in one shared subscription group</p>
     * @deprecated
     */
    @Deprecated
    public void setMaxTopicFilterPerSharedSubscriptionGroup(Long MaxTopicFilterPerSharedSubscriptionGroup) {
        this.MaxTopicFilterPerSharedSubscriptionGroup = MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Get <p>Limit on number of auto subscription rules</p> 
     * @return AutoSubscriptionPolicyLimit <p>Limit on number of auto subscription rules</p>
     */
    public Long getAutoSubscriptionPolicyLimit() {
        return this.AutoSubscriptionPolicyLimit;
    }

    /**
     * Set <p>Limit on number of auto subscription rules</p>
     * @param AutoSubscriptionPolicyLimit <p>Limit on number of auto subscription rules</p>
     */
    public void setAutoSubscriptionPolicyLimit(Long AutoSubscriptionPolicyLimit) {
        this.AutoSubscriptionPolicyLimit = AutoSubscriptionPolicyLimit;
    }

    /**
     * Get <p>Number limit of TopicFilter in a single auto subscription rule</p> 
     * @return MaxTopicFilterPerAutoSubscriptionPolicy <p>Number limit of TopicFilter in a single auto subscription rule</p>
     */
    public Long getMaxTopicFilterPerAutoSubscriptionPolicy() {
        return this.MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Set <p>Number limit of TopicFilter in a single auto subscription rule</p>
     * @param MaxTopicFilterPerAutoSubscriptionPolicy <p>Number limit of TopicFilter in a single auto subscription rule</p>
     */
    public void setMaxTopicFilterPerAutoSubscriptionPolicy(Long MaxTopicFilterPerAutoSubscriptionPolicy) {
        this.MaxTopicFilterPerAutoSubscriptionPolicy = MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Get <p>Whether to use the default server certificate</p> 
     * @return UseDefaultServerCert <p>Whether to use the default server certificate</p>
     */
    public Boolean getUseDefaultServerCert() {
        return this.UseDefaultServerCert;
    }

    /**
     * Set <p>Whether to use the default server certificate</p>
     * @param UseDefaultServerCert <p>Whether to use the default server certificate</p>
     */
    public void setUseDefaultServerCert(Boolean UseDefaultServerCert) {
        this.UseDefaultServerCert = UseDefaultServerCert;
    }

    /**
     * Get <p>Maximum number of server CAs</p> 
     * @return TrustedCaLimit <p>Maximum number of server CAs</p>
     */
    public Long getTrustedCaLimit() {
        return this.TrustedCaLimit;
    }

    /**
     * Set <p>Maximum number of server CAs</p>
     * @param TrustedCaLimit <p>Maximum number of server CAs</p>
     */
    public void setTrustedCaLimit(Long TrustedCaLimit) {
        this.TrustedCaLimit = TrustedCaLimit;
    }

    /**
     * Get <p>Maximum number of server certificates</p> 
     * @return ServerCertLimit <p>Maximum number of server certificates</p>
     */
    public Long getServerCertLimit() {
        return this.ServerCertLimit;
    }

    /**
     * Set <p>Maximum number of server certificates</p>
     * @param ServerCertLimit <p>Maximum number of server certificates</p>
     */
    public void setServerCertLimit(Long ServerCertLimit) {
        this.ServerCertLimit = ServerCertLimit;
    }

    /**
     * Get <p>Max level of topic prefix</p> 
     * @return TopicPrefixSlashLimit <p>Max level of topic prefix</p>
     */
    public Long getTopicPrefixSlashLimit() {
        return this.TopicPrefixSlashLimit;
    }

    /**
     * Set <p>Max level of topic prefix</p>
     * @param TopicPrefixSlashLimit <p>Max level of topic prefix</p>
     */
    public void setTopicPrefixSlashLimit(Long TopicPrefixSlashLimit) {
        this.TopicPrefixSlashLimit = TopicPrefixSlashLimit;
    }

    /**
     * Get <p>Single client send message rate limiting, unit messages/second</p> 
     * @return MessageRate <p>Single client send message rate limiting, unit messages/second</p>
     */
    public Long getMessageRate() {
        return this.MessageRate;
    }

    /**
     * Set <p>Single client send message rate limiting, unit messages/second</p>
     * @param MessageRate <p>Single client send message rate limiting, unit messages/second</p>
     */
    public void setMessageRate(Long MessageRate) {
        this.MessageRate = MessageRate;
    }

    /**
     * Get <p>Server-side tls supported protocols, separated by ",". Example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p> 
     * @return TransportLayerSecurity <p>Server-side tls supported protocols, separated by ",". Example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
     */
    public String getTransportLayerSecurity() {
        return this.TransportLayerSecurity;
    }

    /**
     * Set <p>Server-side tls supported protocols, separated by ",". Example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
     * @param TransportLayerSecurity <p>Server-side tls supported protocols, separated by ",". Example: TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
     */
    public void setTransportLayerSecurity(String TransportLayerSecurity) {
        this.TransportLayerSecurity = TransportLayerSecurity;
    }

    /**
     * Get <p>Message property enhancement rule quota</p> 
     * @return MessageEnrichmentRuleLimit <p>Message property enhancement rule quota</p>
     */
    public Long getMessageEnrichmentRuleLimit() {
        return this.MessageEnrichmentRuleLimit;
    }

    /**
     * Set <p>Message property enhancement rule quota</p>
     * @param MessageEnrichmentRuleLimit <p>Message property enhancement rule quota</p>
     */
    public void setMessageEnrichmentRuleLimit(Long MessageEnrichmentRuleLimit) {
        this.MessageEnrichmentRuleLimit = MessageEnrichmentRuleLimit;
    }

    /**
     * Get <p>Maximum allowed number of blocking rules</p> 
     * @return BlockRuleLimit <p>Maximum allowed number of blocking rules</p>
     */
    public Long getBlockRuleLimit() {
        return this.BlockRuleLimit;
    }

    /**
     * Set <p>Maximum allowed number of blocking rules</p>
     * @param BlockRuleLimit <p>Maximum allowed number of blocking rules</p>
     */
    public void setBlockRuleLimit(Long BlockRuleLimit) {
        this.BlockRuleLimit = BlockRuleLimit;
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
        if (source.BlockRuleLimit != null) {
            this.BlockRuleLimit = new Long(source.BlockRuleLimit);
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
        this.setParamSimple(map, prefix + "BlockRuleLimit", this.BlockRuleLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

