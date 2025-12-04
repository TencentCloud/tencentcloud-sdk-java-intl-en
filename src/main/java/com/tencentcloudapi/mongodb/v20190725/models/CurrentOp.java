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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CurrentOp extends AbstractModel {

    /**
    * Operation number.
    */
    @SerializedName("OpId")
    @Expose
    private Long OpId;

    /**
    * Namespace where the operation is located, in the format of db.collection.
    */
    @SerializedName("Ns")
    @Expose
    private String Ns;

    /**
    * Execution statement of the operation.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Operation type.
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * Name of the shard where the operation is performed.
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * Name of the node where the operation is performed.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Detailed information about the operation.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Node role.
- primary: primary node.
- secondary: secondary node.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Execution time of the operation, in ms.
    */
    @SerializedName("MicrosecsRunning")
    @Expose
    private Long MicrosecsRunning;

    /**
    * Information about the node where the current operation is performed.
    */
    @SerializedName("ExecNode")
    @Expose
    private String ExecNode;

    /**
     * Get Operation number. 
     * @return OpId Operation number.
     */
    public Long getOpId() {
        return this.OpId;
    }

    /**
     * Set Operation number.
     * @param OpId Operation number.
     */
    public void setOpId(Long OpId) {
        this.OpId = OpId;
    }

    /**
     * Get Namespace where the operation is located, in the format of db.collection. 
     * @return Ns Namespace where the operation is located, in the format of db.collection.
     */
    public String getNs() {
        return this.Ns;
    }

    /**
     * Set Namespace where the operation is located, in the format of db.collection.
     * @param Ns Namespace where the operation is located, in the format of db.collection.
     */
    public void setNs(String Ns) {
        this.Ns = Ns;
    }

    /**
     * Get Execution statement of the operation. 
     * @return Query Execution statement of the operation.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Execution statement of the operation.
     * @param Query Execution statement of the operation.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Operation type.
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor. 
     * @return Op Operation type.
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set Operation type.
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
     * @param Op Operation type.
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get Name of the shard where the operation is performed. 
     * @return ReplicaSetName Name of the shard where the operation is performed.
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set Name of the shard where the operation is performed.
     * @param ReplicaSetName Name of the shard where the operation is performed.
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get Name of the node where the operation is performed. 
     * @return NodeName Name of the node where the operation is performed.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Name of the node where the operation is performed.
     * @param NodeName Name of the node where the operation is performed.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Detailed information about the operation. 
     * @return Operation Detailed information about the operation.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Detailed information about the operation.
     * @param Operation Detailed information about the operation.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Node role.
- primary: primary node.
- secondary: secondary node. 
     * @return State Node role.
- primary: primary node.
- secondary: secondary node.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Node role.
- primary: primary node.
- secondary: secondary node.
     * @param State Node role.
- primary: primary node.
- secondary: secondary node.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Execution time of the operation, in ms. 
     * @return MicrosecsRunning Execution time of the operation, in ms.
     */
    public Long getMicrosecsRunning() {
        return this.MicrosecsRunning;
    }

    /**
     * Set Execution time of the operation, in ms.
     * @param MicrosecsRunning Execution time of the operation, in ms.
     */
    public void setMicrosecsRunning(Long MicrosecsRunning) {
        this.MicrosecsRunning = MicrosecsRunning;
    }

    /**
     * Get Information about the node where the current operation is performed. 
     * @return ExecNode Information about the node where the current operation is performed.
     */
    public String getExecNode() {
        return this.ExecNode;
    }

    /**
     * Set Information about the node where the current operation is performed.
     * @param ExecNode Information about the node where the current operation is performed.
     */
    public void setExecNode(String ExecNode) {
        this.ExecNode = ExecNode;
    }

    public CurrentOp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CurrentOp(CurrentOp source) {
        if (source.OpId != null) {
            this.OpId = new Long(source.OpId);
        }
        if (source.Ns != null) {
            this.Ns = new String(source.Ns);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.ReplicaSetName != null) {
            this.ReplicaSetName = new String(source.ReplicaSetName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.MicrosecsRunning != null) {
            this.MicrosecsRunning = new Long(source.MicrosecsRunning);
        }
        if (source.ExecNode != null) {
            this.ExecNode = new String(source.ExecNode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpId", this.OpId);
        this.setParamSimple(map, prefix + "Ns", this.Ns);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "MicrosecsRunning", this.MicrosecsRunning);
        this.setParamSimple(map, prefix + "ExecNode", this.ExecNode);

    }
}

