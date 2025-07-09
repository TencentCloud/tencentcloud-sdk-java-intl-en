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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNodeStatusRequest extends AbstractModel {

    /**
    * Cluster ID, such as cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node information
    */
    @SerializedName("NodeInfos")
    @Expose
    private NodeInfos [] NodeInfos;

    /**
    * Node operation
    */
    @SerializedName("OperationCode")
    @Expose
    private String OperationCode;

    /**
    * Timeout period (s)
    */
    @SerializedName("RestartTimeOut")
    @Expose
    private String RestartTimeOut;

    /**
     * Get Cluster ID, such as cdwch-xxxx 
     * @return InstanceId Cluster ID, such as cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID, such as cdwch-xxxx
     * @param InstanceId Cluster ID, such as cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node information 
     * @return NodeInfos Node information
     */
    public NodeInfos [] getNodeInfos() {
        return this.NodeInfos;
    }

    /**
     * Set Node information
     * @param NodeInfos Node information
     */
    public void setNodeInfos(NodeInfos [] NodeInfos) {
        this.NodeInfos = NodeInfos;
    }

    /**
     * Get Node operation 
     * @return OperationCode Node operation
     */
    public String getOperationCode() {
        return this.OperationCode;
    }

    /**
     * Set Node operation
     * @param OperationCode Node operation
     */
    public void setOperationCode(String OperationCode) {
        this.OperationCode = OperationCode;
    }

    /**
     * Get Timeout period (s) 
     * @return RestartTimeOut Timeout period (s)
     */
    public String getRestartTimeOut() {
        return this.RestartTimeOut;
    }

    /**
     * Set Timeout period (s)
     * @param RestartTimeOut Timeout period (s)
     */
    public void setRestartTimeOut(String RestartTimeOut) {
        this.RestartTimeOut = RestartTimeOut;
    }

    public ModifyNodeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNodeStatusRequest(ModifyNodeStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeInfos != null) {
            this.NodeInfos = new NodeInfos[source.NodeInfos.length];
            for (int i = 0; i < source.NodeInfos.length; i++) {
                this.NodeInfos[i] = new NodeInfos(source.NodeInfos[i]);
            }
        }
        if (source.OperationCode != null) {
            this.OperationCode = new String(source.OperationCode);
        }
        if (source.RestartTimeOut != null) {
            this.RestartTimeOut = new String(source.RestartTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "NodeInfos.", this.NodeInfos);
        this.setParamSimple(map, prefix + "OperationCode", this.OperationCode);
        this.setParamSimple(map, prefix + "RestartTimeOut", this.RestartTimeOut);

    }
}

