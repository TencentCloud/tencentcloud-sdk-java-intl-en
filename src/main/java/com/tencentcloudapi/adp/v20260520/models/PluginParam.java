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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginParam extends AbstractModel {

    /**
    * Whether to hide parameter configuration
    */
    @SerializedName("IsGlobalHidden")
    @Expose
    private Boolean IsGlobalHidden;

    /**
    * Whether the parameter is required
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * Parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Whether to hide parameter configuration 
     * @return IsGlobalHidden Whether to hide parameter configuration
     */
    public Boolean getIsGlobalHidden() {
        return this.IsGlobalHidden;
    }

    /**
     * Set Whether to hide parameter configuration
     * @param IsGlobalHidden Whether to hide parameter configuration
     */
    public void setIsGlobalHidden(Boolean IsGlobalHidden) {
        this.IsGlobalHidden = IsGlobalHidden;
    }

    /**
     * Get Whether the parameter is required 
     * @return IsRequired Whether the parameter is required
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set Whether the parameter is required
     * @param IsRequired Whether the parameter is required
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get Parameter name. 
     * @return Name Parameter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name.
     * @param Name Parameter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter value. 
     * @return Value Parameter value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Parameter value.
     * @param Value Parameter value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public PluginParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginParam(PluginParam source) {
        if (source.IsGlobalHidden != null) {
            this.IsGlobalHidden = new Boolean(source.IsGlobalHidden);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsGlobalHidden", this.IsGlobalHidden);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

