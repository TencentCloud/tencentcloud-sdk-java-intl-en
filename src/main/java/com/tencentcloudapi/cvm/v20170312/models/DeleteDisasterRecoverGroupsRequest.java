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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDisasterRecoverGroupsRequest extends AbstractModel {

    /**
    * ID list of spread placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/api/213/17810?from_cn_redirect=1) API. You can operate up to 100 spread placement groups in each request.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
     * Get ID list of spread placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/api/213/17810?from_cn_redirect=1) API. You can operate up to 100 spread placement groups in each request. 
     * @return DisasterRecoverGroupIds ID list of spread placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/api/213/17810?from_cn_redirect=1) API. You can operate up to 100 spread placement groups in each request.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set ID list of spread placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/api/213/17810?from_cn_redirect=1) API. You can operate up to 100 spread placement groups in each request.
     * @param DisasterRecoverGroupIds ID list of spread placement groups, obtainable via the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/api/213/17810?from_cn_redirect=1) API. You can operate up to 100 spread placement groups in each request.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    public DeleteDisasterRecoverGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDisasterRecoverGroupsRequest(DeleteDisasterRecoverGroupsRequest source) {
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);

    }
}

