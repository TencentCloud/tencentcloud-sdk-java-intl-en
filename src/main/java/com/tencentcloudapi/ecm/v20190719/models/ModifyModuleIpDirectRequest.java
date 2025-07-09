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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleIpDirectRequest extends AbstractModel {

    /**
    * Module ID.
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Whether to disable IP direct access. Valid values:
true: yes
false: no
    */
    @SerializedName("CloseIpDirect")
    @Expose
    private Boolean CloseIpDirect;

    /**
     * Get Module ID. 
     * @return ModuleId Module ID.
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Module ID.
     * @param ModuleId Module ID.
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Whether to disable IP direct access. Valid values:
true: yes
false: no 
     * @return CloseIpDirect Whether to disable IP direct access. Valid values:
true: yes
false: no
     */
    public Boolean getCloseIpDirect() {
        return this.CloseIpDirect;
    }

    /**
     * Set Whether to disable IP direct access. Valid values:
true: yes
false: no
     * @param CloseIpDirect Whether to disable IP direct access. Valid values:
true: yes
false: no
     */
    public void setCloseIpDirect(Boolean CloseIpDirect) {
        this.CloseIpDirect = CloseIpDirect;
    }

    public ModifyModuleIpDirectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleIpDirectRequest(ModifyModuleIpDirectRequest source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.CloseIpDirect != null) {
            this.CloseIpDirect = new Boolean(source.CloseIpDirect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "CloseIpDirect", this.CloseIpDirect);

    }
}

