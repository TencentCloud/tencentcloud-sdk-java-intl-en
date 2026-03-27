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
    * Intent Implementation Approach, qa: Q&A response, doc: document-based response, workflow: workflow-based response, llm: LLM response
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Intent Implementation Approach Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Intent Implementation Approach, qa: Q&A response, doc: document-based response, workflow: workflow-based response, llm: LLM response 
     * @return Name Intent Implementation Approach, qa: Q&A response, doc: document-based response, workflow: workflow-based response, llm: LLM response
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Intent Implementation Approach, qa: Q&A response, doc: document-based response, workflow: workflow-based response, llm: LLM response
     * @param Name Intent Implementation Approach, qa: Q&A response, doc: document-based response, workflow: workflow-based response, llm: LLM response
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Intent Implementation Approach Description 
     * @return Desc Intent Implementation Approach Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Intent Implementation Approach Description
     * @param Desc Intent Implementation Approach Description
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

