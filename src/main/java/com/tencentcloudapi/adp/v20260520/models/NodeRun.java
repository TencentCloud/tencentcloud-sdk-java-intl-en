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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeRun extends AbstractModel {

    /**
    * ID of the node operation
    */
    @SerializedName("NodeRunId")
    @Expose
    private String NodeRunId;

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * ID of the workflow running instance
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node type.
1: Start node
2: Parameter extraction node
3: Large model node
4: Knowledge Q&A node
5: Knowledge retrieval node
6: Tag extraction node
7: Code execution node
8: Tool node
9: Logic judgment node
10: Reply node
11: Tab node
12: Loop node
13: Intent recognition node
14: Workflow node
15: Plug-in node
16: End node
17: Variable aggregate node data
18: Batch processing node
19: Message Queue node
20: Database node
21: Variable assignment node data
22: Variable conversion node data
23: Agent node
24: Annotation node
25: File collection node
26: Text collection node
27: Widget node
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * Running state. 1: initial status; 2: running; 3: operation successful; 4: operation failure; 5: canceled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error message
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * Total time consumed (ms)
    */
    @SerializedName("TotalCostMs")
    @Expose
    private Long TotalCostMs;

    /**
    * Total number of tokens consumed
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * Error code.
    */
    @SerializedName("FailCode")
    @Expose
    private String FailCode;

    /**
    * List of branch indexes
    */
    @SerializedName("BranchIndexList")
    @Expose
    private Long [] BranchIndexList;

    /**
     * Get ID of the node operation 
     * @return NodeRunId ID of the node operation
     */
    public String getNodeRunId() {
        return this.NodeRunId;
    }

    /**
     * Set ID of the node operation
     * @param NodeRunId ID of the node operation
     */
    public void setNodeRunId(String NodeRunId) {
        this.NodeRunId = NodeRunId;
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
     * Get ID of the workflow running instance 
     * @return WorkflowRunId ID of the workflow running instance
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set ID of the workflow running instance
     * @param WorkflowRunId ID of the workflow running instance
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
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
     * Get Node type.
1: Start node
2: Parameter extraction node
3: Large model node
4: Knowledge Q&A node
5: Knowledge retrieval node
6: Tag extraction node
7: Code execution node
8: Tool node
9: Logic judgment node
10: Reply node
11: Tab node
12: Loop node
13: Intent recognition node
14: Workflow node
15: Plug-in node
16: End node
17: Variable aggregate node data
18: Batch processing node
19: Message Queue node
20: Database node
21: Variable assignment node data
22: Variable conversion node data
23: Agent node
24: Annotation node
25: File collection node
26: Text collection node
27: Widget node 
     * @return NodeType Node type.
1: Start node
2: Parameter extraction node
3: Large model node
4: Knowledge Q&A node
5: Knowledge retrieval node
6: Tag extraction node
7: Code execution node
8: Tool node
9: Logic judgment node
10: Reply node
11: Tab node
12: Loop node
13: Intent recognition node
14: Workflow node
15: Plug-in node
16: End node
17: Variable aggregate node data
18: Batch processing node
19: Message Queue node
20: Database node
21: Variable assignment node data
22: Variable conversion node data
23: Agent node
24: Annotation node
25: File collection node
26: Text collection node
27: Widget node
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
1: Start node
2: Parameter extraction node
3: Large model node
4: Knowledge Q&A node
5: Knowledge retrieval node
6: Tag extraction node
7: Code execution node
8: Tool node
9: Logic judgment node
10: Reply node
11: Tab node
12: Loop node
13: Intent recognition node
14: Workflow node
15: Plug-in node
16: End node
17: Variable aggregate node data
18: Batch processing node
19: Message Queue node
20: Database node
21: Variable assignment node data
22: Variable conversion node data
23: Agent node
24: Annotation node
25: File collection node
26: Text collection node
27: Widget node
     * @param NodeType Node type.
1: Start node
2: Parameter extraction node
3: Large model node
4: Knowledge Q&A node
5: Knowledge retrieval node
6: Tag extraction node
7: Code execution node
8: Tool node
9: Logic judgment node
10: Reply node
11: Tab node
12: Loop node
13: Intent recognition node
14: Workflow node
15: Plug-in node
16: End node
17: Variable aggregate node data
18: Batch processing node
19: Message Queue node
20: Database node
21: Variable assignment node data
22: Variable conversion node data
23: Agent node
24: Annotation node
25: File collection node
26: Text collection node
27: Widget node
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Running state. 1: initial status; 2: running; 3: operation successful; 4: operation failure; 5: canceled 
     * @return Status Running state. 1: initial status; 2: running; 3: operation successful; 4: operation failure; 5: canceled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Running state. 1: initial status; 2: running; 3: operation successful; 4: operation failure; 5: canceled
     * @param Status Running state. 1: initial status; 2: running; 3: operation successful; 4: operation failure; 5: canceled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error message 
     * @return FailMessage Error message
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set Error message
     * @param FailMessage Error message
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get Total time consumed (ms) 
     * @return TotalCostMs Total time consumed (ms)
     */
    public Long getTotalCostMs() {
        return this.TotalCostMs;
    }

    /**
     * Set Total time consumed (ms)
     * @param TotalCostMs Total time consumed (ms)
     */
    public void setTotalCostMs(Long TotalCostMs) {
        this.TotalCostMs = TotalCostMs;
    }

    /**
     * Get Total number of tokens consumed 
     * @return TotalTokens Total number of tokens consumed
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set Total number of tokens consumed
     * @param TotalTokens Total number of tokens consumed
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get Error code. 
     * @return FailCode Error code.
     */
    public String getFailCode() {
        return this.FailCode;
    }

    /**
     * Set Error code.
     * @param FailCode Error code.
     */
    public void setFailCode(String FailCode) {
        this.FailCode = FailCode;
    }

    /**
     * Get List of branch indexes 
     * @return BranchIndexList List of branch indexes
     */
    public Long [] getBranchIndexList() {
        return this.BranchIndexList;
    }

    /**
     * Set List of branch indexes
     * @param BranchIndexList List of branch indexes
     */
    public void setBranchIndexList(Long [] BranchIndexList) {
        this.BranchIndexList = BranchIndexList;
    }

    public NodeRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRun(NodeRun source) {
        if (source.NodeRunId != null) {
            this.NodeRunId = new String(source.NodeRunId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.TotalCostMs != null) {
            this.TotalCostMs = new Long(source.TotalCostMs);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.FailCode != null) {
            this.FailCode = new String(source.FailCode);
        }
        if (source.BranchIndexList != null) {
            this.BranchIndexList = new Long[source.BranchIndexList.length];
            for (int i = 0; i < source.BranchIndexList.length; i++) {
                this.BranchIndexList[i] = new Long(source.BranchIndexList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeRunId", this.NodeRunId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "TotalCostMs", this.TotalCostMs);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamArraySimple(map, prefix + "BranchIndexList.", this.BranchIndexList);

    }
}

