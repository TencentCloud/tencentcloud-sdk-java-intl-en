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

public class ModifyModuleDisableWanIpRequest extends AbstractModel{

    /**
    * Module ID
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Whether to prohibit public IP assignment. Valid values: true: no; false: yes.
    */
    @SerializedName("DisableWanIp")
    @Expose
    private Boolean DisableWanIp;

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
     * Get Whether to prohibit public IP assignment. Valid values: true: no; false: yes. 
     * @return DisableWanIp Whether to prohibit public IP assignment. Valid values: true: no; false: yes.
     */
    public Boolean getDisableWanIp() {
        return this.DisableWanIp;
    }

    /**
     * Set Whether to prohibit public IP assignment. Valid values: true: no; false: yes.
     * @param DisableWanIp Whether to prohibit public IP assignment. Valid values: true: no; false: yes.
     */
    public void setDisableWanIp(Boolean DisableWanIp) {
        this.DisableWanIp = DisableWanIp;
    }

    public ModifyModuleDisableWanIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleDisableWanIpRequest(ModifyModuleDisableWanIpRequest source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.DisableWanIp != null) {
            this.DisableWanIp = new Boolean(source.DisableWanIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "DisableWanIp", this.DisableWanIp);

    }
}

