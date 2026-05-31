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

public class PipSetting extends AbstractModel {

    /**
    * 
    */
    @SerializedName("AudioSelection")
    @Expose
    private String AudioSelection;

    /**
    * 
    */
    @SerializedName("LiveSourceLayout")
    @Expose
    private SourceLayout LiveSourceLayout;

    /**
    * 
    */
    @SerializedName("AdSourceLayout")
    @Expose
    private SourceLayout AdSourceLayout;

    /**
    * 
    */
    @SerializedName("BackgroundImgUrl")
    @Expose
    private String BackgroundImgUrl;

    /**
    * 
    */
    @SerializedName("AdSourceUrl")
    @Expose
    private String AdSourceUrl;

    /**
     * Get  
     * @return AudioSelection 
     */
    public String getAudioSelection() {
        return this.AudioSelection;
    }

    /**
     * Set 
     * @param AudioSelection 
     */
    public void setAudioSelection(String AudioSelection) {
        this.AudioSelection = AudioSelection;
    }

    /**
     * Get  
     * @return LiveSourceLayout 
     */
    public SourceLayout getLiveSourceLayout() {
        return this.LiveSourceLayout;
    }

    /**
     * Set 
     * @param LiveSourceLayout 
     */
    public void setLiveSourceLayout(SourceLayout LiveSourceLayout) {
        this.LiveSourceLayout = LiveSourceLayout;
    }

    /**
     * Get  
     * @return AdSourceLayout 
     */
    public SourceLayout getAdSourceLayout() {
        return this.AdSourceLayout;
    }

    /**
     * Set 
     * @param AdSourceLayout 
     */
    public void setAdSourceLayout(SourceLayout AdSourceLayout) {
        this.AdSourceLayout = AdSourceLayout;
    }

    /**
     * Get  
     * @return BackgroundImgUrl 
     */
    public String getBackgroundImgUrl() {
        return this.BackgroundImgUrl;
    }

    /**
     * Set 
     * @param BackgroundImgUrl 
     */
    public void setBackgroundImgUrl(String BackgroundImgUrl) {
        this.BackgroundImgUrl = BackgroundImgUrl;
    }

    /**
     * Get  
     * @return AdSourceUrl 
     */
    public String getAdSourceUrl() {
        return this.AdSourceUrl;
    }

    /**
     * Set 
     * @param AdSourceUrl 
     */
    public void setAdSourceUrl(String AdSourceUrl) {
        this.AdSourceUrl = AdSourceUrl;
    }

    public PipSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PipSetting(PipSetting source) {
        if (source.AudioSelection != null) {
            this.AudioSelection = new String(source.AudioSelection);
        }
        if (source.LiveSourceLayout != null) {
            this.LiveSourceLayout = new SourceLayout(source.LiveSourceLayout);
        }
        if (source.AdSourceLayout != null) {
            this.AdSourceLayout = new SourceLayout(source.AdSourceLayout);
        }
        if (source.BackgroundImgUrl != null) {
            this.BackgroundImgUrl = new String(source.BackgroundImgUrl);
        }
        if (source.AdSourceUrl != null) {
            this.AdSourceUrl = new String(source.AdSourceUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioSelection", this.AudioSelection);
        this.setParamObj(map, prefix + "LiveSourceLayout.", this.LiveSourceLayout);
        this.setParamObj(map, prefix + "AdSourceLayout.", this.AdSourceLayout);
        this.setParamSimple(map, prefix + "BackgroundImgUrl", this.BackgroundImgUrl);
        this.setParamSimple(map, prefix + "AdSourceUrl", this.AdSourceUrl);

    }
}

