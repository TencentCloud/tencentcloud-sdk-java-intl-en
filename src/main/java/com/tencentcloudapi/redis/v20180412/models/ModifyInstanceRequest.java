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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * Instance modification operation. Valid values:
- rename: Rename the instance.
- modifyProject: Modify the project to which the instance belongs.
- modifyAutoRenew: Modify the instance renewal flag.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. The maximum number of instances per request is 10.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * New name of the instance.
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Auto-renewal flag.

- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
    */
    @SerializedName("AutoRenews")
    @Expose
    private Long [] AutoRenews;

    /**
    * This parameter is currently being deprecated and can still be used by existing users. It is recommended that new users use InstanceIds.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Disused
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * This parameter has been deprecated.
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
     * Get Instance modification operation. Valid values:
- rename: Rename the instance.
- modifyProject: Modify the project to which the instance belongs.
- modifyAutoRenew: Modify the instance renewal flag. 
     * @return Operation Instance modification operation. Valid values:
- rename: Rename the instance.
- modifyProject: Modify the project to which the instance belongs.
- modifyAutoRenew: Modify the instance renewal flag.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Instance modification operation. Valid values:
- rename: Rename the instance.
- modifyProject: Modify the project to which the instance belongs.
- modifyAutoRenew: Modify the instance renewal flag.
     * @param Operation Instance modification operation. Valid values:
- rename: Rename the instance.
- modifyProject: Modify the project to which the instance belongs.
- modifyAutoRenew: Modify the instance renewal flag.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. The maximum number of instances per request is 10. 
     * @return InstanceIds Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. The maximum number of instances per request is 10.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. The maximum number of instances per request is 10.
     * @param InstanceIds Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. The maximum number of instances per request is 10.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get New name of the instance. 
     * @return InstanceNames New name of the instance.
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set New name of the instance.
     * @param InstanceNames New name of the instance.
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**. 
     * @return ProjectId Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
     * @param ProjectId Project ID. Log in to the [Project Management](https://console.tencentcloud.com/project) page of the Redis console and copy the project ID in **Project Name**.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Auto-renewal flag.

- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal. 
     * @return AutoRenews Auto-renewal flag.

- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
     */
    public Long [] getAutoRenews() {
        return this.AutoRenews;
    }

    /**
     * Set Auto-renewal flag.

- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
     * @param AutoRenews Auto-renewal flag.

- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
     */
    public void setAutoRenews(Long [] AutoRenews) {
        this.AutoRenews = AutoRenews;
    }

    /**
     * Get This parameter is currently being deprecated and can still be used by existing users. It is recommended that new users use InstanceIds. 
     * @return InstanceId This parameter is currently being deprecated and can still be used by existing users. It is recommended that new users use InstanceIds.
     * @deprecated
     */
    @Deprecated
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set This parameter is currently being deprecated and can still be used by existing users. It is recommended that new users use InstanceIds.
     * @param InstanceId This parameter is currently being deprecated and can still be used by existing users. It is recommended that new users use InstanceIds.
     * @deprecated
     */
    @Deprecated
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Disused 
     * @return InstanceName Disused
     * @deprecated
     */
    @Deprecated
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Disused
     * @param InstanceName Disused
     * @deprecated
     */
    @Deprecated
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get This parameter has been deprecated. 
     * @return AutoRenew This parameter has been deprecated.
     * @deprecated
     */
    @Deprecated
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set This parameter has been deprecated.
     * @param AutoRenew This parameter has been deprecated.
     * @deprecated
     */
    @Deprecated
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoRenews != null) {
            this.AutoRenews = new Long[source.AutoRenews.length];
            for (int i = 0; i < source.AutoRenews.length; i++) {
                this.AutoRenews[i] = new Long(source.AutoRenews[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "AutoRenews.", this.AutoRenews);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);

    }
}

