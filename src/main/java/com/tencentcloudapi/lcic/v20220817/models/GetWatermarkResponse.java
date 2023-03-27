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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWatermarkResponse extends AbstractModel{

    /**
    * The watermark settings for the teacher’s video. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeacherLogo")
    @Expose
    private WatermarkConfig TeacherLogo;

    /**
    * The watermark settings for the whiteboard. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BoardLogo")
    @Expose
    private WatermarkConfig BoardLogo;

    /**
    * The background image. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackgroundPicture")
    @Expose
    private BackgroundPictureConfig BackgroundPicture;

    /**
    * The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private TextMarkConfig Text;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The watermark settings for the teacher’s video. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeacherLogo The watermark settings for the teacher’s video. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WatermarkConfig getTeacherLogo() {
        return this.TeacherLogo;
    }

    /**
     * Set The watermark settings for the teacher’s video. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeacherLogo The watermark settings for the teacher’s video. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeacherLogo(WatermarkConfig TeacherLogo) {
        this.TeacherLogo = TeacherLogo;
    }

    /**
     * Get The watermark settings for the whiteboard. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BoardLogo The watermark settings for the whiteboard. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WatermarkConfig getBoardLogo() {
        return this.BoardLogo;
    }

    /**
     * Set The watermark settings for the whiteboard. Note: This field may return null, indicating that no valid values can be obtained.
     * @param BoardLogo The watermark settings for the whiteboard. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBoardLogo(WatermarkConfig BoardLogo) {
        this.BoardLogo = BoardLogo;
    }

    /**
     * Get The background image. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackgroundPicture The background image. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BackgroundPictureConfig getBackgroundPicture() {
        return this.BackgroundPicture;
    }

    /**
     * Set The background image. Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackgroundPicture The background image. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackgroundPicture(BackgroundPictureConfig BackgroundPicture) {
        this.BackgroundPicture = BackgroundPicture;
    }

    /**
     * Get The watermark text. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Text The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TextMarkConfig getText() {
        return this.Text;
    }

    /**
     * Set The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Text The watermark text. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setText(TextMarkConfig Text) {
        this.Text = Text;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetWatermarkResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWatermarkResponse(GetWatermarkResponse source) {
        if (source.TeacherLogo != null) {
            this.TeacherLogo = new WatermarkConfig(source.TeacherLogo);
        }
        if (source.BoardLogo != null) {
            this.BoardLogo = new WatermarkConfig(source.BoardLogo);
        }
        if (source.BackgroundPicture != null) {
            this.BackgroundPicture = new BackgroundPictureConfig(source.BackgroundPicture);
        }
        if (source.Text != null) {
            this.Text = new TextMarkConfig(source.Text);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TeacherLogo.", this.TeacherLogo);
        this.setParamObj(map, prefix + "BoardLogo.", this.BoardLogo);
        this.setParamObj(map, prefix + "BackgroundPicture.", this.BackgroundPicture);
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

