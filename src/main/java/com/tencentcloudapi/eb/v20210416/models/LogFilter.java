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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFilter extends AbstractModel {

    /**
    * Field name
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Operator. Values: `eq` (Equal to), `neq` (Not equal to), `like`, `not like`, `lt` (Smaller than), `lte` (Smaller than and equal to), `gt` (Greater than), `gte` (Greater than and equal to), `range` (Within the range) and `norange` (Not in the range).
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Filter value. Two values should be entered for range operation, separated by a comma (,).

    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * The logical relationship between conditions. Values: `AND` and `OR`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * LogFilters array
    */
    @SerializedName("Filters")
    @Expose
    private LogFilters [] Filters;

    /**
     * Get Field name 
     * @return Key Field name
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Field name
     * @param Key Field name
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Operator. Values: `eq` (Equal to), `neq` (Not equal to), `like`, `not like`, `lt` (Smaller than), `lte` (Smaller than and equal to), `gt` (Greater than), `gte` (Greater than and equal to), `range` (Within the range) and `norange` (Not in the range). 
     * @return Operator Operator. Values: `eq` (Equal to), `neq` (Not equal to), `like`, `not like`, `lt` (Smaller than), `lte` (Smaller than and equal to), `gt` (Greater than), `gte` (Greater than and equal to), `range` (Within the range) and `norange` (Not in the range).
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator. Values: `eq` (Equal to), `neq` (Not equal to), `like`, `not like`, `lt` (Smaller than), `lte` (Smaller than and equal to), `gt` (Greater than), `gte` (Greater than and equal to), `range` (Within the range) and `norange` (Not in the range).
     * @param Operator Operator. Values: `eq` (Equal to), `neq` (Not equal to), `like`, `not like`, `lt` (Smaller than), `lte` (Smaller than and equal to), `gt` (Greater than), `gte` (Greater than and equal to), `range` (Within the range) and `norange` (Not in the range).
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Filter value. Two values should be entered for range operation, separated by a comma (,).
 
     * @return Value Filter value. Two values should be entered for range operation, separated by a comma (,).

     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Filter value. Two values should be entered for range operation, separated by a comma (,).

     * @param Value Filter value. Two values should be entered for range operation, separated by a comma (,).

     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get The logical relationship between conditions. Values: `AND` and `OR`. 
     * @return Type The logical relationship between conditions. Values: `AND` and `OR`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The logical relationship between conditions. Values: `AND` and `OR`.
     * @param Type The logical relationship between conditions. Values: `AND` and `OR`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get LogFilters array 
     * @return Filters LogFilters array
     */
    public LogFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set LogFilters array
     * @param Filters LogFilters array
     */
    public void setFilters(LogFilters [] Filters) {
        this.Filters = Filters;
    }

    public LogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFilter(LogFilter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Filters != null) {
            this.Filters = new LogFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new LogFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

