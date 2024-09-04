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

public class DeleteRiskDnsEventRequest extends AbstractModel {

    /**
    * Malicious request record ID array. (The maximum number of IDs is 100.) Delete all if it is left blank.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
     * Get Malicious request record ID array. (The maximum number of IDs is 100.) Delete all if it is left blank. 
     * @return Ids Malicious request record ID array. (The maximum number of IDs is 100.) Delete all if it is left blank.
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set Malicious request record ID array. (The maximum number of IDs is 100.) Delete all if it is left blank.
     * @param Ids Malicious request record ID array. (The maximum number of IDs is 100.) Delete all if it is left blank.
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    public DeleteRiskDnsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRiskDnsEventRequest(DeleteRiskDnsEventRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}
