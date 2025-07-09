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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteProxyGroupRequest extends AbstractModel {

    /**
    * ID of the connection group to be deleted.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Whether to enable forced deletion. Valid values:
`0`: No;
`1`: Yes.
Default value: 0. If there is a connection or listener/rule bound to an origin server in the connection group and `Force` is 0, the operation will return a failure.
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get ID of the connection group to be deleted. 
     * @return GroupId ID of the connection group to be deleted.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set ID of the connection group to be deleted.
     * @param GroupId ID of the connection group to be deleted.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Whether to enable forced deletion. Valid values:
`0`: No;
`1`: Yes.
Default value: 0. If there is a connection or listener/rule bound to an origin server in the connection group and `Force` is 0, the operation will return a failure. 
     * @return Force Whether to enable forced deletion. Valid values:
`0`: No;
`1`: Yes.
Default value: 0. If there is a connection or listener/rule bound to an origin server in the connection group and `Force` is 0, the operation will return a failure.
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set Whether to enable forced deletion. Valid values:
`0`: No;
`1`: Yes.
Default value: 0. If there is a connection or listener/rule bound to an origin server in the connection group and `Force` is 0, the operation will return a failure.
     * @param Force Whether to enable forced deletion. Valid values:
`0`: No;
`1`: Yes.
Default value: 0. If there is a connection or listener/rule bound to an origin server in the connection group and `Force` is 0, the operation will return a failure.
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    public DeleteProxyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteProxyGroupRequest(DeleteProxyGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

