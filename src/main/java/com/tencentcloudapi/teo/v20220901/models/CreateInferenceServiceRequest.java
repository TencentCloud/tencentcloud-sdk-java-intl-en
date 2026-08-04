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

public class CreateInferenceServiceRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Service name. Length limit is no more than 30 characters, only lowercase letters, digits, and hyphens are supported, must start with a letter, ends with a digit or letter, duplicates are not supported.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Ports monitored by the model service. Only integers between 1 and 65535 are supported.</p>
    */
    @SerializedName("ListenPort")
    @Expose
    private Long ListenPort;

    /**
    * <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
    */
    @SerializedName("Containers")
    @Expose
    private InferenceContainerConfig [] Containers;

    /**
    * <p>Resource configuration of the inference service.</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private InferenceResourceConfig ResourceConfig;

    /**
    * <p>Request path list for inference service. Supports up to 20 paths.</p>
    */
    @SerializedName("RequestPaths")
    @Expose
    private String [] RequestPaths;

    /**
    * <p>Description. Length limit: no more than 60 characters.</p>
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
     * Get <p>Service name. Length limit is no more than 30 characters, only lowercase letters, digits, and hyphens are supported, must start with a letter, ends with a digit or letter, duplicates are not supported.</p> 
     * @return Name <p>Service name. Length limit is no more than 30 characters, only lowercase letters, digits, and hyphens are supported, must start with a letter, ends with a digit or letter, duplicates are not supported.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Service name. Length limit is no more than 30 characters, only lowercase letters, digits, and hyphens are supported, must start with a letter, ends with a digit or letter, duplicates are not supported.</p>
     * @param Name <p>Service name. Length limit is no more than 30 characters, only lowercase letters, digits, and hyphens are supported, must start with a letter, ends with a digit or letter, duplicates are not supported.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>Container configuration of the inference service. Currently only support setting 1 container.</p> 
     * @return Containers <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
     */
    public InferenceContainerConfig [] getContainers() {
        return this.Containers;
    }

    /**
     * Set <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
     * @param Containers <p>Container configuration of the inference service. Currently only support setting 1 container.</p>
     */
    public void setContainers(InferenceContainerConfig [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get <p>Resource configuration of the inference service.</p> 
     * @return ResourceConfig <p>Resource configuration of the inference service.</p>
     */
    public InferenceResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>Resource configuration of the inference service.</p>
     * @param ResourceConfig <p>Resource configuration of the inference service.</p>
     */
    public void setResourceConfig(InferenceResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
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
     * Get <p>Description. Length limit: no more than 60 characters.</p> 
     * @return Description <p>Description. Length limit: no more than 60 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description. Length limit: no more than 60 characters.</p>
     * @param Description <p>Description. Length limit: no more than 60 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateInferenceServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInferenceServiceRequest(CreateInferenceServiceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ListenPort != null) {
            this.ListenPort = new Long(source.ListenPort);
        }
        if (source.Containers != null) {
            this.Containers = new InferenceContainerConfig[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new InferenceContainerConfig(source.Containers[i]);
            }
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new InferenceResourceConfig(source.ResourceConfig);
        }
        if (source.RequestPaths != null) {
            this.RequestPaths = new String[source.RequestPaths.length];
            for (int i = 0; i < source.RequestPaths.length; i++) {
                this.RequestPaths[i] = new String(source.RequestPaths[i]);
            }
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ListenPort", this.ListenPort);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamArraySimple(map, prefix + "RequestPaths.", this.RequestPaths);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

