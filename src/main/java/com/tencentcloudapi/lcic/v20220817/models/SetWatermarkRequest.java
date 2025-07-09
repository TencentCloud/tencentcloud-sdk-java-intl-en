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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetWatermarkRequest extends AbstractModel {

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The URL of the watermark for the teacher’s video. If you pass in an empty string, the teacher’s video will not have a watermark.
    */
    @SerializedName("TeacherUrl")
    @Expose
    private String TeacherUrl;

    /**
    * The URL of the watermark for the whiteboard. If you pass in an empty string, the whiteboard video will not have a watermark.
    */
    @SerializedName("BoardUrl")
    @Expose
    private String BoardUrl;

    /**
    * The image displayed when there is no video. If you pass in an empty string, no images will be displayed.
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * The width of the whiteboard’s watermark, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
    */
    @SerializedName("BoardW")
    @Expose
    private Float BoardW;

    /**
    * The height of the whiteboard’s watermark, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
    */
    @SerializedName("BoardH")
    @Expose
    private Float BoardH;

    /**
    * The horizontal offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
    */
    @SerializedName("BoardX")
    @Expose
    private Float BoardX;

    /**
    * The vertical offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
    */
    @SerializedName("BoardY")
    @Expose
    private Float BoardY;

    /**
    * The width of the watermark for the teacher’s video, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
    */
    @SerializedName("TeacherW")
    @Expose
    private Float TeacherW;

    /**
    * The height of the watermark for the teacher’s video, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
    */
    @SerializedName("TeacherH")
    @Expose
    private Float TeacherH;

    /**
    * The horizontal offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
    */
    @SerializedName("TeacherX")
    @Expose
    private Float TeacherX;

    /**
    * The vertical offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
    */
    @SerializedName("TeacherY")
    @Expose
    private Float TeacherY;

    /**
    * The watermark text. If you pass in an empty string, there will be no text.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The watermark text color.
    */
    @SerializedName("TextColor")
    @Expose
    private String TextColor;

    /**
     * Get The SDKAppID assigned by LCIC. 
     * @return SdkAppId The SDKAppID assigned by LCIC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.
     * @param SdkAppId The SDKAppID assigned by LCIC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The URL of the watermark for the teacher’s video. If you pass in an empty string, the teacher’s video will not have a watermark. 
     * @return TeacherUrl The URL of the watermark for the teacher’s video. If you pass in an empty string, the teacher’s video will not have a watermark.
     */
    public String getTeacherUrl() {
        return this.TeacherUrl;
    }

    /**
     * Set The URL of the watermark for the teacher’s video. If you pass in an empty string, the teacher’s video will not have a watermark.
     * @param TeacherUrl The URL of the watermark for the teacher’s video. If you pass in an empty string, the teacher’s video will not have a watermark.
     */
    public void setTeacherUrl(String TeacherUrl) {
        this.TeacherUrl = TeacherUrl;
    }

    /**
     * Get The URL of the watermark for the whiteboard. If you pass in an empty string, the whiteboard video will not have a watermark. 
     * @return BoardUrl The URL of the watermark for the whiteboard. If you pass in an empty string, the whiteboard video will not have a watermark.
     */
    public String getBoardUrl() {
        return this.BoardUrl;
    }

    /**
     * Set The URL of the watermark for the whiteboard. If you pass in an empty string, the whiteboard video will not have a watermark.
     * @param BoardUrl The URL of the watermark for the whiteboard. If you pass in an empty string, the whiteboard video will not have a watermark.
     */
    public void setBoardUrl(String BoardUrl) {
        this.BoardUrl = BoardUrl;
    }

    /**
     * Get The image displayed when there is no video. If you pass in an empty string, no images will be displayed. 
     * @return VideoUrl The image displayed when there is no video. If you pass in an empty string, no images will be displayed.
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set The image displayed when there is no video. If you pass in an empty string, no images will be displayed.
     * @param VideoUrl The image displayed when there is no video. If you pass in an empty string, no images will be displayed.
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get The width of the whiteboard’s watermark, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0. 
     * @return BoardW The width of the whiteboard’s watermark, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
     */
    public Float getBoardW() {
        return this.BoardW;
    }

    /**
     * Set The width of the whiteboard’s watermark, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
     * @param BoardW The width of the whiteboard’s watermark, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
     */
    public void setBoardW(Float BoardW) {
        this.BoardW = BoardW;
    }

    /**
     * Get The height of the whiteboard’s watermark, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0. 
     * @return BoardH The height of the whiteboard’s watermark, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
     */
    public Float getBoardH() {
        return this.BoardH;
    }

    /**
     * Set The height of the whiteboard’s watermark, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
     * @param BoardH The height of the whiteboard’s watermark, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
     */
    public void setBoardH(Float BoardH) {
        this.BoardH = BoardH;
    }

    /**
     * Get The horizontal offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100. 
     * @return BoardX The horizontal offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
     */
    public Float getBoardX() {
        return this.BoardX;
    }

    /**
     * Set The horizontal offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
     * @param BoardX The horizontal offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
     */
    public void setBoardX(Float BoardX) {
        this.BoardX = BoardX;
    }

    /**
     * Get The vertical offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100. 
     * @return BoardY The vertical offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
     */
    public Float getBoardY() {
        return this.BoardY;
    }

    /**
     * Set The vertical offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
     * @param BoardY The vertical offset of the whiteboard’s watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
     */
    public void setBoardY(Float BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get The width of the watermark for the teacher’s video, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0. 
     * @return TeacherW The width of the watermark for the teacher’s video, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
     */
    public Float getTeacherW() {
        return this.TeacherW;
    }

    /**
     * Set The width of the watermark for the teacher’s video, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
     * @param TeacherW The width of the watermark for the teacher’s video, which is expressed as a percentage of the video width. The value range is 0-100, and the default value is 0.
     */
    public void setTeacherW(Float TeacherW) {
        this.TeacherW = TeacherW;
    }

    /**
     * Get The height of the watermark for the teacher’s video, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0. 
     * @return TeacherH The height of the watermark for the teacher’s video, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
     */
    public Float getTeacherH() {
        return this.TeacherH;
    }

    /**
     * Set The height of the watermark for the teacher’s video, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
     * @param TeacherH The height of the watermark for the teacher’s video, which is expressed as a percentage of the video height. The value range is 0-100, and the default value is 0.
     */
    public void setTeacherH(Float TeacherH) {
        this.TeacherH = TeacherH;
    }

    /**
     * Get The horizontal offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100. 
     * @return TeacherX The horizontal offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
     */
    public Float getTeacherX() {
        return this.TeacherX;
    }

    /**
     * Set The horizontal offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
     * @param TeacherX The horizontal offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100.
     */
    public void setTeacherX(Float TeacherX) {
        this.TeacherX = TeacherX;
    }

    /**
     * Get The vertical offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100. 
     * @return TeacherY The vertical offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
     */
    public Float getTeacherY() {
        return this.TeacherY;
    }

    /**
     * Set The vertical offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
     * @param TeacherY The vertical offset of the watermark for the teacher’s video, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100.
     */
    public void setTeacherY(Float TeacherY) {
        this.TeacherY = TeacherY;
    }

    /**
     * Get The watermark text. If you pass in an empty string, there will be no text. 
     * @return Text The watermark text. If you pass in an empty string, there will be no text.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The watermark text. If you pass in an empty string, there will be no text.
     * @param Text The watermark text. If you pass in an empty string, there will be no text.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The watermark text color. 
     * @return TextColor The watermark text color.
     */
    public String getTextColor() {
        return this.TextColor;
    }

    /**
     * Set The watermark text color.
     * @param TextColor The watermark text color.
     */
    public void setTextColor(String TextColor) {
        this.TextColor = TextColor;
    }

    public SetWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetWatermarkRequest(SetWatermarkRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TeacherUrl != null) {
            this.TeacherUrl = new String(source.TeacherUrl);
        }
        if (source.BoardUrl != null) {
            this.BoardUrl = new String(source.BoardUrl);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.BoardW != null) {
            this.BoardW = new Float(source.BoardW);
        }
        if (source.BoardH != null) {
            this.BoardH = new Float(source.BoardH);
        }
        if (source.BoardX != null) {
            this.BoardX = new Float(source.BoardX);
        }
        if (source.BoardY != null) {
            this.BoardY = new Float(source.BoardY);
        }
        if (source.TeacherW != null) {
            this.TeacherW = new Float(source.TeacherW);
        }
        if (source.TeacherH != null) {
            this.TeacherH = new Float(source.TeacherH);
        }
        if (source.TeacherX != null) {
            this.TeacherX = new Float(source.TeacherX);
        }
        if (source.TeacherY != null) {
            this.TeacherY = new Float(source.TeacherY);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextColor != null) {
            this.TextColor = new String(source.TextColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TeacherUrl", this.TeacherUrl);
        this.setParamSimple(map, prefix + "BoardUrl", this.BoardUrl);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "BoardW", this.BoardW);
        this.setParamSimple(map, prefix + "BoardH", this.BoardH);
        this.setParamSimple(map, prefix + "BoardX", this.BoardX);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "TeacherW", this.TeacherW);
        this.setParamSimple(map, prefix + "TeacherH", this.TeacherH);
        this.setParamSimple(map, prefix + "TeacherX", this.TeacherX);
        this.setParamSimple(map, prefix + "TeacherY", this.TeacherY);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TextColor", this.TextColor);

    }
}

