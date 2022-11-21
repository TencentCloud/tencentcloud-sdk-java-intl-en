/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleTemplate extends AbstractModel{

    /**
    * The URL of the subtitles to add to the video.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * The subtitle track to add to the video. If both `Path` and `StreamIndex` are specified, `Path` will be used. You need to specify at least one of the two parameters.
    */
    @SerializedName("StreamIndex")
    @Expose
    private Long StreamIndex;

    /**
    * The font. Valid values:
<li>hei.ttf</li>
<li>song.ttf</li>
<li>simkai.ttf</li>
<li>arial.ttf (for English only)</li>
The default is `hei.ttf`.
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * The font size (pixels). If this is not specified, the font size in the subtitle file will be used.
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * The font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * The text transparency. Value range: 0-1.
<li>0: Completely transparent</li>
<li>1: Completely opaque</li>
Default value: 1.
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
     * Get The URL of the subtitles to add to the video. 
     * @return Path The URL of the subtitles to add to the video.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set The URL of the subtitles to add to the video.
     * @param Path The URL of the subtitles to add to the video.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get The subtitle track to add to the video. If both `Path` and `StreamIndex` are specified, `Path` will be used. You need to specify at least one of the two parameters. 
     * @return StreamIndex The subtitle track to add to the video. If both `Path` and `StreamIndex` are specified, `Path` will be used. You need to specify at least one of the two parameters.
     */
    public Long getStreamIndex() {
        return this.StreamIndex;
    }

    /**
     * Set The subtitle track to add to the video. If both `Path` and `StreamIndex` are specified, `Path` will be used. You need to specify at least one of the two parameters.
     * @param StreamIndex The subtitle track to add to the video. If both `Path` and `StreamIndex` are specified, `Path` will be used. You need to specify at least one of the two parameters.
     */
    public void setStreamIndex(Long StreamIndex) {
        this.StreamIndex = StreamIndex;
    }

    /**
     * Get The font. Valid values:
<li>hei.ttf</li>
<li>song.ttf</li>
<li>simkai.ttf</li>
<li>arial.ttf (for English only)</li>
The default is `hei.ttf`. 
     * @return FontType The font. Valid values:
<li>hei.ttf</li>
<li>song.ttf</li>
<li>simkai.ttf</li>
<li>arial.ttf (for English only)</li>
The default is `hei.ttf`.
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set The font. Valid values:
<li>hei.ttf</li>
<li>song.ttf</li>
<li>simkai.ttf</li>
<li>arial.ttf (for English only)</li>
The default is `hei.ttf`.
     * @param FontType The font. Valid values:
<li>hei.ttf</li>
<li>song.ttf</li>
<li>simkai.ttf</li>
<li>arial.ttf (for English only)</li>
The default is `hei.ttf`.
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get The font size (pixels). If this is not specified, the font size in the subtitle file will be used. 
     * @return FontSize The font size (pixels). If this is not specified, the font size in the subtitle file will be used.
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set The font size (pixels). If this is not specified, the font size in the subtitle file will be used.
     * @param FontSize The font size (pixels). If this is not specified, the font size in the subtitle file will be used.
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get The font color in 0xRRGGBB format. Default value: 0xFFFFFF (white). 
     * @return FontColor The font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set The font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
     * @param FontColor The font color in 0xRRGGBB format. Default value: 0xFFFFFF (white).
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get The text transparency. Value range: 0-1.
<li>0: Completely transparent</li>
<li>1: Completely opaque</li>
Default value: 1. 
     * @return FontAlpha The text transparency. Value range: 0-1.
<li>0: Completely transparent</li>
<li>1: Completely opaque</li>
Default value: 1.
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set The text transparency. Value range: 0-1.
<li>0: Completely transparent</li>
<li>1: Completely opaque</li>
Default value: 1.
     * @param FontAlpha The text transparency. Value range: 0-1.
<li>0: Completely transparent</li>
<li>1: Completely opaque</li>
Default value: 1.
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    public SubtitleTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleTemplate(SubtitleTemplate source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StreamIndex != null) {
            this.StreamIndex = new Long(source.StreamIndex);
        }
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StreamIndex", this.StreamIndex);
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);

    }
}

