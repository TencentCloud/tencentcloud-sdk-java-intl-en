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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebRecordVideoParams extends AbstractModel {

    /**
    * Recording image width defaults to 1280, with a value range of [0, 1920].
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Recording image height, defaults to 720, in the range of [0, 1080].
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Specify output format. valid values: hls, mp4. this parameter is invalid when storing in VOD. to store in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).

    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
Example value: 1440.
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
     * Get Recording image width defaults to 1280, with a value range of [0, 1920]. 
     * @return Width Recording image width defaults to 1280, with a value range of [0, 1920].
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Recording image width defaults to 1280, with a value range of [0, 1920].
     * @param Width Recording image width defaults to 1280, with a value range of [0, 1920].
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Recording image height, defaults to 720, in the range of [0, 1080]. 
     * @return Height Recording image height, defaults to 720, in the range of [0, 1080].
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Recording image height, defaults to 720, in the range of [0, 1080].
     * @param Height Recording image height, defaults to 720, in the range of [0, 1080].
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Specify output format. valid values: hls, mp4. this parameter is invalid when storing in VOD. to store in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).
 
     * @return Format Specify output format. valid values: hls, mp4. this parameter is invalid when storing in VOD. to store in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).

     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Specify output format. valid values: hls, mp4. this parameter is invalid when storing in VOD. to store in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).

     * @param Format Specify output format. valid values: hls, mp4. this parameter is invalid when storing in VOD. to store in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).

     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
Example value: 1440. 
     * @return MaxMediaFileDuration If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
Example value: 1440.
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
Example value: 1440.
     * @param MaxMediaFileDuration If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
Example value: 1440.
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    public WebRecordVideoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebRecordVideoParams(WebRecordVideoParams source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.MaxMediaFileDuration != null) {
            this.MaxMediaFileDuration = new Long(source.MaxMediaFileDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "MaxMediaFileDuration", this.MaxMediaFileDuration);

    }
}

