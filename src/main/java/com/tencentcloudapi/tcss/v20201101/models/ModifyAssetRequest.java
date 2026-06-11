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

public class ModifyAssetRequest extends AbstractModel {

    /**
    * Synchronizes all regular nodes.
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * List of UUIDs of hosts to be synchronized. 
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Synchronizes all super nodes.
    */
    @SerializedName("AllSuperHost")
    @Expose
    private Boolean AllSuperHost;

    /**
    * Unique IDs of super nodes to be synchronized.
    */
    @SerializedName("NodeUniqueIds")
    @Expose
    private String [] NodeUniqueIds;

    /**
    * Timeout (in seconds). Minimum value: 3600.
    */
    @SerializedName("TimeoutSec")
    @Expose
    private Long TimeoutSec;

    /**
     * Get Synchronizes all regular nodes. 
     * @return All Synchronizes all regular nodes.
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Synchronizes all regular nodes.
     * @param All Synchronizes all regular nodes.
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get List of UUIDs of hosts to be synchronized.  
     * @return Hosts List of UUIDs of hosts to be synchronized. 
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set List of UUIDs of hosts to be synchronized. 
     * @param Hosts List of UUIDs of hosts to be synchronized. 
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Synchronizes all super nodes. 
     * @return AllSuperHost Synchronizes all super nodes.
     */
    public Boolean getAllSuperHost() {
        return this.AllSuperHost;
    }

    /**
     * Set Synchronizes all super nodes.
     * @param AllSuperHost Synchronizes all super nodes.
     */
    public void setAllSuperHost(Boolean AllSuperHost) {
        this.AllSuperHost = AllSuperHost;
    }

    /**
     * Get Unique IDs of super nodes to be synchronized. 
     * @return NodeUniqueIds Unique IDs of super nodes to be synchronized.
     */
    public String [] getNodeUniqueIds() {
        return this.NodeUniqueIds;
    }

    /**
     * Set Unique IDs of super nodes to be synchronized.
     * @param NodeUniqueIds Unique IDs of super nodes to be synchronized.
     */
    public void setNodeUniqueIds(String [] NodeUniqueIds) {
        this.NodeUniqueIds = NodeUniqueIds;
    }

    /**
     * Get Timeout (in seconds). Minimum value: 3600. 
     * @return TimeoutSec Timeout (in seconds). Minimum value: 3600.
     */
    public Long getTimeoutSec() {
        return this.TimeoutSec;
    }

    /**
     * Set Timeout (in seconds). Minimum value: 3600.
     * @param TimeoutSec Timeout (in seconds). Minimum value: 3600.
     */
    public void setTimeoutSec(Long TimeoutSec) {
        this.TimeoutSec = TimeoutSec;
    }

    public ModifyAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetRequest(ModifyAssetRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.AllSuperHost != null) {
            this.AllSuperHost = new Boolean(source.AllSuperHost);
        }
        if (source.NodeUniqueIds != null) {
            this.NodeUniqueIds = new String[source.NodeUniqueIds.length];
            for (int i = 0; i < source.NodeUniqueIds.length; i++) {
                this.NodeUniqueIds[i] = new String(source.NodeUniqueIds[i]);
            }
        }
        if (source.TimeoutSec != null) {
            this.TimeoutSec = new Long(source.TimeoutSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "AllSuperHost", this.AllSuperHost);
        this.setParamArraySimple(map, prefix + "NodeUniqueIds.", this.NodeUniqueIds);
        this.setParamSimple(map, prefix + "TimeoutSec", this.TimeoutSec);

    }
}

