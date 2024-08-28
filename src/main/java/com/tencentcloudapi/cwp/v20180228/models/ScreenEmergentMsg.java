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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenEmergentMsg extends AbstractModel {

    /**
    * Notification tag/title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Notification content
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Redirection type: 0=vulnerability management
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Notification tag/title 
     * @return Title Notification tag/title
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Notification tag/title
     * @param Title Notification tag/title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Notification content 
     * @return Text Notification content
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Notification content
     * @param Text Notification content
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Redirection type: 0=vulnerability management 
     * @return Type Redirection type: 0=vulnerability management
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Redirection type: 0=vulnerability management
     * @param Type Redirection type: 0=vulnerability management
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ScreenEmergentMsg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenEmergentMsg(ScreenEmergentMsg source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

