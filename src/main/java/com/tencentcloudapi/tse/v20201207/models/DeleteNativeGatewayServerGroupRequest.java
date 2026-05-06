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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNativeGatewayServerGroupRequest extends AbstractModel {

    /**
    * Gateway instance id.
Only supports postpaid instances
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * gateway group id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Gateway instance id.
Only supports postpaid instances 
     * @return GatewayId Gateway instance id.
Only supports postpaid instances
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance id.
Only supports postpaid instances
     * @param GatewayId Gateway instance id.
Only supports postpaid instances
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get gateway group id 
     * @return GroupId gateway group id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set gateway group id
     * @param GroupId gateway group id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public DeleteNativeGatewayServerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNativeGatewayServerGroupRequest(DeleteNativeGatewayServerGroupRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

