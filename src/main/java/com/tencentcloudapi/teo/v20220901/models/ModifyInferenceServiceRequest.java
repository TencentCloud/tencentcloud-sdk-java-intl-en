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

public class ModifyInferenceServiceRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>ID of the inference service.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Ports monitored by the model service. Only integers between 1 and 65535 are supported.</p>
    */
    @SerializedName("ListenPort")
    @Expose
    private Long ListenPort;

    /**
    * <p>Request path list for inference service. Supports up to 20 paths.</p>
    */
    @SerializedName("RequestPaths")
    @Expose
    private String [] RequestPaths;

    /**
    * <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
    */
    @SerializedName("Containers")
    @Expose
    private InferenceContainerConfigForModify [] Containers;

    /**
    * <p>Resource configuration of the inference service.</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private InferenceResourceConfigForModify ResourceConfig;

    /**
    * <p>Description. The length is limited to 60 characters.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>ID of the inference service.</p> 
     * @return ServiceId <p>ID of the inference service.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>ID of the inference service.</p>
     * @param ServiceId <p>ID of the inference service.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Ports monitored by the model service. Only integers between 1 and 65535 are supported.</p> 
     * @return ListenPort <p>Ports monitored by the model service. Only integers between 1 and 65535 are supported.</p>
     */
    public Long getListenPort() {
        return this.ListenPort;
    }

    /**
     * Set <p>Ports monitored by the model service. Only integers between 1 and 65535 are supported.</p>
     * @param ListenPort <p>Ports monitored by the model service. Only integers between 1 and 65535 are supported.</p>
     */
    public void setListenPort(Long ListenPort) {
        this.ListenPort = ListenPort;
    }

    /**
     * Get <p>Request path list for inference service. Supports up to 20 paths.</p> 
     * @return RequestPaths <p>Request path list for inference service. Supports up to 20 paths.</p>
     */
    public String [] getRequestPaths() {
        return this.RequestPaths;
    }

    /**
     * Set <p>Request path list for inference service. Supports up to 20 paths.</p>
     * @param RequestPaths <p>Request path list for inference service. Supports up to 20 paths.</p>
     */
    public void setRequestPaths(String [] RequestPaths) {
        this.RequestPaths = RequestPaths;
    }

    /**
     * Get <p>Container configuration of the inference service. Currently only support setting 1 container.</p> 
     * @return Containers <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
     */
    public InferenceContainerConfigForModify [] getContainers() {
        return this.Containers;
    }

    /**
     * Set <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
     * @param Containers <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
     */
    public void setContainers(InferenceContainerConfigForModify [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get <p>Resource configuration of the inference service.</p> 
     * @return ResourceConfig <p>Resource configuration of the inference service.</p>
     */
    public InferenceResourceConfigForModify getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>Resource configuration of the inference service.</p>
     * @param ResourceConfig <p>Resource configuration of the inference service.</p>
     */
    public void setResourceConfig(InferenceResourceConfigForModify ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>Description. The length is limited to 60 characters.</p> 
     * @return Description <p>Description. The length is limited to 60 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description. The length is limited to 60 characters.</p>
     * @param Description <p>Description. The length is limited to 60 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyInferenceServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInferenceServiceRequest(ModifyInferenceServiceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ListenPort != null) {
            this.ListenPort = new Long(source.ListenPort);
        }
        if (source.RequestPaths != null) {
            this.RequestPaths = new String[source.RequestPaths.length];
            for (int i = 0; i < source.RequestPaths.length; i++) {
                this.RequestPaths[i] = new String(source.RequestPaths[i]);
            }
        }
        if (source.Containers != null) {
            this.Containers = new InferenceContainerConfigForModify[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new InferenceContainerConfigForModify(source.Containers[i]);
            }
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new InferenceResourceConfigForModify(source.ResourceConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ListenPort", this.ListenPort);
        this.setParamArraySimple(map, prefix + "RequestPaths.", this.RequestPaths);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

