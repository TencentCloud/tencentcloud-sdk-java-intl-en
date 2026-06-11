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

public class SiteFailover extends AbstractModel {

    /**
    * Origin server failover type. Valid values:
<li>FailoverToHost: Fail back to the specified IP/domain.</li>
<li>FailoverToCOS: Fail back to Tencent Cloud COS;</li>
<li>FailoverToS3CompatibleObjectStorage: Fail over to S3-compatible object storage;</li>
<li> FailoverRedirectToURL: Redirect to the specified URL.</li>
<li>FailoverCustomResponsePage: Use a custom response page.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Origin server address, divided into following scenarios based on the Mode value:
<li>When Mode = FailoverToHost, specify an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When Mode = FailoverToCOS, specify the access domain name of the COS bucket;</li>
<li>When Mode = FailoverToS3CompatibleObjectStorage, specify the access domain of the S3 bucket.</li>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Protocol configuration. This parameter is required when Mode value is FailoverToHost. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Using HTTPS protocol;</li>
<li>follow: protocol following.</li>
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP origin port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
    */
    @SerializedName("HTTPOriginPort")
    @Expose
    private Long HTTPOriginPort;

    /**
    * HTTPS origin port, value ranges from 1–65535. This parameter is required when the origin-pull protocol OriginProtocol is https or follow.
    */
    @SerializedName("HTTPSOriginPort")
    @Expose
    private Long HTTPSOriginPort;

    /**
    * Host Header rewrite configuration for origin-pull
    */
    @SerializedName("UpstreamHostHeader")
    @Expose
    private HostHeaderParameters UpstreamHostHeader;

    /**
    * Origin-pull URL rewrite configuration.
    */
    @SerializedName("UpstreamURLRewrite")
    @Expose
    private UpstreamURLRewriteParameters UpstreamURLRewrite;

    /**
    * Origin Requests parameter configuration.
    */
    @SerializedName("UpstreamRequestParameters")
    @Expose
    private UpstreamRequestParameters UpstreamRequestParameters;

    /**
    * HTTP2 origin-pull configuration parameters.
    */
    @SerializedName("UpstreamHTTP2Parameters")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2Parameters;

    /**
    * Specify whether access to the private object storage origin server is allowed. This parameter is required when the origin server type is FailoverToCOS or FailoverToS3CompatibleObjectStorage. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * Private authentication parameter. This parameter is valid only when Mode = FailoverToS3CompatibleObjectStorage and PrivateAccess = on.
    */
    @SerializedName("PrivateParameters")
    @Expose
    private OriginPrivateParameters PrivateParameters;

    /**
    * Redirect target URL. This parameter is required when Mode has a value of FailoverRedirectToURL.
    */
    @SerializedName("RedirectURL")
    @Expose
    private String RedirectURL;

    /**
    * Response page ID. This parameter is required when Mode value is FailoverCustomResponsePage.
    */
    @SerializedName("ResponsePageId")
    @Expose
    private String ResponsePageId;

