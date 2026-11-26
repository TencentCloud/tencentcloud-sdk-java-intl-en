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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateScope extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Instance status list.
    */
    @SerializedName("EntityStatus")
    @Expose
    private EntityStatus [] EntityStatus;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Instance status list. 
     * @return EntityStatus Instance status list.
     */
    public EntityStatus [] getEntityStatus() {
        return this.EntityStatus;
    }

    /**
     * Set Instance status list.
     * @param EntityStatus Instance status list.
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

