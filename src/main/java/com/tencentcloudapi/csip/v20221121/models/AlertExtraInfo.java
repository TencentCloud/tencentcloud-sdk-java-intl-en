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

public class AlertExtraInfo extends AbstractModel {

    /**
    * Related attack events
    */
    @SerializedName("RelateEvent")
    @Expose
    private RelatedEvent RelateEvent;

    /**
    * Leaked content
    */
    @SerializedName("LeakContent")
    @Expose
    private String LeakContent;

    /**
    * Leak API
    */
    @SerializedName("LeakAPI")
    @Expose
    private String LeakAPI;

    /**
    * secretID
    */
    @SerializedName("SecretID")
    @Expose
    private String SecretID;

    /**
    * hit rule
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Rule description
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * Protocol port
    */
    @SerializedName("ProtocolPort")
    @Expose
    private String ProtocolPort;

    /**
    * Attack content
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * Attack IP profiling
    */
    @SerializedName("AttackIPProfile")
    @Expose
    private String AttackIPProfile;

    /**
    * Attack IP tag
    */
    @SerializedName("AttackIPTags")
    @Expose
    private String AttackIPTags;

    /**
    * Request method
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * HTTP log
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * Attacked domain name
    */
    @SerializedName("AttackDomain")
    @Expose
    private String AttackDomain;

    /**
    * File path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * user_agent
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * Request headers
    */
    @SerializedName("RequestHeaders")
    @Expose
    private String RequestHeaders;

    /**
    * Login username
    */
    @SerializedName("LoginUserName")
    @Expose
    private String LoginUserName;

    /**
    * Vulnerability name
    */
    @SerializedName("VulnerabilityName")
    @Expose
    private String VulnerabilityName;

    /**
    * Public vulnerability and exposure
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * Service process
    */
    @SerializedName("ServiceProcess")
    @Expose
    private String ServiceProcess;

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * File MD5
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * Last access time of the file
    */
    @SerializedName("FileLastAccessTime")
    @Expose
    private String FileLastAccessTime;

    /**
    * file modification time
    */
    @SerializedName("FileModifyTime")
    @Expose
    private String FileModifyTime;

    /**
    * Last access Time
    */
    @SerializedName("RecentAccessTime")
    @Expose
    private String RecentAccessTime;

    /**
    * Last modification time
    */
    @SerializedName("RecentModifyTime")
    @Expose
    private String RecentModifyTime;

    /**
    * Virus name
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Virus file tag
    */
    @SerializedName("VirusFileTags")
    @Expose
    private String VirusFileTags;

    /**
    * behavioral characteristics
    */
    @SerializedName("BehavioralCharacteristics")
    @Expose
    private String BehavioralCharacteristics;

    /**
    * process name (PID)
    */
    @SerializedName("ProcessNamePID")
    @Expose
    private String ProcessNamePID;

    /**
    * Process path
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * Command line of the process
    */
    @SerializedName("ProcessCommandLine")
    @Expose
    private String ProcessCommandLine;

    /**
    * Process permission
    */
    @SerializedName("ProcessPermissions")
    @Expose
    private String ProcessPermissions;

    /**
    * Execute commands
    */
    @SerializedName("ExecutedCommand")
    @Expose
    private String ExecutedCommand;

    /**
    * Affected Filename
    */
    @SerializedName("AffectedFileName")
    @Expose
    private String AffectedFileName;

    /**
    * bait path
    */
    @SerializedName("DecoyPath")
    @Expose
    private String DecoyPath;

    /**
    * Malicious process file size
    */
    @SerializedName("MaliciousProcessFileSize")
    @Expose
    private String MaliciousProcessFileSize;

    /**
    * Malicious process file MD5
    */
    @SerializedName("MaliciousProcessFileMD5")
    @Expose
    private String MaliciousProcessFileMD5;

    /**
    * Malicious process name (PID)
    */
    @SerializedName("MaliciousProcessNamePID")
    @Expose
    private String MaliciousProcessNamePID;

    /**
    * Malicious process path
    */
    @SerializedName("MaliciousProcessPath")
    @Expose
    private String MaliciousProcessPath;

    /**
    * malicious process start time
    */
    @SerializedName("MaliciousProcessStartTime")
    @Expose
    private String MaliciousProcessStartTime;

    /**
    * command content
    */
    @SerializedName("CommandContent")
    @Expose
    private String CommandContent;

    /**
    * Startup user
    */
    @SerializedName("StartupUser")
    @Expose
    private String StartupUser;

    /**
    * User group
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * Add new permission
    */
    @SerializedName("NewPermissions")
    @Expose
    private String NewPermissions;

    /**
    * Parent process
    */
    @SerializedName("ParentProcess")
    @Expose
    private String ParentProcess;

    /**
    * Class name
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * class loader
    */
    @SerializedName("ClassLoader")
    @Expose
    private String ClassLoader;

    /**
    * File size
    */
    @SerializedName("ClassFileSize")
    @Expose
    private String ClassFileSize;

    /**
    * Class file MD5
    */
    @SerializedName("ClassFileMD5")
    @Expose
    private String ClassFileMD5;

    /**
    * Parent class name
    */
    @SerializedName("ParentClassName")
    @Expose
    private String ParentClassName;

    /**
    * inherit an API
    */
    @SerializedName("InheritedInterface")
    @Expose
    private String InheritedInterface;

    /**
    * Annotation
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * payload content
    */
    @SerializedName("PayloadContent")
    @Expose
    private String PayloadContent;

    /**
    * Callback address profile
    */
    @SerializedName("CallbackAddressPortrait")
    @Expose
    private String CallbackAddressPortrait;

    /**
    * Callback address tag
    */
    @SerializedName("CallbackAddressTag")
    @Expose
    private String CallbackAddressTag;

    /**
    * Process MD5
    */
    @SerializedName("ProcessMD5")
    @Expose
    private String ProcessMD5;

    /**
    * File permission
    */
    @SerializedName("FilePermission")
    @Expose
    private String FilePermission;

    /**
    * Information field from log analysis
    */
    @SerializedName("FromLogAnalysisData")
    @Expose
    private KeyValue [] FromLogAnalysisData;

