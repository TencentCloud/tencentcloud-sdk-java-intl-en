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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePluginRequest extends AbstractModel {

    /**
    * ID of the plugin to be deleted
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
     * Get ID of the plugin to be deleted 
     * @return PluginId ID of the plugin to be deleted
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set ID of the plugin to be deleted
     * @param PluginId ID of the plugin to be deleted
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    public DeletePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePluginRequest(DeletePluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);

    }
}

