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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackSourceNode extends AbstractModel {

    /**
    * Event ID. If this parameter is left blank, no corresponding event exists.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * BRUTEFORCE: password cracking; MALWARE: Trojan; BASH: high-risk command; RISK_DNS: malicious request; LOGIN: cross-region log-in; HOST: host node; TIME_ORDER: general node.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Node IP address. When the node is HOST, the value is the IP address of this node.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Level. 0: prompt; 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Node ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * General node description
    */
    @SerializedName("NodeDesc")
    @Expose
    private String NodeDesc;

    /**
    * Timeline number. Nodes with the same number belong to the same timeline.
    */
    @SerializedName("TimeLineNum")
    @Expose
    private Long TimeLineNum;

    /**
    * Node details
    */
    @SerializedName("NodeDetail")
    @Expose
    private String NodeDetail;

    /**
     * Get Event ID. If this parameter is left blank, no corresponding event exists. 
     * @return EventId Event ID. If this parameter is left blank, no corresponding event exists.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID. If this parameter is left blank, no corresponding event exists.
     * @param EventId Event ID. If this parameter is left blank, no corresponding event exists.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get BRUTEFORCE: password cracking; MALWARE: Trojan; BASH: high-risk command; RISK_DNS: malicious request; LOGIN: cross-region log-in; HOST: host node; TIME_ORDER: general node. 
     * @return EventType BRUTEFORCE: password cracking; MALWARE: Trojan; BASH: high-risk command; RISK_DNS: malicious request; LOGIN: cross-region log-in; HOST: host node; TIME_ORDER: general node.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set BRUTEFORCE: password cracking; MALWARE: Trojan; BASH: high-risk command; RISK_DNS: malicious request; LOGIN: cross-region log-in; HOST: host node; TIME_ORDER: general node.
     * @param EventType BRUTEFORCE: password cracking; MALWARE: Trojan; BASH: high-risk command; RISK_DNS: malicious request; LOGIN: cross-region log-in; HOST: host node; TIME_ORDER: general node.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Node IP address. When the node is HOST, the value is the IP address of this node. 
     * @return Ip Node IP address. When the node is HOST, the value is the IP address of this node.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Node IP address. When the node is HOST, the value is the IP address of this node.
     * @param Ip Node IP address. When the node is HOST, the value is the IP address of this node.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Level. 0: prompt; 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. 
     * @return Level Level. 0: prompt; 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Level. 0: prompt; 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     * @param Level Level. 0: prompt; 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Node ID 
     * @return NodeId Node ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID
     * @param NodeId Node ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get General node description 
     * @return NodeDesc General node description
     */
    public String getNodeDesc() {
        return this.NodeDesc;
    }

    /**
     * Set General node description
     * @param NodeDesc General node description
     */
    public void setNodeDesc(String NodeDesc) {
        this.NodeDesc = NodeDesc;
    }

    /**
     * Get Timeline number. Nodes with the same number belong to the same timeline. 
     * @return TimeLineNum Timeline number. Nodes with the same number belong to the same timeline.
     */
    public Long getTimeLineNum() {
        return this.TimeLineNum;
    }

    /**
     * Set Timeline number. Nodes with the same number belong to the same timeline.
     * @param TimeLineNum Timeline number. Nodes with the same number belong to the same timeline.
     */
    public void setTimeLineNum(Long TimeLineNum) {
        this.TimeLineNum = TimeLineNum;
    }

    /**
     * Get Node details 
     * @return NodeDetail Node details
     */
    public String getNodeDetail() {
        return this.NodeDetail;
    }

    /**
     * Set Node details
     * @param NodeDetail Node details
     */
    public void setNodeDetail(String NodeDetail) {
        this.NodeDetail = NodeDetail;
    }

    public AttackSourceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackSourceNode(AttackSourceNode source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NodeDesc != null) {
            this.NodeDesc = new String(source.NodeDesc);
        }
        if (source.TimeLineNum != null) {
            this.TimeLineNum = new Long(source.TimeLineNum);
        }
        if (source.NodeDetail != null) {
            this.NodeDetail = new String(source.NodeDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NodeDesc", this.NodeDesc);
        this.setParamSimple(map, prefix + "TimeLineNum", this.TimeLineNum);
        this.setParamSimple(map, prefix + "NodeDetail", this.NodeDetail);

    }
}

