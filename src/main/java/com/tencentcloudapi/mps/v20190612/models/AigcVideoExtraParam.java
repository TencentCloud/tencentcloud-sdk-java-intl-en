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
    * 
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * 
    */
    @SerializedName("EnableAudio")
    @Expose
    private Boolean EnableAudio;

    /**
    * 
    */
    @SerializedName("OffPeak")
    @Expose
    private Boolean OffPeak;

    /**
    * 
    */
    @SerializedName("EnableBgm")
    @Expose
    private Boolean EnableBgm;

    /**
     * Get  
     * @return Resolution 
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 
     * @param Resolution 
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get  
     * @return AspectRatio 
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 
     * @param AspectRatio 
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get  
     * @return LogoAdd 
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set 
     * @param LogoAdd 
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get  
     * @return EnableAudio 
     */
    public Boolean getEnableAudio() {
        return this.EnableAudio;
    }

    /**
     * Set 
     * @param EnableAudio 
     */
    public void setEnableAudio(Boolean EnableAudio) {
        this.EnableAudio = EnableAudio;
    }

    /**
     * Get  
     * @return OffPeak 
     */
    public Boolean getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set 
     * @param OffPeak 
     */
    public void setOffPeak(Boolean OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get  
     * @return EnableBgm 
     */
    public Boolean getEnableBgm() {
        return this.EnableBgm;
    }

    /**
     * Set 
     * @param EnableBgm 
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

