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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspAttackTypeListItem extends AbstractModel {

    /**
    * Attack Type Name
    */
    @SerializedName("AttackTypeName")
    @Expose
    private String AttackTypeName;

    /**
    * Attack Type ID
    */
    @SerializedName("AttackTypeID")
    @Expose
    private Long AttackTypeID;

    /**
    * Feature type of the vulnerability, rasp: vulnerability defense, memshell_inject: memory shell injection
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get Attack Type Name 
     * @return AttackTypeName Attack Type Name
     */
    public String getAttackTypeName() {
        return this.AttackTypeName;
    }

    /**
     * Set Attack Type Name
     * @param AttackTypeName Attack Type Name
     */
    public void setAttackTypeName(String AttackTypeName) {
        this.AttackTypeName = AttackTypeName;
    }

    /**
     * Get Attack Type ID 
     * @return AttackTypeID Attack Type ID
     */
    public Long getAttackTypeID() {
        return this.AttackTypeID;
    }

    /**
     * Set Attack Type ID
     * @param AttackTypeID Attack Type ID
     */
    public void setAttackTypeID(Long AttackTypeID) {
        this.AttackTypeID = AttackTypeID;
    }

    /**
     * Get Feature type of the vulnerability, rasp: vulnerability defense, memshell_inject: memory shell injection 
     * @return Source Feature type of the vulnerability, rasp: vulnerability defense, memshell_inject: memory shell injection
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Feature type of the vulnerability, rasp: vulnerability defense, memshell_inject: memory shell injection
     * @param Source Feature type of the vulnerability, rasp: vulnerability defense, memshell_inject: memory shell injection
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public RaspAttackTypeListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspAttackTypeListItem(RaspAttackTypeListItem source) {
        if (source.AttackTypeName != null) {
            this.AttackTypeName = new String(source.AttackTypeName);
        }
        if (source.AttackTypeID != null) {
            this.AttackTypeID = new Long(source.AttackTypeID);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackTypeName", this.AttackTypeName);
        this.setParamSimple(map, prefix + "AttackTypeID", this.AttackTypeID);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

