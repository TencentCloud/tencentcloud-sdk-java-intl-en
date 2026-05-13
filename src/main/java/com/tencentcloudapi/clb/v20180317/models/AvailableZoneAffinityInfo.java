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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableZoneAffinityInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 
    */
    @SerializedName("ExitRatio")
    @Expose
    private Long ExitRatio;

    /**
    * 
    */
    @SerializedName("ReentryRatio")
    @Expose
    private Long ReentryRatio;

    /**
     * Get  
     * @return Enable 
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 
     * @param Enable 
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get  
     * @return ExitRatio 
     */
    public Long getExitRatio() {
        return this.ExitRatio;
    }

    /**
     * Set 
     * @param ExitRatio 
     */
    public void setExitRatio(Long ExitRatio) {
        this.ExitRatio = ExitRatio;
    }

    /**
     * Get  
     * @return ReentryRatio 
     */
    public Long getReentryRatio() {
        return this.ReentryRatio;
    }

    /**
     * Set 
     * @param ReentryRatio 
     */
    public void setReentryRatio(Long ReentryRatio) {
        this.ReentryRatio = ReentryRatio;
    }

    public AvailableZoneAffinityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableZoneAffinityInfo(AvailableZoneAffinityInfo source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ExitRatio != null) {
            this.ExitRatio = new Long(source.ExitRatio);
        }
        if (source.ReentryRatio != null) {
            this.ReentryRatio = new Long(source.ReentryRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ExitRatio", this.ExitRatio);
        this.setParamSimple(map, prefix + "ReentryRatio", this.ReentryRatio);

    }
}

