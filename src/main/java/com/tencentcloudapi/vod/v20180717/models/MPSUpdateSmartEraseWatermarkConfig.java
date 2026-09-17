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

public class MPSUpdateSmartEraseWatermarkConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("WatermarkEraseMethod")
    @Expose
    private String WatermarkEraseMethod;

    /**
    * 
    */
    @SerializedName("WatermarkModel")
    @Expose
    private String WatermarkModel;

    /**
    * 
    */
    @SerializedName("AutoAreas")
    @Expose
    private MPSEraseArea [] AutoAreas;

    /**
    * 
    */
    @SerializedName("CustomAreas")
    @Expose
    private MPSEraseTimeArea [] CustomAreas;

    /**
     * Get  
     * @return WatermarkEraseMethod 
     */
    public String getWatermarkEraseMethod() {
        return this.WatermarkEraseMethod;
    }

    /**
     * Set 
     * @param WatermarkEraseMethod 
     */
    public void setWatermarkEraseMethod(String WatermarkEraseMethod) {
        this.WatermarkEraseMethod = WatermarkEraseMethod;
    }

    /**
     * Get  
     * @return WatermarkModel 
     */
    public String getWatermarkModel() {
        return this.WatermarkModel;
    }

    /**
     * Set 
     * @param WatermarkModel 
     */
    public void setWatermarkModel(String WatermarkModel) {
        this.WatermarkModel = WatermarkModel;
    }

    /**
     * Get  
     * @return AutoAreas 
     */
    public MPSEraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set 
     * @param AutoAreas 
     */
    public void setAutoAreas(MPSEraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get  
     * @return CustomAreas 
     */
    public MPSEraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set 
     * @param CustomAreas 
     */
    public void setCustomAreas(MPSEraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public MPSUpdateSmartEraseWatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSUpdateSmartEraseWatermarkConfig(MPSUpdateSmartEraseWatermarkConfig source) {
        if (source.WatermarkEraseMethod != null) {
            this.WatermarkEraseMethod = new String(source.WatermarkEraseMethod);
        }
        if (source.WatermarkModel != null) {
            this.WatermarkModel = new String(source.WatermarkModel);
        }
        if (source.AutoAreas != null) {
            this.AutoAreas = new MPSEraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new MPSEraseArea(source.AutoAreas[i]);
            }
        }
        if (source.CustomAreas != null) {
            this.CustomAreas = new MPSEraseTimeArea[source.CustomAreas.length];
            for (int i = 0; i < source.CustomAreas.length; i++) {
                this.CustomAreas[i] = new MPSEraseTimeArea(source.CustomAreas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkEraseMethod", this.WatermarkEraseMethod);
        this.setParamSimple(map, prefix + "WatermarkModel", this.WatermarkModel);
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamArrayObj(map, prefix + "CustomAreas.", this.CustomAreas);

    }
}