    /**
    * probe hit
    */
    @SerializedName("HitProbe")
    @Expose
    private String HitProbe;

    /**
    * hit honeypot

    */
    @SerializedName("HitHoneyPot")
    @Expose
    private String HitHoneyPot;

    /**
    * command list
    */
    @SerializedName("CommandList")
    @Expose
    private String CommandList;

    /**
    * Attack event description

    */
    @SerializedName("AttackEventDesc")
    @Expose
    private String AttackEventDesc;

    /**
    * Process information
    */
    @SerializedName("ProcessInfo")
    @Expose
    private String ProcessInfo;

    /**
    * Login username & password
    */
    @SerializedName("UserNameAndPwd")
    @Expose
    private String UserNameAndPwd;

    /**
    * Host protection policy ID
    */
    @SerializedName("StrategyID")
    @Expose
    private String StrategyID;

    /**
    * Host protection policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Host protection hit policy is a combination of policy ID and Policy Name
    */
    @SerializedName("HitStrategy")
    @Expose
    private String HitStrategy;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * PID
    */
    @SerializedName("PID")
    @Expose
    private String PID;

    /**
    * Container Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Container Pod ID
    */
    @SerializedName("PodID")
    @Expose
    private String PodID;

    /**
    * Http response
    */
    @SerializedName("Response")
    @Expose
    private String Response;

    /**
    * system call
    */
    @SerializedName("SystemCall")
    @Expose
    private String SystemCall;

    /**
    * Operation type
    */
    @SerializedName("Verb")
    @Expose
    private String Verb;

    /**
    * Log ID.
    */
    @SerializedName("LogID")
    @Expose
    private String LogID;

    /**
    * Change content
    */
    @SerializedName("Different")
    @Expose
    private String Different;

    /**
    * Event type
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Event description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Destination address (container reverse shell)
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * Malicious request domain name (container malicious outbound connection)
    */
    @SerializedName("MaliciousRequestDomain")
    @Expose
    private String MaliciousRequestDomain;

    /**
    * Rule Type (Container K8sAPI Exception Request)
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Requested Resource (Container K8sAPI Exception Request)
    */
    @SerializedName("RequestURI")
    @Expose
    private String RequestURI;

    /**
    * Request Initiating User (Container K8sAPI Exception Request)
    */
    @SerializedName("RequestUser")
    @Expose
    private String RequestUser;

    /**
    * Request Object (Container K8sAPI Exception Request)
    */
    @SerializedName("RequestObject")
    @Expose
    private String RequestObject;

    /**
    * Response object (container K8sAPI exception request)
    */
    @SerializedName("ResponseObject")
    @Expose
    private String ResponseObject;

    /**
    * File type (Container file tamper)
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Tag feature (malicious outbound connection of container)
    */
    @SerializedName("TIType")
    @Expose
    private String TIType;

    /**
    * Source IP Address (Container K8sAPI Exception Request)
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
     * Get Related attack events 
     * @return RelateEvent Related attack events
     */
    public RelatedEvent getRelateEvent() {
        return this.RelateEvent;
    }

    /**
     * Set Related attack events
     * @param RelateEvent Related attack events
     */
    public void setRelateEvent(RelatedEvent RelateEvent) {
        this.RelateEvent = RelateEvent;
    }

    /**
     * Get Leaked content 
     * @return LeakContent Leaked content
     */
    public String getLeakContent() {
        return this.LeakContent;
    }

    /**
     * Set Leaked content
     * @param LeakContent Leaked content
     */
    public void setLeakContent(String LeakContent) {
        this.LeakContent = LeakContent;
    }

    /**
     * Get Leak API 
     * @return LeakAPI Leak API
     */
    public String getLeakAPI() {
        return this.LeakAPI;
    }

    /**
     * Set Leak API
     * @param LeakAPI Leak API
     */
    public void setLeakAPI(String LeakAPI) {
        this.LeakAPI = LeakAPI;
    }

    /**
     * Get secretID 
     * @return SecretID secretID
     */
    public String getSecretID() {
        return this.SecretID;
    }

    /**
     * Set secretID
     * @param SecretID secretID
     */
    public void setSecretID(String SecretID) {
        this.SecretID = SecretID;
    }

    /**
     * Get hit rule 
     * @return Rule hit rule
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set hit rule
     * @param Rule hit rule
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Rule description 
     * @return RuleDesc Rule description
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set Rule description
     * @param RuleDesc Rule description
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get Protocol port 
     * @return ProtocolPort Protocol port
     */
    public String getProtocolPort() {
        return this.ProtocolPort;
    }

    /**
     * Set Protocol port
     * @param ProtocolPort Protocol port
     */
    public void setProtocolPort(String ProtocolPort) {
        this.ProtocolPort = ProtocolPort;
    }

    /**
     * Get Attack content 
     * @return AttackContent Attack content
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set Attack content
     * @param AttackContent Attack content
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
    }

    /**
     * Get Attack IP profiling 
     * @return AttackIPProfile Attack IP profiling
     */
    public String getAttackIPProfile() {
        return this.AttackIPProfile;
    }

    /**
     * Set Attack IP profiling
     * @param AttackIPProfile Attack IP profiling
     */
    public void setAttackIPProfile(String AttackIPProfile) {
        this.AttackIPProfile = AttackIPProfile;
    }

    /**
     * Get Attack IP tag 
     * @return AttackIPTags Attack IP tag
     */
    public String getAttackIPTags() {
        return this.AttackIPTags;
    }

    /**
     * Set Attack IP tag
     * @param AttackIPTags Attack IP tag
     */
    public void setAttackIPTags(String AttackIPTags) {
        this.AttackIPTags = AttackIPTags;
    }

    /**
     * Get Request method 
     * @return RequestMethod Request method
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set Request method
     * @param RequestMethod Request method
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get HTTP log 
     * @return HttpLog HTTP log
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set HTTP log
     * @param HttpLog HTTP log
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
    }

    /**
     * Get Attacked domain name 
     * @return AttackDomain Attacked domain name
     */
    public String getAttackDomain() {
        return this.AttackDomain;
    }

