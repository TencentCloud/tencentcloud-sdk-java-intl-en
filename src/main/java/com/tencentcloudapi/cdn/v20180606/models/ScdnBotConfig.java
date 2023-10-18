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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnBotConfig extends AbstractModel {

    /**
    * Valid values: `on` and `off`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Bot cookie policy
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BotCookie")
    @Expose
    private BotCookie [] BotCookie;

    /**
    * Bot JS policy
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BotJavaScript")
    @Expose
    private BotJavaScript [] BotJavaScript;

    /**
     * Get Valid values: `on` and `off`. 
     * @return Switch Valid values: `on` and `off`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Valid values: `on` and `off`.
     * @param Switch Valid values: `on` and `off`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Bot cookie policy
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BotCookie Bot cookie policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public BotCookie [] getBotCookie() {
        return this.BotCookie;
    }

    /**
     * Set Bot cookie policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BotCookie Bot cookie policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBotCookie(BotCookie [] BotCookie) {
        this.BotCookie = BotCookie;
    }

    /**
     * Get Bot JS policy
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BotJavaScript Bot JS policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public BotJavaScript [] getBotJavaScript() {
        return this.BotJavaScript;
    }

    /**
     * Set Bot JS policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BotJavaScript Bot JS policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBotJavaScript(BotJavaScript [] BotJavaScript) {
        this.BotJavaScript = BotJavaScript;
    }

    public ScdnBotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnBotConfig(ScdnBotConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BotCookie != null) {
            this.BotCookie = new BotCookie[source.BotCookie.length];
            for (int i = 0; i < source.BotCookie.length; i++) {
                this.BotCookie[i] = new BotCookie(source.BotCookie[i]);
            }
        }
        if (source.BotJavaScript != null) {
            this.BotJavaScript = new BotJavaScript[source.BotJavaScript.length];
            for (int i = 0; i < source.BotJavaScript.length; i++) {
                this.BotJavaScript[i] = new BotJavaScript(source.BotJavaScript[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "BotCookie.", this.BotCookie);
        this.setParamArrayObj(map, prefix + "BotJavaScript.", this.BotJavaScript);

    }
}

