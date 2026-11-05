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

public class RoleConfig extends AbstractModel {

    /**
    * Role description.
    */
    @SerializedName("RoleDescription")
    @Expose
    private String RoleDescription;

    /**
     * Get Role description. 
     * @return RoleDescription Role description.
     */
    public String getRoleDescription() {
        return this.RoleDescription;
    }

    /**
     * Set Role description.
     * @param RoleDescription Role description.
     */
    public void setRoleDescription(String RoleDescription) {
        this.RoleDescription = RoleDescription;
    }

    public RoleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleConfig(RoleConfig source) {
        if (source.RoleDescription != null) {
            this.RoleDescription = new String(source.RoleDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleDescription", this.RoleDescription);

    }
}

