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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailMessage extends AbstractModel {

    /**
    * Unique Data Identifier
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Failure Reason
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get Unique Data Identifier
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Key Unique Data Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Unique Data Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Key Unique Data Identifier
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Failure Reason
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErrorMessage Failure Reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Failure Reason
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErrorMessage Failure Reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public FailMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailMessage(FailMessage source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

