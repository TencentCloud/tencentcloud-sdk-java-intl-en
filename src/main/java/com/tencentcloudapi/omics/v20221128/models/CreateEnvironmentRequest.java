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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnvironmentRequest extends AbstractModel {

    /**
    * Environment name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Environment configuration information
    */
    @SerializedName("Config")
    @Expose
    private EnvironmentConfig Config;

    /**
    * Environment description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether it is the default environment.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get Environment name 
     * @return Name Environment name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Environment name
     * @param Name Environment name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Environment configuration information 
     * @return Config Environment configuration information
     */
    public EnvironmentConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Environment configuration information
     * @param Config Environment configuration information
     */
    public void setConfig(EnvironmentConfig Config) {
        this.Config = Config;
    }

    /**
     * Get Environment description 
     * @return Description Environment description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Environment description
     * @param Description Environment description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether it is the default environment. 
     * @return IsDefault Whether it is the default environment.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default environment.
     * @param IsDefault Whether it is the default environment.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public CreateEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnvironmentRequest(CreateEnvironmentRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Config != null) {
            this.Config = new EnvironmentConfig(source.Config);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

