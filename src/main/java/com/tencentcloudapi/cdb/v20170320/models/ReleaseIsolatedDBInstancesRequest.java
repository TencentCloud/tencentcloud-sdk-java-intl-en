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

public class ReleaseIsolatedDBInstancesRequest extends AbstractModel {

    /**
    * Instance ID. The instance ID is in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the API for querying the instance list (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for operations. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Instance ID. The instance ID is in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the API for querying the instance list (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for operations. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ] 
     * @return InstanceIds Instance ID. The instance ID is in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the API for querying the instance list (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for operations. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID. The instance ID is in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the API for querying the instance list (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for operations. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     * @param InstanceIds Instance ID. The instance ID is in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the API for querying the instance list (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1). The value is the InstanceId field in the output parameter.
Description: Multiple instance IDs can be entered for operations. The json format is as follows.
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public ReleaseIsolatedDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseIsolatedDBInstancesRequest(ReleaseIsolatedDBInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

