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

public class CloseWanServiceRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. Use the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) to obtain it, with its value being the InstanceId field in the output parameter. Input the read-only group ID to disable public network access for the read-only group.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
    */
    @SerializedName("OpResourceId")
    @Expose
    private String OpResourceId;

    /**
     * Get Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. Use the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) to obtain it, with its value being the InstanceId field in the output parameter. Input the read-only group ID to disable public network access for the read-only group. 
     * @return InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. Use the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) to obtain it, with its value being the InstanceId field in the output parameter. Input the read-only group ID to disable public network access for the read-only group.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. Use the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) to obtain it, with its value being the InstanceId field in the output parameter. Input the read-only group ID to disable public network access for the read-only group.
     * @param InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. Use the query instance list API (https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) to obtain it, with its value being the InstanceId field in the output parameter. Input the read-only group ID to disable public network access for the read-only group.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required. 
     * @return OpResourceId When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
     */
    public String getOpResourceId() {
        return this.OpResourceId;
    }

    /**
     * Set When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
     * @param OpResourceId When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
     */
    public void setOpResourceId(String OpResourceId) {
        this.OpResourceId = OpResourceId;
    }

    public CloseWanServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseWanServiceRequest(CloseWanServiceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OpResourceId != null) {
            this.OpResourceId = new String(source.OpResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpResourceId", this.OpResourceId);

    }
}

