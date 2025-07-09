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

public class ValueInfo extends AbstractModel {

    /**
    * Field delimiter
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
    * Field type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether the analysis feature is enabled for the field
    */
    @SerializedName("SqlFlag")
    @Expose
    private Boolean SqlFlag;

    /**
    * Whether Chinese characters are contained
    */
    @SerializedName("ContainZH")
    @Expose
    private Boolean ContainZH;

    /**
     * Get Field delimiter 
     * @return Tokenizer Field delimiter
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set Field delimiter
     * @param Tokenizer Field delimiter
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    /**
     * Get Field type 
     * @return Type Field type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Field type
     * @param Type Field type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether the analysis feature is enabled for the field 
     * @return SqlFlag Whether the analysis feature is enabled for the field
     */
    public Boolean getSqlFlag() {
        return this.SqlFlag;
    }

    /**
     * Set Whether the analysis feature is enabled for the field
     * @param SqlFlag Whether the analysis feature is enabled for the field
     */
    public void setSqlFlag(Boolean SqlFlag) {
        this.SqlFlag = SqlFlag;
    }

    /**
     * Get Whether Chinese characters are contained 
     * @return ContainZH Whether Chinese characters are contained
     */
    public Boolean getContainZH() {
        return this.ContainZH;
    }

    /**
     * Set Whether Chinese characters are contained
     * @param ContainZH Whether Chinese characters are contained
     */
    public void setContainZH(Boolean ContainZH) {
        this.ContainZH = ContainZH;
    }

    public ValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueInfo(ValueInfo source) {
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SqlFlag != null) {
            this.SqlFlag = new Boolean(source.SqlFlag);
        }
        if (source.ContainZH != null) {
            this.ContainZH = new Boolean(source.ContainZH);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SqlFlag", this.SqlFlag);
        this.setParamSimple(map, prefix + "ContainZH", this.ContainZH);

    }
}

