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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmulateMobileParams extends AbstractModel {

    /**
    * 
    */
    @SerializedName("MobileDeviceType")
    @Expose
    private Long MobileDeviceType;

    /**
    * 
    */
    @SerializedName("ScreenOrientation")
    @Expose
    private Long ScreenOrientation;

    /**
     * Get  
     * @return MobileDeviceType 
     */
    public Long getMobileDeviceType() {
        return this.MobileDeviceType;
    }

    /**
     * Set 
     * @param MobileDeviceType 
     */
    public void setMobileDeviceType(Long MobileDeviceType) {
        this.MobileDeviceType = MobileDeviceType;
    }

    /**
     * Get  
     * @return ScreenOrientation 
     */
    public Long getScreenOrientation() {
        return this.ScreenOrientation;
    }

    /**
     * Set 
     * @param ScreenOrientation 
     */
    public void setScreenOrientation(Long ScreenOrientation) {
        this.ScreenOrientation = ScreenOrientation;
    }

    public EmulateMobileParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmulateMobileParams(EmulateMobileParams source) {
        if (source.MobileDeviceType != null) {
            this.MobileDeviceType = new Long(source.MobileDeviceType);
        }
        if (source.ScreenOrientation != null) {
            this.ScreenOrientation = new Long(source.ScreenOrientation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MobileDeviceType", this.MobileDeviceType);
        this.setParamSimple(map, prefix + "ScreenOrientation", this.ScreenOrientation);

    }
}

