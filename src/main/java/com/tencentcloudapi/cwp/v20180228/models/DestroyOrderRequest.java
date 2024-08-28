/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestroyOrderRequest extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription. 
     * @return LicenseType Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     * @param LicenseType Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    public DestroyOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestroyOrderRequest(DestroyOrderRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

