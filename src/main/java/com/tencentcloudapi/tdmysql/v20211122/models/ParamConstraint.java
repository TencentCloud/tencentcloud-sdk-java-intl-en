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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamConstraint extends AbstractModel {

    /**
    * Constraint type, for example enumeration, interval.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Lists the available options when the constraint type is enum.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enum")
    @Expose
    private String Enum;

    /**
    * Value range when the constraint type is section.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Range")
    @Expose
    private ConstraintRange Range;

    /**
    * Valid values when the constraint type is string.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("String")
    @Expose
    private String String;

    /**
     * Get Constraint type, for example enumeration, interval. 
     * @return Type Constraint type, for example enumeration, interval.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Constraint type, for example enumeration, interval.
     * @param Type Constraint type, for example enumeration, interval.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Lists the available options when the constraint type is enum.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enum Lists the available options when the constraint type is enum.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnum() {
        return this.Enum;
    }

    /**
     * Set Lists the available options when the constraint type is enum.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enum Lists the available options when the constraint type is enum.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnum(String Enum) {
        this.Enum = Enum;
    }

    /**
     * Get Value range when the constraint type is section.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Range Value range when the constraint type is section.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConstraintRange getRange() {
        return this.Range;
    }

    /**
     * Set Value range when the constraint type is section.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Range Value range when the constraint type is section.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRange(ConstraintRange Range) {
        this.Range = Range;
    }

    /**
     * Get Valid values when the constraint type is string.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return String Valid values when the constraint type is string.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getString() {
        return this.String;
    }

    /**
     * Set Valid values when the constraint type is string.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param String Valid values when the constraint type is string.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setString(String String) {
        this.String = String;
    }

    public ParamConstraint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamConstraint(ParamConstraint source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Enum != null) {
            this.Enum = new String(source.Enum);
        }
        if (source.Range != null) {
            this.Range = new ConstraintRange(source.Range);
        }
        if (source.String != null) {
            this.String = new String(source.String);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Enum", this.Enum);
        this.setParamObj(map, prefix + "Range.", this.Range);
        this.setParamSimple(map, prefix + "String", this.String);

    }
}

