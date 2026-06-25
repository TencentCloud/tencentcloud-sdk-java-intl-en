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

public class EditCorpTagRequest extends AbstractModel {

    /**
    * tag ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Tag name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Import tag mode (manual/auto)
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * id of the tag table for automatic import
    */
    @SerializedName("AutoImportTagTableId")
    @Expose
    private Long AutoImportTagTableId;

    /**
    * Automatic import of associated tag fields
    */
    @SerializedName("AutoImportField")
    @Expose
    private String AutoImportField;

    /**
    * Whether it is an async request.
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * Name of the tag table for automatic import
    */
    @SerializedName("AutoImportTagTableName")
    @Expose
    private String AutoImportTagTableName;

    /**
    * Transaction ID.
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
     * Get tag ID 
     * @return Id tag ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set tag ID
     * @param Id tag ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Tag name. 
     * @return Name Tag name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tag name.
     * @param Name Tag name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Import tag mode (manual/auto) 
     * @return ImportType Import tag mode (manual/auto)
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set Import tag mode (manual/auto)
     * @param ImportType Import tag mode (manual/auto)
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get id of the tag table for automatic import 
     * @return AutoImportTagTableId id of the tag table for automatic import
     */
    public Long getAutoImportTagTableId() {
        return this.AutoImportTagTableId;
    }

    /**
     * Set id of the tag table for automatic import
     * @param AutoImportTagTableId id of the tag table for automatic import
     */
    public void setAutoImportTagTableId(Long AutoImportTagTableId) {
        this.AutoImportTagTableId = AutoImportTagTableId;
    }

    /**
     * Get Automatic import of associated tag fields 
     * @return AutoImportField Automatic import of associated tag fields
     */
    public String getAutoImportField() {
        return this.AutoImportField;
    }

    /**
     * Set Automatic import of associated tag fields
     * @param AutoImportField Automatic import of associated tag fields
     */
    public void setAutoImportField(String AutoImportField) {
        this.AutoImportField = AutoImportField;
    }

    /**
     * Get Whether it is an async request. 
     * @return AsyncRequest Whether it is an async request.
     */
    public Boolean getAsyncRequest() {
        return this.AsyncRequest;
    }

    /**
     * Set Whether it is an async request.
     * @param AsyncRequest Whether it is an async request.
     */
    public void setAsyncRequest(Boolean AsyncRequest) {
        this.AsyncRequest = AsyncRequest;
    }

    /**
     * Get Name of the tag table for automatic import 
     * @return AutoImportTagTableName Name of the tag table for automatic import
     */
    public String getAutoImportTagTableName() {
        return this.AutoImportTagTableName;
    }

    /**
     * Set Name of the tag table for automatic import
     * @param AutoImportTagTableName Name of the tag table for automatic import
     */
    public void setAutoImportTagTableName(String AutoImportTagTableName) {
        this.AutoImportTagTableName = AutoImportTagTableName;
    }

    /**
     * Get Transaction ID. 
     * @return TranId Transaction ID.
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set Transaction ID.
     * @param TranId Transaction ID.
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    public EditCorpTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditCorpTagRequest(EditCorpTagRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.AutoImportTagTableId != null) {
            this.AutoImportTagTableId = new Long(source.AutoImportTagTableId);
        }
        if (source.AutoImportField != null) {
            this.AutoImportField = new String(source.AutoImportField);
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.AutoImportTagTableName != null) {
            this.AutoImportTagTableName = new String(source.AutoImportTagTableName);
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "AutoImportTagTableId", this.AutoImportTagTableId);
        this.setParamSimple(map, prefix + "AutoImportField", this.AutoImportField);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "AutoImportTagTableName", this.AutoImportTagTableName);
        this.setParamSimple(map, prefix + "TranId", this.TranId);

    }
}

