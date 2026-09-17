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

public class AccelerateAreaInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 
    */
    @SerializedName("TencentDisableReason")
    @Expose
    private String TencentDisableReason;

    /**
    * 
    */
    @SerializedName("TencentEdgeDomain")
    @Expose
    private String TencentEdgeDomain;

    /**
     * Get  
     * @return Area 
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 
     * @param Area 
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get  
     * @return TencentDisableReason 
     */
    public String getTencentDisableReason() {
        return this.TencentDisableReason;
    }

    /**
     * Set 
     * @param TencentDisableReason 
     */
    public void setTencentDisableReason(String TencentDisableReason) {
        this.TencentDisableReason = TencentDisableReason;
    }

    /**
     * Get  
     * @return TencentEdgeDomain 
     */
    public String getTencentEdgeDomain() {
        return this.TencentEdgeDomain;
    }

    /**
     * Set 
     * @param TencentEdgeDomain 
     */
    public void setTencentEdgeDomain(String TencentEdgeDomain) {
        this.TencentEdgeDomain = TencentEdgeDomain;
    }

    public AccelerateAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerateAreaInfo(AccelerateAreaInfo source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.TencentDisableReason != null) {
            this.TencentDisableReason = new String(source.TencentDisableReason);
        }
        if (source.TencentEdgeDomain != null) {
            this.TencentEdgeDomain = new String(source.TencentEdgeDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "TencentDisableReason", this.TencentDisableReason);
        this.setParamSimple(map, prefix + "TencentEdgeDomain", this.TencentEdgeDomain);

    }
}

