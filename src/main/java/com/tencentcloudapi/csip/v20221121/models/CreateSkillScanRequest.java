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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSkillScanRequest extends AbstractModel {

    /**
    * Base64 encoding of the ZIP file content
Input limit: File size limit 7MB (before encoding), only effective ZIP format.
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * Filename for server log
Parameter format: such as my-skill.zip
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get Base64 encoding of the ZIP file content
Input limit: File size limit 7MB (before encoding), only effective ZIP format. 
     * @return FileBase64 Base64 encoding of the ZIP file content
Input limit: File size limit 7MB (before encoding), only effective ZIP format.
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set Base64 encoding of the ZIP file content
Input limit: File size limit 7MB (before encoding), only effective ZIP format.
     * @param FileBase64 Base64 encoding of the ZIP file content
Input limit: File size limit 7MB (before encoding), only effective ZIP format.
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get Filename for server log
Parameter format: such as my-skill.zip 
     * @return FileName Filename for server log
Parameter format: such as my-skill.zip
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename for server log
Parameter format: such as my-skill.zip
     * @param FileName Filename for server log
Parameter format: such as my-skill.zip
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public CreateSkillScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSkillScanRequest(CreateSkillScanRequest source) {
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

