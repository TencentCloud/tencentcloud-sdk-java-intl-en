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

public class CheckTransformationRequest extends AbstractModel {

    /**
    * JSON string to be processed
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * Transformation rule list
    */
    @SerializedName("Transformations")
    @Expose
    private Transformation [] Transformations;

    /**
     * Get JSON string to be processed 
     * @return Input JSON string to be processed
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set JSON string to be processed
     * @param Input JSON string to be processed
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get Transformation rule list 
     * @return Transformations Transformation rule list
     */
    public Transformation [] getTransformations() {
        return this.Transformations;
    }

    /**
     * Set Transformation rule list
     * @param Transformations Transformation rule list
     */
    public void setTransformations(Transformation [] Transformations) {
        this.Transformations = Transformations;
    }

    public CheckTransformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckTransformationRequest(CheckTransformationRequest source) {
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Transformations != null) {
            this.Transformations = new Transformation[source.Transformations.length];
            for (int i = 0; i < source.Transformations.length; i++) {
                this.Transformations[i] = new Transformation(source.Transformations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamArrayObj(map, prefix + "Transformations.", this.Transformations);

    }
}

