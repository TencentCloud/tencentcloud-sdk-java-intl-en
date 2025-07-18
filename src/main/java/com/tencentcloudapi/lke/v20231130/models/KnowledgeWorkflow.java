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

public class KnowledgeWorkflow extends AbstractModel {

    /**
    * Whether to enable the workflow.
    */
    @SerializedName("IsEnabled")
    @Expose
    private Boolean IsEnabled;

    /**
    * Whether to enable PDL.
    */
    @SerializedName("UsePdl")
    @Expose
    private Boolean UsePdl;

    /**
     * Get Whether to enable the workflow. 
     * @return IsEnabled Whether to enable the workflow.
     */
    public Boolean getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether to enable the workflow.
     * @param IsEnabled Whether to enable the workflow.
     */
    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Whether to enable PDL. 
     * @return UsePdl Whether to enable PDL.
     */
    public Boolean getUsePdl() {
        return this.UsePdl;
    }

    /**
     * Set Whether to enable PDL.
     * @param UsePdl Whether to enable PDL.
     */
    public void setUsePdl(Boolean UsePdl) {
        this.UsePdl = UsePdl;
    }

    public KnowledgeWorkflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeWorkflow(KnowledgeWorkflow source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Boolean(source.IsEnabled);
        }
        if (source.UsePdl != null) {
            this.UsePdl = new Boolean(source.UsePdl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "UsePdl", this.UsePdl);

    }
}

