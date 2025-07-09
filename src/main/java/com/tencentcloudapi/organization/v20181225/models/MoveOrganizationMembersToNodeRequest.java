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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveOrganizationMembersToNodeRequest extends AbstractModel {

    /**
    * Organizational unit ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Member UIN list
    */
    @SerializedName("Uins")
    @Expose
    private Long [] Uins;

    /**
     * Get Organizational unit ID 
     * @return NodeId Organizational unit ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Organizational unit ID
     * @param NodeId Organizational unit ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Member UIN list 
     * @return Uins Member UIN list
     */
    public Long [] getUins() {
        return this.Uins;
    }

    /**
     * Set Member UIN list
     * @param Uins Member UIN list
     */
    public void setUins(Long [] Uins) {
        this.Uins = Uins;
    }

    public MoveOrganizationMembersToNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MoveOrganizationMembersToNodeRequest(MoveOrganizationMembersToNodeRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.Uins != null) {
            this.Uins = new Long[source.Uins.length];
            for (int i = 0; i < source.Uins.length; i++) {
                this.Uins[i] = new Long(source.Uins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamArraySimple(map, prefix + "Uins.", this.Uins);

    }
}

