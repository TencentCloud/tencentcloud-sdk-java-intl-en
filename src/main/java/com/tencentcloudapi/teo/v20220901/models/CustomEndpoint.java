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

public class CustomEndpoint extends AbstractModel {

    /**
    * The address of the custom HTTP interface for real-time log delivery. Currently, only HTTP and HTTPS protocols are supported.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Specifies the custom SecretId for generating an encrypted signature. This parameter is required if the origin server needs authentication.
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * Specifies the custom SecretKey for generating an encrypted signature. This parameter is required if the origin server needs authentication.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * The type of data compression. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
    * The type of the application layer protocol used when POST requests log delivery. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this field is not filled in, the protocol type will be parsed from the URL field.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The custom request header carried during log delivery. If the header name you fill in is the default header carried by EdgeOne log delivery such as Content-Type, then the header value you fill in will override the default value. The header value supports referring to a single variable ${batchSize} to obtain the number of log entries included in each POST request.
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
     * Get The address of the custom HTTP interface for real-time log delivery. Currently, only HTTP and HTTPS protocols are supported. 
     * @return Url The address of the custom HTTP interface for real-time log delivery. Currently, only HTTP and HTTPS protocols are supported.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The address of the custom HTTP interface for real-time log delivery. Currently, only HTTP and HTTPS protocols are supported.
     * @param Url The address of the custom HTTP interface for real-time log delivery. Currently, only HTTP and HTTPS protocols are supported.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Specifies the custom SecretId for generating an encrypted signature. This parameter is required if the origin server needs authentication. 
     * @return AccessId Specifies the custom SecretId for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set Specifies the custom SecretId for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     * @param AccessId Specifies the custom SecretId for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get Specifies the custom SecretKey for generating an encrypted signature. This parameter is required if the origin server needs authentication. 
     * @return AccessKey Specifies the custom SecretKey for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Specifies the custom SecretKey for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     * @param AccessKey Specifies the custom SecretKey for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get The type of data compression. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled. 
     * @return CompressType The type of data compression. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set The type of data compression. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
     * @param CompressType The type of data compression. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    /**
     * Get The type of the application layer protocol used when POST requests log delivery. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this field is not filled in, the protocol type will be parsed from the URL field. 
     * @return Protocol The type of the application layer protocol used when POST requests log delivery. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this field is not filled in, the protocol type will be parsed from the URL field.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The type of the application layer protocol used when POST requests log delivery. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this field is not filled in, the protocol type will be parsed from the URL field.
     * @param Protocol The type of the application layer protocol used when POST requests log delivery. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this field is not filled in, the protocol type will be parsed from the URL field.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The custom request header carried during log delivery. If the header name you fill in is the default header carried by EdgeOne log delivery such as Content-Type, then the header value you fill in will override the default value. The header value supports referring to a single variable ${batchSize} to obtain the number of log entries included in each POST request. 
     * @return Headers The custom request header carried during log delivery. If the header name you fill in is the default header carried by EdgeOne log delivery such as Content-Type, then the header value you fill in will override the default value. The header value supports referring to a single variable ${batchSize} to obtain the number of log entries included in each POST request.
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set The custom request header carried during log delivery. If the header name you fill in is the default header carried by EdgeOne log delivery such as Content-Type, then the header value you fill in will override the default value. The header value supports referring to a single variable ${batchSize} to obtain the number of log entries included in each POST request.
     * @param Headers The custom request header carried during log delivery. If the header name you fill in is the default header carried by EdgeOne log delivery such as Content-Type, then the header value you fill in will override the default value. The header value supports referring to a single variable ${batchSize} to obtain the number of log entries included in each POST request.
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    public CustomEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomEndpoint(CustomEndpoint source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Headers != null) {
            this.Headers = new Header[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new Header(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

