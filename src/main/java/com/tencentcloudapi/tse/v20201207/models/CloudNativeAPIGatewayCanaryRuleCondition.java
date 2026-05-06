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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayCanaryRuleCondition extends AbstractModel {

    /**
    * Condition type, support path, method, query, header, cookie, body, and system.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Parameter name.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Operator, supports "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in", "prefix", "exact", "regex"
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Target parameter value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Separator. This parameter is valid only when Operator is in or not in. Supported values: comma, semicolon, space, line break.
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * Global configuration Id
    */
    @SerializedName("GlobalConfigId")
    @Expose
    private String GlobalConfigId;

    /**
    * Global configuration name
    */
    @SerializedName("GlobalConfigName")
    @Expose
    private String GlobalConfigName;

    /**
     * Get Condition type, support path, method, query, header, cookie, body, and system. 
     * @return Type Condition type, support path, method, query, header, cookie, body, and system.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Condition type, support path, method, query, header, cookie, body, and system.
     * @param Type Condition type, support path, method, query, header, cookie, body, and system.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Parameter name. 
     * @return Key Parameter name.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Parameter name.
     * @param Key Parameter name.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Operator, supports "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in", "prefix", "exact", "regex" 
     * @return Operator Operator, supports "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in", "prefix", "exact", "regex"
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator, supports "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in", "prefix", "exact", "regex"
     * @param Operator Operator, supports "le", "eq", "lt", "ne", "ge", "gt", "regex", "exists", "in", "not in", "prefix", "exact", "regex"
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Target parameter value 
     * @return Value Target parameter value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Target parameter value
     * @param Value Target parameter value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Separator. This parameter is valid only when Operator is in or not in. Supported values: comma, semicolon, space, line break. 
     * @return Delimiter Separator. This parameter is valid only when Operator is in or not in. Supported values: comma, semicolon, space, line break.
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set Separator. This parameter is valid only when Operator is in or not in. Supported values: comma, semicolon, space, line break.
     * @param Delimiter Separator. This parameter is valid only when Operator is in or not in. Supported values: comma, semicolon, space, line break.
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get Global configuration Id 
     * @return GlobalConfigId Global configuration Id
     */
    public String getGlobalConfigId() {
        return this.GlobalConfigId;
    }

    /**
     * Set Global configuration Id
     * @param GlobalConfigId Global configuration Id
     */
    public void setGlobalConfigId(String GlobalConfigId) {
        this.GlobalConfigId = GlobalConfigId;
    }

    /**
     * Get Global configuration name 
     * @return GlobalConfigName Global configuration name
     */
    public String getGlobalConfigName() {
        return this.GlobalConfigName;
    }

    /**
     * Set Global configuration name
     * @param GlobalConfigName Global configuration name
     */
    public void setGlobalConfigName(String GlobalConfigName) {
        this.GlobalConfigName = GlobalConfigName;
    }

    public CloudNativeAPIGatewayCanaryRuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayCanaryRuleCondition(CloudNativeAPIGatewayCanaryRuleCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.GlobalConfigId != null) {
            this.GlobalConfigId = new String(source.GlobalConfigId);
        }
        if (source.GlobalConfigName != null) {
            this.GlobalConfigName = new String(source.GlobalConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "GlobalConfigId", this.GlobalConfigId);
        this.setParamSimple(map, prefix + "GlobalConfigName", this.GlobalConfigName);

    }
}

