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

public class ImageDenyEvent extends AbstractModel {

    /**
    * Event Type. EVENT_RISK: Risk Event Type; EVENT_PRIVILEGE: Privilege
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Rule type
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Rule Enable Status. 0: Enabled; 1: Disabled
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * Rule Policy Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
    */
    @SerializedName("RuleEffectStatus")
    @Expose
    private String RuleEffectStatus;

    /**
    * Rule content
    */
    @SerializedName("RuleInfo")
    @Expose
    private String [] RuleInfo;

    /**
    * Rule description
    */
    @SerializedName("RuleDescription")
    @Expose
    private String RuleDescription;

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image Name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Private IP address
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
    * Host QUUID
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * First generation time
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * Latest creation time
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * Number of events
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Execution action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
    */
    @SerializedName("DealBehavior")
    @Expose
    private String DealBehavior;

    /**
    * Event ID
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
    * Public IP address
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Node ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Node type.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Super Node Unique ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Image repository information.
    */
    @SerializedName("ImageRegistryInfo")
    @Expose
    private ImageRegistryInfo ImageRegistryInfo;

    /**
     * Get Event Type. EVENT_RISK: Risk Event Type; EVENT_PRIVILEGE: Privilege 
     * @return EventType Event Type. EVENT_RISK: Risk Event Type; EVENT_PRIVILEGE: Privilege
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event Type. EVENT_RISK: Risk Event Type; EVENT_PRIVILEGE: Privilege
     * @param EventType Event Type. EVENT_RISK: Risk Event Type; EVENT_PRIVILEGE: Privilege
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule ID 
     * @return RuleID Rule ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID
     * @param RuleID Rule ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Rule type 
     * @return RuleType Rule type
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type
     * @param RuleType Rule type
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Rule Enable Status. 0: Enabled; 1: Disabled 
     * @return RuleStatus Rule Enable Status. 0: Enabled; 1: Disabled
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Rule Enable Status. 0: Enabled; 1: Disabled
     * @param RuleStatus Rule Enable Status. 0: Enabled; 1: Disabled
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Rule Policy Status. IN_THE_TEST: Observing; IN_EFFECT: Effective 
     * @return RuleEffectStatus Rule Policy Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
     */
    public String getRuleEffectStatus() {
        return this.RuleEffectStatus;
    }

    /**
     * Set Rule Policy Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
     * @param RuleEffectStatus Rule Policy Status. IN_THE_TEST: Observing; IN_EFFECT: Effective
     */
    public void setRuleEffectStatus(String RuleEffectStatus) {
        this.RuleEffectStatus = RuleEffectStatus;
    }

    /**
     * Get Rule content 
     * @return RuleInfo Rule content
     */
    public String [] getRuleInfo() {
        return this.RuleInfo;
    }

    /**
     * Set Rule content
     * @param RuleInfo Rule content
     */
    public void setRuleInfo(String [] RuleInfo) {
        this.RuleInfo = RuleInfo;
    }

    /**
     * Get Rule description 
     * @return RuleDescription Rule description
     */
    public String getRuleDescription() {
        return this.RuleDescription;
    }

    /**
     * Set Rule description
     * @param RuleDescription Rule description
     */
    public void setRuleDescription(String RuleDescription) {
        this.RuleDescription = RuleDescription;
    }

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Image Name 
     * @return ImageName Image Name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image Name
     * @param ImageName Image Name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Node name. 
     * @return NodeName Node name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name.
     * @param NodeName Node name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Private IP address 
     * @return NodeIP Private IP address
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set Private IP address
     * @param NodeIP Private IP address
     */
    public void setNodeIP(String NodeIP) {
        this.NodeIP = NodeIP;
    }

    /**
     * Get Host QUUID 
     * @return QUUID Host QUUID
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set Host QUUID
     * @param QUUID Host QUUID
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get First generation time 
     * @return FoundTime First generation time
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set First generation time
     * @param FoundTime First generation time
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get Latest creation time 
     * @return LatestFoundTime Latest creation time
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set Latest creation time
     * @param LatestFoundTime Latest creation time
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
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
     * Get Execution action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception 
     * @return DealBehavior Execution action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
     */
    public String getDealBehavior() {
        return this.DealBehavior;
    }

    /**
     * Set Execution action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
     * @param DealBehavior Execution action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
     */
    public void setDealBehavior(String DealBehavior) {
        this.DealBehavior = DealBehavior;
    }

    /**
     * Get Event ID 
     * @return EventID Event ID
     */
    public Long getEventID() {
        return this.EventID;
    }

    /**
     * Set Event ID
     * @param EventID Event ID
     */
    public void setEventID(Long EventID) {
        this.EventID = EventID;
    }

    /**
     * Get Public IP address 
     * @return PublicIP Public IP address
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP address
     * @param PublicIP Public IP address
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Node ID 
     * @return NodeID Node ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set Node ID
     * @param NodeID Node ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Node type. 
     * @return NodeType Node type.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
     * @param NodeType Node type.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Super Node Unique ID 
     * @return NodeUniqueID Super Node Unique ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set Super Node Unique ID
     * @param NodeUniqueID Super Node Unique ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get pod ip 
     * @return PodIP pod ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set pod ip
     * @param PodIP pod ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get pod name 
     * @return PodName pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod name
     * @param PodName pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Image repository information. 
     * @return ImageRegistryInfo Image repository information.
     */
    public ImageRegistryInfo getImageRegistryInfo() {
        return this.ImageRegistryInfo;
    }

    /**
     * Set Image repository information.
     * @param ImageRegistryInfo Image repository information.
     */
    public void setImageRegistryInfo(ImageRegistryInfo ImageRegistryInfo) {
        this.ImageRegistryInfo = ImageRegistryInfo;
    }

    public ImageDenyEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageDenyEvent(ImageDenyEvent source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Long(source.RuleStatus);
        }
        if (source.RuleEffectStatus != null) {
            this.RuleEffectStatus = new String(source.RuleEffectStatus);
        }
        if (source.RuleInfo != null) {
            this.RuleInfo = new String[source.RuleInfo.length];
            for (int i = 0; i < source.RuleInfo.length; i++) {
                this.RuleInfo[i] = new String(source.RuleInfo[i]);
            }
        }
        if (source.RuleDescription != null) {
            this.RuleDescription = new String(source.RuleDescription);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeIP != null) {
            this.NodeIP = new String(source.NodeIP);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.DealBehavior != null) {
            this.DealBehavior = new String(source.DealBehavior);
        }
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ImageRegistryInfo != null) {
            this.ImageRegistryInfo = new ImageRegistryInfo(source.ImageRegistryInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "RuleEffectStatus", this.RuleEffectStatus);
        this.setParamArraySimple(map, prefix + "RuleInfo.", this.RuleInfo);
        this.setParamSimple(map, prefix + "RuleDescription", this.RuleDescription);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeIP", this.NodeIP);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "DealBehavior", this.DealBehavior);
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "ImageRegistryInfo.", this.ImageRegistryInfo);

    }
}

