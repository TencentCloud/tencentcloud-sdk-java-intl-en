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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessImageAsyncTaskInput extends AbstractModel {

    /**
    * Image asynchronous processing template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Extended parameters for asynchronous image processing.
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private ProcessImageAsyncInputExtendedParameter ExtendedParameter;

    /**
     * Get Image asynchronous processing template ID. 
     * @return Definition Image asynchronous processing template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Image asynchronous processing template ID.
     * @param Definition Image asynchronous processing template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Extended parameters for asynchronous image processing. 
     * @return ExtendedParameter Extended parameters for asynchronous image processing.
     */
    public ProcessImageAsyncInputExtendedParameter getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set Extended parameters for asynchronous image processing.
     * @param ExtendedParameter Extended parameters for asynchronous image processing.
     */
    public void setExtendedParameter(ProcessImageAsyncInputExtendedParameter ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public ProcessImageAsyncTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncTaskInput(ProcessImageAsyncTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtendedParameter != null) {
            this.ExtendedParameter = new ProcessImageAsyncInputExtendedParameter(source.ExtendedParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "ExtendedParameter.", this.ExtendedParameter);

    }
}

