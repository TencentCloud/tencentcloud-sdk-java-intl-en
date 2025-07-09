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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel {

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Environment name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Environment description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Environment region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Environment type. Valid values:
- KUBERNETES: Kubernetes container cluster
- HPC:HPC HCC 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Environment status. Valid values:
- INITIALIZING: Creating
- INITIALIZATION_ERROR: Creation failed
- RUNNING: Running
- ERROR: Exceptional
- DELETING: Deleting
- DELETE_ERROR: Deletion failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether the environment is available. The environment needs to be available before computing runs can be delivered.
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * Whether the environment is the default environment.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Whether the environment is a managed environment.
    */
    @SerializedName("IsManaged")
    @Expose
    private Boolean IsManaged;

    /**
    * Environment information
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Cloud resource ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private ResourceIds ResourceIds;

    /**
    * The UUID of the previous workflow
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastWorkflowUuid")
    @Expose
    private String LastWorkflowUuid;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

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
     * Get Environment name 
     * @return Name Environment name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Environment name
     * @param Name Environment name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Environment description information 
     * @return Description Environment description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Environment description information
     * @param Description Environment description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Environment region 
     * @return Region Environment region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Environment region
     * @param Region Environment region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Environment type. Valid values:
- KUBERNETES: Kubernetes container cluster
- HPC:HPC HCC  
     * @return Type Environment type. Valid values:
- KUBERNETES: Kubernetes container cluster
- HPC:HPC HCC 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Environment type. Valid values:
- KUBERNETES: Kubernetes container cluster
- HPC:HPC HCC 
     * @param Type Environment type. Valid values:
- KUBERNETES: Kubernetes container cluster
- HPC:HPC HCC 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Environment status. Valid values:
- INITIALIZING: Creating
- INITIALIZATION_ERROR: Creation failed
- RUNNING: Running
- ERROR: Exceptional
- DELETING: Deleting
- DELETE_ERROR: Deletion failed. 
     * @return Status Environment status. Valid values:
- INITIALIZING: Creating
- INITIALIZATION_ERROR: Creation failed
- RUNNING: Running
- ERROR: Exceptional
- DELETING: Deleting
- DELETE_ERROR: Deletion failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Environment status. Valid values:
- INITIALIZING: Creating
- INITIALIZATION_ERROR: Creation failed
- RUNNING: Running
- ERROR: Exceptional
- DELETING: Deleting
- DELETE_ERROR: Deletion failed.
     * @param Status Environment status. Valid values:
- INITIALIZING: Creating
- INITIALIZATION_ERROR: Creation failed
- RUNNING: Running
- ERROR: Exceptional
- DELETING: Deleting
- DELETE_ERROR: Deletion failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether the environment is available. The environment needs to be available before computing runs can be delivered. 
     * @return Available Whether the environment is available. The environment needs to be available before computing runs can be delivered.
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set Whether the environment is available. The environment needs to be available before computing runs can be delivered.
     * @param Available Whether the environment is available. The environment needs to be available before computing runs can be delivered.
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get Whether the environment is the default environment. 
     * @return IsDefault Whether the environment is the default environment.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether the environment is the default environment.
     * @param IsDefault Whether the environment is the default environment.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether the environment is a managed environment. 
     * @return IsManaged Whether the environment is a managed environment.
     */
    public Boolean getIsManaged() {
        return this.IsManaged;
    }

    /**
     * Set Whether the environment is a managed environment.
     * @param IsManaged Whether the environment is a managed environment.
     */
    public void setIsManaged(Boolean IsManaged) {
        this.IsManaged = IsManaged;
    }

    /**
     * Get Environment information 
     * @return Message Environment information
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Environment information
     * @param Message Environment information
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Cloud resource ID 
     * @return ResourceIds Cloud resource ID
     */
    public ResourceIds getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Cloud resource ID
     * @param ResourceIds Cloud resource ID
     */
    public void setResourceIds(ResourceIds ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get The UUID of the previous workflow
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastWorkflowUuid The UUID of the previous workflow
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastWorkflowUuid() {
        return this.LastWorkflowUuid;
    }

    /**
     * Set The UUID of the previous workflow
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastWorkflowUuid The UUID of the previous workflow
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastWorkflowUuid(String LastWorkflowUuid) {
        this.LastWorkflowUuid = LastWorkflowUuid;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreationTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreationTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.IsManaged != null) {
            this.IsManaged = new Boolean(source.IsManaged);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new ResourceIds(source.ResourceIds);
        }
        if (source.LastWorkflowUuid != null) {
            this.LastWorkflowUuid = new String(source.LastWorkflowUuid);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "IsManaged", this.IsManaged);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "LastWorkflowUuid", this.LastWorkflowUuid);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);

    }
}

