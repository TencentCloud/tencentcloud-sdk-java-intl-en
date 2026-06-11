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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerGroup extends AbstractModel {

    /**
    * Consumer group name
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Status.

-Empty: The group has no members but has submitted offsets. All consumers left but retained offsets.
-Dead: The group has no members and no submitted offsets. The group is deleted or has long-term inactivity.
-Stable: Members in the group consume normally with balanced partition allocation. Normal operating status.
-PreparingRebalance: The group is preparing to rebalance. New members join or existing members leave.
-CompletingRebalance: The group is preparing to rebalance. New members join or existing members leave.

    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Partition allocation policy balancing algorithm name.

-Common load balancing algorithms are as follows:
-range: Allocate by partition range
-roundrobin: Poll-based allocation
-sticky: Sticky assignment (avoid unnecessary rebalance)
    */
    @SerializedName("ProtocolName")
    @Expose
    private String ProtocolName;

    /**
     * Get Consumer group name 
     * @return Group Consumer group name
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Consumer group name
     * @param Group Consumer group name
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Status.

-Empty: The group has no members but has submitted offsets. All consumers left but retained offsets.
-Dead: The group has no members and no submitted offsets. The group is deleted or has long-term inactivity.
-Stable: Members in the group consume normally with balanced partition allocation. Normal operating status.
-PreparingRebalance: The group is preparing to rebalance. New members join or existing members leave.
-CompletingRebalance: The group is preparing to rebalance. New members join or existing members leave.
 
     * @return State Status.

-Empty: The group has no members but has submitted offsets. All consumers left but retained offsets.
-Dead: The group has no members and no submitted offsets. The group is deleted or has long-term inactivity.
-Stable: Members in the group consume normally with balanced partition allocation. Normal operating status.
-PreparingRebalance: The group is preparing to rebalance. New members join or existing members leave.
-CompletingRebalance: The group is preparing to rebalance. New members join or existing members leave.

     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status.

-Empty: The group has no members but has submitted offsets. All consumers left but retained offsets.
-Dead: The group has no members and no submitted offsets. The group is deleted or has long-term inactivity.
-Stable: Members in the group consume normally with balanced partition allocation. Normal operating status.
-PreparingRebalance: The group is preparing to rebalance. New members join or existing members leave.
-CompletingRebalance: The group is preparing to rebalance. New members join or existing members leave.

     * @param State Status.

-Empty: The group has no members but has submitted offsets. All consumers left but retained offsets.
-Dead: The group has no members and no submitted offsets. The group is deleted or has long-term inactivity.
-Stable: Members in the group consume normally with balanced partition allocation. Normal operating status.
-PreparingRebalance: The group is preparing to rebalance. New members join or existing members leave.
-CompletingRebalance: The group is preparing to rebalance. New members join or existing members leave.

     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Partition allocation policy balancing algorithm name.

-Common load balancing algorithms are as follows:
-range: Allocate by partition range
-roundrobin: Poll-based allocation
-sticky: Sticky assignment (avoid unnecessary rebalance) 
     * @return ProtocolName Partition allocation policy balancing algorithm name.

-Common load balancing algorithms are as follows:
-range: Allocate by partition range
-roundrobin: Poll-based allocation
-sticky: Sticky assignment (avoid unnecessary rebalance)
     */
    public String getProtocolName() {
        return this.ProtocolName;
    }

    /**
     * Set Partition allocation policy balancing algorithm name.

-Common load balancing algorithms are as follows:
-range: Allocate by partition range
-roundrobin: Poll-based allocation
-sticky: Sticky assignment (avoid unnecessary rebalance)
     * @param ProtocolName Partition allocation policy balancing algorithm name.

-Common load balancing algorithms are as follows:
-range: Allocate by partition range
-roundrobin: Poll-based allocation
-sticky: Sticky assignment (avoid unnecessary rebalance)
     */
    public void setProtocolName(String ProtocolName) {
        this.ProtocolName = ProtocolName;
    }

    public ConsumerGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerGroup(ConsumerGroup source) {
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ProtocolName != null) {
            this.ProtocolName = new String(source.ProtocolName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ProtocolName", this.ProtocolName);

    }
}