    /**
    * Response status code. This parameter is required when Mode is a value of FailoverRedirectToURL or FailoverCustomResponsePage. Valid values:
<li>When Mode = FailoverRedirectToURL, the parameter value is one of 301, 302, 303, 307, 308.</li>
<li>When Mode = FailoverCustomResponsePage, the parameter value is one of 400, 403, 404, 405, 414, 416, 451, 500, 501, 502, 503, 504.</li>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
     * Get Origin server failover type. Valid values:
<li>FailoverToHost: Fail back to the specified IP/domain.</li>
<li>FailoverToCOS: Fail back to Tencent Cloud COS;</li>
<li>FailoverToS3CompatibleObjectStorage: Fail over to S3-compatible object storage;</li>
<li> FailoverRedirectToURL: Redirect to the specified URL.</li>
<li>FailoverCustomResponsePage: Use a custom response page.</li> 
     * @return Mode Origin server failover type. Valid values:
<li>FailoverToHost: Fail back to the specified IP/domain.</li>
<li>FailoverToCOS: Fail back to Tencent Cloud COS;</li>
<li>FailoverToS3CompatibleObjectStorage: Fail over to S3-compatible object storage;</li>
<li> FailoverRedirectToURL: Redirect to the specified URL.</li>
<li>FailoverCustomResponsePage: Use a custom response page.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Origin server failover type. Valid values:
<li>FailoverToHost: Fail back to the specified IP/domain.</li>
<li>FailoverToCOS: Fail back to Tencent Cloud COS;</li>
<li>FailoverToS3CompatibleObjectStorage: Fail over to S3-compatible object storage;</li>
<li> FailoverRedirectToURL: Redirect to the specified URL.</li>
<li>FailoverCustomResponsePage: Use a custom response page.</li>
     * @param Mode Origin server failover type. Valid values:
<li>FailoverToHost: Fail back to the specified IP/domain.</li>
<li>FailoverToCOS: Fail back to Tencent Cloud COS;</li>
<li>FailoverToS3CompatibleObjectStorage: Fail over to S3-compatible object storage;</li>
<li> FailoverRedirectToURL: Redirect to the specified URL.</li>
<li>FailoverCustomResponsePage: Use a custom response page.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Origin server address, divided into following scenarios based on the Mode value:
<li>When Mode = FailoverToHost, specify an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When Mode = FailoverToCOS, specify the access domain name of the COS bucket;</li>
<li>When Mode = FailoverToS3CompatibleObjectStorage, specify the access domain of the S3 bucket.</li> 
     * @return Origin Origin server address, divided into following scenarios based on the Mode value:
<li>When Mode = FailoverToHost, specify an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When Mode = FailoverToCOS, specify the access domain name of the COS bucket;</li>
<li>When Mode = FailoverToS3CompatibleObjectStorage, specify the access domain of the S3 bucket.</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, divided into following scenarios based on the Mode value:
<li>When Mode = FailoverToHost, specify an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When Mode = FailoverToCOS, specify the access domain name of the COS bucket;</li>
<li>When Mode = FailoverToS3CompatibleObjectStorage, specify the access domain of the S3 bucket.</li>
     * @param Origin Origin server address, divided into following scenarios based on the Mode value:
<li>When Mode = FailoverToHost, specify an IPV4 address, an IPV6 address, or a domain name;</li>
<li>When Mode = FailoverToCOS, specify the access domain name of the COS bucket;</li>
<li>When Mode = FailoverToS3CompatibleObjectStorage, specify the access domain of the S3 bucket.</li>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Protocol configuration. This parameter is required when Mode value is FailoverToHost. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Using HTTPS protocol;</li>
<li>follow: protocol following.</li> 
     * @return OriginProtocol Protocol configuration. This parameter is required when Mode value is FailoverToHost. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Using HTTPS protocol;</li>
<li>follow: protocol following.</li>
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Protocol configuration. This parameter is required when Mode value is FailoverToHost. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Using HTTPS protocol;</li>
<li>follow: protocol following.</li>
     * @param OriginProtocol Protocol configuration. This parameter is required when Mode value is FailoverToHost. Valid values:
<li>http: use HTTP protocol;</li>
<li>https: Using HTTPS protocol;</li>
<li>follow: protocol following.</li>
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP origin port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow. 
     * @return HTTPOriginPort HTTP origin port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
     */
    public Long getHTTPOriginPort() {
        return this.HTTPOriginPort;
    }

    /**
     * Set HTTP origin port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
     * @param HTTPOriginPort HTTP origin port, value ranges from 1 to 65535. This parameter is required when the origin-pull protocol OriginProtocol is http or follow.
     */
    public void setHTTPOriginPort(Long HTTPOriginPort) {
        this.HTTPOriginPort = HTTPOriginPort;
    }

    /**
     * Get HTTPS origin port, value ranges from 1–65535. This parameter is required when the origin-pull protocol OriginProtocol is https or follow. 
     * @return HTTPSOriginPort HTTPS origin port, value ranges from 1–65535. This parameter is required when the origin-pull protocol OriginProtocol is https or follow.
     */
    public Long getHTTPSOriginPort() {
        return this.HTTPSOriginPort;
    }

    /**
     * Set HTTPS origin port, value ranges from 1–65535. This parameter is required when the origin-pull protocol OriginProtocol is https or follow.
     * @param HTTPSOriginPort HTTPS origin port, value ranges from 1–65535. This parameter is required when the origin-pull protocol OriginProtocol is https or follow.
     */
    public void setHTTPSOriginPort(Long HTTPSOriginPort) {
        this.HTTPSOriginPort = HTTPSOriginPort;
    }

    /**
     * Get Host Header rewrite configuration for origin-pull 
     * @return UpstreamHostHeader Host Header rewrite configuration for origin-pull
     */
    public HostHeaderParameters getUpstreamHostHeader() {
        return this.UpstreamHostHeader;
    }

