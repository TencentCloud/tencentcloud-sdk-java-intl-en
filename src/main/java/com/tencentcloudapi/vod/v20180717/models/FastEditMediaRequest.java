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

public class FastEditMediaRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileInfos")
    @Expose
    private FastEditMediaFileInfo [] FileInfos;

    /**
    * 
    */
    @SerializedName("ClipMode")
    @Expose
    private String ClipMode;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get  
     * @return FileInfos 
     */
    public FastEditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 
     * @param FileInfos 
     */
    public void setFileInfos(FastEditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get  
     * @return ClipMode 
     */
    public String getClipMode() {
        return this.ClipMode;
    }

    /**
     * Set 
     * @param ClipMode 
     */
    public void setClipMode(String ClipMode) {
        this.ClipMode = ClipMode;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public FastEditMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FastEditMediaRequest(FastEditMediaRequest source) {
        if (source.FileInfos != null) {
            this.FileInfos = new FastEditMediaFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FastEditMediaFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ClipMode != null) {
            this.ClipMode = new String(source.ClipMode);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "ClipMode", this.ClipMode);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

