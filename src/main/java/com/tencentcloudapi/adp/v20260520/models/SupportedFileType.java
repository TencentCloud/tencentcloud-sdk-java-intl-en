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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SupportedFileType extends AbstractModel {

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>File type (for example, txt, pdf, jpg; extension is recommended)</p>
    */
    @SerializedName("FileExt")
    @Expose
    private String FileExt;

    /**
    * <p>File size limit (unit: byte)</p>
    */
    @SerializedName("MaxSizeBytes")
    @Expose
    private String MaxSizeBytes;

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>File type (for example, txt, pdf, jpg; extension is recommended)</p> 
     * @return FileExt <p>File type (for example, txt, pdf, jpg; extension is recommended)</p>
     */
    public String getFileExt() {
        return this.FileExt;
    }

    /**
     * Set <p>File type (for example, txt, pdf, jpg; extension is recommended)</p>
     * @param FileExt <p>File type (for example, txt, pdf, jpg; extension is recommended)</p>
     */
    public void setFileExt(String FileExt) {
        this.FileExt = FileExt;
    }

    /**
     * Get <p>File size limit (unit: byte)</p> 
     * @return MaxSizeBytes <p>File size limit (unit: byte)</p>
     */
    public String getMaxSizeBytes() {
        return this.MaxSizeBytes;
    }

    /**
     * Set <p>File size limit (unit: byte)</p>
     * @param MaxSizeBytes <p>File size limit (unit: byte)</p>
     */
    public void setMaxSizeBytes(String MaxSizeBytes) {
        this.MaxSizeBytes = MaxSizeBytes;
    }

    public SupportedFileType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportedFileType(SupportedFileType source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FileExt != null) {
            this.FileExt = new String(source.FileExt);
        }
        if (source.MaxSizeBytes != null) {
            this.MaxSizeBytes = new String(source.MaxSizeBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FileExt", this.FileExt);
        this.setParamSimple(map, prefix + "MaxSizeBytes", this.MaxSizeBytes);

    }
}

