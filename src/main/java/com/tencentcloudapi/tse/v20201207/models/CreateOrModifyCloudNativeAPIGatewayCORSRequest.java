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

public class CreateOrModifyCloudNativeAPIGatewayCORSRequest extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Resource type bound to the cross-origin plug-in: route|service
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * id of the route or service
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * Whether to enable the plug-in
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Cross-Origin Access-Control-Allow-Origin
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * Cross-Origin Access-Control-Allow-Headers header
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * Access-Control-Allow-Methods for CORS
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * Access-Control-Expose-Headers
    */
    @SerializedName("ExposedHeaders")
    @Expose
    private String [] ExposedHeaders;

    /**
    * preflight request cache time
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * Access-Control-Allow-Credentials for CORS
    */
    @SerializedName("Credentials")
    @Expose
    private Boolean Credentials;

    /**
    * Whether to pass through the OPTIONS request to the backend
    */
    @SerializedName("PreFlightContinue")
    @Expose
    private Boolean PreFlightContinue;

    /**
     * Get Gateway ID 
     * @return GatewayId Gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID
     * @param GatewayId Gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Resource type bound to the cross-origin plug-in: route|service 
     * @return SourceType Resource type bound to the cross-origin plug-in: route|service
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Resource type bound to the cross-origin plug-in: route|service
     * @param SourceType Resource type bound to the cross-origin plug-in: route|service
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get id of the route or service 
     * @return SourceId id of the route or service
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set id of the route or service
     * @param SourceId id of the route or service
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get Whether to enable the plug-in 
     * @return Enabled Whether to enable the plug-in
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable the plug-in
     * @param Enabled Whether to enable the plug-in
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Cross-Origin Access-Control-Allow-Origin 
     * @return Origins Cross-Origin Access-Control-Allow-Origin
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Cross-Origin Access-Control-Allow-Origin
     * @param Origins Cross-Origin Access-Control-Allow-Origin
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get Cross-Origin Access-Control-Allow-Headers header 
     * @return Headers Cross-Origin Access-Control-Allow-Headers header
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Cross-Origin Access-Control-Allow-Headers header
     * @param Headers Cross-Origin Access-Control-Allow-Headers header
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Access-Control-Allow-Methods for CORS 
     * @return Methods Access-Control-Allow-Methods for CORS
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set Access-Control-Allow-Methods for CORS
     * @param Methods Access-Control-Allow-Methods for CORS
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get Access-Control-Expose-Headers 
     * @return ExposedHeaders Access-Control-Expose-Headers
     */
    public String [] getExposedHeaders() {
        return this.ExposedHeaders;
    }

    /**
     * Set Access-Control-Expose-Headers
     * @param ExposedHeaders Access-Control-Expose-Headers
     */
    public void setExposedHeaders(String [] ExposedHeaders) {
        this.ExposedHeaders = ExposedHeaders;
    }

    /**
     * Get preflight request cache time 
     * @return MaxAge preflight request cache time
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set preflight request cache time
     * @param MaxAge preflight request cache time
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Access-Control-Allow-Credentials for CORS 
     * @return Credentials Access-Control-Allow-Credentials for CORS
     */
    public Boolean getCredentials() {
        return this.Credentials;
    }

    /**
     * Set Access-Control-Allow-Credentials for CORS
     * @param Credentials Access-Control-Allow-Credentials for CORS
     */
    public void setCredentials(Boolean Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get Whether to pass through the OPTIONS request to the backend 
     * @return PreFlightContinue Whether to pass through the OPTIONS request to the backend
     */
    public Boolean getPreFlightContinue() {
        return this.PreFlightContinue;
    }

    /**
     * Set Whether to pass through the OPTIONS request to the backend
     * @param PreFlightContinue Whether to pass through the OPTIONS request to the backend
     */
    public void setPreFlightContinue(Boolean PreFlightContinue) {
        this.PreFlightContinue = PreFlightContinue;
    }

    public CreateOrModifyCloudNativeAPIGatewayCORSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrModifyCloudNativeAPIGatewayCORSRequest(CreateOrModifyCloudNativeAPIGatewayCORSRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
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
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
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

