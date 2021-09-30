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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateBlueprintRequest extends AbstractModel{

    /**
    * Number of custom images. Default value: 1.
    */
    @SerializedName("BlueprintCount")
    @Expose
    private Long BlueprintCount;

    /**
     * Get Number of custom images. Default value: 1. 
     * @return BlueprintCount Number of custom images. Default value: 1.
     */
    public Long getBlueprintCount() {
        return this.BlueprintCount;
    }

    /**
     * Set Number of custom images. Default value: 1.
     * @param BlueprintCount Number of custom images. Default value: 1.
     */
    public void setBlueprintCount(Long BlueprintCount) {
        this.BlueprintCount = BlueprintCount;
    }

    public InquirePriceCreateBlueprintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateBlueprintRequest(InquirePriceCreateBlueprintRequest source) {
        if (source.BlueprintCount != null) {
            this.BlueprintCount = new Long(source.BlueprintCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintCount", this.BlueprintCount);

    }
}

