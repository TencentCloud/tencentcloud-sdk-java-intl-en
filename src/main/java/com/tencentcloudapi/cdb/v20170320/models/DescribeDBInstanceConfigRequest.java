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

public class DescribeDBInstanceConfigRequest extends AbstractModel {

    /**
    * <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p> 
     * @return InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
     * @param InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeDBInstanceConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceConfigRequest(DescribeDBInstanceConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

