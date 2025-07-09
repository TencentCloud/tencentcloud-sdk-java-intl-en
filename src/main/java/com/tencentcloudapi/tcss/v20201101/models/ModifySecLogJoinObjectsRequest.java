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

public class ModifySecLogJoinObjectsRequest extends AbstractModel {

    /**
    * Log type
Container bash: container_bash
Container startup: container_launch
K8s API: k8s_api
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * List of QUuids of bound servers
    */
    @SerializedName("BindList")
    @Expose
    private String [] BindList;

    /**
    * List of QUuids of servers to be unbound
    */
    @SerializedName("UnBindList")
    @Expose
    private String [] UnBindList;

    /**
    * Node type.
`NORMAL`: General node (default)
`SUPER`: Super node

    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get Log type
Container bash: container_bash
Container startup: container_launch
K8s API: k8s_api 
     * @return LogType Log type
Container bash: container_bash
Container startup: container_launch
K8s API: k8s_api
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type
Container bash: container_bash
Container startup: container_launch
K8s API: k8s_api
     * @param LogType Log type
Container bash: container_bash
Container startup: container_launch
K8s API: k8s_api
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get List of QUuids of bound servers 
     * @return BindList List of QUuids of bound servers
     */
    public String [] getBindList() {
        return this.BindList;
    }

    /**
     * Set List of QUuids of bound servers
     * @param BindList List of QUuids of bound servers
     */
    public void setBindList(String [] BindList) {
        this.BindList = BindList;
    }

    /**
     * Get List of QUuids of servers to be unbound 
     * @return UnBindList List of QUuids of servers to be unbound
     */
    public String [] getUnBindList() {
        return this.UnBindList;
    }

    /**
     * Set List of QUuids of servers to be unbound
     * @param UnBindList List of QUuids of servers to be unbound
     */
    public void setUnBindList(String [] UnBindList) {
        this.UnBindList = UnBindList;
    }

    /**
     * Get Node type.
`NORMAL`: General node (default)
`SUPER`: Super node
 
     * @return NodeType Node type.
`NORMAL`: General node (default)
`SUPER`: Super node

     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
`NORMAL`: General node (default)
`SUPER`: Super node

     * @param NodeType Node type.
`NORMAL`: General node (default)
`SUPER`: Super node

     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public ModifySecLogJoinObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogJoinObjectsRequest(ModifySecLogJoinObjectsRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.BindList != null) {
            this.BindList = new String[source.BindList.length];
            for (int i = 0; i < source.BindList.length; i++) {
                this.BindList[i] = new String(source.BindList[i]);
            }
        }
        if (source.UnBindList != null) {
            this.UnBindList = new String[source.UnBindList.length];
            for (int i = 0; i < source.UnBindList.length; i++) {
                this.UnBindList[i] = new String(source.UnBindList[i]);
            }
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamArraySimple(map, prefix + "BindList.", this.BindList);
        this.setParamArraySimple(map, prefix + "UnBindList.", this.UnBindList);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

