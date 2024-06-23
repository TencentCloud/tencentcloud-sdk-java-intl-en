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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNodeInfo extends AbstractModel {

    /**
    * Read from node SOURCE Write to node SINK
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get Read from node SOURCE Write to node SINK
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeType Read from node SOURCE Write to node SINK
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Read from node SOURCE Write to node SINK
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeType Read from node SOURCE Write to node SINK
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeId Node IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param NodeId Node IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeName Node nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param NodeName Node nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public InstanceNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNodeInfo(InstanceNodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

