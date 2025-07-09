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

public class ModifyOriginACLRequest extends AbstractModel {

    /**
    * Specifies the site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Specifies the instance that needs to configurate origin ACLs.
    */
    @SerializedName("OriginACLEntities")
    @Expose
    private OriginACLEntity [] OriginACLEntities;

    /**
     * Get Specifies the site ID. 
     * @return ZoneId Specifies the site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the site ID.
     * @param ZoneId Specifies the site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Specifies the instance that needs to configurate origin ACLs. 
     * @return OriginACLEntities Specifies the instance that needs to configurate origin ACLs.
     */
    public OriginACLEntity [] getOriginACLEntities() {
        return this.OriginACLEntities;
    }

    /**
     * Set Specifies the instance that needs to configurate origin ACLs.
     * @param OriginACLEntities Specifies the instance that needs to configurate origin ACLs.
     */
    public void setOriginACLEntities(OriginACLEntity [] OriginACLEntities) {
        this.OriginACLEntities = OriginACLEntities;
    }

    public ModifyOriginACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginACLRequest(ModifyOriginACLRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OriginACLEntities != null) {
            this.OriginACLEntities = new OriginACLEntity[source.OriginACLEntities.length];
            for (int i = 0; i < source.OriginACLEntities.length; i++) {
                this.OriginACLEntities[i] = new OriginACLEntity(source.OriginACLEntities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "OriginACLEntities.", this.OriginACLEntities);

    }
}

