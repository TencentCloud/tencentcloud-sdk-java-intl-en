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

public class VLPlanResultDetailInfo extends AbstractModel {

    /**
    * <p>Analysis result ID</p>
    */
    @SerializedName("VLPlanResultId")
    @Expose
    private String VLPlanResultId;

    /**
    * <p>Media type. The current fixed value is image</p>
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <p>ID of the associated analysis plan</p>
    */
    @SerializedName("VLPlanId")
    @Expose
    private String VLPlanId;

    /**
    * <p>Plan name</p>
    */
    @SerializedName("VLPlanName")
    @Expose
    private String VLPlanName;

    /**
    * <p>Channel ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>Channel name</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>Device ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>Device name</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>Affiliated organization ID</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>Affiliated organization name</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>Analysis timestamp (seconds)</p>
    */
    @SerializedName("VLResultTimestamp")
    @Expose
    private Long VLResultTimestamp;

    /**
    * <p>Image mode screenshot timestamp (seconds)</p>
    */
    @SerializedName("SnapshotTimestamp")
    @Expose
    private Long SnapshotTimestamp;

    /**
    * <p>Video clip start timestamp (seconds)</p>
    */
    @SerializedName("VideoStartTimestamp")
    @Expose
    private Long VideoStartTimestamp;

    /**
    * <p>Video segment end timestamp (seconds)</p>
    */
    @SerializedName("VideoEndTimestamp")
    @Expose
    private Long VideoEndTimestamp;

    /**
    * <p>Billing method for the number of frames in video mode</p>
    */
    @SerializedName("BilledFrameCount")
    @Expose
    private Long BilledFrameCount;

    /**
    * <p>AI analysis result content (JSON string)</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Temporary screenshot download URL (valid for 300 seconds)</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>Screenshot URL validity period (seconds)</p>
    */
    @SerializedName("ImageUrlExpire")
    @Expose
    private Long ImageUrlExpire;

    /**
    * <p>Creation time, format: 2006-01-02 15:04:05</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>Update time, format 2006-01-02 15:04:05</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get <p>Analysis result ID</p> 
     * @return VLPlanResultId <p>Analysis result ID</p>
     */
    public String getVLPlanResultId() {
        return this.VLPlanResultId;
    }

    /**
     * Set <p>Analysis result ID</p>
     * @param VLPlanResultId <p>Analysis result ID</p>
     */
    public void setVLPlanResultId(String VLPlanResultId) {
        this.VLPlanResultId = VLPlanResultId;
    }

    /**
     * Get <p>Media type. The current fixed value is image</p> 
     * @return MediaType <p>Media type. The current fixed value is image</p>
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>Media type. The current fixed value is image</p>
     * @param MediaType <p>Media type. The current fixed value is image</p>
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get <p>ID of the associated analysis plan</p> 
     * @return VLPlanId <p>ID of the associated analysis plan</p>
     */
    public String getVLPlanId() {
        return this.VLPlanId;
    }

    /**
     * Set <p>ID of the associated analysis plan</p>
     * @param VLPlanId <p>ID of the associated analysis plan</p>
     */
    public void setVLPlanId(String VLPlanId) {
        this.VLPlanId = VLPlanId;
    }

    /**
     * Get <p>Plan name</p> 
     * @return VLPlanName <p>Plan name</p>
     */
    public String getVLPlanName() {
        return this.VLPlanName;
    }

    /**
     * Set <p>Plan name</p>
     * @param VLPlanName <p>Plan name</p>
     */
    public void setVLPlanName(String VLPlanName) {
        this.VLPlanName = VLPlanName;
    }

    /**
     * Get <p>Channel ID</p> 
     * @return ChannelId <p>Channel ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>Channel ID</p>
     * @param ChannelId <p>Channel ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>Channel name</p> 
     * @return ChannelName <p>Channel name</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>Channel name</p>
     * @param ChannelName <p>Channel name</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>Device ID</p> 
     * @return DeviceId <p>Device ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>Device ID</p>
     * @param DeviceId <p>Device ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>Device name</p> 
     * @return DeviceName <p>Device name</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>Device name</p>
     * @param DeviceName <p>Device name</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>Affiliated organization ID</p> 
     * @return OrganizationId <p>Affiliated organization ID</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>Affiliated organization ID</p>
     * @param OrganizationId <p>Affiliated organization ID</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>Affiliated organization name</p> 
     * @return OrganizationName <p>Affiliated organization name</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>Affiliated organization name</p>
     * @param OrganizationName <p>Affiliated organization name</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>Analysis timestamp (seconds)</p> 
     * @return VLResultTimestamp <p>Analysis timestamp (seconds)</p>
     */
    public Long getVLResultTimestamp() {
        return this.VLResultTimestamp;
    }

    /**
     * Set <p>Analysis timestamp (seconds)</p>
     * @param VLResultTimestamp <p>Analysis timestamp (seconds)</p>
     */
    public void setVLResultTimestamp(Long VLResultTimestamp) {
        this.VLResultTimestamp = VLResultTimestamp;
    }

    /**
     * Get <p>Image mode screenshot timestamp (seconds)</p> 
     * @return SnapshotTimestamp <p>Image mode screenshot timestamp (seconds)</p>
     */
    public Long getSnapshotTimestamp() {
        return this.SnapshotTimestamp;
    }

