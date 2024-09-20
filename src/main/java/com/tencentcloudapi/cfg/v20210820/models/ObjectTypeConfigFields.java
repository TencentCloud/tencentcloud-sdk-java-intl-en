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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTypeConfigFields extends AbstractModel {

    /**
    * instanceId
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Instance ID
    */
    @SerializedName("Header")
    @Expose
    private String Header;

    /**
    * Whether the field value needs to be translated. If not, this field returns null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Transfer")
    @Expose
    private String Transfer;

    /**
    * Value returned for container Pod resources
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonParse")
    @Expose
    private String JsonParse;

    /**
     * Get instanceId 
     * @return Key instanceId
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set instanceId
     * @param Key instanceId
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Instance ID 
     * @return Header Instance ID
     */
    public String getHeader() {
        return this.Header;
    }

    /**
     * Set Instance ID
     * @param Header Instance ID
     */
    public void setHeader(String Header) {
        this.Header = Header;
    }

    /**
     * Get Whether the field value needs to be translated. If not, this field returns null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Transfer Whether the field value needs to be translated. If not, this field returns null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTransfer() {
        return this.Transfer;
    }

    /**
     * Set Whether the field value needs to be translated. If not, this field returns null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Transfer Whether the field value needs to be translated. If not, this field returns null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransfer(String Transfer) {
        this.Transfer = Transfer;
    }

    /**
     * Get Value returned for container Pod resources
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonParse Value returned for container Pod resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJsonParse() {
        return this.JsonParse;
    }

    /**
     * Set Value returned for container Pod resources
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonParse Value returned for container Pod resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonParse(String JsonParse) {
        this.JsonParse = JsonParse;
    }

    public ObjectTypeConfigFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectTypeConfigFields(ObjectTypeConfigFields source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Header != null) {
            this.Header = new String(source.Header);
        }
        if (source.Transfer != null) {
            this.Transfer = new String(source.Transfer);
        }
        if (source.JsonParse != null) {
            this.JsonParse = new String(source.JsonParse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Header", this.Header);
        this.setParamSimple(map, prefix + "Transfer", this.Transfer);
        this.setParamSimple(map, prefix + "JsonParse", this.JsonParse);

    }
}

