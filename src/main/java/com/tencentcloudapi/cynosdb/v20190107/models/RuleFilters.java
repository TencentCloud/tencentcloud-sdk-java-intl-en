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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleFilters extends AbstractModel {

    /**
    * Parameter name for the audit rule filter criteria. Available values: host – client IP; user – database account; dbName – database name; sqlType – SQL type; sql – SQL statement; affectRows – number of affected rows; sentRows – number of returned rows; checkRows – number of scanned rows; execTime – execution time.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Match type of the audit rule filter criteria. Available values: INC – include; EXC – exclude; EQS – equal; NEQ – not equal; REG – regular; GT – greater than; LT – less than.
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * Matching value of the filter criteria for the audit rule.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Parameter name for the audit rule filter criteria. Available values: host – client IP; user – database account; dbName – database name; sqlType – SQL type; sql – SQL statement; affectRows – number of affected rows; sentRows – number of returned rows; checkRows – number of scanned rows; execTime – execution time. 
     * @return Type Parameter name for the audit rule filter criteria. Available values: host – client IP; user – database account; dbName – database name; sqlType – SQL type; sql – SQL statement; affectRows – number of affected rows; sentRows – number of returned rows; checkRows – number of scanned rows; execTime – execution time.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter name for the audit rule filter criteria. Available values: host – client IP; user – database account; dbName – database name; sqlType – SQL type; sql – SQL statement; affectRows – number of affected rows; sentRows – number of returned rows; checkRows – number of scanned rows; execTime – execution time.
     * @param Type Parameter name for the audit rule filter criteria. Available values: host – client IP; user – database account; dbName – database name; sqlType – SQL type; sql – SQL statement; affectRows – number of affected rows; sentRows – number of returned rows; checkRows – number of scanned rows; execTime – execution time.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Match type of the audit rule filter criteria. Available values: INC – include; EXC – exclude; EQS – equal; NEQ – not equal; REG – regular; GT – greater than; LT – less than. 
     * @return Compare Match type of the audit rule filter criteria. Available values: INC – include; EXC – exclude; EQS – equal; NEQ – not equal; REG – regular; GT – greater than; LT – less than.
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set Match type of the audit rule filter criteria. Available values: INC – include; EXC – exclude; EQS – equal; NEQ – not equal; REG – regular; GT – greater than; LT – less than.
     * @param Compare Match type of the audit rule filter criteria. Available values: INC – include; EXC – exclude; EQS – equal; NEQ – not equal; REG – regular; GT – greater than; LT – less than.
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get Matching value of the filter criteria for the audit rule. 
     * @return Value Matching value of the filter criteria for the audit rule.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Matching value of the filter criteria for the audit rule.
     * @param Value Matching value of the filter criteria for the audit rule.
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public RuleFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleFilters(RuleFilters source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

