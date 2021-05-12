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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateBucketCORSOptRequest extends AbstractModel{

    /**
    * Allowed access source. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
    */
    @SerializedName("AllowedOrigins")
    @Expose
    private String [] AllowedOrigins;

    /**
    * Allowed HTTP method(s). Multiple methods are allowed, including PUT, GET, POST, and HEAD. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
    */
    @SerializedName("AllowedMethods")
    @Expose
    private String [] AllowedMethods;

    /**
    * Specifies the custom HTTP request headers that the browser is allowed to include in a CORS request. Wildcard (*) is supported, indicating allowing all headers (recommended). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
    */
    @SerializedName("AllowedHeaders")
    @Expose
    private String [] AllowedHeaders;

    /**
    * Sets the validity duration for the CORS configuration (in second). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
    */
    @SerializedName("MaxAgeSeconds")
    @Expose
    private Long MaxAgeSeconds;

    /**
    * CORS response header(s) that can be exposed to the browser, case-insensitive. If this parameter is not specified, the browser can access only simple response headers Cache-Control, Content-Type, Expires, and Last-Modified by default. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
    */
    @SerializedName("ExposeHeaders")
    @Expose
    private String [] ExposeHeaders;

    /**
     * Get Allowed access source. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1). 
     * @return AllowedOrigins Allowed access source. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public String [] getAllowedOrigins() {
        return this.AllowedOrigins;
    }

    /**
     * Set Allowed access source. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     * @param AllowedOrigins Allowed access source. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public void setAllowedOrigins(String [] AllowedOrigins) {
        this.AllowedOrigins = AllowedOrigins;
    }

    /**
     * Get Allowed HTTP method(s). Multiple methods are allowed, including PUT, GET, POST, and HEAD. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1). 
     * @return AllowedMethods Allowed HTTP method(s). Multiple methods are allowed, including PUT, GET, POST, and HEAD. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public String [] getAllowedMethods() {
        return this.AllowedMethods;
    }

    /**
     * Set Allowed HTTP method(s). Multiple methods are allowed, including PUT, GET, POST, and HEAD. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     * @param AllowedMethods Allowed HTTP method(s). Multiple methods are allowed, including PUT, GET, POST, and HEAD. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public void setAllowedMethods(String [] AllowedMethods) {
        this.AllowedMethods = AllowedMethods;
    }

    /**
     * Get Specifies the custom HTTP request headers that the browser is allowed to include in a CORS request. Wildcard (*) is supported, indicating allowing all headers (recommended). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1). 
     * @return AllowedHeaders Specifies the custom HTTP request headers that the browser is allowed to include in a CORS request. Wildcard (*) is supported, indicating allowing all headers (recommended). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public String [] getAllowedHeaders() {
        return this.AllowedHeaders;
    }

    /**
     * Set Specifies the custom HTTP request headers that the browser is allowed to include in a CORS request. Wildcard (*) is supported, indicating allowing all headers (recommended). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     * @param AllowedHeaders Specifies the custom HTTP request headers that the browser is allowed to include in a CORS request. Wildcard (*) is supported, indicating allowing all headers (recommended). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public void setAllowedHeaders(String [] AllowedHeaders) {
        this.AllowedHeaders = AllowedHeaders;
    }

    /**
     * Get Sets the validity duration for the CORS configuration (in second). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1). 
     * @return MaxAgeSeconds Sets the validity duration for the CORS configuration (in second). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public Long getMaxAgeSeconds() {
        return this.MaxAgeSeconds;
    }

    /**
     * Set Sets the validity duration for the CORS configuration (in second). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     * @param MaxAgeSeconds Sets the validity duration for the CORS configuration (in second). For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public void setMaxAgeSeconds(Long MaxAgeSeconds) {
        this.MaxAgeSeconds = MaxAgeSeconds;
    }

    /**
     * Get CORS response header(s) that can be exposed to the browser, case-insensitive. If this parameter is not specified, the browser can access only simple response headers Cache-Control, Content-Type, Expires, and Last-Modified by default. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1). 
     * @return ExposeHeaders CORS response header(s) that can be exposed to the browser, case-insensitive. If this parameter is not specified, the browser can access only simple response headers Cache-Control, Content-Type, Expires, and Last-Modified by default. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public String [] getExposeHeaders() {
        return this.ExposeHeaders;
    }

    /**
     * Set CORS response header(s) that can be exposed to the browser, case-insensitive. If this parameter is not specified, the browser can access only simple response headers Cache-Control, Content-Type, Expires, and Last-Modified by default. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     * @param ExposeHeaders CORS response header(s) that can be exposed to the browser, case-insensitive. If this parameter is not specified, the browser can access only simple response headers Cache-Control, Content-Type, Expires, and Last-Modified by default. For details, see [COS Documentation](https://intl.cloud.tencent.com/document/product/436/8279?from_cn_redirect=1).
     */
    public void setExposeHeaders(String [] ExposeHeaders) {
        this.ExposeHeaders = ExposeHeaders;
    }

    public UpdateBucketCORSOptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBucketCORSOptRequest(UpdateBucketCORSOptRequest source) {
        if (source.AllowedOrigins != null) {
            this.AllowedOrigins = new String[source.AllowedOrigins.length];
            for (int i = 0; i < source.AllowedOrigins.length; i++) {
                this.AllowedOrigins[i] = new String(source.AllowedOrigins[i]);
            }
        }
        if (source.AllowedMethods != null) {
            this.AllowedMethods = new String[source.AllowedMethods.length];
            for (int i = 0; i < source.AllowedMethods.length; i++) {
                this.AllowedMethods[i] = new String(source.AllowedMethods[i]);
            }
        }
        if (source.AllowedHeaders != null) {
            this.AllowedHeaders = new String[source.AllowedHeaders.length];
            for (int i = 0; i < source.AllowedHeaders.length; i++) {
                this.AllowedHeaders[i] = new String(source.AllowedHeaders[i]);
            }
        }
        if (source.MaxAgeSeconds != null) {
            this.MaxAgeSeconds = new Long(source.MaxAgeSeconds);
        }
        if (source.ExposeHeaders != null) {
            this.ExposeHeaders = new String[source.ExposeHeaders.length];
            for (int i = 0; i < source.ExposeHeaders.length; i++) {
                this.ExposeHeaders[i] = new String(source.ExposeHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AllowedOrigins.", this.AllowedOrigins);
        this.setParamArraySimple(map, prefix + "AllowedMethods.", this.AllowedMethods);
        this.setParamArraySimple(map, prefix + "AllowedHeaders.", this.AllowedHeaders);
        this.setParamSimple(map, prefix + "MaxAgeSeconds", this.MaxAgeSeconds);
        this.setParamArraySimple(map, prefix + "ExposeHeaders.", this.ExposeHeaders);

    }
}

