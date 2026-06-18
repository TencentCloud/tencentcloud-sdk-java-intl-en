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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficRuleState extends AbstractModel {

    /**
    * <p>Sandbox plug-in module name</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>Sandbox rule status</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Sandbox plug-in module name</p> 
     * @return Module <p>Sandbox plug-in module name</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>Sandbox plug-in module name</p>
     * @param Module <p>Sandbox plug-in module name</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>Sandbox rule status</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul> 
     * @return Status <p>Sandbox rule status</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Sandbox rule status</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
     * @param Status <p>Sandbox rule status</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public TrafficRuleState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficRuleState(TrafficRuleState source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

