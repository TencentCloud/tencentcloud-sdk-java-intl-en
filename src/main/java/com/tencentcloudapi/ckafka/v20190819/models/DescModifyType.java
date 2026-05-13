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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescModifyType extends AbstractModel {

    /**
    * Specifies the renewal type.
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * Specifies whether to migrate.
    */
    @SerializedName("MigrateFlag")
    @Expose
    private Boolean MigrateFlag;

    /**
     * Get Specifies the renewal type. 
     * @return ModifyType Specifies the renewal type.
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Specifies the renewal type.
     * @param ModifyType Specifies the renewal type.
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get Specifies whether to migrate. 
     * @return MigrateFlag Specifies whether to migrate.
     */
    public Boolean getMigrateFlag() {
        return this.MigrateFlag;
    }

    /**
     * Set Specifies whether to migrate.
     * @param MigrateFlag Specifies whether to migrate.
     */
    public void setMigrateFlag(Boolean MigrateFlag) {
        this.MigrateFlag = MigrateFlag;
    }

    public DescModifyType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescModifyType(DescModifyType source) {
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.MigrateFlag != null) {
            this.MigrateFlag = new Boolean(source.MigrateFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "MigrateFlag", this.MigrateFlag);

    }
}

