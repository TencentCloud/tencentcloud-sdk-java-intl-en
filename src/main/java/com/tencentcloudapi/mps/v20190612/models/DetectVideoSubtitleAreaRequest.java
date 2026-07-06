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

public class DetectVideoSubtitleAreaRequest extends AbstractModel {

    /**
    * <p>Input information, which supports only URL and COS.</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>Video language. If you know the language of the video, you can specify this parameter to improve the recognition accuracy.</p><p>Enumeration values:</p><ul><li>zh_en: Chinese and English</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li></ul>
    */
    @SerializedName("VideoLanguage")
    @Expose
    private String VideoLanguage;

    /**
    * <p>Extended parameter. This is left empty by default.</p>
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
     * Get <p>Input information, which supports only URL and COS.</p> 
     * @return InputInfo <p>Input information, which supports only URL and COS.</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>Input information, which supports only URL and COS.</p>
     * @param InputInfo <p>Input information, which supports only URL and COS.</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>Video language. If you know the language of the video, you can specify this parameter to improve the recognition accuracy.</p><p>Enumeration values:</p><ul><li>zh_en: Chinese and English</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li></ul> 
     * @return VideoLanguage <p>Video language. If you know the language of the video, you can specify this parameter to improve the recognition accuracy.</p><p>Enumeration values:</p><ul><li>zh_en: Chinese and English</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li></ul>
     */
    public String getVideoLanguage() {
        return this.VideoLanguage;
    }

    /**
     * Set <p>Video language. If you know the language of the video, you can specify this parameter to improve the recognition accuracy.</p><p>Enumeration values:</p><ul><li>zh_en: Chinese and English</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li></ul>
     * @param VideoLanguage <p>Video language. If you know the language of the video, you can specify this parameter to improve the recognition accuracy.</p><p>Enumeration values:</p><ul><li>zh_en: Chinese and English</li><li>en: English</li><li>ja: Japanese</li><li>ko: Korean</li></ul>
     */
    public void setVideoLanguage(String VideoLanguage) {
        this.VideoLanguage = VideoLanguage;
    }

    /**
     * Get <p>Extended parameter. This is left empty by default.</p> 
     * @return UserExtPara <p>Extended parameter. This is left empty by default.</p>
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set <p>Extended parameter. This is left empty by default.</p>
     * @param UserExtPara <p>Extended parameter. This is left empty by default.</p>
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    public DetectVideoSubtitleAreaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectVideoSubtitleAreaRequest(DetectVideoSubtitleAreaRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.VideoLanguage != null) {
            this.VideoLanguage = new String(source.VideoLanguage);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "VideoLanguage", this.VideoLanguage);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);

    }
}

