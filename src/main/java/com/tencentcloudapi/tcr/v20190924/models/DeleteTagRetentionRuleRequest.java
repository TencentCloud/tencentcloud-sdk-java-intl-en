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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTagRetentionRuleRequest extends AbstractModel{

    /**
    * Primary instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Tag retention rule ID
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
     * Get Primary instance ID 
     * @return RegistryId Primary instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Primary instance ID
     * @param RegistryId Primary instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Tag retention rule ID 
     * @return RetentionId Tag retention rule ID
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set Tag retention rule ID
     * @param RetentionId Tag retention rule ID
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    public DeleteTagRetentionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTagRetentionRuleRequest(DeleteTagRetentionRuleRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);

    }
}

