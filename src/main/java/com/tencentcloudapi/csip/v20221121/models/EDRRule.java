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

public class EDRRule extends AbstractModel {

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>Policy type. 0: System policy; 1: Custom policy</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Content Type: md5-File MD5, cmdline-Command Line, dns-DNS, ip_inbound-Inbound IP, ip_outbound-Outbound IP, custom_file-Custom File, process_network-Process Network</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>Executed Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>Alarm Level: 0-None, 1-High, 2-Medium, 3-Low, 4-Reminder</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>Detection Mode: 0-Precise, 1-Balanced, 2-Deep</p>
    */
    @SerializedName("DetectMode")
    @Expose
    private Long DetectMode;

    /**
    * <p>Detection mode / Detect Type: 0-Host Detection, 1-Network Detection</p>
    */
    @SerializedName("DetectType")
    @Expose
    private Long DetectType;

    /**
    * <p>Attack phase</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>Effective asset scope of host / Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>Selected host at host runtime</p>
    */
    @SerializedName("QUUIDS")
    @Expose
    private String [] QUUIDS;

    /**
    * <p>Status: 0-Enabled, 1-Disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Modification time.</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Whether interception is supported / Support Block: 0-Not Supported, 1-Supported</p>
    */
    @SerializedName("SupportBlock")
    @Expose
    private Long SupportBlock;

    /**
    * <p>MD5 list. This field is filled when ContentType is md5.</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>File name list, filled when ContentType=custom_file</p>
    */
    @SerializedName("FileName")
    @Expose
    private String [] FileName;

    /**
    * <p>File directory list, fill when ContentType=custom_file</p>
    */
    @SerializedName("FileDirectory")
    @Expose
    private String [] FileDirectory;

    /**
    * <p>Domain name list. Fill in when ContentType=dns</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>Outbound IP list, populated when ContentType=ip_outbound</p>
    */
    @SerializedName("OutboundIP")
    @Expose
    private String [] OutboundIP;

    /**
    * <p>Inbound IP list, filled when ContentType=ip_inbound</p>
    */
    @SerializedName("InboundIP")
    @Expose
    private String [] InboundIP;

    /**
    * <p>Command line rule, filled when ContentType=cmdline</p>
    */
    @SerializedName("CmdLineRules")
    @Expose
    private RuleContentCmdLine CmdLineRules;

    /**
    * <p>Container Image Scope: 0-Specified Images, 1-All Images</p>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>Image ID list that takes effect / Image IDs (when TCSSScope=0)</p>
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

    /**
    * <p>Image name regular expression / Image Names Regex</p>
    */
    @SerializedName("ImageNamesRegex")
    @Expose
    private String ImageNamesRegex;

    /**
    * <p>Confidence: 0-Low, 1-Medium, 2-High</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * <p>Excluded host list / Excluded Host QUUIDS</p>
    */
    @SerializedName("ExcludeQUUIDS")
    @Expose
    private String [] ExcludeQUUIDS;

    /**
    * <p>Excluded image id list / Excluded Image IDs</p>
    */
    @SerializedName("ExcludeImageIDs")
    @Expose
    private String [] ExcludeImageIDs;

    /**
    * <p>Process network rules</p>
    */
    @SerializedName("ProcessNetworkRules")
    @Expose
    private RuleContentProcessNetwork ProcessNetworkRules;

    /**
    * <p>APPID corresponding to the policy.</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Selected instance ID range</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>Excluded instance ID</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
    * <p>Cluster ID list that takes effect (with a value when TCSSScope=0; empty returns [])</p>
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
    * <p>Cluster ID list for exclusion (empty returns [])</p>
    */
    @SerializedName("ExcludeClusterIDs")
    @Expose
    private String [] ExcludeClusterIDs;

    /**
    * <p>Container condition matching.</p>
    */
    @SerializedName("ConditionMatches")
    @Expose
    private ConditionMatch [] ConditionMatches;

    /**
    * <p>Security center tag</p>
    */
    @SerializedName("TagItems")
    @Expose
    private EDRRuleTagItem [] TagItems;

