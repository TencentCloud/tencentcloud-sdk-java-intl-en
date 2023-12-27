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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCreditByUinListRequest extends AbstractModel {

    /**
    * List of user. Array length value: 1-50.
    */
    @SerializedName("UinList")
    @Expose
    private Long [] UinList;

    /**
     * Get List of user. Array length value: 1-50. 
     * @return UinList List of user. Array length value: 1-50.
     */
    public Long [] getUinList() {
        return this.UinList;
    }

    /**
     * Set List of user. Array length value: 1-50.
     * @param UinList List of user. Array length value: 1-50.
     */
    public void setUinList(Long [] UinList) {
        this.UinList = UinList;
    }

    public QueryCreditByUinListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCreditByUinListRequest(QueryCreditByUinListRequest source) {
        if (source.UinList != null) {
            this.UinList = new Long[source.UinList.length];
            for (int i = 0; i < source.UinList.length; i++) {
                this.UinList[i] = new Long(source.UinList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UinList.", this.UinList);

    }
}

