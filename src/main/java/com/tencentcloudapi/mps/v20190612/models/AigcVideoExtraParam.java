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
    * <p>Resolution of the generated video. The resolution is related to the selected model and set video duration.</p><p>Supported resolution options for different models:</p><ol><li>Kling: 720P (default) and 1080P.</li><li>Hailuo: 768P (default) and 1080P.</li><li>Vidu: 720P (default) and 1080P.</li><li>GV: 720P (default) and 1080P.</li><li>OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.</li></ol><p>Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Aspect ratio of the generated video.</p><p>Support for this parameter by different models:</p><ol><li>Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.</li><li>Hailuo does not support this parameter.</li><li>Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.</li><li>GV supports 16:9 (default) and 9:16.</li><li>OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.</li></ol><p>Note: For more information about the supported aspect ratios of specific models, see the model website.</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>Indicates whether to add a logo watermark.</p><ol><li>Hailuo supports this parameter.</li><li>Kling supports this parameter.</li><li>Vidu supports this parameter.</li></ol>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>Indicates whether to generate audio for the video. Valid values: true or false.</p><p>Models that support this parameter:</p><ol><li>GV. Default value: true.</li><li>OS. Default value: true.</li></ol>
    */
    @SerializedName("EnableAudio")
    @Expose
    private Boolean EnableAudio;

    /**
    * <p>Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.<br>Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.</p>
    */
    @SerializedName("OffPeak")
    @Expose
    private Boolean OffPeak;

    /**
    * <p>Indicates whether to add background music to the generated video. Default value: false. Valid values: true or false.<br>Note: Only some model versions support this.</p>
    */
    @SerializedName("EnableBgm")
    @Expose
    private Boolean EnableBgm;

    /**
     * Get <p>Resolution of the generated video. The resolution is related to the selected model and set video duration.</p><p>Supported resolution options for different models:</p><ol><li>Kling: 720P (default) and 1080P.</li><li>Hailuo: 768P (default) and 1080P.</li><li>Vidu: 720P (default) and 1080P.</li><li>GV: 720P (default) and 1080P.</li><li>OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.</li></ol><p>Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.</p> 
     * @return Resolution <p>Resolution of the generated video. The resolution is related to the selected model and set video duration.</p><p>Supported resolution options for different models:</p><ol><li>Kling: 720P (default) and 1080P.</li><li>Hailuo: 768P (default) and 1080P.</li><li>Vidu: 720P (default) and 1080P.</li><li>GV: 720P (default) and 1080P.</li><li>OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.</li></ol><p>Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Resolution of the generated video. The resolution is related to the selected model and set video duration.</p><p>Supported resolution options for different models:</p><ol><li>Kling: 720P (default) and 1080P.</li><li>Hailuo: 768P (default) and 1080P.</li><li>Vidu: 720P (default) and 1080P.</li><li>GV: 720P (default) and 1080P.</li><li>OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.</li></ol><p>Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.</p>
     * @param Resolution <p>Resolution of the generated video. The resolution is related to the selected model and set video duration.</p><p>Supported resolution options for different models:</p><ol><li>Kling: 720P (default) and 1080P.</li><li>Hailuo: 768P (default) and 1080P.</li><li>Vidu: 720P (default) and 1080P.</li><li>GV: 720P (default) and 1080P.</li><li>OS: 720P. For images, only 1280x720 and 720x1280 are supported. Resolution cannot be specified.</li></ol><p>Note: In addition to the resolution supported by the model, 2K and 4K resolutions are also available.</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Aspect ratio of the generated video.</p><p>Support for this parameter by different models:</p><ol><li>Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.</li><li>Hailuo does not support this parameter.</li><li>Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.</li><li>GV supports 16:9 (default) and 9:16.</li><li>OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.</li></ol><p>Note: For more information about the supported aspect ratios of specific models, see the model website.</p> 
     * @return AspectRatio <p>Aspect ratio of the generated video.</p><p>Support for this parameter by different models:</p><ol><li>Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.</li><li>Hailuo does not support this parameter.</li><li>Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.</li><li>GV supports 16:9 (default) and 9:16.</li><li>OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.</li></ol><p>Note: For more information about the supported aspect ratios of specific models, see the model website.</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>Aspect ratio of the generated video.</p><p>Support for this parameter by different models:</p><ol><li>Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.</li><li>Hailuo does not support this parameter.</li><li>Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.</li><li>GV supports 16:9 (default) and 9:16.</li><li>OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.</li></ol><p>Note: For more information about the supported aspect ratios of specific models, see the model website.</p>
     * @param AspectRatio <p>Aspect ratio of the generated video.</p><p>Support for this parameter by different models:</p><ol><li>Kling only supports this parameter for text-to-video, with aspect ratios of 16:9 (default), 9:16, and 1:1.</li><li>Hailuo does not support this parameter.</li><li>Vidu supports [16:9, 9:16, 4:3, 3:4, 1:1] for text-to-video and reference image-to-video only. Only q2 supports 4:3 and 3:4.</li><li>GV supports 16:9 (default) and 9:16.</li><li>OS only supports this parameter for text-to-video, with aspect ratios of 16:9 (default) and 9:16.</li></ol><p>Note: For more information about the supported aspect ratios of specific models, see the model website.</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>Indicates whether to add a logo watermark.</p><ol><li>Hailuo supports this parameter.</li><li>Kling supports this parameter.</li><li>Vidu supports this parameter.</li></ol> 
     * @return LogoAdd <p>Indicates whether to add a logo watermark.</p><ol><li>Hailuo supports this parameter.</li><li>Kling supports this parameter.</li><li>Vidu supports this parameter.</li></ol>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>Indicates whether to add a logo watermark.</p><ol><li>Hailuo supports this parameter.</li><li>Kling supports this parameter.</li><li>Vidu supports this parameter.</li></ol>
     * @param LogoAdd <p>Indicates whether to add a logo watermark.</p><ol><li>Hailuo supports this parameter.</li><li>Kling supports this parameter.</li><li>Vidu supports this parameter.</li></ol>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>Indicates whether to generate audio for the video. Valid values: true or false.</p><p>Models that support this parameter:</p><ol><li>GV. Default value: true.</li><li>OS. Default value: true.</li></ol> 
     * @return EnableAudio <p>Indicates whether to generate audio for the video. Valid values: true or false.</p><p>Models that support this parameter:</p><ol><li>GV. Default value: true.</li><li>OS. Default value: true.</li></ol>
     */
    public Boolean getEnableAudio() {
        return this.EnableAudio;
    }

    /**
     * Set <p>Indicates whether to generate audio for the video. Valid values: true or false.</p><p>Models that support this parameter:</p><ol><li>GV. Default value: true.</li><li>OS. Default value: true.</li></ol>
     * @param EnableAudio <p>Indicates whether to generate audio for the video. Valid values: true or false.</p><p>Models that support this parameter:</p><ol><li>GV. Default value: true.</li><li>OS. Default value: true.</li></ol>
     */
    public void setEnableAudio(Boolean EnableAudio) {
        this.EnableAudio = EnableAudio;
    }

    /**
     * Get <p>Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.<br>Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.</p> 
     * @return OffPeak <p>Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.<br>Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.</p>
     */
    public Boolean getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set <p>Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.<br>Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.</p>
     * @param OffPeak <p>Indicates whether to use the off-peak scheduling mode. Only Vidu supports this parameter.<br>Tasks submitted in off-peak mode will be processed within 48 hours. Uncompleted tasks will be canceled.</p>
     */
    public void setOffPeak(Boolean OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get <p>Indicates whether to add background music to the generated video. Default value: false. Valid values: true or false.<br>Note: Only some model versions support this.</p> 
     * @return EnableBgm <p>Indicates whether to add background music to the generated video. Default value: false. Valid values: true or false.<br>Note: Only some model versions support this.</p>
     */
    public Boolean getEnableBgm() {
        return this.EnableBgm;
    }

    /**
     * Set <p>Indicates whether to add background music to the generated video. Default value: false. Valid values: true or false.<br>Note: Only some model versions support this.</p>
     * @param EnableBgm <p>Indicates whether to add background music to the generated video. Default value: false. Valid values: true or false.<br>Note: Only some model versions support this.</p>
     */
    public void setEnableBgm(Boolean EnableBgm) {
        this.EnableBgm = EnableBgm;
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
        if (source.EnableBgm != null) {
            this.EnableBgm = new Boolean(source.EnableBgm);
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
        this.setParamSimple(map, prefix + "EnableBgm", this.EnableBgm);

    }
}

