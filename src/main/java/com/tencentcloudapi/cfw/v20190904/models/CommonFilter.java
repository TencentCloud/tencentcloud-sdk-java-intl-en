/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonFilter extends AbstractModel{

    /**
    * Search key.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Search values.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Enum of integers that represent relations between Name and Values.
enum FilterOperatorType {
    // Invalid
    FILTER_OPERATOR_TYPE_INVALID = 0;
    // Equal to
    FILTER_OPERATOR_TYPE_EQUAL = 1;
    // Greater than
    FILTER_OPERATOR_TYPE_GREATER = 2;
    // Less than
    FILTER_OPERATOR_TYPE_LESS = 3;
    // Greater than or equal to
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
    // Less than or equal to
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
    // Not equal to
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    // In (contained in the array)
    FILTER_OPERATOR_TYPE_IN = 7;
    // Not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
    // Fuzzily matched
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
    // Existing
    FILTER_OPERATOR_TYPE_EXIST = 10;
    // Not existing
    FILTER_OPERATOR_TYPE_NOT_EXIST = 11;
    // Regular
    FILTER_OPERATOR_TYPE_REGULAR = 12;
}
    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
     * Get Search key. 
     * @return Name Search key.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Search key.
     * @param Name Search key.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Search values. 
     * @return Values Search values.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Search values.
     * @param Values Search values.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Enum of integers that represent relations between Name and Values.
enum FilterOperatorType {
    // Invalid
    FILTER_OPERATOR_TYPE_INVALID = 0;
    // Equal to
    FILTER_OPERATOR_TYPE_EQUAL = 1;
    // Greater than
    FILTER_OPERATOR_TYPE_GREATER = 2;
    // Less than
    FILTER_OPERATOR_TYPE_LESS = 3;
    // Greater than or equal to
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
    // Less than or equal to
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
    // Not equal to
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    // In (contained in the array)
    FILTER_OPERATOR_TYPE_IN = 7;
    // Not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
    // Fuzzily matched
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
    // Existing
    FILTER_OPERATOR_TYPE_EXIST = 10;
    // Not existing
    FILTER_OPERATOR_TYPE_NOT_EXIST = 11;
    // Regular
    FILTER_OPERATOR_TYPE_REGULAR = 12;
} 
     * @return OperatorType Enum of integers that represent relations between Name and Values.
enum FilterOperatorType {
    // Invalid
    FILTER_OPERATOR_TYPE_INVALID = 0;
    // Equal to
    FILTER_OPERATOR_TYPE_EQUAL = 1;
    // Greater than
    FILTER_OPERATOR_TYPE_GREATER = 2;
    // Less than
    FILTER_OPERATOR_TYPE_LESS = 3;
    // Greater than or equal to
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
    // Less than or equal to
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
    // Not equal to
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    // In (contained in the array)
    FILTER_OPERATOR_TYPE_IN = 7;
    // Not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
    // Fuzzily matched
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
    // Existing
    FILTER_OPERATOR_TYPE_EXIST = 10;
    // Not existing
    FILTER_OPERATOR_TYPE_NOT_EXIST = 11;
    // Regular
    FILTER_OPERATOR_TYPE_REGULAR = 12;
}
     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set Enum of integers that represent relations between Name and Values.
enum FilterOperatorType {
    // Invalid
    FILTER_OPERATOR_TYPE_INVALID = 0;
    // Equal to
    FILTER_OPERATOR_TYPE_EQUAL = 1;
    // Greater than
    FILTER_OPERATOR_TYPE_GREATER = 2;
    // Less than
    FILTER_OPERATOR_TYPE_LESS = 3;
    // Greater than or equal to
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
    // Less than or equal to
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
    // Not equal to
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    // In (contained in the array)
    FILTER_OPERATOR_TYPE_IN = 7;
    // Not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
    // Fuzzily matched
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
    // Existing
    FILTER_OPERATOR_TYPE_EXIST = 10;
    // Not existing
    FILTER_OPERATOR_TYPE_NOT_EXIST = 11;
    // Regular
    FILTER_OPERATOR_TYPE_REGULAR = 12;
}
     * @param OperatorType Enum of integers that represent relations between Name and Values.
enum FilterOperatorType {
    // Invalid
    FILTER_OPERATOR_TYPE_INVALID = 0;
    // Equal to
    FILTER_OPERATOR_TYPE_EQUAL = 1;
    // Greater than
    FILTER_OPERATOR_TYPE_GREATER = 2;
    // Less than
    FILTER_OPERATOR_TYPE_LESS = 3;
    // Greater than or equal to
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
    // Less than or equal to
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
    // Not equal to
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    // In (contained in the array)
    FILTER_OPERATOR_TYPE_IN = 7;
    // Not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
    // Fuzzily matched
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
    // Existing
    FILTER_OPERATOR_TYPE_EXIST = 10;
    // Not existing
    FILTER_OPERATOR_TYPE_NOT_EXIST = 11;
    // Regular
    FILTER_OPERATOR_TYPE_REGULAR = 12;
}
     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    public CommonFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonFilter(CommonFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);

    }
}