    /**
     * Get <p>Policy ID.</p> 
     * @return RuleID <p>Policy ID.</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param RuleID <p>Policy ID.</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>Policy type. 0: System policy; 1: Custom policy</p> 
     * @return RuleType <p>Policy type. 0: System policy; 1: Custom policy</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>Policy type. 0: System policy; 1: Custom policy</p>
     * @param RuleType <p>Policy type. 0: System policy; 1: Custom policy</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>Policy name.</p> 
     * @return Name <p>Policy name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Policy name.</p>
     * @param Name <p>Policy name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Policy description</p> 
     * @return Description <p>Policy description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy description</p>
     * @param Description <p>Policy description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Content Type: md5-File MD5, cmdline-Command Line, dns-DNS, ip_inbound-Inbound IP, ip_outbound-Outbound IP, custom_file-Custom File, process_network-Process Network</p> 
     * @return ContentType <p>Content Type: md5-File MD5, cmdline-Command Line, dns-DNS, ip_inbound-Inbound IP, ip_outbound-Outbound IP, custom_file-Custom File, process_network-Process Network</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>Content Type: md5-File MD5, cmdline-Command Line, dns-DNS, ip_inbound-Inbound IP, ip_outbound-Outbound IP, custom_file-Custom File, process_network-Process Network</p>
     * @param ContentType <p>Content Type: md5-File MD5, cmdline-Command Line, dns-DNS, ip_inbound-Inbound IP, ip_outbound-Outbound IP, custom_file-Custom File, process_network-Process Network</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>Executed Action: 0-Alert, 1-Allow, 2-Alert and Block</p> 
     * @return Action <p>Executed Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>Executed Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
     * @param Action <p>Executed Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Alarm Level: 0-None, 1-High, 2-Medium, 3-Low, 4-Reminder</p> 
     * @return Level <p>Alarm Level: 0-None, 1-High, 2-Medium, 3-Low, 4-Reminder</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Alarm Level: 0-None, 1-High, 2-Medium, 3-Low, 4-Reminder</p>
     * @param Level <p>Alarm Level: 0-None, 1-High, 2-Medium, 3-Low, 4-Reminder</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Detection Mode: 0-Precise, 1-Balanced, 2-Deep</p> 
     * @return DetectMode <p>Detection Mode: 0-Precise, 1-Balanced, 2-Deep</p>
     */
    public Long getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set <p>Detection Mode: 0-Precise, 1-Balanced, 2-Deep</p>
     * @param DetectMode <p>Detection Mode: 0-Precise, 1-Balanced, 2-Deep</p>
     */
    public void setDetectMode(Long DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get <p>Detection mode / Detect Type: 0-Host Detection, 1-Network Detection</p> 
     * @return DetectType <p>Detection mode / Detect Type: 0-Host Detection, 1-Network Detection</p>
     */
    public Long getDetectType() {
        return this.DetectType;
    }

    /**
     * Set <p>Detection mode / Detect Type: 0-Host Detection, 1-Network Detection</p>
     * @param DetectType <p>Detection mode / Detect Type: 0-Host Detection, 1-Network Detection</p>
     */
    public void setDetectType(Long DetectType) {
        this.DetectType = DetectType;
    }

    /**
     * Get <p>Attack phase</p> 
     * @return AttackStage <p>Attack phase</p>
     */
    public String getAttackStage() {
        return this.AttackStage;
    }

    /**
     * Set <p>Attack phase</p>
     * @param AttackStage <p>Attack phase</p>
     */
    public void setAttackStage(String AttackStage) {
        this.AttackStage = AttackStage;
    }

    /**
     * Get <p>Effective asset scope of host / Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship</p> 
     * @return CWPScope <p>Effective asset scope of host / Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>Effective asset scope of host / Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship</p>
     * @param CWPScope <p>Effective asset scope of host / Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get <p>Selected host at host runtime</p> 
     * @return QUUIDS <p>Selected host at host runtime</p>
     */
    public String [] getQUUIDS() {
        return this.QUUIDS;
    }

    /**
     * Set <p>Selected host at host runtime</p>
     * @param QUUIDS <p>Selected host at host runtime</p>
     */
    public void setQUUIDS(String [] QUUIDS) {
        this.QUUIDS = QUUIDS;
    }

    /**
     * Get <p>Status: 0-Enabled, 1-Disabled</p> 
     * @return Status <p>Status: 0-Enabled, 1-Disabled</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status: 0-Enabled, 1-Disabled</p>
     * @param Status <p>Status: 0-Enabled, 1-Disabled</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Modification time.</p> 
     * @return ModifyTime <p>Modification time.</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Modification time.</p>
     * @param ModifyTime <p>Modification time.</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Whether interception is supported / Support Block: 0-Not Supported, 1-Supported</p> 
     * @return SupportBlock <p>Whether interception is supported / Support Block: 0-Not Supported, 1-Supported</p>
     */
    public Long getSupportBlock() {
        return this.SupportBlock;
    }

    /**
     * Set <p>Whether interception is supported / Support Block: 0-Not Supported, 1-Supported</p>
     * @param SupportBlock <p>Whether interception is supported / Support Block: 0-Not Supported, 1-Supported</p>
     */
    public void setSupportBlock(Long SupportBlock) {
        this.SupportBlock = SupportBlock;
    }

    /**
     * Get <p>MD5 list. This field is filled when ContentType is md5.</p> 
     * @return Md5List <p>MD5 list. This field is filled when ContentType is md5.</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>MD5 list. This field is filled when ContentType is md5.</p>
     * @param Md5List <p>MD5 list. This field is filled when ContentType is md5.</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>File name list, filled when ContentType=custom_file</p> 
     * @return FileName <p>File name list, filled when ContentType=custom_file</p>
     */
    public String [] getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name list, filled when ContentType=custom_file</p>
     * @param FileName <p>File name list, filled when ContentType=custom_file</p>
     */
    public void setFileName(String [] FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File directory list, fill when ContentType=custom_file</p> 
     * @return FileDirectory <p>File directory list, fill when ContentType=custom_file</p>
     */
    public String [] getFileDirectory() {
        return this.FileDirectory;
    }

    /**
     * Set <p>File directory list, fill when ContentType=custom_file</p>
     * @param FileDirectory <p>File directory list, fill when ContentType=custom_file</p>
     */
    public void setFileDirectory(String [] FileDirectory) {
        this.FileDirectory = FileDirectory;
    }

    /**
     * Get <p>Domain name list. Fill in when ContentType=dns</p> 
     * @return Domains <p>Domain name list. Fill in when ContentType=dns</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>Domain name list. Fill in when ContentType=dns</p>
     * @param Domains <p>Domain name list. Fill in when ContentType=dns</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>Outbound IP list, populated when ContentType=ip_outbound</p> 
     * @return OutboundIP <p>Outbound IP list, populated when ContentType=ip_outbound</p>
     */
    public String [] getOutboundIP() {
        return this.OutboundIP;
    }

    /**
     * Set <p>Outbound IP list, populated when ContentType=ip_outbound</p>
     * @param OutboundIP <p>Outbound IP list, populated when ContentType=ip_outbound</p>
     */
    public void setOutboundIP(String [] OutboundIP) {
        this.OutboundIP = OutboundIP;
    }

    /**
     * Get <p>Inbound IP list, filled when ContentType=ip_inbound</p> 
     * @return InboundIP <p>Inbound IP list, filled when ContentType=ip_inbound</p>
     */
    public String [] getInboundIP() {
        return this.InboundIP;
    }

    /**
     * Set <p>Inbound IP list, filled when ContentType=ip_inbound</p>
     * @param InboundIP <p>Inbound IP list, filled when ContentType=ip_inbound</p>
     */
    public void setInboundIP(String [] InboundIP) {
        this.InboundIP = InboundIP;
    }

    /**
     * Get <p>Command line rule, filled when ContentType=cmdline</p> 
     * @return CmdLineRules <p>Command line rule, filled when ContentType=cmdline</p>
     */
    public RuleContentCmdLine getCmdLineRules() {
        return this.CmdLineRules;
    }

    /**
     * Set <p>Command line rule, filled when ContentType=cmdline</p>
     * @param CmdLineRules <p>Command line rule, filled when ContentType=cmdline</p>
     */
    public void setCmdLineRules(RuleContentCmdLine CmdLineRules) {
        this.CmdLineRules = CmdLineRules;
    }

    /**
     * Get <p>Container Image Scope: 0-Specified Images, 1-All Images</p> 
     * @return TCSSScope <p>Container Image Scope: 0-Specified Images, 1-All Images</p>
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set <p>Container Image Scope: 0-Specified Images, 1-All Images</p>
     * @param TCSSScope <p>Container Image Scope: 0-Specified Images, 1-All Images</p>
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get <p>Image ID list that takes effect / Image IDs (when TCSSScope=0)</p> 
     * @return ImageIDs <p>Image ID list that takes effect / Image IDs (when TCSSScope=0)</p>
     */
    public String [] getImageIDs() {
        return this.ImageIDs;
    }

    /**
     * Set <p>Image ID list that takes effect / Image IDs (when TCSSScope=0)</p>
     * @param ImageIDs <p>Image ID list that takes effect / Image IDs (when TCSSScope=0)</p>
     */
    public void setImageIDs(String [] ImageIDs) {
        this.ImageIDs = ImageIDs;
    }

    /**
     * Get <p>Image name regular expression / Image Names Regex</p> 
     * @return ImageNamesRegex <p>Image name regular expression / Image Names Regex</p>
     */
    public String getImageNamesRegex() {
        return this.ImageNamesRegex;
    }

    /**
     * Set <p>Image name regular expression / Image Names Regex</p>
     * @param ImageNamesRegex <p>Image name regular expression / Image Names Regex</p>
     */
    public void setImageNamesRegex(String ImageNamesRegex) {
        this.ImageNamesRegex = ImageNamesRegex;
    }

    /**
     * Get <p>Confidence: 0-Low, 1-Medium, 2-High</p> 
     * @return Confidence <p>Confidence: 0-Low, 1-Medium, 2-High</p>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Confidence: 0-Low, 1-Medium, 2-High</p>
     * @param Confidence <p>Confidence: 0-Low, 1-Medium, 2-High</p>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Excluded host list / Excluded Host QUUIDS</p> 
     * @return ExcludeQUUIDS <p>Excluded host list / Excluded Host QUUIDS</p>
     */
    public String [] getExcludeQUUIDS() {
        return this.ExcludeQUUIDS;
    }

    /**
     * Set <p>Excluded host list / Excluded Host QUUIDS</p>
     * @param ExcludeQUUIDS <p>Excluded host list / Excluded Host QUUIDS</p>
     */
    public void setExcludeQUUIDS(String [] ExcludeQUUIDS) {
        this.ExcludeQUUIDS = ExcludeQUUIDS;
    }

    /**
     * Get <p>Excluded image id list / Excluded Image IDs</p> 
     * @return ExcludeImageIDs <p>Excluded image id list / Excluded Image IDs</p>
     */
    public String [] getExcludeImageIDs() {
        return this.ExcludeImageIDs;
    }

    /**
     * Set <p>Excluded image id list / Excluded Image IDs</p>
     * @param ExcludeImageIDs <p>Excluded image id list / Excluded Image IDs</p>
     */
    public void setExcludeImageIDs(String [] ExcludeImageIDs) {
        this.ExcludeImageIDs = ExcludeImageIDs;
    }

    /**
     * Get <p>Process network rules</p> 
     * @return ProcessNetworkRules <p>Process network rules</p>
     */
    public RuleContentProcessNetwork getProcessNetworkRules() {
        return this.ProcessNetworkRules;
    }

    /**
     * Set <p>Process network rules</p>
     * @param ProcessNetworkRules <p>Process network rules</p>
     */
    public void setProcessNetworkRules(RuleContentProcessNetwork ProcessNetworkRules) {
        this.ProcessNetworkRules = ProcessNetworkRules;
    }

    /**
     * Get <p>APPID corresponding to the policy.</p> 
     * @return AppID <p>APPID corresponding to the policy.</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>APPID corresponding to the policy.</p>
     * @param AppID <p>APPID corresponding to the policy.</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Selected instance ID range</p> 
     * @return InstanceIDs <p>Selected instance ID range</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>Selected instance ID range</p>
     * @param InstanceIDs <p>Selected instance ID range</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>Excluded instance ID</p> 
     * @return ExcludeInstanceIDs <p>Excluded instance ID</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>Excluded instance ID</p>
     * @param ExcludeInstanceIDs <p>Excluded instance ID</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
    }

    /**
     * Get <p>Cluster ID list that takes effect (with a value when TCSSScope=0; empty returns [])</p> 
     * @return ClusterIDs <p>Cluster ID list that takes effect (with a value when TCSSScope=0; empty returns [])</p>
     */
    public String [] getClusterIDs() {
        return this.ClusterIDs;
    }

    /**
     * Set <p>Cluster ID list that takes effect (with a value when TCSSScope=0; empty returns [])</p>
     * @param ClusterIDs <p>Cluster ID list that takes effect (with a value when TCSSScope=0; empty returns [])</p>
     */
    public void setClusterIDs(String [] ClusterIDs) {
        this.ClusterIDs = ClusterIDs;
    }

    /**
     * Get <p>Cluster ID list for exclusion (empty returns [])</p> 
     * @return ExcludeClusterIDs <p>Cluster ID list for exclusion (empty returns [])</p>
     */
    public String [] getExcludeClusterIDs() {
        return this.ExcludeClusterIDs;
    }

    /**
     * Set <p>Cluster ID list for exclusion (empty returns [])</p>
     * @param ExcludeClusterIDs <p>Cluster ID list for exclusion (empty returns [])</p>
     */
    public void setExcludeClusterIDs(String [] ExcludeClusterIDs) {
        this.ExcludeClusterIDs = ExcludeClusterIDs;
    }

    /**
     * Get <p>Container condition matching.</p> 
     * @return ConditionMatches <p>Container condition matching.</p>
     */
    public ConditionMatch [] getConditionMatches() {
        return this.ConditionMatches;
    }

    /**
     * Set <p>Container condition matching.</p>
     * @param ConditionMatches <p>Container condition matching.</p>
     */
    public void setConditionMatches(ConditionMatch [] ConditionMatches) {
        this.ConditionMatches = ConditionMatches;
    }

    /**
     * Get <p>Security center tag</p> 
     * @return TagItems <p>Security center tag</p>
     */
    public EDRRuleTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>Security center tag</p>
     * @param TagItems <p>Security center tag</p>
     */
    public void setTagItems(EDRRuleTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    public EDRRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRRule(EDRRule source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new Long(source.DetectMode);
        }
        if (source.DetectType != null) {
            this.DetectType = new Long(source.DetectType);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.QUUIDS != null) {
            this.QUUIDS = new String[source.QUUIDS.length];
            for (int i = 0; i < source.QUUIDS.length; i++) {
                this.QUUIDS[i] = new String(source.QUUIDS[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.SupportBlock != null) {
            this.SupportBlock = new Long(source.SupportBlock);
        }
        if (source.Md5List != null) {
            this.Md5List = new String[source.Md5List.length];
            for (int i = 0; i < source.Md5List.length; i++) {
                this.Md5List[i] = new String(source.Md5List[i]);
            }
        }
        if (source.FileName != null) {
            this.FileName = new String[source.FileName.length];
            for (int i = 0; i < source.FileName.length; i++) {
                this.FileName[i] = new String(source.FileName[i]);
            }
        }
        if (source.FileDirectory != null) {
            this.FileDirectory = new String[source.FileDirectory.length];
            for (int i = 0; i < source.FileDirectory.length; i++) {
                this.FileDirectory[i] = new String(source.FileDirectory[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.OutboundIP != null) {
            this.OutboundIP = new String[source.OutboundIP.length];
            for (int i = 0; i < source.OutboundIP.length; i++) {
                this.OutboundIP[i] = new String(source.OutboundIP[i]);
            }
        }
        if (source.InboundIP != null) {
            this.InboundIP = new String[source.InboundIP.length];
            for (int i = 0; i < source.InboundIP.length; i++) {
                this.InboundIP[i] = new String(source.InboundIP[i]);
            }
        }
        if (source.CmdLineRules != null) {
            this.CmdLineRules = new RuleContentCmdLine(source.CmdLineRules);
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
        if (source.ImageNamesRegex != null) {
            this.ImageNamesRegex = new String(source.ImageNamesRegex);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.ExcludeQUUIDS != null) {
            this.ExcludeQUUIDS = new String[source.ExcludeQUUIDS.length];
            for (int i = 0; i < source.ExcludeQUUIDS.length; i++) {
                this.ExcludeQUUIDS[i] = new String(source.ExcludeQUUIDS[i]);
            }
        }
        if (source.ExcludeImageIDs != null) {
            this.ExcludeImageIDs = new String[source.ExcludeImageIDs.length];
            for (int i = 0; i < source.ExcludeImageIDs.length; i++) {
                this.ExcludeImageIDs[i] = new String(source.ExcludeImageIDs[i]);
            }
        }
        if (source.ProcessNetworkRules != null) {
            this.ProcessNetworkRules = new RuleContentProcessNetwork(source.ProcessNetworkRules);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
            }
        }
        if (source.ClusterIDs != null) {
            this.ClusterIDs = new String[source.ClusterIDs.length];
            for (int i = 0; i < source.ClusterIDs.length; i++) {
                this.ClusterIDs[i] = new String(source.ClusterIDs[i]);
            }
        }
        if (source.ExcludeClusterIDs != null) {
            this.ExcludeClusterIDs = new String[source.ExcludeClusterIDs.length];
            for (int i = 0; i < source.ExcludeClusterIDs.length; i++) {
                this.ExcludeClusterIDs[i] = new String(source.ExcludeClusterIDs[i]);
            }
        }
        if (source.ConditionMatches != null) {
            this.ConditionMatches = new ConditionMatch[source.ConditionMatches.length];
            for (int i = 0; i < source.ConditionMatches.length; i++) {
                this.ConditionMatches[i] = new ConditionMatch(source.ConditionMatches[i]);
            }
        }
        if (source.TagItems != null) {
            this.TagItems = new EDRRuleTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new EDRRuleTagItem(source.TagItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "DetectType", this.DetectType);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArraySimple(map, prefix + "QUUIDS.", this.QUUIDS);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SupportBlock", this.SupportBlock);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamArraySimple(map, prefix + "FileName.", this.FileName);
        this.setParamArraySimple(map, prefix + "FileDirectory.", this.FileDirectory);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "OutboundIP.", this.OutboundIP);
        this.setParamArraySimple(map, prefix + "InboundIP.", this.InboundIP);
        this.setParamObj(map, prefix + "CmdLineRules.", this.CmdLineRules);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);
        this.setParamSimple(map, prefix + "ImageNamesRegex", this.ImageNamesRegex);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "ExcludeQUUIDS.", this.ExcludeQUUIDS);
        this.setParamArraySimple(map, prefix + "ExcludeImageIDs.", this.ExcludeImageIDs);
        this.setParamObj(map, prefix + "ProcessNetworkRules.", this.ProcessNetworkRules);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);
        this.setParamArraySimple(map, prefix + "ExcludeClusterIDs.", this.ExcludeClusterIDs);
        this.setParamArrayObj(map, prefix + "ConditionMatches.", this.ConditionMatches);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);

    }
}

