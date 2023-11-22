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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaOutputConfig extends AbstractModel {

    /**
    * Output file name, up to 64 characters. By default, the generated file name is specified by the system.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Output file format, optional values: mp4, hls. The default is mp4.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Classification ID is used to classify media. You can create a classification through the Create Classification interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Output video information.
    */
    @SerializedName("VideoStream")
    @Expose
    private EditMediaVideoStream VideoStream;

    /**
    * TSC Transcoding Config.
    */
    @SerializedName("TEHDConfig")
    @Expose
    private EditMediaTEHDConfig TEHDConfig;

    /**
     * Get Output file name, up to 64 characters. By default, the generated file name is specified by the system. 
     * @return MediaName Output file name, up to 64 characters. By default, the generated file name is specified by the system.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output file name, up to 64 characters. By default, the generated file name is specified by the system.
     * @param MediaName Output file name, up to 64 characters. By default, the generated file name is specified by the system.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Output file format, optional values: mp4, hls. The default is mp4. 
     * @return Type Output file format, optional values: mp4, hls. The default is mp4.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Output file format, optional values: mp4, hls. The default is mp4.
     * @param Type Output file format, optional values: mp4, hls. The default is mp4.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Classification ID is used to classify media. You can create a classification through the Create Classification interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li> 
     * @return ClassId Classification ID is used to classify media. You can create a classification through the Create Classification interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Classification ID is used to classify media. You can create a classification through the Create Classification interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
     * @param ClassId Classification ID is used to classify media. You can create a classification through the Create Classification interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return ExpireTime The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param ExpireTime The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Output video information. 
     * @return VideoStream Output video information.
     */
    public EditMediaVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set Output video information.
     * @param VideoStream Output video information.
     */
    public void setVideoStream(EditMediaVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get TSC Transcoding Config. 
     * @return TEHDConfig TSC Transcoding Config.
     */
    public EditMediaTEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set TSC Transcoding Config.
     * @param TEHDConfig TSC Transcoding Config.
     */
    public void setTEHDConfig(EditMediaTEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    public EditMediaOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaOutputConfig(EditMediaOutputConfig source) {
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.VideoStream != null) {
            this.VideoStream = new EditMediaVideoStream(source.VideoStream);
        }
        if (source.TEHDConfig != null) {
            this.TEHDConfig = new EditMediaTEHDConfig(source.TEHDConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);

    }
}

