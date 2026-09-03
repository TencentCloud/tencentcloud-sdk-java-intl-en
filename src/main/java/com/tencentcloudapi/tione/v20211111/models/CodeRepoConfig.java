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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeRepoConfig extends AbstractModel {

    /**
    * Code repository ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Target address for the code repository download.
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
     * Get Code repository ID. 
     * @return Id Code repository ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Code repository ID.
     * @param Id Code repository ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Target address for the code repository download. 
     * @return TargetPath Target address for the code repository download.
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set Target address for the code repository download.
     * @param TargetPath Target address for the code repository download.
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    public CodeRepoConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeRepoConfig(CodeRepoConfig source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);

    }
}

