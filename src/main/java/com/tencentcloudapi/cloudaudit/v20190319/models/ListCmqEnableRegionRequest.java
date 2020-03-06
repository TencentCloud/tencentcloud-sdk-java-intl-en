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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCmqEnableRegionRequest extends AbstractModel{

    /**
    * Website type. zh: Mainland China (default); en: outside Mainland China.
    */
    @SerializedName("WebsiteType")
    @Expose
    private String WebsiteType;

    /**
     * Get Website type. zh: Mainland China (default); en: outside Mainland China. 
     * @return WebsiteType Website type. zh: Mainland China (default); en: outside Mainland China.
     */
    public String getWebsiteType() {
        return this.WebsiteType;
    }

    /**
     * Set Website type. zh: Mainland China (default); en: outside Mainland China.
     * @param WebsiteType Website type. zh: Mainland China (default); en: outside Mainland China.
     */
    public void setWebsiteType(String WebsiteType) {
        this.WebsiteType = WebsiteType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebsiteType", this.WebsiteType);

    }
}

