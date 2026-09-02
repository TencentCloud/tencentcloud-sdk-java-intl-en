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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertDetail extends AbstractModel {

    /**
    * <p>Primary key ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Tenant ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Alarm unique ID</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>Major category of alarm (English enumeration: VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE)</p>
    */
    @SerializedName("AlertCategory")
    @Expose
    private String AlertCategory;

    /**
    * <p>Alarm sub-type (enum: MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK)</p>
    */
    @SerializedName("AlertSubType")
    @Expose
    private String AlertSubType;

    /**
    * <p>Associated rule ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Rule type: 0 - system rule; 1 - user-customized</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>Alarm level (English enumeration: CRITICAL/HIGH/MEDIUM/LOW/INFO)</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>Processing status (English enumeration: PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>ATT&amp;CK attack stages</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>Detection Mode (Enum: PRECISE/BALANCED/DEEP)</p>
    */
    @SerializedName("DetectMode")
    @Expose
    private String DetectMode;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Host UUID</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Number of aggregations</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>Whether it is a paid edition</p>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Long IsProVersion;

    /**
    * <p>Alarm source (English enumeration: HOST/CONTAINER/K8S/CSIP)</p>
    */
    @SerializedName("AlertSource")
    @Expose
    private String AlertSource;

    /**
    * <p>Container image ID (reserved field, always an empty string).</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Container ID (reserved field, always an empty string)</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>Cluster ID (reserved field, always an empty string)</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>First discovery time</p>
    */
    @SerializedName("FirstDetectTime")
    @Expose
    private String FirstDetectTime;

    /**
    * <p>Most recent discovery time</p>
    */
    @SerializedName("LatestDetectTime")
    @Expose
    private String LatestDetectTime;

    /**
    * <p>Rule name (rule enrichment)</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Content type: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>Instance name (asset enrichment)</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Public IP address (asset enrichment)</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Private IP address (asset enrichment)</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>Alert details json string (parsed by the frontend via JSON.parse; empty value is &quot;{}&quot;)</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Alarm name (Chinese and English name of the sub-type)</p>
    */
    @SerializedName("AlertName")
    @Expose
    private String AlertName;

    /**
    * <p>Security center tag</p>
    */
    @SerializedName("CSIPTags")
    @Expose
    private CSIPTag [] CSIPTags;

    /**
    * <p>Severity description (unified field, merged from original independent fields of sub-types)</p>
    */
    @SerializedName("HarmDesc")
    @Expose
    private String HarmDesc;

    /**
    * <p>Repair advice (unified field)</p>
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * <p>Data source: vuldb/vdc/intel/default</p>
    */
    @SerializedName("HarmDescSource")
    @Expose
    private String HarmDescSource;

    /**
    * <p>Unified threat intelligence tag (routes to different intelligence sources by sub-type)</p>
    */
    @SerializedName("ThreatTags")
    @Expose
    private String [] ThreatTags;

    /**
    * <p>Base64-decoded command (unique to high-risk command sub-type)</p>
    */
    @SerializedName("BashCmdDecoded")
    @Expose
    private String BashCmdDecoded;

    /**
    * <p>Vulnerability name (unique to network attack sub-type)</p>
    */
    @SerializedName("NetVulName")
    @Expose
    private String NetVulName;

    /**
    * <p>CVE ID (unique to network attack sub-type)</p>
    */
    @SerializedName("NetCVEId")
    @Expose
    private String NetCVEId;

    /**
    * <p>Exception behavior (unique to network attack sub-type)</p>
    */
    @SerializedName("NetAbnormalAction")
    @Expose
    private String NetAbnormalAction;

    /**
    * <p>IP intelligence information (do not return if empty)</p>
    */
    @SerializedName("IPIntel")
    @Expose
    private IPIntelInfo IPIntel;

    /**
    * <p>Multi-act attack rule type categorization: sequence/threshold/command</p>
    */
    @SerializedName("MultiBehaviorDetectionMode")
    @Expose
    private String MultiBehaviorDetectionMode;

    /**
    * <p>Alarm source description (derived by sub-type, describing which engine/rule detects it)</p>
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * <p>Time parameter format to process: 2026-05-26 19:45:48</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Source of intelligence enrichment result (flag indicating whether external intelligence is hit successfully this time). Parameter Value: "VDC" / "IPAnalysis" / "BreakingTI" / empty string</p>
    */
    @SerializedName("IntelSource")
    @Expose
    private String IntelSource;

    /**
    * <p>Comprehensive analysis: Chinese and English are translated. Chinese: Malicious/Safe/Unknown; English: Malicious/Safe/Unknown</p>
    */
    @SerializedName("Verdict")
    @Expose
    private String Verdict;

    /**
    * <p>Analysis basis</p>
    */
    @SerializedName("VerdictBasis")
    @Expose
    private String VerdictBasis;

    /**
    * <p>Virus name</p>
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * <p>Virus family</p>
    */
    @SerializedName("VirusFamily")
    @Expose
    private String VirusFamily;

    /**
    * <p>NetResponsePayload response packet (base64 encoded string)</p>
    */
    @SerializedName("NetResponsePayload")
    @Expose
    private String NetResponsePayload;

    /**
    * <p>Service process information (JSON string after base64 encoding)</p>
    */
    @SerializedName("NetSvcPs")
    @Expose
    private String NetSvcPs;

    /**
    * <p>Container name</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Container image name</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Container running status (raw enumeration: RUNNING/PAUSED/STOPPED...; frontend performs mapping itself)</p><p>Enumeration values:</p><ul><li>RUNNING: running</li><li>PAUSED: suspended</li><li>STOPPED: stopped</li><li>CREATED: created</li><li>DESTROYED: terminated</li><li>RESTARTING: restarting</li><li>REMOVING: migrating</li><li>DEAD: DEAD</li><li>UNKNOWN: unknown</li></ul>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>POD Name</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>POD IP</p>
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * <p>Namespace.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>POD workload type</p>
    */
    @SerializedName("PodWorkloadType")
    @Expose
    private String PodWorkloadType;

    /**
    * <p>Cluster ca cert md5</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>POD Unique id</p>
    */
    @SerializedName("PodUniqueId")
    @Expose
    private String PodUniqueId;

    /**
     * Get <p>Primary key ID</p> 
     * @return Id <p>Primary key ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Primary key ID</p>
     * @param Id <p>Primary key ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Tenant ID</p> 
     * @return AppId <p>Tenant ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Tenant ID</p>
     * @param AppId <p>Tenant ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Alarm unique ID</p> 
     * @return AlertId <p>Alarm unique ID</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>Alarm unique ID</p>
     * @param AlertId <p>Alarm unique ID</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>Major category of alarm (English enumeration: VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE)</p> 
     * @return AlertCategory <p>Major category of alarm (English enumeration: VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE)</p>
     */
    public String getAlertCategory() {
        return this.AlertCategory;
    }

    /**
     * Set <p>Major category of alarm (English enumeration: VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE)</p>
     * @param AlertCategory <p>Major category of alarm (English enumeration: VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE)</p>
     */
    public void setAlertCategory(String AlertCategory) {
        this.AlertCategory = AlertCategory;
    }

    /**
     * Get <p>Alarm sub-type (enum: MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK)</p> 
     * @return AlertSubType <p>Alarm sub-type (enum: MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK)</p>
     */
    public String getAlertSubType() {
        return this.AlertSubType;
    }

    /**
     * Set <p>Alarm sub-type (enum: MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK)</p>
     * @param AlertSubType <p>Alarm sub-type (enum: MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK)</p>
     */
    public void setAlertSubType(String AlertSubType) {
        this.AlertSubType = AlertSubType;
    }

    /**
     * Get <p>Associated rule ID</p> 
     * @return RuleId <p>Associated rule ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Associated rule ID</p>
     * @param RuleId <p>Associated rule ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Rule type: 0 - system rule; 1 - user-customized</p> 
     * @return RuleType <p>Rule type: 0 - system rule; 1 - user-customized</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>Rule type: 0 - system rule; 1 - user-customized</p>
     * @param RuleType <p>Rule type: 0 - system rule; 1 - user-customized</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>Alarm level (English enumeration: CRITICAL/HIGH/MEDIUM/LOW/INFO)</p> 
     * @return Level <p>Alarm level (English enumeration: CRITICAL/HIGH/MEDIUM/LOW/INFO)</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Alarm level (English enumeration: CRITICAL/HIGH/MEDIUM/LOW/INFO)</p>
     * @param Level <p>Alarm level (English enumeration: CRITICAL/HIGH/MEDIUM/LOW/INFO)</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Processing status (English enumeration: PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED)</p> 
     * @return Status <p>Processing status (English enumeration: PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Processing status (English enumeration: PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED)</p>
     * @param Status <p>Processing status (English enumeration: PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>ATT&amp;CK attack stages</p> 
     * @return AttackStage <p>ATT&amp;CK attack stages</p>
     */
    public String getAttackStage() {
        return this.AttackStage;
    }

    /**
     * Set <p>ATT&amp;CK attack stages</p>
     * @param AttackStage <p>ATT&amp;CK attack stages</p>
     */
    public void setAttackStage(String AttackStage) {
        this.AttackStage = AttackStage;
    }

    /**
     * Get <p>Detection Mode (Enum: PRECISE/BALANCED/DEEP)</p> 
     * @return DetectMode <p>Detection Mode (Enum: PRECISE/BALANCED/DEEP)</p>
     */
    public String getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set <p>Detection Mode (Enum: PRECISE/BALANCED/DEEP)</p>
     * @param DetectMode <p>Detection Mode (Enum: PRECISE/BALANCED/DEEP)</p>
     */
    public void setDetectMode(String DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Host UUID</p> 
     * @return Quuid <p>Host UUID</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host UUID</p>
     * @param Quuid <p>Host UUID</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Number of aggregations</p> 
     * @return EventCount <p>Number of aggregations</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>Number of aggregations</p>
     * @param EventCount <p>Number of aggregations</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>Whether it is a paid edition</p> 
     * @return IsProVersion <p>Whether it is a paid edition</p>
     */
    public Long getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set <p>Whether it is a paid edition</p>
     * @param IsProVersion <p>Whether it is a paid edition</p>
     */
    public void setIsProVersion(Long IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get <p>Alarm source (English enumeration: HOST/CONTAINER/K8S/CSIP)</p> 
     * @return AlertSource <p>Alarm source (English enumeration: HOST/CONTAINER/K8S/CSIP)</p>
     */
    public String getAlertSource() {
        return this.AlertSource;
    }

    /**
     * Set <p>Alarm source (English enumeration: HOST/CONTAINER/K8S/CSIP)</p>
     * @param AlertSource <p>Alarm source (English enumeration: HOST/CONTAINER/K8S/CSIP)</p>
     */
    public void setAlertSource(String AlertSource) {
        this.AlertSource = AlertSource;
    }

    /**
     * Get <p>Container image ID (reserved field, always an empty string).</p> 
     * @return ImageId <p>Container image ID (reserved field, always an empty string).</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Container image ID (reserved field, always an empty string).</p>
     * @param ImageId <p>Container image ID (reserved field, always an empty string).</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Container ID (reserved field, always an empty string)</p> 
     * @return ContainerId <p>Container ID (reserved field, always an empty string)</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>Container ID (reserved field, always an empty string)</p>
     * @param ContainerId <p>Container ID (reserved field, always an empty string)</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>Cluster ID (reserved field, always an empty string)</p> 
     * @return ClusterId <p>Cluster ID (reserved field, always an empty string)</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID (reserved field, always an empty string)</p>
     * @param ClusterId <p>Cluster ID (reserved field, always an empty string)</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>First discovery time</p> 
     * @return FirstDetectTime <p>First discovery time</p>
     */
    public String getFirstDetectTime() {
        return this.FirstDetectTime;
    }

    /**
     * Set <p>First discovery time</p>
     * @param FirstDetectTime <p>First discovery time</p>
     */
    public void setFirstDetectTime(String FirstDetectTime) {
        this.FirstDetectTime = FirstDetectTime;
    }

    /**
     * Get <p>Most recent discovery time</p> 
     * @return LatestDetectTime <p>Most recent discovery time</p>
     */
    public String getLatestDetectTime() {
        return this.LatestDetectTime;
    }

    /**
     * Set <p>Most recent discovery time</p>
     * @param LatestDetectTime <p>Most recent discovery time</p>
     */
    public void setLatestDetectTime(String LatestDetectTime) {
        this.LatestDetectTime = LatestDetectTime;
    }

    /**
     * Get <p>Rule name (rule enrichment)</p> 
     * @return RuleName <p>Rule name (rule enrichment)</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Rule name (rule enrichment)</p>
     * @param RuleName <p>Rule name (rule enrichment)</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Content type: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p> 
     * @return ContentType <p>Content type: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>Content type: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
     * @param ContentType <p>Content type: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>Instance name (asset enrichment)</p> 
     * @return InstanceName <p>Instance name (asset enrichment)</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name (asset enrichment)</p>
     * @param InstanceName <p>Instance name (asset enrichment)</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Public IP address (asset enrichment)</p> 
     * @return PublicIp <p>Public IP address (asset enrichment)</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public IP address (asset enrichment)</p>
     * @param PublicIp <p>Public IP address (asset enrichment)</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Private IP address (asset enrichment)</p> 
     * @return PrivateIp <p>Private IP address (asset enrichment)</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>Private IP address (asset enrichment)</p>
     * @param PrivateIp <p>Private IP address (asset enrichment)</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>Alert details json string (parsed by the frontend via JSON.parse; empty value is &quot;{}&quot;)</p> 
     * @return Content <p>Alert details json string (parsed by the frontend via JSON.parse; empty value is &quot;{}&quot;)</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Alert details json string (parsed by the frontend via JSON.parse; empty value is &quot;{}&quot;)</p>
     * @param Content <p>Alert details json string (parsed by the frontend via JSON.parse; empty value is &quot;{}&quot;)</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Alarm name (Chinese and English name of the sub-type)</p> 
     * @return AlertName <p>Alarm name (Chinese and English name of the sub-type)</p>
     */
    public String getAlertName() {
        return this.AlertName;
    }

    /**
     * Set <p>Alarm name (Chinese and English name of the sub-type)</p>
     * @param AlertName <p>Alarm name (Chinese and English name of the sub-type)</p>
     */
    public void setAlertName(String AlertName) {
        this.AlertName = AlertName;
    }

    /**
     * Get <p>Security center tag</p> 
     * @return CSIPTags <p>Security center tag</p>
     */
    public CSIPTag [] getCSIPTags() {
        return this.CSIPTags;
    }

    /**
     * Set <p>Security center tag</p>
     * @param CSIPTags <p>Security center tag</p>
     */
    public void setCSIPTags(CSIPTag [] CSIPTags) {
        this.CSIPTags = CSIPTags;
    }

    /**
     * Get <p>Severity description (unified field, merged from original independent fields of sub-types)</p> 
     * @return HarmDesc <p>Severity description (unified field, merged from original independent fields of sub-types)</p>
     */
    public String getHarmDesc() {
        return this.HarmDesc;
    }

    /**
     * Set <p>Severity description (unified field, merged from original independent fields of sub-types)</p>
     * @param HarmDesc <p>Severity description (unified field, merged from original independent fields of sub-types)</p>
     */
    public void setHarmDesc(String HarmDesc) {
        this.HarmDesc = HarmDesc;
    }

    /**
     * Get <p>Repair advice (unified field)</p> 
     * @return SuggestScheme <p>Repair advice (unified field)</p>
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set <p>Repair advice (unified field)</p>
     * @param SuggestScheme <p>Repair advice (unified field)</p>
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get <p>Data source: vuldb/vdc/intel/default</p> 
     * @return HarmDescSource <p>Data source: vuldb/vdc/intel/default</p>
     */
    public String getHarmDescSource() {
        return this.HarmDescSource;
    }

    /**
     * Set <p>Data source: vuldb/vdc/intel/default</p>
     * @param HarmDescSource <p>Data source: vuldb/vdc/intel/default</p>
     */
    public void setHarmDescSource(String HarmDescSource) {
        this.HarmDescSource = HarmDescSource;
    }

    /**
     * Get <p>Unified threat intelligence tag (routes to different intelligence sources by sub-type)</p> 
     * @return ThreatTags <p>Unified threat intelligence tag (routes to different intelligence sources by sub-type)</p>
     */
    public String [] getThreatTags() {
        return this.ThreatTags;
    }

    /**
     * Set <p>Unified threat intelligence tag (routes to different intelligence sources by sub-type)</p>
     * @param ThreatTags <p>Unified threat intelligence tag (routes to different intelligence sources by sub-type)</p>
     */
    public void setThreatTags(String [] ThreatTags) {
        this.ThreatTags = ThreatTags;
    }

    /**
     * Get <p>Base64-decoded command (unique to high-risk command sub-type)</p> 
     * @return BashCmdDecoded <p>Base64-decoded command (unique to high-risk command sub-type)</p>
     */
    public String getBashCmdDecoded() {
        return this.BashCmdDecoded;
    }

    /**
     * Set <p>Base64-decoded command (unique to high-risk command sub-type)</p>
     * @param BashCmdDecoded <p>Base64-decoded command (unique to high-risk command sub-type)</p>
     */
    public void setBashCmdDecoded(String BashCmdDecoded) {
        this.BashCmdDecoded = BashCmdDecoded;
    }

    /**
     * Get <p>Vulnerability name (unique to network attack sub-type)</p> 
     * @return NetVulName <p>Vulnerability name (unique to network attack sub-type)</p>
     */
    public String getNetVulName() {
        return this.NetVulName;
    }

    /**
     * Set <p>Vulnerability name (unique to network attack sub-type)</p>
     * @param NetVulName <p>Vulnerability name (unique to network attack sub-type)</p>
     */
    public void setNetVulName(String NetVulName) {
        this.NetVulName = NetVulName;
    }

    /**
     * Get <p>CVE ID (unique to network attack sub-type)</p> 
     * @return NetCVEId <p>CVE ID (unique to network attack sub-type)</p>
     */
    public String getNetCVEId() {
        return this.NetCVEId;
    }

    /**
     * Set <p>CVE ID (unique to network attack sub-type)</p>
     * @param NetCVEId <p>CVE ID (unique to network attack sub-type)</p>
     */
    public void setNetCVEId(String NetCVEId) {
        this.NetCVEId = NetCVEId;
    }

    /**
     * Get <p>Exception behavior (unique to network attack sub-type)</p> 
     * @return NetAbnormalAction <p>Exception behavior (unique to network attack sub-type)</p>
     */
    public String getNetAbnormalAction() {
        return this.NetAbnormalAction;
    }

    /**
     * Set <p>Exception behavior (unique to network attack sub-type)</p>
     * @param NetAbnormalAction <p>Exception behavior (unique to network attack sub-type)</p>
     */
    public void setNetAbnormalAction(String NetAbnormalAction) {
        this.NetAbnormalAction = NetAbnormalAction;
    }

    /**
     * Get <p>IP intelligence information (do not return if empty)</p> 
     * @return IPIntel <p>IP intelligence information (do not return if empty)</p>
     */
    public IPIntelInfo getIPIntel() {
        return this.IPIntel;
    }

    /**
     * Set <p>IP intelligence information (do not return if empty)</p>
     * @param IPIntel <p>IP intelligence information (do not return if empty)</p>
     */
    public void setIPIntel(IPIntelInfo IPIntel) {
        this.IPIntel = IPIntel;
    }

    /**
     * Get <p>Multi-act attack rule type categorization: sequence/threshold/command</p> 
     * @return MultiBehaviorDetectionMode <p>Multi-act attack rule type categorization: sequence/threshold/command</p>
     */
    public String getMultiBehaviorDetectionMode() {
        return this.MultiBehaviorDetectionMode;
    }

    /**
     * Set <p>Multi-act attack rule type categorization: sequence/threshold/command</p>
     * @param MultiBehaviorDetectionMode <p>Multi-act attack rule type categorization: sequence/threshold/command</p>
     */
    public void setMultiBehaviorDetectionMode(String MultiBehaviorDetectionMode) {
        this.MultiBehaviorDetectionMode = MultiBehaviorDetectionMode;
    }

    /**
     * Get <p>Alarm source description (derived by sub-type, describing which engine/rule detects it)</p> 
     * @return SourceDesc <p>Alarm source description (derived by sub-type, describing which engine/rule detects it)</p>
     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set <p>Alarm source description (derived by sub-type, describing which engine/rule detects it)</p>
     * @param SourceDesc <p>Alarm source description (derived by sub-type, describing which engine/rule detects it)</p>
     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get <p>Time parameter format to process: 2026-05-26 19:45:48</p> 
     * @return ModifyTime <p>Time parameter format to process: 2026-05-26 19:45:48</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Time parameter format to process: 2026-05-26 19:45:48</p>
     * @param ModifyTime <p>Time parameter format to process: 2026-05-26 19:45:48</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Source of intelligence enrichment result (flag indicating whether external intelligence is hit successfully this time). Parameter Value: "VDC" / "IPAnalysis" / "BreakingTI" / empty string</p> 
     * @return IntelSource <p>Source of intelligence enrichment result (flag indicating whether external intelligence is hit successfully this time). Parameter Value: "VDC" / "IPAnalysis" / "BreakingTI" / empty string</p>
     */
    public String getIntelSource() {
        return this.IntelSource;
    }

    /**
     * Set <p>Source of intelligence enrichment result (flag indicating whether external intelligence is hit successfully this time). Parameter Value: "VDC" / "IPAnalysis" / "BreakingTI" / empty string</p>
     * @param IntelSource <p>Source of intelligence enrichment result (flag indicating whether external intelligence is hit successfully this time). Parameter Value: "VDC" / "IPAnalysis" / "BreakingTI" / empty string</p>
     */
    public void setIntelSource(String IntelSource) {
        this.IntelSource = IntelSource;
    }

    /**
     * Get <p>Comprehensive analysis: Chinese and English are translated. Chinese: Malicious/Safe/Unknown; English: Malicious/Safe/Unknown</p> 
     * @return Verdict <p>Comprehensive analysis: Chinese and English are translated. Chinese: Malicious/Safe/Unknown; English: Malicious/Safe/Unknown</p>
     */
    public String getVerdict() {
        return this.Verdict;
    }

    /**
     * Set <p>Comprehensive analysis: Chinese and English are translated. Chinese: Malicious/Safe/Unknown; English: Malicious/Safe/Unknown</p>
     * @param Verdict <p>Comprehensive analysis: Chinese and English are translated. Chinese: Malicious/Safe/Unknown; English: Malicious/Safe/Unknown</p>
     */
    public void setVerdict(String Verdict) {
        this.Verdict = Verdict;
    }

    /**
     * Get <p>Analysis basis</p> 
     * @return VerdictBasis <p>Analysis basis</p>
     */
    public String getVerdictBasis() {
        return this.VerdictBasis;
    }

    /**
     * Set <p>Analysis basis</p>
     * @param VerdictBasis <p>Analysis basis</p>
     */
    public void setVerdictBasis(String VerdictBasis) {
        this.VerdictBasis = VerdictBasis;
    }

    /**
     * Get <p>Virus name</p> 
     * @return VirusName <p>Virus name</p>
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set <p>Virus name</p>
     * @param VirusName <p>Virus name</p>
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get <p>Virus family</p> 
     * @return VirusFamily <p>Virus family</p>
     */
    public String getVirusFamily() {
        return this.VirusFamily;
    }

    /**
     * Set <p>Virus family</p>
     * @param VirusFamily <p>Virus family</p>
     */
    public void setVirusFamily(String VirusFamily) {
        this.VirusFamily = VirusFamily;
    }

    /**
     * Get <p>NetResponsePayload response packet (base64 encoded string)</p> 
     * @return NetResponsePayload <p>NetResponsePayload response packet (base64 encoded string)</p>
     */
    public String getNetResponsePayload() {
        return this.NetResponsePayload;
    }

    /**
     * Set <p>NetResponsePayload response packet (base64 encoded string)</p>
     * @param NetResponsePayload <p>NetResponsePayload response packet (base64 encoded string)</p>
     */
    public void setNetResponsePayload(String NetResponsePayload) {
        this.NetResponsePayload = NetResponsePayload;
    }

    /**
     * Get <p>Service process information (JSON string after base64 encoding)</p> 
     * @return NetSvcPs <p>Service process information (JSON string after base64 encoding)</p>
     */
    public String getNetSvcPs() {
        return this.NetSvcPs;
    }

    /**
     * Set <p>Service process information (JSON string after base64 encoding)</p>
     * @param NetSvcPs <p>Service process information (JSON string after base64 encoding)</p>
     */
    public void setNetSvcPs(String NetSvcPs) {
        this.NetSvcPs = NetSvcPs;
    }

    /**
     * Get <p>Container name</p> 
     * @return ContainerName <p>Container name</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name</p>
     * @param ContainerName <p>Container name</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>Container image name</p> 
     * @return ImageName <p>Container image name</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>Container image name</p>
     * @param ImageName <p>Container image name</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Container running status (raw enumeration: RUNNING/PAUSED/STOPPED...; frontend performs mapping itself)</p><p>Enumeration values:</p><ul><li>RUNNING: running</li><li>PAUSED: suspended</li><li>STOPPED: stopped</li><li>CREATED: created</li><li>DESTROYED: terminated</li><li>RESTARTING: restarting</li><li>REMOVING: migrating</li><li>DEAD: DEAD</li><li>UNKNOWN: unknown</li></ul> 
     * @return RunStatus <p>Container running status (raw enumeration: RUNNING/PAUSED/STOPPED...; frontend performs mapping itself)</p><p>Enumeration values:</p><ul><li>RUNNING: running</li><li>PAUSED: suspended</li><li>STOPPED: stopped</li><li>CREATED: created</li><li>DESTROYED: terminated</li><li>RESTARTING: restarting</li><li>REMOVING: migrating</li><li>DEAD: DEAD</li><li>UNKNOWN: unknown</li></ul>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>Container running status (raw enumeration: RUNNING/PAUSED/STOPPED...; frontend performs mapping itself)</p><p>Enumeration values:</p><ul><li>RUNNING: running</li><li>PAUSED: suspended</li><li>STOPPED: stopped</li><li>CREATED: created</li><li>DESTROYED: terminated</li><li>RESTARTING: restarting</li><li>REMOVING: migrating</li><li>DEAD: DEAD</li><li>UNKNOWN: unknown</li></ul>
     * @param RunStatus <p>Container running status (raw enumeration: RUNNING/PAUSED/STOPPED...; frontend performs mapping itself)</p><p>Enumeration values:</p><ul><li>RUNNING: running</li><li>PAUSED: suspended</li><li>STOPPED: stopped</li><li>CREATED: created</li><li>DESTROYED: terminated</li><li>RESTARTING: restarting</li><li>REMOVING: migrating</li><li>DEAD: DEAD</li><li>UNKNOWN: unknown</li></ul>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>POD Name</p> 
     * @return PodName <p>POD Name</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>POD Name</p>
     * @param PodName <p>POD Name</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>POD IP</p> 
     * @return PodIp <p>POD IP</p>
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set <p>POD IP</p>
     * @param PodIp <p>POD IP</p>
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get <p>Namespace.</p> 
     * @return Namespace <p>Namespace.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Namespace.</p>
     * @param Namespace <p>Namespace.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>POD workload type</p> 
     * @return PodWorkloadType <p>POD workload type</p>
     */
    public String getPodWorkloadType() {
        return this.PodWorkloadType;
    }

    /**
     * Set <p>POD workload type</p>
     * @param PodWorkloadType <p>POD workload type</p>
     */
    public void setPodWorkloadType(String PodWorkloadType) {
        this.PodWorkloadType = PodWorkloadType;
    }

    /**
     * Get <p>Cluster ca cert md5</p> 
     * @return ClusterCaMD5 <p>Cluster ca cert md5</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>Cluster ca cert md5</p>
     * @param ClusterCaMD5 <p>Cluster ca cert md5</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>POD Unique id</p> 
     * @return PodUniqueId <p>POD Unique id</p>
     */
    public String getPodUniqueId() {
        return this.PodUniqueId;
    }

    /**
     * Set <p>POD Unique id</p>
     * @param PodUniqueId <p>POD Unique id</p>
     */
    public void setPodUniqueId(String PodUniqueId) {
        this.PodUniqueId = PodUniqueId;
    }

    public EdrAlertDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertDetail(EdrAlertDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.AlertCategory != null) {
            this.AlertCategory = new String(source.AlertCategory);
        }
        if (source.AlertSubType != null) {
            this.AlertSubType = new String(source.AlertSubType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new String(source.DetectMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Long(source.IsProVersion);
        }
        if (source.AlertSource != null) {
            this.AlertSource = new String(source.AlertSource);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.FirstDetectTime != null) {
            this.FirstDetectTime = new String(source.FirstDetectTime);
        }
        if (source.LatestDetectTime != null) {
            this.LatestDetectTime = new String(source.LatestDetectTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.AlertName != null) {
            this.AlertName = new String(source.AlertName);
        }
        if (source.CSIPTags != null) {
            this.CSIPTags = new CSIPTag[source.CSIPTags.length];
            for (int i = 0; i < source.CSIPTags.length; i++) {
                this.CSIPTags[i] = new CSIPTag(source.CSIPTags[i]);
            }
        }
        if (source.HarmDesc != null) {
            this.HarmDesc = new String(source.HarmDesc);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.HarmDescSource != null) {
            this.HarmDescSource = new String(source.HarmDescSource);
        }
        if (source.ThreatTags != null) {
            this.ThreatTags = new String[source.ThreatTags.length];
            for (int i = 0; i < source.ThreatTags.length; i++) {
                this.ThreatTags[i] = new String(source.ThreatTags[i]);
            }
        }
        if (source.BashCmdDecoded != null) {
            this.BashCmdDecoded = new String(source.BashCmdDecoded);
        }
        if (source.NetVulName != null) {
            this.NetVulName = new String(source.NetVulName);
        }
        if (source.NetCVEId != null) {
            this.NetCVEId = new String(source.NetCVEId);
        }
        if (source.NetAbnormalAction != null) {
            this.NetAbnormalAction = new String(source.NetAbnormalAction);
        }
        if (source.IPIntel != null) {
            this.IPIntel = new IPIntelInfo(source.IPIntel);
        }
        if (source.MultiBehaviorDetectionMode != null) {
            this.MultiBehaviorDetectionMode = new String(source.MultiBehaviorDetectionMode);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.IntelSource != null) {
            this.IntelSource = new String(source.IntelSource);
        }
        if (source.Verdict != null) {
            this.Verdict = new String(source.Verdict);
        }
        if (source.VerdictBasis != null) {
            this.VerdictBasis = new String(source.VerdictBasis);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.VirusFamily != null) {
            this.VirusFamily = new String(source.VirusFamily);
        }
        if (source.NetResponsePayload != null) {
            this.NetResponsePayload = new String(source.NetResponsePayload);
        }
        if (source.NetSvcPs != null) {
            this.NetSvcPs = new String(source.NetSvcPs);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.PodWorkloadType != null) {
            this.PodWorkloadType = new String(source.PodWorkloadType);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.PodUniqueId != null) {
            this.PodUniqueId = new String(source.PodUniqueId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "AlertCategory", this.AlertCategory);
        this.setParamSimple(map, prefix + "AlertSubType", this.AlertSubType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "AlertSource", this.AlertSource);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LatestDetectTime", this.LatestDetectTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "AlertName", this.AlertName);
        this.setParamArrayObj(map, prefix + "CSIPTags.", this.CSIPTags);
        this.setParamSimple(map, prefix + "HarmDesc", this.HarmDesc);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "HarmDescSource", this.HarmDescSource);
        this.setParamArraySimple(map, prefix + "ThreatTags.", this.ThreatTags);
        this.setParamSimple(map, prefix + "BashCmdDecoded", this.BashCmdDecoded);
        this.setParamSimple(map, prefix + "NetVulName", this.NetVulName);
        this.setParamSimple(map, prefix + "NetCVEId", this.NetCVEId);
        this.setParamSimple(map, prefix + "NetAbnormalAction", this.NetAbnormalAction);
        this.setParamObj(map, prefix + "IPIntel.", this.IPIntel);
        this.setParamSimple(map, prefix + "MultiBehaviorDetectionMode", this.MultiBehaviorDetectionMode);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IntelSource", this.IntelSource);
        this.setParamSimple(map, prefix + "Verdict", this.Verdict);
        this.setParamSimple(map, prefix + "VerdictBasis", this.VerdictBasis);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "VirusFamily", this.VirusFamily);
        this.setParamSimple(map, prefix + "NetResponsePayload", this.NetResponsePayload);
        this.setParamSimple(map, prefix + "NetSvcPs", this.NetSvcPs);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "PodWorkloadType", this.PodWorkloadType);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamSimple(map, prefix + "PodUniqueId", this.PodUniqueId);

    }
}

