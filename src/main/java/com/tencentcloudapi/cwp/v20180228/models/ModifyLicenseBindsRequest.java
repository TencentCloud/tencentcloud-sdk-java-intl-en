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

public class ModifyLicenseBindsRequest extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Authorization type
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Whether all machines are involved. (If the total number of machines exceeds the available authorizations in the current order, some machines will be skipped.)
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * List of QUUIDs of machines to be bound. This parameter is required when IsAll is set to false. Otherwise, it is ignored. Maximum number: 2,000.
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Authorization type 
     * @return LicenseType Authorization type
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type
     * @param LicenseType Authorization type
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Whether all machines are involved. (If the total number of machines exceeds the available authorizations in the current order, some machines will be skipped.) 
     * @return IsAll Whether all machines are involved. (If the total number of machines exceeds the available authorizations in the current order, some machines will be skipped.)
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set Whether all machines are involved. (If the total number of machines exceeds the available authorizations in the current order, some machines will be skipped.)
     * @param IsAll Whether all machines are involved. (If the total number of machines exceeds the available authorizations in the current order, some machines will be skipped.)
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get List of QUUIDs of machines to be bound. This parameter is required when IsAll is set to false. Otherwise, it is ignored. Maximum number: 2,000. 
     * @return QuuidList List of QUUIDs of machines to be bound. This parameter is required when IsAll is set to false. Otherwise, it is ignored. Maximum number: 2,000.
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set List of QUUIDs of machines to be bound. This parameter is required when IsAll is set to false. Otherwise, it is ignored. Maximum number: 2,000.
     * @param QuuidList List of QUUIDs of machines to be bound. This parameter is required when IsAll is set to false. Otherwise, it is ignored. Maximum number: 2,000.
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    public ModifyLicenseBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLicenseBindsRequest(ModifyLicenseBindsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);

    }
}

