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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourceRequest extends AbstractModel {

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Resource type. Valid values: `CFS` (file system), `CLS` (log service), `TSE_SRE` (registry)
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Source of the resource. Values: `existing` (choose an existing resource), `creating` (create a new resource)
    */
    @SerializedName("ResourceFrom")
    @Expose
    private String ResourceFrom;

    /**
    * Resource extra configuration
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Resource type. Valid values: `CFS` (file system), `CLS` (log service), `TSE_SRE` (registry) 
     * @return ResourceType Resource type. Valid values: `CFS` (file system), `CLS` (log service), `TSE_SRE` (registry)
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type. Valid values: `CFS` (file system), `CLS` (log service), `TSE_SRE` (registry)
     * @param ResourceType Resource type. Valid values: `CFS` (file system), `CLS` (log service), `TSE_SRE` (registry)
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Source channel 
     * @return SourceChannel Source channel
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel
     * @param SourceChannel Source channel
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get Source of the resource. Values: `existing` (choose an existing resource), `creating` (create a new resource) 
     * @return ResourceFrom Source of the resource. Values: `existing` (choose an existing resource), `creating` (create a new resource)
     */
    public String getResourceFrom() {
        return this.ResourceFrom;
    }

    /**
     * Set Source of the resource. Values: `existing` (choose an existing resource), `creating` (create a new resource)
     * @param ResourceFrom Source of the resource. Values: `existing` (choose an existing resource), `creating` (create a new resource)
     */
    public void setResourceFrom(String ResourceFrom) {
        this.ResourceFrom = ResourceFrom;
    }

    /**
     * Get Resource extra configuration 
     * @return ResourceConfig Resource extra configuration
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set Resource extra configuration
     * @param ResourceConfig Resource extra configuration
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    public CreateResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceRequest(CreateResourceRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.ResourceFrom != null) {
            this.ResourceFrom = new String(source.ResourceFrom);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "ResourceFrom", this.ResourceFrom);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);

    }
}

