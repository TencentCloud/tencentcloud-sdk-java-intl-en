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

public class DescribeImageDenyEventDetailResponse extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

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
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Image name
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
    * Public IP address
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

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
    * Execute action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
    */
    @SerializedName("DealBehavior")
    @Expose
    private String DealBehavior;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Rule Start Interception Time
    */
    @SerializedName("RuleEffectTime")
    @Expose
    private String RuleEffectTime;

    /**
    * Event description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Image startup parameter
    */
    @SerializedName("StartParam")
    @Expose
    private String StartParam;

    /**
    * Solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    *  Pod Status
    */
    @SerializedName("PodStatus")
    @Expose
    private String PodStatus;

    /**
    * Cluster ID.
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
    * Node ID.
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Node Unique ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * Node subnet id
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * Node Subnet Name
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * Node subnet cidr
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

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
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleInfo Rule content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRuleInfo() {
        return this.RuleInfo;
    }

    /**
     * Set Rule content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleInfo Rule content
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Execute action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception 
     * @return DealBehavior Execute action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
     */
    public String getDealBehavior() {
        return this.DealBehavior;
    }

    /**
     * Set Execute action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
     * @param DealBehavior Execute action
BEHAVIOR_ALERT: Alert
BEHAVIOR_HOLDUP_SUCCESSED: Interception
     */
    public void setDealBehavior(String DealBehavior) {
        this.DealBehavior = DealBehavior;
    }

    /**
     * Get Pod name 
     * @return PodName Pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
     * @param PodName Pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Rule Start Interception Time 
     * @return RuleEffectTime Rule Start Interception Time
     */
    public String getRuleEffectTime() {
        return this.RuleEffectTime;
    }

    /**
     * Set Rule Start Interception Time
     * @param RuleEffectTime Rule Start Interception Time
     */
    public void setRuleEffectTime(String RuleEffectTime) {
        this.RuleEffectTime = RuleEffectTime;
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
     * Get Image startup parameter 
     * @return StartParam Image startup parameter
     */
    public String getStartParam() {
        return this.StartParam;
    }

    /**
     * Set Image startup parameter
     * @param StartParam Image startup parameter
     */
    public void setStartParam(String StartParam) {
        this.StartParam = StartParam;
    }

    /**
     * Get Solution 
     * @return Solution Solution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
     * @param Solution Solution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
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
     * Get  Pod Status 
     * @return PodStatus  Pod Status
     */
    public String getPodStatus() {
        return this.PodStatus;
    }

    /**
     * Set  Pod Status
     * @param PodStatus  Pod Status
     */
    public void setPodStatus(String PodStatus) {
        this.PodStatus = PodStatus;
    }

    /**
     * Get Cluster ID. 
     * @return ClusterID Cluster ID.
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID.
     * @param ClusterID Cluster ID.
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
     * Get Node ID. 
     * @return NodeID Node ID.
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set Node ID.
     * @param NodeID Node ID.
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Node Unique ID 
     * @return NodeUniqueID Node Unique ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set Node Unique ID
     * @param NodeUniqueID Node Unique ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get Node subnet id 
     * @return NodeSubNetID Node subnet id
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set Node subnet id
     * @param NodeSubNetID Node subnet id
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get Node Subnet Name 
     * @return NodeSubNetName Node Subnet Name
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set Node Subnet Name
     * @param NodeSubNetName Node Subnet Name
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get Node subnet cidr 
     * @return NodeSubNetCIDR Node subnet cidr
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set Node subnet cidr
     * @param NodeSubNetCIDR Node subnet cidr
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
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

    public DescribeImageDenyEventDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageDenyEventDetailResponse(DescribeImageDenyEventDetailResponse source) {
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
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
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
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
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.RuleEffectTime != null) {
            this.RuleEffectTime = new String(source.RuleEffectTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StartParam != null) {
            this.StartParam = new String(source.StartParam);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String(source.PodStatus);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ImageRegistryInfo != null) {
            this.ImageRegistryInfo = new ImageRegistryInfo(source.ImageRegistryInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventID", this.EventID);
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
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "DealBehavior", this.DealBehavior);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "RuleEffectTime", this.RuleEffectTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartParam", this.StartParam);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodStatus", this.PodStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "ImageRegistryInfo.", this.ImageRegistryInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

