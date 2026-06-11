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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessEventInfo extends AbstractModel {

    /**
    * <p>Process directory.</p>
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * <p>Event type. MALICE_PROCESS_START: malicious process startup.</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>Hit rule name. PROXY_TOOL: proxy software; TRANSFER_CONTROL: lateral movement; ATTACK_CMD: malicious command; REVERSE_SHELL: reverse shell; FILELESS: fileless execution; RISK_CMD: high-risk command; ABNORMAL_CHILD_PROC: abnormal child process startup of sensitive service; USER_DEFINED_RULE: user-defined rule</p>
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * <p>Generation time.</p>
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * <p>Container name.</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Image name.</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>Action execution result: BEHAVIOR_NONE: none<br>BEHAVIOR_ALERT: alarm<br>BEHAVIOR_RELEASE: allow<br>BEHAVIOR_HOLDUP_FAILED: block failed<br>BEHAVIOR_HOLDUP_SUCCESSED: block succeeded</p>
    */
    @SerializedName("Behavior")
    @Expose
    private String Behavior;

    /**
    * <p>Status: EVENT_UNDEAL: event unhandled<br>    EVENT_DEALED: event handled<br>    EVENT_INGNORE: event ignored</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Unique ID of the event record.</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Image ID, used for redirection.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Container ID, used for redirection.</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>Event solution.</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>Event detailed description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Hit policy ID.</p>
    */
    @SerializedName("MatchRuleId")
    @Expose
    private String MatchRuleId;

    /**
    * <p>Hit rule action:<br>RULE_MODE_RELEASE: allow<br>RULE_MODE_ALERT: alarm<br>RULE_MODE_HOLDUP: block</p>
    */
    @SerializedName("MatchAction")
    @Expose
    private String MatchAction;

    /**
    * <p>Hit rule process information.</p>
    */
    @SerializedName("MatchProcessPath")
    @Expose
    private String MatchProcessPath;

    /**
    * <p>Whether the rule exists.</p>
    */
    @SerializedName("RuleExist")
    @Expose
    private Boolean RuleExist;

    /**
    * <p>Number of events.</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>Last generation time.</p>
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * <p>Rule group ID.</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Hit policy name: SYSTEM_DEFINED_RULE (system policy) or user-defined policy name.</p>
    */
    @SerializedName("MatchGroupName")
    @Expose
    private String MatchGroupName;

    /**
    * <p>Hit rule level: HIGH, MIDDLE, and LOW.</p>
    */
    @SerializedName("MatchRuleLevel")
    @Expose
    private String MatchRuleLevel;

    /**
    * <p>Network status<br>Not isolated: NORMAL<br>Isolated: ISOLATED<br>Isolating: ISOLATING<br>Isolation failed: ISOLATE_FAILED<br>Restoring: RESTORING<br>Restoring failed: RESTORE_FAILED</p>
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * <p>Container sub-status.<br>&quot;AGENT_OFFLINE&quot;       //Agent offline<br>&quot;NODE_DESTROYED&quot;      //Node destroyed<br>&quot;CONTAINER_EXITED&quot;    //Container exited<br>&quot;CONTAINER_DESTROYED&quot; //Container destroyed<br>&quot;SHARED_HOST&quot;         //Container and host sharing the network<br>&quot;RESOURCE_LIMIT&quot;      //Resource limit exceeded for the isolation operation<br>&quot;UNKNOW&quot;              //Unknown reason</p>
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * <p>Source of container isolation operation.</p>
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

    /**
    * <p>Container status.<br>RUNNING<br>PAUSED<br>STOPPED<br>CREATED<br>DESTROYED<br>RESTARTING<br>REMOVING</p>
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>Node type: NORMAL (normal node) and SUPER (super node).</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Pod name.</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>pod ip</p>
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * <p>Node public IP address.</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>Node name.</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>Node ID.</p>
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * <p>uuid</p>
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * <p>Node private IP address.</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Command line parameters.</p>
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
     * Get <p>Process directory.</p> 
     * @return ProcessPath <p>Process directory.</p>
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set <p>Process directory.</p>
     * @param ProcessPath <p>Process directory.</p>
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get <p>Event type. MALICE_PROCESS_START: malicious process startup.</p> 
     * @return EventType <p>Event type. MALICE_PROCESS_START: malicious process startup.</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>Event type. MALICE_PROCESS_START: malicious process startup.</p>
     * @param EventType <p>Event type. MALICE_PROCESS_START: malicious process startup.</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>Hit rule name. PROXY_TOOL: proxy software; TRANSFER_CONTROL: lateral movement; ATTACK_CMD: malicious command; REVERSE_SHELL: reverse shell; FILELESS: fileless execution; RISK_CMD: high-risk command; ABNORMAL_CHILD_PROC: abnormal child process startup of sensitive service; USER_DEFINED_RULE: user-defined rule</p> 
     * @return MatchRuleName <p>Hit rule name. PROXY_TOOL: proxy software; TRANSFER_CONTROL: lateral movement; ATTACK_CMD: malicious command; REVERSE_SHELL: reverse shell; FILELESS: fileless execution; RISK_CMD: high-risk command; ABNORMAL_CHILD_PROC: abnormal child process startup of sensitive service; USER_DEFINED_RULE: user-defined rule</p>
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set <p>Hit rule name. PROXY_TOOL: proxy software; TRANSFER_CONTROL: lateral movement; ATTACK_CMD: malicious command; REVERSE_SHELL: reverse shell; FILELESS: fileless execution; RISK_CMD: high-risk command; ABNORMAL_CHILD_PROC: abnormal child process startup of sensitive service; USER_DEFINED_RULE: user-defined rule</p>
     * @param MatchRuleName <p>Hit rule name. PROXY_TOOL: proxy software; TRANSFER_CONTROL: lateral movement; ATTACK_CMD: malicious command; REVERSE_SHELL: reverse shell; FILELESS: fileless execution; RISK_CMD: high-risk command; ABNORMAL_CHILD_PROC: abnormal child process startup of sensitive service; USER_DEFINED_RULE: user-defined rule</p>
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
    }

    /**
     * Get <p>Generation time.</p> 
     * @return FoundTime <p>Generation time.</p>
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set <p>Generation time.</p>
     * @param FoundTime <p>Generation time.</p>
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get <p>Container name.</p> 
     * @return ContainerName <p>Container name.</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name.</p>
     * @param ContainerName <p>Container name.</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>Image name.</p> 
     * @return ImageName <p>Image name.</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>Image name.</p>
     * @param ImageName <p>Image name.</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>Action execution result: BEHAVIOR_NONE: none<br>BEHAVIOR_ALERT: alarm<br>BEHAVIOR_RELEASE: allow<br>BEHAVIOR_HOLDUP_FAILED: block failed<br>BEHAVIOR_HOLDUP_SUCCESSED: block succeeded</p> 
     * @return Behavior <p>Action execution result: BEHAVIOR_NONE: none<br>BEHAVIOR_ALERT: alarm<br>BEHAVIOR_RELEASE: allow<br>BEHAVIOR_HOLDUP_FAILED: block failed<br>BEHAVIOR_HOLDUP_SUCCESSED: block succeeded</p>
     */
    public String getBehavior() {
        return this.Behavior;
    }

    /**
     * Set <p>Action execution result: BEHAVIOR_NONE: none<br>BEHAVIOR_ALERT: alarm<br>BEHAVIOR_RELEASE: allow<br>BEHAVIOR_HOLDUP_FAILED: block failed<br>BEHAVIOR_HOLDUP_SUCCESSED: block succeeded</p>
     * @param Behavior <p>Action execution result: BEHAVIOR_NONE: none<br>BEHAVIOR_ALERT: alarm<br>BEHAVIOR_RELEASE: allow<br>BEHAVIOR_HOLDUP_FAILED: block failed<br>BEHAVIOR_HOLDUP_SUCCESSED: block succeeded</p>
     */
    public void setBehavior(String Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get <p>Status: EVENT_UNDEAL: event unhandled<br>    EVENT_DEALED: event handled<br>    EVENT_INGNORE: event ignored</p> 
     * @return Status <p>Status: EVENT_UNDEAL: event unhandled<br>    EVENT_DEALED: event handled<br>    EVENT_INGNORE: event ignored</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status: EVENT_UNDEAL: event unhandled<br>    EVENT_DEALED: event handled<br>    EVENT_INGNORE: event ignored</p>
     * @param Status <p>Status: EVENT_UNDEAL: event unhandled<br>    EVENT_DEALED: event handled<br>    EVENT_INGNORE: event ignored</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Unique ID of the event record.</p> 
     * @return Id <p>Unique ID of the event record.</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Unique ID of the event record.</p>
     * @param Id <p>Unique ID of the event record.</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Image ID, used for redirection.</p> 
     * @return ImageId <p>Image ID, used for redirection.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID, used for redirection.</p>
     * @param ImageId <p>Image ID, used for redirection.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Container ID, used for redirection.</p> 
     * @return ContainerId <p>Container ID, used for redirection.</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>Container ID, used for redirection.</p>
     * @param ContainerId <p>Container ID, used for redirection.</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>Event solution.</p> 
     * @return Solution <p>Event solution.</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>Event solution.</p>
     * @param Solution <p>Event solution.</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>Event detailed description.</p> 
     * @return Description <p>Event detailed description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Event detailed description.</p>
     * @param Description <p>Event detailed description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Hit policy ID.</p> 
     * @return MatchRuleId <p>Hit policy ID.</p>
     */
    public String getMatchRuleId() {
        return this.MatchRuleId;
    }

    /**
     * Set <p>Hit policy ID.</p>
     * @param MatchRuleId <p>Hit policy ID.</p>
     */
    public void setMatchRuleId(String MatchRuleId) {
        this.MatchRuleId = MatchRuleId;
    }

    /**
     * Get <p>Hit rule action:<br>RULE_MODE_RELEASE: allow<br>RULE_MODE_ALERT: alarm<br>RULE_MODE_HOLDUP: block</p> 
     * @return MatchAction <p>Hit rule action:<br>RULE_MODE_RELEASE: allow<br>RULE_MODE_ALERT: alarm<br>RULE_MODE_HOLDUP: block</p>
     */
    public String getMatchAction() {
        return this.MatchAction;
    }

    /**
     * Set <p>Hit rule action:<br>RULE_MODE_RELEASE: allow<br>RULE_MODE_ALERT: alarm<br>RULE_MODE_HOLDUP: block</p>
     * @param MatchAction <p>Hit rule action:<br>RULE_MODE_RELEASE: allow<br>RULE_MODE_ALERT: alarm<br>RULE_MODE_HOLDUP: block</p>
     */
    public void setMatchAction(String MatchAction) {
        this.MatchAction = MatchAction;
    }

    /**
     * Get <p>Hit rule process information.</p> 
     * @return MatchProcessPath <p>Hit rule process information.</p>
     */
    public String getMatchProcessPath() {
        return this.MatchProcessPath;
    }

    /**
     * Set <p>Hit rule process information.</p>
     * @param MatchProcessPath <p>Hit rule process information.</p>
     */
    public void setMatchProcessPath(String MatchProcessPath) {
        this.MatchProcessPath = MatchProcessPath;
    }

    /**
     * Get <p>Whether the rule exists.</p> 
     * @return RuleExist <p>Whether the rule exists.</p>
     */
    public Boolean getRuleExist() {
        return this.RuleExist;
    }

    /**
     * Set <p>Whether the rule exists.</p>
     * @param RuleExist <p>Whether the rule exists.</p>
     */
    public void setRuleExist(Boolean RuleExist) {
        this.RuleExist = RuleExist;
    }

    /**
     * Get <p>Number of events.</p> 
     * @return EventCount <p>Number of events.</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>Number of events.</p>
     * @param EventCount <p>Number of events.</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>Last generation time.</p> 
     * @return LatestFoundTime <p>Last generation time.</p>
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set <p>Last generation time.</p>
     * @param LatestFoundTime <p>Last generation time.</p>
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get <p>Rule group ID.</p> 
     * @return RuleId <p>Rule group ID.</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Rule group ID.</p>
     * @param RuleId <p>Rule group ID.</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Hit policy name: SYSTEM_DEFINED_RULE (system policy) or user-defined policy name.</p> 
     * @return MatchGroupName <p>Hit policy name: SYSTEM_DEFINED_RULE (system policy) or user-defined policy name.</p>
     */
    public String getMatchGroupName() {
        return this.MatchGroupName;
    }

    /**
     * Set <p>Hit policy name: SYSTEM_DEFINED_RULE (system policy) or user-defined policy name.</p>
     * @param MatchGroupName <p>Hit policy name: SYSTEM_DEFINED_RULE (system policy) or user-defined policy name.</p>
     */
    public void setMatchGroupName(String MatchGroupName) {
        this.MatchGroupName = MatchGroupName;
    }

    /**
     * Get <p>Hit rule level: HIGH, MIDDLE, and LOW.</p> 
     * @return MatchRuleLevel <p>Hit rule level: HIGH, MIDDLE, and LOW.</p>
     */
    public String getMatchRuleLevel() {
        return this.MatchRuleLevel;
    }

    /**
     * Set <p>Hit rule level: HIGH, MIDDLE, and LOW.</p>
     * @param MatchRuleLevel <p>Hit rule level: HIGH, MIDDLE, and LOW.</p>
     */
    public void setMatchRuleLevel(String MatchRuleLevel) {
        this.MatchRuleLevel = MatchRuleLevel;
    }

    /**
     * Get <p>Network status<br>Not isolated: NORMAL<br>Isolated: ISOLATED<br>Isolating: ISOLATING<br>Isolation failed: ISOLATE_FAILED<br>Restoring: RESTORING<br>Restoring failed: RESTORE_FAILED</p> 
     * @return ContainerNetStatus <p>Network status<br>Not isolated: NORMAL<br>Isolated: ISOLATED<br>Isolating: ISOLATING<br>Isolation failed: ISOLATE_FAILED<br>Restoring: RESTORING<br>Restoring failed: RESTORE_FAILED</p>
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set <p>Network status<br>Not isolated: NORMAL<br>Isolated: ISOLATED<br>Isolating: ISOLATING<br>Isolation failed: ISOLATE_FAILED<br>Restoring: RESTORING<br>Restoring failed: RESTORE_FAILED</p>
     * @param ContainerNetStatus <p>Network status<br>Not isolated: NORMAL<br>Isolated: ISOLATED<br>Isolating: ISOLATING<br>Isolation failed: ISOLATE_FAILED<br>Restoring: RESTORING<br>Restoring failed: RESTORE_FAILED</p>
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get <p>Container sub-status.<br>&quot;AGENT_OFFLINE&quot;       //Agent offline<br>&quot;NODE_DESTROYED&quot;      //Node destroyed<br>&quot;CONTAINER_EXITED&quot;    //Container exited<br>&quot;CONTAINER_DESTROYED&quot; //Container destroyed<br>&quot;SHARED_HOST&quot;         //Container and host sharing the network<br>&quot;RESOURCE_LIMIT&quot;      //Resource limit exceeded for the isolation operation<br>&quot;UNKNOW&quot;              //Unknown reason</p> 
     * @return ContainerNetSubStatus <p>Container sub-status.<br>&quot;AGENT_OFFLINE&quot;       //Agent offline<br>&quot;NODE_DESTROYED&quot;      //Node destroyed<br>&quot;CONTAINER_EXITED&quot;    //Container exited<br>&quot;CONTAINER_DESTROYED&quot; //Container destroyed<br>&quot;SHARED_HOST&quot;         //Container and host sharing the network<br>&quot;RESOURCE_LIMIT&quot;      //Resource limit exceeded for the isolation operation<br>&quot;UNKNOW&quot;              //Unknown reason</p>
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set <p>Container sub-status.<br>&quot;AGENT_OFFLINE&quot;       //Agent offline<br>&quot;NODE_DESTROYED&quot;      //Node destroyed<br>&quot;CONTAINER_EXITED&quot;    //Container exited<br>&quot;CONTAINER_DESTROYED&quot; //Container destroyed<br>&quot;SHARED_HOST&quot;         //Container and host sharing the network<br>&quot;RESOURCE_LIMIT&quot;      //Resource limit exceeded for the isolation operation<br>&quot;UNKNOW&quot;              //Unknown reason</p>
     * @param ContainerNetSubStatus <p>Container sub-status.<br>&quot;AGENT_OFFLINE&quot;       //Agent offline<br>&quot;NODE_DESTROYED&quot;      //Node destroyed<br>&quot;CONTAINER_EXITED&quot;    //Container exited<br>&quot;CONTAINER_DESTROYED&quot; //Container destroyed<br>&quot;SHARED_HOST&quot;         //Container and host sharing the network<br>&quot;RESOURCE_LIMIT&quot;      //Resource limit exceeded for the isolation operation<br>&quot;UNKNOW&quot;              //Unknown reason</p>
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get <p>Source of container isolation operation.</p> 
     * @return ContainerIsolateOperationSrc <p>Source of container isolation operation.</p>
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set <p>Source of container isolation operation.</p>
     * @param ContainerIsolateOperationSrc <p>Source of container isolation operation.</p>
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
    }

    /**
     * Get <p>Container status.<br>RUNNING<br>PAUSED<br>STOPPED<br>CREATED<br>DESTROYED<br>RESTARTING<br>REMOVING</p> 
     * @return ContainerStatus <p>Container status.<br>RUNNING<br>PAUSED<br>STOPPED<br>CREATED<br>DESTROYED<br>RESTARTING<br>REMOVING</p>
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set <p>Container status.<br>RUNNING<br>PAUSED<br>STOPPED<br>CREATED<br>DESTROYED<br>RESTARTING<br>REMOVING</p>
     * @param ContainerStatus <p>Container status.<br>RUNNING<br>PAUSED<br>STOPPED<br>CREATED<br>DESTROYED<br>RESTARTING<br>REMOVING</p>
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterID <p>Cluster ID.</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterID <p>Cluster ID.</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>Node type: NORMAL (normal node) and SUPER (super node).</p> 
     * @return NodeType <p>Node type: NORMAL (normal node) and SUPER (super node).</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node type: NORMAL (normal node) and SUPER (super node).</p>
     * @param NodeType <p>Node type: NORMAL (normal node) and SUPER (super node).</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Pod name.</p> 
     * @return PodName <p>Pod name.</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod name.</p>
     * @param PodName <p>Pod name.</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>pod ip</p> 
     * @return PodIP <p>pod ip</p>
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set <p>pod ip</p>
     * @param PodIP <p>pod ip</p>
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return NodeUniqueID <p>Cluster ID.</p>
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param NodeUniqueID <p>Cluster ID.</p>
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get <p>Node public IP address.</p> 
     * @return PublicIP <p>Node public IP address.</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>Node public IP address.</p>
     * @param PublicIP <p>Node public IP address.</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>Node name.</p> 
     * @return NodeName <p>Node name.</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>Node name.</p>
     * @param NodeName <p>Node name.</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>Node ID.</p> 
     * @return NodeID <p>Node ID.</p>
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set <p>Node ID.</p>
     * @param NodeID <p>Node ID.</p>
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get <p>uuid</p> 
     * @return HostID <p>uuid</p>
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set <p>uuid</p>
     * @param HostID <p>uuid</p>
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get <p>Node private IP address.</p> 
     * @return HostIP <p>Node private IP address.</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>Node private IP address.</p>
     * @param HostIP <p>Node private IP address.</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
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
     * Get <p>Command line parameters.</p> 
     * @return CmdLine <p>Command line parameters.</p>
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set <p>Command line parameters.</p>
     * @param CmdLine <p>Command line parameters.</p>
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    public AbnormalProcessEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessEventInfo(AbnormalProcessEventInfo source) {
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.MatchRuleName != null) {
            this.MatchRuleName = new String(source.MatchRuleName);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Behavior != null) {
            this.Behavior = new String(source.Behavior);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MatchRuleId != null) {
            this.MatchRuleId = new String(source.MatchRuleId);
        }
        if (source.MatchAction != null) {
            this.MatchAction = new String(source.MatchAction);
        }
        if (source.MatchProcessPath != null) {
            this.MatchProcessPath = new String(source.MatchProcessPath);
        }
        if (source.RuleExist != null) {
            this.RuleExist = new Boolean(source.RuleExist);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.MatchGroupName != null) {
            this.MatchGroupName = new String(source.MatchGroupName);
        }
        if (source.MatchRuleLevel != null) {
            this.MatchRuleLevel = new String(source.MatchRuleLevel);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ContainerNetSubStatus != null) {
            this.ContainerNetSubStatus = new String(source.ContainerNetSubStatus);
        }
        if (source.ContainerIsolateOperationSrc != null) {
            this.ContainerIsolateOperationSrc = new String(source.ContainerIsolateOperationSrc);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "MatchRuleName", this.MatchRuleName);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MatchRuleId", this.MatchRuleId);
        this.setParamSimple(map, prefix + "MatchAction", this.MatchAction);
        this.setParamSimple(map, prefix + "MatchProcessPath", this.MatchProcessPath);
        this.setParamSimple(map, prefix + "RuleExist", this.RuleExist);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "MatchGroupName", this.MatchGroupName);
        this.setParamSimple(map, prefix + "MatchRuleLevel", this.MatchRuleLevel);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);

    }
}

