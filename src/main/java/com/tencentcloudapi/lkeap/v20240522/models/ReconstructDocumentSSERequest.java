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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentSSERequest extends AbstractModel {

    /**
    * The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * Document parsing configuration information.	
    */
    @SerializedName("Config")
    @Expose
    private ReconstructDocumentSSEConfig Config;

    /**
     * Get The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used. 
     * @return FileBase64 The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     * @param FileBase64 The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get Document parsing configuration information.	 
     * @return Config Document parsing configuration information.	
     */
    public ReconstructDocumentSSEConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Document parsing configuration information.	
     * @param Config Document parsing configuration information.	
     */
    public void setConfig(ReconstructDocumentSSEConfig Config) {
        this.Config = Config;
    }

    public ReconstructDocumentSSERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentSSERequest(ReconstructDocumentSSERequest source) {
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.Config != null) {
            this.Config = new ReconstructDocumentSSEConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