    /**
     * Set Attacked domain name
     * @param AttackDomain Attacked domain name
     */
    public void setAttackDomain(String AttackDomain) {
        this.AttackDomain = AttackDomain;
    }

    /**
     * Get File path 
     * @return FilePath File path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path
     * @param FilePath File path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get user_agent 
     * @return UserAgent user_agent
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set user_agent
     * @param UserAgent user_agent
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get Request headers 
     * @return RequestHeaders Request headers
     */
    public String getRequestHeaders() {
        return this.RequestHeaders;
    }

    /**
     * Set Request headers
     * @param RequestHeaders Request headers
     */
    public void setRequestHeaders(String RequestHeaders) {
        this.RequestHeaders = RequestHeaders;
    }

    /**
     * Get Login username 
     * @return LoginUserName Login username
     */
    public String getLoginUserName() {
        return this.LoginUserName;
    }

    /**
     * Set Login username
     * @param LoginUserName Login username
     */
    public void setLoginUserName(String LoginUserName) {
        this.LoginUserName = LoginUserName;
    }

    /**
     * Get Vulnerability name 
     * @return VulnerabilityName Vulnerability name
     */
    public String getVulnerabilityName() {
        return this.VulnerabilityName;
    }

    /**
     * Set Vulnerability name
     * @param VulnerabilityName Vulnerability name
     */
    public void setVulnerabilityName(String VulnerabilityName) {
        this.VulnerabilityName = VulnerabilityName;
    }

    /**
     * Get Public vulnerability and exposure 
     * @return CVE Public vulnerability and exposure
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set Public vulnerability and exposure
     * @param CVE Public vulnerability and exposure
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get Service process 
     * @return ServiceProcess Service process
     */
    public String getServiceProcess() {
        return this.ServiceProcess;
    }

    /**
     * Set Service process
     * @param ServiceProcess Service process
     */
    public void setServiceProcess(String ServiceProcess) {
        this.ServiceProcess = ServiceProcess;
    }

    /**
     * Get Filename 
     * @return FileName Filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename
     * @param FileName Filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size 
     * @return FileSize File size
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size
     * @param FileSize File size
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get File MD5 
     * @return FileMD5 File MD5
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set File MD5
     * @param FileMD5 File MD5
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * Get Last access time of the file 
     * @return FileLastAccessTime Last access time of the file
     */
    public String getFileLastAccessTime() {
        return this.FileLastAccessTime;
    }

    /**
     * Set Last access time of the file
     * @param FileLastAccessTime Last access time of the file
     */
    public void setFileLastAccessTime(String FileLastAccessTime) {
        this.FileLastAccessTime = FileLastAccessTime;
    }

    /**
     * Get file modification time 
     * @return FileModifyTime file modification time
     */
    public String getFileModifyTime() {
        return this.FileModifyTime;
    }

    /**
     * Set file modification time
     * @param FileModifyTime file modification time
     */
    public void setFileModifyTime(String FileModifyTime) {
        this.FileModifyTime = FileModifyTime;
    }

    /**
     * Get Last access Time 
     * @return RecentAccessTime Last access Time
     */
    public String getRecentAccessTime() {
        return this.RecentAccessTime;
    }

    /**
     * Set Last access Time
     * @param RecentAccessTime Last access Time
     */
    public void setRecentAccessTime(String RecentAccessTime) {
        this.RecentAccessTime = RecentAccessTime;
    }

    /**
     * Get Last modification time 
     * @return RecentModifyTime Last modification time
     */
    public String getRecentModifyTime() {
        return this.RecentModifyTime;
    }

    /**
     * Set Last modification time
     * @param RecentModifyTime Last modification time
     */
    public void setRecentModifyTime(String RecentModifyTime) {
        this.RecentModifyTime = RecentModifyTime;
    }

    /**
     * Get Virus name 
     * @return VirusName Virus name
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
     * @param VirusName Virus name
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get Virus file tag 
     * @return VirusFileTags Virus file tag
     */
    public String getVirusFileTags() {
        return this.VirusFileTags;
    }

    /**
     * Set Virus file tag
     * @param VirusFileTags Virus file tag
     */
    public void setVirusFileTags(String VirusFileTags) {
        this.VirusFileTags = VirusFileTags;
    }

    /**
     * Get behavioral characteristics 
     * @return BehavioralCharacteristics behavioral characteristics
     */
    public String getBehavioralCharacteristics() {
        return this.BehavioralCharacteristics;
    }

    /**
     * Set behavioral characteristics
     * @param BehavioralCharacteristics behavioral characteristics
     */
    public void setBehavioralCharacteristics(String BehavioralCharacteristics) {
        this.BehavioralCharacteristics = BehavioralCharacteristics;
    }

    /**
     * Get process name (PID) 
     * @return ProcessNamePID process name (PID)
     */
    public String getProcessNamePID() {
        return this.ProcessNamePID;
    }

    /**
     * Set process name (PID)
     * @param ProcessNamePID process name (PID)
     */
    public void setProcessNamePID(String ProcessNamePID) {
        this.ProcessNamePID = ProcessNamePID;
    }

    /**
     * Get Process path 
     * @return ProcessPath Process path
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set Process path
     * @param ProcessPath Process path
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get Command line of the process 
     * @return ProcessCommandLine Command line of the process
     */
    public String getProcessCommandLine() {
        return this.ProcessCommandLine;
    }

    /**
     * Set Command line of the process
     * @param ProcessCommandLine Command line of the process
     */
    public void setProcessCommandLine(String ProcessCommandLine) {
        this.ProcessCommandLine = ProcessCommandLine;
    }

    /**
     * Get Process permission 
     * @return ProcessPermissions Process permission
     */
    public String getProcessPermissions() {
        return this.ProcessPermissions;
    }

    /**
     * Set Process permission
     * @param ProcessPermissions Process permission
     */
    public void setProcessPermissions(String ProcessPermissions) {
        this.ProcessPermissions = ProcessPermissions;
    }

    /**
     * Get Execute commands 
     * @return ExecutedCommand Execute commands
     */
    public String getExecutedCommand() {
        return this.ExecutedCommand;
    }

