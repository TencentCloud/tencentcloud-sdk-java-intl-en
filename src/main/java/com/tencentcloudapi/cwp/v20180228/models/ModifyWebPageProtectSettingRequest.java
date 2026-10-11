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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebPageProtectSettingRequest extends AbstractModel {

    /**
    * Operation type required 1. Directory name 2. Protected file types
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * Submitted value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Corresponding protect_path configuration
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Operation type required 1. Directory name 2. Protected file types 
     * @return ModifyType Operation type required 1. Directory name 2. Protected file types
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Operation type required 1. Directory name 2. Protected file types
     * @param ModifyType Operation type required 1. Directory name 2. Protected file types
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get Submitted value 
     * @return Value Submitted value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Submitted value
     * @param Value Submitted value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Corresponding protect_path configuration 
     * @return Id Corresponding protect_path configuration
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Corresponding protect_path configuration
     * @param Id Corresponding protect_path configuration
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public ModifyWebPageProtectSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebPageProtectSettingRequest(ModifyWebPageProtectSettingRequest source) {
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

