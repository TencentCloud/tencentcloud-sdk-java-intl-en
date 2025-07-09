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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEnterpriseSecurityDispatchStatusRequest extends AbstractModel {

    /**
    * Status. Values: `0` (Publish now), `1` (Stop publishing)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Status. Values: `0` (Publish now), `1` (Stop publishing) 
     * @return Status Status. Values: `0` (Publish now), `1` (Stop publishing)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Values: `0` (Publish now), `1` (Stop publishing)
     * @param Status Status. Values: `0` (Publish now), `1` (Stop publishing)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyEnterpriseSecurityDispatchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnterpriseSecurityDispatchStatusRequest(ModifyEnterpriseSecurityDispatchStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

