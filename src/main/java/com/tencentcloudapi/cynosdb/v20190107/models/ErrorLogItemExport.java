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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorLogItemExport extends AbstractModel{

    /**
    * Time Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Log level. Valid values: `error`, `warning`, `note`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Log content Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Time Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timestamp Time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timestamp Time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Log level. Valid values: `error`, `warning`, `note`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Log level. Valid values: `error`, `warning`, `note`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level. Valid values: `error`, `warning`, `note`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Log level. Valid values: `error`, `warning`, `note`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Log content Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Content Log content Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Log content Note: This field may return null, indicating that no valid values can be obtained.
     * @param Content Log content Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ErrorLogItemExport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorLogItemExport(ErrorLogItemExport source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

