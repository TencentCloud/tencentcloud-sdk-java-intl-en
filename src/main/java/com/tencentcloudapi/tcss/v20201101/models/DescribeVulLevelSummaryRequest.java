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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulLevelSummaryRequest extends AbstractModel{

    /**
    * Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `EMERGENCY` (emergency vulnerability).
    */
    @SerializedName("CategoryType")
    @Expose
    private String CategoryType;

    /**
     * Get Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `EMERGENCY` (emergency vulnerability). 
     * @return CategoryType Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `EMERGENCY` (emergency vulnerability).
     */
    public String getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `EMERGENCY` (emergency vulnerability).
     * @param CategoryType Vulnerability type. Valid values: `SYSTEM` (system vulnerability); `WEB` (web application vulnerability); `EMERGENCY` (emergency vulnerability).
     */
    public void setCategoryType(String CategoryType) {
        this.CategoryType = CategoryType;
    }

    public DescribeVulLevelSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulLevelSummaryRequest(DescribeVulLevelSummaryRequest source) {
        if (source.CategoryType != null) {
            this.CategoryType = new String(source.CategoryType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);

    }
}

