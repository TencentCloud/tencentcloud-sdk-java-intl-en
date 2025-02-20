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

public class AccessURLRedirectParameters extends AbstractModel {

    /**
    * Status code. valid values: 301, 302, 303, 307, 308.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * Target request protocol. valid values:.
<Li>Http: target request protocol http;</li>.
<Li>Https: target request protocol https;</li>.
<Li>Follow: follow the request.</li>.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Target hostname.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HostName")
    @Expose
    private HostName HostName;

    /**
    * Target path.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("URLPath")
    @Expose
    private URLPath URLPath;

    /**
    * Carry query parameters.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("QueryString")
    @Expose
    private AccessURLRedirectQueryString QueryString;

    /**
     * Get Status code. valid values: 301, 302, 303, 307, 308. 
     * @return StatusCode Status code. valid values: 301, 302, 303, 307, 308.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Status code. valid values: 301, 302, 303, 307, 308.
     * @param StatusCode Status code. valid values: 301, 302, 303, 307, 308.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Target request protocol. valid values:.
<Li>Http: target request protocol http;</li>.
<Li>Https: target request protocol https;</li>.
<Li>Follow: follow the request.</li>. 
     * @return Protocol Target request protocol. valid values:.
<Li>Http: target request protocol http;</li>.
<Li>Https: target request protocol https;</li>.
<Li>Follow: follow the request.</li>.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Target request protocol. valid values:.
<Li>Http: target request protocol http;</li>.
<Li>Https: target request protocol https;</li>.
<Li>Follow: follow the request.</li>.
     * @param Protocol Target request protocol. valid values:.
<Li>Http: target request protocol http;</li>.
<Li>Https: target request protocol https;</li>.
<Li>Follow: follow the request.</li>.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Target hostname.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return HostName Target hostname.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public HostName getHostName() {
        return this.HostName;
    }

    /**
     * Set Target hostname.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param HostName Target hostname.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHostName(HostName HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Target path.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return URLPath Target path.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public URLPath getURLPath() {
        return this.URLPath;
    }

    /**
     * Set Target path.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param URLPath Target path.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setURLPath(URLPath URLPath) {
        this.URLPath = URLPath;
    }

    /**
     * Get Carry query parameters.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return QueryString Carry query parameters.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public AccessURLRedirectQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Carry query parameters.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param QueryString Carry query parameters.
Note: this field may return null, which indicates a failure to obtain a valid value.
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

