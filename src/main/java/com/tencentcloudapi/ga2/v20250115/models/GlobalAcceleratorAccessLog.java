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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlobalAcceleratorAccessLog extends AbstractModel {

    /**
    * <p>Log Unique Id</p>
    */
    @SerializedName("LogPushTaskId")
    @Expose
    private String LogPushTaskId;

    /**
    * <p>Unique Id of the GA instance.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Unique Id of the listener</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>Unique Id of the terminal node group</p>
    */
    @SerializedName("EndpointGroupId")
    @Expose
    private String EndpointGroupId;

    /**
    * <p>Log task description</p>
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
    * <p>Region where the logs are located.</p>
    */
    @SerializedName("CloudRegion")
    @Expose
    private String CloudRegion;

    /**
    * <p>Log topic Id</p>
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * <p>Log Set Id</p>
    */
    @SerializedName("CloudLogSetId")
    @Expose
    private String CloudLogSetId;

    /**
    * <p>Select log data collection field</p>
    */
    @SerializedName("FieldKeys")
    @Expose
    private String [] FieldKeys;

    /**
    * <p>Log task status</p><p>Enumeration values:</p><ul><li>active: Running</li><li>stopped: Suspended</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Log Unique Id</p> 
     * @return LogPushTaskId <p>Log Unique Id</p>
     */
    public String getLogPushTaskId() {
        return this.LogPushTaskId;
    }

    /**
     * Set <p>Log Unique Id</p>
     * @param LogPushTaskId <p>Log Unique Id</p>
     */
    public void setLogPushTaskId(String LogPushTaskId) {
        this.LogPushTaskId = LogPushTaskId;
    }

    /**
     * Get <p>Unique Id of the GA instance.</p> 
     * @return GlobalAcceleratorId <p>Unique Id of the GA instance.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Unique Id of the GA instance.</p>
     * @param GlobalAcceleratorId <p>Unique Id of the GA instance.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Unique Id of the listener</p> 
     * @return ListenerId <p>Unique Id of the listener</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>Unique Id of the listener</p>
     * @param ListenerId <p>Unique Id of the listener</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>Unique Id of the terminal node group</p> 
     * @return EndpointGroupId <p>Unique Id of the terminal node group</p>
     */
    public String getEndpointGroupId() {
        return this.EndpointGroupId;
    }

    /**
     * Set <p>Unique Id of the terminal node group</p>
     * @param EndpointGroupId <p>Unique Id of the terminal node group</p>
     */
    public void setEndpointGroupId(String EndpointGroupId) {
        this.EndpointGroupId = EndpointGroupId;
    }

    /**
     * Get <p>Log task description</p> 
     * @return FlowLogDescription <p>Log task description</p>
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set <p>Log task description</p>
     * @param FlowLogDescription <p>Log task description</p>
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    /**
     * Get <p>Region where the logs are located.</p> 
     * @return CloudRegion <p>Region where the logs are located.</p>
     */
    public String getCloudRegion() {
        return this.CloudRegion;
    }

    /**
     * Set <p>Region where the logs are located.</p>
     * @param CloudRegion <p>Region where the logs are located.</p>
     */
    public void setCloudRegion(String CloudRegion) {
        this.CloudRegion = CloudRegion;
    }

    /**
     * Get <p>Log topic Id</p> 
     * @return CloudLogId <p>Log topic Id</p>
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set <p>Log topic Id</p>
     * @param CloudLogId <p>Log topic Id</p>
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get <p>Log Set Id</p> 
     * @return CloudLogSetId <p>Log Set Id</p>
     */
    public String getCloudLogSetId() {
        return this.CloudLogSetId;
    }

    /**
     * Set <p>Log Set Id</p>
     * @param CloudLogSetId <p>Log Set Id</p>
     */
    public void setCloudLogSetId(String CloudLogSetId) {
        this.CloudLogSetId = CloudLogSetId;
    }

    /**
     * Get <p>Select log data collection field</p> 
     * @return FieldKeys <p>Select log data collection field</p>
     */
    public String [] getFieldKeys() {
        return this.FieldKeys;
    }

    /**
     * Set <p>Select log data collection field</p>
     * @param FieldKeys <p>Select log data collection field</p>
     */
    public void setFieldKeys(String [] FieldKeys) {
        this.FieldKeys = FieldKeys;
    }

    /**
     * Get <p>Log task status</p><p>Enumeration values:</p><ul><li>active: Running</li><li>stopped: Suspended</li></ul> 
     * @return Status <p>Log task status</p><p>Enumeration values:</p><ul><li>active: Running</li><li>stopped: Suspended</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Log task status</p><p>Enumeration values:</p><ul><li>active: Running</li><li>stopped: Suspended</li></ul>
     * @param Status <p>Log task status</p><p>Enumeration values:</p><ul><li>active: Running</li><li>stopped: Suspended</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public GlobalAcceleratorAccessLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorAccessLog(GlobalAcceleratorAccessLog source) {
        if (source.LogPushTaskId != null) {
            this.LogPushTaskId = new String(source.LogPushTaskId);
        }
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.EndpointGroupId != null) {
            this.EndpointGroupId = new String(source.EndpointGroupId);
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
        if (source.CloudRegion != null) {
            this.CloudRegion = new String(source.CloudRegion);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.CloudLogSetId != null) {
            this.CloudLogSetId = new String(source.CloudLogSetId);
        }
        if (source.FieldKeys != null) {
            this.FieldKeys = new String[source.FieldKeys.length];
            for (int i = 0; i < source.FieldKeys.length; i++) {
                this.FieldKeys[i] = new String(source.FieldKeys[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogPushTaskId", this.LogPushTaskId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "EndpointGroupId", this.EndpointGroupId);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);
        this.setParamSimple(map, prefix + "CloudRegion", this.CloudRegion);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogSetId", this.CloudLogSetId);
        this.setParamArraySimple(map, prefix + "FieldKeys.", this.FieldKeys);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

