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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BalanceRoGroupLoadRequest extends AbstractModel {

    /**
    * ID of the RO group, in the format of cdbrg-c1nl9rpv. You can obtain it via [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1).
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
     * Get ID of the RO group, in the format of cdbrg-c1nl9rpv. You can obtain it via [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1). 
     * @return RoGroupId ID of the RO group, in the format of cdbrg-c1nl9rpv. You can obtain it via [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1).
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set ID of the RO group, in the format of cdbrg-c1nl9rpv. You can obtain it via [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1).
     * @param RoGroupId ID of the RO group, in the format of cdbrg-c1nl9rpv. You can obtain it via [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1).
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    public BalanceRoGroupLoadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BalanceRoGroupLoadRequest(BalanceRoGroupLoadRequest source) {
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);

    }
}

