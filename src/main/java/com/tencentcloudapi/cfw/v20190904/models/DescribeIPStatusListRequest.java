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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIPStatusListRequest extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("IPList")
    @Expose
    private String [] IPList;

    /**
     * Get Asset ID 
     * @return IPList Asset ID
     */
    public String [] getIPList() {
        return this.IPList;
    }

    /**
     * Set Asset ID
     * @param IPList Asset ID
     */
    public void setIPList(String [] IPList) {
        this.IPList = IPList;
    }

    public DescribeIPStatusListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPStatusListRequest(DescribeIPStatusListRequest source) {
        if (source.IPList != null) {
            this.IPList = new String[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new String(source.IPList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPList.", this.IPList);

    }
}

