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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRegisterInstanceRequest extends AbstractModel {

    /**
    * Managed instance ID.

Call the [DescribeRegisterInstances](https://www.tencentcloud.com/document/api/1340/96924?from_cn_redirect=1) api to query managed instances.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name. valid length is 1–60 characters.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Managed instance ID.

Call the [DescribeRegisterInstances](https://www.tencentcloud.com/document/api/1340/96924?from_cn_redirect=1) api to query managed instances. 
     * @return InstanceId Managed instance ID.

Call the [DescribeRegisterInstances](https://www.tencentcloud.com/document/api/1340/96924?from_cn_redirect=1) api to query managed instances.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Managed instance ID.

Call the [DescribeRegisterInstances](https://www.tencentcloud.com/document/api/1340/96924?from_cn_redirect=1) api to query managed instances.
     * @param InstanceId Managed instance ID.

Call the [DescribeRegisterInstances](https://www.tencentcloud.com/document/api/1340/96924?from_cn_redirect=1) api to query managed instances.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. valid length is 1–60 characters. 
     * @return InstanceName Instance name. valid length is 1–60 characters.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name. valid length is 1–60 characters.
     * @param InstanceName Instance name. valid length is 1–60 characters.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public ModifyRegisterInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRegisterInstanceRequest(ModifyRegisterInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

