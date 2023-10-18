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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TColumn extends AbstractModel {

    /**
    * The field name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The field type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The field description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * The default field value.
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Whether the field is not null.
    */
    @SerializedName("NotNull")
    @Expose
    private Boolean NotNull;

    /**
     * Get The field name. 
     * @return Name The field name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The field name.
     * @param Name The field name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The field type. 
     * @return Type The field type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The field type.
     * @param Type The field type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The field description. 
     * @return Comment The field description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set The field description.
     * @param Comment The field description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get The default field value. 
     * @return Default The default field value.
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set The default field value.
     * @param Default The default field value.
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get Whether the field is not null. 
     * @return NotNull Whether the field is not null.
     */
    public Boolean getNotNull() {
        return this.NotNull;
    }

    /**
     * Set Whether the field is not null.
     * @param NotNull Whether the field is not null.
     */
    public void setNotNull(Boolean NotNull) {
        this.NotNull = NotNull;
    }

    public TColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TColumn(TColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.NotNull != null) {
            this.NotNull = new Boolean(source.NotNull);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "NotNull", this.NotNull);

    }
}

