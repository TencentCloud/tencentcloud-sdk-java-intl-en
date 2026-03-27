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
    * Recording screen width, defaults to 1280, value range [0, 1920]
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Recording screen height, defaults to 720, value range [0, 1080]
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Specify the output format, optional hls, mp4. When storing to VOD, this parameter is invalid; please use the MediaType setting within TencentVod (https://cloud.tencent.com/document/api/647/44055#TencentVod).
 
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * If the file format is aac or mp4, the system will automatically split the video file when it exceeds the length limit. Unit: minutes. Default: 1440 min (24h), value range: 1-1440. [Single file size is limited to a maximum of 2G. Files will be automatically split if either condition is met: file size >2G or recording duration > 24h]
This parameter does not take effect for Hls format recordings.
Sample value: 1440
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
     * Get Recording screen width, defaults to 1280, value range [0, 1920] 
     * @return Width Recording screen width, defaults to 1280, value range [0, 1920]
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Recording screen width, defaults to 1280, value range [0, 1920]
     * @param Width Recording screen width, defaults to 1280, value range [0, 1920]
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Recording screen height, defaults to 720, value range [0, 1080] 
     * @return Height Recording screen height, defaults to 720, value range [0, 1080]
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Recording screen height, defaults to 720, value range [0, 1080]
     * @param Height Recording screen height, defaults to 720, value range [0, 1080]
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Specify the output format, optional hls, mp4. When storing to VOD, this parameter is invalid; please use the MediaType setting within TencentVod (https://cloud.tencent.com/document/api/647/44055#TencentVod).
  
     * @return Format Specify the output format, optional hls, mp4. When storing to VOD, this parameter is invalid; please use the MediaType setting within TencentVod (https://cloud.tencent.com/document/api/647/44055#TencentVod).
 
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Specify the output format, optional hls, mp4. When storing to VOD, this parameter is invalid; please use the MediaType setting within TencentVod (https://cloud.tencent.com/document/api/647/44055#TencentVod).
 
     * @param Format Specify the output format, optional hls, mp4. When storing to VOD, this parameter is invalid; please use the MediaType setting within TencentVod (https://cloud.tencent.com/document/api/647/44055#TencentVod).
 
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get If the file format is aac or mp4, the system will automatically split the video file when it exceeds the length limit. Unit: minutes. Default: 1440 min (24h), value range: 1-1440. [Single file size is limited to a maximum of 2G. Files will be automatically split if either condition is met: file size >2G or recording duration > 24h]
This parameter does not take effect for Hls format recordings.
Sample value: 1440 
     * @return MaxMediaFileDuration If the file format is aac or mp4, the system will automatically split the video file when it exceeds the length limit. Unit: minutes. Default: 1440 min (24h), value range: 1-1440. [Single file size is limited to a maximum of 2G. Files will be automatically split if either condition is met: file size >2G or recording duration > 24h]
This parameter does not take effect for Hls format recordings.
Sample value: 1440
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set If the file format is aac or mp4, the system will automatically split the video file when it exceeds the length limit. Unit: minutes. Default: 1440 min (24h), value range: 1-1440. [Single file size is limited to a maximum of 2G. Files will be automatically split if either condition is met: file size >2G or recording duration > 24h]
This parameter does not take effect for Hls format recordings.
Sample value: 1440
     * @param MaxMediaFileDuration If the file format is aac or mp4, the system will automatically split the video file when it exceeds the length limit. Unit: minutes. Default: 1440 min (24h), value range: 1-1440. [Single file size is limited to a maximum of 2G. Files will be automatically split if either condition is met: file size >2G or recording duration > 24h]
This parameter does not take effect for Hls format recordings.
Sample value: 1440
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

