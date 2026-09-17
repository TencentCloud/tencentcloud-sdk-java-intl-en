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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcHunyuan3DTaskOutputFileInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 
    */
    @SerializedName("PreviewFileUrl")
    @Expose
    private String PreviewFileUrl;

    /**
     * Get  
     * @return StorageMode 
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 
     * @param StorageMode 
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get  
     * @return FileType 
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 
     * @param FileType 
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get  
     * @return FileUrl 
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 
     * @param FileUrl 
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get  
     * @return PreviewFileUrl 
     */
    public String getPreviewFileUrl() {
        return this.PreviewFileUrl;
    }

    /**
     * Set 
     * @param PreviewFileUrl 
     */
    public void setPreviewFileUrl(String PreviewFileUrl) {
        this.PreviewFileUrl = PreviewFileUrl;
    }

    public AigcHunyuan3DTaskOutputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DTaskOutputFileInfo(AigcHunyuan3DTaskOutputFileInfo source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.PreviewFileUrl != null) {
            this.PreviewFileUrl = new String(source.PreviewFileUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "PreviewFileUrl", this.PreviewFileUrl);

    }
}

