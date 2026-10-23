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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomVariableOperationRuleAction extends AbstractModel {

    /**
    * <p>Operation name. The name should correspond to the parameter structure. For example, if Name=Set, SetParameters is required. Currently only support filling in Set.</p><li>Set: custom variable settings;</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Custom Variable parameter settings. If there are multiple operations in this parameter, they are executed in sequence according to the array order. When the value of Name is Set, this parameter is required.</p>
    */
    @SerializedName("SetParameters")
    @Expose
    private SetParameters SetParameters;

    /**
     * Get <p>Operation name. The name should correspond to the parameter structure. For example, if Name=Set, SetParameters is required. Currently only support filling in Set.</p><li>Set: custom variable settings;</li> 
     * @return Name <p>Operation name. The name should correspond to the parameter structure. For example, if Name=Set, SetParameters is required. Currently only support filling in Set.</p><li>Set: custom variable settings;</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Operation name. The name should correspond to the parameter structure. For example, if Name=Set, SetParameters is required. Currently only support filling in Set.</p><li>Set: custom variable settings;</li>
     * @param Name <p>Operation name. The name should correspond to the parameter structure. For example, if Name=Set, SetParameters is required. Currently only support filling in Set.</p><li>Set: custom variable settings;</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Custom Variable parameter settings. If there are multiple operations in this parameter, they are executed in sequence according to the array order. When the value of Name is Set, this parameter is required.</p> 
     * @return SetParameters <p>Custom Variable parameter settings. If there are multiple operations in this parameter, they are executed in sequence according to the array order. When the value of Name is Set, this parameter is required.</p>
     */
    public SetParameters getSetParameters() {
        return this.SetParameters;
    }

    /**
     * Set <p>Custom Variable parameter settings. If there are multiple operations in this parameter, they are executed in sequence according to the array order. When the value of Name is Set, this parameter is required.</p>
     * @param SetParameters <p>Custom Variable parameter settings. If there are multiple operations in this parameter, they are executed in sequence according to the array order. When the value of Name is Set, this parameter is required.</p>
     */
    public void setSetParameters(SetParameters SetParameters) {
        this.SetParameters = SetParameters;
    }

    public CustomVariableOperationRuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomVariableOperationRuleAction(CustomVariableOperationRuleAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SetParameters != null) {
            this.SetParameters = new SetParameters(source.SetParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "SetParameters.", this.SetParameters);

    }
}

