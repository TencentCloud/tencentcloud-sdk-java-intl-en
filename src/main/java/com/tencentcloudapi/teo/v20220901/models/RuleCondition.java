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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCondition extends AbstractModel {

    /**
    * Operator. Valid values:
<li>`equal`: Equal</li>
<li>`notEquals`: Does not equal</li>
<li>`exist`: Exists</li>
<li>`notexist`: Does not exist</li>
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
    * Parameter values for corresponding matching types. It is allowed to pass an empty array only when the matching type is query_string or request_header and the operator value is exist or not exist. Corresponding match types include:
<li>extension: File suffix such as jpg or txt;</li>
<li> filename: For example, foo in foo.jpg;</li>
<li> all (any request under the site): all;</li>
<li> host: The host under the current site. For example, www.maxx55.com;</li>
<li> URL path: The request for a URL path under the current site. For example, /example;</li>
<li> URL full: The request for a complete URL under the current site, including the HTTP protocol, the host, and the path. For example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> query_string: The parameter value in the query string of the requested URL under the current site. For example, cn and 1 in lang=cn&version=1;</li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li> request_protocol: The protocol of the current request. Valid values: HTTP and HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Whether the parameter value is case insensitive. Default value: false.
    */
    @SerializedName("IgnoreCase")
    @Expose
    private Boolean IgnoreCase;

    /**
    * The parameter name of the match type. This field is required only when `Target=query_string/request_header`.
<li>`query_string`: Name of the query string, such as "lang" and "version" in "lang=cn&version=1".</li>
<li>`request_header`: Name of the HTTP request header, such as "Accept-Language" in the "Accept-Language:zh-CN,zh;q=0.9" header.</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether the parameter name is case insensitive. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoreNameCase")
    @Expose
    private Boolean IgnoreNameCase;

    /**
     * Get Operator. Valid values:
<li>`equal`: Equal</li>
<li>`notEquals`: Does not equal</li>
<li>`exist`: Exists</li>
<li>`notexist`: Does not exist</li> 
     * @return Operator Operator. Valid values:
<li>`equal`: Equal</li>
<li>`notEquals`: Does not equal</li>
<li>`exist`: Exists</li>
<li>`notexist`: Does not exist</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator. Valid values:
<li>`equal`: Equal</li>
<li>`notEquals`: Does not equal</li>
<li>`exist`: Exists</li>
<li>`notexist`: Does not exist</li>
     * @param Operator Operator. Valid values:
<li>`equal`: Equal</li>
<li>`notEquals`: Does not equal</li>
<li>`exist`: Exists</li>
<li>`notexist`: Does not exist</li>
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
     * Get Parameter values for corresponding matching types. It is allowed to pass an empty array only when the matching type is query_string or request_header and the operator value is exist or not exist. Corresponding match types include:
<li>extension: File suffix such as jpg or txt;</li>
<li> filename: For example, foo in foo.jpg;</li>
<li> all (any request under the site): all;</li>
<li> host: The host under the current site. For example, www.maxx55.com;</li>
<li> URL path: The request for a URL path under the current site. For example, /example;</li>
<li> URL full: The request for a complete URL under the current site, including the HTTP protocol, the host, and the path. For example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> query_string: The parameter value in the query string of the requested URL under the current site. For example, cn and 1 in lang=cn&version=1;</li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li> request_protocol: The protocol of the current request. Valid values: HTTP and HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li> 
     * @return Values Parameter values for corresponding matching types. It is allowed to pass an empty array only when the matching type is query_string or request_header and the operator value is exist or not exist. Corresponding match types include:
<li>extension: File suffix such as jpg or txt;</li>
<li> filename: For example, foo in foo.jpg;</li>
<li> all (any request under the site): all;</li>
<li> host: The host under the current site. For example, www.maxx55.com;</li>
<li> URL path: The request for a URL path under the current site. For example, /example;</li>
<li> URL full: The request for a complete URL under the current site, including the HTTP protocol, the host, and the path. For example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> query_string: The parameter value in the query string of the requested URL under the current site. For example, cn and 1 in lang=cn&version=1;</li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li> request_protocol: The protocol of the current request. Valid values: HTTP and HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Parameter values for corresponding matching types. It is allowed to pass an empty array only when the matching type is query_string or request_header and the operator value is exist or not exist. Corresponding match types include:
<li>extension: File suffix such as jpg or txt;</li>
<li> filename: For example, foo in foo.jpg;</li>
<li> all (any request under the site): all;</li>
<li> host: The host under the current site. For example, www.maxx55.com;</li>
<li> URL path: The request for a URL path under the current site. For example, /example;</li>
<li> URL full: The request for a complete URL under the current site, including the HTTP protocol, the host, and the path. For example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> query_string: The parameter value in the query string of the requested URL under the current site. For example, cn and 1 in lang=cn&version=1;</li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li> request_protocol: The protocol of the current request. Valid values: HTTP and HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
     * @param Values Parameter values for corresponding matching types. It is allowed to pass an empty array only when the matching type is query_string or request_header and the operator value is exist or not exist. Corresponding match types include:
<li>extension: File suffix such as jpg or txt;</li>
<li> filename: For example, foo in foo.jpg;</li>
<li> all (any request under the site): all;</li>
<li> host: The host under the current site. For example, www.maxx55.com;</li>
<li> URL path: The request for a URL path under the current site. For example, /example;</li>
<li> URL full: The request for a complete URL under the current site, including the HTTP protocol, the host, and the path. For example: https://www.maxx55.cn/example;</li>
<li> client_country: Country/region identifier compliant with the ISO3166 standard;</li>
<li> query_string: The parameter value in the query string of the requested URL under the current site. For example, cn and 1 in lang=cn&version=1;</li>
<li> request_header: The value of the HTTP request header field. For example, zh-CN,zh;q=0.9 in Accept-Language:zh-CN,zh;q=0.9;</li>
<li> client_ip: The client request IP carried in the current request, which supports IPv4/IPv6 and an IP range;</li>
<li> request_protocol: The protocol of the current request. Valid values: HTTP and HTTPS;</li>
<li> request_method: The method of the current request. Valid values: GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT, OPTIONS, PATCH, COPY, LOCK, MKCOL, MOVE, PROPFIND, PROPPATCH, and UNLOCK. </li>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Whether the parameter value is case insensitive. Default value: false. 
     * @return IgnoreCase Whether the parameter value is case insensitive. Default value: false.
     */
    public Boolean getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set Whether the parameter value is case insensitive. Default value: false.
     * @param IgnoreCase Whether the parameter value is case insensitive. Default value: false.
     */
    public void setIgnoreCase(Boolean IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get The parameter name of the match type. This field is required only when `Target=query_string/request_header`.
<li>`query_string`: Name of the query string, such as "lang" and "version" in "lang=cn&version=1".</li>
<li>`request_header`: Name of the HTTP request header, such as "Accept-Language" in the "Accept-Language:zh-CN,zh;q=0.9" header.</li> 
     * @return Name The parameter name of the match type. This field is required only when `Target=query_string/request_header`.
<li>`query_string`: Name of the query string, such as "lang" and "version" in "lang=cn&version=1".</li>
<li>`request_header`: Name of the HTTP request header, such as "Accept-Language" in the "Accept-Language:zh-CN,zh;q=0.9" header.</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The parameter name of the match type. This field is required only when `Target=query_string/request_header`.
<li>`query_string`: Name of the query string, such as "lang" and "version" in "lang=cn&version=1".</li>
<li>`request_header`: Name of the HTTP request header, such as "Accept-Language" in the "Accept-Language:zh-CN,zh;q=0.9" header.</li>
     * @param Name The parameter name of the match type. This field is required only when `Target=query_string/request_header`.
<li>`query_string`: Name of the query string, such as "lang" and "version" in "lang=cn&version=1".</li>
<li>`request_header`: Name of the HTTP request header, such as "Accept-Language" in the "Accept-Language:zh-CN,zh;q=0.9" header.</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether the parameter name is case insensitive. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IgnoreNameCase Whether the parameter name is case insensitive. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Boolean getIgnoreNameCase() {
        return this.IgnoreNameCase;
    }

    /**
     * Set Whether the parameter name is case insensitive. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IgnoreNameCase Whether the parameter name is case insensitive. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
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

