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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleNetworkRequest extends AbstractModel{

    /**
    * Module ID
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Default outbound bandwidth cap
    */
    @SerializedName("DefaultBandwidth")
    @Expose
    private Long DefaultBandwidth;

    /**
    * Default inbound bandwidth cap
    */
    @SerializedName("DefaultBandwidthIn")
    @Expose
    private Long DefaultBandwidthIn;

    /**
     * Get Module ID 
     * @return ModuleId Module ID
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Module ID
     * @param ModuleId Module ID
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Default outbound bandwidth cap 
     * @return DefaultBandwidth Default outbound bandwidth cap
     */
    public Long getDefaultBandwidth() {
        return this.DefaultBandwidth;
    }

    /**
     * Set Default outbound bandwidth cap
     * @param DefaultBandwidth Default outbound bandwidth cap
     */
    public void setDefaultBandwidth(Long DefaultBandwidth) {
        this.DefaultBandwidth = DefaultBandwidth;
    }

    /**
     * Get Default inbound bandwidth cap 
     * @return DefaultBandwidthIn Default inbound bandwidth cap
     */
    public Long getDefaultBandwidthIn() {
        return this.DefaultBandwidthIn;
    }

    /**
     * Set Default inbound bandwidth cap
     * @param DefaultBandwidthIn Default inbound bandwidth cap
     */
    public void setDefaultBandwidthIn(Long DefaultBandwidthIn) {
        this.DefaultBandwidthIn = DefaultBandwidthIn;
    }

    public ModifyModuleNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleNetworkRequest(ModifyModuleNetworkRequest source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.DefaultBandwidth != null) {
            this.DefaultBandwidth = new Long(source.DefaultBandwidth);
        }
        if (source.DefaultBandwidthIn != null) {
            this.DefaultBandwidthIn = new Long(source.DefaultBandwidthIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "DefaultBandwidth", this.DefaultBandwidth);
        this.setParamSimple(map, prefix + "DefaultBandwidthIn", this.DefaultBandwidthIn);

    }
}