    /**
     * Set Execute commands
     * @param ExecutedCommand Execute commands
     */
    public void setExecutedCommand(String ExecutedCommand) {
        this.ExecutedCommand = ExecutedCommand;
    }

    /**
     * Get Affected Filename 
     * @return AffectedFileName Affected Filename
     */
    public String getAffectedFileName() {
        return this.AffectedFileName;
    }

    /**
     * Set Affected Filename
     * @param AffectedFileName Affected Filename
     */
    public void setAffectedFileName(String AffectedFileName) {
        this.AffectedFileName = AffectedFileName;
    }

    /**
     * Get bait path 
     * @return DecoyPath bait path
     */
    public String getDecoyPath() {
        return this.DecoyPath;
    }

    /**
     * Set bait path
     * @param DecoyPath bait path
     */
    public void setDecoyPath(String DecoyPath) {
        this.DecoyPath = DecoyPath;
    }

    /**
     * Get Malicious process file size 
     * @return MaliciousProcessFileSize Malicious process file size
     */
    public String getMaliciousProcessFileSize() {
        return this.MaliciousProcessFileSize;
    }

    /**
     * Set Malicious process file size
     * @param MaliciousProcessFileSize Malicious process file size
     */
    public void setMaliciousProcessFileSize(String MaliciousProcessFileSize) {
        this.MaliciousProcessFileSize = MaliciousProcessFileSize;
    }

    /**
     * Get Malicious process file MD5 
     * @return MaliciousProcessFileMD5 Malicious process file MD5
     */
    public String getMaliciousProcessFileMD5() {
        return this.MaliciousProcessFileMD5;
    }

    /**
     * Set Malicious process file MD5
     * @param MaliciousProcessFileMD5 Malicious process file MD5
     */
    public void setMaliciousProcessFileMD5(String MaliciousProcessFileMD5) {
        this.MaliciousProcessFileMD5 = MaliciousProcessFileMD5;
    }

    /**
     * Get Malicious process name (PID) 
     * @return MaliciousProcessNamePID Malicious process name (PID)
     */
    public String getMaliciousProcessNamePID() {
        return this.MaliciousProcessNamePID;
    }

    /**
     * Set Malicious process name (PID)
     * @param MaliciousProcessNamePID Malicious process name (PID)
     */
    public void setMaliciousProcessNamePID(String MaliciousProcessNamePID) {
        this.MaliciousProcessNamePID = MaliciousProcessNamePID;
    }

    /**
     * Get Malicious process path 
     * @return MaliciousProcessPath Malicious process path
     */
    public String getMaliciousProcessPath() {
        return this.MaliciousProcessPath;
    }

    /**
     * Set Malicious process path
     * @param MaliciousProcessPath Malicious process path
     */
    public void setMaliciousProcessPath(String MaliciousProcessPath) {
        this.MaliciousProcessPath = MaliciousProcessPath;
    }

    /**
     * Get malicious process start time 
     * @return MaliciousProcessStartTime malicious process start time
     */
    public String getMaliciousProcessStartTime() {
        return this.MaliciousProcessStartTime;
    }

    /**
     * Set malicious process start time
     * @param MaliciousProcessStartTime malicious process start time
     */
    public void setMaliciousProcessStartTime(String MaliciousProcessStartTime) {
        this.MaliciousProcessStartTime = MaliciousProcessStartTime;
    }

    /**
     * Get command content 
     * @return CommandContent command content
     */
    public String getCommandContent() {
        return this.CommandContent;
    }

    /**
     * Set command content
     * @param CommandContent command content
     */
    public void setCommandContent(String CommandContent) {
        this.CommandContent = CommandContent;
    }

    /**
     * Get Startup user 
     * @return StartupUser Startup user
     */
    public String getStartupUser() {
        return this.StartupUser;
    }

    /**
     * Set Startup user
     * @param StartupUser Startup user
     */
    public void setStartupUser(String StartupUser) {
        this.StartupUser = StartupUser;
    }

    /**
     * Get User group 
     * @return UserGroup User group
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set User group
     * @param UserGroup User group
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get Add new permission 
     * @return NewPermissions Add new permission
     */
    public String getNewPermissions() {
        return this.NewPermissions;
    }

    /**
     * Set Add new permission
     * @param NewPermissions Add new permission
     */
    public void setNewPermissions(String NewPermissions) {
        this.NewPermissions = NewPermissions;
    }

    /**
     * Get Parent process 
     * @return ParentProcess Parent process
     */
    public String getParentProcess() {
        return this.ParentProcess;
    }

    /**
     * Set Parent process
     * @param ParentProcess Parent process
     */
    public void setParentProcess(String ParentProcess) {
        this.ParentProcess = ParentProcess;
    }

    /**
     * Get Class name 
     * @return ClassName Class name
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Class name
     * @param ClassName Class name
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get class loader 
     * @return ClassLoader class loader
     */
    public String getClassLoader() {
        return this.ClassLoader;
    }

    /**
     * Set class loader
     * @param ClassLoader class loader
     */
    public void setClassLoader(String ClassLoader) {
        this.ClassLoader = ClassLoader;
    }

    /**
     * Get File size 
     * @return ClassFileSize File size
     */
    public String getClassFileSize() {
        return this.ClassFileSize;
    }

    /**
     * Set File size
     * @param ClassFileSize File size
     */
    public void setClassFileSize(String ClassFileSize) {
        this.ClassFileSize = ClassFileSize;
    }

    /**
     * Get Class file MD5 
     * @return ClassFileMD5 Class file MD5
     */
    public String getClassFileMD5() {
        return this.ClassFileMD5;
    }

    /**
     * Set Class file MD5
     * @param ClassFileMD5 Class file MD5
     */
    public void setClassFileMD5(String ClassFileMD5) {
        this.ClassFileMD5 = ClassFileMD5;
    }

    /**
     * Get Parent class name 
     * @return ParentClassName Parent class name
     */
    public String getParentClassName() {
        return this.ParentClassName;
    }

