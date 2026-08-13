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

public class AiExpansionConfig extends AbstractModel {

    /**
    * <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Target ratio, for example "16:9"</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>Target width (pixel)</p><p>Value ranges from 0 to 2048.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>Target height (pixel)</p><p>Value ranges from 0 to 2048.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p> 
     * @return Switch <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     * @param Switch <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Target ratio, for example "16:9"</p> 
     * @return AspectRatio <p>Target ratio, for example "16:9"</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>Target ratio, for example "16:9"</p>
     * @param AspectRatio <p>Target ratio, for example "16:9"</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>Target width (pixel)</p><p>Value ranges from 0 to 2048.</p> 
     * @return Width <p>Target width (pixel)</p><p>Value ranges from 0 to 2048.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Target width (pixel)</p><p>Value ranges from 0 to 2048.</p>
     * @param Width <p>Target width (pixel)</p><p>Value ranges from 0 to 2048.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>Target height (pixel)</p><p>Value ranges from 0 to 2048.</p> 
     * @return Height <p>Target height (pixel)</p><p>Value ranges from 0 to 2048.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Target height (pixel)</p><p>Value ranges from 0 to 2048.</p>
     * @param Height <p>Target height (pixel)</p><p>Value ranges from 0 to 2048.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public AiExpansionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiExpansionConfig(AiExpansionConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

