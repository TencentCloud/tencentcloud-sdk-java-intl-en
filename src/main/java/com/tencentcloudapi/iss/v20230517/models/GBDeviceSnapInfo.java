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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GBDeviceSnapInfo extends AbstractModel {

    /**
    * File name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Download link. Empty value means the stored image expires.
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * Image size in Unit B.
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Creation time of the file.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Reception time of the image
    */
    @SerializedName("ReceivedTime")
    @Expose
    private String ReceivedTime;

    /**
    * Preview link. Empty value means the stored image expires.
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * National standard signaling session ID, corresponding to the request_id returned by the ControlDeviceSnapshot API.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get File name 
     * @return FileName File name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name
     * @param FileName File name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Download link. Empty value means the stored image expires. 
     * @return DownloadUrl Download link. Empty value means the stored image expires.
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set Download link. Empty value means the stored image expires.
     * @param DownloadUrl Download link. Empty value means the stored image expires.
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get Image size in Unit B. 
     * @return ImageSize Image size in Unit B.
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size in Unit B.
     * @param ImageSize Image size in Unit B.
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Creation time of the file. 
     * @return CreatedTime Creation time of the file.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of the file.
     * @param CreatedTime Creation time of the file.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Reception time of the image 
     * @return ReceivedTime Reception time of the image
     */
    public String getReceivedTime() {
        return this.ReceivedTime;
    }

    /**
     * Set Reception time of the image
     * @param ReceivedTime Reception time of the image
     */
    public void setReceivedTime(String ReceivedTime) {
        this.ReceivedTime = ReceivedTime;
    }

    /**
     * Get Preview link. Empty value means the stored image expires. 
     * @return PreviewUrl Preview link. Empty value means the stored image expires.
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set Preview link. Empty value means the stored image expires.
     * @param PreviewUrl Preview link. Empty value means the stored image expires.
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get National standard signaling session ID, corresponding to the request_id returned by the ControlDeviceSnapshot API. 
     * @return SessionId National standard signaling session ID, corresponding to the request_id returned by the ControlDeviceSnapshot API.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set National standard signaling session ID, corresponding to the request_id returned by the ControlDeviceSnapshot API.
     * @param SessionId National standard signaling session ID, corresponding to the request_id returned by the ControlDeviceSnapshot API.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public GBDeviceSnapInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GBDeviceSnapInfo(GBDeviceSnapInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ReceivedTime != null) {
            this.ReceivedTime = new String(source.ReceivedTime);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ReceivedTime", this.ReceivedTime);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

