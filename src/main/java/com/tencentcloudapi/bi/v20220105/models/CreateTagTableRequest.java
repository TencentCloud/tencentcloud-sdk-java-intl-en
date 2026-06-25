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

public class CreateTagTableRequest extends AbstractModel {

    /**
    * Tag table name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project id associated with the tag table
    */
    @SerializedName("AutoImportProjectId")
    @Expose
    private Long AutoImportProjectId;

    /**
    * id of the data table associated with the tag table
    */
    @SerializedName("AutoImportTableId")
    @Expose
    private Long AutoImportTableId;

    /**
    * Corresponding field of uin
    */
    @SerializedName("AutoImportUinField")
    @Expose
    private String AutoImportUinField;

    /**
     * Get Tag table name 
     * @return Name Tag table name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tag table name
     * @param Name Tag table name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project id associated with the tag table 
     * @return AutoImportProjectId Project id associated with the tag table
     */
    public Long getAutoImportProjectId() {
        return this.AutoImportProjectId;
    }

    /**
     * Set Project id associated with the tag table
     * @param AutoImportProjectId Project id associated with the tag table
     */
    public void setAutoImportProjectId(Long AutoImportProjectId) {
        this.AutoImportProjectId = AutoImportProjectId;
    }

    /**
     * Get id of the data table associated with the tag table 
     * @return AutoImportTableId id of the data table associated with the tag table
     */
    public Long getAutoImportTableId() {
        return this.AutoImportTableId;
    }

    /**
     * Set id of the data table associated with the tag table
     * @param AutoImportTableId id of the data table associated with the tag table
     */
    public void setAutoImportTableId(Long AutoImportTableId) {
        this.AutoImportTableId = AutoImportTableId;
    }

    /**
     * Get Corresponding field of uin 
     * @return AutoImportUinField Corresponding field of uin
     */
    public String getAutoImportUinField() {
        return this.AutoImportUinField;
    }

    /**
     * Set Corresponding field of uin
     * @param AutoImportUinField Corresponding field of uin
     */
    public void setAutoImportUinField(String AutoImportUinField) {
        this.AutoImportUinField = AutoImportUinField;
    }

    public CreateTagTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTagTableRequest(CreateTagTableRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AutoImportProjectId != null) {
            this.AutoImportProjectId = new Long(source.AutoImportProjectId);
        }
        if (source.AutoImportTableId != null) {
            this.AutoImportTableId = new Long(source.AutoImportTableId);
        }
        if (source.AutoImportUinField != null) {
            this.AutoImportUinField = new String(source.AutoImportUinField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AutoImportProjectId", this.AutoImportProjectId);
        this.setParamSimple(map, prefix + "AutoImportTableId", this.AutoImportTableId);
        this.setParamSimple(map, prefix + "AutoImportUinField", this.AutoImportUinField);

    }
}

