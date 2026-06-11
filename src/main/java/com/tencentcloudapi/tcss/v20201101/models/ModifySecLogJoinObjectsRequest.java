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
    * Bound list
    */
    @SerializedName("BindList")
    @Expose
    private String [] BindList;

    /**
    * List of assets to be unbound. When the node scope involves all nodes, this parameter indicates the list of assets to be excluded.
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
    * Log node scope type. 0: specified; 1: all.
    */
    @SerializedName("RangeType")
    @Expose
    private Long RangeType;

    /**
    * Whether new assets are accessed automatically. This parameter is valid only when the node scope involves all nodes.
    */
    @SerializedName("AutoJoin")
    @Expose
    private Boolean AutoJoin;

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
     * Get Bound list 
     * @return BindList Bound list
     */
    public String [] getBindList() {
        return this.BindList;
    }

    /**
     * Set Bound list
     * @param BindList Bound list
     */
    public void setBindList(String [] BindList) {
        this.BindList = BindList;
    }

    /**
     * Get List of assets to be unbound. When the node scope involves all nodes, this parameter indicates the list of assets to be excluded. 
     * @return UnBindList List of assets to be unbound. When the node scope involves all nodes, this parameter indicates the list of assets to be excluded.
     */
    public String [] getUnBindList() {
        return this.UnBindList;
    }

    /**
     * Set List of assets to be unbound. When the node scope involves all nodes, this parameter indicates the list of assets to be excluded.
     * @param UnBindList List of assets to be unbound. When the node scope involves all nodes, this parameter indicates the list of assets to be excluded.
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

    /**
     * Get Log node scope type. 0: specified; 1: all. 
     * @return RangeType Log node scope type. 0: specified; 1: all.
     */
    public Long getRangeType() {
        return this.RangeType;
    }

    /**
     * Set Log node scope type. 0: specified; 1: all.
     * @param RangeType Log node scope type. 0: specified; 1: all.
     */
    public void setRangeType(Long RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get Whether new assets are accessed automatically. This parameter is valid only when the node scope involves all nodes. 
     * @return AutoJoin Whether new assets are accessed automatically. This parameter is valid only when the node scope involves all nodes.
     */
    public Boolean getAutoJoin() {
        return this.AutoJoin;
    }

    /**
     * Set Whether new assets are accessed automatically. This parameter is valid only when the node scope involves all nodes.
     * @param AutoJoin Whether new assets are accessed automatically. This parameter is valid only when the node scope involves all nodes.
     */
    public void setAutoJoin(Boolean AutoJoin) {
        this.AutoJoin = AutoJoin;
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
        if (source.RangeType != null) {
            this.RangeType = new Long(source.RangeType);
        }
        if (source.AutoJoin != null) {
            this.AutoJoin = new Boolean(source.AutoJoin);
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
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "AutoJoin", this.AutoJoin);

    }
}

