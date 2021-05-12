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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecorderRequest extends AbstractModel{

    /**
    * Whether to select all currently supported resource types
    */
    @SerializedName("AllSupported")
    @Expose
    private Boolean AllSupported;

    /**
    * Whether to enable the recorder. Valid values: true (enable), false (disable).
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Recorder name after modification
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Whether to select all currently supported resource types 
     * @return AllSupported Whether to select all currently supported resource types
     */
    public Boolean getAllSupported() {
        return this.AllSupported;
    }

    /**
     * Set Whether to select all currently supported resource types
     * @param AllSupported Whether to select all currently supported resource types
     */
    public void setAllSupported(Boolean AllSupported) {
        this.AllSupported = AllSupported;
    }

    /**
     * Get Whether to enable the recorder. Valid values: true (enable), false (disable). 
     * @return Enable Whether to enable the recorder. Valid values: true (enable), false (disable).
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable the recorder. Valid values: true (enable), false (disable).
     * @param Enable Whether to enable the recorder. Valid values: true (enable), false (disable).
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Recorder name after modification 
     * @return Name Recorder name after modification
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Recorder name after modification
     * @param Name Recorder name after modification
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public UpdateRecorderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecorderRequest(UpdateRecorderRequest source) {
        if (source.AllSupported != null) {
            this.AllSupported = new Boolean(source.AllSupported);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllSupported", this.AllSupported);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

