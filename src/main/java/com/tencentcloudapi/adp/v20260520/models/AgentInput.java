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

public class AgentInput extends AbstractModel {

    /**
    * <p>Input source type: 0 user input, 3 custom variable (API parameter)</p>
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * <p>User handwriting input</p>
    */
    @SerializedName("UserInputValue")
    @Expose
    private AgentUserInputValue UserInputValue;

    /**
    * <p>System parameter</p>
    */
    @SerializedName("SystemVariable")
    @Expose
    private AgentSystemVariable SystemVariable;

    /**
    * <p>Custom Variable (API parameter)</p>
    */
    @SerializedName("CustomVariableId")
    @Expose
    private String CustomVariableId;

    /**
    * <p>Environment variable parameter</p>
    */
    @SerializedName("EnvVariableId")
    @Expose
    private String EnvVariableId;

    /**
    * <p>Application variable parameters</p>
    */
    @SerializedName("AppVariableId")
    @Expose
    private String AppVariableId;

    /**
     * Get <p>Input source type: 0 user input, 3 custom variable (API parameter)</p> 
     * @return InputType <p>Input source type: 0 user input, 3 custom variable (API parameter)</p>
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>Input source type: 0 user input, 3 custom variable (API parameter)</p>
     * @param InputType <p>Input source type: 0 user input, 3 custom variable (API parameter)</p>
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <p>User handwriting input</p> 
     * @return UserInputValue <p>User handwriting input</p>
     */
    public AgentUserInputValue getUserInputValue() {
        return this.UserInputValue;
    }

    /**
     * Set <p>User handwriting input</p>
     * @param UserInputValue <p>User handwriting input</p>
     */
    public void setUserInputValue(AgentUserInputValue UserInputValue) {
        this.UserInputValue = UserInputValue;
    }

    /**
     * Get <p>System parameter</p> 
     * @return SystemVariable <p>System parameter</p>
     */
    public AgentSystemVariable getSystemVariable() {
        return this.SystemVariable;
    }

    /**
     * Set <p>System parameter</p>
     * @param SystemVariable <p>System parameter</p>
     */
    public void setSystemVariable(AgentSystemVariable SystemVariable) {
        this.SystemVariable = SystemVariable;
    }

    /**
     * Get <p>Custom Variable (API parameter)</p> 
     * @return CustomVariableId <p>Custom Variable (API parameter)</p>
     */
    public String getCustomVariableId() {
        return this.CustomVariableId;
    }

    /**
     * Set <p>Custom Variable (API parameter)</p>
     * @param CustomVariableId <p>Custom Variable (API parameter)</p>
     */
    public void setCustomVariableId(String CustomVariableId) {
        this.CustomVariableId = CustomVariableId;
    }

    /**
     * Get <p>Environment variable parameter</p> 
     * @return EnvVariableId <p>Environment variable parameter</p>
     */
    public String getEnvVariableId() {
        return this.EnvVariableId;
    }

    /**
     * Set <p>Environment variable parameter</p>
     * @param EnvVariableId <p>Environment variable parameter</p>
     */
    public void setEnvVariableId(String EnvVariableId) {
        this.EnvVariableId = EnvVariableId;
    }

    /**
     * Get <p>Application variable parameters</p> 
     * @return AppVariableId <p>Application variable parameters</p>
     */
    public String getAppVariableId() {
        return this.AppVariableId;
    }

    /**
     * Set <p>Application variable parameters</p>
     * @param AppVariableId <p>Application variable parameters</p>
     */
    public void setAppVariableId(String AppVariableId) {
        this.AppVariableId = AppVariableId;
    }

    public AgentInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentInput(AgentInput source) {
        if (source.InputType != null) {
            this.InputType = new Long(source.InputType);
        }
        if (source.UserInputValue != null) {
            this.UserInputValue = new AgentUserInputValue(source.UserInputValue);
        }
        if (source.SystemVariable != null) {
            this.SystemVariable = new AgentSystemVariable(source.SystemVariable);
        }
        if (source.CustomVariableId != null) {
            this.CustomVariableId = new String(source.CustomVariableId);
        }
        if (source.EnvVariableId != null) {
            this.EnvVariableId = new String(source.EnvVariableId);
        }
        if (source.AppVariableId != null) {
            this.AppVariableId = new String(source.AppVariableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamObj(map, prefix + "UserInputValue.", this.UserInputValue);
        this.setParamObj(map, prefix + "SystemVariable.", this.SystemVariable);
        this.setParamSimple(map, prefix + "CustomVariableId", this.CustomVariableId);
        this.setParamSimple(map, prefix + "EnvVariableId", this.EnvVariableId);
        this.setParamSimple(map, prefix + "AppVariableId", this.AppVariableId);

    }
}

