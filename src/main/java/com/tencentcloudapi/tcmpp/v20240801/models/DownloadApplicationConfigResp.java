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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadApplicationConfigResp extends AbstractModel {

    /**
    * Configuration information in Base64 format
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
     * Get Configuration information in Base64 format
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return File Configuration information in Base64 format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set Configuration information in Base64 format
Note: This field may return null, indicating that no valid values can be obtained.
     * @param File Configuration information in Base64 format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFile(String File) {
        this.File = File;
    }

    public DownloadApplicationConfigResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadApplicationConfigResp(DownloadApplicationConfigResp source) {
        if (source.File != null) {
            this.File = new String(source.File);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "File", this.File);

    }
}

