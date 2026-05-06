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

public class DeleteGovernanceLaneGroupsRequest extends AbstractModel {

    /**
    * Engine Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Lane group rule list
    */
    @SerializedName("LaneGroups")
    @Expose
    private DeleteGovernanceLaneGroup [] LaneGroups;

    /**
     * Get Engine Instance ID 
     * @return InstanceId Engine Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Engine Instance ID
     * @param InstanceId Engine Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Lane group rule list 
     * @return LaneGroups Lane group rule list
     */
    public DeleteGovernanceLaneGroup [] getLaneGroups() {
        return this.LaneGroups;
    }

    /**
     * Set Lane group rule list
     * @param LaneGroups Lane group rule list
     */
    public void setLaneGroups(DeleteGovernanceLaneGroup [] LaneGroups) {
        this.LaneGroups = LaneGroups;
    }

    public DeleteGovernanceLaneGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGovernanceLaneGroupsRequest(DeleteGovernanceLaneGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LaneGroups != null) {
            this.LaneGroups = new DeleteGovernanceLaneGroup[source.LaneGroups.length];
            for (int i = 0; i < source.LaneGroups.length; i++) {
                this.LaneGroups[i] = new DeleteGovernanceLaneGroup(source.LaneGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "LaneGroups.", this.LaneGroups);

    }
}