    /**
     * Set Parent class name
     * @param ParentClassName Parent class name
     */
    public void setParentClassName(String ParentClassName) {
        this.ParentClassName = ParentClassName;
    }

    /**
     * Get inherit an API 
     * @return InheritedInterface inherit an API
     */
    public String getInheritedInterface() {
        return this.InheritedInterface;
    }

    /**
     * Set inherit an API
     * @param InheritedInterface inherit an API
     */
    public void setInheritedInterface(String InheritedInterface) {
        this.InheritedInterface = InheritedInterface;
    }

    /**
     * Get Annotation 
     * @return Comment Annotation
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Annotation
     * @param Comment Annotation
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get payload content 
     * @return PayloadContent payload content
     */
    public String getPayloadContent() {
        return this.PayloadContent;
    }

    /**
     * Set payload content
     * @param PayloadContent payload content
     */
    public void setPayloadContent(String PayloadContent) {
        this.PayloadContent = PayloadContent;
    }

    /**
     * Get Callback address profile 
     * @return CallbackAddressPortrait Callback address profile
     */
    public String getCallbackAddressPortrait() {
        return this.CallbackAddressPortrait;
    }

    /**
     * Set Callback address profile
     * @param CallbackAddressPortrait Callback address profile
     */
    public void setCallbackAddressPortrait(String CallbackAddressPortrait) {
        this.CallbackAddressPortrait = CallbackAddressPortrait;
    }

    /**
     * Get Callback address tag 
     * @return CallbackAddressTag Callback address tag
     */
    public String getCallbackAddressTag() {
        return this.CallbackAddressTag;
    }

    /**
     * Set Callback address tag
     * @param CallbackAddressTag Callback address tag
     */
    public void setCallbackAddressTag(String CallbackAddressTag) {
        this.CallbackAddressTag = CallbackAddressTag;
    }

    /**
     * Get Process MD5 
     * @return ProcessMD5 Process MD5
     */
    public String getProcessMD5() {
        return this.ProcessMD5;
    }

    /**
     * Set Process MD5
     * @param ProcessMD5 Process MD5
     */
    public void setProcessMD5(String ProcessMD5) {
        this.ProcessMD5 = ProcessMD5;
    }

    /**
     * Get File permission 
     * @return FilePermission File permission
     */
    public String getFilePermission() {
        return this.FilePermission;
    }

    /**
     * Set File permission
     * @param FilePermission File permission
     */
    public void setFilePermission(String FilePermission) {
        this.FilePermission = FilePermission;
    }

    /**
     * Get Information field from log analysis 
     * @return FromLogAnalysisData Information field from log analysis
     */
    public KeyValue [] getFromLogAnalysisData() {
        return this.FromLogAnalysisData;
    }

    /**
     * Set Information field from log analysis
     * @param FromLogAnalysisData Information field from log analysis
     */
    public void setFromLogAnalysisData(KeyValue [] FromLogAnalysisData) {
        this.FromLogAnalysisData = FromLogAnalysisData;
    }

    /**
     * Get probe hit 
     * @return HitProbe probe hit
     */
    public String getHitProbe() {
        return this.HitProbe;
    }

    /**
     * Set probe hit
     * @param HitProbe probe hit
     */
    public void setHitProbe(String HitProbe) {
        this.HitProbe = HitProbe;
    }

    /**
     * Get hit honeypot
 
     * @return HitHoneyPot hit honeypot

     */
    public String getHitHoneyPot() {
        return this.HitHoneyPot;
    }

    /**
     * Set hit honeypot

     * @param HitHoneyPot hit honeypot

     */
    public void setHitHoneyPot(String HitHoneyPot) {
        this.HitHoneyPot = HitHoneyPot;
    }

    /**
     * Get command list 
     * @return CommandList command list
     */
    public String getCommandList() {
        return this.CommandList;
    }

    /**
     * Set command list
     * @param CommandList command list
     */
    public void setCommandList(String CommandList) {
        this.CommandList = CommandList;
    }

    /**
     * Get Attack event description
 
     * @return AttackEventDesc Attack event description

     */
    public String getAttackEventDesc() {
        return this.AttackEventDesc;
    }

    /**
     * Set Attack event description

     * @param AttackEventDesc Attack event description

     */
    public void setAttackEventDesc(String AttackEventDesc) {
        this.AttackEventDesc = AttackEventDesc;
    }

    /**
     * Get Process information 
     * @return ProcessInfo Process information
     */
    public String getProcessInfo() {
        return this.ProcessInfo;
    }

    /**
     * Set Process information
     * @param ProcessInfo Process information
     */
    public void setProcessInfo(String ProcessInfo) {
        this.ProcessInfo = ProcessInfo;
    }

    /**
     * Get Login username & password 
     * @return UserNameAndPwd Login username & password
     */
    public String getUserNameAndPwd() {
        return this.UserNameAndPwd;
    }

    /**
     * Set Login username & password
     * @param UserNameAndPwd Login username & password
     */
    public void setUserNameAndPwd(String UserNameAndPwd) {
        this.UserNameAndPwd = UserNameAndPwd;
    }

    /**
     * Get Host protection policy ID 
     * @return StrategyID Host protection policy ID
     */
    public String getStrategyID() {
        return this.StrategyID;
    }

    /**
     * Set Host protection policy ID
     * @param StrategyID Host protection policy ID
     */
    public void setStrategyID(String StrategyID) {
        this.StrategyID = StrategyID;
    }

    /**
     * Get Host protection policy name 
     * @return StrategyName Host protection policy name
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Host protection policy name
     * @param StrategyName Host protection policy name
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Host protection hit policy is a combination of policy ID and Policy Name 
     * @return HitStrategy Host protection hit policy is a combination of policy ID and Policy Name
     */
    public String getHitStrategy() {
        return this.HitStrategy;
    }

    /**
     * Set Host protection hit policy is a combination of policy ID and Policy Name
     * @param HitStrategy Host protection hit policy is a combination of policy ID and Policy Name
     */
    public void setHitStrategy(String HitStrategy) {
        this.HitStrategy = HitStrategy;
    }

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get PID 
     * @return PID PID
     */
    public String getPID() {
        return this.PID;
    }

