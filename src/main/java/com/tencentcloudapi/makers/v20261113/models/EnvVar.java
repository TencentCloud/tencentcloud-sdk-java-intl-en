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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvVar extends AbstractModel {

    /**
    * <p>Variable name, up to 255 characters</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Variable value, up to 1000</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>Variable ID. It is not passed in upon creation.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Remark. Up to 255 characters</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Effective environment slug, for example, Production, Preview. Multi-line environments with the same Key must not overlap</p>
    */
    @SerializedName("Env")
    @Expose
    private String [] Env;

    /**
     * Get <p>Variable name, up to 255 characters</p> 
     * @return Key <p>Variable name, up to 255 characters</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Variable name, up to 255 characters</p>
     * @param Key <p>Variable name, up to 255 characters</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Variable value, up to 1000</p> 
     * @return Value <p>Variable value, up to 1000</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Variable value, up to 1000</p>
     * @param Value <p>Variable value, up to 1000</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>Variable ID. It is not passed in upon creation.</p> 
     * @return Id <p>Variable ID. It is not passed in upon creation.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Variable ID. It is not passed in upon creation.</p>
     * @param Id <p>Variable ID. It is not passed in upon creation.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Remark. Up to 255 characters</p> 
     * @return Comment <p>Remark. Up to 255 characters</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Remark. Up to 255 characters</p>
     * @param Comment <p>Remark. Up to 255 characters</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Effective environment slug, for example, Production, Preview. Multi-line environments with the same Key must not overlap</p> 
     * @return Env <p>Effective environment slug, for example, Production, Preview. Multi-line environments with the same Key must not overlap</p>
     */
    public String [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>Effective environment slug, for example, Production, Preview. Multi-line environments with the same Key must not overlap</p>
     * @param Env <p>Effective environment slug, for example, Production, Preview. Multi-line environments with the same Key must not overlap</p>
     */
    public void setEnv(String [] Env) {
        this.Env = Env;
    }

    public EnvVar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvVar(EnvVar source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Env != null) {
            this.Env = new String[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new String(source.Env[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "Env.", this.Env);

    }
}

