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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetContainerDetailRequest extends AbstractModel{

    /**
    * Container ID
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
     * Get Container ID 
     * @return ContainerId Container ID
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID
     * @param ContainerId Container ID
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    public DescribeAssetContainerDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetContainerDetailRequest(DescribeAssetContainerDetailRequest source) {
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);

    }
}

