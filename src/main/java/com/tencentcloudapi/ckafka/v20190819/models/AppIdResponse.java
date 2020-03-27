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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppIdResponse extends AbstractModel{

    /**
    * Number of eligible `AppId`
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of eligible `AppId`
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get List of eligible `AppId`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AppIdList List of eligible `AppId`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getAppIdList() {
        return this.AppIdList;
    }

    /**
     * Set List of eligible `AppId`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AppIdList List of eligible `AppId`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAppIdList(Long [] AppIdList) {
        this.AppIdList = AppIdList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "AppIdList.", this.AppIdList);

    }
}

