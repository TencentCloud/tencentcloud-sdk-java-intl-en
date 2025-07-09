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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDBItem extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Instance Vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Whether the instance can be migrated. Valid values: `1 (yes); `0` (no).
    */
    @SerializedName("Usable")
    @Expose
    private Long Usable;

    /**
    * The cause why the instance cannot be migrated
    */
    @SerializedName("Hint")
    @Expose
    private String Hint;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance VIP 
     * @return Vip Instance VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Instance VIP
     * @param Vip Instance VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Instance Vport 
     * @return Vport Instance Vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Instance Vport
     * @param Vport Instance Vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Whether the instance can be migrated. Valid values: `1 (yes); `0` (no). 
     * @return Usable Whether the instance can be migrated. Valid values: `1 (yes); `0` (no).
     */
    public Long getUsable() {
        return this.Usable;
    }

    /**
     * Set Whether the instance can be migrated. Valid values: `1 (yes); `0` (no).
     * @param Usable Whether the instance can be migrated. Valid values: `1 (yes); `0` (no).
     */
    public void setUsable(Long Usable) {
        this.Usable = Usable;
    }

    /**
     * Get The cause why the instance cannot be migrated 
     * @return Hint The cause why the instance cannot be migrated
     */
    public String getHint() {
        return this.Hint;
    }

    /**
     * Set The cause why the instance cannot be migrated
     * @param Hint The cause why the instance cannot be migrated
     */
    public void setHint(String Hint) {
        this.Hint = Hint;
    }

    public MigrateDBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDBItem(MigrateDBItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Usable != null) {
            this.Usable = new Long(source.Usable);
        }
        if (source.Hint != null) {
            this.Hint = new String(source.Hint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Usable", this.Usable);
        this.setParamSimple(map, prefix + "Hint", this.Hint);

    }
}

