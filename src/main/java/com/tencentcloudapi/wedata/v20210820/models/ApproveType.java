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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproveType extends AbstractModel {

    /**
    * Application Category Key
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Type Name
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Application Type Key
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
     * Get Application Category Key 
     * @return Type Application Category Key
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Application Category Key
     * @param Type Application Category Key
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Type Name 
     * @return TypeName Type Name
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Type Name
     * @param TypeName Type Name
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Application Type Key 
     * @return Classification Application Type Key
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set Application Type Key
     * @param Classification Application Type Key
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    public ApproveType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveType(ApproveType source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Classification", this.Classification);

    }
}

