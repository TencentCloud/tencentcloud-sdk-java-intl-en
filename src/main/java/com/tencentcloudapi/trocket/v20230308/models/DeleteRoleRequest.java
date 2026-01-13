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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoleRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Role name. It can be obtained from [RoleItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.com/document/api/1493/98862?from_cn_redirect=1) or from the console.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Role name. It can be obtained from [RoleItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.com/document/api/1493/98862?from_cn_redirect=1) or from the console. 
     * @return Role Role name. It can be obtained from [RoleItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.com/document/api/1493/98862?from_cn_redirect=1) or from the console.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role name. It can be obtained from [RoleItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.com/document/api/1493/98862?from_cn_redirect=1) or from the console.
     * @param Role Role name. It can be obtained from [RoleItem](https://www.tencentcloud.com/document/api/1493/96031?from_cn_redirect=1#RoleItem) returned by the API [DescribeRoleList](https://www.tencentcloud.com/document/api/1493/98862?from_cn_redirect=1) or from the console.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public DeleteRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoleRequest(DeleteRoleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

