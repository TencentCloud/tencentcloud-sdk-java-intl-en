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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LookupAttribute extends AbstractModel {

    /**
    * Valid values: RequestId, EventName, ReadOnly, Username, ResourceType, ResourceName, AccessKeyId, and EventId
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("AttributeKey")
    @Expose
    private String AttributeKey;

    /**
    * Value of `AttributeValue`
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("AttributeValue")
    @Expose
    private String AttributeValue;

    /**
     * Get Valid values: RequestId, EventName, ReadOnly, Username, ResourceType, ResourceName, AccessKeyId, and EventId
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return AttributeKey Valid values: RequestId, EventName, ReadOnly, Username, ResourceType, ResourceName, AccessKeyId, and EventId
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getAttributeKey() {
        return this.AttributeKey;
    }

    /**
     * Set Valid values: RequestId, EventName, ReadOnly, Username, ResourceType, ResourceName, AccessKeyId, and EventId
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param AttributeKey Valid values: RequestId, EventName, ReadOnly, Username, ResourceType, ResourceName, AccessKeyId, and EventId
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setAttributeKey(String AttributeKey) {
        this.AttributeKey = AttributeKey;
    }

    /**
     * Get Value of `AttributeValue`
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return AttributeValue Value of `AttributeValue`
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getAttributeValue() {
        return this.AttributeValue;
    }

    /**
     * Set Value of `AttributeValue`
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param AttributeValue Value of `AttributeValue`
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setAttributeValue(String AttributeValue) {
        this.AttributeValue = AttributeValue;
    }

    public LookupAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LookupAttribute(LookupAttribute source) {
        if (source.AttributeKey != null) {
            this.AttributeKey = new String(source.AttributeKey);
        }
        if (source.AttributeValue != null) {
            this.AttributeValue = new String(source.AttributeValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeKey", this.AttributeKey);
        this.setParamSimple(map, prefix + "AttributeValue", this.AttributeValue);

    }
}

