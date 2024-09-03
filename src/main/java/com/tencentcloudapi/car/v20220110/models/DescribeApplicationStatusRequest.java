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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationStatusRequest extends AbstractModel {

    /**
    * Application ID list.
    */
    @SerializedName("ApplicationIdList")
    @Expose
    private String [] ApplicationIdList;

    /**
     * Get Application ID list. 
     * @return ApplicationIdList Application ID list.
     */
    public String [] getApplicationIdList() {
        return this.ApplicationIdList;
    }

    /**
     * Set Application ID list.
     * @param ApplicationIdList Application ID list.
     */
    public void setApplicationIdList(String [] ApplicationIdList) {
        this.ApplicationIdList = ApplicationIdList;
    }

    public DescribeApplicationStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationStatusRequest(DescribeApplicationStatusRequest source) {
        if (source.ApplicationIdList != null) {
            this.ApplicationIdList = new String[source.ApplicationIdList.length];
            for (int i = 0; i < source.ApplicationIdList.length; i++) {
                this.ApplicationIdList[i] = new String(source.ApplicationIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApplicationIdList.", this.ApplicationIdList);

    }
}

