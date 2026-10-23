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

public class CustomVariable extends AbstractModel {

    /**
    * <p>Variable name. You need to fill in the complete prefix: user.zone.* refers to a site-level custom variable, and user.rule.* refers to a rule-level custom variable. The custom part after the prefix supports only uppercase and lowercase letters, digits, and underscores. Variable names are case-sensitive and cannot exceed 50 characters in length. Once a variable is created successfully, its name cannot be modified.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Initial value of the variable. Supports the use of constant strings, variables, and formulas. Length cannot exceed 255 characters.</p>
    */
    @SerializedName("InitialValue")
    @Expose
    private String InitialValue;

    /**
    * <p>Variable description. Length limited to no more than 60 characters.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Variable name. You need to fill in the complete prefix: user.zone.* refers to a site-level custom variable, and user.rule.* refers to a rule-level custom variable. The custom part after the prefix supports only uppercase and lowercase letters, digits, and underscores. Variable names are case-sensitive and cannot exceed 50 characters in length. Once a variable is created successfully, its name cannot be modified.</p> 
     * @return Name <p>Variable name. You need to fill in the complete prefix: user.zone.* refers to a site-level custom variable, and user.rule.* refers to a rule-level custom variable. The custom part after the prefix supports only uppercase and lowercase letters, digits, and underscores. Variable names are case-sensitive and cannot exceed 50 characters in length. Once a variable is created successfully, its name cannot be modified.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Variable name. You need to fill in the complete prefix: user.zone.* refers to a site-level custom variable, and user.rule.* refers to a rule-level custom variable. The custom part after the prefix supports only uppercase and lowercase letters, digits, and underscores. Variable names are case-sensitive and cannot exceed 50 characters in length. Once a variable is created successfully, its name cannot be modified.</p>
     * @param Name <p>Variable name. You need to fill in the complete prefix: user.zone.* refers to a site-level custom variable, and user.rule.* refers to a rule-level custom variable. The custom part after the prefix supports only uppercase and lowercase letters, digits, and underscores. Variable names are case-sensitive and cannot exceed 50 characters in length. Once a variable is created successfully, its name cannot be modified.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Initial value of the variable. Supports the use of constant strings, variables, and formulas. Length cannot exceed 255 characters.</p> 
     * @return InitialValue <p>Initial value of the variable. Supports the use of constant strings, variables, and formulas. Length cannot exceed 255 characters.</p>
     */
    public String getInitialValue() {
        return this.InitialValue;
    }

    /**
     * Set <p>Initial value of the variable. Supports the use of constant strings, variables, and formulas. Length cannot exceed 255 characters.</p>
     * @param InitialValue <p>Initial value of the variable. Supports the use of constant strings, variables, and formulas. Length cannot exceed 255 characters.</p>
     */
    public void setInitialValue(String InitialValue) {
        this.InitialValue = InitialValue;
    }

    /**
     * Get <p>Variable description. Length limited to no more than 60 characters.</p> 
     * @return Description <p>Variable description. Length limited to no more than 60 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Variable description. Length limited to no more than 60 characters.</p>
     * @param Description <p>Variable description. Length limited to no more than 60 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CustomVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomVariable(CustomVariable source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InitialValue != null) {
            this.InitialValue = new String(source.InitialValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InitialValue", this.InitialValue);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

