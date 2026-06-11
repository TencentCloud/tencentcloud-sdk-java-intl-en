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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogsetRequest extends AbstractModel {

    /**
    * Log set name.

-Supports a maximum of 255 characters. The `|` character is not supported.
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Logset ID, format: custom part-User APPID. Automatically generate ID if left empty.

-The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and has a length of 3 to 40 characters.
-The end requires the use of - to concatenate the User APPID, which can be queried on the https://console.cloud.tencent.com/developer page.
-If you specify this field, ensure uniqueness across all regions.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get Log set name.

-Supports a maximum of 255 characters. The `|` character is not supported. 
     * @return LogsetName Log set name.

-Supports a maximum of 255 characters. The `|` character is not supported.
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Log set name.

-Supports a maximum of 255 characters. The `|` character is not supported.
     * @param LogsetName Log set name.

-Supports a maximum of 255 characters. The `|` character is not supported.
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get Tag description list. Up to 10 tag key-value pairs are supported and must be unique. 
     * @return Tags Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
     * @param Tags Tag description list. Up to 10 tag key-value pairs are supported and must be unique.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Logset ID, format: custom part-User APPID. Automatically generate ID if left empty.

-The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and has a length of 3 to 40 characters.
-The end requires the use of - to concatenate the User APPID, which can be queried on the https://console.cloud.tencent.com/developer page.
-If you specify this field, ensure uniqueness across all regions. 
     * @return LogsetId Logset ID, format: custom part-User APPID. Automatically generate ID if left empty.

-The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and has a length of 3 to 40 characters.
-The end requires the use of - to concatenate the User APPID, which can be queried on the https://console.cloud.tencent.com/developer page.
-If you specify this field, ensure uniqueness across all regions.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID, format: custom part-User APPID. Automatically generate ID if left empty.

-The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and has a length of 3 to 40 characters.
-The end requires the use of - to concatenate the User APPID, which can be queried on the https://console.cloud.tencent.com/developer page.
-If you specify this field, ensure uniqueness across all regions.
     * @param LogsetId Logset ID, format: custom part-User APPID. Automatically generate ID if left empty.

-The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and has a length of 3 to 40 characters.
-The end requires the use of - to concatenate the User APPID, which can be queried on the https://console.cloud.tencent.com/developer page.
-If you specify this field, ensure uniqueness across all regions.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public CreateLogsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogsetRequest(CreateLogsetRequest source) {
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

