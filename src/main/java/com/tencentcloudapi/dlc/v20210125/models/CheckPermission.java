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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckPermission extends AbstractModel {

    /**
    * Permission type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Resource information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceBaseInfo")
    @Expose
    private ResourceBaseInfo ResourceBaseInfo;

    /**
     * Get Permission type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessType Permission type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Permission type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessType Permission type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Resource information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceBaseInfo Resource information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceBaseInfo getResourceBaseInfo() {
        return this.ResourceBaseInfo;
    }

    /**
     * Set Resource information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceBaseInfo Resource information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceBaseInfo(ResourceBaseInfo ResourceBaseInfo) {
        this.ResourceBaseInfo = ResourceBaseInfo;
    }

    public CheckPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckPermission(CheckPermission source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.ResourceBaseInfo != null) {
            this.ResourceBaseInfo = new ResourceBaseInfo(source.ResourceBaseInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamObj(map, prefix + "ResourceBaseInfo.", this.ResourceBaseInfo);

    }
}

