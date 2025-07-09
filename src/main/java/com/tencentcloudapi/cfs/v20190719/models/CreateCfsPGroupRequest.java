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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsPGroupRequest extends AbstractModel {

    /**
    * Permission group name, which can contain 1-64 Chinese characters, letters, numbers, underscores, or dashes
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Permission group description, which can contain 1-255 characters
    */
    @SerializedName("DescInfo")
    @Expose
    private String DescInfo;

    /**
     * Get Permission group name, which can contain 1-64 Chinese characters, letters, numbers, underscores, or dashes 
     * @return Name Permission group name, which can contain 1-64 Chinese characters, letters, numbers, underscores, or dashes
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Permission group name, which can contain 1-64 Chinese characters, letters, numbers, underscores, or dashes
     * @param Name Permission group name, which can contain 1-64 Chinese characters, letters, numbers, underscores, or dashes
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Permission group description, which can contain 1-255 characters 
     * @return DescInfo Permission group description, which can contain 1-255 characters
     */
    public String getDescInfo() {
        return this.DescInfo;
    }

    /**
     * Set Permission group description, which can contain 1-255 characters
     * @param DescInfo Permission group description, which can contain 1-255 characters
     */
    public void setDescInfo(String DescInfo) {
        this.DescInfo = DescInfo;
    }

    public CreateCfsPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCfsPGroupRequest(CreateCfsPGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DescInfo != null) {
            this.DescInfo = new String(source.DescInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescInfo", this.DescInfo);

    }
}

