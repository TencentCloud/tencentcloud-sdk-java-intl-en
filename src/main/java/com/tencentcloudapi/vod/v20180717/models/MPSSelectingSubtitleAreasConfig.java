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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSSelectingSubtitleAreasConfig extends AbstractModel {

    /**
    * <p>Automatically select a custom region. For the selected areas, the AI model is used to automatically detect and extract the target content.</p>
    */
    @SerializedName("AutoAreas")
    @Expose
    private MPSEraseArea [] AutoAreas;

    /**
    * <p>Width of the sample video or image, in pixels.</p>
    */
    @SerializedName("SampleWidth")
    @Expose
    private Long SampleWidth;

    /**
    * <p>Height of the sample video or image, in pixels.</p>
    */
    @SerializedName("SampleHeight")
    @Expose
    private Long SampleHeight;

    /**
     * Get <p>Automatically select a custom region. For the selected areas, the AI model is used to automatically detect and extract the target content.</p> 
     * @return AutoAreas <p>Automatically select a custom region. For the selected areas, the AI model is used to automatically detect and extract the target content.</p>
     */
    public MPSEraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set <p>Automatically select a custom region. For the selected areas, the AI model is used to automatically detect and extract the target content.</p>
     * @param AutoAreas <p>Automatically select a custom region. For the selected areas, the AI model is used to automatically detect and extract the target content.</p>
     */
    public void setAutoAreas(MPSEraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get <p>Width of the sample video or image, in pixels.</p> 
     * @return SampleWidth <p>Width of the sample video or image, in pixels.</p>
     */
    public Long getSampleWidth() {
        return this.SampleWidth;
    }

    /**
     * Set <p>Width of the sample video or image, in pixels.</p>
     * @param SampleWidth <p>Width of the sample video or image, in pixels.</p>
     */
    public void setSampleWidth(Long SampleWidth) {
        this.SampleWidth = SampleWidth;
    }

    /**
     * Get <p>Height of the sample video or image, in pixels.</p> 
     * @return SampleHeight <p>Height of the sample video or image, in pixels.</p>
     */
    public Long getSampleHeight() {
        return this.SampleHeight;
    }

    /**
     * Set <p>Height of the sample video or image, in pixels.</p>
     * @param SampleHeight <p>Height of the sample video or image, in pixels.</p>
     */
    public void setSampleHeight(Long SampleHeight) {
        this.SampleHeight = SampleHeight;
    }

    public MPSSelectingSubtitleAreasConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSelectingSubtitleAreasConfig(MPSSelectingSubtitleAreasConfig source) {
        if (source.AutoAreas != null) {
            this.AutoAreas = new MPSEraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new MPSEraseArea(source.AutoAreas[i]);
            }
        }
        if (source.SampleWidth != null) {
            this.SampleWidth = new Long(source.SampleWidth);
        }
        if (source.SampleHeight != null) {
            this.SampleHeight = new Long(source.SampleHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamSimple(map, prefix + "SampleWidth", this.SampleWidth);
        this.setParamSimple(map, prefix + "SampleHeight", this.SampleHeight);

    }
}

