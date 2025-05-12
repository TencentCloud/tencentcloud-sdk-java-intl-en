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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbErrorLogItem extends AbstractModel {

    /**
    * Log timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Log level.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Log content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Log timestamp. 
     * @return Timestamp Log timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Log timestamp.
     * @param Timestamp Log timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Log level. 
     * @return Level Log level.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level.
     * @param Level Log level.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Log content. 
     * @return Content Log content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Log content.
     * @param Content Log content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CynosdbErrorLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbErrorLogItem(CynosdbErrorLogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
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

