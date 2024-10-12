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
    * Address of the custom HTTP API for real-time log shipping. Currently, only HTTP and HTTPS protocols are supported.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Custom SecretId used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * Custom SecretKey used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Type of data compression. Valid values:<li>gzip: gzip compression.</li>If this parameter is not input, compression is disabled.
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
    * Type of the application layer protocol used in POST requests for log shipping. Valid values: 
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this parameter is not input, the protocol type is parsed from the URL field.	
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Custom request header carried in log shipping. For a header carried by default in EdgeOne log pushing, such as Content-Type, the header value you input will overwrite the default value. The header value references a single variable ${batchSize} to obtain the number of log entries included in each POST request.
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
     * Get Address of the custom HTTP API for real-time log shipping. Currently, only HTTP and HTTPS protocols are supported. 
     * @return Url Address of the custom HTTP API for real-time log shipping. Currently, only HTTP and HTTPS protocols are supported.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Address of the custom HTTP API for real-time log shipping. Currently, only HTTP and HTTPS protocols are supported.
     * @param Url Address of the custom HTTP API for real-time log shipping. Currently, only HTTP and HTTPS protocols are supported.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Custom SecretId used for generating an encrypted signature. This parameter is required if the origin server needs authentication. 
     * @return AccessId Custom SecretId used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set Custom SecretId used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     * @param AccessId Custom SecretId used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get Custom SecretKey used for generating an encrypted signature. This parameter is required if the origin server needs authentication. 
     * @return AccessKey Custom SecretKey used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Custom SecretKey used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     * @param AccessKey Custom SecretKey used for generating an encrypted signature. This parameter is required if the origin server needs authentication.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Type of data compression. Valid values:<li>gzip: gzip compression.</li>If this parameter is not input, compression is disabled. 
     * @return CompressType Type of data compression. Valid values:<li>gzip: gzip compression.</li>If this parameter is not input, compression is disabled.
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set Type of data compression. Valid values:<li>gzip: gzip compression.</li>If this parameter is not input, compression is disabled.
     * @param CompressType Type of data compression. Valid values:<li>gzip: gzip compression.</li>If this parameter is not input, compression is disabled.
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    /**
     * Get Type of the application layer protocol used in POST requests for log shipping. Valid values: 
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this parameter is not input, the protocol type is parsed from the URL field.	 
     * @return Protocol Type of the application layer protocol used in POST requests for log shipping. Valid values: 
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this parameter is not input, the protocol type is parsed from the URL field.	
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Type of the application layer protocol used in POST requests for log shipping. Valid values: 
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this parameter is not input, the protocol type is parsed from the URL field.	
     * @param Protocol Type of the application layer protocol used in POST requests for log shipping. Valid values: 
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol.</li>If this parameter is not input, the protocol type is parsed from the URL field.	
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Custom request header carried in log shipping. For a header carried by default in EdgeOne log pushing, such as Content-Type, the header value you input will overwrite the default value. The header value references a single variable ${batchSize} to obtain the number of log entries included in each POST request. 
     * @return Headers Custom request header carried in log shipping. For a header carried by default in EdgeOne log pushing, such as Content-Type, the header value you input will overwrite the default value. The header value references a single variable ${batchSize} to obtain the number of log entries included in each POST request.
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Custom request header carried in log shipping. For a header carried by default in EdgeOne log pushing, such as Content-Type, the header value you input will overwrite the default value. The header value references a single variable ${batchSize} to obtain the number of log entries included in each POST request.
     * @param Headers Custom request header carried in log shipping. For a header carried by default in EdgeOne log pushing, such as Content-Type, the header value you input will overwrite the default value. The header value references a single variable ${batchSize} to obtain the number of log entries included in each POST request.
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

