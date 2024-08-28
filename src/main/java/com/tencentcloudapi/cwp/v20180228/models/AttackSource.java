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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackSource extends AbstractModel {

    /**
    * Attack backtracking node description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nodes")
    @Expose
    private AttackSourceNode [] Nodes;

    /**
    * Attack backtracking node path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Edges")
    @Expose
    private AttackSourceEdge [] Edges;

    /**
    * Parameters for requesting details on node-related events
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventInfoParam")
    @Expose
    private String EventInfoParam;

    /**
     * Get Attack backtracking node description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nodes Attack backtracking node description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AttackSourceNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set Attack backtracking node description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nodes Attack backtracking node description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodes(AttackSourceNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get Attack backtracking node path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Edges Attack backtracking node path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AttackSourceEdge [] getEdges() {
        return this.Edges;
    }

    /**
     * Set Attack backtracking node path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Edges Attack backtracking node path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEdges(AttackSourceEdge [] Edges) {
        this.Edges = Edges;
    }

    /**
     * Get Parameters for requesting details on node-related events
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventInfoParam Parameters for requesting details on node-related events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventInfoParam() {
        return this.EventInfoParam;
    }

    /**
     * Set Parameters for requesting details on node-related events
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventInfoParam Parameters for requesting details on node-related events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventInfoParam(String EventInfoParam) {
        this.EventInfoParam = EventInfoParam;
    }

    public AttackSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackSource(AttackSource source) {
        if (source.Nodes != null) {
            this.Nodes = new AttackSourceNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new AttackSourceNode(source.Nodes[i]);
            }
        }
        if (source.Edges != null) {
            this.Edges = new AttackSourceEdge[source.Edges.length];
            for (int i = 0; i < source.Edges.length; i++) {
                this.Edges[i] = new AttackSourceEdge(source.Edges[i]);
            }
        }
        if (source.EventInfoParam != null) {
            this.EventInfoParam = new String(source.EventInfoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "Edges.", this.Edges);
        this.setParamSimple(map, prefix + "EventInfoParam", this.EventInfoParam);

    }
}

