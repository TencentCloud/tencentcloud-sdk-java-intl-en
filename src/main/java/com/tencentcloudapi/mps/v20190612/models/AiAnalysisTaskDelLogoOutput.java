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

public class AiAnalysisTaskDelLogoOutput extends AbstractModel {

    /**
    * Path of a file after removal.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Storage location of a file after removal.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Path of a subtitle file extracted from a video.
    */
    @SerializedName("OriginSubtitlePath")
    @Expose
    private String OriginSubtitlePath;

    /**
    * Path of a subtitle translation file extracted from a video.
    */
    @SerializedName("TranslateSubtitlePath")
    @Expose
    private String TranslateSubtitlePath;

    /**
    * Position of the erased subtitle. Note: This field is only valid for subtitle extraction when the option to return subtitle positions is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubtitlePos")
    @Expose
    private SubtitlePosition SubtitlePos;

    /**
     * Get Path of a file after removal. 
     * @return Path Path of a file after removal.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path of a file after removal.
     * @param Path Path of a file after removal.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Storage location of a file after removal. 
     * @return OutputStorage Storage location of a file after removal.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Storage location of a file after removal.
     * @param OutputStorage Storage location of a file after removal.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Path of a subtitle file extracted from a video. 
     * @return OriginSubtitlePath Path of a subtitle file extracted from a video.
     */
    public String getOriginSubtitlePath() {
        return this.OriginSubtitlePath;
    }

    /**
     * Set Path of a subtitle file extracted from a video.
     * @param OriginSubtitlePath Path of a subtitle file extracted from a video.
     */
    public void setOriginSubtitlePath(String OriginSubtitlePath) {
        this.OriginSubtitlePath = OriginSubtitlePath;
    }

    /**
     * Get Path of a subtitle translation file extracted from a video. 
     * @return TranslateSubtitlePath Path of a subtitle translation file extracted from a video.
     */
    public String getTranslateSubtitlePath() {
        return this.TranslateSubtitlePath;
    }

    /**
     * Set Path of a subtitle translation file extracted from a video.
     * @param TranslateSubtitlePath Path of a subtitle translation file extracted from a video.
     */
    public void setTranslateSubtitlePath(String TranslateSubtitlePath) {
        this.TranslateSubtitlePath = TranslateSubtitlePath;
    }

    /**
     * Get Position of the erased subtitle. Note: This field is only valid for subtitle extraction when the option to return subtitle positions is enabled.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubtitlePos Position of the erased subtitle. Note: This field is only valid for subtitle extraction when the option to return subtitle positions is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SubtitlePosition getSubtitlePos() {
        return this.SubtitlePos;
    }

    /**
     * Set Position of the erased subtitle. Note: This field is only valid for subtitle extraction when the option to return subtitle positions is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubtitlePos Position of the erased subtitle. Note: This field is only valid for subtitle extraction when the option to return subtitle positions is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubtitlePos(SubtitlePosition SubtitlePos) {
        this.SubtitlePos = SubtitlePos;
    }

    public AiAnalysisTaskDelLogoOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDelLogoOutput(AiAnalysisTaskDelLogoOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OriginSubtitlePath != null) {
            this.OriginSubtitlePath = new String(source.OriginSubtitlePath);
        }
        if (source.TranslateSubtitlePath != null) {
            this.TranslateSubtitlePath = new String(source.TranslateSubtitlePath);
        }
        if (source.SubtitlePos != null) {
            this.SubtitlePos = new SubtitlePosition(source.SubtitlePos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OriginSubtitlePath", this.OriginSubtitlePath);
        this.setParamSimple(map, prefix + "TranslateSubtitlePath", this.TranslateSubtitlePath);
        this.setParamObj(map, prefix + "SubtitlePos.", this.SubtitlePos);

    }
}

