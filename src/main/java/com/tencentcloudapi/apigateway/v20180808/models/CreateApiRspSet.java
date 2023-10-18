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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiRspSet extends AbstractModel {

    /**
    * Total number of APIs
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of created APIs
    */
    @SerializedName("ApiSet")
    @Expose
    private CreateApiRsp [] ApiSet;

    /**
     * Get Total number of APIs 
     * @return TotalCount Total number of APIs
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of APIs
     * @param TotalCount Total number of APIs
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of created APIs 
     * @return ApiSet Information of created APIs
     */
    public CreateApiRsp [] getApiSet() {
        return this.ApiSet;
    }

    /**
     * Set Information of created APIs
     * @param ApiSet Information of created APIs
     */
    public void setApiSet(CreateApiRsp [] ApiSet) {
        this.ApiSet = ApiSet;
    }

    public CreateApiRspSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiRspSet(CreateApiRspSet source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiSet != null) {
            this.ApiSet = new CreateApiRsp[source.ApiSet.length];
            for (int i = 0; i < source.ApiSet.length; i++) {
                this.ApiSet[i] = new CreateApiRsp(source.ApiSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiSet.", this.ApiSet);

    }
}

