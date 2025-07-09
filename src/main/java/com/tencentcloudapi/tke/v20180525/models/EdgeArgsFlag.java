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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeArgsFlag extends AbstractModel {

    /**
    * Parameter name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter type
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Parameter description
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * Default value of the parameter
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Valid value or range. Options: `[]` (it indicates a range, for example, “[1, 5]” indicates the parameter must be equal or larger than 1, and be equal or smaller than 5), and `()` (it indicates a valid value, for example, “('aa', 'bb')” indicates the parameter must be “aa” or “bb”. If it is left empty, the verification can be skipped.)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Constraint")
    @Expose
    private String Constraint;

    /**
     * Get Parameter name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Name Parameter name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Name Parameter name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter type
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Type Parameter type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter type
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Type Parameter type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Parameter description
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Usage Parameter description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set Parameter description
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Usage Parameter description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Default value of the parameter
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Default Default value of the parameter
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Default value of the parameter
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Default Default value of the parameter
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get Valid value or range. Options: `[]` (it indicates a range, for example, “[1, 5]” indicates the parameter must be equal or larger than 1, and be equal or smaller than 5), and `()` (it indicates a valid value, for example, “('aa', 'bb')” indicates the parameter must be “aa” or “bb”. If it is left empty, the verification can be skipped.)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Constraint Valid value or range. Options: `[]` (it indicates a range, for example, “[1, 5]” indicates the parameter must be equal or larger than 1, and be equal or smaller than 5), and `()` (it indicates a valid value, for example, “('aa', 'bb')” indicates the parameter must be “aa” or “bb”. If it is left empty, the verification can be skipped.)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getConstraint() {
        return this.Constraint;
    }

    /**
     * Set Valid value or range. Options: `[]` (it indicates a range, for example, “[1, 5]” indicates the parameter must be equal or larger than 1, and be equal or smaller than 5), and `()` (it indicates a valid value, for example, “('aa', 'bb')” indicates the parameter must be “aa” or “bb”. If it is left empty, the verification can be skipped.)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Constraint Valid value or range. Options: `[]` (it indicates a range, for example, “[1, 5]” indicates the parameter must be equal or larger than 1, and be equal or smaller than 5), and `()` (it indicates a valid value, for example, “('aa', 'bb')” indicates the parameter must be “aa” or “bb”. If it is left empty, the verification can be skipped.)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setConstraint(String Constraint) {
        this.Constraint = Constraint;
    }

    public EdgeArgsFlag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeArgsFlag(EdgeArgsFlag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Constraint != null) {
            this.Constraint = new String(source.Constraint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Constraint", this.Constraint);

    }
}

