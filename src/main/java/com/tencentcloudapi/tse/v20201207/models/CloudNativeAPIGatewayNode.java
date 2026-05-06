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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayNode extends AbstractModel {

    /**
    * Cloud-native gateway node id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node ip
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * Zone id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Node weight
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Default weight required or not
    */
    @SerializedName("IsDefaultWeight")
    @Expose
    private Boolean IsDefaultWeight;

    /**
     * Get Cloud-native gateway node id 
     * @return NodeId Cloud-native gateway node id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Cloud-native gateway node id
     * @param NodeId Cloud-native gateway node id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node ip 
     * @return NodeIp Node ip
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set Node ip
     * @param NodeIp Node ip
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get Zone id 
     * @return ZoneId Zone id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id
     * @param ZoneId Zone id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Zone 
     * @return Zone Zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Zone
     * @param Zone Zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get group ID 
     * @return GroupId group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set group ID
     * @param GroupId group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Group name 
     * @return GroupName Group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name
     * @param GroupName Group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Node weight 
     * @return Weight Node weight
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Node weight
     * @param Weight Node weight
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Default weight required or not 
     * @return IsDefaultWeight Default weight required or not
     */
    public Boolean getIsDefaultWeight() {
        return this.IsDefaultWeight;
    }

    /**
     * Set Default weight required or not
     * @param IsDefaultWeight Default weight required or not
     */
    public void setIsDefaultWeight(Boolean IsDefaultWeight) {
        this.IsDefaultWeight = IsDefaultWeight;
    }

    public CloudNativeAPIGatewayNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayNode(CloudNativeAPIGatewayNode source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.IsDefaultWeight != null) {
            this.IsDefaultWeight = new Boolean(source.IsDefaultWeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "IsDefaultWeight", this.IsDefaultWeight);

    }
}

