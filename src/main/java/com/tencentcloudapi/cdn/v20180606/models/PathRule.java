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
    * Whether regex match is used.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Regex")
    @Expose
    private Boolean Regex;

    /**
    * The matched URL path
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Origin-pull server when the path matches. COS source with private read/write is not supported.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Origin-pull host when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * The region of origin server. Valid values: `CN` (mainland China), `OV` (outside mainland China)
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("OriginArea")
    @Expose
    private String OriginArea;

    /**
    * Origin-pull URI path when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
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
     * Get Whether regex match is used.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Regex Whether regex match is used.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Boolean getRegex() {
        return this.Regex;
    }

    /**
     * Set Whether regex match is used.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Regex Whether regex match is used.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRegex(Boolean Regex) {
        this.Regex = Regex;
    }

    /**
     * Get The matched URL path
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Path The matched URL path
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set The matched URL path
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Path The matched URL path
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Origin-pull server when the path matches. COS source with private read/write is not supported.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Origin Origin-pull server when the path matches. COS source with private read/write is not supported.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin-pull server when the path matches. COS source with private read/write is not supported.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Origin Origin-pull server when the path matches. COS source with private read/write is not supported.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Origin-pull host when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ServerName Origin-pull host when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set Origin-pull host when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ServerName Origin-pull host when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get The region of origin server. Valid values: `CN` (mainland China), `OV` (outside mainland China)
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return OriginArea The region of origin server. Valid values: `CN` (mainland China), `OV` (outside mainland China)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getOriginArea() {
        return this.OriginArea;
    }

    /**
     * Set The region of origin server. Valid values: `CN` (mainland China), `OV` (outside mainland China)
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param OriginArea The region of origin server. Valid values: `CN` (mainland China), `OV` (outside mainland China)
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setOriginArea(String OriginArea) {
        this.OriginArea = OriginArea;
    }

    /**
     * Get Origin-pull URI path when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ForwardUri Origin-pull URI path when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getForwardUri() {
        return this.ForwardUri;
    }

    /**
     * Set Origin-pull URI path when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ForwardUri Origin-pull URI path when the path matches.
Note: this field may return `null`, indicating that no valid value is obtained.
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

