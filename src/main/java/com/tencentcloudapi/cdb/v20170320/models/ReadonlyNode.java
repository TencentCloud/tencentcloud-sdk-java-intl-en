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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadonlyNode extends AbstractModel {

    /**
    * Whether distributed in a random availability Zone. Import YES means random availability Zone. Otherwise used specified availability Zone.
    */
    @SerializedName("IsRandomZone")
    @Expose
    private String IsRandomZone;

    /**
    * Specify the availability zone for node distribution.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * When upgrading a cloud disk edition instance, if you need to adjust the Availability Zone of Read-Only Nodes, you must specify the node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get Whether distributed in a random availability Zone. Import YES means random availability Zone. Otherwise used specified availability Zone. 
     * @return IsRandomZone Whether distributed in a random availability Zone. Import YES means random availability Zone. Otherwise used specified availability Zone.
     */
    public String getIsRandomZone() {
        return this.IsRandomZone;
    }

    /**
     * Set Whether distributed in a random availability Zone. Import YES means random availability Zone. Otherwise used specified availability Zone.
     * @param IsRandomZone Whether distributed in a random availability Zone. Import YES means random availability Zone. Otherwise used specified availability Zone.
     */
    public void setIsRandomZone(String IsRandomZone) {
        this.IsRandomZone = IsRandomZone;
    }

    /**
     * Get Specify the availability zone for node distribution. 
     * @return Zone Specify the availability zone for node distribution.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Specify the availability zone for node distribution.
     * @param Zone Specify the availability zone for node distribution.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get When upgrading a cloud disk edition instance, if you need to adjust the Availability Zone of Read-Only Nodes, you must specify the node ID. 
     * @return NodeId When upgrading a cloud disk edition instance, if you need to adjust the Availability Zone of Read-Only Nodes, you must specify the node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set When upgrading a cloud disk edition instance, if you need to adjust the Availability Zone of Read-Only Nodes, you must specify the node ID.
     * @param NodeId When upgrading a cloud disk edition instance, if you need to adjust the Availability Zone of Read-Only Nodes, you must specify the node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public ReadonlyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadonlyNode(ReadonlyNode source) {
        if (source.IsRandomZone != null) {
            this.IsRandomZone = new String(source.IsRandomZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsRandomZone", this.IsRandomZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

