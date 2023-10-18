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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartNodesRequest extends AbstractModel {

    /**
    * Cluster instance ID
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
    * Whether to force restart
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * The restart mode. Valid values: `in-place` (default), `blue-green`.
    */
    @SerializedName("RestartMode")
    @Expose
    private String RestartMode;

    /**
    * The node status, applicable in the blue/green mode. The blue/green restart is risky if the node is offline.
    */
    @SerializedName("IsOffline")
    @Expose
    private Boolean IsOffline;

    /**
     * Get Cluster instance ID 
     * @return InstanceId Cluster instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param InstanceId Cluster instance ID
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
     * Get Whether to force restart 
     * @return ForceRestart Whether to force restart
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to force restart
     * @param ForceRestart Whether to force restart
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get The restart mode. Valid values: `in-place` (default), `blue-green`. 
     * @return RestartMode The restart mode. Valid values: `in-place` (default), `blue-green`.
     */
    public String getRestartMode() {
        return this.RestartMode;
    }

    /**
     * Set The restart mode. Valid values: `in-place` (default), `blue-green`.
     * @param RestartMode The restart mode. Valid values: `in-place` (default), `blue-green`.
     */
    public void setRestartMode(String RestartMode) {
        this.RestartMode = RestartMode;
    }

    /**
     * Get The node status, applicable in the blue/green mode. The blue/green restart is risky if the node is offline. 
     * @return IsOffline The node status, applicable in the blue/green mode. The blue/green restart is risky if the node is offline.
     */
    public Boolean getIsOffline() {
        return this.IsOffline;
    }

    /**
     * Set The node status, applicable in the blue/green mode. The blue/green restart is risky if the node is offline.
     * @param IsOffline The node status, applicable in the blue/green mode. The blue/green restart is risky if the node is offline.
     */
    public void setIsOffline(Boolean IsOffline) {
        this.IsOffline = IsOffline;
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

    }
}

