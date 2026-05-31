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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralSetting extends AbstractModel {

    /**
    * Static image overlay configuration.
    */
    @SerializedName("StaticImageSettings")
    @Expose
    private StaticImageSettings StaticImageSettings;

    /**
    * Real-time graphic overlay configuration.
    */
    @SerializedName("MotionGraphicsSettings")
    @Expose
    private MotionGraphicsSetting MotionGraphicsSettings;

    /**
    * Thumbnail configuration
    */
    @SerializedName("ThumbnailSettings")
    @Expose
    private ThumbnailSettings ThumbnailSettings;

    /**
     * Get Static image overlay configuration. 
     * @return StaticImageSettings Static image overlay configuration.
     */
    public StaticImageSettings getStaticImageSettings() {
        return this.StaticImageSettings;
    }

    /**
     * Set Static image overlay configuration.
     * @param StaticImageSettings Static image overlay configuration.
     */
    public void setStaticImageSettings(StaticImageSettings StaticImageSettings) {
        this.StaticImageSettings = StaticImageSettings;
    }

    /**
     * Get Real-time graphic overlay configuration. 
     * @return MotionGraphicsSettings Real-time graphic overlay configuration.
     */
    public MotionGraphicsSetting getMotionGraphicsSettings() {
        return this.MotionGraphicsSettings;
    }

    /**
     * Set Real-time graphic overlay configuration.
     * @param MotionGraphicsSettings Real-time graphic overlay configuration.
     */
    public void setMotionGraphicsSettings(MotionGraphicsSetting MotionGraphicsSettings) {
        this.MotionGraphicsSettings = MotionGraphicsSettings;
    }

    /**
     * Get Thumbnail configuration 
     * @return ThumbnailSettings Thumbnail configuration
     */
    public ThumbnailSettings getThumbnailSettings() {
        return this.ThumbnailSettings;
    }

    /**
     * Set Thumbnail configuration
     * @param ThumbnailSettings Thumbnail configuration
     */
    public void setThumbnailSettings(ThumbnailSettings ThumbnailSettings) {
        this.ThumbnailSettings = ThumbnailSettings;
    }

    public GeneralSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralSetting(GeneralSetting source) {
        if (source.StaticImageSettings != null) {
            this.StaticImageSettings = new StaticImageSettings(source.StaticImageSettings);
        }
        if (source.MotionGraphicsSettings != null) {
            this.MotionGraphicsSettings = new MotionGraphicsSetting(source.MotionGraphicsSettings);
        }
        if (source.ThumbnailSettings != null) {
            this.ThumbnailSettings = new ThumbnailSettings(source.ThumbnailSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "StaticImageSettings.", this.StaticImageSettings);
        this.setParamObj(map, prefix + "MotionGraphicsSettings.", this.MotionGraphicsSettings);
        this.setParamObj(map, prefix + "ThumbnailSettings.", this.ThumbnailSettings);

    }
}

