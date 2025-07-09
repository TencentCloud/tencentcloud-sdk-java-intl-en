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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Transform extends AbstractModel {

    /**
    * Describes how to transform data
    */
    @SerializedName("OutputStructs")
    @Expose
    private OutputStructParam [] OutputStructs;

    /**
     * Get Describes how to transform data 
     * @return OutputStructs Describes how to transform data
     */
    public OutputStructParam [] getOutputStructs() {
        return this.OutputStructs;
    }

    /**
     * Set Describes how to transform data
     * @param OutputStructs Describes how to transform data
     */
    public void setOutputStructs(OutputStructParam [] OutputStructs) {
        this.OutputStructs = OutputStructs;
    }

    public Transform() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Transform(Transform source) {
        if (source.OutputStructs != null) {
            this.OutputStructs = new OutputStructParam[source.OutputStructs.length];
            for (int i = 0; i < source.OutputStructs.length; i++) {
                this.OutputStructs[i] = new OutputStructParam(source.OutputStructs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OutputStructs.", this.OutputStructs);

    }
}

