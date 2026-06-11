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

public class DescribeConfigMachineGroupsRequest extends AbstractModel {

    /**
    * Collection Configuration ID
-Obtain the collection configuration Id by accessing the collection rule configuration (https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
     * Get Collection Configuration ID
-Obtain the collection configuration Id by accessing the collection rule configuration (https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1). 
     * @return ConfigId Collection Configuration ID
-Obtain the collection configuration Id by accessing the collection rule configuration (https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Collection Configuration ID
-Obtain the collection configuration Id by accessing the collection rule configuration (https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
     * @param ConfigId Collection Configuration ID
-Obtain the collection configuration Id by accessing the collection rule configuration (https://www.tencentcloud.com/document/product/614/58616?from_cn_redirect=1).
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    public DescribeConfigMachineGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigMachineGroupsRequest(DescribeConfigMachineGroupsRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);

    }
}

