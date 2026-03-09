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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralResourceQuotaSet extends AbstractModel {

    /**
    * Resource name

Value is:.

- COMMAND: COMMAND.
-REGISTER_CODE: managed instance registration code.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Used credit limit.
    */
    @SerializedName("ResourceQuotaUsed")
    @Expose
    private Long ResourceQuotaUsed;

    /**
    * Total quota.
    */
    @SerializedName("ResourceQuotaTotal")
    @Expose
    private Long ResourceQuotaTotal;

    /**
     * Get Resource name

Value is:.

- COMMAND: COMMAND.
-REGISTER_CODE: managed instance registration code. 
     * @return ResourceName Resource name

Value is:.

- COMMAND: COMMAND.
-REGISTER_CODE: managed instance registration code.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name

Value is:.

- COMMAND: COMMAND.
-REGISTER_CODE: managed instance registration code.
     * @param ResourceName Resource name

Value is:.

- COMMAND: COMMAND.
-REGISTER_CODE: managed instance registration code.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Used credit limit. 
     * @return ResourceQuotaUsed Used credit limit.
     */
    public Long getResourceQuotaUsed() {
        return this.ResourceQuotaUsed;
    }

    /**
     * Set Used credit limit.
     * @param ResourceQuotaUsed Used credit limit.
     */
    public void setResourceQuotaUsed(Long ResourceQuotaUsed) {
        this.ResourceQuotaUsed = ResourceQuotaUsed;
    }

    /**
     * Get Total quota. 
     * @return ResourceQuotaTotal Total quota.
     */
    public Long getResourceQuotaTotal() {
        return this.ResourceQuotaTotal;
    }

    /**
     * Set Total quota.
     * @param ResourceQuotaTotal Total quota.
     */
    public void setResourceQuotaTotal(Long ResourceQuotaTotal) {
        this.ResourceQuotaTotal = ResourceQuotaTotal;
    }

    public GeneralResourceQuotaSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralResourceQuotaSet(GeneralResourceQuotaSet source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceQuotaUsed != null) {
            this.ResourceQuotaUsed = new Long(source.ResourceQuotaUsed);
        }
        if (source.ResourceQuotaTotal != null) {
            this.ResourceQuotaTotal = new Long(source.ResourceQuotaTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceQuotaUsed", this.ResourceQuotaUsed);
        this.setParamSimple(map, prefix + "ResourceQuotaTotal", this.ResourceQuotaTotal);

    }
}

