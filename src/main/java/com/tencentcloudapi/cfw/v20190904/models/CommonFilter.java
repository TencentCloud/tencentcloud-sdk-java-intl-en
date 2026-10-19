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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonFilter extends AbstractModel {

    /**
    * Search key.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Enumeration type, representing the matching relationship between Name and Values.
enum FilterOperatorType {
equal
    FILTER_OPERATOR_TYPE_EQUAL = 1;
Above
    FILTER_OPERATOR_TYPE_GREATER = 2;
less than
    FILTER_OPERATOR_TYPE_LESS = 3;
>=
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
<=
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
neq
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    //not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
Fuzzy matching
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
}
    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
    * Search values, with an OR relationship between each search value.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

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
     * Get Enumeration type, representing the matching relationship between Name and Values.
enum FilterOperatorType {
equal
    FILTER_OPERATOR_TYPE_EQUAL = 1;
Above
    FILTER_OPERATOR_TYPE_GREATER = 2;
less than
    FILTER_OPERATOR_TYPE_LESS = 3;
>=
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
<=
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
neq
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    //not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
Fuzzy matching
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
} 
     * @return OperatorType Enumeration type, representing the matching relationship between Name and Values.
enum FilterOperatorType {
equal
    FILTER_OPERATOR_TYPE_EQUAL = 1;
Above
    FILTER_OPERATOR_TYPE_GREATER = 2;
less than
    FILTER_OPERATOR_TYPE_LESS = 3;
>=
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
<=
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
neq
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    //not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
Fuzzy matching
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
}
     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set Enumeration type, representing the matching relationship between Name and Values.
enum FilterOperatorType {
equal
    FILTER_OPERATOR_TYPE_EQUAL = 1;
Above
    FILTER_OPERATOR_TYPE_GREATER = 2;
less than
    FILTER_OPERATOR_TYPE_LESS = 3;
>=
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
<=
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
neq
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    //not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
Fuzzy matching
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
}
     * @param OperatorType Enumeration type, representing the matching relationship between Name and Values.
enum FilterOperatorType {
equal
    FILTER_OPERATOR_TYPE_EQUAL = 1;
Above
    FILTER_OPERATOR_TYPE_GREATER = 2;
less than
    FILTER_OPERATOR_TYPE_LESS = 3;
>=
    FILTER_OPERATOR_TYPE_GREATER_EQ = 4;
<=
    FILTER_OPERATOR_TYPE_LESS_EQ = 5;
neq
    FILTER_OPERATOR_TYPE_NO_EQ = 6;
    //not in
    FILTER_OPERATOR_TYPE_NOT_IN = 8;
Fuzzy matching
    FILTER_OPERATOR_TYPE_FUZZINESS = 9;
}
     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    /**
     * Get Search values, with an OR relationship between each search value. 
     * @return Values Search values, with an OR relationship between each search value.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Search values, with an OR relationship between each search value.
     * @param Values Search values, with an OR relationship between each search value.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
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
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

