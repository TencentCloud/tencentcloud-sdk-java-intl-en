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

public class LogFilter extends AbstractModel {

    /**
    * Filter items.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter criteria. Support the following conditions: WINC-include (segment dimension), WEXC-exclude (segment dimension), INC-include, EXC-exclude, EQS-equal, NEQ-not equal to, RA-range.
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * Filtered value. For reverse query, multiple values have an AND relationship. For forward query, multiple values have an OR relationship.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Filter items. 
     * @return Type Filter items.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Filter items.
     * @param Type Filter items.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter criteria. Support the following conditions: WINC-include (segment dimension), WEXC-exclude (segment dimension), INC-include, EXC-exclude, EQS-equal, NEQ-not equal to, RA-range. 
     * @return Compare Filter criteria. Support the following conditions: WINC-include (segment dimension), WEXC-exclude (segment dimension), INC-include, EXC-exclude, EQS-equal, NEQ-not equal to, RA-range.
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set Filter criteria. Support the following conditions: WINC-include (segment dimension), WEXC-exclude (segment dimension), INC-include, EXC-exclude, EQS-equal, NEQ-not equal to, RA-range.
     * @param Compare Filter criteria. Support the following conditions: WINC-include (segment dimension), WEXC-exclude (segment dimension), INC-include, EXC-exclude, EQS-equal, NEQ-not equal to, RA-range.
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get Filtered value. For reverse query, multiple values have an AND relationship. For forward query, multiple values have an OR relationship. 
     * @return Value Filtered value. For reverse query, multiple values have an AND relationship. For forward query, multiple values have an OR relationship.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Filtered value. For reverse query, multiple values have an AND relationship. For forward query, multiple values have an OR relationship.
     * @param Value Filtered value. For reverse query, multiple values have an AND relationship. For forward query, multiple values have an OR relationship.
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public LogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFilter(LogFilter source) {
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

