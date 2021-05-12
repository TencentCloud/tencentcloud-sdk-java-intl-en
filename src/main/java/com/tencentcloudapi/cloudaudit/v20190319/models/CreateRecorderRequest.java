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

public class CreateRecorderRequest extends AbstractModel{

    /**
    * Role name authorized to CFA
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Whether to select all supported resource types. Valid values: true (default), false.
    */
    @SerializedName("AllSupported")
    @Expose
    private Boolean AllSupported;

    /**
    * Whether to enable the resource recorder. Valid values: true (default), false.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Resource recorder name. Default name: default.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Role name authorized to CFA 
     * @return Role Role name authorized to CFA
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role name authorized to CFA
     * @param Role Role name authorized to CFA
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Whether to select all supported resource types. Valid values: true (default), false. 
     * @return AllSupported Whether to select all supported resource types. Valid values: true (default), false.
     */
    public Boolean getAllSupported() {
        return this.AllSupported;
    }

    /**
     * Set Whether to select all supported resource types. Valid values: true (default), false.
     * @param AllSupported Whether to select all supported resource types. Valid values: true (default), false.
     */
    public void setAllSupported(Boolean AllSupported) {
        this.AllSupported = AllSupported;
    }

    /**
     * Get Whether to enable the resource recorder. Valid values: true (default), false. 
     * @return Enable Whether to enable the resource recorder. Valid values: true (default), false.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable the resource recorder. Valid values: true (default), false.
     * @param Enable Whether to enable the resource recorder. Valid values: true (default), false.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Resource recorder name. Default name: default. 
     * @return Name Resource recorder name. Default name: default.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Resource recorder name. Default name: default.
     * @param Name Resource recorder name. Default name: default.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateRecorderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecorderRequest(CreateRecorderRequest source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
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
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "AllSupported", this.AllSupported);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

