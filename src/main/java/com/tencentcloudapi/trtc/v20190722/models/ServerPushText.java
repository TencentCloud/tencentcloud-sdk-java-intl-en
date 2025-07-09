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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerPushText extends AbstractModel {

    /**
    * Server push broadcast text
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Allow this text to interrupt the robot
    */
    @SerializedName("Interrupt")
    @Expose
    private Boolean Interrupt;

    /**
    * After the text is finished, whether to automatically close the conversation task
    */
    @SerializedName("StopAfterPlay")
    @Expose
    private Boolean StopAfterPlay;

    /**
     * Get Server push broadcast text 
     * @return Text Server push broadcast text
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Server push broadcast text
     * @param Text Server push broadcast text
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Allow this text to interrupt the robot 
     * @return Interrupt Allow this text to interrupt the robot
     */
    public Boolean getInterrupt() {
        return this.Interrupt;
    }

    /**
     * Set Allow this text to interrupt the robot
     * @param Interrupt Allow this text to interrupt the robot
     */
    public void setInterrupt(Boolean Interrupt) {
        this.Interrupt = Interrupt;
    }

    /**
     * Get After the text is finished, whether to automatically close the conversation task 
     * @return StopAfterPlay After the text is finished, whether to automatically close the conversation task
     */
    public Boolean getStopAfterPlay() {
        return this.StopAfterPlay;
    }

    /**
     * Set After the text is finished, whether to automatically close the conversation task
     * @param StopAfterPlay After the text is finished, whether to automatically close the conversation task
     */
    public void setStopAfterPlay(Boolean StopAfterPlay) {
        this.StopAfterPlay = StopAfterPlay;
    }

    public ServerPushText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerPushText(ServerPushText source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Interrupt != null) {
            this.Interrupt = new Boolean(source.Interrupt);
        }
        if (source.StopAfterPlay != null) {
            this.StopAfterPlay = new Boolean(source.StopAfterPlay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Interrupt", this.Interrupt);
        this.setParamSimple(map, prefix + "StopAfterPlay", this.StopAfterPlay);

    }
}

