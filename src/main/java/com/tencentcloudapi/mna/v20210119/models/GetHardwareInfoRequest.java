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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetHardwareInfoRequest extends AbstractModel {

    /**
    * Vendor name
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * Device SN serial number
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
     * Get Vendor name 
     * @return Vendor Vendor name
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set Vendor name
     * @param Vendor Vendor name
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get Device SN serial number 
     * @return SN Device SN serial number
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set Device SN serial number
     * @param SN Device SN serial number
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    public GetHardwareInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetHardwareInfoRequest(GetHardwareInfoRequest source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "SN", this.SN);

    }
}

