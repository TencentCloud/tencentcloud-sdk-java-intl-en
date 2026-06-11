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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMachineRequest extends AbstractModel {

    /**
    * Agent UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Super Node Unique ID
    */
    @SerializedName("NodeUniqueIds")
    @Expose
    private String [] NodeUniqueIds;

    /**
    * UUID list
    */
    @SerializedName("UUIDs")
    @Expose
    private String [] UUIDs;

    /**
     * Get Agent UUID 
     * @return Uuid Agent UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Agent UUID
     * @param Uuid Agent UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Super Node Unique ID 
     * @return NodeUniqueIds Super Node Unique ID
     */
    public String [] getNodeUniqueIds() {
        return this.NodeUniqueIds;
    }

    /**
     * Set Super Node Unique ID
     * @param NodeUniqueIds Super Node Unique ID
     */
    public void setNodeUniqueIds(String [] NodeUniqueIds) {
        this.NodeUniqueIds = NodeUniqueIds;
    }

    /**
     * Get UUID list 
     * @return UUIDs UUID list
     */
    public String [] getUUIDs() {
        return this.UUIDs;
    }

    /**
     * Set UUID list
     * @param UUIDs UUID list
     */
    public void setUUIDs(String [] UUIDs) {
        this.UUIDs = UUIDs;
    }

    public DeleteMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMachineRequest(DeleteMachineRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.NodeUniqueIds != null) {
            this.NodeUniqueIds = new String[source.NodeUniqueIds.length];
            for (int i = 0; i < source.NodeUniqueIds.length; i++) {
                this.NodeUniqueIds[i] = new String(source.NodeUniqueIds[i]);
            }
        }
        if (source.UUIDs != null) {
            this.UUIDs = new String[source.UUIDs.length];
            for (int i = 0; i < source.UUIDs.length; i++) {
                this.UUIDs[i] = new String(source.UUIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamArraySimple(map, prefix + "NodeUniqueIds.", this.NodeUniqueIds);
        this.setParamArraySimple(map, prefix + "UUIDs.", this.UUIDs);

    }
}

