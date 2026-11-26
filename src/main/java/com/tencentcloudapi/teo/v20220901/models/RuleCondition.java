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

public class RuleCondition extends AbstractModel {

    /**
    * Operator. Valid values:
<li> equal: equal to; </li>
<li> notequal: neq;</li>
<li> exist: exist; </li>
<li> notexist: Not found.</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Matching type. Valid values: <li>filename: Filename;</li><li>extension: File suffix;</li><li>host: Host;</li><li>full_url: A complete URL path under the current site, including the HTTP protocol, the host, and the path;</li><li>url: The request for a URL path under the current site;</li><li>client_country: Client country/region;</li><li>query_string: The query string for a requested URL under the current site;</li><li>request_header: HTTP request header;</li><li>client_ip: Client IP;</li><li>request_protocol: Request protocol;</li><li>request_method: HTTP request method.</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Parameter values for match types. An empty array is allowed only when the match type is query_string or request_header and the operator is Exist or Does Not Exist. The corresponding matching types are:
<li>extension: File suffix such as jpg or txt;</li>
<li> File name: For example, foo in foo.jpg;</li>
<li> All (arbitrary request to the site): all;</li>
<li> HOST: The host under the current site, for example, www.maxx55.com;</li>
<li> URL Path: Request for the URL path under the current site, for example, /example;</li>
<li> URL Full: complete URL request under the current site, must contain HTTP protocol, Host, and path, for example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> Query string: The parameter values in the query string of the URL requested under the current site, for example, cn and 1 in lang=cn&version=1; </li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li>Request protocol: protocol of current request. Value range: HTTP, HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Whether to ignore the case sensitivity of parameter values. Default value: `false`.
    */
    @SerializedName("IgnoreCase")
    @Expose
    private Boolean IgnoreCase;

    /**
    * Name of the parameter for the corresponding matching type. Valid when Target is set to the following values, and the value cannot be empty:
<li> query_string: The parameter names in the query string of the URL requested under the current site, for example, lang and version in lang=cn&version=1; </li>
<li> request_header: The name of the HTTP request header field. For example, Accept-Language in Accept-Language:zh-CN,zh;q=0.9. </li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to ignore the case sensitivity of parameter names. Default value: `false`.
    */
    @SerializedName("IgnoreNameCase")
    @Expose
    private Boolean IgnoreNameCase;

