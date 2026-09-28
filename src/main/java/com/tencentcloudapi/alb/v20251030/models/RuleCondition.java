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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCondition extends AbstractModel {

    /**
    * Forwarding condition type. Valid values:
Host: host.
Path: Path.
Header: HTTP header field.
QueryString: HTTP query string.
Method: Request method.
Cookie:Cookie.
SourceIp: Source IP.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cookie configuration.
    */
    @SerializedName("CookieConfig")
    @Expose
    private HTTPCookieInfo [] CookieConfig;

    /**
    * HTTP Header configuration.
    */
    @SerializedName("HeaderConfig")
    @Expose
    private HTTPHeaderInfo HeaderConfig;

    /**
    * Host name. The host configuration can only appear once in a rule, with a length of 3 to 128 characters. It supports exact match, regular expression matching, and wildcard matching.
It cannot start or end with a half-width period (.) or underscore (_).
Exact match. Supported character sets: a-z 0-9 . - _ .
Regular expression matching. A value that begins with a tilde (~) indicates regular expression matching. Supported character sets: a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] .
Wildcard matching. An asterisk (*) matches multiple characters, and a half-width question mark (?) matches any single character. Supported character sets: a-z 0-9 . - _ * ?.
    */
    @SerializedName("HostConfig")
    @Expose
    private String [] HostConfig;

    /**
    * Request method. Parameter values: HEAD, GET, POST, OPTIONS, PUT, PATCH, DELETE.
    */
    @SerializedName("MethodConfig")
    @Expose
    private String [] MethodConfig;

    /**
    * Forwarding path. Length: 1–128 characters. Supports exact matching, regular expression matching, and wildcard matching.
Exact match. Supported character sets: a-z A-Z 0-9 . - _ / = :.
For regular expression matching, it must start with `~`. A `~` at the beginning means case-sensitive, and `~*` at the beginning means case-insensitive. Supported character sets: a-z A-Z 0-9 . - _ / = ? ~ ^ * $ : ( ) [ ] + |.
Wildcard matching. * means multiple character wildcard, and ? means any single character wildcard. Supported character sets: a-z A-Z 0-9 . - _ / = :.
    */
    @SerializedName("PathConfig")
    @Expose
    private String [] PathConfig;

    /**
    * Query string configuration.
    */
    @SerializedName("QueryStringConfig")
    @Expose
    private HTTPQueryStringInfo [] QueryStringConfig;

    /**
    * Source IP matching configuration. CIDR format, IP address x.x.x.x/32, IP range x.x.x.x/24.
    */
    @SerializedName("SourceIpConfig")
    @Expose
    private String [] SourceIpConfig;

    /**
     * Get Forwarding condition type. Valid values:
Host: host.
Path: Path.
Header: HTTP header field.
QueryString: HTTP query string.
Method: Request method.
Cookie:Cookie.
SourceIp: Source IP. 
     * @return Type Forwarding condition type. Valid values:
Host: host.
Path: Path.
Header: HTTP header field.
QueryString: HTTP query string.
Method: Request method.
Cookie:Cookie.
SourceIp: Source IP.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Forwarding condition type. Valid values:
Host: host.
Path: Path.
Header: HTTP header field.
QueryString: HTTP query string.
Method: Request method.
Cookie:Cookie.
SourceIp: Source IP.
     * @param Type Forwarding condition type. Valid values:
Host: host.
Path: Path.
Header: HTTP header field.
QueryString: HTTP query string.
Method: Request method.
Cookie:Cookie.
SourceIp: Source IP.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cookie configuration. 
     * @return CookieConfig Cookie configuration.
     */
    public HTTPCookieInfo [] getCookieConfig() {
        return this.CookieConfig;
    }

    /**
     * Set Cookie configuration.
     * @param CookieConfig Cookie configuration.
     */
    public void setCookieConfig(HTTPCookieInfo [] CookieConfig) {
        this.CookieConfig = CookieConfig;
    }

    /**
     * Get HTTP Header configuration. 
     * @return HeaderConfig HTTP Header configuration.
     */
    public HTTPHeaderInfo getHeaderConfig() {
        return this.HeaderConfig;
    }

    /**
     * Set HTTP Header configuration.
     * @param HeaderConfig HTTP Header configuration.
     */
    public void setHeaderConfig(HTTPHeaderInfo HeaderConfig) {
        this.HeaderConfig = HeaderConfig;
    }

    /**
     * Get Host name. The host configuration can only appear once in a rule, with a length of 3 to 128 characters. It supports exact match, regular expression matching, and wildcard matching.
It cannot start or end with a half-width period (.) or underscore (_).
Exact match. Supported character sets: a-z 0-9 . - _ .
Regular expression matching. A value that begins with a tilde (~) indicates regular expression matching. Supported character sets: a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] .
Wildcard matching. An asterisk (*) matches multiple characters, and a half-width question mark (?) matches any single character. Supported character sets: a-z 0-9 . - _ * ?. 
     * @return HostConfig Host name. The host configuration can only appear once in a rule, with a length of 3 to 128 characters. It supports exact match, regular expression matching, and wildcard matching.
It cannot start or end with a half-width period (.) or underscore (_).
Exact match. Supported character sets: a-z 0-9 . - _ .
Regular expression matching. A value that begins with a tilde (~) indicates regular expression matching. Supported character sets: a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] .
Wildcard matching. An asterisk (*) matches multiple characters, and a half-width question mark (?) matches any single character. Supported character sets: a-z 0-9 . - _ * ?.
     */
    public String [] getHostConfig() {
        return this.HostConfig;
    }

    /**
     * Set Host name. The host configuration can only appear once in a rule, with a length of 3 to 128 characters. It supports exact match, regular expression matching, and wildcard matching.
It cannot start or end with a half-width period (.) or underscore (_).
Exact match. Supported character sets: a-z 0-9 . - _ .
Regular expression matching. A value that begins with a tilde (~) indicates regular expression matching. Supported character sets: a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] .
Wildcard matching. An asterisk (*) matches multiple characters, and a half-width question mark (?) matches any single character. Supported character sets: a-z 0-9 . - _ * ?.
     * @param HostConfig Host name. The host configuration can only appear once in a rule, with a length of 3 to 128 characters. It supports exact match, regular expression matching, and wildcard matching.
It cannot start or end with a half-width period (.) or underscore (_).
Exact match. Supported character sets: a-z 0-9 . - _ .
Regular expression matching. A value that begins with a tilde (~) indicates regular expression matching. Supported character sets: a-z 0-9 . - ? = ~ _ - + \ ^ * ! $ & | ( ) [ ] .
Wildcard matching. An asterisk (*) matches multiple characters, and a half-width question mark (?) matches any single character. Supported character sets: a-z 0-9 . - _ * ?.
     */
    public void setHostConfig(String [] HostConfig) {
        this.HostConfig = HostConfig;
    }

    /**
     * Get Request method. Parameter values: HEAD, GET, POST, OPTIONS, PUT, PATCH, DELETE. 
     * @return MethodConfig Request method. Parameter values: HEAD, GET, POST, OPTIONS, PUT, PATCH, DELETE.
     */
    public String [] getMethodConfig() {
        return this.MethodConfig;
    }

    /**
     * Set Request method. Parameter values: HEAD, GET, POST, OPTIONS, PUT, PATCH, DELETE.
     * @param MethodConfig Request method. Parameter values: HEAD, GET, POST, OPTIONS, PUT, PATCH, DELETE.
     */
    public void setMethodConfig(String [] MethodConfig) {
        this.MethodConfig = MethodConfig;
    }

    /**
     * Get Forwarding path. Length: 1–128 characters. Supports exact matching, regular expression matching, and wildcard matching.
Exact match. Supported character sets: a-z A-Z 0-9 . - _ / = :.
For regular expression matching, it must start with `~`. A `~` at the beginning means case-sensitive, and `~*` at the beginning means case-insensitive. Supported character sets: a-z A-Z 0-9 . - _ / = ? ~ ^ * $ : ( ) [ ] + |.
Wildcard matching. * means multiple character wildcard, and ? means any single character wildcard. Supported character sets: a-z A-Z 0-9 . - _ / = :. 
     * @return PathConfig Forwarding path. Length: 1–128 characters. Supports exact matching, regular expression matching, and wildcard matching.
Exact match. Supported character sets: a-z A-Z 0-9 . - _ / = :.
For regular expression matching, it must start with `~`. A `~` at the beginning means case-sensitive, and `~*` at the beginning means case-insensitive. Supported character sets: a-z A-Z 0-9 . - _ / = ? ~ ^ * $ : ( ) [ ] + |.
Wildcard matching. * means multiple character wildcard, and ? means any single character wildcard. Supported character sets: a-z A-Z 0-9 . - _ / = :.
     */
    public String [] getPathConfig() {
        return this.PathConfig;
    }

    /**
     * Set Forwarding path. Length: 1–128 characters. Supports exact matching, regular expression matching, and wildcard matching.
Exact match. Supported character sets: a-z A-Z 0-9 . - _ / = :.
For regular expression matching, it must start with `~`. A `~` at the beginning means case-sensitive, and `~*` at the beginning means case-insensitive. Supported character sets: a-z A-Z 0-9 . - _ / = ? ~ ^ * $ : ( ) [ ] + |.
Wildcard matching. * means multiple character wildcard, and ? means any single character wildcard. Supported character sets: a-z A-Z 0-9 . - _ / = :.
     * @param PathConfig Forwarding path. Length: 1–128 characters. Supports exact matching, regular expression matching, and wildcard matching.
Exact match. Supported character sets: a-z A-Z 0-9 . - _ / = :.
For regular expression matching, it must start with `~`. A `~` at the beginning means case-sensitive, and `~*` at the beginning means case-insensitive. Supported character sets: a-z A-Z 0-9 . - _ / = ? ~ ^ * $ : ( ) [ ] + |.
Wildcard matching. * means multiple character wildcard, and ? means any single character wildcard. Supported character sets: a-z A-Z 0-9 . - _ / = :.
     */
    public void setPathConfig(String [] PathConfig) {
        this.PathConfig = PathConfig;
    }

    /**
     * Get Query string configuration. 
     * @return QueryStringConfig Query string configuration.
     */
    public HTTPQueryStringInfo [] getQueryStringConfig() {
        return this.QueryStringConfig;
    }

    /**
     * Set Query string configuration.
     * @param QueryStringConfig Query string configuration.
     */
    public void setQueryStringConfig(HTTPQueryStringInfo [] QueryStringConfig) {
        this.QueryStringConfig = QueryStringConfig;
    }

    /**
     * Get Source IP matching configuration. CIDR format, IP address x.x.x.x/32, IP range x.x.x.x/24. 
     * @return SourceIpConfig Source IP matching configuration. CIDR format, IP address x.x.x.x/32, IP range x.x.x.x/24.
     */
    public String [] getSourceIpConfig() {
        return this.SourceIpConfig;
    }

    /**
     * Set Source IP matching configuration. CIDR format, IP address x.x.x.x/32, IP range x.x.x.x/24.
     * @param SourceIpConfig Source IP matching configuration. CIDR format, IP address x.x.x.x/32, IP range x.x.x.x/24.
     */
    public void setSourceIpConfig(String [] SourceIpConfig) {
        this.SourceIpConfig = SourceIpConfig;
    }

    public RuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCondition(RuleCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CookieConfig != null) {
            this.CookieConfig = new HTTPCookieInfo[source.CookieConfig.length];
            for (int i = 0; i < source.CookieConfig.length; i++) {
                this.CookieConfig[i] = new HTTPCookieInfo(source.CookieConfig[i]);
            }
        }
        if (source.HeaderConfig != null) {
            this.HeaderConfig = new HTTPHeaderInfo(source.HeaderConfig);
        }
        if (source.HostConfig != null) {
            this.HostConfig = new String[source.HostConfig.length];
            for (int i = 0; i < source.HostConfig.length; i++) {
                this.HostConfig[i] = new String(source.HostConfig[i]);
            }
        }
        if (source.MethodConfig != null) {
            this.MethodConfig = new String[source.MethodConfig.length];
            for (int i = 0; i < source.MethodConfig.length; i++) {
                this.MethodConfig[i] = new String(source.MethodConfig[i]);
            }
        }
        if (source.PathConfig != null) {
            this.PathConfig = new String[source.PathConfig.length];
            for (int i = 0; i < source.PathConfig.length; i++) {
                this.PathConfig[i] = new String(source.PathConfig[i]);
            }
        }
        if (source.QueryStringConfig != null) {
            this.QueryStringConfig = new HTTPQueryStringInfo[source.QueryStringConfig.length];
            for (int i = 0; i < source.QueryStringConfig.length; i++) {
                this.QueryStringConfig[i] = new HTTPQueryStringInfo(source.QueryStringConfig[i]);
            }
        }
        if (source.SourceIpConfig != null) {
            this.SourceIpConfig = new String[source.SourceIpConfig.length];
            for (int i = 0; i < source.SourceIpConfig.length; i++) {
                this.SourceIpConfig[i] = new String(source.SourceIpConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "CookieConfig.", this.CookieConfig);
        this.setParamObj(map, prefix + "HeaderConfig.", this.HeaderConfig);
        this.setParamArraySimple(map, prefix + "HostConfig.", this.HostConfig);
        this.setParamArraySimple(map, prefix + "MethodConfig.", this.MethodConfig);
        this.setParamArraySimple(map, prefix + "PathConfig.", this.PathConfig);
        this.setParamArrayObj(map, prefix + "QueryStringConfig.", this.QueryStringConfig);
        this.setParamArraySimple(map, prefix + "SourceIpConfig.", this.SourceIpConfig);

    }
}

