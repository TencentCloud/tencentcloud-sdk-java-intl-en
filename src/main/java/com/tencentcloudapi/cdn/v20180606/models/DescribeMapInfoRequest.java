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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMapInfoRequest extends AbstractModel {

    /**
    * Query type:
`isp`: queries ISP codes
`district`: queries codes of provinces (Mainland China) or countries/regions (outside Mainland China)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Query type:
`isp`: queries ISP codes
`district`: queries codes of provinces (Mainland China) or countries/regions (outside Mainland China) 
     * @return Name Query type:
`isp`: queries ISP codes
`district`: queries codes of provinces (Mainland China) or countries/regions (outside Mainland China)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Query type:
`isp`: queries ISP codes
`district`: queries codes of provinces (Mainland China) or countries/regions (outside Mainland China)
     * @param Name Query type:
`isp`: queries ISP codes
`district`: queries codes of provinces (Mainland China) or countries/regions (outside Mainland China)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeMapInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMapInfoRequest(DescribeMapInfoRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

