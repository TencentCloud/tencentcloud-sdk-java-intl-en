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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveRecordTemplatesRequest extends AbstractModel {

    /**
    * Whether it is an LCB template. Default value: 0.
0: LVB.
1: LCB.
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
     * Get Whether it is an LCB template. Default value: 0.
0: LVB.
1: LCB. 
     * @return IsDelayLive Whether it is an LCB template. Default value: 0.
0: LVB.
1: LCB.
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set Whether it is an LCB template. Default value: 0.
0: LVB.
1: LCB.
     * @param IsDelayLive Whether it is an LCB template. Default value: 0.
0: LVB.
1: LCB.
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    public DescribeLiveRecordTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveRecordTemplatesRequest(DescribeLiveRecordTemplatesRequest source) {
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);

    }
}

