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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfoResponse extends AbstractModel {

    /**
    * Error code. 0: success
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * Group status description (common valid values: Empty, Stable, Dead):
Dead: the consumer group does not exist
Empty: there are currently no consumer subscriptions in the consumer group
PreparingRebalance: the consumer group is currently in `rebalance` state
CompletingRebalance: the consumer group is currently in `rebalance` state
Stable: each consumer in the consumer group has joined and is in stable state
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * The type of protocol selected by the consumer group, which is `consumer` for common consumers. However, some systems use their own protocols; for example, the protocol used by kafka-connect is `connect`. Only with the standard `consumer` protocol can this API get to know the specific assigning method and parse the specific partition assignment
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * Consumer partition assignment algorithm, such as `range` (which is the default value for the Kafka consumer SDK), `roundrobin`, and `sticky`
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * This array contains information only if `state` is `Stable` and `protocol_type` is `consumer`
    */
    @SerializedName("Members")
    @Expose
    private GroupInfoMember [] Members;

    /**
    * Kafka consumer group
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
     * Get Error code. 0: success 
     * @return ErrorCode Error code. 0: success
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Error code. 0: success
     * @param ErrorCode Error code. 0: success
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Group status description (common valid values: Empty, Stable, Dead):
Dead: the consumer group does not exist
Empty: there are currently no consumer subscriptions in the consumer group
PreparingRebalance: the consumer group is currently in `rebalance` state
CompletingRebalance: the consumer group is currently in `rebalance` state
Stable: each consumer in the consumer group has joined and is in stable state 
     * @return State Group status description (common valid values: Empty, Stable, Dead):
Dead: the consumer group does not exist
Empty: there are currently no consumer subscriptions in the consumer group
PreparingRebalance: the consumer group is currently in `rebalance` state
CompletingRebalance: the consumer group is currently in `rebalance` state
Stable: each consumer in the consumer group has joined and is in stable state
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Group status description (common valid values: Empty, Stable, Dead):
Dead: the consumer group does not exist
Empty: there are currently no consumer subscriptions in the consumer group
PreparingRebalance: the consumer group is currently in `rebalance` state
CompletingRebalance: the consumer group is currently in `rebalance` state
Stable: each consumer in the consumer group has joined and is in stable state
     * @param State Group status description (common valid values: Empty, Stable, Dead):
Dead: the consumer group does not exist
Empty: there are currently no consumer subscriptions in the consumer group
PreparingRebalance: the consumer group is currently in `rebalance` state
CompletingRebalance: the consumer group is currently in `rebalance` state
Stable: each consumer in the consumer group has joined and is in stable state
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get The type of protocol selected by the consumer group, which is `consumer` for common consumers. However, some systems use their own protocols; for example, the protocol used by kafka-connect is `connect`. Only with the standard `consumer` protocol can this API get to know the specific assigning method and parse the specific partition assignment 
     * @return ProtocolType The type of protocol selected by the consumer group, which is `consumer` for common consumers. However, some systems use their own protocols; for example, the protocol used by kafka-connect is `connect`. Only with the standard `consumer` protocol can this API get to know the specific assigning method and parse the specific partition assignment
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set The type of protocol selected by the consumer group, which is `consumer` for common consumers. However, some systems use their own protocols; for example, the protocol used by kafka-connect is `connect`. Only with the standard `consumer` protocol can this API get to know the specific assigning method and parse the specific partition assignment
     * @param ProtocolType The type of protocol selected by the consumer group, which is `consumer` for common consumers. However, some systems use their own protocols; for example, the protocol used by kafka-connect is `connect`. Only with the standard `consumer` protocol can this API get to know the specific assigning method and parse the specific partition assignment
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get Consumer partition assignment algorithm, such as `range` (which is the default value for the Kafka consumer SDK), `roundrobin`, and `sticky` 
     * @return Protocol Consumer partition assignment algorithm, such as `range` (which is the default value for the Kafka consumer SDK), `roundrobin`, and `sticky`
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Consumer partition assignment algorithm, such as `range` (which is the default value for the Kafka consumer SDK), `roundrobin`, and `sticky`
     * @param Protocol Consumer partition assignment algorithm, such as `range` (which is the default value for the Kafka consumer SDK), `roundrobin`, and `sticky`
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get This array contains information only if `state` is `Stable` and `protocol_type` is `consumer` 
     * @return Members This array contains information only if `state` is `Stable` and `protocol_type` is `consumer`
     */
    public GroupInfoMember [] getMembers() {
        return this.Members;
    }

    /**
     * Set This array contains information only if `state` is `Stable` and `protocol_type` is `consumer`
     * @param Members This array contains information only if `state` is `Stable` and `protocol_type` is `consumer`
     */
    public void setMembers(GroupInfoMember [] Members) {
        this.Members = Members;
    }

    /**
     * Get Kafka consumer group 
     * @return Group Kafka consumer group
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Kafka consumer group
     * @param Group Kafka consumer group
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    public GroupInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfoResponse(GroupInfoResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Members != null) {
            this.Members = new GroupInfoMember[source.Members.length];
            for (int i = 0; i < source.Members.length; i++) {
                this.Members[i] = new GroupInfoMember(source.Members[i]);
            }
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);
        this.setParamSimple(map, prefix + "Group", this.Group);

    }
}

