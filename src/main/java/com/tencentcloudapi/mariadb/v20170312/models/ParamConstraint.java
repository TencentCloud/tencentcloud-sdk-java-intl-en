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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamConstraint extends AbstractModel {

    /**
    * Constraint type, such as `enum` and `section`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * List of valid values when constraint type is `enum`
    */
    @SerializedName("Enum")
    @Expose
    private String Enum;

    /**
    * Range when constraint type is `section`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Range")
    @Expose
    private ConstraintRange Range;

    /**
    * List of valid values when constraint type is `string`
    */
    @SerializedName("String")
    @Expose
    private String String;

    /**
     * Get Constraint type, such as `enum` and `section`. 
     * @return Type Constraint type, such as `enum` and `section`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Constraint type, such as `enum` and `section`.
     * @param Type Constraint type, such as `enum` and `section`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get List of valid values when constraint type is `enum` 
     * @return Enum List of valid values when constraint type is `enum`
     */
    public String getEnum() {
        return this.Enum;
    }

    /**
     * Set List of valid values when constraint type is `enum`
     * @param Enum List of valid values when constraint type is `enum`
     */
    public void setEnum(String Enum) {
        this.Enum = Enum;
    }

    /**
     * Get Range when constraint type is `section`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Range Range when constraint type is `section`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConstraintRange getRange() {
        return this.Range;
    }

    /**
     * Set Range when constraint type is `section`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Range Range when constraint type is `section`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRange(ConstraintRange Range) {
        this.Range = Range;
    }

    /**
     * Get List of valid values when constraint type is `string` 
     * @return String List of valid values when constraint type is `string`
     */
    public String getString() {
        return this.String;
    }

    /**
     * Set List of valid values when constraint type is `string`
     * @param String List of valid values when constraint type is `string`
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