    /**
     * Set <p>Image mode screenshot timestamp (seconds)</p>
     * @param SnapshotTimestamp <p>Image mode screenshot timestamp (seconds)</p>
     */
    public void setSnapshotTimestamp(Long SnapshotTimestamp) {
        this.SnapshotTimestamp = SnapshotTimestamp;
    }

    /**
     * Get <p>Video clip start timestamp (seconds)</p> 
     * @return VideoStartTimestamp <p>Video clip start timestamp (seconds)</p>
     */
    public Long getVideoStartTimestamp() {
        return this.VideoStartTimestamp;
    }

    /**
     * Set <p>Video clip start timestamp (seconds)</p>
     * @param VideoStartTimestamp <p>Video clip start timestamp (seconds)</p>
     */
    public void setVideoStartTimestamp(Long VideoStartTimestamp) {
        this.VideoStartTimestamp = VideoStartTimestamp;
    }

    /**
     * Get <p>Video segment end timestamp (seconds)</p> 
     * @return VideoEndTimestamp <p>Video segment end timestamp (seconds)</p>
     */
    public Long getVideoEndTimestamp() {
        return this.VideoEndTimestamp;
    }

    /**
     * Set <p>Video segment end timestamp (seconds)</p>
     * @param VideoEndTimestamp <p>Video segment end timestamp (seconds)</p>
     */
    public void setVideoEndTimestamp(Long VideoEndTimestamp) {
        this.VideoEndTimestamp = VideoEndTimestamp;
    }

    /**
     * Get <p>Billing method for the number of frames in video mode</p> 
     * @return BilledFrameCount <p>Billing method for the number of frames in video mode</p>
     */
    public Long getBilledFrameCount() {
        return this.BilledFrameCount;
    }

    /**
     * Set <p>Billing method for the number of frames in video mode</p>
     * @param BilledFrameCount <p>Billing method for the number of frames in video mode</p>
     */
    public void setBilledFrameCount(Long BilledFrameCount) {
        this.BilledFrameCount = BilledFrameCount;
    }

    /**
     * Get <p>AI analysis result content (JSON string)</p> 
     * @return Content <p>AI analysis result content (JSON string)</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>AI analysis result content (JSON string)</p>
     * @param Content <p>AI analysis result content (JSON string)</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Temporary screenshot download URL (valid for 300 seconds)</p> 
     * @return ImageUrl <p>Temporary screenshot download URL (valid for 300 seconds)</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>Temporary screenshot download URL (valid for 300 seconds)</p>
     * @param ImageUrl <p>Temporary screenshot download URL (valid for 300 seconds)</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>Screenshot URL validity period (seconds)</p> 
     * @return ImageUrlExpire <p>Screenshot URL validity period (seconds)</p>
     */
    public Long getImageUrlExpire() {
        return this.ImageUrlExpire;
    }

    /**
     * Set <p>Screenshot URL validity period (seconds)</p>
     * @param ImageUrlExpire <p>Screenshot URL validity period (seconds)</p>
     */
    public void setImageUrlExpire(Long ImageUrlExpire) {
        this.ImageUrlExpire = ImageUrlExpire;
    }

    /**
     * Get <p>Creation time, format: 2006-01-02 15:04:05</p> 
     * @return CreatedAt <p>Creation time, format: 2006-01-02 15:04:05</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Creation time, format: 2006-01-02 15:04:05</p>
     * @param CreatedAt <p>Creation time, format: 2006-01-02 15:04:05</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Update time, format 2006-01-02 15:04:05</p> 
     * @return UpdatedAt <p>Update time, format 2006-01-02 15:04:05</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>Update time, format 2006-01-02 15:04:05</p>
     * @param UpdatedAt <p>Update time, format 2006-01-02 15:04:05</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public VLPlanResultDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLPlanResultDetailInfo(VLPlanResultDetailInfo source) {
        if (source.VLPlanResultId != null) {
            this.VLPlanResultId = new String(source.VLPlanResultId);
        }
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
        if (source.VLPlanId != null) {
            this.VLPlanId = new String(source.VLPlanId);
        }
        if (source.VLPlanName != null) {
            this.VLPlanName = new String(source.VLPlanName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.VLResultTimestamp != null) {
            this.VLResultTimestamp = new Long(source.VLResultTimestamp);
        }
        if (source.SnapshotTimestamp != null) {
            this.SnapshotTimestamp = new Long(source.SnapshotTimestamp);
        }
        if (source.VideoStartTimestamp != null) {
            this.VideoStartTimestamp = new Long(source.VideoStartTimestamp);
        }
        if (source.VideoEndTimestamp != null) {
            this.VideoEndTimestamp = new Long(source.VideoEndTimestamp);
        }
        if (source.BilledFrameCount != null) {
            this.BilledFrameCount = new Long(source.BilledFrameCount);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageUrlExpire != null) {
            this.ImageUrlExpire = new Long(source.ImageUrlExpire);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanResultId", this.VLPlanResultId);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "VLPlanId", this.VLPlanId);
        this.setParamSimple(map, prefix + "VLPlanName", this.VLPlanName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "VLResultTimestamp", this.VLResultTimestamp);
        this.setParamSimple(map, prefix + "SnapshotTimestamp", this.SnapshotTimestamp);
        this.setParamSimple(map, prefix + "VideoStartTimestamp", this.VideoStartTimestamp);
        this.setParamSimple(map, prefix + "VideoEndTimestamp", this.VideoEndTimestamp);
        this.setParamSimple(map, prefix + "BilledFrameCount", this.BilledFrameCount);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageUrlExpire", this.ImageUrlExpire);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

