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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenDBExtranetAccessRequest extends AbstractModel{

    /**
    * ID of an instance for which to enable public network access. The ID is in the format of dcdbt-ow728lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get ID of an instance for which to enable public network access. The ID is in the format of dcdbt-ow728lmc. 
     * @return InstanceId ID of an instance for which to enable public network access. The ID is in the format of dcdbt-ow728lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of an instance for which to enable public network access. The ID is in the format of dcdbt-ow728lmc.
     * @param InstanceId ID of an instance for which to enable public network access. The ID is in the format of dcdbt-ow728lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

