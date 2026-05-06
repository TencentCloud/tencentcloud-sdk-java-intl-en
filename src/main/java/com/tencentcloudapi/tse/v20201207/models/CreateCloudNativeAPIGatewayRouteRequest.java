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

public class CreateCloudNativeAPIGatewayRouteRequest extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Service ID
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * The name of the route, unique at the instance level, does not need to be provided.
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * Method of route. Available values:
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * Domain of the route
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Path of the route
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * Route protocol, optional
- https
- http
    */
    @SerializedName("Protocols")
    @Expose
    private String [] Protocols;

    /**
    * Preserve Host when forwarding to backend
    */
    @SerializedName("PreserveHost")
    @Expose
    private Boolean PreserveHost;

    /**
    * HTTP redirection status code
    */
    @SerializedName("HttpsRedirectStatusCode")
    @Expose
    private Long HttpsRedirectStatusCode;

    /**
    * StripPath when forwarding to backend
    */
    @SerializedName("StripPath")
    @Expose
    private Boolean StripPath;

    /**
    * Whether to enable mandatory HTTPS
    */
    @SerializedName("ForceHttps")
    @Expose
    private Boolean ForceHttps;

    /**
    * Destination port for Layer 4 match
    */
    @SerializedName("DestinationPorts")
    @Expose
    private Long [] DestinationPorts;

    /**
    * Headers of the route
    */
    @SerializedName("Headers")
    @Expose
    private KVMapping [] Headers;

    /**
    * Whether to cache the request body, default true
    */
    @SerializedName("RequestBuffering")
    @Expose
    private Boolean RequestBuffering;

    /**
    * Whether to cache the response body. Default true
    */
    @SerializedName("ResponseBuffering")
    @Expose
    private Boolean ResponseBuffering;

    /**
    * Regular priority
    */
    @SerializedName("RegexPriority")
    @Expose
    private Long RegexPriority;

    /**
    * queryString parameter
    */
    @SerializedName("QueryStringParameters")
    @Expose
    private KVMapping [] QueryStringParameters;

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
     * Get Service ID 
     * @return ServiceID Service ID
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set Service ID
     * @param ServiceID Service ID
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get The name of the route, unique at the instance level, does not need to be provided. 
     * @return RouteName The name of the route, unique at the instance level, does not need to be provided.
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set The name of the route, unique at the instance level, does not need to be provided.
     * @param RouteName The name of the route, unique at the instance level, does not need to be provided.
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get Method of route. Available values:
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK 
     * @return Methods Method of route. Available values:
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set Method of route. Available values:
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
     * @param Methods Method of route. Available values:
- GET
- POST
- DELETE
- PUT
- OPTIONS
- PATCH
- HEAD
- ANY
- TRACE
- COPY
- MOVE
- PROPFIND
- PROPPATCH
- MKCOL
- LOCK
- UNLOCK
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get Domain of the route 
     * @return Hosts Domain of the route
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Domain of the route
     * @param Hosts Domain of the route
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Path of the route 
     * @return Paths Path of the route
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set Path of the route
     * @param Paths Path of the route
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get Route protocol, optional
- https
- http 
     * @return Protocols Route protocol, optional
