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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentAchievement extends AbstractModel {

    /**
    * Intent attainment method. `qa`: QA reply, `doc`: document reply, `workflow`: workflow reply, `llm`: large model reply.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the method to attain the intent
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Intent attainment method. `qa`: QA reply, `doc`: document reply, `workflow`: workflow reply, `llm`: large model reply. 
     * @return Name Intent attainment method. `qa`: QA reply, `doc`: document reply, `workflow`: workflow reply, `llm`: large model reply.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Intent attainment method. `qa`: QA reply, `doc`: document reply, `workflow`: workflow reply, `llm`: large model reply.
     * @param Name Intent attainment method. `qa`: QA reply, `doc`: document reply, `workflow`: workflow reply, `llm`: large model reply.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the method to attain the intent 
     * @return Desc Description of the method to attain the intent
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description of the method to attain the intent
     * @param Desc Description of the method to attain the intent
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public IntentAchievement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentAchievement(IntentAchievement source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

