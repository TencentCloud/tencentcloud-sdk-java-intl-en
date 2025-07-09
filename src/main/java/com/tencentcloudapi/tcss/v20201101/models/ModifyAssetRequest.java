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
    * Sync all
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * List of servers to be synced. Either this parameter or `All` (preferred) must be selected.
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
     * Get Sync all 
     * @return All Sync all
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Sync all
     * @param All Sync all
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get List of servers to be synced. Either this parameter or `All` (preferred) must be selected. 
     * @return Hosts List of servers to be synced. Either this parameter or `All` (preferred) must be selected.
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set List of servers to be synced. Either this parameter or `All` (preferred) must be selected.
     * @param Hosts List of servers to be synced. Either this parameter or `All` (preferred) must be selected.
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);

    }
}

