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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunNodeInfo extends AbstractModel {

    /**
    * Node type, 0: unspecified; 1: start node; 2: api node; 3: inquiry node; 4: answer node.
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Requested API.
    */
    @SerializedName("InvokeApi")
    @Expose
    private InvokeAPI InvokeApi;

    /**
    * Values of all slots of the current node, key: SlotID. Return an Null even if there is no value.
    */
    @SerializedName("SlotValues")
    @Expose
    private ValueInfo [] SlotValues;

    /**
     * Get Node type, 0: unspecified; 1: start node; 2: api node; 3: inquiry node; 4: answer node. 
     * @return NodeType Node type, 0: unspecified; 1: start node; 2: api node; 3: inquiry node; 4: answer node.
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type, 0: unspecified; 1: start node; 2: api node; 3: inquiry node; 4: answer node.
     * @param NodeType Node type, 0: unspecified; 1: start node; 2: api node; 3: inquiry node; 4: answer node.
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
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
     * Get Requested API. 
     * @return InvokeApi Requested API.
     */
    public InvokeAPI getInvokeApi() {
        return this.InvokeApi;
    }

    /**
     * Set Requested API.
     * @param InvokeApi Requested API.
     */
    public void setInvokeApi(InvokeAPI InvokeApi) {
        this.InvokeApi = InvokeApi;
    }

    /**
     * Get Values of all slots of the current node, key: SlotID. Return an Null even if there is no value. 
     * @return SlotValues Values of all slots of the current node, key: SlotID. Return an Null even if there is no value.
     */
    public ValueInfo [] getSlotValues() {
        return this.SlotValues;
    }

    /**
     * Set Values of all slots of the current node, key: SlotID. Return an Null even if there is no value.
     * @param SlotValues Values of all slots of the current node, key: SlotID. Return an Null even if there is no value.
     */
    public void setSlotValues(ValueInfo [] SlotValues) {
        this.SlotValues = SlotValues;
    }

    public RunNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunNodeInfo(RunNodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.InvokeApi != null) {
            this.InvokeApi = new InvokeAPI(source.InvokeApi);
        }
        if (source.SlotValues != null) {
            this.SlotValues = new ValueInfo[source.SlotValues.length];
            for (int i = 0; i < source.SlotValues.length; i++) {
                this.SlotValues[i] = new ValueInfo(source.SlotValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamObj(map, prefix + "InvokeApi.", this.InvokeApi);
        this.setParamArrayObj(map, prefix + "SlotValues.", this.SlotValues);

    }
}

