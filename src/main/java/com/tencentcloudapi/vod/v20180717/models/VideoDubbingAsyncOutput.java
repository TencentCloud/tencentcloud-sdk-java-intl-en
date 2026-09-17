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

public class VideoDubbingAsyncOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get  
     * @return ResultUrl 
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set 
     * @param ResultUrl 
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public VideoDubbingAsyncOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDubbingAsyncOutput(VideoDubbingAsyncOutput source) {
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

