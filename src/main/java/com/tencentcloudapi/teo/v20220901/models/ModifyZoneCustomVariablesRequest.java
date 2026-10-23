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

public class ModifyZoneCustomVariablesRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>List of site-level custom variables. CustomVariable.Name must use user.zone. as a prefix. Variables are initialized sequentially in array order. InitialValue can only reference variables before the current variable. It does not support referencing the current variable itself or variables after it.</p>
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * <p>Site-level custom variable calculation rules. The calculation supports references to defined site-level custom variables. This list currently only supports filling in one rule; additional entries are invalid.</p>
    */
    @SerializedName("CustomVariableOperations")
    @Expose
    private CustomVariableOperation [] CustomVariableOperations;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>List of site-level custom variables. CustomVariable.Name must use user.zone. as a prefix. Variables are initialized sequentially in array order. InitialValue can only reference variables before the current variable. It does not support referencing the current variable itself or variables after it.</p> 
     * @return CustomVariables <p>List of site-level custom variables. CustomVariable.Name must use user.zone. as a prefix. Variables are initialized sequentially in array order. InitialValue can only reference variables before the current variable. It does not support referencing the current variable itself or variables after it.</p>
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>List of site-level custom variables. CustomVariable.Name must use user.zone. as a prefix. Variables are initialized sequentially in array order. InitialValue can only reference variables before the current variable. It does not support referencing the current variable itself or variables after it.</p>
     * @param CustomVariables <p>List of site-level custom variables. CustomVariable.Name must use user.zone. as a prefix. Variables are initialized sequentially in array order. InitialValue can only reference variables before the current variable. It does not support referencing the current variable itself or variables after it.</p>
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>Site-level custom variable calculation rules. The calculation supports references to defined site-level custom variables. This list currently only supports filling in one rule; additional entries are invalid.</p> 
     * @return CustomVariableOperations <p>Site-level custom variable calculation rules. The calculation supports references to defined site-level custom variables. This list currently only supports filling in one rule; additional entries are invalid.</p>
     */
    public CustomVariableOperation [] getCustomVariableOperations() {
        return this.CustomVariableOperations;
    }

    /**
     * Set <p>Site-level custom variable calculation rules. The calculation supports references to defined site-level custom variables. This list currently only supports filling in one rule; additional entries are invalid.</p>
     * @param CustomVariableOperations <p>Site-level custom variable calculation rules. The calculation supports references to defined site-level custom variables. This list currently only supports filling in one rule; additional entries are invalid.</p>
     */
    public void setCustomVariableOperations(CustomVariableOperation [] CustomVariableOperations) {
        this.CustomVariableOperations = CustomVariableOperations;
    }

    public ModifyZoneCustomVariablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneCustomVariablesRequest(ModifyZoneCustomVariablesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
        if (source.CustomVariableOperations != null) {
            this.CustomVariableOperations = new CustomVariableOperation[source.CustomVariableOperations.length];
            for (int i = 0; i < source.CustomVariableOperations.length; i++) {
                this.CustomVariableOperations[i] = new CustomVariableOperation(source.CustomVariableOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamArrayObj(map, prefix + "CustomVariableOperations.", this.CustomVariableOperations);

    }
}

