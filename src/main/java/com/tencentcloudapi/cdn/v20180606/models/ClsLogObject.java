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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsLogObject extends AbstractModel{

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Log time
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Log content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Capture path
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * Log source device
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Log time 
     * @return Timestamp Log time
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Log time
     * @param Timestamp Log time
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Log content 
     * @return Content Log content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Log content
     * @param Content Log content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Capture path 
     * @return Filename Capture path
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set Capture path
     * @param Filename Capture path
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get Log source device 
     * @return Source Log source device
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Log source device
     * @param Source Log source device
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public ClsLogObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsLogObject(ClsLogObject source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Filename != null) {
            this.Filename = new String(source.Filename);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