    /**
     * Set PID
     * @param PID PID
     */
    public void setPID(String PID) {
        this.PID = PID;
    }

    /**
     * Get Container Pod name 
     * @return PodName Container Pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Container Pod name
     * @param PodName Container Pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Container Pod ID 
     * @return PodID Container Pod ID
     */
    public String getPodID() {
        return this.PodID;
    }

    /**
     * Set Container Pod ID
     * @param PodID Container Pod ID
     */
    public void setPodID(String PodID) {
        this.PodID = PodID;
    }

    /**
     * Get Http response 
     * @return Response Http response
     */
    public String getResponse() {
        return this.Response;
    }

    /**
     * Set Http response
     * @param Response Http response
     */
    public void setResponse(String Response) {
        this.Response = Response;
    }

    /**
     * Get system call 
     * @return SystemCall system call
     */
    public String getSystemCall() {
        return this.SystemCall;
    }

    /**
     * Set system call
     * @param SystemCall system call
     */
    public void setSystemCall(String SystemCall) {
        this.SystemCall = SystemCall;
    }

    /**
     * Get Operation type 
     * @return Verb Operation type
     */
    public String getVerb() {
        return this.Verb;
    }

    /**
     * Set Operation type
     * @param Verb Operation type
     */
    public void setVerb(String Verb) {
        this.Verb = Verb;
    }

    /**
     * Get Log ID. 
     * @return LogID Log ID.
     */
    public String getLogID() {
        return this.LogID;
    }

    /**
     * Set Log ID.
     * @param LogID Log ID.
     */
    public void setLogID(String LogID) {
        this.LogID = LogID;
    }

    /**
     * Get Change content 
     * @return Different Change content
     */
    public String getDifferent() {
        return this.Different;
    }

    /**
     * Set Change content
     * @param Different Change content
     */
    public void setDifferent(String Different) {
        this.Different = Different;
    }

    /**
     * Get Event type 
     * @return EventType Event type
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type
     * @param EventType Event type
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Event description 
     * @return Description Event description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event description
     * @param Description Event description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Destination address (container reverse shell) 
     * @return TargetAddress Destination address (container reverse shell)
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set Destination address (container reverse shell)
     * @param TargetAddress Destination address (container reverse shell)
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get Malicious request domain name (container malicious outbound connection) 
     * @return MaliciousRequestDomain Malicious request domain name (container malicious outbound connection)
     */
    public String getMaliciousRequestDomain() {
        return this.MaliciousRequestDomain;
    }

    /**
     * Set Malicious request domain name (container malicious outbound connection)
     * @param MaliciousRequestDomain Malicious request domain name (container malicious outbound connection)
     */
    public void setMaliciousRequestDomain(String MaliciousRequestDomain) {
        this.MaliciousRequestDomain = MaliciousRequestDomain;
    }

    /**
     * Get Rule Type (Container K8sAPI Exception Request) 
     * @return RuleType Rule Type (Container K8sAPI Exception Request)
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule Type (Container K8sAPI Exception Request)
     * @param RuleType Rule Type (Container K8sAPI Exception Request)
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Requested Resource (Container K8sAPI Exception Request) 
     * @return RequestURI Requested Resource (Container K8sAPI Exception Request)
     */
    public String getRequestURI() {
        return this.RequestURI;
    }

    /**
     * Set Requested Resource (Container K8sAPI Exception Request)
     * @param RequestURI Requested Resource (Container K8sAPI Exception Request)
     */
    public void setRequestURI(String RequestURI) {
        this.RequestURI = RequestURI;
    }

    /**
     * Get Request Initiating User (Container K8sAPI Exception Request) 
     * @return RequestUser Request Initiating User (Container K8sAPI Exception Request)
     */
    public String getRequestUser() {
        return this.RequestUser;
    }

    /**
     * Set Request Initiating User (Container K8sAPI Exception Request)
     * @param RequestUser Request Initiating User (Container K8sAPI Exception Request)
     */
    public void setRequestUser(String RequestUser) {
        this.RequestUser = RequestUser;
    }

    /**
     * Get Request Object (Container K8sAPI Exception Request) 
     * @return RequestObject Request Object (Container K8sAPI Exception Request)
     */
    public String getRequestObject() {
        return this.RequestObject;
    }

    /**
     * Set Request Object (Container K8sAPI Exception Request)
     * @param RequestObject Request Object (Container K8sAPI Exception Request)
     */
    public void setRequestObject(String RequestObject) {
        this.RequestObject = RequestObject;
    }

    /**
     * Get Response object (container K8sAPI exception request) 
     * @return ResponseObject Response object (container K8sAPI exception request)
     */
    public String getResponseObject() {
        return this.ResponseObject;
    }

    /**
     * Set Response object (container K8sAPI exception request)
     * @param ResponseObject Response object (container K8sAPI exception request)
     */
    public void setResponseObject(String ResponseObject) {
        this.ResponseObject = ResponseObject;
    }

    /**
     * Get File type (Container file tamper) 
     * @return FileType File type (Container file tamper)
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type (Container file tamper)
     * @param FileType File type (Container file tamper)
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Tag feature (malicious outbound connection of container) 
     * @return TIType Tag feature (malicious outbound connection of container)
     */
    public String getTIType() {
        return this.TIType;
    }

    /**
     * Set Tag feature (malicious outbound connection of container)
     * @param TIType Tag feature (malicious outbound connection of container)
     */
    public void setTIType(String TIType) {
        this.TIType = TIType;
    }

