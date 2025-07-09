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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIDocs extends AbstractModel {

    /**
    * Number of API documents
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Basic information of API document
    */
    @SerializedName("APIDocSet")
    @Expose
    private APIDoc [] APIDocSet;

    /**
     * Get Number of API documents 
     * @return TotalCount Number of API documents
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of API documents
     * @param TotalCount Number of API documents
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Basic information of API document 
     * @return APIDocSet Basic information of API document
     */
    public APIDoc [] getAPIDocSet() {
        return this.APIDocSet;
    }

    /**
     * Set Basic information of API document
     * @param APIDocSet Basic information of API document
     */
    public void setAPIDocSet(APIDoc [] APIDocSet) {
        this.APIDocSet = APIDocSet;
    }

    public APIDocs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIDocs(APIDocs source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.APIDocSet != null) {
            this.APIDocSet = new APIDoc[source.APIDocSet.length];
            for (int i = 0; i < source.APIDocSet.length; i++) {
                this.APIDocSet[i] = new APIDoc(source.APIDocSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "APIDocSet.", this.APIDocSet);

    }
}

