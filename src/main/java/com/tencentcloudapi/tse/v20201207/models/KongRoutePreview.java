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

public class KongRoutePreview extends AbstractModel {

    /**
    * Service ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Service name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * None.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * None.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * None.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * None.
    */
    @SerializedName("Protocols")
    @Expose
    private String [] Protocols;

    /**
    * None.
    */
    @SerializedName("PreserveHost")
    @Expose
    private Boolean PreserveHost;

    /**
    * None.
    */
    @SerializedName("HttpsRedirectStatusCode")
    @Expose
    private Long HttpsRedirectStatusCode;

    /**
    * None.
    */
    @SerializedName("StripPath")
    @Expose
    private Boolean StripPath;

    /**
    * None.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Is mandatory HTTPS enabled?
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForceHttps")
    @Expose
    private Boolean ForceHttps;

    /**
    * Service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Service ID
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * Destination Port
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
    * Whether to cache response body, default true
    */
    @SerializedName("ResponseBuffering")
    @Expose
    private Boolean ResponseBuffering;

    /**
    * Regular Priority
    */
    @SerializedName("RegexPriority")
    @Expose
    private Long RegexPriority;

    /**
    * querystring parameter
    */
    @SerializedName("QueryStringParameters")
    @Expose
    private KVMapping [] QueryStringParameters;

    /**
     * Get Service ID 
     * @return ID Service ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Service ID
     * @param ID Service ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Service name. 
     * @return Name Service name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service name.
     * @param Name Service name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get None.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Methods None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set None.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Methods None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get None.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Paths None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set None.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Paths None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get None.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Hosts None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set None.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Hosts None.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get None. 
     * @return Protocols None.
     */
    public String [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set None.
     * @param Protocols None.
     */
    public void setProtocols(String [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get None. 
     * @return PreserveHost None.
     */
    public Boolean getPreserveHost() {
        return this.PreserveHost;
    }

    /**
     * Set None.
     * @param PreserveHost None.
     */
    public void setPreserveHost(Boolean PreserveHost) {
        this.PreserveHost = PreserveHost;
    }

    /**
     * Get None. 
     * @return HttpsRedirectStatusCode None.
     */
    public Long getHttpsRedirectStatusCode() {
        return this.HttpsRedirectStatusCode;
    }

    /**
     * Set None.
     * @param HttpsRedirectStatusCode None.
     */
    public void setHttpsRedirectStatusCode(Long HttpsRedirectStatusCode) {
        this.HttpsRedirectStatusCode = HttpsRedirectStatusCode;
    }

    /**
     * Get None. 
     * @return StripPath None.
     */
    public Boolean getStripPath() {
        return this.StripPath;
    }

    /**
     * Set None.
     * @param StripPath None.
     */
    public void setStripPath(Boolean StripPath) {
        this.StripPath = StripPath;
    }

    /**
     * Get None. 
     * @return CreatedTime None.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set None.
     * @param CreatedTime None.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Is mandatory HTTPS enabled?
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForceHttps Is mandatory HTTPS enabled?
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Boolean getForceHttps() {
        return this.ForceHttps;
    }

    /**
     * Set Is mandatory HTTPS enabled?
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForceHttps Is mandatory HTTPS enabled?
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setForceHttps(Boolean ForceHttps) {
        this.ForceHttps = ForceHttps;
    }

    /**
     * Get Service name 
     * @return ServiceName Service name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
     * @param ServiceName Service name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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
     * Get Destination Port 
     * @return DestinationPorts Destination Port
     */
    public Long [] getDestinationPorts() {
        return this.DestinationPorts;
    }

    /**
     * Set Destination Port
     * @param DestinationPorts Destination Port
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
     * Get Whether to cache response body, default true 
     * @return ResponseBuffering Whether to cache response body, default true
     */
    public Boolean getResponseBuffering() {
        return this.ResponseBuffering;
    }

    /**
     * Set Whether to cache response body, default true
     * @param ResponseBuffering Whether to cache response body, default true
     */
    public void setResponseBuffering(Boolean ResponseBuffering) {
        this.ResponseBuffering = ResponseBuffering;
    }

    /**
     * Get Regular Priority 
     * @return RegexPriority Regular Priority
     */
    public Long getRegexPriority() {
        return this.RegexPriority;
    }

    /**
     * Set Regular Priority
     * @param RegexPriority Regular Priority
     */
    public void setRegexPriority(Long RegexPriority) {
        this.RegexPriority = RegexPriority;
    }

    /**
     * Get querystring parameter 
     * @return QueryStringParameters querystring parameter
     */
    public KVMapping [] getQueryStringParameters() {
        return this.QueryStringParameters;
    }

    /**
     * Set querystring parameter
     * @param QueryStringParameters querystring parameter
     */
    public void setQueryStringParameters(KVMapping [] QueryStringParameters) {
        this.QueryStringParameters = QueryStringParameters;
    }

    public KongRoutePreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongRoutePreview(KongRoutePreview source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
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
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ForceHttps != null) {
            this.ForceHttps = new Boolean(source.ForceHttps);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "PreserveHost", this.PreserveHost);
        this.setParamSimple(map, prefix + "HttpsRedirectStatusCode", this.HttpsRedirectStatusCode);
        this.setParamSimple(map, prefix + "StripPath", this.StripPath);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ForceHttps", this.ForceHttps);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamArraySimple(map, prefix + "DestinationPorts.", this.DestinationPorts);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "RequestBuffering", this.RequestBuffering);
        this.setParamSimple(map, prefix + "ResponseBuffering", this.ResponseBuffering);
        this.setParamSimple(map, prefix + "RegexPriority", this.RegexPriority);
        this.setParamArrayObj(map, prefix + "QueryStringParameters.", this.QueryStringParameters);

    }
}

