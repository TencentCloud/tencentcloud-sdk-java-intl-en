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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAddressTemplateGroupRequest extends AbstractModel {

    /**
    * The IP address template group instance ID, such as `ipmg-90cex8mq`.
    */
    @SerializedName("AddressTemplateGroupId")
    @Expose
    private String AddressTemplateGroupId;

    /**
     * Get The IP address template group instance ID, such as `ipmg-90cex8mq`. 
     * @return AddressTemplateGroupId The IP address template group instance ID, such as `ipmg-90cex8mq`.
     */
    public String getAddressTemplateGroupId() {
        return this.AddressTemplateGroupId;
    }

    /**
     * Set The IP address template group instance ID, such as `ipmg-90cex8mq`.
     * @param AddressTemplateGroupId The IP address template group instance ID, such as `ipmg-90cex8mq`.
     */
    public void setAddressTemplateGroupId(String AddressTemplateGroupId) {
        this.AddressTemplateGroupId = AddressTemplateGroupId;
    }

    public DeleteAddressTemplateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAddressTemplateGroupRequest(DeleteAddressTemplateGroupRequest source) {
        if (source.AddressTemplateGroupId != null) {
            this.AddressTemplateGroupId = new String(source.AddressTemplateGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);

    }
}

