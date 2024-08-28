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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetUserKeyInfo extends AbstractModel {

    /**
    * Public key value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Public key remarks
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Encryption method
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
     * Get Public key value 
     * @return Value Public key value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Public key value
     * @param Value Public key value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Public key remarks 
     * @return Comment Public key remarks
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Public key remarks
     * @param Comment Public key remarks
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Encryption method 
     * @return EncryptType Encryption method
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set Encryption method
     * @param EncryptType Encryption method
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    public AssetUserKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetUserKeyInfo(AssetUserKeyInfo source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);

    }
}

