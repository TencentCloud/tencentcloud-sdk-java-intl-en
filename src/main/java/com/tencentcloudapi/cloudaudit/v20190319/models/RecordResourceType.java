/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordResourceType extends AbstractModel{

    /**
    * CAM policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Modification time of resource types for monitoring
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Service
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Resource type
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Resource type name
    */
    @SerializedName("ResourceTypeName")
    @Expose
    private String ResourceTypeName;

    /**
     * Get CAM policy name 
     * @return PolicyName CAM policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set CAM policy name
     * @param PolicyName CAM policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Modification time of resource types for monitoring 
     * @return UpdateTime Modification time of resource types for monitoring
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time of resource types for monitoring
     * @param UpdateTime Modification time of resource types for monitoring
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Service 
     * @return Service Service
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Service
     * @param Service Service
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Resource type 
     * @return ResourceType Resource type
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
     * @param ResourceType Resource type
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
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
     * Get Resource type name 
     * @return ResourceTypeName Resource type name
     */
    public String getResourceTypeName() {
        return this.ResourceTypeName;
    }

    /**
     * Set Resource type name
     * @param ResourceTypeName Resource type name
     */
    public void setResourceTypeName(String ResourceTypeName) {
        this.ResourceTypeName = ResourceTypeName;
    }

    public RecordResourceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordResourceType(RecordResourceType source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ResourceTypeName != null) {
            this.ResourceTypeName = new String(source.ResourceTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ResourceTypeName", this.ResourceTypeName);

    }
}

