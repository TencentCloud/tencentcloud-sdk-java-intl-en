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

public class AigcImageExtraParam extends AbstractModel {

    /**
    * <p>Aspect ratio of the generated video.</p><p>Supported aspect ratios for different models:</p><ol><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, and 3:2.</li><li>MJ v7: The aspect ratio needs to be specified in the prompt.</li></ol><p>Note: For more information about the aspect ratios of specific models, see the model website.</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>Output resolution of the image.</p><p>Models that support this parameter:<br>Valid values: 720P, 1080P, 2K, and 4K.</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Indicates whether to add a logo watermark. No watermark is added by default. 1 - A watermark is added. 0 - No watermark is added.</p><p>Value range: [0, 1].</p><p>Default value: 0.</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>Specifies the output format of the image. JPEG and PNG formats are supported.</p>
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
     * Get <p>Aspect ratio of the generated video.</p><p>Supported aspect ratios for different models:</p><ol><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, and 3:2.</li><li>MJ v7: The aspect ratio needs to be specified in the prompt.</li></ol><p>Note: For more information about the aspect ratios of specific models, see the model website.</p> 
     * @return AspectRatio <p>Aspect ratio of the generated video.</p><p>Supported aspect ratios for different models:</p><ol><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, and 3:2.</li><li>MJ v7: The aspect ratio needs to be specified in the prompt.</li></ol><p>Note: For more information about the aspect ratios of specific models, see the model website.</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>Aspect ratio of the generated video.</p><p>Supported aspect ratios for different models:</p><ol><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, and 3:2.</li><li>MJ v7: The aspect ratio needs to be specified in the prompt.</li></ol><p>Note: For more information about the aspect ratios of specific models, see the model website.</p>
     * @param AspectRatio <p>Aspect ratio of the generated video.</p><p>Supported aspect ratios for different models:</p><ol><li>Kling 2.1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling 3.0-Omni: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Kling O1: 16:9, 9:16, 1:1, 4:3, 3:4, 3:2, 2:3, and 21:9.</li><li>Vidu q2: 16:9, 9:16, 1:1, 3:4, 4:3, 21:9, 2:3, and 3:2.</li><li>MJ v7: The aspect ratio needs to be specified in the prompt.</li></ol><p>Note: For more information about the aspect ratios of specific models, see the model website.</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>Output resolution of the image.</p><p>Models that support this parameter:<br>Valid values: 720P, 1080P, 2K, and 4K.</p> 
     * @return Resolution <p>Output resolution of the image.</p><p>Models that support this parameter:<br>Valid values: 720P, 1080P, 2K, and 4K.</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Output resolution of the image.</p><p>Models that support this parameter:<br>Valid values: 720P, 1080P, 2K, and 4K.</p>
     * @param Resolution <p>Output resolution of the image.</p><p>Models that support this parameter:<br>Valid values: 720P, 1080P, 2K, and 4K.</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Indicates whether to add a logo watermark. No watermark is added by default. 1 - A watermark is added. 0 - No watermark is added.</p><p>Value range: [0, 1].</p><p>Default value: 0.</p> 
     * @return LogoAdd <p>Indicates whether to add a logo watermark. No watermark is added by default. 1 - A watermark is added. 0 - No watermark is added.</p><p>Value range: [0, 1].</p><p>Default value: 0.</p>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>Indicates whether to add a logo watermark. No watermark is added by default. 1 - A watermark is added. 0 - No watermark is added.</p><p>Value range: [0, 1].</p><p>Default value: 0.</p>
     * @param LogoAdd <p>Indicates whether to add a logo watermark. No watermark is added by default. 1 - A watermark is added. 0 - No watermark is added.</p><p>Value range: [0, 1].</p><p>Default value: 0.</p>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>Specifies the output format of the image. JPEG and PNG formats are supported.</p> 
     * @return OutputFormat <p>Specifies the output format of the image. JPEG and PNG formats are supported.</p>
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set <p>Specifies the output format of the image. JPEG and PNG formats are supported.</p>
     * @param OutputFormat <p>Specifies the output format of the image. JPEG and PNG formats are supported.</p>
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    public AigcImageExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageExtraParam(AigcImageExtraParam source) {
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);

    }
}

