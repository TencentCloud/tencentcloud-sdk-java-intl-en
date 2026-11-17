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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadSkillSecScanRequest extends AbstractModel {

    /**
    * <p>Service ID.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Base64-encoded data of the zip archive.</p>
    */
    @SerializedName("FileData")
    @Expose
    private String FileData;

    /**
    * <p>Name of the compressed Skill file, ending with .zip.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get <p>Service ID.</p> 
     * @return ServiceId <p>Service ID.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>Service ID.</p>
     * @param ServiceId <p>Service ID.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Base64-encoded data of the zip archive.</p> 
     * @return FileData <p>Base64-encoded data of the zip archive.</p>
     */
    public String getFileData() {
        return this.FileData;
    }

    /**
     * Set <p>Base64-encoded data of the zip archive.</p>
     * @param FileData <p>Base64-encoded data of the zip archive.</p>
     */
    public void setFileData(String FileData) {
        this.FileData = FileData;
    }

    /**
     * Get <p>Name of the compressed Skill file, ending with .zip.</p> 
     * @return FileName <p>Name of the compressed Skill file, ending with .zip.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Name of the compressed Skill file, ending with .zip.</p>
     * @param FileName <p>Name of the compressed Skill file, ending with .zip.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public UploadSkillSecScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadSkillSecScanRequest(UploadSkillSecScanRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.FileData != null) {
            this.FileData = new String(source.FileData);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "FileData", this.FileData);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

