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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * Unique Instance ID
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
    * Resource ID corresponding to the Instance, for billing usage
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * Instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Payment mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Auto-renewal flag.

0: disable

1: enable
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Elastic billing switch.
0: disable

1: enable
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Instance package version.
101: Small and Micro Edition.
102: Ultra-light Edition.
2: Advanced Edition.
3: Enterprise Edition.
4: Ultimate Edition.
6: Exclusive Edition
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Instance expiration time
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * Instance Start Time
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Configured Domain Count
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * Maximum Domain Count
    */
    @SerializedName("SubDomainLimit")
    @Expose
    private Long SubDomainLimit;

    /**
    * Configured Primary Domain Count
    */
    @SerializedName("MainDomainCount")
    @Expose
    private Long MainDomainCount;

    /**
    * Maximum Number of Primary Domain Names
    */
    @SerializedName("MainDomainLimit")
    @Expose
    private Long MainDomainLimit;

    /**
    * Instance QPS Peak within 30 Days
    */
    @SerializedName("MaxQPS")
    @Expose
    private Long MaxQPS;

    /**
    * QPS Expansion Package Information
    */
    @SerializedName("QPS")
    @Expose
    private QPSPackageNew QPS;

    /**
    * Domain Extension Package Information
    */
    @SerializedName("DomainPkg")
    @Expose
    private DomainPackageNew DomainPkg;

    /**
    * User appid.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * CLB or SaaS
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Business Security Package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FraudPkg")
    @Expose
    private FraudPkg FraudPkg;

    /**
    * Bot Resource Package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotPkg")
    @Expose
    private BotPkg BotPkg;

    /**
    * Bot's QPS details

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotQPS")
    @Expose
    private BotQPS BotQPS;

    /**
    * QPS Elastic Billing Cap

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElasticBilling")
    @Expose
    private Long ElasticBilling;

    /**
    * Attack Log Shipping Switch

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackLogPost")
    @Expose
    private Long AttackLogPost;

    /**
    * Peak Bandwidth, in B/s (Bytes per Second)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * Whether API security is purchased
    */
    @SerializedName("APISecurity")
    @Expose
    private Long APISecurity;

    /**
    * Purchased QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QpsStandard")
    @Expose
    private Long QpsStandard;

    /**
    * Purchased Bandwidth Specification

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthStandard")
    @Expose
    private Long BandwidthStandard;

    /**
    * Instance status

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance Sandbox QPS Value

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SandboxQps")
    @Expose
    private Long SandboxQps;

    /**
    * Whether API Security is on Trial

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAPISecurityTrial")
    @Expose
    private Long IsAPISecurityTrial;

    /**
    * Premium Package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MajorEventsPkg")
    @Expose
    private MajorEventsPkg MajorEventsPkg;

    /**
    * Hybrid Cloud Sub-node Package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HybridPkg")
    @Expose
    private HybridPkg HybridPkg;

    /**
    * API security resource package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiPkg")
    @Expose
    private ApiPkg ApiPkg;

    /**
    * MMPS Acceleration Package

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiniPkg")
    @Expose
    private MiniPkg MiniPkg;

    /**
    * Mini Program QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiniQpsStandard")
    @Expose
    private Long MiniQpsStandard;

    /**
    * Mini Program QPS Peak

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiniMaxQPS")
    @Expose
    private Long MiniMaxQPS;

    /**
    * Last overage time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastQpsExceedTime")
    @Expose
    private String LastQpsExceedTime;

    /**
    * ID quantity expansion package for secure mini program access.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiniExtendPkg")
    @Expose
    private MiniExtendPkg MiniExtendPkg;

    /**
    * Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * Flag for delay of instance deletion.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FreeDelayFlag")
    @Expose
    private Long FreeDelayFlag;

    /**
     * Get Unique Instance ID 
     * @return InstanceId Unique Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Unique Instance ID
     * @param InstanceId Unique Instance ID
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
     * Get Resource ID corresponding to the Instance, for billing usage 
     * @return ResourceIds Resource ID corresponding to the Instance, for billing usage
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID corresponding to the Instance, for billing usage
     * @param ResourceIds Resource ID corresponding to the Instance, for billing usage
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Instance region 
     * @return Region Instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
     * @param Region Instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Auto-renewal flag.

0: disable

1: enable 
     * @return RenewFlag Auto-renewal flag.

0: disable

1: enable
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag.

0: disable

1: enable
     * @param RenewFlag Auto-renewal flag.

0: disable

1: enable
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Elastic billing switch.
0: disable

1: enable 
     * @return Mode Elastic billing switch.
0: disable

1: enable
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Elastic billing switch.
0: disable

1: enable
     * @param Mode Elastic billing switch.
0: disable

1: enable
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Instance package version.
101: Small and Micro Edition.
102: Ultra-light Edition.
2: Advanced Edition.
3: Enterprise Edition.
4: Ultimate Edition.
6: Exclusive Edition 
     * @return Level Instance package version.
101: Small and Micro Edition.
102: Ultra-light Edition.
2: Advanced Edition.
3: Enterprise Edition.
4: Ultimate Edition.
6: Exclusive Edition
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Instance package version.
101: Small and Micro Edition.
102: Ultra-light Edition.
2: Advanced Edition.
3: Enterprise Edition.
4: Ultimate Edition.
6: Exclusive Edition
     * @param Level Instance package version.
101: Small and Micro Edition.
102: Ultra-light Edition.
2: Advanced Edition.
3: Enterprise Edition.
4: Ultimate Edition.
6: Exclusive Edition
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Instance expiration time 
     * @return ValidTime Instance expiration time
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set Instance expiration time
     * @param ValidTime Instance expiration time
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get Instance Start Time 
     * @return BeginTime Instance Start Time
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Instance Start Time
     * @param BeginTime Instance Start Time
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Configured Domain Count 
     * @return DomainCount Configured Domain Count
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set Configured Domain Count
     * @param DomainCount Configured Domain Count
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get Maximum Domain Count 
     * @return SubDomainLimit Maximum Domain Count
     */
    public Long getSubDomainLimit() {
        return this.SubDomainLimit;
    }

    /**
     * Set Maximum Domain Count
     * @param SubDomainLimit Maximum Domain Count
     */
    public void setSubDomainLimit(Long SubDomainLimit) {
        this.SubDomainLimit = SubDomainLimit;
    }

    /**
     * Get Configured Primary Domain Count 
     * @return MainDomainCount Configured Primary Domain Count
     */
    public Long getMainDomainCount() {
        return this.MainDomainCount;
    }

    /**
     * Set Configured Primary Domain Count
     * @param MainDomainCount Configured Primary Domain Count
     */
    public void setMainDomainCount(Long MainDomainCount) {
        this.MainDomainCount = MainDomainCount;
    }

    /**
     * Get Maximum Number of Primary Domain Names 
     * @return MainDomainLimit Maximum Number of Primary Domain Names
     */
    public Long getMainDomainLimit() {
        return this.MainDomainLimit;
    }

    /**
     * Set Maximum Number of Primary Domain Names
     * @param MainDomainLimit Maximum Number of Primary Domain Names
     */
    public void setMainDomainLimit(Long MainDomainLimit) {
        this.MainDomainLimit = MainDomainLimit;
    }

    /**
     * Get Instance QPS Peak within 30 Days 
     * @return MaxQPS Instance QPS Peak within 30 Days
     */
    public Long getMaxQPS() {
        return this.MaxQPS;
    }

    /**
     * Set Instance QPS Peak within 30 Days
     * @param MaxQPS Instance QPS Peak within 30 Days
     */
    public void setMaxQPS(Long MaxQPS) {
        this.MaxQPS = MaxQPS;
    }

    /**
     * Get QPS Expansion Package Information 
     * @return QPS QPS Expansion Package Information
     */
    public QPSPackageNew getQPS() {
        return this.QPS;
    }

    /**
     * Set QPS Expansion Package Information
     * @param QPS QPS Expansion Package Information
     */
    public void setQPS(QPSPackageNew QPS) {
        this.QPS = QPS;
    }

    /**
     * Get Domain Extension Package Information 
     * @return DomainPkg Domain Extension Package Information
     */
    public DomainPackageNew getDomainPkg() {
        return this.DomainPkg;
    }

    /**
     * Set Domain Extension Package Information
     * @param DomainPkg Domain Extension Package Information
     */
    public void setDomainPkg(DomainPackageNew DomainPkg) {
        this.DomainPkg = DomainPkg;
    }

    /**
     * Get User appid. 
     * @return AppId User appid.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
     * @param AppId User appid.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get CLB or SaaS 
     * @return Edition CLB or SaaS
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set CLB or SaaS
     * @param Edition CLB or SaaS
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Business Security Package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FraudPkg Business Security Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FraudPkg getFraudPkg() {
        return this.FraudPkg;
    }

    /**
     * Set Business Security Package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param FraudPkg Business Security Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFraudPkg(FraudPkg FraudPkg) {
        this.FraudPkg = FraudPkg;
    }

    /**
     * Get Bot Resource Package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BotPkg Bot Resource Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BotPkg getBotPkg() {
        return this.BotPkg;
    }

    /**
     * Set Bot Resource Package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BotPkg Bot Resource Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBotPkg(BotPkg BotPkg) {
        this.BotPkg = BotPkg;
    }

    /**
     * Get Bot's QPS details

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BotQPS Bot's QPS details

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BotQPS getBotQPS() {
        return this.BotQPS;
    }

    /**
     * Set Bot's QPS details

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BotQPS Bot's QPS details

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBotQPS(BotQPS BotQPS) {
        this.BotQPS = BotQPS;
    }

    /**
     * Get QPS Elastic Billing Cap

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElasticBilling QPS Elastic Billing Cap

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getElasticBilling() {
        return this.ElasticBilling;
    }

    /**
     * Set QPS Elastic Billing Cap

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElasticBilling QPS Elastic Billing Cap

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElasticBilling(Long ElasticBilling) {
        this.ElasticBilling = ElasticBilling;
    }

    /**
     * Get Attack Log Shipping Switch

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackLogPost Attack Log Shipping Switch

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackLogPost() {
        return this.AttackLogPost;
    }

    /**
     * Set Attack Log Shipping Switch

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackLogPost Attack Log Shipping Switch

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackLogPost(Long AttackLogPost) {
        this.AttackLogPost = AttackLogPost;
    }

    /**
     * Get Peak Bandwidth, in B/s (Bytes per Second)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxBandwidth Peak Bandwidth, in B/s (Bytes per Second)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Peak Bandwidth, in B/s (Bytes per Second)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxBandwidth Peak Bandwidth, in B/s (Bytes per Second)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get Whether API security is purchased 
     * @return APISecurity Whether API security is purchased
     */
    public Long getAPISecurity() {
        return this.APISecurity;
    }

    /**
     * Set Whether API security is purchased
     * @param APISecurity Whether API security is purchased
     */
    public void setAPISecurity(Long APISecurity) {
        this.APISecurity = APISecurity;
    }

    /**
     * Get Purchased QPS Specification

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QpsStandard Purchased QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQpsStandard() {
        return this.QpsStandard;
    }

    /**
     * Set Purchased QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
     * @param QpsStandard Purchased QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQpsStandard(Long QpsStandard) {
        this.QpsStandard = QpsStandard;
    }

    /**
     * Get Purchased Bandwidth Specification

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthStandard Purchased Bandwidth Specification

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBandwidthStandard() {
        return this.BandwidthStandard;
    }

    /**
     * Set Purchased Bandwidth Specification

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BandwidthStandard Purchased Bandwidth Specification

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidthStandard(Long BandwidthStandard) {
        this.BandwidthStandard = BandwidthStandard;
    }

    /**
     * Get Instance status

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Instance status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance Sandbox QPS Value

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SandboxQps Instance Sandbox QPS Value

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSandboxQps() {
        return this.SandboxQps;
    }

    /**
     * Set Instance Sandbox QPS Value

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SandboxQps Instance Sandbox QPS Value

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSandboxQps(Long SandboxQps) {
        this.SandboxQps = SandboxQps;
    }

    /**
     * Get Whether API Security is on Trial

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAPISecurityTrial Whether API Security is on Trial

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsAPISecurityTrial() {
        return this.IsAPISecurityTrial;
    }

    /**
     * Set Whether API Security is on Trial

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAPISecurityTrial Whether API Security is on Trial

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAPISecurityTrial(Long IsAPISecurityTrial) {
        this.IsAPISecurityTrial = IsAPISecurityTrial;
    }

    /**
     * Get Premium Package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MajorEventsPkg Premium Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MajorEventsPkg getMajorEventsPkg() {
        return this.MajorEventsPkg;
    }

    /**
     * Set Premium Package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MajorEventsPkg Premium Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMajorEventsPkg(MajorEventsPkg MajorEventsPkg) {
        this.MajorEventsPkg = MajorEventsPkg;
    }

    /**
     * Get Hybrid Cloud Sub-node Package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HybridPkg Hybrid Cloud Sub-node Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HybridPkg getHybridPkg() {
        return this.HybridPkg;
    }

    /**
     * Set Hybrid Cloud Sub-node Package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param HybridPkg Hybrid Cloud Sub-node Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHybridPkg(HybridPkg HybridPkg) {
        this.HybridPkg = HybridPkg;
    }

    /**
     * Get API security resource package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiPkg API security resource package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApiPkg getApiPkg() {
        return this.ApiPkg;
    }

    /**
     * Set API security resource package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiPkg API security resource package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiPkg(ApiPkg ApiPkg) {
        this.ApiPkg = ApiPkg;
    }

    /**
     * Get MMPS Acceleration Package

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiniPkg MMPS Acceleration Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MiniPkg getMiniPkg() {
        return this.MiniPkg;
    }

    /**
     * Set MMPS Acceleration Package

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiniPkg MMPS Acceleration Package

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiniPkg(MiniPkg MiniPkg) {
        this.MiniPkg = MiniPkg;
    }

    /**
     * Get Mini Program QPS Specification

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiniQpsStandard Mini Program QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMiniQpsStandard() {
        return this.MiniQpsStandard;
    }

    /**
     * Set Mini Program QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiniQpsStandard Mini Program QPS Specification

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiniQpsStandard(Long MiniQpsStandard) {
        this.MiniQpsStandard = MiniQpsStandard;
    }

    /**
     * Get Mini Program QPS Peak

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiniMaxQPS Mini Program QPS Peak

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMiniMaxQPS() {
        return this.MiniMaxQPS;
    }

    /**
     * Set Mini Program QPS Peak

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiniMaxQPS Mini Program QPS Peak

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiniMaxQPS(Long MiniMaxQPS) {
        this.MiniMaxQPS = MiniMaxQPS;
    }

    /**
     * Get Last overage time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastQpsExceedTime Last overage time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastQpsExceedTime() {
        return this.LastQpsExceedTime;
    }

    /**
     * Set Last overage time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastQpsExceedTime Last overage time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastQpsExceedTime(String LastQpsExceedTime) {
        this.LastQpsExceedTime = LastQpsExceedTime;
    }

    /**
     * Get ID quantity expansion package for secure mini program access.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiniExtendPkg ID quantity expansion package for secure mini program access.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MiniExtendPkg getMiniExtendPkg() {
        return this.MiniExtendPkg;
    }

    /**
     * Set ID quantity expansion package for secure mini program access.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiniExtendPkg ID quantity expansion package for secure mini program access.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiniExtendPkg(MiniExtendPkg MiniExtendPkg) {
        this.MiniExtendPkg = MiniExtendPkg;
    }

    /**
     * Get Billing item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillingItem Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillingItem Billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get Flag for delay of instance deletion.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FreeDelayFlag Flag for delay of instance deletion.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFreeDelayFlag() {
        return this.FreeDelayFlag;
    }

    /**
     * Set Flag for delay of instance deletion.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param FreeDelayFlag Flag for delay of instance deletion.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFreeDelayFlag(Long FreeDelayFlag) {
        this.FreeDelayFlag = FreeDelayFlag;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.SubDomainLimit != null) {
            this.SubDomainLimit = new Long(source.SubDomainLimit);
        }
        if (source.MainDomainCount != null) {
            this.MainDomainCount = new Long(source.MainDomainCount);
        }
        if (source.MainDomainLimit != null) {
            this.MainDomainLimit = new Long(source.MainDomainLimit);
        }
        if (source.MaxQPS != null) {
            this.MaxQPS = new Long(source.MaxQPS);
        }
        if (source.QPS != null) {
            this.QPS = new QPSPackageNew(source.QPS);
        }
        if (source.DomainPkg != null) {
            this.DomainPkg = new DomainPackageNew(source.DomainPkg);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.FraudPkg != null) {
            this.FraudPkg = new FraudPkg(source.FraudPkg);
        }
        if (source.BotPkg != null) {
            this.BotPkg = new BotPkg(source.BotPkg);
        }
        if (source.BotQPS != null) {
            this.BotQPS = new BotQPS(source.BotQPS);
        }
        if (source.ElasticBilling != null) {
            this.ElasticBilling = new Long(source.ElasticBilling);
        }
        if (source.AttackLogPost != null) {
            this.AttackLogPost = new Long(source.AttackLogPost);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.APISecurity != null) {
            this.APISecurity = new Long(source.APISecurity);
        }
        if (source.QpsStandard != null) {
            this.QpsStandard = new Long(source.QpsStandard);
        }
        if (source.BandwidthStandard != null) {
            this.BandwidthStandard = new Long(source.BandwidthStandard);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SandboxQps != null) {
            this.SandboxQps = new Long(source.SandboxQps);
        }
        if (source.IsAPISecurityTrial != null) {
            this.IsAPISecurityTrial = new Long(source.IsAPISecurityTrial);
        }
        if (source.MajorEventsPkg != null) {
            this.MajorEventsPkg = new MajorEventsPkg(source.MajorEventsPkg);
        }
        if (source.HybridPkg != null) {
            this.HybridPkg = new HybridPkg(source.HybridPkg);
        }
        if (source.ApiPkg != null) {
            this.ApiPkg = new ApiPkg(source.ApiPkg);
        }
        if (source.MiniPkg != null) {
            this.MiniPkg = new MiniPkg(source.MiniPkg);
        }
        if (source.MiniQpsStandard != null) {
            this.MiniQpsStandard = new Long(source.MiniQpsStandard);
        }
        if (source.MiniMaxQPS != null) {
            this.MiniMaxQPS = new Long(source.MiniMaxQPS);
        }
        if (source.LastQpsExceedTime != null) {
            this.LastQpsExceedTime = new String(source.LastQpsExceedTime);
        }
        if (source.MiniExtendPkg != null) {
            this.MiniExtendPkg = new MiniExtendPkg(source.MiniExtendPkg);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.FreeDelayFlag != null) {
            this.FreeDelayFlag = new Long(source.FreeDelayFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "SubDomainLimit", this.SubDomainLimit);
        this.setParamSimple(map, prefix + "MainDomainCount", this.MainDomainCount);
        this.setParamSimple(map, prefix + "MainDomainLimit", this.MainDomainLimit);
        this.setParamSimple(map, prefix + "MaxQPS", this.MaxQPS);
        this.setParamObj(map, prefix + "QPS.", this.QPS);
        this.setParamObj(map, prefix + "DomainPkg.", this.DomainPkg);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamObj(map, prefix + "FraudPkg.", this.FraudPkg);
        this.setParamObj(map, prefix + "BotPkg.", this.BotPkg);
        this.setParamObj(map, prefix + "BotQPS.", this.BotQPS);
        this.setParamSimple(map, prefix + "ElasticBilling", this.ElasticBilling);
        this.setParamSimple(map, prefix + "AttackLogPost", this.AttackLogPost);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamSimple(map, prefix + "APISecurity", this.APISecurity);
        this.setParamSimple(map, prefix + "QpsStandard", this.QpsStandard);
        this.setParamSimple(map, prefix + "BandwidthStandard", this.BandwidthStandard);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SandboxQps", this.SandboxQps);
        this.setParamSimple(map, prefix + "IsAPISecurityTrial", this.IsAPISecurityTrial);
        this.setParamObj(map, prefix + "MajorEventsPkg.", this.MajorEventsPkg);
        this.setParamObj(map, prefix + "HybridPkg.", this.HybridPkg);
        this.setParamObj(map, prefix + "ApiPkg.", this.ApiPkg);
        this.setParamObj(map, prefix + "MiniPkg.", this.MiniPkg);
        this.setParamSimple(map, prefix + "MiniQpsStandard", this.MiniQpsStandard);
        this.setParamSimple(map, prefix + "MiniMaxQPS", this.MiniMaxQPS);
        this.setParamSimple(map, prefix + "LastQpsExceedTime", this.LastQpsExceedTime);
        this.setParamObj(map, prefix + "MiniExtendPkg.", this.MiniExtendPkg);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "FreeDelayFlag", this.FreeDelayFlag);

    }
}

