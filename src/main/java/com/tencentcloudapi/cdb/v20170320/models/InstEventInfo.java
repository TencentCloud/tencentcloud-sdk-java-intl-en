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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstEventInfo extends AbstractModel {

    /**
    * Event name.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event status.
    */
    @SerializedName("EventStatus")
    @Expose
    private String EventStatus;

    /**
    * Event occurrence time.
    */
    @SerializedName("OccurTime")
    @Expose
    private String OccurTime;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get Event name. 
     * @return EventName Event name.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name.
     * @param EventName Event name.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Event status. 
     * @return EventStatus Event status.
     */
    public String getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set Event status.
     * @param EventStatus Event status.
     */
    public void setEventStatus(String EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get Event occurrence time. 
     * @return OccurTime Event occurrence time.
     */
    public String getOccurTime() {
        return this.OccurTime;
    }

    /**
     * Set Event occurrence time.
     * @param OccurTime Event occurrence time.
     */
    public void setOccurTime(String OccurTime) {
        this.OccurTime = OccurTime;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public InstEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstEventInfo(InstEventInfo source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new String(source.EventStatus);
        }
        if (source.OccurTime != null) {
            this.OccurTime = new String(source.OccurTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "OccurTime", this.OccurTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

