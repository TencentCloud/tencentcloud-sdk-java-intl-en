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

public class AccessURLRedirectParameters extends AbstractModel {

    /**
    * <p>Status code, value is one of 301, 302, 303, 307, 308.</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>Target request protocol.</p><p>Enumeration values:</p><ul><li>http: The target request protocol is HTTP.</li><li>https: The target request protocol is HTTPS.</li><li>follow: Follow request.</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Target HostName.</p>
    */
    @SerializedName("HostName")
    @Expose
    private HostName HostName;

    /**
    * <p>Target path.</p>
    */
    @SerializedName("URLPath")
    @Expose
    private URLPath URLPath;

    /**
    * <p>Query string.</p>
    */
    @SerializedName("QueryString")
    @Expose
    private AccessURLRedirectQueryString QueryString;

    /**
     * Get <p>Status code, value is one of 301, 302, 303, 307, 308.</p> 
     * @return StatusCode <p>Status code, value is one of 301, 302, 303, 307, 308.</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>Status code, value is one of 301, 302, 303, 307, 308.</p>
     * @param StatusCode <p>Status code, value is one of 301, 302, 303, 307, 308.</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>Target request protocol.</p><p>Enumeration values:</p><ul><li>http: The target request protocol is HTTP.</li><li>https: The target request protocol is HTTPS.</li><li>follow: Follow request.</li></ul> 
     * @return Protocol <p>Target request protocol.</p><p>Enumeration values:</p><ul><li>http: The target request protocol is HTTP.</li><li>https: The target request protocol is HTTPS.</li><li>follow: Follow request.</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Target request protocol.</p><p>Enumeration values:</p><ul><li>http: The target request protocol is HTTP.</li><li>https: The target request protocol is HTTPS.</li><li>follow: Follow request.</li></ul>
     * @param Protocol <p>Target request protocol.</p><p>Enumeration values:</p><ul><li>http: The target request protocol is HTTP.</li><li>https: The target request protocol is HTTPS.</li><li>follow: Follow request.</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Target HostName.</p> 
     * @return HostName <p>Target HostName.</p>
     */
    public HostName getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>Target HostName.</p>
     * @param HostName <p>Target HostName.</p>
     */
    public void setHostName(HostName HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>Target path.</p> 
     * @return URLPath <p>Target path.</p>
     */
    public URLPath getURLPath() {
        return this.URLPath;
    }

    /**
     * Set <p>Target path.</p>
     * @param URLPath <p>Target path.</p>
     */
    public void setURLPath(URLPath URLPath) {
        this.URLPath = URLPath;
    }

    /**
     * Get <p>Query string.</p> 
     * @return QueryString <p>Query string.</p>
     */
    public AccessURLRedirectQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>Query string.</p>
     * @param QueryString <p>Query string.</p>
     */
    public void setQueryString(AccessURLRedirectQueryString QueryString) {
        this.QueryString = QueryString;
    }

    public AccessURLRedirectParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessURLRedirectParameters(AccessURLRedirectParameters source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HostName != null) {
            this.HostName = new HostName(source.HostName);
        }
        if (source.URLPath != null) {
            this.URLPath = new URLPath(source.URLPath);
        }
        if (source.QueryString != null) {
            this.QueryString = new AccessURLRedirectQueryString(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HostName.", this.HostName);
        this.setParamObj(map, prefix + "URLPath.", this.URLPath);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);

    }
}

