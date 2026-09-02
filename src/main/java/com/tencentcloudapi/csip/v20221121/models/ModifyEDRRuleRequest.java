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

public class ModifyEDRRuleRequest extends AbstractModel {

    /**
    * <p>Policy type / Rule Type: 0-System policy/System Rule, 1-Custom policy/Custom Rule</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>Execution action / Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
    */
    @SerializedName("AlertAction")
    @Expose
    private Long AlertAction;

    /**
    * <p>Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // Host QUUIDS (when Scope=0)</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>Container Image Scope: 0-Specified Images, 1-All Images</p>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>Switch / Status: 0-Enabled, 1-Disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Content Type: md5-File MD5, cmdline-Command Line, dns-DNS, ip_inbound-Inbound IP, ip_outbound-Outbound IP, custom_file-Custom File, process_network-Process Network</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>Alarm Level: 1-High risk, 2-Medium risk, 3-Low risk, 4-Notification</p>
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
    * <p>Attack phase</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>Policy.</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>Policy description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Handle Old Events: 0-No, 1-Yes</p>
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * <p>List of MD5 values passed in when ContentType=md5</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>List of file names passed in when ContentType=custom_file (Base64 code)</p>
    */
    @SerializedName("FileName")
    @Expose
    private String [] FileName;

    /**
    * <p>Directory list of files passed in when ContentType=custom_file (Base64-encoded)</p>
    */
    @SerializedName("FileDirectory")
    @Expose
    private String [] FileDirectory;

    /**
    * <p>Command line rule passed in when ContentType=cmdline. The Exe/Cmdline fields of Process/PProcess/AProcess need to be Base64 encoded</p>
    */
    @SerializedName("CmdLineRules")
    @Expose
    private RuleContentCmdLine CmdLineRules;

    /**
    * <p>List of domain names passed in when ContentType=dns (Base64-encoded)</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>Outbound IP list passed in when ContentType=ip_outbound (Base64-encoded)</p>
    */
    @SerializedName("OutboundIP")
    @Expose
    private String [] OutboundIP;

    /**
    * <p>Inbound IP list passed in when ContentType=ip_inbound (Base64-encoded)</p>
    */
    @SerializedName("InboundIP")
    @Expose
    private String [] InboundIP;

    /**
    * <p>Image ID list / Image IDs (when TCSSScope=0)</p>
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

    /**
    * <p>Process network rule passed in when ContentType=process_network</p>
    */
    @SerializedName("ProcessNetworkRules")
    @Expose
    private RuleContentProcessNetwork ProcessNetworkRules;

    /**
    * <p>APPID of the selected accounts</p>
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>Allowlisted target machine information of the alarm</p>
    */
    @SerializedName("Target")
    @Expose
    private EdrAlertTarget Target;

    /**
    * <p>Instance ID and APPID corresponding to the custom asset</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>Select all instance IDs and APPIDs excluded from assets</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
    * <p>Security center tag ID list (host asset scope "Select by tag", only applicable to hosts); capacity limit 100 (truncate if exceeded). Tag source API: DescribeAssetTagTree</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * <p>Specify the cluster list to take effect (each item includes AppId + ClusterID, used when TCSSScope=0). The input parameter set has a capacity limit of 3000 (truncated to retain the first 3000 items if exceeded)</p>
    */
    @SerializedName("ClusterIDsWithAppId")
    @Expose
    private ClusterIDWithAppIdItem [] ClusterIDsWithAppId;

    /**
    * <p>Cluster exclusion list (each item contains AppId + ClusterID); input parameter set capacity limit: 3000 (truncate and retain the first 3000 items if exceeded)</p>
    */
    @SerializedName("ExcludeClusterIDsWithAppId")
    @Expose
    private ClusterIDWithAppIdItem [] ExcludeClusterIDsWithAppId;

    /**
    * <p>Directly select images (each item contains AppId + ImageID, and filter further on the basis of the cluster). In multi-account scenarios, each account only stores its own images. The input parameter set capacity limit is 3000 (truncate and retain the first 3000 items if exceeded)</p>
    */
    @SerializedName("ImageIDsWithAppId")
    @Expose
    private ImageIDWithAppIdItem [] ImageIDsWithAppId;

    /**
    * <p>Container condition matching</p>
    */
    @SerializedName("ConditionMatches")
    @Expose
    private ConditionMatch [] ConditionMatches;

