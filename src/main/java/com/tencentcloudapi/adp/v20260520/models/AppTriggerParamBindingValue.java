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

public class AppTriggerParamBindingValue extends AbstractModel {

    /**
    * <p>Parameter value</p>
    */
    @SerializedName("ParamValue")
    @Expose
    private String ParamValue;

    /**
    * <p>Application variable name</p>
    */
    @SerializedName("VariableName")
    @Expose
    private String VariableName;

    /**
     * Get <p>Parameter value</p> 
     * @return ParamValue <p>Parameter value</p>
     */
    public String getParamValue() {
        return this.ParamValue;
    }

    /**
     * Set <p>Parameter value</p>
     * @param ParamValue <p>Parameter value</p>
     */
    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }

    /**
     * Get <p>Application variable name</p> 
     * @return VariableName <p>Application variable name</p>
     */
    public String getVariableName() {
        return this.VariableName;
    }

    /**
     * Set <p>Application variable name</p>
     * @param VariableName <p>Application variable name</p>
     */
    public void setVariableName(String VariableName) {
        this.VariableName = VariableName;
    }

    public AppTriggerParamBindingValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerParamBindingValue(AppTriggerParamBindingValue source) {
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
        if (source.VariableName != null) {
            this.VariableName = new String(source.VariableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);
        this.setParamSimple(map, prefix + "VariableName", this.VariableName);

    }
}

