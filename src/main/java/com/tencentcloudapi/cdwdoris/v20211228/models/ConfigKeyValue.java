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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigKeyValue extends AbstractModel {

    /**
    * key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * Value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Notes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 1 indicates read-only, 2 indicates editable but undeletable, and 3 indicates deletable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Display")
    @Expose
    private Long Display;

    /**
    * 0 means not supported, and 1 means hot update is supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportHotUpdate")
    @Expose
    private Long SupportHotUpdate;

    /**
     * Get key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyName key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyName key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get Value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Notes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Notes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Notes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Notes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 1 indicates read-only, 2 indicates editable but undeletable, and 3 indicates deletable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Display 1 indicates read-only, 2 indicates editable but undeletable, and 3 indicates deletable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDisplay() {
        return this.Display;
    }

    /**
     * Set 1 indicates read-only, 2 indicates editable but undeletable, and 3 indicates deletable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Display 1 indicates read-only, 2 indicates editable but undeletable, and 3 indicates deletable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplay(Long Display) {
        this.Display = Display;
    }

    /**
     * Get 0 means not supported, and 1 means hot update is supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportHotUpdate 0 means not supported, and 1 means hot update is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSupportHotUpdate() {
        return this.SupportHotUpdate;
    }

    /**
     * Set 0 means not supported, and 1 means hot update is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportHotUpdate 0 means not supported, and 1 means hot update is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportHotUpdate(Long SupportHotUpdate) {
        this.SupportHotUpdate = SupportHotUpdate;
    }

    public ConfigKeyValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigKeyValue(ConfigKeyValue source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Display != null) {
            this.Display = new Long(source.Display);
        }
        if (source.SupportHotUpdate != null) {
            this.SupportHotUpdate = new Long(source.SupportHotUpdate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Display", this.Display);
        this.setParamSimple(map, prefix + "SupportHotUpdate", this.SupportHotUpdate);

    }
}

