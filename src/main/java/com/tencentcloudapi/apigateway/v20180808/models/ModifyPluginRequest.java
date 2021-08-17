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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPluginRequest extends AbstractModel{

    /**
    * ID of the plugin to be modified
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * Plugin name to be modified. A plugin name can contain up to 50 characters out of `a-z`, `A-Z`, `0-9`, and `_`, which must begin with a letter and end with a letter or a number.
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * Plugin description to be modified. A description is within 200 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Plugin definition statement to be modified. The json format is supported.
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
     * Get ID of the plugin to be modified 
     * @return PluginId ID of the plugin to be modified
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set ID of the plugin to be modified
     * @param PluginId ID of the plugin to be modified
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get Plugin name to be modified. A plugin name can contain up to 50 characters out of `a-z`, `A-Z`, `0-9`, and `_`, which must begin with a letter and end with a letter or a number. 
     * @return PluginName Plugin name to be modified. A plugin name can contain up to 50 characters out of `a-z`, `A-Z`, `0-9`, and `_`, which must begin with a letter and end with a letter or a number.
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set Plugin name to be modified. A plugin name can contain up to 50 characters out of `a-z`, `A-Z`, `0-9`, and `_`, which must begin with a letter and end with a letter or a number.
     * @param PluginName Plugin name to be modified. A plugin name can contain up to 50 characters out of `a-z`, `A-Z`, `0-9`, and `_`, which must begin with a letter and end with a letter or a number.
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get Plugin description to be modified. A description is within 200 characters. 
     * @return Description Plugin description to be modified. A description is within 200 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Plugin description to be modified. A description is within 200 characters.
     * @param Description Plugin description to be modified. A description is within 200 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Plugin definition statement to be modified. The json format is supported. 
     * @return PluginData Plugin definition statement to be modified. The json format is supported.
     */
    public String getPluginData() {
        return this.PluginData;
    }

    /**
     * Set Plugin definition statement to be modified. The json format is supported.
     * @param PluginData Plugin definition statement to be modified. The json format is supported.
     */
    public void setPluginData(String PluginData) {
        this.PluginData = PluginData;
    }

    public ModifyPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPluginRequest(ModifyPluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PluginData != null) {
            this.PluginData = new String(source.PluginData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);

    }
}

