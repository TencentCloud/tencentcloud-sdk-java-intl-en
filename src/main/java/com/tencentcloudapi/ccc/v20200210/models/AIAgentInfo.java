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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAgentInfo extends AbstractModel {

    /**
    * Intelligent agent ID.
    */
    @SerializedName("AIAgentId")
    @Expose
    private Long AIAgentId;

    /**
    * Intelligent agent name.
    */
    @SerializedName("AIAgentName")
    @Expose
    private String AIAgentName;

    /**
     * Get Intelligent agent ID. 
     * @return AIAgentId Intelligent agent ID.
     */
    public Long getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * Set Intelligent agent ID.
     * @param AIAgentId Intelligent agent ID.
     */
    public void setAIAgentId(Long AIAgentId) {
        this.AIAgentId = AIAgentId;
    }

    /**
     * Get Intelligent agent name. 
     * @return AIAgentName Intelligent agent name.
     */
    public String getAIAgentName() {
        return this.AIAgentName;
    }

    /**
     * Set Intelligent agent name.
     * @param AIAgentName Intelligent agent name.
     */
    public void setAIAgentName(String AIAgentName) {
        this.AIAgentName = AIAgentName;
    }

    public AIAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentInfo(AIAgentInfo source) {
        if (source.AIAgentId != null) {
            this.AIAgentId = new Long(source.AIAgentId);
        }
        if (source.AIAgentName != null) {
            this.AIAgentName = new String(source.AIAgentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AIAgentId", this.AIAgentId);
        this.setParamSimple(map, prefix + "AIAgentName", this.AIAgentName);

    }
}

