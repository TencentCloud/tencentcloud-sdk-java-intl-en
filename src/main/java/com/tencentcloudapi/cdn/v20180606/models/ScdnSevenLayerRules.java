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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnSevenLayerRules extends AbstractModel {

    /**
    * Whether values are case sensitive
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * Rule types:
`protocol`: protocol. Valid values: `HTTP` and `HTTPS`.
`method`: request method. Valid values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.
`all`: domain name. The matching content is `*` and cannot be edited.
`ip`: IP in CIDR format.
`directory`: path starting with a slash (/). You can specify a directory or specific path using up to 128 characters.
`index`: default homepage, which is specified by `/;/index.html` and cannot be edited.
`path`: full path of the file, such as `/acb/test.png`. Wildcard is supported, such as `/abc/*.jpg`.
`file`: file extension, such as `jpg`, `png` and `css`.
`param`: request parameter. The value can contain up to 512 characters.
`referer`: Referer. The value can contain up to 512 characters.
`cookie`: Cookie. The value can contain up to 512 characters.
`user-agent`: User-Agent. The value can contain up to 512 characters.
`head`: custom header. The value can contain up to 512 characters. If the matching content is blank or does not exist, enter the matching parameter directly.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Logical operator, which connects the relation between RuleType and RuleValue. Valid values:
`exclude`: the rule value is not contained. 
`include`: the rule value is contained. 
`notequal`: the rule value is not equal to the specified rule type. 
`equal`: the rule value is equal to the specified rule type. 
`matching`: the rule value matches with the prefix of the specified rule type.
`null`: the rule value is empty or does not exist.
    */
    @SerializedName("LogicOperator")
    @Expose
    private String LogicOperator;

    /**
    * Rule value
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * Matched parameter. Only request parameters, Cookie, and custom request headers have a value.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleParam")
    @Expose
    private String RuleParam;

    /**
     * Get Whether values are case sensitive 
     * @return CaseSensitive Whether values are case sensitive
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set Whether values are case sensitive
     * @param CaseSensitive Whether values are case sensitive
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get Rule types:
`protocol`: protocol. Valid values: `HTTP` and `HTTPS`.
`method`: request method. Valid values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.
`all`: domain name. The matching content is `*` and cannot be edited.
`ip`: IP in CIDR format.
`directory`: path starting with a slash (/). You can specify a directory or specific path using up to 128 characters.
`index`: default homepage, which is specified by `/;/index.html` and cannot be edited.
`path`: full path of the file, such as `/acb/test.png`. Wildcard is supported, such as `/abc/*.jpg`.
`file`: file extension, such as `jpg`, `png` and `css`.
`param`: request parameter. The value can contain up to 512 characters.
`referer`: Referer. The value can contain up to 512 characters.
`cookie`: Cookie. The value can contain up to 512 characters.
`user-agent`: User-Agent. The value can contain up to 512 characters.
`head`: custom header. The value can contain up to 512 characters. If the matching content is blank or does not exist, enter the matching parameter directly. 
     * @return RuleType Rule types:
`protocol`: protocol. Valid values: `HTTP` and `HTTPS`.
`method`: request method. Valid values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.
`all`: domain name. The matching content is `*` and cannot be edited.
`ip`: IP in CIDR format.
`directory`: path starting with a slash (/). You can specify a directory or specific path using up to 128 characters.
`index`: default homepage, which is specified by `/;/index.html` and cannot be edited.
`path`: full path of the file, such as `/acb/test.png`. Wildcard is supported, such as `/abc/*.jpg`.
`file`: file extension, such as `jpg`, `png` and `css`.
`param`: request parameter. The value can contain up to 512 characters.
`referer`: Referer. The value can contain up to 512 characters.
`cookie`: Cookie. The value can contain up to 512 characters.
`user-agent`: User-Agent. The value can contain up to 512 characters.
`head`: custom header. The value can contain up to 512 characters. If the matching content is blank or does not exist, enter the matching parameter directly.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
`protocol`: protocol. Valid values: `HTTP` and `HTTPS`.
`method`: request method. Valid values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.
`all`: domain name. The matching content is `*` and cannot be edited.
`ip`: IP in CIDR format.
`directory`: path starting with a slash (/). You can specify a directory or specific path using up to 128 characters.
`index`: default homepage, which is specified by `/;/index.html` and cannot be edited.
`path`: full path of the file, such as `/acb/test.png`. Wildcard is supported, such as `/abc/*.jpg`.
`file`: file extension, such as `jpg`, `png` and `css`.
`param`: request parameter. The value can contain up to 512 characters.
`referer`: Referer. The value can contain up to 512 characters.
`cookie`: Cookie. The value can contain up to 512 characters.
`user-agent`: User-Agent. The value can contain up to 512 characters.
`head`: custom header. The value can contain up to 512 characters. If the matching content is blank or does not exist, enter the matching parameter directly.
     * @param RuleType Rule types:
`protocol`: protocol. Valid values: `HTTP` and `HTTPS`.
`method`: request method. Valid values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.
`all`: domain name. The matching content is `*` and cannot be edited.
`ip`: IP in CIDR format.
`directory`: path starting with a slash (/). You can specify a directory or specific path using up to 128 characters.
`index`: default homepage, which is specified by `/;/index.html` and cannot be edited.
`path`: full path of the file, such as `/acb/test.png`. Wildcard is supported, such as `/abc/*.jpg`.
`file`: file extension, such as `jpg`, `png` and `css`.
`param`: request parameter. The value can contain up to 512 characters.
`referer`: Referer. The value can contain up to 512 characters.
`cookie`: Cookie. The value can contain up to 512 characters.
`user-agent`: User-Agent. The value can contain up to 512 characters.
`head`: custom header. The value can contain up to 512 characters. If the matching content is blank or does not exist, enter the matching parameter directly.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Logical operator, which connects the relation between RuleType and RuleValue. Valid values:
`exclude`: the rule value is not contained. 
`include`: the rule value is contained. 
`notequal`: the rule value is not equal to the specified rule type. 
`equal`: the rule value is equal to the specified rule type. 
`matching`: the rule value matches with the prefix of the specified rule type.
`null`: the rule value is empty or does not exist. 
     * @return LogicOperator Logical operator, which connects the relation between RuleType and RuleValue. Valid values:
`exclude`: the rule value is not contained. 
`include`: the rule value is contained. 
`notequal`: the rule value is not equal to the specified rule type. 
`equal`: the rule value is equal to the specified rule type. 
`matching`: the rule value matches with the prefix of the specified rule type.
`null`: the rule value is empty or does not exist.
     */
    public String getLogicOperator() {
        return this.LogicOperator;
    }

    /**
     * Set Logical operator, which connects the relation between RuleType and RuleValue. Valid values:
`exclude`: the rule value is not contained. 
`include`: the rule value is contained. 
`notequal`: the rule value is not equal to the specified rule type. 
`equal`: the rule value is equal to the specified rule type. 
`matching`: the rule value matches with the prefix of the specified rule type.
`null`: the rule value is empty or does not exist.
     * @param LogicOperator Logical operator, which connects the relation between RuleType and RuleValue. Valid values:
`exclude`: the rule value is not contained. 
`include`: the rule value is contained. 
`notequal`: the rule value is not equal to the specified rule type. 
`equal`: the rule value is equal to the specified rule type. 
`matching`: the rule value matches with the prefix of the specified rule type.
`null`: the rule value is empty or does not exist.
     */
    public void setLogicOperator(String LogicOperator) {
        this.LogicOperator = LogicOperator;
    }

    /**
     * Get Rule value
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RuleValue Rule value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set Rule value
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RuleValue Rule value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get Matched parameter. Only request parameters, Cookie, and custom request headers have a value.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RuleParam Matched parameter. Only request parameters, Cookie, and custom request headers have a value.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRuleParam() {
        return this.RuleParam;
    }

    /**
     * Set Matched parameter. Only request parameters, Cookie, and custom request headers have a value.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RuleParam Matched parameter. Only request parameters, Cookie, and custom request headers have a value.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRuleParam(String RuleParam) {
        this.RuleParam = RuleParam;
    }

    public ScdnSevenLayerRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnSevenLayerRules(ScdnSevenLayerRules source) {
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.LogicOperator != null) {
            this.LogicOperator = new String(source.LogicOperator);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
        if (source.RuleParam != null) {
            this.RuleParam = new String(source.RuleParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "LogicOperator", this.LogicOperator);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "RuleParam", this.RuleParam);

    }
}

