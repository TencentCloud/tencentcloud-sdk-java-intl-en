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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppIdResponse extends AbstractModel {

    /**
    * Number of eligible `AppId`
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Specifies the App Id list that meets the requirements.
    */
    @SerializedName("AppIdList")
    @Expose
    private Long [] AppIdList;

    /**
     * Get Number of eligible `AppId` 
     * @return TotalCount Number of eligible `AppId`
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible `AppId`
     * @param TotalCount Number of eligible `AppId`
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Specifies the App Id list that meets the requirements. 
     * @return AppIdList Specifies the App Id list that meets the requirements.
     */
    public Long [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set Specifies the App Id list that meets the requirements.
     * @param AppIdList Specifies the App Id list that meets the requirements.
     */
    public void setAppIdList(Long [] AppIdList) {
        this.AppIdList = AppIdList;
    }

    public AppIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppIdResponse(AppIdResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AppIdList != null) {
            this.AppIdList = new Long[source.AppIdList.length];
            for (int i = 0; i < source.AppIdList.length; i++) {
                this.AppIdList[i] = new Long(source.AppIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "AppIdList.", this.AppIdList);

    }
}

