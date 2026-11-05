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

public class AgentSystemVariable extends AbstractModel {

    /**
    * <p>System parameter name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Configuration of dialogue history rounds; used only when Input is "dialogue history" in system variables;</p>
    */
    @SerializedName("DialogHistoryLimit")
    @Expose
    private Long DialogHistoryLimit;

    /**
     * Get <p>System parameter name</p> 
     * @return Name <p>System parameter name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>System parameter name</p>
     * @param Name <p>System parameter name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Configuration of dialogue history rounds; used only when Input is "dialogue history" in system variables;</p> 
     * @return DialogHistoryLimit <p>Configuration of dialogue history rounds; used only when Input is "dialogue history" in system variables;</p>
     */
    public Long getDialogHistoryLimit() {
        return this.DialogHistoryLimit;
    }

    /**
     * Set <p>Configuration of dialogue history rounds; used only when Input is "dialogue history" in system variables;</p>
     * @param DialogHistoryLimit <p>Configuration of dialogue history rounds; used only when Input is "dialogue history" in system variables;</p>
     */
    public void setDialogHistoryLimit(Long DialogHistoryLimit) {
        this.DialogHistoryLimit = DialogHistoryLimit;
    }

    public AgentSystemVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSystemVariable(AgentSystemVariable source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DialogHistoryLimit != null) {
            this.DialogHistoryLimit = new Long(source.DialogHistoryLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DialogHistoryLimit", this.DialogHistoryLimit);

    }
}

