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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfoMember extends AbstractModel{

    /**
    * Unique ID generated for consumer in consumer group by coordinator
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * `client.id` information by the client consumer SDK
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Generally stores client IP address
    */
    @SerializedName("ClientHost")
    @Expose
    private String ClientHost;

    /**
    * Stores the information of partition assigned to this consumer
    */
    @SerializedName("Assignment")
    @Expose
    private Assignment Assignment;

    /**
     * Get Unique ID generated for consumer in consumer group by coordinator 
     * @return MemberId Unique ID generated for consumer in consumer group by coordinator
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Unique ID generated for consumer in consumer group by coordinator
     * @param MemberId Unique ID generated for consumer in consumer group by coordinator
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get `client.id` information by the client consumer SDK 
     * @return ClientId `client.id` information by the client consumer SDK
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set `client.id` information by the client consumer SDK
     * @param ClientId `client.id` information by the client consumer SDK
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Generally stores client IP address 
     * @return ClientHost Generally stores client IP address
     */
    public String getClientHost() {
        return this.ClientHost;
    }

    /**
     * Set Generally stores client IP address
     * @param ClientHost Generally stores client IP address
     */
    public void setClientHost(String ClientHost) {
        this.ClientHost = ClientHost;
    }

    /**
     * Get Stores the information of partition assigned to this consumer 
     * @return Assignment Stores the information of partition assigned to this consumer
     */
    public Assignment getAssignment() {
        return this.Assignment;
    }

    /**
     * Set Stores the information of partition assigned to this consumer
     * @param Assignment Stores the information of partition assigned to this consumer
     */
    public void setAssignment(Assignment Assignment) {
        this.Assignment = Assignment;
    }

    public GroupInfoMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfoMember(GroupInfoMember source) {
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientHost != null) {
            this.ClientHost = new String(source.ClientHost);
        }
        if (source.Assignment != null) {
            this.Assignment = new Assignment(source.Assignment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientHost", this.ClientHost);
        this.setParamObj(map, prefix + "Assignment.", this.Assignment);

    }
}

