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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemNames extends AbstractModel {

    /**
    * 
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 
    */
    @SerializedName("KeyType")
    @Expose
    private Long KeyType;

    /**
    * 
    */
    @SerializedName("KeyPrompt")
    @Expose
    private String KeyPrompt;

    /**
    * 
    */
    @SerializedName("KeyExpectedValue")
    @Expose
    private String KeyExpectedValue;

    /**
    * 
    */
    @SerializedName("KeyAuditPrompt")
    @Expose
    private String KeyAuditPrompt;

    /**
     * Get  
     * @return KeyName 
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 
     * @param KeyName 
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get  
     * @return KeyType 
     */
    public Long getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 
     * @param KeyType 
     */
    public void setKeyType(Long KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get  
     * @return KeyPrompt 
     */
    public String getKeyPrompt() {
        return this.KeyPrompt;
    }

    /**
     * Set 
     * @param KeyPrompt 
     */
    public void setKeyPrompt(String KeyPrompt) {
        this.KeyPrompt = KeyPrompt;
    }

    /**
     * Get  
     * @return KeyExpectedValue 
     */
    public String getKeyExpectedValue() {
        return this.KeyExpectedValue;
    }

    /**
     * Set 
     * @param KeyExpectedValue 
     */
    public void setKeyExpectedValue(String KeyExpectedValue) {
        this.KeyExpectedValue = KeyExpectedValue;
    }

    /**
     * Get  
     * @return KeyAuditPrompt 
     */
    public String getKeyAuditPrompt() {
        return this.KeyAuditPrompt;
    }

    /**
     * Set 
     * @param KeyAuditPrompt 
     */
    public void setKeyAuditPrompt(String KeyAuditPrompt) {
        this.KeyAuditPrompt = KeyAuditPrompt;
    }

    public ItemNames() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemNames(ItemNames source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyType != null) {
            this.KeyType = new Long(source.KeyType);
        }
        if (source.KeyPrompt != null) {
            this.KeyPrompt = new String(source.KeyPrompt);
        }
        if (source.KeyExpectedValue != null) {
            this.KeyExpectedValue = new String(source.KeyExpectedValue);
        }
        if (source.KeyAuditPrompt != null) {
            this.KeyAuditPrompt = new String(source.KeyAuditPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyPrompt", this.KeyPrompt);
        this.setParamSimple(map, prefix + "KeyExpectedValue", this.KeyExpectedValue);
        this.setParamSimple(map, prefix + "KeyAuditPrompt", this.KeyAuditPrompt);

    }
}