    /**
     * Get Source IP Address (Container K8sAPI Exception Request) 
     * @return SourceIP Source IP Address (Container K8sAPI Exception Request)
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set Source IP Address (Container K8sAPI Exception Request)
     * @param SourceIP Source IP Address (Container K8sAPI Exception Request)
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    public AlertExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertExtraInfo(AlertExtraInfo source) {
        if (source.RelateEvent != null) {
            this.RelateEvent = new RelatedEvent(source.RelateEvent);
        }
        if (source.LeakContent != null) {
            this.LeakContent = new String(source.LeakContent);
        }
        if (source.LeakAPI != null) {
            this.LeakAPI = new String(source.LeakAPI);
        }
        if (source.SecretID != null) {
            this.SecretID = new String(source.SecretID);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.ProtocolPort != null) {
            this.ProtocolPort = new String(source.ProtocolPort);
        }
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.AttackIPProfile != null) {
            this.AttackIPProfile = new String(source.AttackIPProfile);
        }
        if (source.AttackIPTags != null) {
            this.AttackIPTags = new String(source.AttackIPTags);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.HttpLog != null) {
            this.HttpLog = new String(source.HttpLog);
        }
        if (source.AttackDomain != null) {
            this.AttackDomain = new String(source.AttackDomain);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.RequestHeaders != null) {
            this.RequestHeaders = new String(source.RequestHeaders);
        }
        if (source.LoginUserName != null) {
            this.LoginUserName = new String(source.LoginUserName);
        }
        if (source.VulnerabilityName != null) {
            this.VulnerabilityName = new String(source.VulnerabilityName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.ServiceProcess != null) {
            this.ServiceProcess = new String(source.ServiceProcess);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileMD5 != null) {
            this.FileMD5 = new String(source.FileMD5);
        }
        if (source.FileLastAccessTime != null) {
            this.FileLastAccessTime = new String(source.FileLastAccessTime);
        }
        if (source.FileModifyTime != null) {
            this.FileModifyTime = new String(source.FileModifyTime);
        }
        if (source.RecentAccessTime != null) {
            this.RecentAccessTime = new String(source.RecentAccessTime);
        }
        if (source.RecentModifyTime != null) {
            this.RecentModifyTime = new String(source.RecentModifyTime);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.VirusFileTags != null) {
            this.VirusFileTags = new String(source.VirusFileTags);
        }
        if (source.BehavioralCharacteristics != null) {
            this.BehavioralCharacteristics = new String(source.BehavioralCharacteristics);
        }
        if (source.ProcessNamePID != null) {
            this.ProcessNamePID = new String(source.ProcessNamePID);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessCommandLine != null) {
            this.ProcessCommandLine = new String(source.ProcessCommandLine);
        }
        if (source.ProcessPermissions != null) {
            this.ProcessPermissions = new String(source.ProcessPermissions);
        }
        if (source.ExecutedCommand != null) {
            this.ExecutedCommand = new String(source.ExecutedCommand);
        }
        if (source.AffectedFileName != null) {
            this.AffectedFileName = new String(source.AffectedFileName);
        }
        if (source.DecoyPath != null) {
            this.DecoyPath = new String(source.DecoyPath);
        }
        if (source.MaliciousProcessFileSize != null) {
            this.MaliciousProcessFileSize = new String(source.MaliciousProcessFileSize);
        }
        if (source.MaliciousProcessFileMD5 != null) {
            this.MaliciousProcessFileMD5 = new String(source.MaliciousProcessFileMD5);
        }
        if (source.MaliciousProcessNamePID != null) {
            this.MaliciousProcessNamePID = new String(source.MaliciousProcessNamePID);
        }
        if (source.MaliciousProcessPath != null) {
            this.MaliciousProcessPath = new String(source.MaliciousProcessPath);
        }
        if (source.MaliciousProcessStartTime != null) {
            this.MaliciousProcessStartTime = new String(source.MaliciousProcessStartTime);
        }
        if (source.CommandContent != null) {
            this.CommandContent = new String(source.CommandContent);
        }
        if (source.StartupUser != null) {
            this.StartupUser = new String(source.StartupUser);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.NewPermissions != null) {
            this.NewPermissions = new String(source.NewPermissions);
        }
        if (source.ParentProcess != null) {
            this.ParentProcess = new String(source.ParentProcess);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ClassLoader != null) {
            this.ClassLoader = new String(source.ClassLoader);
        }
        if (source.ClassFileSize != null) {
            this.ClassFileSize = new String(source.ClassFileSize);
        }
        if (source.ClassFileMD5 != null) {
            this.ClassFileMD5 = new String(source.ClassFileMD5);
        }
        if (source.ParentClassName != null) {
            this.ParentClassName = new String(source.ParentClassName);
        }
        if (source.InheritedInterface != null) {
            this.InheritedInterface = new String(source.InheritedInterface);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PayloadContent != null) {
            this.PayloadContent = new String(source.PayloadContent);
        }
        if (source.CallbackAddressPortrait != null) {
            this.CallbackAddressPortrait = new String(source.CallbackAddressPortrait);
        }
        if (source.CallbackAddressTag != null) {
            this.CallbackAddressTag = new String(source.CallbackAddressTag);
        }
        if (source.ProcessMD5 != null) {
            this.ProcessMD5 = new String(source.ProcessMD5);
        }
        if (source.FilePermission != null) {
            this.FilePermission = new String(source.FilePermission);
        }
        if (source.FromLogAnalysisData != null) {
            this.FromLogAnalysisData = new KeyValue[source.FromLogAnalysisData.length];
            for (int i = 0; i < source.FromLogAnalysisData.length; i++) {
                this.FromLogAnalysisData[i] = new KeyValue(source.FromLogAnalysisData[i]);
            }
        }
        if (source.HitProbe != null) {
            this.HitProbe = new String(source.HitProbe);
        }
        if (source.HitHoneyPot != null) {
            this.HitHoneyPot = new String(source.HitHoneyPot);
        }
        if (source.CommandList != null) {
            this.CommandList = new String(source.CommandList);
        }
        if (source.AttackEventDesc != null) {
            this.AttackEventDesc = new String(source.AttackEventDesc);
        }
        if (source.ProcessInfo != null) {
            this.ProcessInfo = new String(source.ProcessInfo);
        }
        if (source.UserNameAndPwd != null) {
            this.UserNameAndPwd = new String(source.UserNameAndPwd);
        }
        if (source.StrategyID != null) {
            this.StrategyID = new String(source.StrategyID);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.HitStrategy != null) {
            this.HitStrategy = new String(source.HitStrategy);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.PID != null) {
            this.PID = new String(source.PID);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodID != null) {
            this.PodID = new String(source.PodID);
        }
        if (source.Response != null) {
            this.Response = new String(source.Response);
        }
        if (source.SystemCall != null) {
            this.SystemCall = new String(source.SystemCall);
        }
        if (source.Verb != null) {
            this.Verb = new String(source.Verb);
        }
        if (source.LogID != null) {
            this.LogID = new String(source.LogID);
        }
        if (source.Different != null) {
            this.Different = new String(source.Different);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.MaliciousRequestDomain != null) {
            this.MaliciousRequestDomain = new String(source.MaliciousRequestDomain);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RequestURI != null) {
            this.RequestURI = new String(source.RequestURI);
        }
        if (source.RequestUser != null) {
            this.RequestUser = new String(source.RequestUser);
        }
        if (source.RequestObject != null) {
            this.RequestObject = new String(source.RequestObject);
        }
        if (source.ResponseObject != null) {
            this.ResponseObject = new String(source.ResponseObject);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.TIType != null) {
            this.TIType = new String(source.TIType);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RelateEvent.", this.RelateEvent);
        this.setParamSimple(map, prefix + "LeakContent", this.LeakContent);
        this.setParamSimple(map, prefix + "LeakAPI", this.LeakAPI);
        this.setParamSimple(map, prefix + "SecretID", this.SecretID);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "ProtocolPort", this.ProtocolPort);
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamSimple(map, prefix + "AttackIPProfile", this.AttackIPProfile);
        this.setParamSimple(map, prefix + "AttackIPTags", this.AttackIPTags);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "AttackDomain", this.AttackDomain);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "RequestHeaders", this.RequestHeaders);
        this.setParamSimple(map, prefix + "LoginUserName", this.LoginUserName);
        this.setParamSimple(map, prefix + "VulnerabilityName", this.VulnerabilityName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "ServiceProcess", this.ServiceProcess);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamSimple(map, prefix + "FileLastAccessTime", this.FileLastAccessTime);
        this.setParamSimple(map, prefix + "FileModifyTime", this.FileModifyTime);
        this.setParamSimple(map, prefix + "RecentAccessTime", this.RecentAccessTime);
        this.setParamSimple(map, prefix + "RecentModifyTime", this.RecentModifyTime);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "VirusFileTags", this.VirusFileTags);
        this.setParamSimple(map, prefix + "BehavioralCharacteristics", this.BehavioralCharacteristics);
        this.setParamSimple(map, prefix + "ProcessNamePID", this.ProcessNamePID);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessCommandLine", this.ProcessCommandLine);
        this.setParamSimple(map, prefix + "ProcessPermissions", this.ProcessPermissions);
        this.setParamSimple(map, prefix + "ExecutedCommand", this.ExecutedCommand);
        this.setParamSimple(map, prefix + "AffectedFileName", this.AffectedFileName);
        this.setParamSimple(map, prefix + "DecoyPath", this.DecoyPath);
        this.setParamSimple(map, prefix + "MaliciousProcessFileSize", this.MaliciousProcessFileSize);
        this.setParamSimple(map, prefix + "MaliciousProcessFileMD5", this.MaliciousProcessFileMD5);
        this.setParamSimple(map, prefix + "MaliciousProcessNamePID", this.MaliciousProcessNamePID);
        this.setParamSimple(map, prefix + "MaliciousProcessPath", this.MaliciousProcessPath);
        this.setParamSimple(map, prefix + "MaliciousProcessStartTime", this.MaliciousProcessStartTime);
        this.setParamSimple(map, prefix + "CommandContent", this.CommandContent);
        this.setParamSimple(map, prefix + "StartupUser", this.StartupUser);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "NewPermissions", this.NewPermissions);
        this.setParamSimple(map, prefix + "ParentProcess", this.ParentProcess);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "ClassLoader", this.ClassLoader);
        this.setParamSimple(map, prefix + "ClassFileSize", this.ClassFileSize);
        this.setParamSimple(map, prefix + "ClassFileMD5", this.ClassFileMD5);
        this.setParamSimple(map, prefix + "ParentClassName", this.ParentClassName);
        this.setParamSimple(map, prefix + "InheritedInterface", this.InheritedInterface);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PayloadContent", this.PayloadContent);
        this.setParamSimple(map, prefix + "CallbackAddressPortrait", this.CallbackAddressPortrait);
        this.setParamSimple(map, prefix + "CallbackAddressTag", this.CallbackAddressTag);
        this.setParamSimple(map, prefix + "ProcessMD5", this.ProcessMD5);
        this.setParamSimple(map, prefix + "FilePermission", this.FilePermission);
        this.setParamArrayObj(map, prefix + "FromLogAnalysisData.", this.FromLogAnalysisData);
        this.setParamSimple(map, prefix + "HitProbe", this.HitProbe);
        this.setParamSimple(map, prefix + "HitHoneyPot", this.HitHoneyPot);
        this.setParamSimple(map, prefix + "CommandList", this.CommandList);
        this.setParamSimple(map, prefix + "AttackEventDesc", this.AttackEventDesc);
        this.setParamSimple(map, prefix + "ProcessInfo", this.ProcessInfo);
        this.setParamSimple(map, prefix + "UserNameAndPwd", this.UserNameAndPwd);
        this.setParamSimple(map, prefix + "StrategyID", this.StrategyID);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "HitStrategy", this.HitStrategy);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodID", this.PodID);
        this.setParamSimple(map, prefix + "Response", this.Response);
        this.setParamSimple(map, prefix + "SystemCall", this.SystemCall);
        this.setParamSimple(map, prefix + "Verb", this.Verb);
        this.setParamSimple(map, prefix + "LogID", this.LogID);
        this.setParamSimple(map, prefix + "Different", this.Different);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamSimple(map, prefix + "MaliciousRequestDomain", this.MaliciousRequestDomain);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RequestURI", this.RequestURI);
        this.setParamSimple(map, prefix + "RequestUser", this.RequestUser);
        this.setParamSimple(map, prefix + "RequestObject", this.RequestObject);
        this.setParamSimple(map, prefix + "ResponseObject", this.ResponseObject);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "TIType", this.TIType);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);

    }
}

