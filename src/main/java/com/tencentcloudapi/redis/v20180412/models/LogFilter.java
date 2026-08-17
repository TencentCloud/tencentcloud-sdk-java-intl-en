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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFilter extends AbstractModel {

    /**
    * <p>Filter criterion name.</p><p>Enumeration value:</p><ul><li>Timestamp: Creation time (format: 2006-01-02 15:04:05.000)</li><li>UserName: User name</li><li>CacheCode: Cache code, backend redis node</li><li>ClientAddr: Client IP address</li><li>CommandDetail: Command details</li><li>CommandLatency: Command delay (ms)</li><li>CommandType: Command type</li><li>DBId: Database ID</li><li>ErrMsg: Error information</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Condition match type.</p><p>Enumeration value:</p><ul><li>INC: Include, multiple values have a || relationship before</li><li>EXC: Exclude, multiple values have a || relationship before</li><li>EQS: Equal, multiple values have a || relationship before</li><li>NEQ: Not equal, multiple values have a && relationship before</li><li>RA: Range</li></ul>
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * <p>Matching value of the filter condition. When Compare=RA, for example: ["1-100","200-300"].</p>
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get <p>Filter criterion name.</p><p>Enumeration value:</p><ul><li>Timestamp: Creation time (format: 2006-01-02 15:04:05.000)</li><li>UserName: User name</li><li>CacheCode: Cache code, backend redis node</li><li>ClientAddr: Client IP address</li><li>CommandDetail: Command details</li><li>CommandLatency: Command delay (ms)</li><li>CommandType: Command type</li><li>DBId: Database ID</li><li>ErrMsg: Error information</li></ul> 
     * @return Type <p>Filter criterion name.</p><p>Enumeration value:</p><ul><li>Timestamp: Creation time (format: 2006-01-02 15:04:05.000)</li><li>UserName: User name</li><li>CacheCode: Cache code, backend redis node</li><li>ClientAddr: Client IP address</li><li>CommandDetail: Command details</li><li>CommandLatency: Command delay (ms)</li><li>CommandType: Command type</li><li>DBId: Database ID</li><li>ErrMsg: Error information</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Filter criterion name.</p><p>Enumeration value:</p><ul><li>Timestamp: Creation time (format: 2006-01-02 15:04:05.000)</li><li>UserName: User name</li><li>CacheCode: Cache code, backend redis node</li><li>ClientAddr: Client IP address</li><li>CommandDetail: Command details</li><li>CommandLatency: Command delay (ms)</li><li>CommandType: Command type</li><li>DBId: Database ID</li><li>ErrMsg: Error information</li></ul>
     * @param Type <p>Filter criterion name.</p><p>Enumeration value:</p><ul><li>Timestamp: Creation time (format: 2006-01-02 15:04:05.000)</li><li>UserName: User name</li><li>CacheCode: Cache code, backend redis node</li><li>ClientAddr: Client IP address</li><li>CommandDetail: Command details</li><li>CommandLatency: Command delay (ms)</li><li>CommandType: Command type</li><li>DBId: Database ID</li><li>ErrMsg: Error information</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Condition match type.</p><p>Enumeration value:</p><ul><li>INC: Include, multiple values have a || relationship before</li><li>EXC: Exclude, multiple values have a || relationship before</li><li>EQS: Equal, multiple values have a || relationship before</li><li>NEQ: Not equal, multiple values have a && relationship before</li><li>RA: Range</li></ul> 
     * @return Compare <p>Condition match type.</p><p>Enumeration value:</p><ul><li>INC: Include, multiple values have a || relationship before</li><li>EXC: Exclude, multiple values have a || relationship before</li><li>EQS: Equal, multiple values have a || relationship before</li><li>NEQ: Not equal, multiple values have a && relationship before</li><li>RA: Range</li></ul>
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set <p>Condition match type.</p><p>Enumeration value:</p><ul><li>INC: Include, multiple values have a || relationship before</li><li>EXC: Exclude, multiple values have a || relationship before</li><li>EQS: Equal, multiple values have a || relationship before</li><li>NEQ: Not equal, multiple values have a && relationship before</li><li>RA: Range</li></ul>
     * @param Compare <p>Condition match type.</p><p>Enumeration value:</p><ul><li>INC: Include, multiple values have a || relationship before</li><li>EXC: Exclude, multiple values have a || relationship before</li><li>EQS: Equal, multiple values have a || relationship before</li><li>NEQ: Not equal, multiple values have a && relationship before</li><li>RA: Range</li></ul>
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get <p>Matching value of the filter condition. When Compare=RA, for example: ["1-100","200-300"].</p> 
     * @return Value <p>Matching value of the filter condition. When Compare=RA, for example: ["1-100","200-300"].</p>
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set <p>Matching value of the filter condition. When Compare=RA, for example: ["1-100","200-300"].</p>
     * @param Value <p>Matching value of the filter condition. When Compare=RA, for example: ["1-100","200-300"].</p>
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

