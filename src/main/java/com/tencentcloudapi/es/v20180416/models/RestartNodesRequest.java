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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartNodesRequest extends AbstractModel {

    /**
    * Cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node name list
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * Whether to perform forced reboot.
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * Optional restart mode. `in-place`: restart; `blue-green`: blue-green restart. Default value: `in-place`.
    */
    @SerializedName("RestartMode")
    @Expose
    private String RestartMode;

    /**
    * Node status, for use in blue-green mode; offline node blue/green at risk
    */
    @SerializedName("IsOffline")
    @Expose
    private Boolean IsOffline;

    /**
    * cvm delay listing time
    */
    @SerializedName("CvmDelayOnlineTime")
    @Expose
    private Long CvmDelayOnlineTime;

    /**
    * Number of concurrent shard migrations
    */
    @SerializedName("ShardAllocationConcurrents")
    @Expose
    private Long ShardAllocationConcurrents;

    /**
    * Shard migration concurrency speed
    */
    @SerializedName("ShardAllocationBytes")
    @Expose
    private Long ShardAllocationBytes;

    /**
    * Whether to enable the placement group asynchronous task
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * Time period of the async task for the placement group
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
    * Event ID list.
    */
    @SerializedName("EventTypeIds")
    @Expose
    private String [] EventTypeIds;

    /**
     * Get Cluster instance ID. 
     * @return InstanceId Cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID.
     * @param InstanceId Cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node name list 
     * @return NodeNames Node name list
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set Node name list
     * @param NodeNames Node name list
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get Whether to perform forced reboot. 
     * @return ForceRestart Whether to perform forced reboot.
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to perform forced reboot.
     * @param ForceRestart Whether to perform forced reboot.
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get Optional restart mode. `in-place`: restart; `blue-green`: blue-green restart. Default value: `in-place`. 
     * @return RestartMode Optional restart mode. `in-place`: restart; `blue-green`: blue-green restart. Default value: `in-place`.
     */
    public String getRestartMode() {
        return this.RestartMode;
    }

    /**
     * Set Optional restart mode. `in-place`: restart; `blue-green`: blue-green restart. Default value: `in-place`.
     * @param RestartMode Optional restart mode. `in-place`: restart; `blue-green`: blue-green restart. Default value: `in-place`.
     */
    public void setRestartMode(String RestartMode) {
        this.RestartMode = RestartMode;
    }

    /**
     * Get Node status, for use in blue-green mode; offline node blue/green at risk 
     * @return IsOffline Node status, for use in blue-green mode; offline node blue/green at risk
     */
    public Boolean getIsOffline() {
        return this.IsOffline;
    }

    /**
     * Set Node status, for use in blue-green mode; offline node blue/green at risk
     * @param IsOffline Node status, for use in blue-green mode; offline node blue/green at risk
     */
    public void setIsOffline(Boolean IsOffline) {
        this.IsOffline = IsOffline;
    }

    /**
     * Get cvm delay listing time 
     * @return CvmDelayOnlineTime cvm delay listing time
     */
    public Long getCvmDelayOnlineTime() {
        return this.CvmDelayOnlineTime;
    }

    /**
     * Set cvm delay listing time
     * @param CvmDelayOnlineTime cvm delay listing time
     */
    public void setCvmDelayOnlineTime(Long CvmDelayOnlineTime) {
        this.CvmDelayOnlineTime = CvmDelayOnlineTime;
    }

    /**
     * Get Number of concurrent shard migrations 
     * @return ShardAllocationConcurrents Number of concurrent shard migrations
     */
    public Long getShardAllocationConcurrents() {
        return this.ShardAllocationConcurrents;
    }

    /**
     * Set Number of concurrent shard migrations
     * @param ShardAllocationConcurrents Number of concurrent shard migrations
     */
    public void setShardAllocationConcurrents(Long ShardAllocationConcurrents) {
        this.ShardAllocationConcurrents = ShardAllocationConcurrents;
    }

    /**
     * Get Shard migration concurrency speed 
     * @return ShardAllocationBytes Shard migration concurrency speed
     */
    public Long getShardAllocationBytes() {
        return this.ShardAllocationBytes;
    }

    /**
     * Set Shard migration concurrency speed
     * @param ShardAllocationBytes Shard migration concurrency speed
     */
    public void setShardAllocationBytes(Long ShardAllocationBytes) {
        this.ShardAllocationBytes = ShardAllocationBytes;
    }

    /**
     * Get Whether to enable the placement group asynchronous task 
     * @return EnableScheduleRecoverGroup Whether to enable the placement group asynchronous task
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set Whether to enable the placement group asynchronous task
     * @param EnableScheduleRecoverGroup Whether to enable the placement group asynchronous task
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get Time period of the async task for the placement group 
     * @return EnableScheduleOperationDuration Time period of the async task for the placement group
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set Time period of the async task for the placement group
     * @param EnableScheduleOperationDuration Time period of the async task for the placement group
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    /**
     * Get Event ID list. 
     * @return EventTypeIds Event ID list.
     */
    public String [] getEventTypeIds() {
        return this.EventTypeIds;
    }

    /**
     * Set Event ID list.
     * @param EventTypeIds Event ID list.
     */
    public void setEventTypeIds(String [] EventTypeIds) {
        this.EventTypeIds = EventTypeIds;
    }

    public RestartNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartNodesRequest(RestartNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
        if (source.RestartMode != null) {
            this.RestartMode = new String(source.RestartMode);
        }
        if (source.IsOffline != null) {
            this.IsOffline = new Boolean(source.IsOffline);
        }
        if (source.CvmDelayOnlineTime != null) {
            this.CvmDelayOnlineTime = new Long(source.CvmDelayOnlineTime);
        }
        if (source.ShardAllocationConcurrents != null) {
            this.ShardAllocationConcurrents = new Long(source.ShardAllocationConcurrents);
        }
        if (source.ShardAllocationBytes != null) {
            this.ShardAllocationBytes = new Long(source.ShardAllocationBytes);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
        if (source.EventTypeIds != null) {
            this.EventTypeIds = new String[source.EventTypeIds.length];
            for (int i = 0; i < source.EventTypeIds.length; i++) {
                this.EventTypeIds[i] = new String(source.EventTypeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamSimple(map, prefix + "RestartMode", this.RestartMode);
        this.setParamSimple(map, prefix + "IsOffline", this.IsOffline);
        this.setParamSimple(map, prefix + "CvmDelayOnlineTime", this.CvmDelayOnlineTime);
        this.setParamSimple(map, prefix + "ShardAllocationConcurrents", this.ShardAllocationConcurrents);
        this.setParamSimple(map, prefix + "ShardAllocationBytes", this.ShardAllocationBytes);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);
        this.setParamArraySimple(map, prefix + "EventTypeIds.", this.EventTypeIds);

    }
}

