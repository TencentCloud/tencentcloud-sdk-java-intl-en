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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePeriodInfo extends AbstractModel {

    /**
    * Document update frequency type: 0 does not update. -H 1-hour granularity. Currently only support 24 (1 day), 72 (3 days), and 168 (7 days). Only valid for the Tencent document type when source=2.
    */
    @SerializedName("UpdatePeriodH")
    @Expose
    private Long UpdatePeriodH;

    /**
     * Get Document update frequency type: 0 does not update. -H 1-hour granularity. Currently only support 24 (1 day), 72 (3 days), and 168 (7 days). Only valid for the Tencent document type when source=2. 
     * @return UpdatePeriodH Document update frequency type: 0 does not update. -H 1-hour granularity. Currently only support 24 (1 day), 72 (3 days), and 168 (7 days). Only valid for the Tencent document type when source=2.
     */
    public Long getUpdatePeriodH() {
        return this.UpdatePeriodH;
    }

    /**
     * Set Document update frequency type: 0 does not update. -H 1-hour granularity. Currently only support 24 (1 day), 72 (3 days), and 168 (7 days). Only valid for the Tencent document type when source=2.
     * @param UpdatePeriodH Document update frequency type: 0 does not update. -H 1-hour granularity. Currently only support 24 (1 day), 72 (3 days), and 168 (7 days). Only valid for the Tencent document type when source=2.
     */
    public void setUpdatePeriodH(Long UpdatePeriodH) {
        this.UpdatePeriodH = UpdatePeriodH;
    }

    public UpdatePeriodInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePeriodInfo(UpdatePeriodInfo source) {
        if (source.UpdatePeriodH != null) {
            this.UpdatePeriodH = new Long(source.UpdatePeriodH);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpdatePeriodH", this.UpdatePeriodH);

    }
}

