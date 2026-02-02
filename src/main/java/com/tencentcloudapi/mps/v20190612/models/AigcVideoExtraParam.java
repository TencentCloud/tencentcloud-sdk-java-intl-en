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

public class AigcVideoExtraParam extends AbstractModel {

    /**
    * The resolution of the generated video, which is related to the selected model and set video duration.Supported resolution options for different models:1. Kling: 720P (default) and 1080P.2. Hailuo: 768P (default) and 1080P.3. Vidu: 720P (default) and 1080P.4. GV: 720P (default) and 1080P.5. OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * The aspect ratio of the generated video.Support for this parameter by different models:1. Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.2. Hailuo does not support this parameter.3. Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.4. GV supports 16:9 (default) and 9:16.5. OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.Note: For more information about the supported aspect ratios of specific models, see the model website.
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * Indicates whether to add a logo watermark.1. Hailuo supports this parameter.2. Kling supports this parameter.
3. Vidu supports this parameter.
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * Indicates whether to generate audio for the video. Valid values: true or false.Models that support this parameter:1. GV. Default value: true.2. OS. Default value: true.
    */
    @SerializedName("EnableAudio")
    @Expose
    private Boolean EnableAudio;

    /**
    * Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.
    */
    @SerializedName("OffPeak")
    @Expose
    private Boolean OffPeak;

    /**
     * Get The resolution of the generated video, which is related to the selected model and set video duration.Supported resolution options for different models:1. Kling: 720P (default) and 1080P.2. Hailuo: 768P (default) and 1080P.3. Vidu: 720P (default) and 1080P.4. GV: 720P (default) and 1080P.5. OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available. 
     * @return Resolution The resolution of the generated video, which is related to the selected model and set video duration.Supported resolution options for different models:1. Kling: 720P (default) and 1080P.2. Hailuo: 768P (default) and 1080P.3. Vidu: 720P (default) and 1080P.4. GV: 720P (default) and 1080P.5. OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set The resolution of the generated video, which is related to the selected model and set video duration.Supported resolution options for different models:1. Kling: 720P (default) and 1080P.2. Hailuo: 768P (default) and 1080P.3. Vidu: 720P (default) and 1080P.4. GV: 720P (default) and 1080P.5. OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.
     * @param Resolution The resolution of the generated video, which is related to the selected model and set video duration.Supported resolution options for different models:1. Kling: 720P (default) and 1080P.2. Hailuo: 768P (default) and 1080P.3. Vidu: 720P (default) and 1080P.4. GV: 720P (default) and 1080P.5. OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get The aspect ratio of the generated video.Support for this parameter by different models:1. Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.2. Hailuo does not support this parameter.3. Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.4. GV supports 16:9 (default) and 9:16.5. OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.Note: For more information about the supported aspect ratios of specific models, see the model website. 
     * @return AspectRatio The aspect ratio of the generated video.Support for this parameter by different models:1. Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.2. Hailuo does not support this parameter.3. Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.4. GV supports 16:9 (default) and 9:16.5. OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.Note: For more information about the supported aspect ratios of specific models, see the model website.
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set The aspect ratio of the generated video.Support for this parameter by different models:1. Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.2. Hailuo does not support this parameter.3. Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.4. GV supports 16:9 (default) and 9:16.5. OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.Note: For more information about the supported aspect ratios of specific models, see the model website.
     * @param AspectRatio The aspect ratio of the generated video.Support for this parameter by different models:1. Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.2. Hailuo does not support this parameter.3. Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.4. GV supports 16:9 (default) and 9:16.5. OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.Note: For more information about the supported aspect ratios of specific models, see the model website.
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get Indicates whether to add a logo watermark.1. Hailuo supports this parameter.2. Kling supports this parameter.
3. Vidu supports this parameter. 
     * @return LogoAdd Indicates whether to add a logo watermark.1. Hailuo supports this parameter.2. Kling supports this parameter.
3. Vidu supports this parameter.
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set Indicates whether to add a logo watermark.1. Hailuo supports this parameter.2. Kling supports this parameter.
3. Vidu supports this parameter.
     * @param LogoAdd Indicates whether to add a logo watermark.1. Hailuo supports this parameter.2. Kling supports this parameter.
3. Vidu supports this parameter.
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get Indicates whether to generate audio for the video. Valid values: true or false.Models that support this parameter:1. GV. Default value: true.2. OS. Default value: true. 
     * @return EnableAudio Indicates whether to generate audio for the video. Valid values: true or false.Models that support this parameter:1. GV. Default value: true.2. OS. Default value: true.
     */
    public Boolean getEnableAudio() {
        return this.EnableAudio;
    }

    /**
     * Set Indicates whether to generate audio for the video. Valid values: true or false.Models that support this parameter:1. GV. Default value: true.2. OS. Default value: true.
     * @param EnableAudio Indicates whether to generate audio for the video. Valid values: true or false.Models that support this parameter:1. GV. Default value: true.2. OS. Default value: true.
     */
    public void setEnableAudio(Boolean EnableAudio) {
        this.EnableAudio = EnableAudio;
    }

    /**
     * Get Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled. 
     * @return OffPeak Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.
     */
    public Boolean getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.
     * @param OffPeak Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.
     */
    public void setOffPeak(Boolean OffPeak) {
        this.OffPeak = OffPeak;
    }

    public AigcVideoExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoExtraParam(AigcVideoExtraParam source) {
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.EnableAudio != null) {
            this.EnableAudio = new Boolean(source.EnableAudio);
        }
        if (source.OffPeak != null) {
            this.OffPeak = new Boolean(source.OffPeak);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamSimple(map, prefix + "EnableAudio", this.EnableAudio);
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);

    }
}

