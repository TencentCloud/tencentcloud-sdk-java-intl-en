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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathRule extends AbstractModel{

    /**
    * Whether to enable wildcard match (`*`).
false: disable
true: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Regex")
    @Expose
    private Boolean Regex;

    /**
    * Matched URL. Only URLs are supported, while parameters are not. The exact match is used by default. If wildcard match is enabled, up to 5 wildcards are supported. The URL can contain up to 1,024 characters.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Origin server when the path matches. COS origin with private read/write is not supported. The default origin server will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Origin server host header when the path matches. The default `ServerName` will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * Origin server region. Valid values: `CN` and `OV`.
CN: the Chinese mainland
OV: outside the Chinese mainland
Default value: `CN`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginArea")
    @Expose
    private String OriginArea;

    /**
    * Origin server URI path when the path matches, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the match path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ForwardUri")
    @Expose
    private String ForwardUri;

    /**
    * Origin-pull header setting when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("RequestHeaders")
    @Expose
    private HttpHeaderRule [] RequestHeaders;

    /**
     * Get Whether to enable wildcard match (`*`).
false: disable
true: enable
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Regex Whether to enable wildcard match (`*`).
false: disable
true: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getRegex() {
        return this.Regex;
    }

    /**
     * Set Whether to enable wildcard match (`*`).
false: disable
true: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Regex Whether to enable wildcard match (`*`).
false: disable
true: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegex(Boolean Regex) {
        this.Regex = Regex;
    }

    /**
     * Get Matched URL. Only URLs are supported, while parameters are not. The exact match is used by default. If wildcard match is enabled, up to 5 wildcards are supported. The URL can contain up to 1,024 characters.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Path Matched URL. Only URLs are supported, while parameters are not. The exact match is used by default. If wildcard match is enabled, up to 5 wildcards are supported. The URL can contain up to 1,024 characters.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Matched URL. Only URLs are supported, while parameters are not. The exact match is used by default. If wildcard match is enabled, up to 5 wildcards are supported. The URL can contain up to 1,024 characters.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Path Matched URL. Only URLs are supported, while parameters are not. The exact match is used by default. If wildcard match is enabled, up to 5 wildcards are supported. The URL can contain up to 1,024 characters.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Origin server when the path matches. COS origin with private read/write is not supported. The default origin server will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Origin Origin server when the path matches. COS origin with private read/write is not supported. The default origin server will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server when the path matches. COS origin with private read/write is not supported. The default origin server will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Origin Origin server when the path matches. COS origin with private read/write is not supported. The default origin server will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Origin server host header when the path matches. The default `ServerName` will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ServerName Origin server host header when the path matches. The default `ServerName` will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set Origin server host header when the path matches. The default `ServerName` will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ServerName Origin server host header when the path matches. The default `ServerName` will be used by default when this field is left empty.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get Origin server region. Valid values: `CN` and `OV`.
CN: the Chinese mainland
OV: outside the Chinese mainland
Default value: `CN`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return OriginArea Origin server region. Valid values: `CN` and `OV`.
CN: the Chinese mainland
OV: outside the Chinese mainland
Default value: `CN`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOriginArea() {
        return this.OriginArea;
    }

    /**
     * Set Origin server region. Valid values: `CN` and `OV`.
CN: the Chinese mainland
OV: outside the Chinese mainland
Default value: `CN`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param OriginArea Origin server region. Valid values: `CN` and `OV`.
CN: the Chinese mainland
OV: outside the Chinese mainland
Default value: `CN`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOriginArea(String OriginArea) {
        this.OriginArea = OriginArea;
    }

    /**
     * Get Origin server URI path when the path matches, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the match path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ForwardUri Origin server URI path when the path matches, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the match path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getForwardUri() {
        return this.ForwardUri;
    }

    /**
     * Set Origin server URI path when the path matches, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the match path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ForwardUri Origin server URI path when the path matches, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the match path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setForwardUri(String ForwardUri) {
        this.ForwardUri = ForwardUri;
    }

    /**
     * Get Origin-pull header setting when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return RequestHeaders Origin-pull header setting when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public HttpHeaderRule [] getRequestHeaders() {
        return this.RequestHeaders;
    }

    /**
     * Set Origin-pull header setting when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param RequestHeaders Origin-pull header setting when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRequestHeaders(HttpHeaderRule [] RequestHeaders) {
        this.RequestHeaders = RequestHeaders;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "OriginArea", this.OriginArea);
        this.setParamSimple(map, prefix + "ForwardUri", this.ForwardUri);
        this.setParamArrayObj(map, prefix + "RequestHeaders.", this.RequestHeaders);

    }
}

