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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileExportUserJobRequest extends AbstractModel {

    /**
    * User directory ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * Exported data type

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Attributes and mapping names included in the exported user information. If this parameter is empty, all attributes will be included.
    */
    @SerializedName("ExportPropertyMaps")
    @Expose
    private ExportPropertyMap [] ExportPropertyMaps;

    /**
     * Get User directory ID 
     * @return UserStoreId User directory ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User directory ID
     * @param UserStoreId User directory ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get Exported data type

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values 
     * @return Format Exported data type

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Exported data type

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
     * @param Format Exported data type

<li> **NDJSON** </li>  New-line Delimited JSON
<li> **CSV** </li>  Comma-Separated Values
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID 
     * @return Filters Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
     * @param Filters Valid values of `Key`: `condition`, `userGroupId`.

<li> **condition** </li>	Values = Query condition, which can be user ID, username, mobile number, or email address.
<li> **userGroupId** </li>	Values = User group ID
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Attributes and mapping names included in the exported user information. If this parameter is empty, all attributes will be included. 
     * @return ExportPropertyMaps Attributes and mapping names included in the exported user information. If this parameter is empty, all attributes will be included.
     */
    public ExportPropertyMap [] getExportPropertyMaps() {
        return this.ExportPropertyMaps;
    }

    /**
     * Set Attributes and mapping names included in the exported user information. If this parameter is empty, all attributes will be included.
     * @param ExportPropertyMaps Attributes and mapping names included in the exported user information. If this parameter is empty, all attributes will be included.
     */
    public void setExportPropertyMaps(ExportPropertyMap [] ExportPropertyMaps) {
        this.ExportPropertyMaps = ExportPropertyMaps;
    }

    public CreateFileExportUserJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileExportUserJobRequest(CreateFileExportUserJobRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ExportPropertyMaps != null) {
            this.ExportPropertyMaps = new ExportPropertyMap[source.ExportPropertyMaps.length];
            for (int i = 0; i < source.ExportPropertyMaps.length; i++) {
                this.ExportPropertyMaps[i] = new ExportPropertyMap(source.ExportPropertyMaps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "ExportPropertyMaps.", this.ExportPropertyMaps);

    }
}

