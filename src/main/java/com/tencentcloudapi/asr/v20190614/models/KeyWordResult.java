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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyWordResult extends AbstractModel {

    /**
    * Keyword library ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyWordLibID")
    @Expose
    private String KeyWordLibID;

    /**
    * Keyword library name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyWordLibName")
    @Expose
    private String KeyWordLibName;

    /**
    * Matching keywords.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
     * Get Keyword library ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyWordLibID Keyword library ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyWordLibID() {
        return this.KeyWordLibID;
    }

    /**
     * Set Keyword library ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyWordLibID Keyword library ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyWordLibID(String KeyWordLibID) {
        this.KeyWordLibID = KeyWordLibID;
    }

    /**
     * Get Keyword library name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyWordLibName Keyword library name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyWordLibName() {
        return this.KeyWordLibName;
    }

    /**
     * Set Keyword library name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyWordLibName Keyword library name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyWordLibName(String KeyWordLibName) {
        this.KeyWordLibName = KeyWordLibName;
    }

    /**
     * Get Matching keywords.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyWords Matching keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set Matching keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyWords Matching keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyWords(String [] KeyWords) {
        this.KeyWords = KeyWords;
    }

    public KeyWordResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyWordResult(KeyWordResult source) {
        if (source.KeyWordLibID != null) {
            this.KeyWordLibID = new String(source.KeyWordLibID);
        }
        if (source.KeyWordLibName != null) {
            this.KeyWordLibName = new String(source.KeyWordLibName);
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String[source.KeyWords.length];
            for (int i = 0; i < source.KeyWords.length; i++) {
                this.KeyWords[i] = new String(source.KeyWords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWordLibID", this.KeyWordLibID);
        this.setParamSimple(map, prefix + "KeyWordLibName", this.KeyWordLibName);
        this.setParamArraySimple(map, prefix + "KeyWords.", this.KeyWords);

    }
}

