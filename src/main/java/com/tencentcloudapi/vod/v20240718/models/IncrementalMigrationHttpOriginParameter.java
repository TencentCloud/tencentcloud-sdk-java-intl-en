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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpOriginParameter extends AbstractModel {

    /**
    * HTTP header passthrough information.
    */
    @SerializedName("HttpHeaderInfo")
    @Expose
    private IncrementalMigrationHttpHeaderInfo HttpHeaderInfo;

    /**
    * Back-to-source protocol. Valid values:
<li>HTTP: Force HTTP;</li>
<li>HTTPS: Force HTTPS;</li>
<li>FOLLOW: Follow the request protocol.</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Query string passthrough mode. Valid values
<li>FOLLOW: Fully passthrough;</li>
<li>IGNORE: No passthrough at all.</li>
    */
    @SerializedName("QueryStringFollowMode")
    @Expose
    private String QueryStringFollowMode;

    /**
    * HTTP Code for redirection. Currently, only `301`, `302`, and `307` are supported. The default value is `302`.
    */
    @SerializedName("HttpRedirectCode")
    @Expose
    private Long HttpRedirectCode;

    /**
    * Origin server redirection follow mode. Valid values:
<li>FOLLOW: Follow origin server redirection;</li>
<li>IGNORE: Ignore origin server redirection.</li>
    */
    @SerializedName("OriginRedirectionFollowMode")
    @Expose
    private String OriginRedirectionFollowMode;

    /**
     * Get HTTP header passthrough information. 
     * @return HttpHeaderInfo HTTP header passthrough information.
     */
    public IncrementalMigrationHttpHeaderInfo getHttpHeaderInfo() {
        return this.HttpHeaderInfo;
    }

    /**
     * Set HTTP header passthrough information.
     * @param HttpHeaderInfo HTTP header passthrough information.
     */
    public void setHttpHeaderInfo(IncrementalMigrationHttpHeaderInfo HttpHeaderInfo) {
        this.HttpHeaderInfo = HttpHeaderInfo;
    }

    /**
     * Get Back-to-source protocol. Valid values:
<li>HTTP: Force HTTP;</li>
<li>HTTPS: Force HTTPS;</li>
<li>FOLLOW: Follow the request protocol.</li> 
     * @return Protocol Back-to-source protocol. Valid values:
<li>HTTP: Force HTTP;</li>
<li>HTTPS: Force HTTPS;</li>
<li>FOLLOW: Follow the request protocol.</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Back-to-source protocol. Valid values:
<li>HTTP: Force HTTP;</li>
<li>HTTPS: Force HTTPS;</li>
<li>FOLLOW: Follow the request protocol.</li>
     * @param Protocol Back-to-source protocol. Valid values:
<li>HTTP: Force HTTP;</li>
<li>HTTPS: Force HTTPS;</li>
<li>FOLLOW: Follow the request protocol.</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Query string passthrough mode. Valid values
<li>FOLLOW: Fully passthrough;</li>
<li>IGNORE: No passthrough at all.</li> 
     * @return QueryStringFollowMode Query string passthrough mode. Valid values
<li>FOLLOW: Fully passthrough;</li>
<li>IGNORE: No passthrough at all.</li>
     */
    public String getQueryStringFollowMode() {
        return this.QueryStringFollowMode;
    }

    /**
     * Set Query string passthrough mode. Valid values
<li>FOLLOW: Fully passthrough;</li>
<li>IGNORE: No passthrough at all.</li>
     * @param QueryStringFollowMode Query string passthrough mode. Valid values
<li>FOLLOW: Fully passthrough;</li>
<li>IGNORE: No passthrough at all.</li>
     */
    public void setQueryStringFollowMode(String QueryStringFollowMode) {
        this.QueryStringFollowMode = QueryStringFollowMode;
    }

    /**
     * Get HTTP Code for redirection. Currently, only `301`, `302`, and `307` are supported. The default value is `302`. 
     * @return HttpRedirectCode HTTP Code for redirection. Currently, only `301`, `302`, and `307` are supported. The default value is `302`.
     */
    public Long getHttpRedirectCode() {
        return this.HttpRedirectCode;
    }

    /**
     * Set HTTP Code for redirection. Currently, only `301`, `302`, and `307` are supported. The default value is `302`.
     * @param HttpRedirectCode HTTP Code for redirection. Currently, only `301`, `302`, and `307` are supported. The default value is `302`.
     */
    public void setHttpRedirectCode(Long HttpRedirectCode) {
        this.HttpRedirectCode = HttpRedirectCode;
    }

    /**
     * Get Origin server redirection follow mode. Valid values:
<li>FOLLOW: Follow origin server redirection;</li>
<li>IGNORE: Ignore origin server redirection.</li> 
     * @return OriginRedirectionFollowMode Origin server redirection follow mode. Valid values:
<li>FOLLOW: Follow origin server redirection;</li>
<li>IGNORE: Ignore origin server redirection.</li>
     */
    public String getOriginRedirectionFollowMode() {
        return this.OriginRedirectionFollowMode;
    }

    /**
     * Set Origin server redirection follow mode. Valid values:
<li>FOLLOW: Follow origin server redirection;</li>
<li>IGNORE: Ignore origin server redirection.</li>
     * @param OriginRedirectionFollowMode Origin server redirection follow mode. Valid values:
<li>FOLLOW: Follow origin server redirection;</li>
<li>IGNORE: Ignore origin server redirection.</li>
     */
    public void setOriginRedirectionFollowMode(String OriginRedirectionFollowMode) {
        this.OriginRedirectionFollowMode = OriginRedirectionFollowMode;
    }

    public IncrementalMigrationHttpOriginParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpOriginParameter(IncrementalMigrationHttpOriginParameter source) {
        if (source.HttpHeaderInfo != null) {
            this.HttpHeaderInfo = new IncrementalMigrationHttpHeaderInfo(source.HttpHeaderInfo);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.QueryStringFollowMode != null) {
            this.QueryStringFollowMode = new String(source.QueryStringFollowMode);
        }
        if (source.HttpRedirectCode != null) {
            this.HttpRedirectCode = new Long(source.HttpRedirectCode);
        }
        if (source.OriginRedirectionFollowMode != null) {
            this.OriginRedirectionFollowMode = new String(source.OriginRedirectionFollowMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HttpHeaderInfo.", this.HttpHeaderInfo);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "QueryStringFollowMode", this.QueryStringFollowMode);
        this.setParamSimple(map, prefix + "HttpRedirectCode", this.HttpRedirectCode);
        this.setParamSimple(map, prefix + "OriginRedirectionFollowMode", this.OriginRedirectionFollowMode);

    }
}

