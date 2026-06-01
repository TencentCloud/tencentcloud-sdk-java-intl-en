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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceProjectRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for modification. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * ID of the project to which instance belongs can be queried on the Projects page in the account center.
Description: This item is required.
    */
    @SerializedName("NewProjectId")
    @Expose
    private Long NewProjectId;

    /**
     * Get Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for modification. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ] 
     * @return InstanceIds Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for modification. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for modification. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     * @param InstanceIds Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for modification. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get ID of the project to which instance belongs can be queried on the Projects page in the account center.
Description: This item is required. 
     * @return NewProjectId ID of the project to which instance belongs can be queried on the Projects page in the account center.
Description: This item is required.
     */
    public Long getNewProjectId() {
        return this.NewProjectId;
    }

    /**
     * Set ID of the project to which instance belongs can be queried on the Projects page in the account center.
Description: This item is required.
     * @param NewProjectId ID of the project to which instance belongs can be queried on the Projects page in the account center.
Description: This item is required.
     */
    public void setNewProjectId(Long NewProjectId) {
        this.NewProjectId = NewProjectId;
    }

    public ModifyDBInstanceProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceProjectRequest(ModifyDBInstanceProjectRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.NewProjectId != null) {
            this.NewProjectId = new Long(source.NewProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "NewProjectId", this.NewProjectId);

    }
}

