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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserTagInfo extends AbstractModel {

    /**
    * tag ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Tag name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Managed or not
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsExternalManage")
    @Expose
    private Boolean IsExternalManage;

    /**
    * Tag hosting platform
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
    * Import type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
     * Get tag ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id tag ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set tag ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id tag ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Tag name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Tag name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tag name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Tag name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Tag value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Tag value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Tag value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Managed or not
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsExternalManage Managed or not
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsExternalManage() {
        return this.IsExternalManage;
    }

    /**
     * Set Managed or not
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsExternalManage Managed or not
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsExternalManage(Boolean IsExternalManage) {
        this.IsExternalManage = IsExternalManage;
    }

    /**
     * Get Tag hosting platform
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManagePlatform Tag hosting platform
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set Tag hosting platform
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManagePlatform Tag hosting platform
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    /**
     * Get Import type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImportType Import type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set Import type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImportType Import type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    public UserTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserTagInfo(UserTagInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.IsExternalManage != null) {
            this.IsExternalManage = new Boolean(source.IsExternalManage);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "IsExternalManage", this.IsExternalManage);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);

    }
}

