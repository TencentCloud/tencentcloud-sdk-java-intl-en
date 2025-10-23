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

public class DescribeDBInstanceNodePropertyRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to Node Management, and copy the node ID.
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
    * Node role. Valid values:
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
    */
    @SerializedName("Roles")
    @Expose
    private String [] Roles;

    /**
    * Whether the node is a hidden node. Default value: false.
    */
    @SerializedName("OnlyHidden")
    @Expose
    private Boolean OnlyHidden;

    /**
    * Priority of the node for electing it as the new primary node. Value range: [0, 100]. A larger value indicates a higher priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Node voting right.- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
    */
    @SerializedName("Votes")
    @Expose
    private Long Votes;

    /**
    * Node tag.
    */
    @SerializedName("Tags")
    @Expose
    private NodeTag [] Tags;

    /**
     * Get Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list. 
     * @return InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     * @param InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to Node Management, and copy the node ID. 
     * @return NodeIds Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to Node Management, and copy the node ID.
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to Node Management, and copy the node ID.
     * @param NodeIds Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), go to Node Management, and copy the node ID.
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    /**
     * Get Node role. Valid values:
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node. 
     * @return Roles Node role. Valid values:
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
     */
    public String [] getRoles() {
        return this.Roles;
    }

    /**
     * Set Node role. Valid values:
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
     * @param Roles Node role. Valid values:
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
     */
    public void setRoles(String [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get Whether the node is a hidden node. Default value: false. 
     * @return OnlyHidden Whether the node is a hidden node. Default value: false.
     */
    public Boolean getOnlyHidden() {
        return this.OnlyHidden;
    }

    /**
     * Set Whether the node is a hidden node. Default value: false.
     * @param OnlyHidden Whether the node is a hidden node. Default value: false.
     */
    public void setOnlyHidden(Boolean OnlyHidden) {
        this.OnlyHidden = OnlyHidden;
    }

    /**
     * Get Priority of the node for electing it as the new primary node. Value range: [0, 100]. A larger value indicates a higher priority. 
     * @return Priority Priority of the node for electing it as the new primary node. Value range: [0, 100]. A larger value indicates a higher priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority of the node for electing it as the new primary node. Value range: [0, 100]. A larger value indicates a higher priority.
     * @param Priority Priority of the node for electing it as the new primary node. Value range: [0, 100]. A larger value indicates a higher priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Node voting right.- 1: The node has the right to vote.
- 0: The node does not have the right to vote. 
     * @return Votes Node voting right.- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
     */
    public Long getVotes() {
        return this.Votes;
    }

    /**
     * Set Node voting right.- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
     * @param Votes Node voting right.- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
     */
    public void setVotes(Long Votes) {
        this.Votes = Votes;
    }

    /**
     * Get Node tag. 
     * @return Tags Node tag.
     */
    public NodeTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Node tag.
     * @param Tags Node tag.
     */
    public void setTags(NodeTag [] Tags) {
        this.Tags = Tags;
    }

    public DescribeDBInstanceNodePropertyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceNodePropertyRequest(DescribeDBInstanceNodePropertyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
        if (source.Roles != null) {
            this.Roles = new String[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new String(source.Roles[i]);
            }
        }
        if (source.OnlyHidden != null) {
            this.OnlyHidden = new Boolean(source.OnlyHidden);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Votes != null) {
            this.Votes = new Long(source.Votes);
        }
        if (source.Tags != null) {
            this.Tags = new NodeTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new NodeTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);
        this.setParamArraySimple(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "OnlyHidden", this.OnlyHidden);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Votes", this.Votes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

