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

public class InferenceService extends AbstractModel {

    /**
    * ID of the inference service.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Reasoning service name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description information.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Ports monitored by the model service. Only integers between 1 and 65535 are supported.
    */
    @SerializedName("ListenPort")
    @Expose
    private Long ListenPort;

    /**
    * Request path list for inference service. Supports up to 20 paths.
    */
    @SerializedName("RequestPaths")
    @Expose
    private String [] RequestPaths;

    /**
    * Container configuration of the inference service.
    */
    @SerializedName("Containers")
    @Expose
    private InferenceContainerConfig [] Containers;

    /**
    * Resource configuration of the inference service.
    */
    @SerializedName("ResourceConfig")
    @Expose
    private InferenceResourceConfig ResourceConfig;

    /**
    * Reasoning service status, which includes the following status: <li>Deploying: deployment in progress;</li><li>Running: running;</li><li>Stopping: stopping;</li><li>Stopped: stopped;</li><li>Exception: exception;</li><li>Banned: banned.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Scaling status. Valid values: <li>Normal: Stable operation, no scaling operation in progress;</li><li>ScalingOut: Scaling out;</li><li>ScalingIn: Scaling in.</li>
    */
    @SerializedName("ScalingStatus")
    @Expose
    private String ScalingStatus;

    /**
    * Number of running instances.
    */
    @SerializedName("CurrentInstanceCount")
    @Expose
    private Long CurrentInstanceCount;

    /**
    * Reasoning access address, perform reasoning via links to access the underlying model.
    */
    @SerializedName("InferenceURL")
    @Expose
    private String InferenceURL;

    /**
    * Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get ID of the inference service. 
     * @return ServiceId ID of the inference service.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set ID of the inference service.
     * @param ServiceId ID of the inference service.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Reasoning service name. 
     * @return Name Reasoning service name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Reasoning service name.
     * @param Name Reasoning service name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description information. 
     * @return Description Description information.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information.
     * @param Description Description information.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Ports monitored by the model service. Only integers between 1 and 65535 are supported. 
     * @return ListenPort Ports monitored by the model service. Only integers between 1 and 65535 are supported.
     */
    public Long getListenPort() {
        return this.ListenPort;
    }

    /**
     * Set Ports monitored by the model service. Only integers between 1 and 65535 are supported.
     * @param ListenPort Ports monitored by the model service. Only integers between 1 and 65535 are supported.
     */
    public void setListenPort(Long ListenPort) {
        this.ListenPort = ListenPort;
    }

    /**
     * Get Request path list for inference service. Supports up to 20 paths. 
     * @return RequestPaths Request path list for inference service. Supports up to 20 paths.
     */
    public String [] getRequestPaths() {
        return this.RequestPaths;
    }

    /**
     * Set Request path list for inference service. Supports up to 20 paths.
     * @param RequestPaths Request path list for inference service. Supports up to 20 paths.
     */
    public void setRequestPaths(String [] RequestPaths) {
        this.RequestPaths = RequestPaths;
    }

    /**
     * Get Container configuration of the inference service. 
     * @return Containers Container configuration of the inference service.
     */
    public InferenceContainerConfig [] getContainers() {
        return this.Containers;
    }

    /**
     * Set Container configuration of the inference service.
     * @param Containers Container configuration of the inference service.
     */
    public void setContainers(InferenceContainerConfig [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get Resource configuration of the inference service. 
     * @return ResourceConfig Resource configuration of the inference service.
     */
    public InferenceResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set Resource configuration of the inference service.
     * @param ResourceConfig Resource configuration of the inference service.
     */
    public void setResourceConfig(InferenceResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get Reasoning service status, which includes the following status: <li>Deploying: deployment in progress;</li><li>Running: running;</li><li>Stopping: stopping;</li><li>Stopped: stopped;</li><li>Exception: exception;</li><li>Banned: banned.</li> 
     * @return Status Reasoning service status, which includes the following status: <li>Deploying: deployment in progress;</li><li>Running: running;</li><li>Stopping: stopping;</li><li>Stopped: stopped;</li><li>Exception: exception;</li><li>Banned: banned.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Reasoning service status, which includes the following status: <li>Deploying: deployment in progress;</li><li>Running: running;</li><li>Stopping: stopping;</li><li>Stopped: stopped;</li><li>Exception: exception;</li><li>Banned: banned.</li>
     * @param Status Reasoning service status, which includes the following status: <li>Deploying: deployment in progress;</li><li>Running: running;</li><li>Stopping: stopping;</li><li>Stopped: stopped;</li><li>Exception: exception;</li><li>Banned: banned.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Scaling status. Valid values: <li>Normal: Stable operation, no scaling operation in progress;</li><li>ScalingOut: Scaling out;</li><li>ScalingIn: Scaling in.</li> 
     * @return ScalingStatus Scaling status. Valid values: <li>Normal: Stable operation, no scaling operation in progress;</li><li>ScalingOut: Scaling out;</li><li>ScalingIn: Scaling in.</li>
     */
    public String getScalingStatus() {
        return this.ScalingStatus;
    }

    /**
     * Set Scaling status. Valid values: <li>Normal: Stable operation, no scaling operation in progress;</li><li>ScalingOut: Scaling out;</li><li>ScalingIn: Scaling in.</li>
     * @param ScalingStatus Scaling status. Valid values: <li>Normal: Stable operation, no scaling operation in progress;</li><li>ScalingOut: Scaling out;</li><li>ScalingIn: Scaling in.</li>
     */
    public void setScalingStatus(String ScalingStatus) {
        this.ScalingStatus = ScalingStatus;
    }

    /**
     * Get Number of running instances. 
     * @return CurrentInstanceCount Number of running instances.
     */
    public Long getCurrentInstanceCount() {
        return this.CurrentInstanceCount;
    }

    /**
     * Set Number of running instances.
     * @param CurrentInstanceCount Number of running instances.
     */
    public void setCurrentInstanceCount(Long CurrentInstanceCount) {
        this.CurrentInstanceCount = CurrentInstanceCount;
    }

    /**
     * Get Reasoning access address, perform reasoning via links to access the underlying model. 
     * @return InferenceURL Reasoning access address, perform reasoning via links to access the underlying model.
     */
    public String getInferenceURL() {
        return this.InferenceURL;
    }

    /**
     * Set Reasoning access address, perform reasoning via links to access the underlying model.
     * @param InferenceURL Reasoning access address, perform reasoning via links to access the underlying model.
     */
    public void setInferenceURL(String InferenceURL) {
        this.InferenceURL = InferenceURL;
    }

    /**
     * Get Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Last modification time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Last modification time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public InferenceService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceService(InferenceService source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
            this.Containers = new InferenceContainerConfig[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new InferenceContainerConfig(source.Containers[i]);
            }
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new InferenceResourceConfig(source.ResourceConfig);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScalingStatus != null) {
            this.ScalingStatus = new String(source.ScalingStatus);
        }
        if (source.CurrentInstanceCount != null) {
            this.CurrentInstanceCount = new Long(source.CurrentInstanceCount);
        }
        if (source.InferenceURL != null) {
            this.InferenceURL = new String(source.InferenceURL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ListenPort", this.ListenPort);
        this.setParamArraySimple(map, prefix + "RequestPaths.", this.RequestPaths);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScalingStatus", this.ScalingStatus);
        this.setParamSimple(map, prefix + "CurrentInstanceCount", this.CurrentInstanceCount);
        this.setParamSimple(map, prefix + "InferenceURL", this.InferenceURL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