- https
- http
     */
    public String [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set Route protocol, optional
- https
- http
     * @param Protocols Route protocol, optional
- https
- http
     */
    public void setProtocols(String [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get Preserve Host when forwarding to backend 
     * @return PreserveHost Preserve Host when forwarding to backend
     */
    public Boolean getPreserveHost() {
        return this.PreserveHost;
    }

    /**
     * Set Preserve Host when forwarding to backend
     * @param PreserveHost Preserve Host when forwarding to backend
     */
    public void setPreserveHost(Boolean PreserveHost) {
        this.PreserveHost = PreserveHost;
    }

    /**
     * Get HTTP redirection status code 
     * @return HttpsRedirectStatusCode HTTP redirection status code
     */
    public Long getHttpsRedirectStatusCode() {
        return this.HttpsRedirectStatusCode;
    }

    /**
     * Set HTTP redirection status code
     * @param HttpsRedirectStatusCode HTTP redirection status code
     */
    public void setHttpsRedirectStatusCode(Long HttpsRedirectStatusCode) {
        this.HttpsRedirectStatusCode = HttpsRedirectStatusCode;
    }

    /**
     * Get StripPath when forwarding to backend 
     * @return StripPath StripPath when forwarding to backend
     */
    public Boolean getStripPath() {
        return this.StripPath;
    }

    /**
     * Set StripPath when forwarding to backend
     * @param StripPath StripPath when forwarding to backend
     */
    public void setStripPath(Boolean StripPath) {
        this.StripPath = StripPath;
    }

    /**
     * Get Whether to enable mandatory HTTPS 
     * @return ForceHttps Whether to enable mandatory HTTPS
     * @deprecated
     */
    @Deprecated
    public Boolean getForceHttps() {
        return this.ForceHttps;
    }

    /**
     * Set Whether to enable mandatory HTTPS
     * @param ForceHttps Whether to enable mandatory HTTPS
     * @deprecated
     */
    @Deprecated
    public void setForceHttps(Boolean ForceHttps) {
        this.ForceHttps = ForceHttps;
    }

    /**
     * Get Destination port for Layer 4 match 
     * @return DestinationPorts Destination port for Layer 4 match
     */
    public Long [] getDestinationPorts() {
        return this.DestinationPorts;
    }

    /**
     * Set Destination port for Layer 4 match
     * @param DestinationPorts Destination port for Layer 4 match
     */
    public void setDestinationPorts(Long [] DestinationPorts) {
        this.DestinationPorts = DestinationPorts;
    }

    /**
     * Get Headers of the route 
     * @return Headers Headers of the route
     */
    public KVMapping [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Headers of the route
     * @param Headers Headers of the route
     */
    public void setHeaders(KVMapping [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Whether to cache the request body, default true 
     * @return RequestBuffering Whether to cache the request body, default true
     */
    public Boolean getRequestBuffering() {
        return this.RequestBuffering;
    }

    /**
     * Set Whether to cache the request body, default true
     * @param RequestBuffering Whether to cache the request body, default true
     */
    public void setRequestBuffering(Boolean RequestBuffering) {
        this.RequestBuffering = RequestBuffering;
    }

    /**
     * Get Whether to cache the response body. Default true 
     * @return ResponseBuffering Whether to cache the response body. Default true
     */
    public Boolean getResponseBuffering() {
        return this.ResponseBuffering;
    }

    /**
     * Set Whether to cache the response body. Default true
     * @param ResponseBuffering Whether to cache the response body. Default true
     */
    public void setResponseBuffering(Boolean ResponseBuffering) {
        this.ResponseBuffering = ResponseBuffering;
    }

    /**
     * Get Regular priority 
     * @return RegexPriority Regular priority
     */
    public Long getRegexPriority() {
        return this.RegexPriority;
    }

    /**
     * Set Regular priority
     * @param RegexPriority Regular priority
     */
    public void setRegexPriority(Long RegexPriority) {
        this.RegexPriority = RegexPriority;
    }

    /**
     * Get queryString parameter 
     * @return QueryStringParameters queryString parameter
     */
    public KVMapping [] getQueryStringParameters() {
        return this.QueryStringParameters;
    }

    /**
     * Set queryString parameter
     * @param QueryStringParameters queryString parameter
     */
    public void setQueryStringParameters(KVMapping [] QueryStringParameters) {
        this.QueryStringParameters = QueryStringParameters;
    }

    public CreateCloudNativeAPIGatewayRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayRouteRequest(CreateCloudNativeAPIGatewayRouteRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.Protocols != null) {
            this.Protocols = new String[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new String(source.Protocols[i]);
            }
        }
        if (source.PreserveHost != null) {
            this.PreserveHost = new Boolean(source.PreserveHost);
        }
        if (source.HttpsRedirectStatusCode != null) {
            this.HttpsRedirectStatusCode = new Long(source.HttpsRedirectStatusCode);
        }
        if (source.StripPath != null) {
            this.StripPath = new Boolean(source.StripPath);
        }
        if (source.ForceHttps != null) {
            this.ForceHttps = new Boolean(source.ForceHttps);
        }
        if (source.DestinationPorts != null) {
            this.DestinationPorts = new Long[source.DestinationPorts.length];
            for (int i = 0; i < source.DestinationPorts.length; i++) {
                this.DestinationPorts[i] = new Long(source.DestinationPorts[i]);
            }
        }
        if (source.Headers != null) {
            this.Headers = new KVMapping[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new KVMapping(source.Headers[i]);
            }
        }
        if (source.RequestBuffering != null) {
            this.RequestBuffering = new Boolean(source.RequestBuffering);
        }
        if (source.ResponseBuffering != null) {
            this.ResponseBuffering = new Boolean(source.ResponseBuffering);
        }
        if (source.RegexPriority != null) {
            this.RegexPriority = new Long(source.RegexPriority);
        }
        if (source.QueryStringParameters != null) {
            this.QueryStringParameters = new KVMapping[source.QueryStringParameters.length];
            for (int i = 0; i < source.QueryStringParameters.length; i++) {
                this.QueryStringParameters[i] = new KVMapping(source.QueryStringParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamArraySimple(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "PreserveHost", this.PreserveHost);
        this.setParamSimple(map, prefix + "HttpsRedirectStatusCode", this.HttpsRedirectStatusCode);
        this.setParamSimple(map, prefix + "StripPath", this.StripPath);
        this.setParamSimple(map, prefix + "ForceHttps", this.ForceHttps);
        this.setParamArraySimple(map, prefix + "DestinationPorts.", this.DestinationPorts);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "RequestBuffering", this.RequestBuffering);
        this.setParamSimple(map, prefix + "ResponseBuffering", this.ResponseBuffering);
        this.setParamSimple(map, prefix + "RegexPriority", this.RegexPriority);
        this.setParamArrayObj(map, prefix + "QueryStringParameters.", this.QueryStringParameters);

    }
}

