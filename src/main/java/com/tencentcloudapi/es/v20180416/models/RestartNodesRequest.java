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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartNodesRequest extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

