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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePayTypeRequest extends AbstractModel {

    /**
    * Billing region, which can be `mainland` or `overseas`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Billing mode, which can be `flux` or `bandwidth`.
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
     * Get Billing region, which can be `mainland` or `overseas`. 
     * @return Area Billing region, which can be `mainland` or `overseas`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Billing region, which can be `mainland` or `overseas`.
     * @param Area Billing region, which can be `mainland` or `overseas`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Billing mode, which can be `flux` or `bandwidth`. 
     * @return PayType Billing mode, which can be `flux` or `bandwidth`.
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing mode, which can be `flux` or `bandwidth`.
     * @param PayType Billing mode, which can be `flux` or `bandwidth`.
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    public UpdatePayTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePayTypeRequest(UpdatePayTypeRequest source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "PayType", this.PayType);

    }
}

