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

public class NodeProperty extends AbstractModel {

    /**
    * Node AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node access address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Public network access address (IP address or domain name) of the node. The example value is an IP address.
    */
    @SerializedName("WanServiceAddress")
    @Expose
    private String WanServiceAddress;

    /**
    * Node role.
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Whether the node is a hidden node.
- true: a hidden node.
- false: not a hidden node.
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
    * Node status.
- NORMAL: running normally.
- STARTUP: starting.
- STARTUP2: starting and processing the intermediate data.
- RECOVERING: recovering and not available.
- DOWN: offline.
- UNKNOWN: unknown status.
- ROLLBACK: rolling back.
- REMOVED: removed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Delay time of primary-secondary synchronization, in seconds.
    */
    @SerializedName("SlaveDelay")
    @Expose
    private Long SlaveDelay;

    /**
    * Node priority. Value range: [0, 100]. A larger value indicates a higher priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Node voting right.
- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
    */
    @SerializedName("Votes")
    @Expose
    private Long Votes;

    /**
    * Node tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private NodeTag [] Tags;

    /**
    * Replica set ID.
    */
    @SerializedName("ReplicateSetId")
    @Expose
    private String ReplicateSetId;

    /**
     * Get Node AZ. 
     * @return Zone Node AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Node AZ.
     * @param Zone Node AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get Node access address. 
     * @return Address Node access address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Node access address.
     * @param Address Node access address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Public network access address (IP address or domain name) of the node. The example value is an IP address. 
     * @return WanServiceAddress Public network access address (IP address or domain name) of the node. The example value is an IP address.
     */
    public String getWanServiceAddress() {
        return this.WanServiceAddress;
    }

    /**
     * Set Public network access address (IP address or domain name) of the node. The example value is an IP address.
     * @param WanServiceAddress Public network access address (IP address or domain name) of the node. The example value is an IP address.
     */
    public void setWanServiceAddress(String WanServiceAddress) {
        this.WanServiceAddress = WanServiceAddress;
    }

    /**
     * Get Node role.
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node. 
     * @return Role Node role.
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node role.
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
     * @param Role Node role.
- PRIMARY: primary node.
- SECONDARY: secondary node.
- READONLY: read-only node.
- ARBITER: arbitration node.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Whether the node is a hidden node.
- true: a hidden node.
- false: not a hidden node. 
     * @return Hidden Whether the node is a hidden node.
- true: a hidden node.
- false: not a hidden node.
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set Whether the node is a hidden node.
- true: a hidden node.
- false: not a hidden node.
     * @param Hidden Whether the node is a hidden node.
- true: a hidden node.
- false: not a hidden node.
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get Node status.
- NORMAL: running normally.
- STARTUP: starting.
- STARTUP2: starting and processing the intermediate data.
- RECOVERING: recovering and not available.
- DOWN: offline.
- UNKNOWN: unknown status.
- ROLLBACK: rolling back.
- REMOVED: removed. 
     * @return Status Node status.
- NORMAL: running normally.
- STARTUP: starting.
- STARTUP2: starting and processing the intermediate data.
- RECOVERING: recovering and not available.
- DOWN: offline.
- UNKNOWN: unknown status.
- ROLLBACK: rolling back.
- REMOVED: removed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status.
- NORMAL: running normally.
- STARTUP: starting.
- STARTUP2: starting and processing the intermediate data.
- RECOVERING: recovering and not available.
- DOWN: offline.
- UNKNOWN: unknown status.
- ROLLBACK: rolling back.
- REMOVED: removed.
     * @param Status Node status.
- NORMAL: running normally.
- STARTUP: starting.
- STARTUP2: starting and processing the intermediate data.
- RECOVERING: recovering and not available.
- DOWN: offline.
- UNKNOWN: unknown status.
- ROLLBACK: rolling back.
- REMOVED: removed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Delay time of primary-secondary synchronization, in seconds. 
     * @return SlaveDelay Delay time of primary-secondary synchronization, in seconds.
     */
    public Long getSlaveDelay() {
        return this.SlaveDelay;
    }

    /**
     * Set Delay time of primary-secondary synchronization, in seconds.
     * @param SlaveDelay Delay time of primary-secondary synchronization, in seconds.
     */
    public void setSlaveDelay(Long SlaveDelay) {
        this.SlaveDelay = SlaveDelay;
    }

    /**
     * Get Node priority. Value range: [0, 100]. A larger value indicates a higher priority. 
     * @return Priority Node priority. Value range: [0, 100]. A larger value indicates a higher priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Node priority. Value range: [0, 100]. A larger value indicates a higher priority.
     * @param Priority Node priority. Value range: [0, 100]. A larger value indicates a higher priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Node voting right.
- 1: The node has the right to vote.
- 0: The node does not have the right to vote. 
     * @return Votes Node voting right.
- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
     */
    public Long getVotes() {
        return this.Votes;
    }

    /**
     * Set Node voting right.
- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
     * @param Votes Node voting right.
- 1: The node has the right to vote.
- 0: The node does not have the right to vote.
     */
    public void setVotes(Long Votes) {
        this.Votes = Votes;
    }

    /**
     * Get Node tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Node tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Node tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Node tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(NodeTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Replica set ID. 
     * @return ReplicateSetId Replica set ID.
     */
    public String getReplicateSetId() {
        return this.ReplicateSetId;
    }

    /**
     * Set Replica set ID.
     * @param ReplicateSetId Replica set ID.
     */
    public void setReplicateSetId(String ReplicateSetId) {
        this.ReplicateSetId = ReplicateSetId;
    }

    public NodeProperty() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeProperty(NodeProperty source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.WanServiceAddress != null) {
            this.WanServiceAddress = new String(source.WanServiceAddress);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Hidden != null) {
            this.Hidden = new Boolean(source.Hidden);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SlaveDelay != null) {
            this.SlaveDelay = new Long(source.SlaveDelay);
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
        if (source.ReplicateSetId != null) {
            this.ReplicateSetId = new String(source.ReplicateSetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "WanServiceAddress", this.WanServiceAddress);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Hidden", this.Hidden);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SlaveDelay", this.SlaveDelay);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Votes", this.Votes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ReplicateSetId", this.ReplicateSetId);

    }
}

