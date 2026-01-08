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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceIdInfo extends AbstractModel {

    /**
    * Specifies the resource ID returned by the business.
0: no trial version available.
A trial version is currently available and uploaded by the current user.
2: a trial version is currently available and uploaded by another user.
    */
    @SerializedName("ResourceId")
    @Expose
    private Long ResourceId;

    /**
     * Get Specifies the resource ID returned by the business.
0: no trial version available.
A trial version is currently available and uploaded by the current user.
2: a trial version is currently available and uploaded by another user. 
     * @return ResourceId Specifies the resource ID returned by the business.
0: no trial version available.
A trial version is currently available and uploaded by the current user.
2: a trial version is currently available and uploaded by another user.
     */
    public Long getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Specifies the resource ID returned by the business.
0: no trial version available.
A trial version is currently available and uploaded by the current user.
2: a trial version is currently available and uploaded by another user.
     * @param ResourceId Specifies the resource ID returned by the business.
0: no trial version available.
A trial version is currently available and uploaded by the current user.
2: a trial version is currently available and uploaded by another user.
     */
    public void setResourceId(Long ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ResourceIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceIdInfo(ResourceIdInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new Long(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

