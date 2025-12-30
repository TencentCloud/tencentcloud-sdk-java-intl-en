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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleResult extends AbstractModel {

    /**
    * Language of the subtitle file.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Whether the processing is successful.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Subtitle file URL.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Language of the subtitle file. 
     * @return Language Language of the subtitle file.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Language of the subtitle file.
     * @param Language Language of the subtitle file.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Whether the processing is successful. 
     * @return Status Whether the processing is successful.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the processing is successful.
     * @param Status Whether the processing is successful.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Subtitle file URL. 
     * @return Path Subtitle file URL.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Subtitle file URL.
     * @param Path Subtitle file URL.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public SubtitleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleResult(SubtitleResult source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