    /**
     * Get <p>Policy type / Rule Type: 0-System policy/System Rule, 1-Custom policy/Custom Rule</p> 
     * @return RuleType <p>Policy type / Rule Type: 0-System policy/System Rule, 1-Custom policy/Custom Rule</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>Policy type / Rule Type: 0-System policy/System Rule, 1-Custom policy/Custom Rule</p>
     * @param RuleType <p>Policy type / Rule Type: 0-System policy/System Rule, 1-Custom policy/Custom Rule</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>Execution action / Action: 0-Alert, 1-Allow, 2-Alert and Block</p> 
     * @return AlertAction <p>Execution action / Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
     */
    public Long getAlertAction() {
        return this.AlertAction;
    }

    /**
     * Set <p>Execution action / Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
     * @param AlertAction <p>Execution action / Action: 0-Alert, 1-Allow, 2-Alert and Block</p>
     */
    public void setAlertAction(Long AlertAction) {
        this.AlertAction = AlertAction;
    }

    /**
     * Get <p>Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // Host QUUIDS (when Scope=0)</p> 
     * @return CWPScope <p>Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // Host QUUIDS (when Scope=0)</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // Host QUUIDS (when Scope=0)</p>
     * @param CWPScope <p>Effective Scope: 0-Specified Hosts, 1-All Hosts, 2-Professional, 3-Flagship, 4-Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // Host QUUIDS (when Scope=0)</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
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
     * Get <p>Switch / Status: 0-Enabled, 1-Disabled</p> 
     * @return Status <p>Switch / Status: 0-Enabled, 1-Disabled</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Switch / Status: 0-Enabled, 1-Disabled</p>
     * @param Status <p>Switch / Status: 0-Enabled, 1-Disabled</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
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
     * Get <p>Alarm Level: 1-High risk, 2-Medium risk, 3-Low risk, 4-Notification</p> 
     * @return Level <p>Alarm Level: 1-High risk, 2-Medium risk, 3-Low risk, 4-Notification</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Alarm Level: 1-High risk, 2-Medium risk, 3-Low risk, 4-Notification</p>
     * @param Level <p>Alarm Level: 1-High risk, 2-Medium risk, 3-Low risk, 4-Notification</p>
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
     * Get <p>Policy.</p> 
     * @return RuleID <p>Policy.</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>Policy.</p>
     * @param RuleID <p>Policy.</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
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
     * Get <p>Handle Old Events: 0-No, 1-Yes</p> 
     * @return DealOldEvents <p>Handle Old Events: 0-No, 1-Yes</p>
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set <p>Handle Old Events: 0-No, 1-Yes</p>
     * @param DealOldEvents <p>Handle Old Events: 0-No, 1-Yes</p>
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get <p>List of MD5 values passed in when ContentType=md5</p> 
     * @return Md5List <p>List of MD5 values passed in when ContentType=md5</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>List of MD5 values passed in when ContentType=md5</p>
     * @param Md5List <p>List of MD5 values passed in when ContentType=md5</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>List of file names passed in when ContentType=custom_file (Base64 code)</p> 
     * @return FileName <p>List of file names passed in when ContentType=custom_file (Base64 code)</p>
     */
    public String [] getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>List of file names passed in when ContentType=custom_file (Base64 code)</p>
     * @param FileName <p>List of file names passed in when ContentType=custom_file (Base64 code)</p>
     */
    public void setFileName(String [] FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Directory list of files passed in when ContentType=custom_file (Base64-encoded)</p> 
     * @return FileDirectory <p>Directory list of files passed in when ContentType=custom_file (Base64-encoded)</p>
     */
    public String [] getFileDirectory() {
        return this.FileDirectory;
    }

    /**
     * Set <p>Directory list of files passed in when ContentType=custom_file (Base64-encoded)</p>
     * @param FileDirectory <p>Directory list of files passed in when ContentType=custom_file (Base64-encoded)</p>
     */
    public void setFileDirectory(String [] FileDirectory) {
        this.FileDirectory = FileDirectory;
    }

    /**
     * Get <p>Command line rule passed in when ContentType=cmdline. The Exe/Cmdline fields of Process/PProcess/AProcess need to be Base64 encoded</p> 
     * @return CmdLineRules <p>Command line rule passed in when ContentType=cmdline. The Exe/Cmdline fields of Process/PProcess/AProcess need to be Base64 encoded</p>
     */
    public RuleContentCmdLine getCmdLineRules() {
        return this.CmdLineRules;
    }

    /**
     * Set <p>Command line rule passed in when ContentType=cmdline. The Exe/Cmdline fields of Process/PProcess/AProcess need to be Base64 encoded</p>
     * @param CmdLineRules <p>Command line rule passed in when ContentType=cmdline. The Exe/Cmdline fields of Process/PProcess/AProcess need to be Base64 encoded</p>
     */
    public void setCmdLineRules(RuleContentCmdLine CmdLineRules) {
        this.CmdLineRules = CmdLineRules;
    }

    /**
     * Get <p>List of domain names passed in when ContentType=dns (Base64-encoded)</p> 
     * @return Domains <p>List of domain names passed in when ContentType=dns (Base64-encoded)</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>List of domain names passed in when ContentType=dns (Base64-encoded)</p>
     * @param Domains <p>List of domain names passed in when ContentType=dns (Base64-encoded)</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>Outbound IP list passed in when ContentType=ip_outbound (Base64-encoded)</p> 
     * @return OutboundIP <p>Outbound IP list passed in when ContentType=ip_outbound (Base64-encoded)</p>
     */
    public String [] getOutboundIP() {
        return this.OutboundIP;
    }

    /**
     * Set <p>Outbound IP list passed in when ContentType=ip_outbound (Base64-encoded)</p>
     * @param OutboundIP <p>Outbound IP list passed in when ContentType=ip_outbound (Base64-encoded)</p>
     */
    public void setOutboundIP(String [] OutboundIP) {
        this.OutboundIP = OutboundIP;
    }

    /**
     * Get <p>Inbound IP list passed in when ContentType=ip_inbound (Base64-encoded)</p> 
     * @return InboundIP <p>Inbound IP list passed in when ContentType=ip_inbound (Base64-encoded)</p>
     */
    public String [] getInboundIP() {
        return this.InboundIP;
    }

    /**
     * Set <p>Inbound IP list passed in when ContentType=ip_inbound (Base64-encoded)</p>
     * @param InboundIP <p>Inbound IP list passed in when ContentType=ip_inbound (Base64-encoded)</p>
     */
    public void setInboundIP(String [] InboundIP) {
        this.InboundIP = InboundIP;
    }

    /**
     * Get <p>Image ID list / Image IDs (when TCSSScope=0)</p> 
     * @return ImageIDs <p>Image ID list / Image IDs (when TCSSScope=0)</p>
     */
    public String [] getImageIDs() {
        return this.ImageIDs;
    }

    /**
     * Set <p>Image ID list / Image IDs (when TCSSScope=0)</p>
     * @param ImageIDs <p>Image ID list / Image IDs (when TCSSScope=0)</p>
     */
    public void setImageIDs(String [] ImageIDs) {
        this.ImageIDs = ImageIDs;
    }

    /**
     * Get <p>Process network rule passed in when ContentType=process_network</p> 
     * @return ProcessNetworkRules <p>Process network rule passed in when ContentType=process_network</p>
     */
    public RuleContentProcessNetwork getProcessNetworkRules() {
        return this.ProcessNetworkRules;
    }

    /**
     * Set <p>Process network rule passed in when ContentType=process_network</p>
     * @param ProcessNetworkRules <p>Process network rule passed in when ContentType=process_network</p>
     */
    public void setProcessNetworkRules(RuleContentProcessNetwork ProcessNetworkRules) {
        this.ProcessNetworkRules = ProcessNetworkRules;
    }

    /**
     * Get <p>APPID of the selected accounts</p> 
     * @return TargetAppIDs <p>APPID of the selected accounts</p>
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>APPID of the selected accounts</p>
     * @param TargetAppIDs <p>APPID of the selected accounts</p>
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>Allowlisted target machine information of the alarm</p> 
     * @return Target <p>Allowlisted target machine information of the alarm</p>
     */
    public EdrAlertTarget getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Allowlisted target machine information of the alarm</p>
     * @param Target <p>Allowlisted target machine information of the alarm</p>
     */
    public void setTarget(EdrAlertTarget Target) {
        this.Target = Target;
    }

    /**
     * Get <p>Instance ID and APPID corresponding to the custom asset</p> 
     * @return InstanceIDsWithAppId <p>Instance ID and APPID corresponding to the custom asset</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>Instance ID and APPID corresponding to the custom asset</p>
     * @param InstanceIDsWithAppId <p>Instance ID and APPID corresponding to the custom asset</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>Select all instance IDs and APPIDs excluded from assets</p> 
     * @return ExcludeInstanceIDsWithAppId <p>Select all instance IDs and APPIDs excluded from assets</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>Select all instance IDs and APPIDs excluded from assets</p>
     * @param ExcludeInstanceIDsWithAppId <p>Select all instance IDs and APPIDs excluded from assets</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    /**
     * Get <p>Security center tag ID list (host asset scope "Select by tag", only applicable to hosts); capacity limit 100 (truncate if exceeded). Tag source API: DescribeAssetTagTree</p> 
     * @return TagIDs <p>Security center tag ID list (host asset scope "Select by tag", only applicable to hosts); capacity limit 100 (truncate if exceeded). Tag source API: DescribeAssetTagTree</p>
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set <p>Security center tag ID list (host asset scope "Select by tag", only applicable to hosts); capacity limit 100 (truncate if exceeded). Tag source API: DescribeAssetTagTree</p>
     * @param TagIDs <p>Security center tag ID list (host asset scope "Select by tag", only applicable to hosts); capacity limit 100 (truncate if exceeded). Tag source API: DescribeAssetTagTree</p>
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get <p>Specify the cluster list to take effect (each item includes AppId + ClusterID, used when TCSSScope=0). The input parameter set has a capacity limit of 3000 (truncated to retain the first 3000 items if exceeded)</p> 
     * @return ClusterIDsWithAppId <p>Specify the cluster list to take effect (each item includes AppId + ClusterID, used when TCSSScope=0). The input parameter set has a capacity limit of 3000 (truncated to retain the first 3000 items if exceeded)</p>
     */
    public ClusterIDWithAppIdItem [] getClusterIDsWithAppId() {
        return this.ClusterIDsWithAppId;
    }

    /**
     * Set <p>Specify the cluster list to take effect (each item includes AppId + ClusterID, used when TCSSScope=0). The input parameter set has a capacity limit of 3000 (truncated to retain the first 3000 items if exceeded)</p>
     * @param ClusterIDsWithAppId <p>Specify the cluster list to take effect (each item includes AppId + ClusterID, used when TCSSScope=0). The input parameter set has a capacity limit of 3000 (truncated to retain the first 3000 items if exceeded)</p>
     */
    public void setClusterIDsWithAppId(ClusterIDWithAppIdItem [] ClusterIDsWithAppId) {
        this.ClusterIDsWithAppId = ClusterIDsWithAppId;
    }

    /**
     * Get <p>Cluster exclusion list (each item contains AppId + ClusterID); input parameter set capacity limit: 3000 (truncate and retain the first 3000 items if exceeded)</p> 
     * @return ExcludeClusterIDsWithAppId <p>Cluster exclusion list (each item contains AppId + ClusterID); input parameter set capacity limit: 3000 (truncate and retain the first 3000 items if exceeded)</p>
     */
    public ClusterIDWithAppIdItem [] getExcludeClusterIDsWithAppId() {
        return this.ExcludeClusterIDsWithAppId;
    }

    /**
     * Set <p>Cluster exclusion list (each item contains AppId + ClusterID); input parameter set capacity limit: 3000 (truncate and retain the first 3000 items if exceeded)</p>
     * @param ExcludeClusterIDsWithAppId <p>Cluster exclusion list (each item contains AppId + ClusterID); input parameter set capacity limit: 3000 (truncate and retain the first 3000 items if exceeded)</p>
     */
    public void setExcludeClusterIDsWithAppId(ClusterIDWithAppIdItem [] ExcludeClusterIDsWithAppId) {
        this.ExcludeClusterIDsWithAppId = ExcludeClusterIDsWithAppId;
    }

    /**
     * Get <p>Directly select images (each item contains AppId + ImageID, and filter further on the basis of the cluster). In multi-account scenarios, each account only stores its own images. The input parameter set capacity limit is 3000 (truncate and retain the first 3000 items if exceeded)</p> 
     * @return ImageIDsWithAppId <p>Directly select images (each item contains AppId + ImageID, and filter further on the basis of the cluster). In multi-account scenarios, each account only stores its own images. The input parameter set capacity limit is 3000 (truncate and retain the first 3000 items if exceeded)</p>
     */
    public ImageIDWithAppIdItem [] getImageIDsWithAppId() {
        return this.ImageIDsWithAppId;
    }

    /**
     * Set <p>Directly select images (each item contains AppId + ImageID, and filter further on the basis of the cluster). In multi-account scenarios, each account only stores its own images. The input parameter set capacity limit is 3000 (truncate and retain the first 3000 items if exceeded)</p>
     * @param ImageIDsWithAppId <p>Directly select images (each item contains AppId + ImageID, and filter further on the basis of the cluster). In multi-account scenarios, each account only stores its own images. The input parameter set capacity limit is 3000 (truncate and retain the first 3000 items if exceeded)</p>
     */
    public void setImageIDsWithAppId(ImageIDWithAppIdItem [] ImageIDsWithAppId) {
        this.ImageIDsWithAppId = ImageIDsWithAppId;
    }

    /**
     * Get <p>Container condition matching</p> 
     * @return ConditionMatches <p>Container condition matching</p>
     */
    public ConditionMatch [] getConditionMatches() {
        return this.ConditionMatches;
    }

    /**
     * Set <p>Container condition matching</p>
     * @param ConditionMatches <p>Container condition matching</p>
     */
    public void setConditionMatches(ConditionMatch [] ConditionMatches) {
        this.ConditionMatches = ConditionMatches;
    }

    public ModifyEDRRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEDRRuleRequest(ModifyEDRRuleRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.AlertAction != null) {
            this.AlertAction = new Long(source.AlertAction);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new Long(source.DetectMode);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
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
        if (source.CmdLineRules != null) {
            this.CmdLineRules = new RuleContentCmdLine(source.CmdLineRules);
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
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
        if (source.ProcessNetworkRules != null) {
            this.ProcessNetworkRules = new RuleContentProcessNetwork(source.ProcessNetworkRules);
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.Target != null) {
            this.Target = new EdrAlertTarget(source.Target);
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
        if (source.TagIDs != null) {
            this.TagIDs = new String[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new String(source.TagIDs[i]);
            }
        }
        if (source.ClusterIDsWithAppId != null) {
            this.ClusterIDsWithAppId = new ClusterIDWithAppIdItem[source.ClusterIDsWithAppId.length];
            for (int i = 0; i < source.ClusterIDsWithAppId.length; i++) {
                this.ClusterIDsWithAppId[i] = new ClusterIDWithAppIdItem(source.ClusterIDsWithAppId[i]);
            }
        }
        if (source.ExcludeClusterIDsWithAppId != null) {
            this.ExcludeClusterIDsWithAppId = new ClusterIDWithAppIdItem[source.ExcludeClusterIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeClusterIDsWithAppId.length; i++) {
                this.ExcludeClusterIDsWithAppId[i] = new ClusterIDWithAppIdItem(source.ExcludeClusterIDsWithAppId[i]);
            }
        }
        if (source.ImageIDsWithAppId != null) {
            this.ImageIDsWithAppId = new ImageIDWithAppIdItem[source.ImageIDsWithAppId.length];
            for (int i = 0; i < source.ImageIDsWithAppId.length; i++) {
                this.ImageIDsWithAppId[i] = new ImageIDWithAppIdItem(source.ImageIDsWithAppId[i]);
            }
        }
        if (source.ConditionMatches != null) {
            this.ConditionMatches = new ConditionMatch[source.ConditionMatches.length];
            for (int i = 0; i < source.ConditionMatches.length; i++) {
                this.ConditionMatches[i] = new ConditionMatch(source.ConditionMatches[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "AlertAction", this.AlertAction);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamArraySimple(map, prefix + "FileName.", this.FileName);
        this.setParamArraySimple(map, prefix + "FileDirectory.", this.FileDirectory);
        this.setParamObj(map, prefix + "CmdLineRules.", this.CmdLineRules);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "OutboundIP.", this.OutboundIP);
        this.setParamArraySimple(map, prefix + "InboundIP.", this.InboundIP);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);
        this.setParamObj(map, prefix + "ProcessNetworkRules.", this.ProcessNetworkRules);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamArrayObj(map, prefix + "ClusterIDsWithAppId.", this.ClusterIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeClusterIDsWithAppId.", this.ExcludeClusterIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ImageIDsWithAppId.", this.ImageIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ConditionMatches.", this.ConditionMatches);

    }
}

