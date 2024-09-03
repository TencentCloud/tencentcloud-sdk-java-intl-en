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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationBaseInfo extends AbstractModel {

    /**
    * Application window usage mode (ApplicationDesktop: Captures the entire desktop; ApplicationWindow: Captures only the application window).
    */
    @SerializedName("WindowUseType")
    @Expose
    private String WindowUseType;

    /**
    * Application window name.
    */
    @SerializedName("WindowName")
    @Expose
    private String WindowName;

    /**
    * Application window class name.
    */
    @SerializedName("WindowClassName")
    @Expose
    private String WindowClassName;

    /**
    * Application window capture mode (HOOK: default mode; DDA_CUT: compatible mode).
    */
    @SerializedName("WindowCaptureMode")
    @Expose
    private String WindowCaptureMode;

    /**
     * Get Application window usage mode (ApplicationDesktop: Captures the entire desktop; ApplicationWindow: Captures only the application window). 
     * @return WindowUseType Application window usage mode (ApplicationDesktop: Captures the entire desktop; ApplicationWindow: Captures only the application window).
     */
    public String getWindowUseType() {
        return this.WindowUseType;
    }

    /**
     * Set Application window usage mode (ApplicationDesktop: Captures the entire desktop; ApplicationWindow: Captures only the application window).
     * @param WindowUseType Application window usage mode (ApplicationDesktop: Captures the entire desktop; ApplicationWindow: Captures only the application window).
     */
    public void setWindowUseType(String WindowUseType) {
        this.WindowUseType = WindowUseType;
    }

    /**
     * Get Application window name. 
     * @return WindowName Application window name.
     */
    public String getWindowName() {
        return this.WindowName;
    }

    /**
     * Set Application window name.
     * @param WindowName Application window name.
     */
    public void setWindowName(String WindowName) {
        this.WindowName = WindowName;
    }

    /**
     * Get Application window class name. 
     * @return WindowClassName Application window class name.
     */
    public String getWindowClassName() {
        return this.WindowClassName;
    }

    /**
     * Set Application window class name.
     * @param WindowClassName Application window class name.
     */
    public void setWindowClassName(String WindowClassName) {
        this.WindowClassName = WindowClassName;
    }

    /**
     * Get Application window capture mode (HOOK: default mode; DDA_CUT: compatible mode). 
     * @return WindowCaptureMode Application window capture mode (HOOK: default mode; DDA_CUT: compatible mode).
     */
    public String getWindowCaptureMode() {
        return this.WindowCaptureMode;
    }

    /**
     * Set Application window capture mode (HOOK: default mode; DDA_CUT: compatible mode).
     * @param WindowCaptureMode Application window capture mode (HOOK: default mode; DDA_CUT: compatible mode).
     */
    public void setWindowCaptureMode(String WindowCaptureMode) {
        this.WindowCaptureMode = WindowCaptureMode;
    }

    public ApplicationBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationBaseInfo(ApplicationBaseInfo source) {
        if (source.WindowUseType != null) {
            this.WindowUseType = new String(source.WindowUseType);
        }
        if (source.WindowName != null) {
            this.WindowName = new String(source.WindowName);
        }
        if (source.WindowClassName != null) {
            this.WindowClassName = new String(source.WindowClassName);
        }
        if (source.WindowCaptureMode != null) {
            this.WindowCaptureMode = new String(source.WindowCaptureMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WindowUseType", this.WindowUseType);
        this.setParamSimple(map, prefix + "WindowName", this.WindowName);
        this.setParamSimple(map, prefix + "WindowClassName", this.WindowClassName);
        this.setParamSimple(map, prefix + "WindowCaptureMode", this.WindowCaptureMode);

    }
}

