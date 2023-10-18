/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class AccessControlEventInfo extends AbstractModel {

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Name of the hit rule
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * Generation time
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Action execution result. `BEHAVIOR_NONE`: None.
    `BEHAVIOR_ALERT`: Alert.
    `BEHAVIOR_RELEASE`: Allow.
    `BEHAVIOR_HOLDUP_FAILED`: Failed to block.
    `BEHAVIOR_HOLDUP_SUCCESSED`: Blocked.
    */
    @SerializedName("Behavior")
    @Expose
    private String Behavior;

    /**
    * Status. `0`: Pending. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Unique event ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Event type. `FILE_ABNORMAL_READ`: Abnormal file read.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Image ID, which is used for redirect.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Container ID, which is used for redirect.
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Event solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Event description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Hit policy ID
    */
    @SerializedName("MatchRuleId")
    @Expose
    private String MatchRuleId;

    /**
    * Action of the hit rule:
`RULE_MODE_RELEASE`: Allow.
`RULE_MODE_ALERT`: Alert.
`RULE_MODE_HOLDUP`: Block.
    */
    @SerializedName("MatchAction")
    @Expose
    private String MatchAction;

    /**
    * Information of the process that hits the rule
    */
    @SerializedName("MatchProcessPath")
    @Expose
    private String MatchProcessPath;

    /**
    * Information of the file that hits the rule
    */
    @SerializedName("MatchFilePath")
    @Expose
    private String MatchFilePath;

    /**
    * File path containing the name
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Whether the rule exists
    */
    @SerializedName("RuleExist")
    @Expose
    private Boolean RuleExist;

    /**
    * Number of events
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Last generation time
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * Rule group ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * Container isolation operation source
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

    /**
    * Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

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
     * Get Name of the hit rule 
     * @return MatchRuleName Name of the hit rule
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set Name of the hit rule
     * @param MatchRuleName Name of the hit rule
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
    }

    /**
     * Get Generation time 
     * @return FoundTime Generation time
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set Generation time
     * @param FoundTime Generation time
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Action execution result. `BEHAVIOR_NONE`: None.
    `BEHAVIOR_ALERT`: Alert.
    `BEHAVIOR_RELEASE`: Allow.
    `BEHAVIOR_HOLDUP_FAILED`: Failed to block.
    `BEHAVIOR_HOLDUP_SUCCESSED`: Blocked. 
     * @return Behavior Action execution result. `BEHAVIOR_NONE`: None.
    `BEHAVIOR_ALERT`: Alert.
    `BEHAVIOR_RELEASE`: Allow.
    `BEHAVIOR_HOLDUP_FAILED`: Failed to block.
    `BEHAVIOR_HOLDUP_SUCCESSED`: Blocked.
     */
    public String getBehavior() {
        return this.Behavior;
    }

    /**
     * Set Action execution result. `BEHAVIOR_NONE`: None.
    `BEHAVIOR_ALERT`: Alert.
    `BEHAVIOR_RELEASE`: Allow.
    `BEHAVIOR_HOLDUP_FAILED`: Failed to block.
    `BEHAVIOR_HOLDUP_SUCCESSED`: Blocked.
     * @param Behavior Action execution result. `BEHAVIOR_NONE`: None.
    `BEHAVIOR_ALERT`: Alert.
    `BEHAVIOR_RELEASE`: Allow.
    `BEHAVIOR_HOLDUP_FAILED`: Failed to block.
    `BEHAVIOR_HOLDUP_SUCCESSED`: Blocked.
     */
    public void setBehavior(String Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get Status. `0`: Pending. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored. 
     * @return Status Status. `0`: Pending. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. `0`: Pending. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
     * @param Status Status. `0`: Pending. `EVENT_UNDEAL`: Pending.
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Unique event ID 
     * @return Id Unique event ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique event ID
     * @param Id Unique event ID
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get Event type. `FILE_ABNORMAL_READ`: Abnormal file read. 
     * @return EventType Event type. `FILE_ABNORMAL_READ`: Abnormal file read.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type. `FILE_ABNORMAL_READ`: Abnormal file read.
     * @param EventType Event type. `FILE_ABNORMAL_READ`: Abnormal file read.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Image ID, which is used for redirect. 
     * @return ImageId Image ID, which is used for redirect.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID, which is used for redirect.
     * @param ImageId Image ID, which is used for redirect.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Container ID, which is used for redirect. 
     * @return ContainerId Container ID, which is used for redirect.
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID, which is used for redirect.
     * @param ContainerId Container ID, which is used for redirect.
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Event solution 
     * @return Solution Event solution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Event solution
     * @param Solution Event solution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
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
     * Get Hit policy ID 
     * @return MatchRuleId Hit policy ID
     */
    public String getMatchRuleId() {
        return this.MatchRuleId;
    }

    /**
     * Set Hit policy ID
     * @param MatchRuleId Hit policy ID
     */
    public void setMatchRuleId(String MatchRuleId) {
        this.MatchRuleId = MatchRuleId;
    }

    /**
     * Get Action of the hit rule:
`RULE_MODE_RELEASE`: Allow.
`RULE_MODE_ALERT`: Alert.
`RULE_MODE_HOLDUP`: Block. 
     * @return MatchAction Action of the hit rule:
`RULE_MODE_RELEASE`: Allow.
`RULE_MODE_ALERT`: Alert.
`RULE_MODE_HOLDUP`: Block.
     */
    public String getMatchAction() {
        return this.MatchAction;
    }

    /**
     * Set Action of the hit rule:
`RULE_MODE_RELEASE`: Allow.
`RULE_MODE_ALERT`: Alert.
`RULE_MODE_HOLDUP`: Block.
     * @param MatchAction Action of the hit rule:
`RULE_MODE_RELEASE`: Allow.
`RULE_MODE_ALERT`: Alert.
`RULE_MODE_HOLDUP`: Block.
     */
    public void setMatchAction(String MatchAction) {
        this.MatchAction = MatchAction;
    }

    /**
     * Get Information of the process that hits the rule 
     * @return MatchProcessPath Information of the process that hits the rule
     */
    public String getMatchProcessPath() {
        return this.MatchProcessPath;
    }

    /**
     * Set Information of the process that hits the rule
     * @param MatchProcessPath Information of the process that hits the rule
     */
    public void setMatchProcessPath(String MatchProcessPath) {
        this.MatchProcessPath = MatchProcessPath;
    }

    /**
     * Get Information of the file that hits the rule 
     * @return MatchFilePath Information of the file that hits the rule
     */
    public String getMatchFilePath() {
        return this.MatchFilePath;
    }

    /**
     * Set Information of the file that hits the rule
     * @param MatchFilePath Information of the file that hits the rule
     */
    public void setMatchFilePath(String MatchFilePath) {
        this.MatchFilePath = MatchFilePath;
    }

    /**
     * Get File path containing the name 
     * @return FilePath File path containing the name
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path containing the name
     * @param FilePath File path containing the name
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Whether the rule exists 
     * @return RuleExist Whether the rule exists
     */
    public Boolean getRuleExist() {
        return this.RuleExist;
    }

    /**
     * Set Whether the rule exists
     * @param RuleExist Whether the rule exists
     */
    public void setRuleExist(Boolean RuleExist) {
        this.RuleExist = RuleExist;
    }

    /**
     * Get Number of events 
     * @return EventCount Number of events
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set Number of events
     * @param EventCount Number of events
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get Last generation time 
     * @return LatestFoundTime Last generation time
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set Last generation time
     * @param LatestFoundTime Last generation time
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get Rule group ID 
     * @return RuleId Rule group ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule group ID
     * @param RuleId Rule group ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed. 
     * @return ContainerNetStatus Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
     * @param ContainerNetStatus Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown. 
     * @return ContainerNetSubStatus Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
     * @param ContainerNetSubStatus Sub-status of the container
"AGENT_OFFLINE"       // The agent is offline.
"NODE_DESTROYED"      // The node is terminated.
"CONTAINER_EXITED"    // The container exited.
"CONTAINER_DESTROYED" // The container was terminated.
"SHARED_HOST"         // The container shares the network with the server.
"RESOURCE_LIMIT"      // The number of resources to be isolated exceeds the limit.
"UNKNOW"              // The reason is unknown.
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get Container isolation operation source 
     * @return ContainerIsolateOperationSrc Container isolation operation source
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set Container isolation operation source
     * @param ContainerIsolateOperationSrc Container isolation operation source
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
    }

    /**
     * Get Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing. 
     * @return ContainerStatus Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
     * @param ContainerStatus Container status
`RUNNING`: Running.
`PAUSED`: Paused.
`STOPPED`: Stopped.
`CREATED`: Created.
`DESTROYED`: Terminated.
`RESTARTING`: Restarting.
`REMOVING`: Removing.
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    public AccessControlEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlEventInfo(AccessControlEventInfo source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
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
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
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
        if (source.MatchFilePath != null) {
            this.MatchFilePath = new String(source.MatchFilePath);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "MatchRuleName", this.MatchRuleName);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MatchRuleId", this.MatchRuleId);
        this.setParamSimple(map, prefix + "MatchAction", this.MatchAction);
        this.setParamSimple(map, prefix + "MatchProcessPath", this.MatchProcessPath);
        this.setParamSimple(map, prefix + "MatchFilePath", this.MatchFilePath);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "RuleExist", this.RuleExist);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);

    }
}

