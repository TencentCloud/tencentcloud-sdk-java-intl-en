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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAllocationUnitRequest extends AbstractModel {

    /**
    * Specifies the deleted cost allocation unit ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Month, which is the current month by default if not provided.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get Specifies the deleted cost allocation unit ID. 
     * @return Id Specifies the deleted cost allocation unit ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Specifies the deleted cost allocation unit ID.
     * @param Id Specifies the deleted cost allocation unit ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Month, which is the current month by default if not provided. 
     * @return Month Month, which is the current month by default if not provided.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Month, which is the current month by default if not provided.
     * @param Month Month, which is the current month by default if not provided.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public DeleteAllocationUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAllocationUnitRequest(DeleteAllocationUnitRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

