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
    * <p>Language of the subtitle file</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Whether the processing is successful.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Subtitle file path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Subtitle suppression video path.</p>
    */
    @SerializedName("SubtitleEmbedPath")
    @Expose
    private String SubtitleEmbedPath;

    /**
     * Get <p>Language of the subtitle file</p> 
     * @return Language <p>Language of the subtitle file</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>Language of the subtitle file</p>
     * @param Language <p>Language of the subtitle file</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Whether the processing is successful.</p> 
     * @return Status <p>Whether the processing is successful.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whether the processing is successful.</p>
     * @param Status <p>Whether the processing is successful.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Subtitle file path</p> 
     * @return Path <p>Subtitle file path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Subtitle file path</p>
     * @param Path <p>Subtitle file path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Subtitle suppression video path.</p> 
     * @return SubtitleEmbedPath <p>Subtitle suppression video path.</p>
     */
    public String getSubtitleEmbedPath() {
        return this.SubtitleEmbedPath;
    }

    /**
     * Set <p>Subtitle suppression video path.</p>
     * @param SubtitleEmbedPath <p>Subtitle suppression video path.</p>
     */
    public void setSubtitleEmbedPath(String SubtitleEmbedPath) {
        this.SubtitleEmbedPath = SubtitleEmbedPath;
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
        if (source.SubtitleEmbedPath != null) {
            this.SubtitleEmbedPath = new String(source.SubtitleEmbedPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "SubtitleEmbedPath", this.SubtitleEmbedPath);

    }
}

