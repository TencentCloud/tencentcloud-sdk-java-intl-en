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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateScope extends AbstractModel {

    /**
    * ID of the site.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of instance statuses
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("EntityStatus")
    @Expose
    private EntityStatus [] EntityStatus;

    /**
     * Get ID of the site.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ZoneId ID of the site.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ZoneId ID of the site.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of instance statuses
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return EntityStatus List of instance statuses
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public EntityStatus [] getEntityStatus() {
        return this.EntityStatus;
    }

    /**
     * Set List of instance statuses
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param EntityStatus List of instance statuses
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setEntityStatus(EntityStatus [] EntityStatus) {
        this.EntityStatus = EntityStatus;
    }

    public TemplateScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateScope(TemplateScope source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EntityStatus != null) {
            this.EntityStatus = new EntityStatus[source.EntityStatus.length];
            for (int i = 0; i < source.EntityStatus.length; i++) {
                this.EntityStatus[i] = new EntityStatus(source.EntityStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "EntityStatus.", this.EntityStatus);

    }
}

