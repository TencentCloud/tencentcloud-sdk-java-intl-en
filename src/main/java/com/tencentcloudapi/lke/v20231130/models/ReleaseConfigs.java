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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseConfigs extends AbstractModel {

    /**
    * Configuration item description.
    */
    @SerializedName("ConfigItem")
    @Expose
    private String ConfigItem;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Status.
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * Content after modification.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Content before modification.
    */
    @SerializedName("LastValue")
    @Expose
    private String LastValue;

    /**
    * Modified content (display "content" with priority. If "content" is empty, take "value").
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Reason for failure.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Configuration item description. 
     * @return ConfigItem Configuration item description.
     */
    public String getConfigItem() {
        return this.ConfigItem;
    }

    /**
     * Set Configuration item description.
     * @param ConfigItem Configuration item description.
     */
    public void setConfigItem(String ConfigItem) {
        this.ConfigItem = ConfigItem;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Status. 
     * @return Action Status.
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set Status.
     * @param Action Status.
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get Content after modification. 
     * @return Value Content after modification.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Content after modification.
     * @param Value Content after modification.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Content before modification. 
     * @return LastValue Content before modification.
     */
    public String getLastValue() {
        return this.LastValue;
    }

    /**
     * Set Content before modification.
     * @param LastValue Content before modification.
     */
    public void setLastValue(String LastValue) {
        this.LastValue = LastValue;
    }

    /**
     * Get Modified content (display "content" with priority. If "content" is empty, take "value"). 
     * @return Content Modified content (display "content" with priority. If "content" is empty, take "value").
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Modified content (display "content" with priority. If "content" is empty, take "value").
     * @param Content Modified content (display "content" with priority. If "content" is empty, take "value").
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Reason for failure. 
     * @return Message Reason for failure.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Reason for failure.
     * @param Message Reason for failure.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ReleaseConfigs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseConfigs(ReleaseConfigs source) {
        if (source.ConfigItem != null) {
            this.ConfigItem = new String(source.ConfigItem);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.LastValue != null) {
            this.LastValue = new String(source.LastValue);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigItem", this.ConfigItem);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "LastValue", this.LastValue);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