    /**
     * Get Operator. Valid values:
<li> equal: equal to; </li>
<li> notequal: neq;</li>
<li> exist: exist; </li>
<li> notexist: Not found.</li> 
     * @return Operator Operator. Valid values:
<li> equal: equal to; </li>
<li> notequal: neq;</li>
<li> exist: exist; </li>
<li> notexist: Not found.</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator. Valid values:
<li> equal: equal to; </li>
<li> notequal: neq;</li>
<li> exist: exist; </li>
<li> notexist: Not found.</li>
     * @param Operator Operator. Valid values:
<li> equal: equal to; </li>
<li> notequal: neq;</li>
<li> exist: exist; </li>
<li> notexist: Not found.</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Matching type. Valid values: <li>filename: Filename;</li><li>extension: File suffix;</li><li>host: Host;</li><li>full_url: A complete URL path under the current site, including the HTTP protocol, the host, and the path;</li><li>url: The request for a URL path under the current site;</li><li>client_country: Client country/region;</li><li>query_string: The query string for a requested URL under the current site;</li><li>request_header: HTTP request header;</li><li>client_ip: Client IP;</li><li>request_protocol: Request protocol;</li><li>request_method: HTTP request method.</li> 
     * @return Target Matching type. Valid values: <li>filename: Filename;</li><li>extension: File suffix;</li><li>host: Host;</li><li>full_url: A complete URL path under the current site, including the HTTP protocol, the host, and the path;</li><li>url: The request for a URL path under the current site;</li><li>client_country: Client country/region;</li><li>query_string: The query string for a requested URL under the current site;</li><li>request_header: HTTP request header;</li><li>client_ip: Client IP;</li><li>request_protocol: Request protocol;</li><li>request_method: HTTP request method.</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Matching type. Valid values: <li>filename: Filename;</li><li>extension: File suffix;</li><li>host: Host;</li><li>full_url: A complete URL path under the current site, including the HTTP protocol, the host, and the path;</li><li>url: The request for a URL path under the current site;</li><li>client_country: Client country/region;</li><li>query_string: The query string for a requested URL under the current site;</li><li>request_header: HTTP request header;</li><li>client_ip: Client IP;</li><li>request_protocol: Request protocol;</li><li>request_method: HTTP request method.</li>
     * @param Target Matching type. Valid values: <li>filename: Filename;</li><li>extension: File suffix;</li><li>host: Host;</li><li>full_url: A complete URL path under the current site, including the HTTP protocol, the host, and the path;</li><li>url: The request for a URL path under the current site;</li><li>client_country: Client country/region;</li><li>query_string: The query string for a requested URL under the current site;</li><li>request_header: HTTP request header;</li><li>client_ip: Client IP;</li><li>request_protocol: Request protocol;</li><li>request_method: HTTP request method.</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Parameter values for match types. An empty array is allowed only when the match type is query_string or request_header and the operator is Exist or Does Not Exist. The corresponding matching types are:
<li>extension: File suffix such as jpg or txt;</li>
<li> File name: For example, foo in foo.jpg;</li>
<li> All (arbitrary request to the site): all;</li>
<li> HOST: The host under the current site, for example, www.maxx55.com;</li>
<li> URL Path: Request for the URL path under the current site, for example, /example;</li>
<li> URL Full: complete URL request under the current site, must contain HTTP protocol, Host, and path, for example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> Query string: The parameter values in the query string of the URL requested under the current site, for example, cn and 1 in lang=cn&version=1; </li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li>Request protocol: protocol of current request. Value range: HTTP, HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li> 
     * @return Values Parameter values for match types. An empty array is allowed only when the match type is query_string or request_header and the operator is Exist or Does Not Exist. The corresponding matching types are:
<li>extension: File suffix such as jpg or txt;</li>
<li> File name: For example, foo in foo.jpg;</li>
<li> All (arbitrary request to the site): all;</li>
<li> HOST: The host under the current site, for example, www.maxx55.com;</li>
<li> URL Path: Request for the URL path under the current site, for example, /example;</li>
<li> URL Full: complete URL request under the current site, must contain HTTP protocol, Host, and path, for example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> Query string: The parameter values in the query string of the URL requested under the current site, for example, cn and 1 in lang=cn&version=1; </li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li>Request protocol: protocol of current request. Value range: HTTP, HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Parameter values for match types. An empty array is allowed only when the match type is query_string or request_header and the operator is Exist or Does Not Exist. The corresponding matching types are:
<li>extension: File suffix such as jpg or txt;</li>
<li> File name: For example, foo in foo.jpg;</li>
<li> All (arbitrary request to the site): all;</li>
<li> HOST: The host under the current site, for example, www.maxx55.com;</li>
<li> URL Path: Request for the URL path under the current site, for example, /example;</li>
<li> URL Full: complete URL request under the current site, must contain HTTP protocol, Host, and path, for example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> Query string: The parameter values in the query string of the URL requested under the current site, for example, cn and 1 in lang=cn&version=1; </li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li>Request protocol: protocol of current request. Value range: HTTP, HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
     * @param Values Parameter values for match types. An empty array is allowed only when the match type is query_string or request_header and the operator is Exist or Does Not Exist. The corresponding matching types are:
<li>extension: File suffix such as jpg or txt;</li>
<li> File name: For example, foo in foo.jpg;</li>
<li> All (arbitrary request to the site): all;</li>
<li> HOST: The host under the current site, for example, www.maxx55.com;</li>
<li> URL Path: Request for the URL path under the current site, for example, /example;</li>
<li> URL Full: complete URL request under the current site, must contain HTTP protocol, Host, and path, for example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> Query string: The parameter values in the query string of the URL requested under the current site, for example, cn and 1 in lang=cn&version=1; </li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li>Request protocol: protocol of current request. Value range: HTTP, HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Whether to ignore the case sensitivity of parameter values. Default value: `false`. 
     * @return IgnoreCase Whether to ignore the case sensitivity of parameter values. Default value: `false`.
     */
    public Boolean getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Whether to ignore the case sensitivity of parameter values. Default value: `false`.
     * @param IgnoreCase Whether to ignore the case sensitivity of parameter values. Default value: `false`.
     */
    public void setIgnoreCase(Boolean IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get Name of the parameter for the corresponding matching type. Valid when Target is set to the following values, and the value cannot be empty:
<li> query_string: The parameter names in the query string of the URL requested under the current site, for example, lang and version in lang=cn&version=1; </li>
<li> request_header: The name of the HTTP request header field. For example, Accept-Language in Accept-Language:zh-CN,zh;q=0.9. </li> 
     * @return Name Name of the parameter for the corresponding matching type. Valid when Target is set to the following values, and the value cannot be empty:
<li> query_string: The parameter names in the query string of the URL requested under the current site, for example, lang and version in lang=cn&version=1; </li>
<li> request_header: The name of the HTTP request header field. For example, Accept-Language in Accept-Language:zh-CN,zh;q=0.9. </li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the parameter for the corresponding matching type. Valid when Target is set to the following values, and the value cannot be empty:
<li> query_string: The parameter names in the query string of the URL requested under the current site, for example, lang and version in lang=cn&version=1; </li>
<li> request_header: The name of the HTTP request header field. For example, Accept-Language in Accept-Language:zh-CN,zh;q=0.9. </li>
     * @param Name Name of the parameter for the corresponding matching type. Valid when Target is set to the following values, and the value cannot be empty:
<li> query_string: The parameter names in the query string of the URL requested under the current site, for example, lang and version in lang=cn&version=1; </li>
<li> request_header: The name of the HTTP request header field. For example, Accept-Language in Accept-Language:zh-CN,zh;q=0.9. </li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to ignore the case sensitivity of parameter names. Default value: `false`. 
     * @return IgnoreNameCase Whether to ignore the case sensitivity of parameter names. Default value: `false`.
     * @deprecated
     */
    @Deprecated
    public Boolean getIgnoreNameCase() {
        return this.IgnoreNameCase;
    }

    /**
     * Set Whether to ignore the case sensitivity of parameter names. Default value: `false`.
     * @param IgnoreNameCase Whether to ignore the case sensitivity of parameter names. Default value: `false`.
     * @deprecated
     */
    @Deprecated
    public void setIgnoreNameCase(Boolean IgnoreNameCase) {
        this.IgnoreNameCase = IgnoreNameCase;
    }

    public RuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCondition(RuleCondition source) {
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new Boolean(source.IgnoreCase);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IgnoreNameCase != null) {
            this.IgnoreNameCase = new Boolean(source.IgnoreNameCase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IgnoreNameCase", this.IgnoreNameCase);

    }
}

