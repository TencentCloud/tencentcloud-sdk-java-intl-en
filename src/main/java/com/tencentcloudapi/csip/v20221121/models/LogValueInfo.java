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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogValueInfo extends AbstractModel {

    /**
    * <p>Type.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
    * <p>sql tag</p>
    */
    @SerializedName("SqlFlag")
    @Expose
    private Boolean SqlFlag;

    /**
    * <p>contain Chinese</p>
    */
    @SerializedName("ContainZH")
    @Expose
    private Boolean ContainZH;

    /**
    * <p>Alias</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get <p>Type.</p> 
     * @return Type <p>Type.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Type.</p>
     * @param Type <p>Type.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tokenizer <p>Tag.</p>
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tokenizer <p>Tag.</p>
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    /**
     * Get <p>sql tag</p> 
     * @return SqlFlag <p>sql tag</p>
     */
    public Boolean getSqlFlag() {
        return this.SqlFlag;
    }

    /**
     * Set <p>sql tag</p>
     * @param SqlFlag <p>sql tag</p>
     */
    public void setSqlFlag(Boolean SqlFlag) {
        this.SqlFlag = SqlFlag;
    }

    /**
     * Get <p>contain Chinese</p> 
     * @return ContainZH <p>contain Chinese</p>
     */
    public Boolean getContainZH() {
        return this.ContainZH;
    }

    /**
     * Set <p>contain Chinese</p>
     * @param ContainZH <p>contain Chinese</p>
     */
    public void setContainZH(Boolean ContainZH) {
        this.ContainZH = ContainZH;
    }

    /**
     * Get <p>Alias</p> 
     * @return Alias <p>Alias</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Alias</p>
     * @param Alias <p>Alias</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public LogValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogValueInfo(LogValueInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
        if (source.SqlFlag != null) {
            this.SqlFlag = new Boolean(source.SqlFlag);
        }
        if (source.ContainZH != null) {
            this.ContainZH = new Boolean(source.ContainZH);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);
        this.setParamSimple(map, prefix + "SqlFlag", this.SqlFlag);
        this.setParamSimple(map, prefix + "ContainZH", this.ContainZH);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