    /**
     * Set Host Header rewrite configuration for origin-pull
     * @param UpstreamHostHeader Host Header rewrite configuration for origin-pull
     */
    public void setUpstreamHostHeader(HostHeaderParameters UpstreamHostHeader) {
        this.UpstreamHostHeader = UpstreamHostHeader;
    }

    /**
     * Get Origin-pull URL rewrite configuration. 
     * @return UpstreamURLRewrite Origin-pull URL rewrite configuration.
     */
    public UpstreamURLRewriteParameters getUpstreamURLRewrite() {
        return this.UpstreamURLRewrite;
    }

    /**
     * Set Origin-pull URL rewrite configuration.
     * @param UpstreamURLRewrite Origin-pull URL rewrite configuration.
     */
    public void setUpstreamURLRewrite(UpstreamURLRewriteParameters UpstreamURLRewrite) {
        this.UpstreamURLRewrite = UpstreamURLRewrite;
    }

    /**
     * Get Origin Requests parameter configuration. 
     * @return UpstreamRequestParameters Origin Requests parameter configuration.
     */
    public UpstreamRequestParameters getUpstreamRequestParameters() {
        return this.UpstreamRequestParameters;
    }

    /**
     * Set Origin Requests parameter configuration.
     * @param UpstreamRequestParameters Origin Requests parameter configuration.
     */
    public void setUpstreamRequestParameters(UpstreamRequestParameters UpstreamRequestParameters) {
        this.UpstreamRequestParameters = UpstreamRequestParameters;
    }

    /**
     * Get HTTP2 origin-pull configuration parameters. 
     * @return UpstreamHTTP2Parameters HTTP2 origin-pull configuration parameters.
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2Parameters() {
        return this.UpstreamHTTP2Parameters;
    }

    /**
     * Set HTTP2 origin-pull configuration parameters.
     * @param UpstreamHTTP2Parameters HTTP2 origin-pull configuration parameters.
     */
    public void setUpstreamHTTP2Parameters(UpstreamHTTP2Parameters UpstreamHTTP2Parameters) {
        this.UpstreamHTTP2Parameters = UpstreamHTTP2Parameters;
    }

