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

public class RouteWafStatus extends AbstractModel {

    /**
    * Route name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ID of the route
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Whether WAF protection is enabled for the route
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Method.
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * Path.
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * Domain
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Name of the service corresponding to the route
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * ID of the service corresponding to the route
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get Route name 
     * @return Name Route name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Route name
     * @param Name Route name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ID of the route 
     * @return Id ID of the route
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID of the route
     * @param Id ID of the route
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Whether WAF protection is enabled for the route 
     * @return Status Whether WAF protection is enabled for the route
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether WAF protection is enabled for the route
     * @param Status Whether WAF protection is enabled for the route
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Method. 
     * @return Methods Method.
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set Method.
     * @param Methods Method.
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get Path. 
     * @return Paths Path.
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set Path.
     * @param Paths Path.
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get Domain 
     * @return Hosts Domain
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Domain
     * @param Hosts Domain
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Name of the service corresponding to the route 
     * @return ServiceName Name of the service corresponding to the route
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Name of the service corresponding to the route
     * @param ServiceName Name of the service corresponding to the route
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get ID of the service corresponding to the route 
     * @return ServiceId ID of the service corresponding to the route
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set ID of the service corresponding to the route
     * @param ServiceId ID of the service corresponding to the route
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public RouteWafStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteWafStatus(RouteWafStatus source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

