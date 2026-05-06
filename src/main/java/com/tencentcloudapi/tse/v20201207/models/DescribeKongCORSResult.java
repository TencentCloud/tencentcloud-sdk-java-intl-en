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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKongCORSResult extends AbstractModel {

    /**
    * Resource type.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Resource ID
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * enabled or not
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Cross-origin Origins
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * Cross-Origin Headers
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * Cross-origin Methods
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * Cross-Origin ExposedHeaders
    */
    @SerializedName("ExposedHeaders")
    @Expose
    private String [] ExposedHeaders;

    /**
    * Cache time of cross-origin OPTIONS request
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * Whether cross-origin access requests are allowed to carry identity information
    */
    @SerializedName("Credentials")
    @Expose
    private Boolean Credentials;

    /**
    * Whether to forward cross-origin access requests to the backend
    */
    @SerializedName("PreFlightContinue")
    @Expose
    private Boolean PreFlightContinue;

    /**
     * Get Resource type. 
     * @return SourceType Resource type.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Resource type.
     * @param SourceType Resource type.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Resource ID 
     * @return SourceId Resource ID
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set Resource ID
     * @param SourceId Resource ID
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get enabled or not 
     * @return Enabled enabled or not
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set enabled or not
     * @param Enabled enabled or not
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Cross-origin Origins 
     * @return Origins Cross-origin Origins
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Cross-origin Origins
     * @param Origins Cross-origin Origins
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get Cross-Origin Headers 
     * @return Headers Cross-Origin Headers
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Cross-Origin Headers
     * @param Headers Cross-Origin Headers
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Cross-origin Methods 
     * @return Methods Cross-origin Methods
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set Cross-origin Methods
     * @param Methods Cross-origin Methods
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get Cross-Origin ExposedHeaders 
     * @return ExposedHeaders Cross-Origin ExposedHeaders
     */
    public String [] getExposedHeaders() {
        return this.ExposedHeaders;
    }

    /**
     * Set Cross-Origin ExposedHeaders
     * @param ExposedHeaders Cross-Origin ExposedHeaders
     */
    public void setExposedHeaders(String [] ExposedHeaders) {
        this.ExposedHeaders = ExposedHeaders;
    }

    /**
     * Get Cache time of cross-origin OPTIONS request 
     * @return MaxAge Cache time of cross-origin OPTIONS request
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set Cache time of cross-origin OPTIONS request
     * @param MaxAge Cache time of cross-origin OPTIONS request
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Whether cross-origin access requests are allowed to carry identity information 
     * @return Credentials Whether cross-origin access requests are allowed to carry identity information
     */
    public Boolean getCredentials() {
        return this.Credentials;
    }

    /**
     * Set Whether cross-origin access requests are allowed to carry identity information
     * @param Credentials Whether cross-origin access requests are allowed to carry identity information
     */
    public void setCredentials(Boolean Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get Whether to forward cross-origin access requests to the backend 
     * @return PreFlightContinue Whether to forward cross-origin access requests to the backend
     */
    public Boolean getPreFlightContinue() {
        return this.PreFlightContinue;
    }

    /**
     * Set Whether to forward cross-origin access requests to the backend
     * @param PreFlightContinue Whether to forward cross-origin access requests to the backend
     */
    public void setPreFlightContinue(Boolean PreFlightContinue) {
        this.PreFlightContinue = PreFlightContinue;
    }

    public DescribeKongCORSResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKongCORSResult(DescribeKongCORSResult source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Origins != null) {
            this.Origins = new String[source.Origins.length];
            for (int i = 0; i < source.Origins.length; i++) {
                this.Origins[i] = new String(source.Origins[i]);
            }
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.ExposedHeaders != null) {
            this.ExposedHeaders = new String[source.ExposedHeaders.length];
            for (int i = 0; i < source.ExposedHeaders.length; i++) {
                this.ExposedHeaders[i] = new String(source.ExposedHeaders[i]);
            }
        }
        if (source.MaxAge != null) {
            this.MaxAge = new Long(source.MaxAge);
        }
        if (source.Credentials != null) {
            this.Credentials = new Boolean(source.Credentials);
        }
        if (source.PreFlightContinue != null) {
            this.PreFlightContinue = new Boolean(source.PreFlightContinue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "ExposedHeaders.", this.ExposedHeaders);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "Credentials", this.Credentials);
        this.setParamSimple(map, prefix + "PreFlightContinue", this.PreFlightContinue);

    }
}