    /**
     * Get Specify whether access to the private object storage origin server is allowed. This parameter is required when the origin server type is FailoverToCOS or FailoverToS3CompatibleObjectStorage. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li> 
     * @return PrivateAccess Specify whether access to the private object storage origin server is allowed. This parameter is required when the origin server type is FailoverToCOS or FailoverToS3CompatibleObjectStorage. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Specify whether access to the private object storage origin server is allowed. This parameter is required when the origin server type is FailoverToCOS or FailoverToS3CompatibleObjectStorage. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
     * @param PrivateAccess Specify whether access to the private object storage origin server is allowed. This parameter is required when the origin server type is FailoverToCOS or FailoverToS3CompatibleObjectStorage. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get Private authentication parameter. This parameter is valid only when Mode = FailoverToS3CompatibleObjectStorage and PrivateAccess = on. 
     * @return PrivateParameters Private authentication parameter. This parameter is valid only when Mode = FailoverToS3CompatibleObjectStorage and PrivateAccess = on.
     */
    public OriginPrivateParameters getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set Private authentication parameter. This parameter is valid only when Mode = FailoverToS3CompatibleObjectStorage and PrivateAccess = on.
     * @param PrivateParameters Private authentication parameter. This parameter is valid only when Mode = FailoverToS3CompatibleObjectStorage and PrivateAccess = on.
     */
    public void setPrivateParameters(OriginPrivateParameters PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    /**
     * Get Redirect target URL. This parameter is required when Mode has a value of FailoverRedirectToURL. 
     * @return RedirectURL Redirect target URL. This parameter is required when Mode has a value of FailoverRedirectToURL.
     */
    public String getRedirectURL() {
        return this.RedirectURL;
    }

    /**
     * Set Redirect target URL. This parameter is required when Mode has a value of FailoverRedirectToURL.
     * @param RedirectURL Redirect target URL. This parameter is required when Mode has a value of FailoverRedirectToURL.
     */
    public void setRedirectURL(String RedirectURL) {
        this.RedirectURL = RedirectURL;
    }

    /**
     * Get Response page ID. This parameter is required when Mode value is FailoverCustomResponsePage. 
     * @return ResponsePageId Response page ID. This parameter is required when Mode value is FailoverCustomResponsePage.
     */
    public String getResponsePageId() {
        return this.ResponsePageId;
    }

    /**
     * Set Response page ID. This parameter is required when Mode value is FailoverCustomResponsePage.
     * @param ResponsePageId Response page ID. This parameter is required when Mode value is FailoverCustomResponsePage.
     */
    public void setResponsePageId(String ResponsePageId) {
        this.ResponsePageId = ResponsePageId;
    }

    /**
     * Get Response status code. This parameter is required when Mode is a value of FailoverRedirectToURL or FailoverCustomResponsePage. Valid values:
<li>When Mode = FailoverRedirectToURL, the parameter value is one of 301, 302, 303, 307, 308.</li>
<li>When Mode = FailoverCustomResponsePage, the parameter value is one of 400, 403, 404, 405, 414, 416, 451, 500, 501, 502, 503, 504.</li> 
     * @return StatusCode Response status code. This parameter is required when Mode is a value of FailoverRedirectToURL or FailoverCustomResponsePage. Valid values:
<li>When Mode = FailoverRedirectToURL, the parameter value is one of 301, 302, 303, 307, 308.</li>
<li>When Mode = FailoverCustomResponsePage, the parameter value is one of 400, 403, 404, 405, 414, 416, 451, 500, 501, 502, 503, 504.</li>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Response status code. This parameter is required when Mode is a value of FailoverRedirectToURL or FailoverCustomResponsePage. Valid values:
<li>When Mode = FailoverRedirectToURL, the parameter value is one of 301, 302, 303, 307, 308.</li>
<li>When Mode = FailoverCustomResponsePage, the parameter value is one of 400, 403, 404, 405, 414, 416, 451, 500, 501, 502, 503, 504.</li>
     * @param StatusCode Response status code. This parameter is required when Mode is a value of FailoverRedirectToURL or FailoverCustomResponsePage. Valid values:
<li>When Mode = FailoverRedirectToURL, the parameter value is one of 301, 302, 303, 307, 308.</li>
<li>When Mode = FailoverCustomResponsePage, the parameter value is one of 400, 403, 404, 405, 414, 416, 451, 500, 501, 502, 503, 504.</li>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    public SiteFailover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SiteFailover(SiteFailover source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.OriginProtocol != null) {
            this.OriginProtocol = new String(source.OriginProtocol);
        }
        if (source.HTTPOriginPort != null) {
            this.HTTPOriginPort = new Long(source.HTTPOriginPort);
        }
        if (source.HTTPSOriginPort != null) {
            this.HTTPSOriginPort = new Long(source.HTTPSOriginPort);
        }
        if (source.UpstreamHostHeader != null) {
            this.UpstreamHostHeader = new HostHeaderParameters(source.UpstreamHostHeader);
        }
        if (source.UpstreamURLRewrite != null) {
            this.UpstreamURLRewrite = new UpstreamURLRewriteParameters(source.UpstreamURLRewrite);
        }
        if (source.UpstreamRequestParameters != null) {
            this.UpstreamRequestParameters = new UpstreamRequestParameters(source.UpstreamRequestParameters);
        }
        if (source.UpstreamHTTP2Parameters != null) {
            this.UpstreamHTTP2Parameters = new UpstreamHTTP2Parameters(source.UpstreamHTTP2Parameters);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new OriginPrivateParameters(source.PrivateParameters);
        }
        if (source.RedirectURL != null) {
            this.RedirectURL = new String(source.RedirectURL);
        }
        if (source.ResponsePageId != null) {
            this.ResponsePageId = new String(source.ResponsePageId);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HTTPOriginPort", this.HTTPOriginPort);
        this.setParamSimple(map, prefix + "HTTPSOriginPort", this.HTTPSOriginPort);
        this.setParamObj(map, prefix + "UpstreamHostHeader.", this.UpstreamHostHeader);
        this.setParamObj(map, prefix + "UpstreamURLRewrite.", this.UpstreamURLRewrite);
        this.setParamObj(map, prefix + "UpstreamRequestParameters.", this.UpstreamRequestParameters);
        this.setParamObj(map, prefix + "UpstreamHTTP2Parameters.", this.UpstreamHTTP2Parameters);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamObj(map, prefix + "PrivateParameters.", this.PrivateParameters);
        this.setParamSimple(map, prefix + "RedirectURL", this.RedirectURL);
        this.setParamSimple(map, prefix + "ResponsePageId", this.ResponsePageId);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);

    }
}

