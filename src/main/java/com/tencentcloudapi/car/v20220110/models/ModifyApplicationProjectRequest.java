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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationProjectRequest extends AbstractModel {

    /**
    * Project ID returned by cloud.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Concurrency type required for project operation.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether to Enable Pre-launch.
    */
    @SerializedName("IsPreload")
    @Expose
    private Boolean IsPreload;

    /**
    * Application startup parameters.
    */
    @SerializedName("ApplicationParams")
    @Expose
    private String ApplicationParams;

    /**
    * Cloud application project description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Resolution, in the format of widthxheight, such as 1920x1080.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Frame rate.
    */
    @SerializedName("FPS")
    @Expose
    private Long FPS;

    /**
    * Waiting time for pre-launch.
    */
    @SerializedName("PreloadDuration")
    @Expose
    private String PreloadDuration;

    /**
    * Waiting time for reconnection.
    */
    @SerializedName("ReconnectTimeout")
    @Expose
    private String ReconnectTimeout;

    /**
    * Minimum bitrate, in Mbps.
    */
    @SerializedName("MinBitrate")
    @Expose
    private Long MinBitrate;

    /**
    * Maximum bitrate, in Mbps.
    */
    @SerializedName("MaxBitrate")
    @Expose
    private Long MaxBitrate;

    /**
    * Upstream audio options.DisableMixIntoStreamPush: not mixing upstream audio in streaming.
    */
    @SerializedName("UpstreamAudioOption")
    @Expose
    private String UpstreamAudioOption;

    /**
    * Video encoding configuration.
    */
    @SerializedName("VideoEncodeConfig")
    @Expose
    private VideoEncodeConfig VideoEncodeConfig;

    /**
    * Upper limit of the XR application resolution.If the project concurrency type is L or L2, the upper limit is 5000; if the project concurrency type is XL2, the upper limit is 6000.
    */
    @SerializedName("XRMaxWidth")
    @Expose
    private Long XRMaxWidth;

    /**
    * ID of the background image COS file.
    */
    @SerializedName("BackgroundImageCOSFileId")
    @Expose
    private String BackgroundImageCOSFileId;

    /**
    * Disabled code list.
    */
    @SerializedName("DisableVideoCodecs")
    @Expose
    private String [] DisableVideoCodecs;

    /**
     * Get Project ID returned by cloud. 
     * @return ProjectId Project ID returned by cloud.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID returned by cloud.
     * @param ProjectId Project ID returned by cloud.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name. 
     * @return Name Project name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name.
     * @param Name Project name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Concurrency type required for project operation. 
     * @return Type Concurrency type required for project operation.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Concurrency type required for project operation.
     * @param Type Concurrency type required for project operation.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to Enable Pre-launch. 
     * @return IsPreload Whether to Enable Pre-launch.
     */
    public Boolean getIsPreload() {
        return this.IsPreload;
    }

    /**
     * Set Whether to Enable Pre-launch.
     * @param IsPreload Whether to Enable Pre-launch.
     */
    public void setIsPreload(Boolean IsPreload) {
        this.IsPreload = IsPreload;
    }

    /**
     * Get Application startup parameters. 
     * @return ApplicationParams Application startup parameters.
     */
    public String getApplicationParams() {
        return this.ApplicationParams;
    }

    /**
     * Set Application startup parameters.
     * @param ApplicationParams Application startup parameters.
     */
    public void setApplicationParams(String ApplicationParams) {
        this.ApplicationParams = ApplicationParams;
    }

    /**
     * Get Cloud application project description. 
     * @return Description Cloud application project description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Cloud application project description.
     * @param Description Cloud application project description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Resolution, in the format of widthxheight, such as 1920x1080. 
     * @return Resolution Resolution, in the format of widthxheight, such as 1920x1080.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution, in the format of widthxheight, such as 1920x1080.
     * @param Resolution Resolution, in the format of widthxheight, such as 1920x1080.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Frame rate. 
     * @return FPS Frame rate.
     */
    public Long getFPS() {
        return this.FPS;
    }

    /**
     * Set Frame rate.
     * @param FPS Frame rate.
     */
    public void setFPS(Long FPS) {
        this.FPS = FPS;
    }

    /**
     * Get Waiting time for pre-launch. 
     * @return PreloadDuration Waiting time for pre-launch.
     */
    public String getPreloadDuration() {
        return this.PreloadDuration;
    }

    /**
     * Set Waiting time for pre-launch.
     * @param PreloadDuration Waiting time for pre-launch.
     */
    public void setPreloadDuration(String PreloadDuration) {
        this.PreloadDuration = PreloadDuration;
    }

    /**
     * Get Waiting time for reconnection. 
     * @return ReconnectTimeout Waiting time for reconnection.
     */
    public String getReconnectTimeout() {
        return this.ReconnectTimeout;
    }

    /**
     * Set Waiting time for reconnection.
     * @param ReconnectTimeout Waiting time for reconnection.
     */
    public void setReconnectTimeout(String ReconnectTimeout) {
        this.ReconnectTimeout = ReconnectTimeout;
    }

    /**
     * Get Minimum bitrate, in Mbps. 
     * @return MinBitrate Minimum bitrate, in Mbps.
     */
    public Long getMinBitrate() {
        return this.MinBitrate;
    }

    /**
     * Set Minimum bitrate, in Mbps.
     * @param MinBitrate Minimum bitrate, in Mbps.
     */
    public void setMinBitrate(Long MinBitrate) {
        this.MinBitrate = MinBitrate;
    }

    /**
     * Get Maximum bitrate, in Mbps. 
     * @return MaxBitrate Maximum bitrate, in Mbps.
     */
    public Long getMaxBitrate() {
        return this.MaxBitrate;
    }

    /**
     * Set Maximum bitrate, in Mbps.
     * @param MaxBitrate Maximum bitrate, in Mbps.
     */
    public void setMaxBitrate(Long MaxBitrate) {
        this.MaxBitrate = MaxBitrate;
    }

    /**
     * Get Upstream audio options.DisableMixIntoStreamPush: not mixing upstream audio in streaming. 
     * @return UpstreamAudioOption Upstream audio options.DisableMixIntoStreamPush: not mixing upstream audio in streaming.
     */
    public String getUpstreamAudioOption() {
        return this.UpstreamAudioOption;
    }

    /**
     * Set Upstream audio options.DisableMixIntoStreamPush: not mixing upstream audio in streaming.
     * @param UpstreamAudioOption Upstream audio options.DisableMixIntoStreamPush: not mixing upstream audio in streaming.
     */
    public void setUpstreamAudioOption(String UpstreamAudioOption) {
        this.UpstreamAudioOption = UpstreamAudioOption;
    }

    /**
     * Get Video encoding configuration. 
     * @return VideoEncodeConfig Video encoding configuration.
     */
    public VideoEncodeConfig getVideoEncodeConfig() {
        return this.VideoEncodeConfig;
    }

    /**
     * Set Video encoding configuration.
     * @param VideoEncodeConfig Video encoding configuration.
     */
    public void setVideoEncodeConfig(VideoEncodeConfig VideoEncodeConfig) {
        this.VideoEncodeConfig = VideoEncodeConfig;
    }

    /**
     * Get Upper limit of the XR application resolution.If the project concurrency type is L or L2, the upper limit is 5000; if the project concurrency type is XL2, the upper limit is 6000. 
     * @return XRMaxWidth Upper limit of the XR application resolution.If the project concurrency type is L or L2, the upper limit is 5000; if the project concurrency type is XL2, the upper limit is 6000.
     */
    public Long getXRMaxWidth() {
        return this.XRMaxWidth;
    }

    /**
     * Set Upper limit of the XR application resolution.If the project concurrency type is L or L2, the upper limit is 5000; if the project concurrency type is XL2, the upper limit is 6000.
     * @param XRMaxWidth Upper limit of the XR application resolution.If the project concurrency type is L or L2, the upper limit is 5000; if the project concurrency type is XL2, the upper limit is 6000.
     */
    public void setXRMaxWidth(Long XRMaxWidth) {
        this.XRMaxWidth = XRMaxWidth;
    }

    /**
     * Get ID of the background image COS file. 
     * @return BackgroundImageCOSFileId ID of the background image COS file.
     */
    public String getBackgroundImageCOSFileId() {
        return this.BackgroundImageCOSFileId;
    }

    /**
     * Set ID of the background image COS file.
     * @param BackgroundImageCOSFileId ID of the background image COS file.
     */
    public void setBackgroundImageCOSFileId(String BackgroundImageCOSFileId) {
        this.BackgroundImageCOSFileId = BackgroundImageCOSFileId;
    }

    /**
     * Get Disabled code list. 
     * @return DisableVideoCodecs Disabled code list.
     */
    public String [] getDisableVideoCodecs() {
        return this.DisableVideoCodecs;
    }

    /**
     * Set Disabled code list.
     * @param DisableVideoCodecs Disabled code list.
     */
    public void setDisableVideoCodecs(String [] DisableVideoCodecs) {
        this.DisableVideoCodecs = DisableVideoCodecs;
    }

    public ModifyApplicationProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationProjectRequest(ModifyApplicationProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IsPreload != null) {
            this.IsPreload = new Boolean(source.IsPreload);
        }
        if (source.ApplicationParams != null) {
            this.ApplicationParams = new String(source.ApplicationParams);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.FPS != null) {
            this.FPS = new Long(source.FPS);
        }
        if (source.PreloadDuration != null) {
            this.PreloadDuration = new String(source.PreloadDuration);
        }
        if (source.ReconnectTimeout != null) {
            this.ReconnectTimeout = new String(source.ReconnectTimeout);
        }
        if (source.MinBitrate != null) {
            this.MinBitrate = new Long(source.MinBitrate);
        }
        if (source.MaxBitrate != null) {
            this.MaxBitrate = new Long(source.MaxBitrate);
        }
        if (source.UpstreamAudioOption != null) {
            this.UpstreamAudioOption = new String(source.UpstreamAudioOption);
        }
        if (source.VideoEncodeConfig != null) {
            this.VideoEncodeConfig = new VideoEncodeConfig(source.VideoEncodeConfig);
        }
        if (source.XRMaxWidth != null) {
            this.XRMaxWidth = new Long(source.XRMaxWidth);
        }
        if (source.BackgroundImageCOSFileId != null) {
            this.BackgroundImageCOSFileId = new String(source.BackgroundImageCOSFileId);
        }
        if (source.DisableVideoCodecs != null) {
            this.DisableVideoCodecs = new String[source.DisableVideoCodecs.length];
            for (int i = 0; i < source.DisableVideoCodecs.length; i++) {
                this.DisableVideoCodecs[i] = new String(source.DisableVideoCodecs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsPreload", this.IsPreload);
        this.setParamSimple(map, prefix + "ApplicationParams", this.ApplicationParams);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "FPS", this.FPS);
        this.setParamSimple(map, prefix + "PreloadDuration", this.PreloadDuration);
        this.setParamSimple(map, prefix + "ReconnectTimeout", this.ReconnectTimeout);
        this.setParamSimple(map, prefix + "MinBitrate", this.MinBitrate);
        this.setParamSimple(map, prefix + "MaxBitrate", this.MaxBitrate);
        this.setParamSimple(map, prefix + "UpstreamAudioOption", this.UpstreamAudioOption);
        this.setParamObj(map, prefix + "VideoEncodeConfig.", this.VideoEncodeConfig);
        this.setParamSimple(map, prefix + "XRMaxWidth", this.XRMaxWidth);
        this.setParamSimple(map, prefix + "BackgroundImageCOSFileId", this.BackgroundImageCOSFileId);
        this.setParamArraySimple(map, prefix + "DisableVideoCodecs.", this.DisableVideoCodecs);

    }
}

