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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteConfigFromMachineGroupRequest extends AbstractModel {

    /**
    * Machine group ID
-Get the machine group Id through [Get Machine Group List](https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Collection Configuration ID
-Obtain the collection configuration Id through [Access collection rule configuration](https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
     * Get Machine group ID
-Get the machine group Id through [Get Machine Group List](https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1). 
     * @return GroupId Machine group ID
-Get the machine group Id through [Get Machine Group List](https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Machine group ID
-Get the machine group Id through [Get Machine Group List](https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
     * @param GroupId Machine group ID
-Get the machine group Id through [Get Machine Group List](https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Collection Configuration ID
-Obtain the collection configuration Id through [Access collection rule configuration](https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1). 
     * @return ConfigId Collection Configuration ID
-Obtain the collection configuration Id through [Access collection rule configuration](https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Collection Configuration ID
-Obtain the collection configuration Id through [Access collection rule configuration](https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
     * @param ConfigId Collection Configuration ID
-Obtain the collection configuration Id through [Access collection rule configuration](https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    public DeleteConfigFromMachineGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConfigFromMachineGroupRequest(DeleteConfigFromMachineGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);

    }
}

