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

public class ModifyLicenseUnBindsRequest extends AbstractModel {

    /**
    * <p>Resource ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Authorization type</p><p>Enumeration values:</p><ul><li>1: Pro Edition - monthly subscription</li><li>2: Ultimate Edition - monthly subscription</li></ul>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * <p>Whether all machines (when the number of all machines exceeds the available licenses in the current order, extra machines will be skipped)</p>
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * <p>List of QUUIDs of machines to be bound. Required when IsAll = false; otherwise, ignore the parameter.<br>Maximum length: 100</p>
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
     * Get <p>Resource ID</p> 
     * @return ResourceId <p>Resource ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID</p>
     * @param ResourceId <p>Resource ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Authorization type</p><p>Enumeration values:</p><ul><li>1: Pro Edition - monthly subscription</li><li>2: Ultimate Edition - monthly subscription</li></ul> 
     * @return LicenseType <p>Authorization type</p><p>Enumeration values:</p><ul><li>1: Pro Edition - monthly subscription</li><li>2: Ultimate Edition - monthly subscription</li></ul>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>Authorization type</p><p>Enumeration values:</p><ul><li>1: Pro Edition - monthly subscription</li><li>2: Ultimate Edition - monthly subscription</li></ul>
     * @param LicenseType <p>Authorization type</p><p>Enumeration values:</p><ul><li>1: Pro Edition - monthly subscription</li><li>2: Ultimate Edition - monthly subscription</li></ul>
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>Whether all machines (when the number of all machines exceeds the available licenses in the current order, extra machines will be skipped)</p> 
     * @return IsAll <p>Whether all machines (when the number of all machines exceeds the available licenses in the current order, extra machines will be skipped)</p>
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set <p>Whether all machines (when the number of all machines exceeds the available licenses in the current order, extra machines will be skipped)</p>
     * @param IsAll <p>Whether all machines (when the number of all machines exceeds the available licenses in the current order, extra machines will be skipped)</p>
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get <p>List of QUUIDs of machines to be bound. Required when IsAll = false; otherwise, ignore the parameter.<br>Maximum length: 100</p> 
     * @return QuuidList <p>List of QUUIDs of machines to be bound. Required when IsAll = false; otherwise, ignore the parameter.<br>Maximum length: 100</p>
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set <p>List of QUUIDs of machines to be bound. Required when IsAll = false; otherwise, ignore the parameter.<br>Maximum length: 100</p>
     * @param QuuidList <p>List of QUUIDs of machines to be bound. Required when IsAll = false; otherwise, ignore the parameter.<br>Maximum length: 100</p>
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    public ModifyLicenseUnBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLicenseUnBindsRequest(ModifyLicenseUnBindsRequest source) {
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

