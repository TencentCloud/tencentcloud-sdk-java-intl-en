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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDidServiceListRequest extends AbstractModel {

    /**
    * `1`: Return results at the network level; `0`: Return results at the service level.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get `1`: Return results at the network level; `0`: Return results at the service level. 
     * @return Type `1`: Return results at the network level; `0`: Return results at the service level.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set `1`: Return results at the network level; `0`: Return results at the service level.
     * @param Type `1`: Return results at the network level; `0`: Return results at the service level.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public GetDidServiceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDidServiceListRequest(GetDidServiceListRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

