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

public class DubbingSubtitleConfig extends AbstractModel {

    /**
    * <p>Subtitle source.</p><p>Enumeration values:</p><ul><li>OCR: OCR text recognition, recognizes text in video frames.</li><li>ASR: ASR speech recognition, recognizes voice dialogue in videos.</li><li>External: External subtitle file, provide the URL of the original/translated subtitles.</li></ul>
    */
    @SerializedName("SubtitleSource")
    @Expose
    private String SubtitleSource;

    /**
    * <p>Use ASR to assist OCR.</p><p>Enumeration values:</p><ul><li>ON: Enable the use of ASR to assist OCR.</li><li>OFF: Disable the use of ASR to assist OCR.</li></ul><p>Default value: OFF</p><p>Can be set to ON only when SubtitleSource=OCR</p>
    */
    @SerializedName("AsrAssistOcr")
    @Expose
    private String AsrAssistOcr;

    /**
    * <p>Erase the original subtitle.</p><p>Enumeration values:</p><ul><li>ON: Erase the original subtitle.</li><li>OFF: Retain the original subtitle.</li></ul><p>Default value: OFF</p><p>Cannot be set to ON when SubtitleSource=External</p>
    */
    @SerializedName("EraseOriginalSubtitle")
    @Expose
    private String EraseOriginalSubtitle;

    /**
    * <p>Subtitle location information.</p>
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
     * Get <p>Subtitle source.</p><p>Enumeration values:</p><ul><li>OCR: OCR text recognition, recognizes text in video frames.</li><li>ASR: ASR speech recognition, recognizes voice dialogue in videos.</li><li>External: External subtitle file, provide the URL of the original/translated subtitles.</li></ul> 
     * @return SubtitleSource <p>Subtitle source.</p><p>Enumeration values:</p><ul><li>OCR: OCR text recognition, recognizes text in video frames.</li><li>ASR: ASR speech recognition, recognizes voice dialogue in videos.</li><li>External: External subtitle file, provide the URL of the original/translated subtitles.</li></ul>
     */
    public String getSubtitleSource() {
        return this.SubtitleSource;
    }

    /**
     * Set <p>Subtitle source.</p><p>Enumeration values:</p><ul><li>OCR: OCR text recognition, recognizes text in video frames.</li><li>ASR: ASR speech recognition, recognizes voice dialogue in videos.</li><li>External: External subtitle file, provide the URL of the original/translated subtitles.</li></ul>
     * @param SubtitleSource <p>Subtitle source.</p><p>Enumeration values:</p><ul><li>OCR: OCR text recognition, recognizes text in video frames.</li><li>ASR: ASR speech recognition, recognizes voice dialogue in videos.</li><li>External: External subtitle file, provide the URL of the original/translated subtitles.</li></ul>
     */
    public void setSubtitleSource(String SubtitleSource) {
        this.SubtitleSource = SubtitleSource;
    }

    /**
     * Get <p>Use ASR to assist OCR.</p><p>Enumeration values:</p><ul><li>ON: Enable the use of ASR to assist OCR.</li><li>OFF: Disable the use of ASR to assist OCR.</li></ul><p>Default value: OFF</p><p>Can be set to ON only when SubtitleSource=OCR</p> 
     * @return AsrAssistOcr <p>Use ASR to assist OCR.</p><p>Enumeration values:</p><ul><li>ON: Enable the use of ASR to assist OCR.</li><li>OFF: Disable the use of ASR to assist OCR.</li></ul><p>Default value: OFF</p><p>Can be set to ON only when SubtitleSource=OCR</p>
     */
    public String getAsrAssistOcr() {
        return this.AsrAssistOcr;
    }

    /**
     * Set <p>Use ASR to assist OCR.</p><p>Enumeration values:</p><ul><li>ON: Enable the use of ASR to assist OCR.</li><li>OFF: Disable the use of ASR to assist OCR.</li></ul><p>Default value: OFF</p><p>Can be set to ON only when SubtitleSource=OCR</p>
     * @param AsrAssistOcr <p>Use ASR to assist OCR.</p><p>Enumeration values:</p><ul><li>ON: Enable the use of ASR to assist OCR.</li><li>OFF: Disable the use of ASR to assist OCR.</li></ul><p>Default value: OFF</p><p>Can be set to ON only when SubtitleSource=OCR</p>
     */
    public void setAsrAssistOcr(String AsrAssistOcr) {
        this.AsrAssistOcr = AsrAssistOcr;
    }

    /**
     * Get <p>Erase the original subtitle.</p><p>Enumeration values:</p><ul><li>ON: Erase the original subtitle.</li><li>OFF: Retain the original subtitle.</li></ul><p>Default value: OFF</p><p>Cannot be set to ON when SubtitleSource=External</p> 
     * @return EraseOriginalSubtitle <p>Erase the original subtitle.</p><p>Enumeration values:</p><ul><li>ON: Erase the original subtitle.</li><li>OFF: Retain the original subtitle.</li></ul><p>Default value: OFF</p><p>Cannot be set to ON when SubtitleSource=External</p>
     */
    public String getEraseOriginalSubtitle() {
        return this.EraseOriginalSubtitle;
    }

    /**
     * Set <p>Erase the original subtitle.</p><p>Enumeration values:</p><ul><li>ON: Erase the original subtitle.</li><li>OFF: Retain the original subtitle.</li></ul><p>Default value: OFF</p><p>Cannot be set to ON when SubtitleSource=External</p>
     * @param EraseOriginalSubtitle <p>Erase the original subtitle.</p><p>Enumeration values:</p><ul><li>ON: Erase the original subtitle.</li><li>OFF: Retain the original subtitle.</li></ul><p>Default value: OFF</p><p>Cannot be set to ON when SubtitleSource=External</p>
     */
    public void setEraseOriginalSubtitle(String EraseOriginalSubtitle) {
        this.EraseOriginalSubtitle = EraseOriginalSubtitle;
    }

    /**
     * Get <p>Subtitle location information.</p> 
     * @return SelectingSubtitleAreasConfig <p>Subtitle location information.</p>
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>Subtitle location information.</p>
     * @param SelectingSubtitleAreasConfig <p>Subtitle location information.</p>
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    public DubbingSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingSubtitleConfig(DubbingSubtitleConfig source) {
        if (source.SubtitleSource != null) {
            this.SubtitleSource = new String(source.SubtitleSource);
        }
        if (source.AsrAssistOcr != null) {
            this.AsrAssistOcr = new String(source.AsrAssistOcr);
        }
        if (source.EraseOriginalSubtitle != null) {
            this.EraseOriginalSubtitle = new String(source.EraseOriginalSubtitle);
        }
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleSource", this.SubtitleSource);
        this.setParamSimple(map, prefix + "AsrAssistOcr", this.AsrAssistOcr);
        this.setParamSimple(map, prefix + "EraseOriginalSubtitle", this.EraseOriginalSubtitle);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);

    }
}

