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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestFieldsForException extends AbstractModel {

    /**
    * Specific fields to skip. Supported values: <br/>
<li>body.json: parameter content in JSON requests. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "body.json", "Condition": "", "TargetField": "key" } means ALL parameters in the JSON request content skip WAF scan.</li>
<li style="margin-top:5px">cookie: Cookie; at this point, Condition supports key and value, and TargetField supports key and value, for example { "Scope": "cookie", "Condition": "${key} in ['account-id'] and ${value} like ['prefix-*']", "TargetField": "value" }, which means the cookie parameter name equals account-id and the parameter value wildcard matches prefix-* to skip WAF scan;</li>
<li style="margin-top:5px">header: HTTP header parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "header", "Condition": "${key} like ['x-auth-*']", "TargetField": "value" } means the header parameter name wildcard match x-auth-* skips WAF scan.</li>
<li style="margin-top:5px">uri.query: URL-encoded content/query parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "uri.query", "Condition": "${key} in ['action'] and ${value} in ['upload', 'delete']", "TargetField": "value" } means the parameter name of the URL-encoded content/query parameters is equal to action and the parameter value is equal to upload or delete, skip WAF scan;</li>
<li style="margin-top:5px">uri: request path URI. At this point, Condition must be empty, and TargetField supports query, path, and fullpath. For example, { "Scope": "uri", "Condition": "", "TargetField": "query" } means only query parameters in the request path URI skip WAF scan.</li>
<li style="margin-top:5px">body: request body content. At this point, Condition must be empty, and TargetField supports fullbody and multipart, for example { "Scope": "body",  "Condition": "", "TargetField": "fullbody" }, which means the request body content is the complete request body and skips WAF scan;</li>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * Expression of the specific field to skip, which must comply with the expression grammar.<br />
Condition supports expression configuration syntax: <li> Write the filter condition expression syntax based on the rule, with support for referencing key and value.</li><li> Support in and like operators, and logical combination with and.</li>
For example: <li>${key} in ['x-trace-id']: The parameter name is equal to x-trace-id.</li><li>${key} in ['x-trace-id'] and ${value} like ['Bearer *']: The parameter name is equal to x-trace-id and the parameter value wildcard matches Bearer *.</li>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * When the Scope parameter takes different values, the supported values in the TargetField expression are as follows:
<li> body.json: supports key and value</li>
<li> cookie: supports key and value</li>
<li> header: supports key and value</li>
<li> uri.query: supports key and value</li>
<li> uri: supports path, query, and fullpath</li>
<li> body: supports fullbody and multipart</li>
    */
    @SerializedName("TargetField")
    @Expose
    private String TargetField;

    /**
     * Get Specific fields to skip. Supported values: <br/>
<li>body.json: parameter content in JSON requests. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "body.json", "Condition": "", "TargetField": "key" } means ALL parameters in the JSON request content skip WAF scan.</li>
<li style="margin-top:5px">cookie: Cookie; at this point, Condition supports key and value, and TargetField supports key and value, for example { "Scope": "cookie", "Condition": "${key} in ['account-id'] and ${value} like ['prefix-*']", "TargetField": "value" }, which means the cookie parameter name equals account-id and the parameter value wildcard matches prefix-* to skip WAF scan;</li>
<li style="margin-top:5px">header: HTTP header parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "header", "Condition": "${key} like ['x-auth-*']", "TargetField": "value" } means the header parameter name wildcard match x-auth-* skips WAF scan.</li>
<li style="margin-top:5px">uri.query: URL-encoded content/query parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "uri.query", "Condition": "${key} in ['action'] and ${value} in ['upload', 'delete']", "TargetField": "value" } means the parameter name of the URL-encoded content/query parameters is equal to action and the parameter value is equal to upload or delete, skip WAF scan;</li>
<li style="margin-top:5px">uri: request path URI. At this point, Condition must be empty, and TargetField supports query, path, and fullpath. For example, { "Scope": "uri", "Condition": "", "TargetField": "query" } means only query parameters in the request path URI skip WAF scan.</li>
<li style="margin-top:5px">body: request body content. At this point, Condition must be empty, and TargetField supports fullbody and multipart, for example { "Scope": "body",  "Condition": "", "TargetField": "fullbody" }, which means the request body content is the complete request body and skips WAF scan;</li> 
     * @return Scope Specific fields to skip. Supported values: <br/>
<li>body.json: parameter content in JSON requests. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "body.json", "Condition": "", "TargetField": "key" } means ALL parameters in the JSON request content skip WAF scan.</li>
<li style="margin-top:5px">cookie: Cookie; at this point, Condition supports key and value, and TargetField supports key and value, for example { "Scope": "cookie", "Condition": "${key} in ['account-id'] and ${value} like ['prefix-*']", "TargetField": "value" }, which means the cookie parameter name equals account-id and the parameter value wildcard matches prefix-* to skip WAF scan;</li>
<li style="margin-top:5px">header: HTTP header parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "header", "Condition": "${key} like ['x-auth-*']", "TargetField": "value" } means the header parameter name wildcard match x-auth-* skips WAF scan.</li>
<li style="margin-top:5px">uri.query: URL-encoded content/query parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "uri.query", "Condition": "${key} in ['action'] and ${value} in ['upload', 'delete']", "TargetField": "value" } means the parameter name of the URL-encoded content/query parameters is equal to action and the parameter value is equal to upload or delete, skip WAF scan;</li>
<li style="margin-top:5px">uri: request path URI. At this point, Condition must be empty, and TargetField supports query, path, and fullpath. For example, { "Scope": "uri", "Condition": "", "TargetField": "query" } means only query parameters in the request path URI skip WAF scan.</li>
<li style="margin-top:5px">body: request body content. At this point, Condition must be empty, and TargetField supports fullbody and multipart, for example { "Scope": "body",  "Condition": "", "TargetField": "fullbody" }, which means the request body content is the complete request body and skips WAF scan;</li>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set Specific fields to skip. Supported values: <br/>
<li>body.json: parameter content in JSON requests. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "body.json", "Condition": "", "TargetField": "key" } means ALL parameters in the JSON request content skip WAF scan.</li>
<li style="margin-top:5px">cookie: Cookie; at this point, Condition supports key and value, and TargetField supports key and value, for example { "Scope": "cookie", "Condition": "${key} in ['account-id'] and ${value} like ['prefix-*']", "TargetField": "value" }, which means the cookie parameter name equals account-id and the parameter value wildcard matches prefix-* to skip WAF scan;</li>
<li style="margin-top:5px">header: HTTP header parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "header", "Condition": "${key} like ['x-auth-*']", "TargetField": "value" } means the header parameter name wildcard match x-auth-* skips WAF scan.</li>
<li style="margin-top:5px">uri.query: URL-encoded content/query parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "uri.query", "Condition": "${key} in ['action'] and ${value} in ['upload', 'delete']", "TargetField": "value" } means the parameter name of the URL-encoded content/query parameters is equal to action and the parameter value is equal to upload or delete, skip WAF scan;</li>
<li style="margin-top:5px">uri: request path URI. At this point, Condition must be empty, and TargetField supports query, path, and fullpath. For example, { "Scope": "uri", "Condition": "", "TargetField": "query" } means only query parameters in the request path URI skip WAF scan.</li>
<li style="margin-top:5px">body: request body content. At this point, Condition must be empty, and TargetField supports fullbody and multipart, for example { "Scope": "body",  "Condition": "", "TargetField": "fullbody" }, which means the request body content is the complete request body and skips WAF scan;</li>
     * @param Scope Specific fields to skip. Supported values: <br/>
<li>body.json: parameter content in JSON requests. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "body.json", "Condition": "", "TargetField": "key" } means ALL parameters in the JSON request content skip WAF scan.</li>
<li style="margin-top:5px">cookie: Cookie; at this point, Condition supports key and value, and TargetField supports key and value, for example { "Scope": "cookie", "Condition": "${key} in ['account-id'] and ${value} like ['prefix-*']", "TargetField": "value" }, which means the cookie parameter name equals account-id and the parameter value wildcard matches prefix-* to skip WAF scan;</li>
<li style="margin-top:5px">header: HTTP header parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "header", "Condition": "${key} like ['x-auth-*']", "TargetField": "value" } means the header parameter name wildcard match x-auth-* skips WAF scan.</li>
<li style="margin-top:5px">uri.query: URL-encoded content/query parameters. At this point, Condition supports key and value, and TargetField supports key and value. For example, { "Scope": "uri.query", "Condition": "${key} in ['action'] and ${value} in ['upload', 'delete']", "TargetField": "value" } means the parameter name of the URL-encoded content/query parameters is equal to action and the parameter value is equal to upload or delete, skip WAF scan;</li>
<li style="margin-top:5px">uri: request path URI. At this point, Condition must be empty, and TargetField supports query, path, and fullpath. For example, { "Scope": "uri", "Condition": "", "TargetField": "query" } means only query parameters in the request path URI skip WAF scan.</li>
<li style="margin-top:5px">body: request body content. At this point, Condition must be empty, and TargetField supports fullbody and multipart, for example { "Scope": "body",  "Condition": "", "TargetField": "fullbody" }, which means the request body content is the complete request body and skips WAF scan;</li>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Expression of the specific field to skip, which must comply with the expression grammar.<br />
Condition supports expression configuration syntax: <li> Write the filter condition expression syntax based on the rule, with support for referencing key and value.</li><li> Support in and like operators, and logical combination with and.</li>
For example: <li>${key} in ['x-trace-id']: The parameter name is equal to x-trace-id.</li><li>${key} in ['x-trace-id'] and ${value} like ['Bearer *']: The parameter name is equal to x-trace-id and the parameter value wildcard matches Bearer *.</li> 
     * @return Condition Expression of the specific field to skip, which must comply with the expression grammar.<br />
Condition supports expression configuration syntax: <li> Write the filter condition expression syntax based on the rule, with support for referencing key and value.</li><li> Support in and like operators, and logical combination with and.</li>
For example: <li>${key} in ['x-trace-id']: The parameter name is equal to x-trace-id.</li><li>${key} in ['x-trace-id'] and ${value} like ['Bearer *']: The parameter name is equal to x-trace-id and the parameter value wildcard matches Bearer *.</li>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Expression of the specific field to skip, which must comply with the expression grammar.<br />
Condition supports expression configuration syntax: <li> Write the filter condition expression syntax based on the rule, with support for referencing key and value.</li><li> Support in and like operators, and logical combination with and.</li>
For example: <li>${key} in ['x-trace-id']: The parameter name is equal to x-trace-id.</li><li>${key} in ['x-trace-id'] and ${value} like ['Bearer *']: The parameter name is equal to x-trace-id and the parameter value wildcard matches Bearer *.</li>
     * @param Condition Expression of the specific field to skip, which must comply with the expression grammar.<br />
Condition supports expression configuration syntax: <li> Write the filter condition expression syntax based on the rule, with support for referencing key and value.</li><li> Support in and like operators, and logical combination with and.</li>
For example: <li>${key} in ['x-trace-id']: The parameter name is equal to x-trace-id.</li><li>${key} in ['x-trace-id'] and ${value} like ['Bearer *']: The parameter name is equal to x-trace-id and the parameter value wildcard matches Bearer *.</li>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get When the Scope parameter takes different values, the supported values in the TargetField expression are as follows:
<li> body.json: supports key and value</li>
<li> cookie: supports key and value</li>
<li> header: supports key and value</li>
<li> uri.query: supports key and value</li>
<li> uri: supports path, query, and fullpath</li>
<li> body: supports fullbody and multipart</li> 
     * @return TargetField When the Scope parameter takes different values, the supported values in the TargetField expression are as follows:
<li> body.json: supports key and value</li>
<li> cookie: supports key and value</li>
<li> header: supports key and value</li>
<li> uri.query: supports key and value</li>
<li> uri: supports path, query, and fullpath</li>
<li> body: supports fullbody and multipart</li>
     */
    public String getTargetField() {
        return this.TargetField;
    }

    /**
     * Set When the Scope parameter takes different values, the supported values in the TargetField expression are as follows:
<li> body.json: supports key and value</li>
<li> cookie: supports key and value</li>
<li> header: supports key and value</li>
<li> uri.query: supports key and value</li>
<li> uri: supports path, query, and fullpath</li>
<li> body: supports fullbody and multipart</li>
     * @param TargetField When the Scope parameter takes different values, the supported values in the TargetField expression are as follows:
<li> body.json: supports key and value</li>
<li> cookie: supports key and value</li>
<li> header: supports key and value</li>
<li> uri.query: supports key and value</li>
<li> uri: supports path, query, and fullpath</li>
<li> body: supports fullbody and multipart</li>
     */
    public void setTargetField(String TargetField) {
        this.TargetField = TargetField;
    }

    public RequestFieldsForException() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestFieldsForException(RequestFieldsForException source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TargetField != null) {
            this.TargetField = new String(source.TargetField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TargetField", this.TargetField);

    }
}

