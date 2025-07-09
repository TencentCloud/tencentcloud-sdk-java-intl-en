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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgRecordReference extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Source document ID.
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
     * Get ID 
     * @return Id ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get URL. 
     * @return Url URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL.
     * @param Url URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Type. 
     * @return Type Type.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Source document ID. 
     * @return DocId Source document ID.
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set Source document ID.
     * @param DocId Source document ID.
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    public MsgRecordReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordReference(MsgRecordReference source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DocId", this.DocId);

    }
}

