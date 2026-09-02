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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceCheckTypeItem extends AbstractModel {

    /**
    * <p>Check type</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>Number of associated check items</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>Check type</p> 
     * @return CheckType <p>Check type</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>Check type</p>
     * @param CheckType <p>Check type</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>Number of associated check items</p> 
     * @return Count <p>Number of associated check items</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Number of associated check items</p>
     * @param Count <p>Number of associated check items</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ComplianceCheckTypeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceCheckTypeItem(ComplianceCheckTypeItem source) {
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

