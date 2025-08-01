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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPersonListNumRequest extends AbstractModel {

    /**
    * Group ID, which is the `GroupId` in the `CreateGroup` API.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Group ID, which is the `GroupId` in the `CreateGroup` API. 
     * @return GroupId Group ID, which is the `GroupId` in the `CreateGroup` API.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID, which is the `GroupId` in the `CreateGroup` API.
     * @param GroupId Group ID, which is the `GroupId` in the `CreateGroup` API.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public GetPersonListNumRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonListNumRequest(GetPersonListNumRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

