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
    * Static graphic overlay configuration.
    */
    @SerializedName("StaticImageSettings")
    @Expose
    private StaticImageSettings StaticImageSettings;

    /**
    * Dynamic graphic overlay configuration.
    */
    @SerializedName("MotionGraphicsSettings")
    @Expose
    private MotionGraphicsSetting MotionGraphicsSettings;

    /**
    * Thumbnail Configuration.
    */
    @SerializedName("ThumbnailSettings")
    @Expose
    private ThumbnailSettings ThumbnailSettings;

    /**
     * Get Static graphic overlay configuration. 
     * @return StaticImageSettings Static graphic overlay configuration.
     */
    public StaticImageSettings getStaticImageSettings() {
        return this.StaticImageSettings;
    }

    /**
     * Set Static graphic overlay configuration.
     * @param StaticImageSettings Static graphic overlay configuration.
     */
    public void setStaticImageSettings(StaticImageSettings StaticImageSettings) {
        this.StaticImageSettings = StaticImageSettings;
    }

    /**
     * Get Dynamic graphic overlay configuration. 
     * @return MotionGraphicsSettings Dynamic graphic overlay configuration.
     */
    public MotionGraphicsSetting getMotionGraphicsSettings() {
        return this.MotionGraphicsSettings;
    }

    /**
     * Set Dynamic graphic overlay configuration.
     * @param MotionGraphicsSettings Dynamic graphic overlay configuration.
     */
    public void setMotionGraphicsSettings(MotionGraphicsSetting MotionGraphicsSettings) {
        this.MotionGraphicsSettings = MotionGraphicsSettings;
    }

    /**
     * Get Thumbnail Configuration. 
     * @return ThumbnailSettings Thumbnail Configuration.
     */
    public ThumbnailSettings getThumbnailSettings() {
        return this.ThumbnailSettings;
    }

    /**
     * Set Thumbnail Configuration.
     * @param ThumbnailSettings Thumbnail Configuration.
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

